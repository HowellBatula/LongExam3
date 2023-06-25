package Howell;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Skills {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills window = new Skills();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Skills() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Skills");
		frame.setBounds(100, 100, 1175, 695);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 1260, 804);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel label = new JLabel("New label");
        label.setBounds(605, 5, 49, 14);
        panel.add(label);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		main howell = new main(true);
            	howell.main(true);
            	frame.dispose();
        	}
        });
        lblNewLabel_1.setIcon(new ImageIcon(AboutMe.class.getResource("/Howell/images/back-button (1).png")));
        lblNewLabel_1.setBounds(54, 68, 32, 39);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Canvas (2).jpg"));
        lblNewLabel.setBounds(0, 0, 1161, 656);
        panel.add(lblNewLabel);
	}
}
