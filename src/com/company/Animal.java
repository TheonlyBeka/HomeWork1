package com.company;

public class Animal {
    private int age;
    private String eyes;
    private String color;

    public int getAge() {
        return age;
    }

    public String getEyes() {
        return eyes;
    }

    public String getColor() {
        return color;
    }

    public Animal(int age, String eyes, String color) {
        this.age = age;
        this.eyes = eyes;
        this.color = color;
    }
    public String getInfo(){
        return "Age: " + age +
                "\nEyes colo:r " + eyes +
                "\nColor: " + color;


    }
}
