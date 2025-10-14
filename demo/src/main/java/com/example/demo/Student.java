package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public Class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;
private String email;
private Interger age;

public Student() {}

public Student(Long id, String name, String email, Integer age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.age = age;
}



        }