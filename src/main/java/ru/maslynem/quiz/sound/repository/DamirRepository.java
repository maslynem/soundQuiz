package ru.maslynem.quiz.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.Damir;
import ru.maslynem.quiz.sound.entity.Nature;

public interface DamirRepository extends JpaRepository<Damir, Long> {
}