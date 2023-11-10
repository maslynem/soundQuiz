package ru.maslynem.quiz.sound.service.topicsService;

import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.Profession;
import ru.maslynem.quiz.sound.repository.ProfessionRepository;

@Service("profession")
public class ProfessionService extends Topic<Profession> {
    protected ProfessionService(ProfessionRepository repository) {
        super(repository);
    }
}
