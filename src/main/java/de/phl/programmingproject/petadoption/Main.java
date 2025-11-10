package de.phl.programmingproject.petadoption;

import java.util.Date;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'Pet Adoption Center' HERE.
 */
public class Main {
    public static void main(String[] args) {
        Pet buddy = new Pet("Buddy", 3, "Labrador Retriever");
        System.out.println("Pet information:");
        System.out.println(buddy.getInfo());

        Adopter janeSmith = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");
        System.out.println("\nAdopter information:");
        System.out.println(janeSmith.getInfo());

        System.out.println("\nInitial adoption status:");
        System.out.println("Is Buddy adopted? " + buddy.isAdopted());

        Date adoptionDate = new Date();
        Adoption adoption = buddy.adopt(janeSmith, adoptionDate);
        
        System.out.println("\nAfter adoption status:");
        System.out.println("Is Buddy adopted? " + buddy.isAdopted());

        System.out.println("\nAdoption information:");
        System.out.println(adoption.getInfo());

        System.out.println("\nFinal adoption status check:");
        System.out.println("Is Buddy adopted? " + buddy.isAdopted());
    }
}
