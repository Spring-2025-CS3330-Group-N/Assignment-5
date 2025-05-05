package edu.missouri.groupn.AdoptMe.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class PetDetailsView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the frame.
	 */
	public PetDetailsView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 12, 58, 17);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(71, 10, 114, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblKind = new JLabel("Kind");
		lblKind.setBounds(12, 41, 58, 17);
		contentPane.add(lblKind);
		
		JLabel lblSpecies = new JLabel("Species");
		lblSpecies.setBounds(12, 70, 58, 17);
		contentPane.add(lblSpecies);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(12, 99, 58, 17);
		contentPane.add(lblAge);
		
		JLabel lblNewLabel = new JLabel("Adopted?");
		lblNewLabel.setBounds(12, 129, 58, 17);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(71, 39, 114, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(71, 70, 114, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(71, 99, 114, 21);
		contentPane.add(textField_3);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(115, 125, 68, 25);
		contentPane.add(checkBox);
	}
	
	public void setName(String name) {
		this.textField.setText(name);
	}
}
