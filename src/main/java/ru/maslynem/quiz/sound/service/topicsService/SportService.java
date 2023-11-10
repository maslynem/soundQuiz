package ru.maslynem.quiz.sound.service.topicsService;

import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.Sport;
import ru.maslynem.quiz.sound.repository.SportRepository;

@Service("sport")
public class SportService extends Topic<Sport> {
    protected SportService(SportRepository repository) {
        super(repository);
    }
}
