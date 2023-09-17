package com.example.thirdmodulfinalproject.repositories;

import com.example.thirdmodulfinalproject.entity.Question;

public class QuestionsRepo {
    public static Question oneOneOneOne = new Question("Вопрос 1.1.1.1", null, null, null, null);
    public static Question oneOneOne = new Question("Вопрос 1.1.1", "Ответ 1.1.1.1", null, oneOneOneOne, null);
    public static Question oneOneTwo = new Question("Вопрос 1.1.2", null, null, null, null);
    public static Question oneOne = new Question("Вопрос 1.1", "Ответ 1.1.1", "Ответ 1.1.2", oneOneOne, oneOneTwo);


    public static Question oneTwoOne = new Question("Вопрос 1.2.1", null, null, null, null);
    public static Question oneTwo = new Question("Вопрос 1.2", "Ответ 1.2.1", null, oneTwoOne, null);

    public static Question mainQuestion = new Question("Главный вопрос", "Ответ 1.1", "Ответ 1.2", oneOne, oneTwo);







}
