package edu.missouri.groupn.AdoptMe.pet.comparator;

import java.util.Comparator;

import edu.missouri.groupn.AdoptMe.models.Pet;

/**
 * This implementation of Comparator sorts pets according to their species.
 */
public class PetSpeciesComparator implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getSpecies().compareTo(o2.getSpecies());
	}
}
