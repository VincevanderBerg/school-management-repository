package com.codemountain.schoolmanagement.student;

import java.time.LocalDate;

public record Student(
        Long studentId,
        String firstName,
        String lastName,
        Integer age,
        String email,
        String address,
        String phoneNumber,
        String guardianName,
        String guardianPhoneNumber,
        LocalDate enrollmentDate,
        LocalDate graduationDate,
        String gradeLevel
) {
}
