package com.adil.koreanapp.controller;

import com.adil.koreanapp.model.Question;
import com.adil.koreanapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionRepository questionRepository;

    @GetMapping(value = "/question/{id}", produces = "application/json")
    public @ResponseBody
    Question getQuestion(@PathVariable int id) {
        return questionRepository.findById((long) id).get();
    }


    @PostMapping(value = "/question/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity postQuestion(@RequestBody Question question){
        Question q = questionRepository.save(question);
        return new ResponseEntity<Question>(q,HttpStatus.CREATED);

    }

}
