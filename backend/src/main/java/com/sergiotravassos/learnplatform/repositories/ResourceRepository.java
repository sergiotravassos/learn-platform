package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
