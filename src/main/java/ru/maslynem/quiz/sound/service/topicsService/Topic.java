package ru.maslynem.quiz.sound.service.topicsService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.TopicEntity;

import java.util.List;
import java.util.Random;

@Slf4j
public abstract class Topic<T extends TopicEntity> {
    private final JpaRepository<T, Long> repository;
    private final Random random;

    protected Topic(JpaRepository<T, Long> repository) {
        this.repository = repository;
        random = new Random();
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public List<T> findByCount(int questionNumber) {
        long count = repository.count();
        List<Long> randomId = random.longs(1, count).distinct().limit(questionNumber).boxed().toList();
        return repository.findAllById(randomId);
    }
}
