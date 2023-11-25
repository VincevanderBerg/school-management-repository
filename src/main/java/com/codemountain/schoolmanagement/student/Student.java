package com.codemountain.schoolmanagement.student;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String address;
    private String phoneNumber;
    private String guardianName;
    private String guardianPhoneNumber;
    private LocalDate enrollmentDate;
    private LocalDate graduationDate;
    private String gradeLevel;

    public Student(Long studentId, String firstName, String lastName, Integer age,
                   String email, String address, String phoneNumber,
                   String guardianName, String guardianPhoneNumber,
                   LocalDate enrollmentDate, LocalDate graduationDate, String gradeLevel) {

        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.guardianName = guardianName;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.gradeLevel = gradeLevel;

    }

    public Student(String firstName, String lastName, Integer age,
                   String email, String address, String phoneNumber,
                   String guardianName, String guardianPhoneNumber,
                   LocalDate enrollmentDate, LocalDate graduationDate, String gradeLevel) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.guardianName = guardianName;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.gradeLevel = gradeLevel;

    }

    public Long getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(String guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId)
                && Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(age, student.age)
                && Objects.equals(email, student.email)
                && Objects.equals(address, student.address)
                && Objects.equals(phoneNumber, student.phoneNumber)
                && Objects.equals(guardianName, student.guardianName)
                && Objects.equals(guardianPhoneNumber, student.guardianPhoneNumber)
                && Objects.equals(enrollmentDate, student.enrollmentDate)
                && Objects.equals(graduationDate, student.graduationDate)
                && Objects.equals(gradeLevel, student.gradeLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, age,
                email, address, phoneNumber,
                guardianName, guardianPhoneNumber,
                enrollmentDate, graduationDate, gradeLevel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId: " + studentId +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", age: " + age +
                ", email: '" + email + '\'' +
                ", address: '" + address + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", guardianName: '" + guardianName + '\'' +
                ", guardianPhoneNumber: '" + guardianPhoneNumber + '\'' +
                ", enrollmentDate: " + enrollmentDate +
                ", graduationDate: " + graduationDate +
                ", gradeLevel: '" + gradeLevel + '\'' +
                '}';
    }
}
