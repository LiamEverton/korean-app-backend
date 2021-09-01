package com.adil.koreanapp;

import com.adil.koreanapp.controller.QuestionController;
import com.adil.koreanapp.model.Question;
import com.adil.koreanapp.repository.QuestionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
class KoreanappApplicationTests {

	private static final String QUESTIONS_RESPONSE = "{questions : ["+
			"{question: \"Type A\", answer: \"A\"}," +
			"{question: \"Type B\", answer: \"B\"}," +
			"{question: \"Type C\", answer: \"C\"}," +
			"{question: \"Type D\", answer: \"D\"}]}";

	MockMvc mockMvc;
//	QuestionController questionController = new QuestionController();

//
//	@BeforeEach
//	void setup(){
//		this.mockMvc = MockMvcBuilders.standaloneSetup(questionController).build();
//
//	}
//
//	@Test
//	void ShouldPostQuestion() throws Exception {
//		mockMvc.perform(post("/questions/question/").content(asJsonString(new Question("Type B", "B")))
//						.contentType(MediaType.APPLICATION_JSON_VALUE)
//						.accept(MediaType.APPLICATION_JSON_VALUE))
//				.andExpect(status().isCreated())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.question", is("type B")).exists());
//
//	}
////	@Test
////	void shouldGetQuestion() throws Exception {
////		questionController.postQuestion(new Question("Type A", "A"));
////		mockMvc.perform(get("/questions/question/0"))
////				.andExpect(status().isOk())
////				.andExpect(content().json("{question: \"Type A\", answer: \"A\"}"));
////
////	}
//
//
//
//	@Test
//	void contextLoads() {
//
//
//	}
//
//
//	public static String asJsonString(final Object obj) {
//		try {
//			return new ObjectMapper().writeValueAsString(obj);
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}

}
