package com.qa.collections;

import com.qa.collections.models.Animal;
import com.qa.collections.models.Cat;
import com.qa.collections.models.Dog;
import com.qa.collections.models.Rabbit;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Animal r1 = new Rabbit("Bob", 15);
        Animal r2 = new Rabbit("Lesley", 12);
        Animal c1 = new Cat("Gerty", 9);
        Animal c2 = new Cat("Ayisha", 7);
        Animal d1 = new Dog("Perry", 8);
        Animal d2 = new Dog("Elden Ring Dog... AKA Not a dog but is a dog", 4);

        List<Animal> animalsList = new ArrayList<>();
        animalsList.addAll(List.of(r1, r2, c1, c2, d1, d2));

        // For loop, print all animals
        System.out.println("== FOR LOOP ==");
        for (int index = 0; index < animalsList.size(); index++) {
            System.out.println(animalsList.get(index));
        }
        // enhanced for loop, print all animals
        System.out.println("== ENHANCED FOR LOOP ==");
        for (Animal animal : animalsList) {
            System.out.println(animal);
        }

        // iterator, print all animals
        System.out.println("== ITERATOR ==");
        Iterator<Animal> animalIterator = animalsList.iterator();
        while (animalIterator.hasNext()) {
            System.out.println(animalIterator.next());
        }

        System.out.println("== HASHMAPS ==");
        Map<String, Animal> animalMap = new HashMap<>();
        animalMap.putAll(Map.of(
                r1.getName(), r1,
                r2.getName(), r2,
                d1.getName(), d1,
                d2.getName(), d2,
                c1.getName(), c1,
                c2.getName(), c2
        ));

        Collection<Animal> animalCollection = animalMap.values();
        Iterator<Animal> animalCollectionIterator = animalCollection.iterator();

        while (animalCollectionIterator.hasNext()) {
            System.out.println(animalCollectionIterator.next());
        }
        // could also use a enhanced for or normal for loop
        for (Animal animal : animalCollection) System.out.println(animal);

        System.out.println("== SETS ==");
        Set<Animal> animalSet = new HashSet<>();
        animalSet.addAll(Set.of(r1, r2, d1, d2, c1, c2));
        animalSet.add(r1);

        for (Animal animal : animalSet) {
            System.out.println(animal);
        }
    }
}
