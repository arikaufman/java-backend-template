package com.domain.java_backend_template.users.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// This class is a DTO (Data Transfer Object) that represents a User.
// TODO: It should be converted to a Protocol Buffer message in a real-world application.

@Getter // Lombok annotation to create all the getters.
@Setter // Lombok annotation to create all the setters.
@AllArgsConstructor // Lombok annotation to create a constructor with all fields.
@NoArgsConstructor // Lombok annotation to create a constructor with no fields.
public class UserDTO {
    private String id;
    private String firstName;
    private String lastName;
}