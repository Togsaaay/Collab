import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;




public class addStudentForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel firstnameLabel, lastnameLabel, middlenameLabel, ageLabel, placebirthLabel, civilStatusLabel, nationalityLabel, religionLabel, homeLabel;
    private JTextField firstnameField, lastnameField, middlenameField, ageField, placebirthField, civilStatusField, nationalityField, religionField, homeField;

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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\johnr\\Desktop\\Collab\\src\\Images\\logoCropped.JPG"));
		lblNewLabel_1.setBounds(0, 0, 67, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("University of Science and Technology of Southern Philippines");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(77, 7, 542, 38);
		contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\johnr\\Desktop\\Collab\\src\\Images\\bluecrop.JPG"));
		lblNewLabel.setBounds(0, 0, 2000, 57);
		contentPane.add(lblNewLabel);
		
		lastnameLabel = new JLabel("Lastname");
		lastnameLabel.setBounds(100, 100, 80, 25); // Set the bounds for the username label
		contentPane.add(lastnameLabel);

		lastnameField = new JTextField();
		lastnameField.setBounds(100, 125, 250, 40); // Set the bounds for the username text field
		contentPane.add(lastnameField);
		
		firstnameLabel = new JLabel("Firstname");
		firstnameLabel.setBounds(370, 100, 80, 25); // Set the bounds for the username label
		contentPane.add(firstnameLabel);

		firstnameField = new JTextField();
		firstnameField.setBounds(370, 125, 250, 40); // Set the bounds for the username text field
		contentPane.add(firstnameField);
		
		
		middlenameLabel = new JLabel("Middle Name");
		middlenameLabel.setBounds(640, 100, 80, 25); // Set the bounds for the username label
		contentPane.add(middlenameLabel);

		middlenameField = new JTextField();
		middlenameField.setBounds(640, 125, 250, 40); // Set the bounds for the username text field
		contentPane.add(middlenameField);
		
		
		ageLabel = new JLabel("Age");
		ageLabel.setBounds(100, 180, 80, 25); // Set the bounds for the username label
		contentPane.add(ageLabel);

		ageField = new JTextField();
		ageField.setBounds(100, 210, 80, 40); // Set the bounds for the username text field
		contentPane.add(ageField);
		
		placebirthLabel = new JLabel("Place of Birth");
		placebirthLabel.setBounds(200, 180, 80, 25); // Set the bounds for the username label
		contentPane.add(placebirthLabel);

		placebirthField = new JTextField();
		placebirthField.setBounds(200, 210, 250, 40); // Set the bounds for the username text field
		contentPane.add(placebirthField);
		
		civilStatusLabel = new JLabel("Civil Status");
		civilStatusLabel.setBounds(479, 180, 80, 25); // Set the bounds for the username label
		contentPane.add	(civilStatusLabel);

		civilStatusField = new JTextField();
		civilStatusField.setBounds(470, 210, 250, 40); // Set the bounds for the username text field
		contentPane.add	(civilStatusField);
		
		nationalityLabel = new JLabel("Nationality");
		nationalityLabel.setBounds(100, 270, 80, 25); // Set the bounds for the username label
		contentPane.add	(nationalityLabel);

		nationalityField = new JTextField();
		nationalityField.setBounds(100, 300, 390, 40); // Set the bounds for the username text field
		contentPane.add	(nationalityField);
		
		religionLabel = new JLabel("Religion");
		religionLabel.setBounds(510, 270, 80, 25); // Set the bounds for the username label
		contentPane.add	(religionLabel);

		religionField = new JTextField();
		religionField.setBounds(510, 300, 380, 40); // Set the bounds for the username text field
		contentPane.add	(religionField);
		
		homeLabel = new JLabel("Home Address");
		homeLabel.setBounds(100, 350, 200, 25); // Set the bounds for the username label
		contentPane.add	(homeLabel);

		homeField = new JTextField();
		homeField.setBounds(100, 380, 790, 40); // Set the bounds for the username text field
		contentPane.add	(homeField);
	}

}
