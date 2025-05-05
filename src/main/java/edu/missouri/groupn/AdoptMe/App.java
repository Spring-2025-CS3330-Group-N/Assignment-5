package edu.missouri.groupn.AdoptMe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.missouri.groupn.AdoptMe.pet.Pet;

public class App {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
		try {
			pets = Database.loadFromFile("src/main/resources/pets.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(pets);
    }
}
