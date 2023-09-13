package com.example.thirdmodulfinalproject.entity;

public class Question {
    String question;
    Question answerLeft;
    Question answerRigth;

    public Question(String question, Question answerLeft, Question answerRigth) {
        this.question = question;
        this.answerLeft = answerLeft;
        this.answerRigth = answerRigth;
    }

    public Question(String question) {
        this.question = question;
    }
}
