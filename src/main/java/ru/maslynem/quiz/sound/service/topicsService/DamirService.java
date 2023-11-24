package ru.maslynem.quiz.sound.service.topicsService;

import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.Damir;
import ru.maslynem.quiz.sound.entity.Nature;
import ru.maslynem.quiz.sound.repository.DamirRepository;
import ru.maslynem.quiz.sound.repository.NatureRepository;

@Service("Дамир")
public class DamirService extends BaseTopicService<Damir> {
    protected DamirService(DamirRepository repository) {
        super(repository);
    }
}
