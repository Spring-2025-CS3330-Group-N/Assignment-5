package edu.missouri.groupn.AdoptMe.pet;

/**
 * Cat is a child class of the abstract class Pet.
 */
public class Cat extends Pet {

	/**
	 * This parameterized constructor creates an instance of the Cat pet type.
	 * It assumes the pet type is "Cat" by default.
	 * @param id Id of cat
	 * @param name Name of cat
	 * @param species Species of cat
	 * @param age Age of cat
	 * @param adopted Adoption status of cat
	 */
	public Cat(int id, String name, String species, int age, boolean adopted) {
		super(id, name, "Cat", species, age, adopted);
	}

}
