package edu.missouri.groupn.AdoptMe;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.missouri.groupn.AdoptMe.controllers.ShelterController;
import edu.missouri.groupn.AdoptMe.models.Pet;
import edu.missouri.groupn.AdoptMe.models.Shelter;
import edu.missouri.groupn.AdoptMe.views.ShelterView;

public class App {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
		try {
			pets = Database.loadFromFile("src/main/resources/pets.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
		ShelterView view = new ShelterView();
		Shelter<Pet> model = new Shelter<Pet>(pets);
		ShelterController controller = new ShelterController(model, view);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
