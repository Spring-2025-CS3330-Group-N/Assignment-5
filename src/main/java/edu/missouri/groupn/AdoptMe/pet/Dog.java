package edu.missouri.groupn.AdoptMe.pet;

/**
 * Dog is a child class of the abstract class Pet.
 */
public class Dog extends Pet {

	/**
	 * This parameterized constructor creates an instance of the Dog pet type.
	 * It assumes the pet type is "Dog" by default.
	 * @param id Id of dog
	 * @param name Name of dog
	 * @param species Species of dog
	 * @param age Age of dog
	 * @param adopted Adoption status of dog
	 */
	public Dog(int id, String name, String species, int age, boolean adopted) {
		super(id, name, "Dog", species, age, adopted);
	}

}
