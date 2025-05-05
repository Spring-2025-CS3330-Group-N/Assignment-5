package edu.missouri.groupn.AdoptMe.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import edu.missouri.groupn.AdoptMe.models.Pet;
import edu.missouri.groupn.AdoptMe.models.Shelter;
import edu.missouri.groupn.AdoptMe.views.PetDetailsView;
import edu.missouri.groupn.AdoptMe.views.ShelterView;

public class ShelterController {
	private Shelter<Pet> model;
	private ShelterView view;

	public ShelterController(Shelter<Pet> model, ShelterView view) {
		this.model = model;
		this.view = view;
		
		List<String> nameList = this.model.getNameList();
		this.view.setPetListOptions(nameList);
		
		this.view.setRemovePetListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectionIndex = view.getSelectedPetIndex();
				if (selectionIndex > 0) {
					Pet pet = model.getPet(selectionIndex);
					model.removePet(pet);
					view.setPetListOptions(model.getNameList());
				}
			}
		});
		
		this.view.setViewDetailsListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectionIndex = view.getSelectedPetIndex();
				if (selectionIndex > 0) {
					Pet pet = model.getPet(selectionIndex);
					PetDetailsView detailsView = new PetDetailsView();
					detailsView.setName(pet.getName());
					detailsView.setVisible(true);
				}
			}
		});
	}
}
