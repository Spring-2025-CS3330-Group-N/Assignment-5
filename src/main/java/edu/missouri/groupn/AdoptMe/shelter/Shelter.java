package edu.missouri.groupn.AdoptMe.shelter;

import java.util.ArrayList;

import edu.missouri.groupn.AdoptMe.pet.Pet;

public class Shelter <T extends Pet> {
	private ArrayList<T> petList;
	
	/**
	 * This constructor creates an instance of a Shelter.
	 */
	public Shelter() {
		this.petList = new ArrayList<>();
		// call a function to import pets from JSON file / database and add them to list?
	}

	// method to import pets from JSON file / database
	
	/**
	 * addPet():
	 * This method adds the provided pet to the shelter (as long as it's not already been added).
	 * @param pet Pet to be added
	 * @return False if the pet is already in the shelter, otherwise returns true
	 */
	public boolean addPet(T pet) {
		if (petList.contains(pet)) {
			System.out.println("This pet is already added to the shelter.\n");
			return false;
		}
		petList.add(pet);
		return true;
	}
	
	/**
	 * removePet():
	 * This method removes the provided pet from the shelter.
	 * @param pet Pet to be removed
	 * @return False if the pet is not in the shelter, otherwise returns true
	 */
	public boolean removePet(T pet) {
		if (petList.contains(pet)) {
			System.out.println("Removing from shelter: " + pet.toString());
			petList.remove(pet);
			System.out.println("Sucessfully removed.");
			return true;
		}
		System.out.println("Cannot remove pets that are not in the shelter.\n");
		return false;
	}
	
	/**
	 * viewPetDetails():
	 * This method prints a pet's details if it's in the shelter.
	 * @param pet Pet whose details will be viewed
	 * @return True and print details if pet is in the shelter - otherwise, return false
	 */
	public boolean viewPetDetails(T pet) {
		if (this.petList.contains(pet)) {
			System.out.println(pet.toString());
			return true;
		}
		System.out.println("Cannot view details: this pet is not in the shelter");
		return false;
	}
	
	/**
	 * adoptPet():
	 * This method checks if a pet is available for adoption. If so, it sets a pet's adoption status to be true.
	 * @param pet Pet to be adopted
	 */
	public boolean adoptPet(T pet) {
		if (pet.isAdopted() == true) {
			System.out.println("Pet is already adopted!\n");
			return false;
		}
		pet.setAdopted(true);
		return true;
	}
	
	// sortByName() -- use comparable
	// sortByAge() -- use comperator
	// sortBySpecies() -- use comperator
	
}
