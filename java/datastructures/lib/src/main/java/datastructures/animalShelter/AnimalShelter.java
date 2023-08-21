package datastructures.animalShelter;

import java.util.LinkedList;
import java.util.Queue;


public class AnimalShelter {
    private final Queue<Animal> dogQueue;
    private final Queue<Animal> catQueue;

    public AnimalShelter() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
    }

    public void enqueue (Animal animal) {
        if (animal.species.equals("dog")) {
            dogQueue.add(animal);
        } else if (animal.species.equals("cat")) {
            catQueue.add(animal);
        } else {
            throw new IllegalArgumentException("Animal must be a dog or a cat.");
        }
    }

    public Animal dequeue(String pref) {
        if (!pref.equals("dog") && !pref.equals("cat")) {
            return null;
        }

        if (pref.equals("dog") && !dogQueue.isEmpty()) {
            return dogQueue.poll();
        } else if (pref.equals("cat") && !catQueue.isEmpty()) {
            return catQueue.poll();
        }

        if (!dogQueue.isEmpty()) {
            return dogQueue.poll();
        } else if (!catQueue.isEmpty()) {
            return catQueue.poll();
        }

        return null;
    }
}

