package com.chap06.sub02;

public class MustTypeCastMain {
    public static void main(String[] args) {
        Person p = new Person("사람");
        Student s = new Student("학생" ,101);

        p.introduce();
        s.introduce();
        s.showStudentId();

        //  Student castS = (Student) p;
       //   castS.showStudentId();

        p = s;
        p.introduce();
        ((Student)p).introduce();
      //  p.showStudentId();
    }
}