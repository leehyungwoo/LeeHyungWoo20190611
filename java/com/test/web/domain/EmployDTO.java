package com.test.web.domain;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import lombok.Data;

/**
 * EmployDTO
 */
@Data @Component @Lazy
public class EmployDTO {
    private String  employeeId,
                    manager,
                    name,
                    birthDate,
                    photo,
                    notes;
}