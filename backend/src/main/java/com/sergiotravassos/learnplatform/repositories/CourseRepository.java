package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
