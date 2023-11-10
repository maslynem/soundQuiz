package ru.maslynem.quiz.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.Nature;

public interface NatureRepository extends JpaRepository<Nature, Long> {
}