package ru.maslynem.quiz.sound.service.topicsService;

import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.Nature;
import ru.maslynem.quiz.sound.repository.NatureRepository;

@Service("Природа")
public class NatureService extends BaseTopicService<Nature> {
    protected NatureService(NatureRepository repository) {
        super(repository);
    }
}
