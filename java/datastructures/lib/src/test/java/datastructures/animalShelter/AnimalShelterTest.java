package datastructures.animalShelter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTest {

    @Test
    void testEnqueueAndDequeue() {
        AnimalShelter shelter = new AnimalShelter();

        Animal dog1 = new Animal("dog", "Buddy");
        Animal cat1 = new Animal("cat", "Whiskers");
        Animal dog2 = new Animal("dog", "Max");

        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(dog2);

        Animal adoptedDog = shelter.dequeue("dog");
        assertEquals("dog", adoptedDog.species);
        assertEquals("Buddy", adoptedDog.name);

        Animal adoptedCat = shelter.dequeue("cat");
        assertEquals("cat", adoptedCat.species);
        assertEquals("Whiskers", adoptedCat.name);

        Animal adoptedDog2 = shelter.dequeue("dog");
        assertEquals("dog", adoptedDog2.species);
        assertEquals("Max", adoptedDog2.name);

        Animal noAvailableDog = shelter.dequeue("dog");
        assertNull(noAvailableDog);

        Animal noAvailableCat = shelter.dequeue("cat");
        assertNull(noAvailableCat);
    }

    @Test
    void testInvalidPreference() {
        AnimalShelter shelter = new AnimalShelter();

        Animal dog1 = new Animal("dog", "Buddy");
        shelter.enqueue(dog1);

        Animal invalidPreference = shelter.dequeue("invalid");
        assertNull(invalidPreference);
    }
}