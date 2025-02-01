package com.domain.java_backend_template.users.domain.domainObjects;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter // Lombok annotation to create all the getters.
@Setter // Lombok annotation to create all the setters.
@AllArgsConstructor // Lombok annotation to create a constructor with all fields.
public class User {
    private String id;
    private String firstName;
    private String lastName;
}