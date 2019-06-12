package com.test.web.domain;

import lombok.Data;

/**
 * EmployDTO
 */
@Data
public class EmployDTO {
    private String  employeeId,
                    manager,
                    name,
                    birthDate,
                    photo,
                    notes;
}