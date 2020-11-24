package ru.digilleague.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());


        iterateAnimal(animals);
        iterateAnimal(cats);
//        iterateAnimal(dogs);
    }


//     static void iterateAnimal(Collection<? extends Animal> animals){
//        for (Animal animal: animals){
//            System.out.println("Animal is fed");
//        }
//    }

    static void iterateAnimal(Collection<? super Cat> animals){
        for (int i = 0; i< animals.size(); i++){
            System.out.println("Animal is fed");
        }
    }
}
