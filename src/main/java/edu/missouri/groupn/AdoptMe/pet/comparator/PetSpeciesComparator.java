package edu.missouri.groupn.AdoptMe.pet.comparator;

import edu.missouri.groupn.AdoptMe.pet.Pet;
import java.util.Comparator;

/**
 * This implementation of Comparator sorts pets according to their species.
 */
public class PetSpeciesComparator implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getSpecies().compareTo(o2.getSpecies());
	}
}
