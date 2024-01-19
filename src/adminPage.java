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
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class adminPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    adminPage frame = new adminPage();
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
    public adminPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Disable resizing
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
		
		JLabel lblNewLabe_4 = new JLabel();
		lblNewLabe_4.setIcon(new ImageIcon("C:\\Users\\johnr\\Desktop\\Collab\\src\\Images\\ustp.JPG"));
		lblNewLabe_4.setBounds(0, 55, 900, 300);
		contentPane.add(lblNewLabe_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\johnr\\Desktop\\Collab\\src\\Images\\orangeCropped.JPG"));
		lblNewLabel_5.setBounds(900, -200, 900, 1200);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\johnr\\Desktop\\Collab\\src\\Images\\orangeCropped.JPG"));
		lblNewLabel_6.setBounds(900, -500, 900, 1000);
		contentPane.add(lblNewLabel_6);
    }
}
