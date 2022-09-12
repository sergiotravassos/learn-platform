package com.sergiotravassos.learnplatform.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiotravassos.learnplatform.dto.NotificationDTO;
import com.sergiotravassos.learnplatform.entities.Notification;
import com.sergiotravassos.learnplatform.entities.User;
import com.sergiotravassos.learnplatform.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationForCurrentUser(Pageable pageable){
		User user = authService.authenticated();
		Page<Notification> page = notificationRepository.findByUser(user, pageable);
		return page.map(x -> new NotificationDTO(x));
	}
}
