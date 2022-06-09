package com.example.assignmentTwo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Customer", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Customer {
    @Id
    @Column(name = "customerId", nullable = false)
    private Long id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "bornAt", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private int bornAt;

    public Customer(Long id, String firstName, String lastName, int bornAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAt = bornAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getBornAt() {
        return bornAt;
    }

    public void setBornAt(int bornAt) {
        this.bornAt = bornAt;
    }
}
