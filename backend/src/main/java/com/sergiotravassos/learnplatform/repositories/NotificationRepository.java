package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.Notification;
import com.sergiotravassos.learnplatform.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	Page<Notification> findByUser(User user, Pageable pageable);
	
}
