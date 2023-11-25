package com.codemountain.schoolmanagement.teacher;

import java.time.LocalDate;
import java.util.Objects;

public class Teacher {
    private Long teacherId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String address;
    private String phoneNumber;
    private String department;
    private LocalDate hireDate;
    private String qualification;

    public Teacher(Long teacherId, String firstName, String lastName, Integer age,
                   String email, String address, String phoneNumber,
                   String department, LocalDate hireDate, String qualification) {

        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.hireDate = hireDate;
        this.qualification = qualification;

    }

    public Teacher(String firstName, String lastName, Integer age,
                   String email, String address, String phoneNumber,
                   String department, LocalDate hireDate, String qualification) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.hireDate = hireDate;
        this.qualification = qualification;

    }

    public Long getTeacherId() {
        return teacherId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherId, teacher.teacherId)
                && Objects.equals(firstName, teacher.firstName)
                && Objects.equals(lastName, teacher.lastName)
                && Objects.equals(age, teacher.age)
                && Objects.equals(email, teacher.email)
                && Objects.equals(address, teacher.address)
                && Objects.equals(phoneNumber, teacher.phoneNumber)
                && Objects.equals(department, teacher.department)
                && Objects.equals(hireDate, teacher.hireDate)
                && Objects.equals(qualification, teacher.qualification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, firstName, lastName, age,
                email, address, phoneNumber, department, hireDate, qualification);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId: " + teacherId +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", age: " + age +
                ", email: '" + email + '\'' +
                ", address: '" + address + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", department: '" + department + '\'' +
                ", hireDate: " + hireDate +
                ", qualification: '" + qualification + '\'' +
                '}';
    }
}
