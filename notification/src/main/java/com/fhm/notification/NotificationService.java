package com.fhm.notification;

import com.fhm.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .toCustomerEmail(notificationRequest.toCustomerEmail())
                .toCustomerId(notificationRequest.toCustomerId())
                .message(notificationRequest.message())
                .sender("system")
                .sentAt(LocalDateTime.now())
                .build();
        notificationRepository.save(notification);
    }
}
