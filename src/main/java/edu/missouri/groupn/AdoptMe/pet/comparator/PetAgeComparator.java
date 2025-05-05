package edu.missouri.groupn.AdoptMe.pet.comparator;

import edu.missouri.groupn.AdoptMe.pet.Pet;
import java.util.Comparator;

/**
 * This implementation of Comparator sorts pets according to their age.
 */
public class PetAgeComparator implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
