package ru.maslynem.quiz.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.Damir;
import ru.maslynem.quiz.sound.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}