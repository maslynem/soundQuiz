package ru.maslynem.quiz.sound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslynem.quiz.sound.entity.Transport;

public interface TransportRepository extends JpaRepository<Transport, Long> {
}