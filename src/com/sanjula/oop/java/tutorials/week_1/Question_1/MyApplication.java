package com.sanjula.oop.java.tutorials.week_1.Question_1;

public class MyApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person p = new Person("Ben");
        p.displayName();
        System.out.println("--------------------\n");

        Person q = new Person("Kate");
        q.setSurname("Huffington");
        q.setAge(21);

        Person r = new Person("Robert");
        r.setSurname("Johnson");
        r.setAge(45);

        Person s = new Person("Cody");
        s.setSurname("Pafford");
        s.setAge(24);

        q.displayName();
        System.out.println( q.getSurname() + " " + q.getAge());

        r.displayName();
        System.out.println( r.getSurname() + " " + r.getAge());

        s.displayName();
        System.out.println( s.getSurname() + " " + s.getAge());

    }
}
