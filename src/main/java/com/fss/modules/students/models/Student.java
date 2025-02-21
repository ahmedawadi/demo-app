package com.fss.modules.students.models;

import java.io.Serializable;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String matricule;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="average")
    private double average;

    @Column(name="birthDate")
    private LocalDate birthDate;

    public Student(){}
    public Student(String id, String firstName, String lastName, double average, LocalDate birthDate){
        this.matricule = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.average = average;
        this.birthDate = birthDate;
    }
    public Student(String firstName, String lastName, double average, LocalDate birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.average = average;
        this.birthDate = birthDate;
    }

    // Getter and Setter for matricule
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for average
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    // Getter and Setter for birthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
               "matricule='" + matricule + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", average=" + average +
               ", birthDate=" + birthDate +
               '}';
    }
}
