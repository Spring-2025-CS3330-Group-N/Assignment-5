package edu.missouri.groupn.AdoptMe.pet.comparator;

import java.util.Comparator;

import edu.missouri.groupn.AdoptMe.models.Pet;

/**
 * This implementation of Comparator sorts pets according to their age.
 */
public class PetAgeComparator implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
