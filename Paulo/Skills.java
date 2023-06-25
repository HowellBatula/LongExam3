package Paulo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Integration.Team;
import Robe.HomeTab;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//this class will inherit Inheritance.java
public class Skills extends Inheritance {

	private JPanel contentPane;
	private boolean integrated;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skills frame = new Skills(true);
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
	public Skills() {
        super.initialize(); // Invoke the constructor of the base frame
        initialize();
    }

    public Skills(boolean integrated) {
    	super(true);
        this.integrated = integrated;
        super.initialize();
        initialize();
    }
    
	public void initialize() {
		
		setTitle("Skills");
		//Contents of the frame
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(177, 0, 657, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel skillsImg = new JLabel("");
		skillsImg.setIcon(new ImageIcon(Skills.class.getResource("/Paulo/PICS/SKILLS (1).png")));
		skillsImg.setBounds(183, 11, 308, 52);
		panel.add(skillsImg);
		
		JLabel Skill1 = new JLabel("Basic Photoshop Skills");
		Skill1.setForeground(Color.WHITE);
		Skill1.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill1.setBackground(new Color(83, 35, 171));
		Skill1.setBounds(140, 135, 155, 14);
		panel.add(Skill1);
		
		JLabel Skill2 = new JLabel("Basic Image Editing");
		Skill2.setForeground(Color.WHITE);
		Skill2.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill2.setBackground(new Color(83, 35, 171));
		Skill2.setBounds(140, 160, 155, 14);
		panel.add(Skill2);
		
		JLabel Skill3 = new JLabel("Creating Shirt Designs");
		Skill3.setForeground(Color.WHITE);
		Skill3.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill3.setBackground(new Color(83, 35, 171));
		Skill3.setBounds(140, 185, 155, 14);
		panel.add(Skill3);
		
		JLabel Skill4 = new JLabel("Brand Managing");
		Skill4.setForeground(Color.WHITE);
		Skill4.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill4.setBackground(new Color(83, 35, 171));
		Skill4.setBounds(401, 254, 107, 14);
		panel.add(Skill4);
		
		JLabel Skill5 = new JLabel("Brand Photography");
		Skill5.setForeground(Color.WHITE);
		Skill5.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill5.setBackground(new Color(83, 35, 171));
		Skill5.setBounds(401, 279, 125, 14);
		panel.add(Skill5);
		
		JLabel Skill6 = new JLabel("Communication with customers");
		Skill6.setForeground(Color.WHITE);
		Skill6.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill6.setBackground(new Color(83, 35, 171));
		Skill6.setBounds(401, 304, 191, 14);
		panel.add(Skill6);
		
		JLabel Skill7 = new JLabel("Adaptability");
		Skill7.setForeground(Color.WHITE);
		Skill7.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill7.setBackground(new Color(83, 35, 171));
		Skill7.setBounds(140, 282, 155, 14);
		panel.add(Skill7);
		
		JLabel Skill8 = new JLabel("Decision-making");
		Skill8.setForeground(Color.WHITE);
		Skill8.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill8.setBackground(new Color(83, 35, 171));
		Skill8.setBounds(140, 307, 155, 14);
		panel.add(Skill8);
		
		JLabel Skill9 = new JLabel("Time Management");
		Skill9.setForeground(Color.WHITE);
		Skill9.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill9.setBackground(new Color(83, 35, 171));
		Skill9.setBounds(140, 332, 155, 14);
		panel.add(Skill9);
		
		JLabel Skill10 = new JLabel("Computer Skils");
		Skill10.setForeground(Color.WHITE);
		Skill10.setFont(new Font("Dubai", Font.BOLD, 14));
		Skill10.setBackground(new Color(83, 35, 171));
		Skill10.setBounds(140, 357, 155, 14);
		panel.add(Skill10);
		
		JLabel lblCreativity = new JLabel("Creativity");
		lblCreativity.setForeground(Color.WHITE);
		lblCreativity.setFont(new Font("Dubai", Font.BOLD, 14));
		lblCreativity.setBackground(new Color(83, 35, 171));
		lblCreativity.setBounds(140, 382, 155, 14);
		panel.add(lblCreativity);
		
		JLabel PSLabel = new JLabel("");
		PSLabel.setIcon(new ImageIcon(Skills.class.getResource("/Paulo/PICS/Ps (1).png")));
		PSLabel.setBounds(10, 118, 113, 110);
		panel.add(PSLabel);
		
		JLabel SkillIcon = new JLabel("");
		SkillIcon.setIcon(new ImageIcon(Skills.class.getResource("/Paulo/PICS/SKILLZ (1).png")));
		SkillIcon.setBounds(10, 282, 113, 110);
		panel.add(SkillIcon);
		
		JLabel Troublesome = new JLabel("");
		Troublesome.setIcon(new ImageIcon(Skills.class.getResource("/Paulo/PICS/og.logo (1).png")));
		Troublesome.setBounds(353, 151, 211, 110);
		panel.add(Troublesome);
		
	}

}