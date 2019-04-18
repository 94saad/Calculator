package com.company;

public class Employee {
    private char name;
    private char phone;
    private char age;

//    public Employee(){
//        this.name= 'a';
//        this.age= 20;
//        this.phone= 0300;
//    }
//    public Employee(char name){
//        this.name= name;
////    }
//    private char name;
//    public char getName(){
//
//    }
//
//    public void setName(char name)
    public void setAge (double age){
        if (age>0)
            if (age<100) this.age = (char) age;
    }
}
