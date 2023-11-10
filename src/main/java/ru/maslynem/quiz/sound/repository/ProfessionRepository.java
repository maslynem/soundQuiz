package ru.maslynem.quiz.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.Profession;

public interface ProfessionRepository extends JpaRepository<Profession, Long> {
}