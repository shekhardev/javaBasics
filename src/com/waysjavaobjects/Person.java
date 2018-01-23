package com.waysjavaobjects;

public class Person implements Cloneable{
    int rollno;
    String name;

    Person(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
            Person s1=new Person(101,"amit");

            Person s2=(Person) s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}

