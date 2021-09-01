package com.adil.koreanapp.controller;

import com.adil.koreanapp.model.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/questions")
public class QuestionController {
//    Questions questions = new Questions(new ArrayList<Question>());

//    @GetMapping(value = "/question/{id}", produces = "application/json")
//    public @ResponseBody
//    Question getQuestion(@PathVariable int id) {
//        return questions.getQuestion(id);
//    }

//    @GetMapping(value = "/questions", produces = "application/json")
//    public @ResponseBody
//    Questions getQuestions() {
//        return questions;
//    }

//    @PostMapping(value = "/question/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity postQuestion(@RequestBody Question question){
//        System.out.println("add question");
//        questions.addQuestion(question);
//        return new ResponseEntity<Question>(questions.getQuestion(0),HttpStatus.CREATED);
//
//    }
//    @PostMapping(value = "/questions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Questions> postQuestions(@RequestBody Questions questions){
//        System.out.println("add question");
//        this.questions = questions;
//        return new ResponseEntity<Questions>(this.questions,HttpStatus.CREATED);
//
//    }
}
