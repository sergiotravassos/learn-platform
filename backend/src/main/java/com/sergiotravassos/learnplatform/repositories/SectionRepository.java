package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
