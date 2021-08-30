package com.adil.koreanapp.repository;


import com.adil.koreanapp.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

 @Override
 Iterable<Question> findAllById(Iterable<Long> iterable);

 @Override
 Optional<Question> findById(Long aLong);

 @Override
 <S extends Question> S save(S s);

 @Override
 <S extends Question> Iterable<S> saveAll(Iterable<S> iterable);

 @Override
 void deleteById(Long aLong);
}
