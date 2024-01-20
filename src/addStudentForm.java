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

import javax.swing.*;
import java.awt.*;





public class addStudentForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel firstnameLabel, lastnameLabel, middlenameLabel, ageLabel, placebirthLabel, civilStatusLabel, nationalityLabel, religionLabel, homeLabel, zipcodeLabel, countryLabel, regionLabel, cityLabel, barangayLabel;
    private JTextField firstnameField, lastnameField, middlenameField, ageField, placebirthField, civilStatusField, nationalityField, religionField, homeField, zipcodeField, countryField, regionField, cityField, barangayField;

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

        // Get the screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Set the size of the window to full screen
        setSize(screenSize.width, screenSize.height);

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
		lastnameLabel.setBounds(100, 100, 80, 25); // Set the bounds for the username label
		contentPane.add(lastnameLabel);

		lastnameField = new JTextField();
		lastnameField.setBounds(100, 125, 250, 40); // Set the bounds for the username text field
		lastnameField.setOpaque(true); // Set the field to be opaque
		lastnameField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		lastnameField.setFocusable(true);// Set the background color to gray
		contentPane.add(lastnameField);
		
		firstnameLabel = new JLabel("Firstname");
		firstnameLabel.setBounds(370, 100, 80, 25); // Set the bounds for the username label
		contentPane.add(firstnameLabel);

		firstnameField = new JTextField();
		firstnameField.setBounds(370, 125, 250, 40); // Set the bounds for the username text field
		firstnameField.setOpaque(true); // Set the field to be opaque
		firstnameField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		firstnameField.setFocusable(true);// Set the background color to gray
		contentPane.add(firstnameField);
		
		
		middlenameLabel = new JLabel("Middle Name");
		middlenameLabel.setBounds(640, 100, 80, 25); // Set the bounds for the username label
		contentPane.add(middlenameLabel);

		middlenameField = new JTextField();
		middlenameField.setBounds(640, 125, 250, 40); // Set the bounds for the username text field
		middlenameField.setOpaque(true); // Set the field to be opaque
		middlenameField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		middlenameField.setFocusable(true);// Set the background color to gray
		contentPane.add(middlenameField);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("./src/Images/orangeCropped.JPG"));
		lblNewLabel_5.setBounds(920, 0, 250, 340);
		contentPane.add(lblNewLabel_5);
		
		
		ageLabel = new JLabel("Age");
		ageLabel.setBounds(100, 180, 80, 25); // Set the bounds for the username label
		contentPane.add(ageLabel);

		ageField = new JTextField();
		ageField.setBounds(100, 210, 80, 40); // Set the bounds for the username text field
		ageField.setOpaque(true); // Set the field to be opaque
		ageField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		ageField.setFocusable(true);// Set the background color to gray
		contentPane.add(ageField);
		
		placebirthLabel = new JLabel("Place of Birth");
		placebirthLabel.setBounds(200, 180, 80, 25); // Set the bounds for the username label
		contentPane.add(placebirthLabel);

		placebirthField = new JTextField();
		placebirthField.setBounds(200, 210, 250, 40); // Set the bounds for the username text field
		placebirthField.setOpaque(true); // Set the field to be opaque
		placebirthField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		placebirthField.setFocusable(true);
		contentPane.add(placebirthField);
		
		civilStatusLabel = new JLabel("Civil Status");
		civilStatusLabel.setBounds(479, 180, 80, 25); // Set the bounds for the username label
		contentPane.add	(civilStatusLabel);

		civilStatusField = new JTextField();
		civilStatusField.setBounds(470, 210, 250, 40); // Set the bounds for the username text field
		civilStatusField.setOpaque(true); // Set the field to be opaque
		civilStatusField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		civilStatusField.setFocusable(true);// Set the background color to gray
		contentPane.add	(civilStatusField);
		
		nationalityLabel = new JLabel("Nationality");
		nationalityLabel.setBounds(100, 270, 80, 25); // Set the bounds for the username label
		contentPane.add	(nationalityLabel);

		nationalityField = new JTextField();
		nationalityField.setBounds(100, 300, 390, 40); // Set the bounds for the username text field
		nationalityField.setOpaque(true); // Set the field to be opaque
		nationalityField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		nationalityField.setFocusable(true);// Set the background color to gray
		contentPane.add	(nationalityField);
		
		religionLabel = new JLabel("Religion");
		religionLabel.setBounds(510, 270, 80, 25); // Set the bounds for the username label
		contentPane.add	(religionLabel);

		religionField = new JTextField();
		religionField.setBounds(510, 300, 380, 40); // Set the bounds for the username text field
		religionField.setOpaque(true); // Set the field to be opaque
		religionField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		religionField.setFocusable(true);// Set the background color to gray
		contentPane.add	(religionField);
		
		homeLabel = new JLabel("Home Address");
		homeLabel.setBounds(100, 350, 200, 25); // Set the bounds for the username label
		contentPane.add	(homeLabel);

		homeField = new JTextField();
		homeField.setBounds(100, 380, 790, 40); // Set the bounds for the username text field
		homeField.setOpaque(true); // Set the field to be opaque
		homeField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		homeField.setFocusable(true);// Set the background color to gray
		contentPane.add	(homeField);
		
		zipcodeLabel = new JLabel("Zipcode");
		zipcodeLabel.setBounds(920, 350, 80, 25); // Set the bounds for the username label
		contentPane.add(zipcodeLabel);
		
		zipcodeField = new JTextField();
		zipcodeField.setBounds(920, 380, 250, 40); // Set the bounds for the username text field
		zipcodeField.setOpaque(true); // Set the field to be opaque
		zipcodeField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		zipcodeField.setFocusable(true);// Set the background color to gray
		contentPane.add(zipcodeField);
		
		countryLabel = new JLabel("Country");
		countryLabel.setBounds(100, 420, 80, 25); // Set the bounds for the username label
		contentPane.add(countryLabel);
		
		countryField = new JTextField();
		countryField.setBounds(100, 450, 250, 40); // Set the bounds for the username text field
		countryField.setOpaque(true); // Set the field to be opaque
		countryField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		countryField.setFocusable(true);// Set the background color to gray
		contentPane.add(countryField);
		
		regionLabel = new JLabel("Province/Region");
		regionLabel.setBounds(370, 420, 200, 25); // Set the bounds for the username label
		contentPane.add(regionLabel);
		
		regionField = new JTextField();
		regionField.setBounds(370, 450, 250, 40); // Set the bounds for the username text field
		regionField.setOpaque(true); // Set the field to be opaque
		regionField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		regionField.setFocusable(true);// Set the background color to gray
		contentPane.add(regionField);
		
		cityLabel = new JLabel("City/Municipality");
		cityLabel.setBounds(640, 420, 200, 25); // Set the bounds for the username label
		contentPane.add(cityLabel);
		
		cityField = new JTextField();
		cityField.setBounds(640, 450, 250, 40); // Set the bounds for the username text field
		cityField.setOpaque(true); // Set the field to be opaque
		cityField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		cityField.setFocusable(true);// Set the background color to gray
		contentPane.add(cityField);
		
		barangayLabel = new JLabel("Barangay");
		barangayLabel.setBounds(918, 420, 200, 25); // Set the bounds for the username label
		contentPane.add(barangayLabel);
		
		barangayField = new JTextField();
		barangayField.setBounds(918, 450, 250, 40); // Set the bounds for the username text field
		barangayField.setOpaque(true); // Set the field to be opaque
		barangayField.setCursor(new Cursor(Cursor.TEXT_CURSOR)); // Set cursor to text cursor
		barangayField.setFocusable(true);// Set the background color to gray
		contentPane.add(barangayField);
		
		
		JButton myButton = new JButton("Register Student");
		myButton.setBounds(965, 550, 200, 50); // Set the bounds for the button
		contentPane.add(myButton);
		
		myButton.addActionListener(e -> {
		    // Code to be executed when the button is clicked
		    System.out.println("Button Clicked!");
		});
	}
	

}
