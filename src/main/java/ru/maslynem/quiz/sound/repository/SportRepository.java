package ru.maslynem.quiz.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.Sport;

public interface SportRepository extends JpaRepository<Sport, Long> {
}