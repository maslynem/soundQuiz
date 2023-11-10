package ru.maslynem.quiz.sound.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.TopicEntity;
import ru.maslynem.quiz.sound.service.topicsService.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TopicService {

    @Autowired
    private Map<String, Topic<? extends TopicEntity>> topics;

    public List<String> findAllTopics() {
        return new ArrayList<>(topics.keySet());
    }

    public List<String> findEntitiesByTopic(String topic) {
        return topics.get(topic).findAll().stream().map(TopicEntity::getName).toList();
    }
}
