import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Image;


public class CollabSystem extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CollabSystem frame = new CollabSystem();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

 public CollabSystem() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Corrected file path using double backslashes
        ImageIcon icon = new ImageIcon("C:\\Users\\johnr\\Desktop\\Collab\\src\\Images\\gated.JPG");

        Image image = icon.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);

        JLabel label = new JLabel(icon);
        contentPane.add(label);
    }
 }
