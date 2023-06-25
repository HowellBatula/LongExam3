package Paulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Integration.Team;
import Robe.HomeTab;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
//this class will inherit Inheritance.java
public class EducationalBackground extends Inheritance {

	private JPanel contentPane;
	private boolean integrated;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationalBackground frame = new EducationalBackground(true);
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
	public EducationalBackground() {
        super.initialize(); // Invoke the constructor of the base frame
        initialize();
    }

    public EducationalBackground(boolean integrated) {
    	super(true);
        this.integrated = integrated;
        super.initialize();
        initialize();
    }
    
	public void initialize() {
		
		setTitle("Educational Background");
		//Contents of the frame
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(177, 0, 657, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel SchoolLabel = new JLabel("San Lorenzo Ruiz De Manila School\r\n\r\n");
		SchoolLabel.setForeground(Color.WHITE);
		SchoolLabel.setFont(new Font("Dubai", Font.BOLD, 16));
		SchoolLabel.setBounds(182, 92, 250, 23);
		panel.add(SchoolLabel);
		
		JLabel Primary = new JLabel(" Primary School (2010-2016)");
		Primary.setForeground(Color.WHITE);
		Primary.setFont(new Font("Dubai", Font.PLAIN, 14));
		Primary.setBackground(new Color(34, 35, 39));
		Primary.setBounds(192, 126, 180, 14);
		panel.add(Primary);
		
		JLabel SchoolLabel2 = new JLabel("St. Mary's Academy of Caloocan City");
		SchoolLabel2.setForeground(Color.WHITE);
		SchoolLabel2.setFont(new Font("Dubai", Font.BOLD, 16));
		SchoolLabel2.setBounds(190, 213, 261, 23);
		panel.add(SchoolLabel2);
		
		JLabel Secondary = new JLabel("Secondary School (2016-2020)");
		Secondary.setForeground(Color.WHITE);
		Secondary.setFont(new Font("Dubai", Font.PLAIN, 14));
		Secondary.setBackground(new Color(34, 35, 39));
		Secondary.setBounds(200, 247, 194, 14);
		panel.add(Secondary);
		
		JLabel lblSeniorHighSchool = new JLabel("Senior High School (2020-2022)");
		lblSeniorHighSchool.setForeground(Color.WHITE);
		lblSeniorHighSchool.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblSeniorHighSchool.setBackground(new Color(34, 35, 39));
		lblSeniorHighSchool.setBounds(200, 272, 194, 14);
		panel.add(lblSeniorHighSchool);
		
		JLabel Achievement = new JLabel("Best Researcher for the study \"Biodegradable Plastic Bag from Tapioca Starch\"");
		Achievement.setForeground(Color.WHITE);
		Achievement.setFont(new Font("Dubai", Font.PLAIN, 14));
		Achievement.setBackground(new Color(34, 35, 39));
		Achievement.setBounds(200, 300, 457, 23);
		panel.add(Achievement);
		
		JLabel SchoolLabel3 = new JLabel("National University Manila");
		SchoolLabel3.setForeground(Color.WHITE);
		SchoolLabel3.setFont(new Font("Dubai", Font.BOLD, 16));
		SchoolLabel3.setBounds(182, 334, 212, 23);
		panel.add(SchoolLabel3);
		
		JLabel lblUndergraduatepresent = new JLabel("Undergraduate - BSIT-MWA (2022-Present)");
		lblUndergraduatepresent.setForeground(Color.WHITE);
		lblUndergraduatepresent.setFont(new Font("Dubai", Font.PLAIN, 14));
		lblUndergraduatepresent.setBackground(new Color(34, 35, 39));
		lblUndergraduatepresent.setBounds(200, 368, 266, 14);
		panel.add(lblUndergraduatepresent);
		
		JLabel SanLoLogo = new JLabel("");
		SanLoLogo.setIcon(new ImageIcon(EducationalBackground.class.getResource("/Paulo/PICS/sanlo (2).png")));
		SanLoLogo.setBounds(39, 92, 125, 110);
		panel.add(SanLoLogo);
		
		JLabel SmaccLogo = new JLabel("");
		SmaccLogo.setIcon(new ImageIcon(EducationalBackground.class.getResource("/Paulo/PICS/smacc (1) (1).png")));
		SmaccLogo.setBounds(39, 213, 125, 110);
		panel.add(SmaccLogo);
		
		JLabel NULogo = new JLabel("");
		NULogo.setIcon(new ImageIcon(EducationalBackground.class.getResource("/Paulo/PICS/NU (2).png")));
		NULogo.setBounds(49, 334, 83, 106);
		panel.add(NULogo);
		
		JLabel EducLabel = new JLabel("\r\n");
		EducLabel.setIcon(new ImageIcon(EducationalBackground.class.getResource("/Paulo/PICS/EDUCNEXT3.png")));
		EducLabel.setBounds(97, 22, 457, 37);
		panel.add(EducLabel);
		
	}
}
