package com.example.thirdmodulfinalproject.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Question {
    private int id;
    String question;
    String answerLeft;
    String answerRight;
    Question nextAnswerLeft;
    Question nextAnswerRight;

    public Question(String question, String answerLeft, String answerRight, Question nextAnswerLeft, Question nextAnswerRight) {
        this.question = question;
        this.answerLeft = answerLeft;
        this.answerRight = answerRight;
        this.nextAnswerLeft = nextAnswerLeft;
        this.nextAnswerRight = nextAnswerRight;
    }

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerLeft() {
        return answerLeft;
    }

    public String getAnswerRight() {
        return answerRight;
    }

    public Question getNextAnswerLeft() {
        return nextAnswerLeft;
    }

    public Question getNextAnswerRight() {
        return nextAnswerRight;
    }

    @Override
    public String toString() {
        return question;
    }
}
