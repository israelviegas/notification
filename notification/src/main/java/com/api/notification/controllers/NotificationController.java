package com.api.notification.controllers;

import com.api.notification.dto.NotificationDto;
import com.api.notification.models.NotificationModel;
import com.api.notification.services.NotificationService;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/notification")
public class NotificationController {

    public static void main(String[] args) {

    }

    final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping()
    public ResponseEntity<Object> saveNotification(@RequestBody @Valid NotificationDto notificationDto) {

        var notificationModel = new NotificationModel();
        BeanUtils.copyProperties(notificationDto, notificationModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(notificationService.save(notificationModel));
    }

    @GetMapping
    public ResponseEntity<List<NotificationModel>> getAllNotifications() {
        return ResponseEntity.status(HttpStatus.OK).body(notificationService.findAll());
    }

}