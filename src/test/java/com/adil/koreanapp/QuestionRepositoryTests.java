package com.adil.koreanapp;

import com.adil.koreanapp.model.Question;
import com.adil.koreanapp.repository.QuestionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class QuestionRepositoryTests {

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    QuestionRepository questionRepository;

    @BeforeEach
    void setup(){
        mapper.registerModule(new Jdk8Module());
    }

    @Test
    public void addQuestionToDatabase(){
        Question q = new Question("Question A", "Answer A");

        assertNull(q.getId());
        questionRepository.save(q);
        assertNotNull(q.getId());

        questionRepository.deleteById(q.getId());
        boolean isFound = questionRepository.existsById(q.getId());
        assertFalse(isFound);


    }

    public void getQuestionFromDatabase() throws JsonProcessingException {
        Question q = new Question("Question A", "Answer A");
        questionRepository.save(q);
        assertNotNull(q.getId());

        String questionString = mapper.writeValueAsString(questionRepository.findById(q.getId()));
        assertEquals(questionString, "{\"question\":\"Question A\",\"answer\":\"Answer A\",\"id\":" + q.getId().toString() +"}");

        questionRepository.deleteById(q.getId());
        boolean isFound = questionRepository.existsById(q.getId());
        assertFalse(isFound);
    }
}
