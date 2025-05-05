package edu.missouri.groupn.AdoptMe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.missouri.groupn.AdoptMe.models.NonExoticPet;
import edu.missouri.groupn.AdoptMe.models.Pet;

public class Database {
	public static List<Pet> loadFromFile(String fileName) throws IOException {
		TypeToken<List<NonExoticPet>> petListType = new TypeToken<List<NonExoticPet>>() {};
        Gson gson = new Gson();

        String json = Files.readString(Paths.get(fileName));

        List<NonExoticPet> domesticPets = gson.fromJson(json, petListType);

        List<Pet> allPets = new ArrayList<Pet>();
        for (Pet pet : domesticPets) {
        	allPets.add(pet);
        }

        return allPets;
	}
}
