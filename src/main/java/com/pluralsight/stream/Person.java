package com.pluralsight.stream;

import java.util.ArrayList;

public class Person {
    String firstName, lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person searchByFirstOrLastName(String name, ArrayList<Person> people){
        for (Person p: people) {
            if(p.lastName.contains(name) || p.firstName.contains(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
