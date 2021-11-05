package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(15,"Gray", "Gray");
        Cats cats = new Cats(5, "Brown", "Black", BreedEnum.Puma, 150);
        Tiger tiger = new Tiger(2, "Blue", "Yellow and Black", BreedEnum.Tiger, 150,
                "Barsik", "USA Zoo");
        System.out.println(animal.getInfo());
        System.out.println("____________________________");
        System.out.println(cats.getInfo());
        cats.makeVoice("meow", 3);
        System.out.println("____________________________");
        System.out.println(tiger.getInfo());
        tiger.makeVoice("Pppppppp", 1);
    }
}
