package com.hyunjin.kotlinstudy;

public class Student {
    private final String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;

        boolean condition = true;


        // 자바
        int value = (condition) ? 10 : 20;

    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    int length(String str) {
        return str.length();
    }
}
