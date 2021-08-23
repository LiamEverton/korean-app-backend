package com.adil.koreanapp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

public class Question {

    @JsonProperty("question")
    private final String question;
    @JsonProperty("answer")
    private final String answer;

    @JsonCreator
    public Question(@JsonProperty("question") String question, @JsonProperty("answer") String answer){
        this.question = question;
        this.answer = answer;

    }
}
