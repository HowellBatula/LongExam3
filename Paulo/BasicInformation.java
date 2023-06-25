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
public class BasicInformation extends Inheritance {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicInformation frame = new BasicInformation(true);
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
	public BasicInformation() {
		 super.initialize(); // Invoke the constructor of the base frame
	        initialize();
  
}

	public BasicInformation(boolean integrated) {
		super(true);
        this.integrated = integrated;
        super.initialize();
        initialize();
}
	public void initialize() {
		
		setTitle("Basic Information");
		//Contents of the frame
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		panel.setBounds(177, 0, 657, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel basicImg = new JLabel("");
		basicImg.setBounds(81, 11, 465, 75);
		basicImg.setIcon(new ImageIcon(BasicInformation.class.getResource("/Paulo/PICS/BASICINFONEXT1.png")));
		panel.add(basicImg);
		
		JLabel pauImg = new JLabel("");
		pauImg.setBounds(96, 42, 0, 0);
		pauImg.setForeground(new Color(83, 35, 171));
		panel.add(pauImg);
		
		JLabel lblNicknamePaulopau = new JLabel("Nickname: Paulo/Pau");
		lblNicknamePaulopau.setForeground(Color.WHITE);
		lblNicknamePaulopau.setFont(new Font("Dubai", Font.BOLD, 13));
		lblNicknamePaulopau.setBackground(new Color(83, 35, 171));
		lblNicknamePaulopau.setBounds(252, 139, 137, 14);
		panel.add(lblNicknamePaulopau);
		
		JLabel BirthdateLabel = new JLabel("Born:  April 27, 2003");
		BirthdateLabel.setForeground(Color.WHITE);
		BirthdateLabel.setFont(new Font("Dubai", Font.BOLD, 13));
		BirthdateLabel.setBackground(new Color(83, 35, 171));
		BirthdateLabel.setBounds(253, 160, 115, 14);
		panel.add(BirthdateLabel);
		
		JLabel BirthplaceLabel = new JLabel("Birthplace:  Abu Dhabi, UAE");
		BirthplaceLabel.setForeground(Color.WHITE);
		BirthplaceLabel.setFont(new Font("Dubai", Font.BOLD, 13));
		BirthplaceLabel.setBackground(new Color(83, 35, 171));
		BirthplaceLabel.setBounds(228, 185, 161, 14);
		panel.add(BirthplaceLabel);
		
		JLabel NationalityLabel = new JLabel("Nationality:  Filipino");
		NationalityLabel.setForeground(Color.WHITE);
		NationalityLabel.setFont(new Font("Dubai", Font.BOLD, 13));
		NationalityLabel.setBackground(new Color(83, 35, 171));
		NationalityLabel.setBounds(255, 210, 161, 14);
		panel.add(NationalityLabel);
		
		JLabel AddressLabel = new JLabel("Address: Caloocan City");
		AddressLabel.setForeground(Color.WHITE);
		AddressLabel.setFont(new Font("Dubai", Font.BOLD, 13));
		AddressLabel.setBackground(new Color(83, 35, 171));
		AddressLabel.setBounds(242, 235, 137, 14);
		panel.add(AddressLabel);
		
		JLabel NameLabel = new JLabel("David, Juan Paulo A.");
		NameLabel.setForeground(Color.WHITE);
		NameLabel.setFont(new Font("Dubai", Font.BOLD, 16));
		NameLabel.setBackground(new Color(83, 35, 171));
		NameLabel.setBounds(242, 113, 161, 14);
		panel.add(NameLabel);
		
		JLabel hobbiesLbl = new JLabel("HOBBIES:");
		hobbiesLbl.setForeground(Color.WHITE);
		hobbiesLbl.setFont(new Font("Dubai", Font.BOLD, 26));
		hobbiesLbl.setBounds(258, 338, 130, 23);
		panel.add(hobbiesLbl);
		
		JLabel bballLbl = new JLabel("Playing Basketball");
		bballLbl.setForeground(Color.WHITE);
		bballLbl.setFont(new Font("Dubai", Font.BOLD, 14));
		bballLbl.setBackground(new Color(83, 35, 171));
		bballLbl.setBounds(266, 372, 137, 14);
		panel.add(bballLbl);
		
		JLabel musicLbl = new JLabel("Listening to music\r\n");
		musicLbl.setForeground(Color.WHITE);
		musicLbl.setFont(new Font("Dubai", Font.BOLD, 14));
		musicLbl.setBackground(new Color(83, 35, 171));
		musicLbl.setBounds(266, 390, 122, 14);
		panel.add(musicLbl);
		
		JLabel weightLbl = new JLabel("Weightlifting");
		weightLbl.setForeground(Color.WHITE);
		weightLbl.setFont(new Font("Dubai", Font.BOLD, 14));
		weightLbl.setBackground(new Color(83, 35, 171));
		weightLbl.setBounds(266, 410, 88, 14);
		panel.add(weightLbl);
		
		JLabel BallIcon = new JLabel("");
		BallIcon.setIcon(new ImageIcon(BasicInformation.class.getResource("/Paulo/PICS/BBALL (1).png")));
		BallIcon.setBounds(398, 338, 88, 112);
		panel.add(BallIcon);
		
		JLabel LiftingIcon = new JLabel("");
		LiftingIcon.setIcon(new ImageIcon(BasicInformation.class.getResource("/Paulo/PICS/LIFTING (2).png")));
		LiftingIcon.setBounds(496, 326, 106, 112);
		panel.add(LiftingIcon);
		
		JLabel Strengths = new JLabel("STRENGTHS:");
		Strengths.setForeground(Color.WHITE);
		Strengths.setFont(new Font("Dubai", Font.BOLD, 26));
		Strengths.setBounds(31, 338, 161, 23);
		panel.add(Strengths);
		
		JLabel Strenght1 = new JLabel("Eagerness to learn\r\n");
		Strenght1.setForeground(Color.WHITE);
		Strenght1.setFont(new Font("Dubai", Font.BOLD, 14));
		Strenght1.setBackground(new Color(83, 35, 171));
		Strenght1.setBounds(31, 371, 155, 17);
		panel.add(Strenght1);
		
		JLabel Strenght2 = new JLabel("Creativity");
		Strenght2.setForeground(Color.WHITE);
		Strenght2.setFont(new Font("Dubai", Font.BOLD, 14));
		Strenght2.setBackground(new Color(83, 35, 171));
		Strenght2.setBounds(31, 389, 155, 17);
		panel.add(Strenght2);
		
		JLabel Strenght3 = new JLabel("Dedicated");
		Strenght3.setForeground(Color.WHITE);
		Strenght3.setFont(new Font("Dubai", Font.BOLD, 14));
		Strenght3.setBackground(new Color(83, 35, 171));
		Strenght3.setBounds(31, 409, 155, 17);
		panel.add(Strenght3);
		
		JLabel Strenght4 = new JLabel("Resourceful");
		Strenght4.setForeground(Color.WHITE);
		Strenght4.setFont(new Font("Dubai", Font.BOLD, 14));
		Strenght4.setBackground(new Color(83, 35, 171));
		Strenght4.setBounds(31, 433, 155, 17);
		panel.add(Strenght4);
		
		if (integrated) {
			JLabel back = new JLabel();
			back.setIcon(new ImageIcon(HomeTab.class.getResource("/Paulo/PICS/back-button (1).png")));

			back.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
					new Team().main(null);
				}
			});
			back.setBounds(34, 394, 49, 14);
			getContentPane().add(back);
		}
	}
}
