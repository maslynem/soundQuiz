package ru.maslynem.quiz.sound.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.maslynem.quiz.sound.controller.request.QuizRequest;
import ru.maslynem.quiz.sound.controller.response.TopicResponse;
import ru.maslynem.quiz.sound.service.QuizGeneratorService;
import ru.maslynem.quiz.sound.service.TopicService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@Slf4j
public class SoundQuizController {
    private final TopicService topicService;
    private final QuizGeneratorService quizGeneratorService;

    @GetMapping
    public TopicResponse getAllTopics() {
        List<String> topics = topicService.findAllTopics();
        log.info("Get all topics request. Topics: {}", topics);
        return new TopicResponse(topics.size(), topics);
    }

    @PostMapping
    public Map<String, List<String>> getQuizByTopics(@RequestBody QuizRequest request) {
        log.info("Get quiz by topics. Topics: {}", request.getTopics());
        return quizGeneratorService.generateQuiz(request);
    }

    @GetMapping("{topic}")
    public List<String> getTopicEntities(@PathVariable String topic) {
        return topicService.findEntitiesByTopic(topic);
    }
}
