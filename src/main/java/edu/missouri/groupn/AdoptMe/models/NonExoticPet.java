package edu.missouri.groupn.AdoptMe.models;

public class NonExoticPet extends Pet {

	public NonExoticPet(int id, String name, String type, String species, int age, boolean adopted) {
		super(id, name, type, species, age, adopted);
	}

	@Override
	public int compareTo(Pet o) {
		return super.compareTo(o);
	}

}
