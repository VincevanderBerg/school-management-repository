package com.codemountain.schoolmanagement.student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStudents();
    Student selectStudentById(Integer studentId);
}
