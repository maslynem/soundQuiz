package ru.maslynem.quiz.sound.service.topicsService;

import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.Transport;
import ru.maslynem.quiz.sound.repository.TransportRepository;

@Service("Транспорт")
public class TransportService extends BaseTopicService<Transport> {
    protected TransportService(TransportRepository repository) {
        super(repository);
    }
}
