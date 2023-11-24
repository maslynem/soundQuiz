package ru.maslynem.quiz.sound.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.controller.request.QuizRequest;
import ru.maslynem.quiz.sound.entity.TopicEntity;
import ru.maslynem.quiz.sound.service.topicsService.BaseTopicService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class QuizGeneratorService {
    @Autowired
    private Map<String, BaseTopicService<? extends TopicEntity>> topics;

    public Map<String, List<String>> generateQuiz(QuizRequest request) {
        int questionsNumber = request.getQuestionsNumber();
        List<String> topicsName = request.getTopics();
        Map<String, List<String>> map = new HashMap<>();
        for (String topic : topicsName) {
            List<String> entitiesName = topics.get(topic).findByCount(questionsNumber).stream().map(TopicEntity::getWord).toList();
            map.put(topic, entitiesName);
        }
        return map;
    }
}
