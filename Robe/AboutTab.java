package Robe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Integration.Team;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class AboutTab extends BaseFrame {

	private JPanel contentPane;
	private JPanel informationPanel;
	private JPanel positivePanel;
	private JPanel achievePanel;
	private JPanel hobbiesPanel;
	private JPanel itPanel;
	private boolean integrated;
	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutTab frame = new AboutTab(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AboutTab() {
        super.initialize(); // Invoke the constructor of the base frame
        initialize();
    }

    public AboutTab(boolean integrated) {
    	super(true);
        this.integrated = integrated;
        super.initialize();
        initialize();
    }
    
	public void initialize() {
		setUndecorated(true);
		setResizable(false);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBackground(new Color(236, 236, 236));
		headerPanel.setBounds(0, 60, 1200, 65);
		getContentPane().add(headerPanel);
		
		JLabel headerLbl = new JLabel("LEARN MORE ABOUT ME");
		headerLbl.setHorizontalAlignment(SwingConstants.CENTER);
		headerLbl.setFont(new Font("Times New Roman", Font.BOLD, 28));
		headerLbl.setBackground(new Color(236, 236, 236));
		headerLbl.setBounds(425, 0, 361, 65);
		headerPanel.add(headerLbl);
		
		JPanel sidePanel = new JPanel();
		sidePanel.setLayout(null);
		sidePanel.setBackground(new Color(220, 220, 220));
		sidePanel.setBounds(10, 134, 350, 555);
		getContentPane().add(sidePanel);
		
		JPanel personalPanel = new JPanel();
		personalPanel.setLayout(null);
		personalPanel.setBackground(new Color(220, 220, 220));
		personalPanel.setBounds(10, 220, 330, 50);
		sidePanel.add(personalPanel);
		
		JLabel personalLbl = new JLabel("Personal Information");
		personalLbl.setHorizontalAlignment(SwingConstants.CENTER);
		personalLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		personalLbl.setBounds(10, 10, 310, 30);
		personalPanel.add(personalLbl);
		
		JPanel strengthPanel = new JPanel();
		strengthPanel.setLayout(null);
		strengthPanel.setBackground(new Color(220, 220, 220));
		strengthPanel.setBounds(10, 280, 330, 50);
		sidePanel.add(strengthPanel);
		
		JLabel skillsLbl = new JLabel("Strength and Skills");
		skillsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		skillsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		skillsLbl.setBounds(10, 10, 310, 30);
		strengthPanel.add(skillsLbl);
		
		JPanel achievementsPanel = new JPanel();
		achievementsPanel.setLayout(null);
		achievementsPanel.setBackground(new Color(220, 220, 220));
		achievementsPanel.setBounds(10, 340, 330, 50);
		sidePanel.add(achievementsPanel);
		
		JLabel achievementsLbl = new JLabel("Achievements");
		achievementsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		achievementsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		achievementsLbl.setBounds(10, 10, 310, 30);
		achievementsPanel.add(achievementsLbl);
		
		JPanel talentsPanel = new JPanel();
		talentsPanel.setLayout(null);
		talentsPanel.setBackground(new Color(220, 220, 220));
		talentsPanel.setBounds(10, 400, 330, 50);
		sidePanel.add(talentsPanel);
		
		JLabel talentsLbl = new JLabel("Talents and Hobbies");
		talentsLbl.setHorizontalAlignment(SwingConstants.CENTER);
		talentsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		talentsLbl.setBounds(10, 10, 310, 30);
		talentsPanel.add(talentsLbl);
		
		JPanel whyITPanel = new JPanel();
		whyITPanel.setLayout(null);
		whyITPanel.setBackground(new Color(220, 220, 220));
		whyITPanel.setBounds(10, 460, 330, 50);
		sidePanel.add(whyITPanel);
		
		JLabel whyITLbl = new JLabel("Why I chose IT");
		whyITLbl.setHorizontalAlignment(SwingConstants.CENTER);
		whyITLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		whyITLbl.setBounds(10, 10, 310, 30);
		whyITPanel.add(whyITLbl);
		
		JLabel photo = new JLabel("");
		photo.setIcon(new ImageIcon(AboutTab.class.getResource("/Robe/images/346127510_252377387465925_2326692292738106622_n__1_-removebg-preview.png")));
		photo.setHorizontalAlignment(SwingConstants.CENTER);
		photo.setBackground(new Color(220, 220, 220));
		photo.setBounds(75, 0, 200, 200);
		sidePanel.add(photo);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBounds(370, 135, 820, 553);
		getContentPane().add(displayPanel);
		displayPanel.setLayout(null);
		
		informationPanel = new JPanel();
		personalPanel.addMouseListener(new PanelMouseAdapter(personalPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				//calling out the menuClicked() method
				menuClicked(informationPanel);
			}
		});
		informationPanel.setLayout(null);
		informationPanel.setBackground(new Color(220, 220, 220));
		informationPanel.setBounds(0, 0, 820, 555);
		displayPanel.add(informationPanel);
		
		JLabel personalinfoTitle = new JLabel("PERSONAL INFORMATION");
		personalinfoTitle.setForeground(new Color(18, 18, 167));
		personalinfoTitle.setFont(new Font("Verdana", Font.BOLD, 36));
		personalinfoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		personalinfoTitle.setBounds(125, 10, 600, 60);
		informationPanel.add(personalinfoTitle);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(null);
		namePanel.setBackground(new Color(220, 220, 220));
		namePanel.setBounds(10, 50, 800, 50);
		informationPanel.add(namePanel);
		
		JLabel NameLbl = new JLabel("Name:");
		NameLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		NameLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		NameLbl.setBounds(10, 0, 130, 50);
		namePanel.add(NameLbl);
		
		JLabel nameLbl = new JLabel("John Robert L. Lasan");
		nameLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		nameLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		nameLbl.setBounds(200, 0, 200, 50);
		namePanel.add(nameLbl);
		
		JPanel agePanel = new JPanel();
		agePanel.setLayout(null);
		agePanel.setBackground(new Color(220, 220, 220));
		agePanel.setBounds(10, 110, 800, 50);
		informationPanel.add(agePanel);
		
		JLabel AgeLbl = new JLabel("Age:");
		AgeLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		AgeLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		AgeLbl.setBounds(10, 0, 130, 50);
		agePanel.add(AgeLbl);
		
		JLabel ageLbl = new JLabel("19");
		ageLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		ageLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		ageLbl.setBounds(200, 0, 200, 50);
		agePanel.add(ageLbl);
		
		JPanel bdayPanel = new JPanel();
		bdayPanel.setLayout(null);
		bdayPanel.setBackground(new Color(220, 220, 220));
		bdayPanel.setBounds(10, 170, 800, 50);
		informationPanel.add(bdayPanel);
		
		JLabel BdayLbl = new JLabel("Birthday:");
		BdayLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		BdayLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		BdayLbl.setBounds(10, 0, 130, 50);
		bdayPanel.add(BdayLbl);
		
		JLabel bdayLbl = new JLabel("November 7, 2003");
		bdayLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		bdayLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		bdayLbl.setBounds(200, 0, 200, 50);
		bdayPanel.add(bdayLbl);
		
		JPanel sexPanel = new JPanel();
		sexPanel.setLayout(null);
		sexPanel.setBackground(new Color(220, 220, 220));
		sexPanel.setBounds(10, 230, 800, 50);
		informationPanel.add(sexPanel);
		
		JLabel SexLbl = new JLabel("Sex:");
		SexLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		SexLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		SexLbl.setBounds(10, 0, 130, 50);
		sexPanel.add(SexLbl);
		
		JLabel sexLbl = new JLabel("Male");
		sexLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		sexLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		sexLbl.setBounds(200, 0, 200, 50);
		sexPanel.add(sexLbl);
		
		JPanel coursePanel = new JPanel();
		coursePanel.setLayout(null);
		coursePanel.setBackground(new Color(220, 220, 220));
		coursePanel.setBounds(10, 290, 800, 50);
		informationPanel.add(coursePanel);
		
		JLabel CourseLbl = new JLabel("Course:");
		CourseLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		CourseLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		CourseLbl.setBounds(10, 0, 130, 50);
		coursePanel.add(CourseLbl);
		
		JLabel courseLbl = new JLabel("Bachelor of Science in Information Technology Specialized in Mobile and Web Application\r\n");
		courseLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		courseLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		courseLbl.setBounds(200, 0, 640, 50);
		coursePanel.add(courseLbl);
		
		JPanel yrandsctnPanel = new JPanel();
		yrandsctnPanel.setLayout(null);
		yrandsctnPanel.setBackground(new Color(220, 220, 220));
		yrandsctnPanel.setBounds(10, 350, 800, 50);
		informationPanel.add(yrandsctnPanel);
		
		JLabel YrandSctnLbl = new JLabel("Year and Section:");
		YrandSctnLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		YrandSctnLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		YrandSctnLbl.setBounds(10, 0, 130, 50);
		yrandsctnPanel.add(YrandSctnLbl);
		
		JLabel yrandsctnLbl = new JLabel("1st Year, INF 223");
		yrandsctnLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		yrandsctnLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		yrandsctnLbl.setBounds(200, 0, 200, 50);
		yrandsctnPanel.add(yrandsctnLbl);
		
		JPanel educbgPanel = new JPanel();
		educbgPanel.setLayout(null);
		educbgPanel.setBackground(new Color(220, 220, 220));
		educbgPanel.setBounds(10, 410, 800, 150);
		informationPanel.add(educbgPanel);
		
		JLabel EducbgLbl = new JLabel("Educational Background:");
		EducbgLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		EducbgLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		EducbgLbl.setBounds(10, 0, 180, 50);
		educbgPanel.add(EducbgLbl);
		
		JLabel preschoolLbl = new JLabel("Preschool - Colegio de San Antonio");
		preschoolLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		preschoolLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		preschoolLbl.setBounds(200, 30, 600, 20);
		educbgPanel.add(preschoolLbl);
		
		JLabel elemLbl = new JLabel("Elementary - San Antonio Village Elementary School");
		elemLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		elemLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		elemLbl.setBounds(200, 50, 600, 20);
		educbgPanel.add(elemLbl);
		
		JLabel jhsLbl = new JLabel("Junior High School - Dalig National High School");
		jhsLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		jhsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		jhsLbl.setBounds(200, 70, 600, 20);
		educbgPanel.add(jhsLbl);
		
		JLabel shsLbl = new JLabel("Senior High School - Sumulong College of Arts and Sciences");
		shsLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		shsLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		shsLbl.setBounds(200, 90, 600, 20);
		educbgPanel.add(shsLbl);
		
		JLabel collegeLbl = new JLabel("College - National University Manila");
		collegeLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		collegeLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		collegeLbl.setBounds(200, 110, 600, 20);
		educbgPanel.add(collegeLbl);
		
		positivePanel = new JPanel();
		strengthPanel.addMouseListener(new PanelMouseAdapter(strengthPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				//calling out the menuClicked() method
				menuClicked(positivePanel);
			}
		});
		positivePanel.setBackground(new Color(220, 220, 220));
		positivePanel.setBounds(0, 0, 820, 553);
		displayPanel.add(positivePanel);
		positivePanel.setLayout(null);
		
		JPanel skillsHeaderPanel = new JPanel();
		skillsHeaderPanel.setLayout(null);
		skillsHeaderPanel.setBackground(new Color(220, 220, 220));
		skillsHeaderPanel.setBounds(10, 11, 800, 60);
		positivePanel.add(skillsHeaderPanel);
		
		JLabel strengthTitle = new JLabel("STRENGTH");
		strengthTitle.setForeground(new Color(18, 18, 167));
		strengthTitle.setHorizontalAlignment(SwingConstants.CENTER);
		strengthTitle.setFont(new Font("Verdana", Font.BOLD, 36));
		strengthTitle.setBackground(new Color(220, 220, 220));
		strengthTitle.setBounds(80, 0, 240, 60);
		skillsHeaderPanel.add(strengthTitle);
		
		JLabel skillsHead = new JLabel("SKILLS");
		skillsHead.setForeground(new Color(18, 18, 167));
		skillsHead.setHorizontalAlignment(SwingConstants.CENTER);
		skillsHead.setFont(new Font("Verdana", Font.BOLD, 36));
		skillsHead.setBackground(new Color(220, 220, 220));
		skillsHead.setBounds(500, 0, 240, 60);
		skillsHeaderPanel.add(skillsHead);
		
		JPanel strengthDisplay = new JPanel();
		strengthDisplay.setLayout(null);
		strengthDisplay.setBackground(new Color(220, 220, 220));
		strengthDisplay.setBounds(10, 82, 380, 460);
		positivePanel.add(strengthDisplay);
		
		JTextArea txtrDesigning = new JTextArea();
		txtrDesigning.setEditable(false);
		txtrDesigning.setText("- Designing\r\n\r\n- Creative\r\n\r\n- Able to find alternative ideas to\r\n solve problems\r\n\r\n- Documentation\r\n\r\n- Logic\r\n\r\n- Mathematics");
		txtrDesigning.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		txtrDesigning.setBackground(new Color(220, 220, 220));
		txtrDesigning.setBounds(10, 10, 360, 440);
		strengthDisplay.add(txtrDesigning);
		
		JPanel skillsDisplay = new JPanel();
		skillsDisplay.setLayout(null);
		skillsDisplay.setBackground(new Color(220, 220, 220));
		skillsDisplay.setBounds(430, 82, 380, 460);
		positivePanel.add(skillsDisplay);
		
		JTextArea txtrPhotoshop = new JTextArea();
		txtrPhotoshop.setEditable(false);
		txtrPhotoshop.setText("- Photoshop\r\n\r\n- Digital Art\r\n\r\n- Traditional Art\r\n\r\n- Logo and Posrter Making\r\n\r\n- Video Editing");
		txtrPhotoshop.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		txtrPhotoshop.setBackground(new Color(220, 220, 220));
		txtrPhotoshop.setBounds(10, 10, 360, 440);
		skillsDisplay.add(txtrPhotoshop);
		
		achievePanel = new JPanel();
		achievementsPanel.addMouseListener(new PanelMouseAdapter(achievementsPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				//calling out the menuClicked() method
				menuClicked(achievePanel);
			}
		});
		achievePanel.setBackground(new Color(220, 220, 220));
		achievePanel.setBounds(0, 0, 820, 553);
		displayPanel.add(achievePanel);
		achievePanel.setLayout(null);
		
		JLabel scholarImg = new JLabel("");
		scholarImg.setIcon(new ImageIcon(AboutTab.class.getResource("/Robe/images/MicrosoftTeams-image (1).png")));
		scholarImg.setHorizontalAlignment(SwingConstants.CENTER);
		scholarImg.setBounds(250, 90, 310, 240);
		achievePanel.add(scholarImg);
		
		JLabel achievementsTitle = new JLabel("ACHIEVEMENTS");
		achievementsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		achievementsTitle.setForeground(new Color(44, 26, 210));
		achievementsTitle.setFont(new Font("Verdana", Font.BOLD, 36));
		achievementsTitle.setBackground(new Color(220, 220, 220));
		achievementsTitle.setBounds(230, 10, 350, 60);
		achievePanel.add(achievementsTitle);
		
		JTextArea achieveTxt = new JTextArea();
		achieveTxt.setEditable(false);
		achieveTxt.setText("Aside from my achievements in dancing and art career, another thing I consider as one\r\nof my achievements are being accepted as a full scholar by SM Foundation. I will cherish\r\nthis achievement in my lifetime thus, I always do my best in academics. With that being\r\nsaid, I want to humbly include another small achievement which is I got consistent 4.0\r\ngrade in programming related subjects.");
		achieveTxt.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		achieveTxt.setBackground(new Color(220, 220, 220));
		achieveTxt.setBounds(120, 340, 600, 200);
		achievePanel.add(achieveTxt);
		
		hobbiesPanel = new JPanel();
		talentsPanel.addMouseListener(new PanelMouseAdapter(talentsPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				//calling out the menuClicked() method
				menuClicked(hobbiesPanel);
			}
		});
		hobbiesPanel.setBackground(new Color(220, 220, 220));
		hobbiesPanel.setBounds(0, 0, 820, 553);
		displayPanel.add(hobbiesPanel);
		hobbiesPanel.setLayout(null);
		
		JPanel talentsHeaderPanel = new JPanel();
		talentsHeaderPanel.setBackground(new Color(220, 220, 220));
		talentsHeaderPanel.setBounds(10, 10, 800, 60);
		hobbiesPanel.add(talentsHeaderPanel);
		talentsHeaderPanel.setLayout(null);
		
		JLabel hdrLbl = new JLabel("Talents and Hobbies");
		hdrLbl.setForeground(new Color(18, 18, 167));
		hdrLbl.setFont(new Font("Verdana", Font.BOLD, 36));
		hdrLbl.setHorizontalAlignment(SwingConstants.CENTER);
		hdrLbl.setBounds(200, 0, 450, 60);
		talentsHeaderPanel.add(hdrLbl);
		
		JLabel danceImg = new JLabel("");
		danceImg.setIcon(new ImageIcon(AboutTab.class.getResource("/Robe/images/MicrosoftTeams-image.png")));
		danceImg.setBounds(10, 80, 300, 200);
		hobbiesPanel.add(danceImg);
		
		JTextArea danceText = new JTextArea();
		danceText.setEditable(false);
		danceText.setText("Ever since elementary, I found joy and and love for dancing. It became \r\nmy stress releiver. It was a hobby at first but it is now a passion. I started \r\njoining dance team and participate in different dance related activities \r\nsuch as dance classes, workshops, trainings, and competitions. The \r\nimage shown is an international dance competition I recently participated\r\nin (Body Rock Asia 2023) with my team called LightHousePH, residing in \r\nAntipolo City.");
		danceText.setBackground(new Color(220, 220, 220));
		danceText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		danceText.setBounds(320, 80, 490, 200);
		hobbiesPanel.add(danceText);
		
		JLabel dancingImg = new JLabel("");
		dancingImg.setIcon(new ImageIcon(AboutTab.class.getResource("/Robe/images/dancingimg.png")));
		dancingImg.setBounds(600, 330, 210, 210);
		hobbiesPanel.add(dancingImg);
		
		JTextArea artText = new JTextArea();
		artText.setEditable(false);
		artText.setText("My other hobbies consists of art related activities including logo making, poster making,\r\nportraits, and other traditional arts. I started this hobby during lockdown and decided\r\nto improve. I now accept commissions for a friendly price. You can see some samples of\r\nmy work, in the works tab.");
		artText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		artText.setBackground(new Color(220, 220, 220));
		artText.setBounds(10, 340, 580, 200);
		hobbiesPanel.add(artText);
		
		itPanel = new JPanel();
		whyITPanel.addMouseListener(new PanelMouseAdapter(whyITPanel){
			@Override
			public void mouseClicked(MouseEvent e) {
				//calling out the menuClicked() method
				menuClicked(itPanel);
			}
		});
		itPanel.setBackground(new Color(220, 220, 220));
		itPanel.setBounds(0, 0, 820, 553);
		displayPanel.add(itPanel);
		itPanel.setLayout(null);
		
		JTextArea displayText = new JTextArea();
		displayText.setEditable(false);
		displayText.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		displayText.setText("I started to have interest in computers during elementary when my cousins bought a computer for the first time.\r\nI watch them play different games and I immediateley got hooked. Fast forward to senior high school, our school\r\nhad a career orientation where the students have to dress up like the professionals they want to be in the future. \r\nThere was nothing I could think of other than being an IT professional since I consider it my safest choice and it is\r\neasy to dress like an IT professional. Continuing, I took ICT as my senior high school strand to gain basic information\r\nrelated to my prefered college course. After senior high school, my mom saw an FB post about a scholarship that\r\nSM Foundation offers. I applied to the scholarship and fortunately got accepted. They gave me a choice of different\r\nprograms I can take with the scholarship and BSIT is one of the available course. Thats how I became a BSIT - MWA\r\nstudent in National University Manila.");
		displayText.setBackground(new Color(220, 220, 220));
		displayText.setBounds(10, 130, 800, 202);
		itPanel.add(displayText);
		
		JLabel codeLbl = new JLabel("</>");
		codeLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				codeLbl.setForeground(new Color(70, 70, 70));
			}
			public void mouseExited(MouseEvent e) {
				codeLbl.setForeground(new Color(192, 192, 192));
			}
		});
		codeLbl.setForeground(new Color(192, 192, 192));
		codeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		codeLbl.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 70));
		codeLbl.setBounds(620, 400, 133, 90);
		itPanel.add(codeLbl);
		
		JPanel talentsHeaderPanel_1 = new JPanel();
		talentsHeaderPanel_1.setLayout(null);
		talentsHeaderPanel_1.setBackground(new Color(220, 220, 220));
		talentsHeaderPanel_1.setBounds(10, 11, 800, 60);
		itPanel.add(talentsHeaderPanel_1);
		
		JLabel itTitle = new JLabel("Why Information Technology?");
		itTitle.setHorizontalAlignment(SwingConstants.CENTER);
		itTitle.setForeground(new Color(18, 18, 167));
		itTitle.setFont(new Font("Verdana", Font.BOLD, 36));
		itTitle.setBounds(50, 0, 700, 60);
		talentsHeaderPanel_1.add(itTitle);
		
		
	}
		public void menuClicked(JPanel panel) {
		//this method is the one responsible for setting the visibilty of the display panels to hide the other display panels and only show the clicked one
			informationPanel.setVisible(false);
			positivePanel.setVisible(false);
			achievePanel.setVisible(false);
			hobbiesPanel.setVisible(false);
			itPanel.setVisible(false);
		
			panel.setVisible(true);
		}
		
		private class PanelMouseAdapter extends MouseAdapter {
			//this method is the one responsible for the visual effects of the panels
			JPanel panel;
			
			PanelMouseAdapter (JPanel panel) {
				this.panel = panel;
			}
			@Override
			public void mouseEntered (MouseEvent e) {
				panel.setBackground(new Color(240, 240, 240));
				panel.setBorder(null);
			}
			public void mouseExited (MouseEvent e) {
				panel.setBackground(new Color(220, 220, 220));
				panel.setBorder(null);
			}
			public void mousePressed (MouseEvent e) {
				panel.setBackground(new Color(200, 200, 200));
				panel.setBorder(new LineBorder(new Color(0,0,0)));
			}
			public void mouseReleased (MouseEvent e) {
				panel.setBackground(new Color(240, 240, 240));
				panel.setBorder(null);
			}			
		}

}
