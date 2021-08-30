package com.adil.koreanapp.service;

import com.adil.koreanapp.model.Question;
import com.adil.koreanapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService {


    private QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    Optional<Question> getQuestion(Long id){

        Optional<Question> questionOptional = this.questionRepository.findById(id);
        if(questionOptional.isPresent()){
            return questionOptional;
        }

        return Optional.empty();
    }

    <S extends Question> S saveQuestion(S q){
        return questionRepository.save(q);
    }

    <S extends Question> Iterable<S> saveQuestions(Iterable<S> s){
        return questionRepository.saveAll(s);
    }
}
