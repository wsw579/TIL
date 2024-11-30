package com.chap06.sub02;

public class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("나는 " + name);
    }

}

