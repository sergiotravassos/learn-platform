package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
