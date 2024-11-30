package com.chap06.sub02;

public class Student extends Person {
    int studentID;

    Student(String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }

    void showStudentId(){
        System.out.println("학번" + studentID);
    }

    @Override
    void introduce() {
        System.out.println("나는 " + name + " 학번은 " + studentID);
    }
}
