package com.adil.koreanapp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="questions" )
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonProperty("question")
    private String question;
    @JsonProperty("answer")
    private  String answer;

    @JsonCreator
    public Question(@JsonProperty("question") String question, @JsonProperty("answer") String answer) {
        this.question = question;
        this.answer = answer;

    }

    public Question(){}




    public void setQuestion(String question){
        this.question = question;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
