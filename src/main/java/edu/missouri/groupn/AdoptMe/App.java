package edu.missouri.groupn.AdoptMe;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.missouri.groupn.AdoptMe.pet.Pet;
import edu.missouri.groupn.AdoptMe.views.ShelterView;

public class App {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
		try {
			pets = Database.loadFromFile("src/main/resources/pets.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
		ShelterView frame = new ShelterView();
		frame.setPetListOptions(pets.stream().map(pet -> pet.getName()).collect(Collectors.toList()));

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
