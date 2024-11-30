package com.chap06.sub02;

public class TypeCheckMain {
    public static void main(String[] args) {

    Person person = new Person("김철수");
    Student student = new Student("이영희" ,101);

    if(person instanceof Person) {
        System.out.println("p는 Person 클래스 인스턴스");
    }

    if(student instanceof Person) {
        System.out.println("s는 Person 클래스 인스턴스");
    }

    if(person instanceof Student){
        Student cs = (Student) person; // 다운캐스팅 안됨 !
        cs.introduce();
    }
    else{
        System.out.println("변환불가");
    }

    Person p = student ; // 업 캐스팅
    p.introduce();

    if(person instanceof Student) {
        student = (Student) person;  // 업캐스팅하고 다운캐스팅가능
        student.introduce();
     }
    }
}
