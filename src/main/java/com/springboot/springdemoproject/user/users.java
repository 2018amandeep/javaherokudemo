package com.springboot.springdemoproject.user;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class users {
    @Id
    public String id;
    public String name;
    public int age;
    public int salary;
}
