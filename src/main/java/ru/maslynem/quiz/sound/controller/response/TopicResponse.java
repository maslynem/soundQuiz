package ru.maslynem.quiz.sound.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicResponse {
    private int count;
    private List<String> topics;
}
