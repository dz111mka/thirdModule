package com.example.thirdmodulfinalproject.util;

import com.example.thirdmodulfinalproject.entity.Question;
import com.example.thirdmodulfinalproject.repositories.QuestionsRepo;

public class CurrentQuestion {
    public static Question value = QuestionsRepo.mainQuestion;
}
