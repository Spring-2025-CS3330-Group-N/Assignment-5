package edu.missouri.groupn.AdoptMe.pet;

/**
 * Rabbit is a child class of the abstract class Pet.
 */
public class Rabbit extends Pet {

	/**
	 * This parameterized constructor creates an instance of the Rabbit pet type.
	 * It assumes the pet type is "Rabbit" by default.
	 * @param id Id of rabbit
	 * @param name Name of rabbit
	 * @param species Species of rabbit
	 * @param age Age of rabbit
	 * @param adopted Adoption status of rabbit
	 */
	public Rabbit(int id, String name, String species, int age, boolean adopted) {
		super(id, name, "Rabbit", species, age, adopted);
	}

}
