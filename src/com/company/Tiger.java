package com.company;

public final class Tiger extends Cats{
    private String name;
    private String zoo;

    public String getName() {
        return name;
    }

    public String getZoo() {
        return zoo;
    }

    public Tiger(int age, String eyes, String color, BreedEnum breed, int weight, String name, String zoo) {
        super(age, eyes, color, breed, weight);
        this.name = name;
        this.zoo = zoo;
    }

    public Tiger(int age, String eyes, String color, String name, String zoo) {
        super(age, eyes, color);
        this.name = name;
        this.zoo = zoo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nTiger name: " + name +
                "\nZoo: " + zoo;
    }
}
