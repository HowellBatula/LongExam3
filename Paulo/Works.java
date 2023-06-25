package Paulo;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//this class will inherit Inheritance.java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Integration.Team;
import Robe.HomeTab;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Works extends Inheritance {

	private JPanel contentPane;
	private boolean integrated;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Works frame = new Works(true);
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
	public Works() {
        super.initialize(); // Invoke the constructor of the base frame
        initialize();
    }

    public Works(boolean integrated) {
    	super(true);
        this.integrated = integrated;
        super.initialize();
        initialize();
    }
    
	public void initialize() {
	
		setTitle("Works");
		//Contents of the frame
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(177, 0, 657, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel workImg1 = new JLabel("");
		workImg1.setIcon(new ImageIcon(Works.class.getResource("/Paulo/PICS/BEALIVE1 (2).png")));
		workImg1.setBounds(10, 95, 300, 300);
		panel.add(workImg1);
		
		JLabel workImg2 = new JLabel("");
		workImg2.setIcon(new ImageIcon(Works.class.getResource("/Paulo/PICS/asdasd (1).png")));
		workImg2.setBounds(325, 95, 300, 300);
		panel.add(workImg2);
		
		JLabel prevwokrsImg = new JLabel("");
		prevwokrsImg.setIcon(new ImageIcon(Works.class.getResource("/Paulo/PICS/prevworks (1).png")));
		prevwokrsImg.setBounds(116, 11, 425, 55);
		panel.add(prevwokrsImg);
			}
}
