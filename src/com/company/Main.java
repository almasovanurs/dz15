package com.company;

public class Main {
    public static void main(String[] args){

        Programmer programmer = new Programmer("Nurs", "programmer", "sn");
        System.out.println(programmer);
        programmer.coding();
        programmer.walk();
        programmer.learn();
        programmer.eat();

        Person person = new Person("Aru", "programmer");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();

        Dancer dancer = new Dancer("Ai", "programmer");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();

        Singer singer = new Singer("Benazir", "programmer");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();f

    }
}