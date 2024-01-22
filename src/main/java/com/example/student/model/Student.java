package com.example.student.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private String email;
    private Integer schoolId;
}
