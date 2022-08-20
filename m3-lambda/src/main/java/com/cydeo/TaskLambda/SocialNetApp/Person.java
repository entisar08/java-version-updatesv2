package com.cydeo.TaskLambda.SocialNetApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private int age;
    private Gender gender;
    private String emailAddress;


}
