package com.adil.koreanapp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

public class Questions {


    @JsonProperty
    @Column(name="question")
    private final List<Question> questions;

    @JsonCreator
    public Questions(@JsonProperty("questions") List<Question> questions){
        this.questions = questions;

    }


    public Question getQuestion(int id){
        return questions.get(id);
    }

    public void addQuestion(Question question){
        questions.add(question);
    }


}