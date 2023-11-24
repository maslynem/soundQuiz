package ru.maslynem.quiz.sound.service.topicsService;

import org.springframework.stereotype.Service;
import ru.maslynem.quiz.sound.entity.Damir;
import ru.maslynem.quiz.sound.entity.Item;
import ru.maslynem.quiz.sound.repository.DamirRepository;
import ru.maslynem.quiz.sound.repository.ItemRepository;

@Service("Домашние вещи")
public class ItemService extends BaseTopicService<Item> {
    protected ItemService(ItemRepository repository) {
        super(repository);
    }
}
