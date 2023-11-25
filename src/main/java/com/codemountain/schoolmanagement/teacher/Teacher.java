package com.codemountain.schoolmanagement.teacher;

import java.time.LocalDate;

public record Teacher(
        Long teacherId,
        String firstName,
        String lastName,
        Integer age,
        String email,
        String address,
        String phoneNumber,
        String department,
        LocalDate hireDate,
        String qualification
) {
}
