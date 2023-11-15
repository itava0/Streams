package com.pluralsight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Michael", "Smith", 28));
        personList.add(new Person("Emily", "Johnson", 24));
        personList.add(new Person("Daniel", "Brown", 35));
        personList.add(new Person("Sophia", "Miller", 29));
        personList.add(new Person("William", "Davis", 32));
        personList.add(new Person("Olivia", "Jones", 27));
        personList.add(new Person("Ethan", "Taylor", 31));
        personList.add(new Person("Ava", "Wilson", 26));
        personList.add(new Person("Noah", "Anderson", 30));
        personList.add(new Person("Isabella", "Martinez", 33));

        //Search by firstName or LastName
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first or last name of the person: ");
        String name = scanner.nextLine();

        for (Person p: personList) {
            if (p.lastName.contains(name) || p.firstName.contains(name)) {
                System.out.println(p);
            }
        }
        //Find the average age
        double totalAge = 0;

        for (Person person : personList) {
            totalAge += person.age;
        }

        double averageAge = totalAge / personList.size();

        System.out.println("Average Age: " + averageAge);


        //Find the oldest person
        Person oldestPerson = personList.get(0);

        for (Person person : personList) {
            if (person.age > oldestPerson.age) {
                oldestPerson = person;
            }
        }

        // Display the oldest person
        System.out.println("Oldest Person: " + oldestPerson.firstName + " " + oldestPerson.lastName + ", Age: " + oldestPerson.age);

        // Find the youngest person
        Person youngestPerson = personList.get(0);

        for (Person person : personList) {
            if (person.age < youngestPerson.age) {
                youngestPerson = person;
            }
        }

        // Display the youngest person
        System.out.println("Youngest Person: " + youngestPerson.firstName + " " + youngestPerson.lastName + ", Age: " + youngestPerson.age);
    }
}
