package com.fhm.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
