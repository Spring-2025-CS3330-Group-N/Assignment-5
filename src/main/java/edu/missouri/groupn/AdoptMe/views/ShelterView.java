package edu.missouri.groupn.AdoptMe.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class ShelterView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private DefaultListModel<String> petNames;
	private JList list;
	private JButton addPetButton;
	private JButton removePetButton;
	private JButton viewDetailsButton;
	private DefaultComboBoxModel<String> sortOptions;
	private JComboBox sortOptionsSelection;

	/**
	 * Create the frame.
	 */
	public ShelterView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 26, 414, 180);
		contentPane.add(scrollPane);
		
		petNames = new DefaultListModel<String>();
		list = new JList(this.petNames);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		
		addPetButton = new JButton("Add Pet");
		addPetButton.setBounds(22, 218, 101, 27);
		contentPane.add(addPetButton);
		
		removePetButton = new JButton("Remove Pet");
		removePetButton.setBounds(150, 218, 117, 27);
		contentPane.add(removePetButton);
		
		viewDetailsButton = new JButton("View Details");
		viewDetailsButton.setBounds(295, 218, 118, 27);
		contentPane.add(viewDetailsButton);
		
		JLabel lblAdoptMe = new JLabel("Adopt Me <3");
		lblAdoptMe.setBounds(12, 0, 86, 27);
		contentPane.add(lblAdoptMe);
		
		sortOptions = new DefaultComboBoxModel<String>();
		sortOptionsSelection = new JComboBox(sortOptions);
		sortOptionsSelection.setBounds(309, 0, 117, 26);
		contentPane.add(sortOptionsSelection);
		
		JLabel lblSortBy = new JLabel("Sort By:");
		lblSortBy.setBounds(250, 0, 58, 27);
		contentPane.add(lblSortBy);
	}
	
	public void setAddPetListener(ActionListener listener) {
		this.addPetButton.addActionListener(listener);
	}
	
	public void setRemovePetListener(ActionListener listener) {
		this.removePetButton.addActionListener(listener);
	}
	
	public void setViewDetailsListener(ActionListener listener) {
		this.viewDetailsButton.addActionListener(listener);
	}
	
	public void setPetListOptions(List<String> labels) {
		this.petNames.clear();
		for (String label : labels) {
			this.petNames.addElement(label);
		}
		this.list.revalidate();
	}
	
	public void setSortListOptions(List<String> labels) {
		this.sortOptions.removeAllElements();
		for (String label : labels) {
			this.sortOptions.addElement(label);
		}
	}
	
	public int getSelectedPetIndex() {
		int index = this.list.getSelectedIndex();
		return index;
	}
	
	public int getSelectedSortOptionIndex() {
		int index = this.list.getSelectedIndex();
		return index;
	}
}
