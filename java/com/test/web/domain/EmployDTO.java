package com.test.web.domain;

import lombok.Data;

/**
 * EmployDTO
 */
@Data
public class EmployDTO {
    private String  employee_id,
                    manager,
                    name,
                    birth_date,
                    photo,
                    notes;
}