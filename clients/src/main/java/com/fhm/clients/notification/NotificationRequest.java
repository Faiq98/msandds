package com.fhm.clients.notification;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String message
) {
}
