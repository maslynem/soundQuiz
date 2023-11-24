package ru.maslynem.quiz.sound.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "transport_ru")
public class Transport extends TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "word", nullable = false, length = Integer.MAX_VALUE)
    private String word;

}