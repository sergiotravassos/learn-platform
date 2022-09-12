package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
