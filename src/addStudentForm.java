import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;





public class addStudentForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel firstnameLabel, lastnameLabel, middlenameLabel, ageLabel, bdateLabel, placebirthLabel, civilStatusLabel, nationalityLabel, religionLabel, homeLabel, zipcodeLabel, countryLabel, regionLabel, cityLabel, barangayLabel;
    private JTextField firstnameField, lastnameField, middlenameField, ageField, placebirthField, civilStatusField, nationalityField, religionField, homeField, zipcodeField, countryField, regionField, cityField, barangayField;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;
    
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addStudentForm frame = new addStudentForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addStudentForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

        setSize(1200, 700);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("./src/Images/logoCropped.JPG"));
		lblNewLabel_1.setBounds(0, 0, 67, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("University of Science and Technology of Southern Philippines");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(77, 7, 542, 38);
		contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("./src/Images/bluecrop.JPG"));
		lblNewLabel.setBounds(0, 0, 2000, 57);
		contentPane.add(lblNewLabel);
		
		lastnameLabel = new JLabel("Lastname");
		lastnameLabel.setBounds(30, 100, 80, 25);
		contentPane.add(lastnameLabel);

		lastnameField = new JTextField();
		lastnameField.setBounds(30, 125, 250, 40);
		lastnameField.setOpaque(true); 
		lastnameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		lastnameField.setFocusable(true);
		contentPane.add(lastnameField);
		
		firstnameLabel = new JLabel("Firstname");
		firstnameLabel.setBounds(300, 100, 80, 25);
		contentPane.add(firstnameLabel);

		firstnameField = new JTextField();
		firstnameField.setBounds(300, 125, 250, 40);
		firstnameField.setOpaque(true);
		firstnameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		firstnameField.setFocusable(true);
		contentPane.add(firstnameField);
		
		
		middlenameLabel = new JLabel("Middle Name");
		middlenameLabel.setBounds(570, 100, 80, 25);
		contentPane.add(middlenameLabel);

		middlenameField = new JTextField();
		middlenameField.setBounds(570, 125, 250, 40);
		middlenameField.setOpaque(true); 
		middlenameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		middlenameField.setFocusable(true);
		contentPane.add(middlenameField);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("./src/Images/orangeCropped.JPG"));
		lblNewLabel_5.setBounds(900, 0, 250, 340);
		contentPane.add(lblNewLabel_5);
		
		
		ageLabel = new JLabel("Age");
		ageLabel.setBounds(30, 180, 80, 25);
		contentPane.add(ageLabel);

		ageField = new JTextField();
		ageField.setBounds(30, 210, 80, 40);
		ageField.setOpaque(true); 
		ageField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); 
		ageField.setFocusable(true);
		contentPane.add(ageField);
		
		bdateLabel = new JLabel("Birth Date");
		bdateLabel.setBounds(130, 170, 200, 50);
		contentPane.add(bdateLabel);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(130, 210, 200, 40);
		contentPane.add(dateChooser);
		
		placebirthLabel = new JLabel("Place of Birth");
		placebirthLabel.setBounds(340, 180, 80, 25); 
		contentPane.add(placebirthLabel);

		placebirthField = new JTextField();
		placebirthField.setBounds(340, 210, 250, 40);
		placebirthField.setOpaque(true); 
		placebirthField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		placebirthField.setFocusable(true);
		contentPane.add(placebirthField);
		
		genderLabel = new JLabel("Gender");
        genderLabel.setBounds(400, 260, 80, 25);
        contentPane.add(genderLabel);

        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(400, 290, 80, 25);
        contentPane.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(400, 290, 80, 25);
        contentPane.add(femaleRadioButton);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
		
		nationalityLabel = new JLabel("Nationality");
		nationalityLabel.setBounds(30, 270, 80, 25);
		contentPane.add	(nationalityLabel);

		nationalityField = new JTextField();
		nationalityField.setBounds(30, 300, 390, 40); 
		nationalityField.setOpaque(true); 
		nationalityField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		nationalityField.setFocusable(true);
		contentPane.add	(nationalityField);
		
		religionLabel = new JLabel("Religion");
		religionLabel.setBounds(440, 270, 80, 25); 
		contentPane.add	(religionLabel);

		religionField = new JTextField();
		religionField.setBounds(440, 300, 380, 40);
		religionField.setOpaque(true); 
		religionField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); 
		religionField.setFocusable(true);
		contentPane.add	(religionField);
		
		homeLabel = new JLabel("Home Address");
		homeLabel.setBounds(30, 350, 200, 25); 
		contentPane.add	(homeLabel);

		homeField = new JTextField();
		homeField.setBounds(30, 380, 790, 40); 
		homeField.setOpaque(true);
		homeField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		homeField.setFocusable(true);
		contentPane.add	(homeField);
		
		zipcodeLabel = new JLabel("Zipcode");
		zipcodeLabel.setBounds(900, 350, 80, 25); 
		contentPane.add(zipcodeLabel);
		
		zipcodeField = new JTextField();
		zipcodeField.setBounds(900, 380, 250, 40); 
		zipcodeField.setOpaque(true);
		zipcodeField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		zipcodeField.setFocusable(true);
		contentPane.add(zipcodeField);
		
		countryLabel = new JLabel("Country");
		countryLabel.setBounds(30, 420, 80, 25);
		contentPane.add(countryLabel);
		
		countryField = new JTextField();
		countryField.setBounds(30, 450, 250, 40);
		countryField.setOpaque(true);
		countryField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		countryField.setFocusable(true);
		contentPane.add(countryField);
		
		regionLabel = new JLabel("Province/Region");
		regionLabel.setBounds(300, 420, 200, 25);
		contentPane.add(regionLabel);
		
		regionField = new JTextField();
		regionField.setBounds(300, 450, 250, 40);
		regionField.setOpaque(true);
		regionField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		regionField.setFocusable(true);
		contentPane.add(regionField);
		
		cityLabel = new JLabel("City/Municipality");
		cityLabel.setBounds(575, 420, 200, 25);
		contentPane.add(cityLabel);
		
		cityField = new JTextField();
		cityField.setBounds(575, 450, 250, 40);
		cityField.setOpaque(true);
		cityField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		cityField.setFocusable(true);
		contentPane.add(cityField);
		
		barangayLabel = new JLabel("Barangay");
		barangayLabel.setBounds(900, 420, 200, 25);
		contentPane.add(barangayLabel);
		
		barangayField = new JTextField();
		barangayField.setBounds(900, 450, 250, 40);
		barangayField.setOpaque(true);
		barangayField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		barangayField.setFocusable(true);
		contentPane.add(barangayField);
		
		
		JButton myButton = new JButton("Register Student");
		myButton.setBounds(950, 550, 200, 50);
		contentPane.add(myButton);
		
		myButton.addActionListener(e -> {
		    System.out.println("Button Clicked!");
		});
	}
	

}
