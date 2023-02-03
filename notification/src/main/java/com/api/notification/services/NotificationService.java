package com.api.notification.services;

import com.api.notification.models.NotificationModel;
import com.api.notification.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NotificationService {

    final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Transactional
    public NotificationModel save(NotificationModel notificationModel) {

        return notificationRepository.save(notificationModel);

    }

    public List<NotificationModel> findAll() {

        return notificationRepository.findAll();

    }
}
