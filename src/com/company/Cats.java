package com.company;

public class Cats extends Animal{
    private BreedEnum breed;
    private int weight;

    public BreedEnum getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public Cats(int age, String eyes, String color, BreedEnum breed, int weight) {
        super(age, eyes, color);
        this.breed = breed;
        this.weight = getWeight();
    }

    public Cats(int age, String eyes, String color) {
        super(age, eyes, color);
    }
    final void makeVoice(String voice, int number){
        for(int i = 0; i < number; ++i) {
            System.out.println(voice);
        }
    }
    void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nBreed: " + breed +
              "\nWeight: " + weight;
    }
}
