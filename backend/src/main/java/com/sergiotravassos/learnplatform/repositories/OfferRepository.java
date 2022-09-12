package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
