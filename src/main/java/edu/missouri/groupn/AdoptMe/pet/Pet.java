package edu.missouri.groupn.AdoptMe.pet;

/**
 * This abstract class will be used for all pets in the adoption shelter.
 * Each pet requires values for id, name, type, species, age, and adoption status.
 */
public abstract class Pet {

	private int id;
	private String name;
	private String type;
	private String species;
	private int age;
	private boolean adopted;

	/**
	 * Parameterized constructor for Pet():
	 * Requires values for id, name, type, species, age, and adoption status of the pet.
	 * @param id Pet id
	 * @param name Name of pet
	 * @param type Type of pet
	 * @param species Species of pet
	 * @param age Age of pet
	 * @param adopted Adoption status of pet
	 * 
	 */
	public Pet(int id, String name, String type, String species, int age, boolean adopted) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.species = species;
		this.age = age;
		this.adopted = adopted;
	}
	/**
	 * This getter method retrieves the id of the pet it's called upon.
	 * @return Pet id
	 */
	public int getId() {
		return id;
	}
	/**
	 * This setter method updates a pet's id using the value of the method argument passed in.
	 * @param id New id value
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * This getter method retrieves the name of the pet it's called upon.
	 * @return Pet name
	 */
	public String getName() {
		return name;
	}
	/**
	 * This setter method updates a pet's name using the value of the method argument.
	 * @param name New pet name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This getter method retrieves the type of the pet it's called upon.
	 * @return Pet type
	 */
	public String getType() {
		return type;
	}
	/**
	 * This setter method updates a pet's type using the value of the method argument.
	 * @param type New pet type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * This getter method retrieves the species of the pet it's called upon.
	 * @return Pet species
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * This setter method updates a pet's species using the value of the method argument.
	 * @param species New pet species
	 */
	public void setSpecies(String species) {
		this.species = species;
	}
	/**
	 * This getter method retrieves the age of the pet it's called upon.
	 * @return Pet age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * This setter method updates a pet's age using the value of the method argument.
	 * @param age New pet age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * This getter method retrieves the adoption status of the pet it's called upon.
	 * @return Pet adoption status (either true or false)
	 */
	public boolean isAdopted() {
		return adopted;
	}
	/**
	 * This setter method updates a pet's adoption status using the value of the method argument.
	 * @param adopted New pet adoption status
	 */
	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}
	
}