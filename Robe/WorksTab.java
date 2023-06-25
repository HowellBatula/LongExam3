package Robe;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Integration.Team;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class WorksTab extends BaseFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorksTab frame = new WorksTab(integrated);
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
	public WorksTab() {
        super.initialize(); // Invoke the constructor of the base frame
        initialize();
    }

    public WorksTab(boolean integrated) {
    	super(true);
        this.integrated = integrated;
        super.initialize();
        initialize();
    }
	public void initialize() {
		
		getContentPane().setBackground(new Color(236, 236, 236));
		getContentPane().setLayout(null);
		
		JPanel worksPanel = new JPanel();
		//this panel holds all of the Robe/images
		worksPanel.setBounds(260, 110, 700, 430);
		getContentPane().add(worksPanel);
		worksPanel.setLayout(null);
		
		JLabel javafx = new JLabel("");
		//1st image
		javafx.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/javafxFinal.png")));
		javafx.setHorizontalAlignment(SwingConstants.CENTER);
		javafx.setBackground(new Color(236, 236, 236));
		javafx.setBounds(0, 0, 700, 430);
		worksPanel.add(javafx);
		
		JLabel photoManipulation = new JLabel("");
		//2nd image
		photoManipulation.setHorizontalTextPosition(SwingConstants.CENTER);
		photoManipulation.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/PHOTO MANIPULATION - LASAN.jpg")));
		photoManipulation.setHorizontalAlignment(SwingConstants.CENTER);
		photoManipulation.setBackground(new Color(236, 236, 236));
		photoManipulation.setBounds(0, 0, 700, 430);
		photoManipulation.setVisible(false);
		worksPanel.add(photoManipulation);
		
		JLabel chickenLogo = new JLabel("");
		//3rd image
		chickenLogo.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/chickenLogo (1).jpg")));
		chickenLogo.setHorizontalAlignment(SwingConstants.CENTER);
		chickenLogo.setBackground(new Color(236, 236, 236));
		chickenLogo.setBounds(0, 0, 700, 430);
		chickenLogo.setVisible(false);
		worksPanel.add(chickenLogo);
		
		JLabel girlGamerLogo = new JLabel("");
		//4th image
		girlGamerLogo.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/girlgamerLogo (1).jpg")));
		girlGamerLogo.setHorizontalAlignment(SwingConstants.CENTER);
		girlGamerLogo.setBackground(new Color(236, 236, 236));
		girlGamerLogo.setBounds(0, 0, 700, 430);
		girlGamerLogo.setVisible(false);
		worksPanel.add(girlGamerLogo);
		
		JLabel drawingRAM = new JLabel("");
		//5th image
		drawingRAM.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/drawingRAM (1).jpg")));
		drawingRAM.setBackground(new Color(236, 236, 236));
		drawingRAM.setHorizontalAlignment(SwingConstants.CENTER);
		drawingRAM.setBounds(0, 0, 700, 430);
		drawingRAM.setVisible(false);
		worksPanel.add(drawingRAM);
		
		JLabel drawingHDD = new JLabel("");
		//6th image
		drawingHDD.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/digitalHDD (1).jpg")));
		drawingHDD.setHorizontalAlignment(SwingConstants.CENTER);
		drawingHDD.setBackground(new Color(236, 236, 236));
		drawingHDD.setBounds(0, 0, 700, 430);
		drawingHDD.setVisible(false);
		worksPanel.add(drawingHDD);
		
		JLabel businessCardLogo = new JLabel("");
		//7th image
		businessCardLogo.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/business card (1).png")));
		businessCardLogo.setBackground(new Color(236, 236, 236));
		businessCardLogo.setHorizontalAlignment(SwingConstants.CENTER);
		businessCardLogo.setBounds(0, 0, 700, 430);
		businessCardLogo.setVisible(false);
		worksPanel.add(businessCardLogo);
		
		JLabel digitalArt = new JLabel("");
		//8th image
		digitalArt.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/digitalArt1 (1).jpg")));
		digitalArt.setBackground(new Color(236, 236, 236));
		digitalArt.setHorizontalAlignment(SwingConstants.CENTER);
		digitalArt.setBounds(0, 0, 700, 430);
		digitalArt.setVisible(false);
		worksPanel.add(digitalArt);
		
		JLabel digitalSelfPortrait = new JLabel("");
		//9th image
		digitalSelfPortrait.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/digitalSelfPortrait (1).jpg")));
		digitalSelfPortrait.setBackground(new Color(236, 236, 236));
		digitalSelfPortrait.setHorizontalAlignment(SwingConstants.CENTER);
		digitalSelfPortrait.setBounds(0, 0, 700, 430);
		digitalSelfPortrait.setVisible(false);
		worksPanel.add(digitalSelfPortrait);
		
		JLabel digitalAstro = new JLabel("");
		//10th image
		digitalAstro.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/digitalAstro (1).jpg")));
		digitalAstro.setHorizontalAlignment(SwingConstants.CENTER);
		digitalAstro.setBackground(new Color(236, 236, 236));
		digitalAstro.setBounds(0, 0, 700, 430);
		digitalAstro.setVisible(false);
		worksPanel.add(digitalAstro);
		
		JLabel portraitMom = new JLabel("");
		//11th image
		portraitMom.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/portraitMom (1).jpg")));
		portraitMom.setHorizontalAlignment(SwingConstants.CENTER);
		portraitMom.setBackground(new Color(236, 236, 236));
		portraitMom.setBounds(0, 0, 700, 430);
		portraitMom.setVisible(false);
		worksPanel.add(portraitMom);
		
		JLabel portraitChaeyoung = new JLabel("");
		//12th image
		portraitChaeyoung.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/portraitChaeyoung (1).jpg")));
		portraitChaeyoung.setHorizontalAlignment(SwingConstants.CENTER);
		portraitChaeyoung.setBackground(new Color(236, 236, 236));
		portraitChaeyoung.setBounds(0, 0, 700, 430);
		portraitChaeyoung.setVisible(false);
		worksPanel.add(portraitChaeyoung);
		
		JLabel portraitFriend = new JLabel("");
		//13th image
		portraitFriend.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/portraitFriend (1).jpg")));
		portraitFriend.setHorizontalAlignment(SwingConstants.CENTER);
		portraitFriend.setBackground(new Color(236, 236, 236));
		portraitFriend.setBounds(0, 0, 700, 430);
		portraitFriend.setVisible(false);
		worksPanel.add(portraitFriend);
		
		JPanel jfxButtonPanel = new JPanel();
		jfxButtonPanel.setOpaque(false);
		jfxButtonPanel.setBackground(new Color(236, 236, 236));
		jfxButtonPanel.setBounds(360, 600, 495, 40);
		getContentPane().add(jfxButtonPanel);
		jfxButtonPanel.setLayout(null);
		
		JLabel toPM = new JLabel("Next");
		toPM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toPM.addMouseListener(new ButtonsMouseAdapter(toPM));
		toPM.setBorder(new LineBorder(new Color(0, 0, 0)));
		toPM.setBackground(new Color(236, 236, 236));
		toPM.setHorizontalAlignment(SwingConstants.CENTER);
		toPM.setHorizontalTextPosition(SwingConstants.CENTER);
		toPM.setBounds(300, 0, 115, 40);
		jfxButtonPanel.add(toPM);
		
		JLabel backtoFRIEND = new JLabel("Back");
		backtoFRIEND.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoFRIEND.addMouseListener(new ButtonsMouseAdapter(backtoFRIEND));
		backtoFRIEND.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoFRIEND.setBackground(new Color(236, 236, 236));
		backtoFRIEND.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoFRIEND.setHorizontalAlignment(SwingConstants.CENTER);
		backtoFRIEND.setBounds(100, 0, 115, 40);
		jfxButtonPanel.add(backtoFRIEND);
		
		JPanel pmButtonPanel = new JPanel();
		pmButtonPanel.setOpaque(false);
		pmButtonPanel.setLayout(null);
		pmButtonPanel.setBackground(new Color(236, 236, 236));
		pmButtonPanel.setBounds(360, 600, 495, 40);
		pmButtonPanel.setVisible(false);
		getContentPane().add(pmButtonPanel);
		
		JLabel toCHL = new JLabel("Next");
		toCHL.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toCHL.addMouseListener(new ButtonsMouseAdapter(toCHL));
		toCHL.setHorizontalTextPosition(SwingConstants.CENTER);
		toCHL.setHorizontalAlignment(SwingConstants.CENTER);
		toCHL.setBorder(new LineBorder(new Color(0, 0, 0)));
		toCHL.setBackground(new Color(236, 236, 236));
		toCHL.setBounds(300, 0, 115, 40);
		pmButtonPanel.add(toCHL);
		
		JLabel backtoJFX = new JLabel("Back");
		backtoJFX.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoJFX.addMouseListener(new ButtonsMouseAdapter(backtoJFX));
		backtoJFX.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoJFX.setHorizontalAlignment(SwingConstants.CENTER);
		backtoJFX.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoJFX.setBackground(new Color(236, 236, 236));
		backtoJFX.setBounds(100, 0, 115, 40);
		pmButtonPanel.add(backtoJFX);
		
		JPanel chlButtonPanel = new JPanel();
		chlButtonPanel.setOpaque(false);
		chlButtonPanel.setLayout(null);
		chlButtonPanel.setBackground(new Color(236, 236, 236));
		chlButtonPanel.setBounds(360, 600, 495, 40);
		chlButtonPanel.setVisible(false);
		getContentPane().add(chlButtonPanel);
		
		JLabel toGG = new JLabel("Next");
		toGG.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toGG.addMouseListener(new ButtonsMouseAdapter(toGG));
		toGG.setHorizontalTextPosition(SwingConstants.CENTER);
		toGG.setHorizontalAlignment(SwingConstants.CENTER);
		toGG.setBorder(new LineBorder(new Color(0, 0, 0)));
		toGG.setBackground(new Color(236, 236, 236));
		toGG.setBounds(300, 0, 115, 40);
		chlButtonPanel.add(toGG);
		
		JLabel backtoPM = new JLabel("Back");
		backtoPM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoPM.addMouseListener(new ButtonsMouseAdapter(backtoPM));
		backtoPM.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoPM.setHorizontalAlignment(SwingConstants.CENTER);
		backtoPM.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoPM.setBackground(new Color(236, 236, 236));
		backtoPM.setBounds(100, 0, 115, 40);
		chlButtonPanel.add(backtoPM);
		
		JPanel ggButtonPanel = new JPanel();
		ggButtonPanel.setOpaque(false);
		ggButtonPanel.setLayout(null);
		ggButtonPanel.setBackground(new Color(236, 236, 236));
		ggButtonPanel.setBounds(360, 600, 495, 40);
		ggButtonPanel.setVisible(false);
		getContentPane().add(ggButtonPanel);
		
		JLabel toRAM = new JLabel("Next");
		toRAM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toRAM.addMouseListener(new ButtonsMouseAdapter(toRAM));
		toRAM.setHorizontalTextPosition(SwingConstants.CENTER);
		toRAM.setHorizontalAlignment(SwingConstants.CENTER);
		toRAM.setBorder(new LineBorder(new Color(0, 0, 0)));
		toRAM.setBackground(new Color(236, 236, 236));
		toRAM.setBounds(300, 0, 115, 40);
		ggButtonPanel.add(toRAM);
		
		JLabel backtoCHL = new JLabel("Back");
		backtoCHL.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoCHL.addMouseListener(new ButtonsMouseAdapter(backtoCHL));
		backtoCHL.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoCHL.setHorizontalAlignment(SwingConstants.CENTER);
		backtoCHL.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoCHL.setBackground(new Color(236, 236, 236));
		backtoCHL.setBounds(100, 0, 115, 40);
		ggButtonPanel.add(backtoCHL);
		
		JPanel ramButtonPanel = new JPanel();
		ramButtonPanel.setOpaque(false);
		ramButtonPanel.setLayout(null);
		ramButtonPanel.setBackground(new Color(236, 236, 236));
		ramButtonPanel.setBounds(360, 600, 495, 40);
		ramButtonPanel.setVisible(false);
		getContentPane().add(ramButtonPanel);
		
		JLabel toHDD = new JLabel("Next");
		toHDD.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toHDD.addMouseListener(new ButtonsMouseAdapter(toHDD));
		toHDD.setHorizontalTextPosition(SwingConstants.CENTER);
		toHDD.setHorizontalAlignment(SwingConstants.CENTER);
		toHDD.setBorder(new LineBorder(new Color(0, 0, 0)));
		toHDD.setBackground(new Color(236, 236, 236));
		toHDD.setBounds(300, 0, 115, 40);
		ramButtonPanel.add(toHDD);
		
		JLabel backtoGG = new JLabel("Back");
		backtoGG.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoGG.addMouseListener(new ButtonsMouseAdapter(backtoGG));
		backtoGG.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoGG.setHorizontalAlignment(SwingConstants.CENTER);
		backtoGG.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoGG.setBackground(new Color(236, 236, 236));
		backtoGG.setBounds(100, 0, 115, 40);
		ramButtonPanel.add(backtoGG);
		
		JPanel hddButtonPanel = new JPanel();
		hddButtonPanel.setOpaque(false);
		hddButtonPanel.setLayout(null);
		hddButtonPanel.setBackground(new Color(236, 236, 236));
		hddButtonPanel.setBounds(360, 600, 495, 40);
		hddButtonPanel.setVisible(false);
		getContentPane().add(hddButtonPanel);
		
		JLabel toBC = new JLabel("Next");
		toBC.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toBC.addMouseListener(new ButtonsMouseAdapter(toBC));
		toBC.setHorizontalTextPosition(SwingConstants.CENTER);
		toBC.setHorizontalAlignment(SwingConstants.CENTER);
		toBC.setBorder(new LineBorder(new Color(0, 0, 0)));
		toBC.setBackground(new Color(236, 236, 236));
		toBC.setBounds(300, 0, 115, 40);
		hddButtonPanel.add(toBC);
		
		JLabel backtoRAM = new JLabel("Back");
		backtoRAM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoRAM.addMouseListener(new ButtonsMouseAdapter(backtoRAM));
		backtoRAM.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoRAM.setHorizontalAlignment(SwingConstants.CENTER);
		backtoRAM.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoRAM.setBackground(new Color(236, 236, 236));
		backtoRAM.setBounds(100, 0, 115, 40);
		hddButtonPanel.add(backtoRAM);
		
		JPanel bcButtonPanel = new JPanel();
		bcButtonPanel.setOpaque(false);
		bcButtonPanel.setLayout(null);
		bcButtonPanel.setBackground(new Color(236, 236, 236));
		bcButtonPanel.setBounds(360, 600, 495, 40);
		bcButtonPanel.setVisible(false);
		getContentPane().add(bcButtonPanel);
		
		JLabel toDA = new JLabel("Next");
		toDA.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toDA.addMouseListener(new ButtonsMouseAdapter(toDA));
		toDA.setHorizontalTextPosition(SwingConstants.CENTER);
		toDA.setHorizontalAlignment(SwingConstants.CENTER);
		toDA.setBorder(new LineBorder(new Color(0, 0, 0)));
		toDA.setBackground(new Color(236, 236, 236));
		toDA.setBounds(300, 0, 115, 40);
		bcButtonPanel.add(toDA);
		
		JLabel backtoHDD = new JLabel("Back");
		backtoHDD.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoHDD.addMouseListener(new ButtonsMouseAdapter(backtoHDD));
		backtoHDD.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoHDD.setHorizontalAlignment(SwingConstants.CENTER);
		backtoHDD.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoHDD.setBackground(new Color(236, 236, 236));
		backtoHDD.setBounds(100, 0, 115, 40);
		bcButtonPanel.add(backtoHDD);
		
		JPanel daButtonPanel = new JPanel();
		daButtonPanel.setOpaque(false);
		daButtonPanel.setLayout(null);
		daButtonPanel.setBackground(new Color(236, 236, 236));
		daButtonPanel.setBounds(360, 600, 495, 40);
		daButtonPanel.setVisible(false);
		getContentPane().add(daButtonPanel);
		
		JLabel toSP = new JLabel("Next");
		toSP.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toSP.addMouseListener(new ButtonsMouseAdapter(toSP));
		toSP.setHorizontalTextPosition(SwingConstants.CENTER);
		toSP.setHorizontalAlignment(SwingConstants.CENTER);
		toSP.setBorder(new LineBorder(new Color(0, 0, 0)));
		toSP.setBackground(new Color(236, 236, 236));
		toSP.setBounds(300, 0, 115, 40);
		daButtonPanel.add(toSP);
		
		JLabel backtoBC = new JLabel("Back");
		backtoBC.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoBC.addMouseListener(new ButtonsMouseAdapter(backtoBC));
		backtoBC.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoBC.setHorizontalAlignment(SwingConstants.CENTER);
		backtoBC.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoBC.setBackground(new Color(236, 236, 236));
		backtoBC.setBounds(100, 0, 115, 40);
		daButtonPanel.add(backtoBC);
		
		JPanel spButtonPanel = new JPanel();
		spButtonPanel.setOpaque(false);
		spButtonPanel.setLayout(null);
		spButtonPanel.setBackground(new Color(236, 236, 236));
		spButtonPanel.setBounds(360, 600, 495, 40);
		spButtonPanel.setVisible(false);
		getContentPane().add(spButtonPanel);
		
		JLabel toASTRO = new JLabel("Next");
		toASTRO.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toASTRO.addMouseListener(new ButtonsMouseAdapter(toASTRO));
		toASTRO.setHorizontalTextPosition(SwingConstants.CENTER);
		toASTRO.setHorizontalAlignment(SwingConstants.CENTER);
		toASTRO.setBorder(new LineBorder(new Color(0, 0, 0)));
		toASTRO.setBackground(new Color(236, 236, 236));
		toASTRO.setBounds(300, 0, 115, 40);
		spButtonPanel.add(toASTRO);
		
		JLabel backtoDA = new JLabel("Back");
		backtoDA.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoDA.addMouseListener(new ButtonsMouseAdapter(backtoDA));
		backtoDA.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoDA.setHorizontalAlignment(SwingConstants.CENTER);
		backtoDA.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoDA.setBackground(new Color(236, 236, 236));
		backtoDA.setBounds(100, 0, 115, 40);
		spButtonPanel.add(backtoDA);
		
		JPanel astroButtonPanel = new JPanel();
		astroButtonPanel.setOpaque(false);
		astroButtonPanel.setLayout(null);
		astroButtonPanel.setBackground(new Color(236, 236, 236));
		astroButtonPanel.setBounds(360, 600, 495, 40);
		astroButtonPanel.setVisible(false);
		getContentPane().add(astroButtonPanel);
		
		JLabel toMOM = new JLabel("Next");
		toMOM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toMOM.addMouseListener(new ButtonsMouseAdapter(toMOM));
		toMOM.setHorizontalTextPosition(SwingConstants.CENTER);
		toMOM.setHorizontalAlignment(SwingConstants.CENTER);
		toMOM.setBorder(new LineBorder(new Color(0, 0, 0)));
		toMOM.setBackground(new Color(236, 236, 236));
		toMOM.setBounds(300, 0, 115, 40);
		astroButtonPanel.add(toMOM);
		
		JLabel backtoSP = new JLabel("Back");
		backtoSP.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoSP.addMouseListener(new ButtonsMouseAdapter(backtoSP));
		backtoSP.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoSP.setHorizontalAlignment(SwingConstants.CENTER);
		backtoSP.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoSP.setBackground(new Color(236, 236, 236));
		backtoSP.setBounds(100, 0, 115, 40);
		astroButtonPanel.add(backtoSP);
		
		JPanel momButtonPanel = new JPanel();
		momButtonPanel.setOpaque(false);
		momButtonPanel.setLayout(null);
		momButtonPanel.setBackground(new Color(236, 236, 236));
		momButtonPanel.setBounds(360, 600, 495, 40);
		momButtonPanel.setVisible(false);
		getContentPane().add(momButtonPanel);
		
		JLabel toCHAE = new JLabel("Next");
		toCHAE.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toCHAE.addMouseListener(new ButtonsMouseAdapter(toCHAE));
		toCHAE.setHorizontalTextPosition(SwingConstants.CENTER);
		toCHAE.setHorizontalAlignment(SwingConstants.CENTER);
		toCHAE.setBorder(new LineBorder(new Color(0, 0, 0)));
		toCHAE.setBackground(new Color(236, 236, 236));
		toCHAE.setBounds(300, 0, 115, 40);
		momButtonPanel.add(toCHAE);
		
		JLabel backtoASTRO = new JLabel("Back");
		backtoASTRO.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoASTRO.addMouseListener(new ButtonsMouseAdapter(backtoASTRO));
		backtoASTRO.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoASTRO.setHorizontalAlignment(SwingConstants.CENTER);
		backtoASTRO.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoASTRO.setBackground(new Color(236, 236, 236));
		backtoASTRO.setBounds(100, 0, 115, 40);
		momButtonPanel.add(backtoASTRO);
		
		JPanel chaeButtonPanel = new JPanel();
		chaeButtonPanel.setOpaque(false);
		chaeButtonPanel.setLayout(null);
		chaeButtonPanel.setBackground(new Color(236, 236, 236));
		chaeButtonPanel.setBounds(360, 600, 495, 40);
		chaeButtonPanel.setVisible(false);
		getContentPane().add(chaeButtonPanel);
		
		JLabel toFRIEND = new JLabel("Next");
		toFRIEND.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toFRIEND.addMouseListener(new ButtonsMouseAdapter(toFRIEND));
		toFRIEND.setHorizontalTextPosition(SwingConstants.CENTER);
		toFRIEND.setHorizontalAlignment(SwingConstants.CENTER);
		toFRIEND.setBorder(new LineBorder(new Color(0, 0, 0)));
		toFRIEND.setBackground(new Color(236, 236, 236));
		toFRIEND.setBounds(300, 0, 115, 40);
		chaeButtonPanel.add(toFRIEND);
		
		JLabel backtoMOM = new JLabel("Back");
		backtoMOM.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoMOM.addMouseListener(new ButtonsMouseAdapter(backtoMOM));
		backtoMOM.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoMOM.setHorizontalAlignment(SwingConstants.CENTER);
		backtoMOM.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoMOM.setBackground(new Color(236, 236, 236));
		backtoMOM.setBounds(100, 0, 115, 40);
		chaeButtonPanel.add(backtoMOM);
		
		JPanel friendButtonPanel = new JPanel();
		friendButtonPanel.setOpaque(false);
		friendButtonPanel.setLayout(null);
		friendButtonPanel.setBackground(new Color(236, 236, 236));
		friendButtonPanel.setBounds(360, 600, 495, 40);
		friendButtonPanel.setVisible(false);
		getContentPane().add(friendButtonPanel);
		
		JLabel toJFX = new JLabel("Next");
		toJFX.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		toJFX.addMouseListener(new ButtonsMouseAdapter(toJFX));
		toJFX.setHorizontalTextPosition(SwingConstants.CENTER);
		toJFX.setHorizontalAlignment(SwingConstants.CENTER);
		toJFX.setBorder(new LineBorder(new Color(0, 0, 0)));
		toJFX.setBackground(new Color(236, 236, 236));
		toJFX.setBounds(300, 0, 115, 40);
		friendButtonPanel.add(toJFX);
		
		JLabel backtoCHAE = new JLabel("Back");
		backtoCHAE.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		backtoCHAE.addMouseListener(new ButtonsMouseAdapter(backtoCHAE));
		backtoCHAE.setHorizontalTextPosition(SwingConstants.CENTER);
		backtoCHAE.setHorizontalAlignment(SwingConstants.CENTER);
		backtoCHAE.setBorder(new LineBorder(new Color(0, 0, 0)));
		backtoCHAE.setBackground(new Color(236, 236, 236));
		backtoCHAE.setBounds(100, 0, 115, 40);
		friendButtonPanel.add(backtoCHAE);
		
		JLabel displayText = new JLabel("Illustration using shapes in javafx (final examination in intermediate programming)");
		displayText.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 11));
		displayText.setHorizontalAlignment(SwingConstants.CENTER);
		displayText.setBackground(new Color(236, 236, 236));
		displayText.setBounds(305, 550, 600, 25);
		getContentPane().add(displayText);
		displayText.setVisible(true);
		
				//javafx is visible
				toPM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						javafx.setVisible(false);
						photoManipulation.setVisible(true);
						jfxButtonPanel.setVisible(false);
						pmButtonPanel.setVisible(true);
						displayText.setText("Photo manipulation using Photoshop (activity during senior high school)");
					}
				});
				backtoFRIEND.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						javafx.setVisible(false);
						portraitFriend.setVisible(true);
						jfxButtonPanel.setVisible(false);
						friendButtonPanel.setVisible(true);
						displayText.setText("Portrait using graphite pencils (birthday gift for a friend, 2020)");
					}
				});
				//photo manipulation is visible
				toCHL.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						photoManipulation.setVisible(false);
						chickenLogo.setVisible(true);
						pmButtonPanel.setVisible(false);
						chlButtonPanel.setVisible(true);
						displayText.setText("Logo making (activity during senior high school)");
					}
				});
				backtoJFX.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						photoManipulation.setVisible(false);
						javafx.setVisible(true);
						pmButtonPanel.setVisible(false);
						jfxButtonPanel.setVisible(true);
						displayText.setText("Illustration using shapes in javafx (final examination in intermediate programming)");
					}
				});
				//chicken logo is visible
				toGG.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						chickenLogo.setVisible(false);
						girlGamerLogo.setVisible(true);
						chlButtonPanel.setVisible(false);
						ggButtonPanel.setVisible(true);
						displayText.setText("Logo making (commissioned by a friend for discord page account)");
					}
				});
				backtoPM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						chickenLogo.setVisible(false);
						photoManipulation.setVisible(true);
						chlButtonPanel.setVisible(false);
						pmButtonPanel.setVisible(true);
						displayText.setText("Photo manipulation using Photoshop (activity during senior high school)");
					}
				});
				//girl gamer logo is visible
				toRAM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						girlGamerLogo.setVisible(false);
						drawingRAM.setVisible(true);
						ggButtonPanel.setVisible(false);
						ramButtonPanel.setVisible(true);
						displayText.setText("Digital art of a RAM (activity during senior high school)");
					}
				});
				backtoCHL.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						girlGamerLogo.setVisible(false);
						chickenLogo.setVisible(true);
						ggButtonPanel.setVisible(false);
						chlButtonPanel.setVisible(true);
						displayText.setText("Logo making (activity during senior high school)");
					}
				});
				//ram is visible
				toHDD.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawingRAM.setVisible(false);
						drawingHDD.setVisible(true);
						ramButtonPanel.setVisible(false);
						hddButtonPanel.setVisible(true);
						displayText.setText("Digital art of an HDD (activity during senior high school)");
					}
				});
				backtoGG.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawingRAM.setVisible(false);
						girlGamerLogo.setVisible(true);
						ramButtonPanel.setVisible(false);
						ggButtonPanel.setVisible(true);
						displayText.setText("Logo making (commissioned by a friend for discord page account)");
					}
				});
				
				//hdd is visible
				toBC.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawingHDD.setVisible(false);
						businessCardLogo.setVisible(true);
						hddButtonPanel.setVisible(false);
						bcButtonPanel.setVisible(true);
						displayText.setText("Digital art of a business card (activity during senior high school)");
					}
				});
				backtoRAM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						drawingHDD.setVisible(false);
						drawingRAM.setVisible(true);
						hddButtonPanel.setVisible(false);
						ramButtonPanel.setVisible(true);
						displayText.setText("Digital art of a RAM (activity during senior high school)");
					}
				});
				
				//business card is visible
				toDA.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						businessCardLogo.setVisible(false);
						digitalArt.setVisible(true);
						bcButtonPanel.setVisible(false);
						daButtonPanel.setVisible(true);
						displayText.setText("Digital art (gift for my girlfriend)");
					}
				});
				backtoHDD.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						businessCardLogo.setVisible(false);
						drawingHDD.setVisible(true);
						bcButtonPanel.setVisible(false);
						hddButtonPanel.setVisible(true);
						displayText.setText("Digital art of an HDD (activity during senior high school)");
					}
				});
				
				//digital art is visible
				toSP.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						digitalArt.setVisible(false);
						digitalSelfPortrait.setVisible(true);
						daButtonPanel.setVisible(false);
						spButtonPanel.setVisible(true);
						displayText.setText("Digital art, self portrait (activity during senior high school)");
					}
				});
				backtoBC.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						digitalArt.setVisible(false);
						businessCardLogo.setVisible(true);
						daButtonPanel.setVisible(false);
						bcButtonPanel.setVisible(true);
						displayText.setText("Digital art of a business card (activity during senior high school)");
					}
				});
				
				//self portrait is visible
				toASTRO.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						digitalSelfPortrait.setVisible(false);
						digitalAstro.setVisible(true);
						spButtonPanel.setVisible(false);
						astroButtonPanel.setVisible(true);
						displayText.setText("Digital art of an astronaut holding balloons that look like planets (2020)");
					}
				});
				backtoDA.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						digitalSelfPortrait.setVisible(false);
						digitalArt.setVisible(true);
						spButtonPanel.setVisible(false);
						daButtonPanel.setVisible(true);
						displayText.setText("Digital art (gift for my girlfriend)");
					}
				});
				
				//astro is visible
				toMOM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						digitalAstro.setVisible(false);
						portraitMom.setVisible(true);
						astroButtonPanel.setVisible(false);
						momButtonPanel.setVisible(true);
						displayText.setText("Portrait using graphite pencils (birthday gift for my mom, 2020)");
					}
				});
				backtoSP.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						digitalAstro.setVisible(false);
						digitalSelfPortrait.setVisible(true);
						astroButtonPanel.setVisible(false);
						spButtonPanel.setVisible(true);
						displayText.setText("Digital art, self portrait (activity during senior high school)");
					}
				});
				
				//portrait mom is visible
				toCHAE.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						portraitMom.setVisible(false);
						portraitChaeyoung.setVisible(true);
						momButtonPanel.setVisible(false);
						chaeButtonPanel.setVisible(true);
						displayText.setText("Portrait using graphite pencils (2020)");
					}
				});
				backtoASTRO.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						portraitMom.setVisible(false);
						digitalAstro.setVisible(true);
						momButtonPanel.setVisible(false);
						astroButtonPanel.setVisible(true);
						displayText.setText("Digital art of an astronaut holding balloons that look like planets (2020)");
					}
				});
				
				//portrait chaeyoung is visible
				toFRIEND.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						portraitChaeyoung.setVisible(false);
						portraitFriend.setVisible(true);
						chaeButtonPanel.setVisible(false);
						friendButtonPanel.setVisible(true);
						displayText.setText("Portrait using graphite pencils (birthday gift for a friend)");
					}
				});
				backtoMOM.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						portraitChaeyoung.setVisible(false);
						portraitMom.setVisible(true);
						chaeButtonPanel.setVisible(false);
						momButtonPanel.setVisible(true);
						displayText.setText("Portrait using graphite pencils (birthday gift for my mom)");
					}
				});
				
				//portrait friend is visible
				toJFX.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						portraitFriend.setVisible(false);
						javafx.setVisible(true);
						friendButtonPanel.setVisible(false);
						jfxButtonPanel.setVisible(true);
						displayText.setText("Illustration using shapes in javafx (final examination in intermediate programming)");
					}
				});
				backtoCHAE.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						portraitFriend.setVisible(false);
						portraitChaeyoung.setVisible(true);
						friendButtonPanel.setVisible(false);
						chaeButtonPanel.setVisible(true);
						displayText.setText("Portrait using graphite pencils (fan art, 2020)");
					}
				});
				
				JLabel blueWatercolor = new JLabel("");
				blueWatercolor.setIcon(new ImageIcon(WorksTab.class.getResource("/Robe/images/blue watercolor.png")));
				blueWatercolor.setBackground(new Color(236, 236, 236));
				blueWatercolor.setBounds(-120, 420, 710, 336);
				getContentPane().add(blueWatercolor);
				
				JPanel headerPanel = new JPanel();
				headerPanel.setLayout(null);
				headerPanel.setBackground(new Color(236, 236, 236));
				headerPanel.setBounds(0, 50, 1200, 65);
				getContentPane().add(headerPanel);
				
				JLabel lblWorks = new JLabel("WORKS");
				lblWorks.setHorizontalAlignment(SwingConstants.CENTER);
				lblWorks.setFont(new Font("Times New Roman", Font.BOLD, 28));
				lblWorks.setBackground(new Color(236, 236, 236));
				lblWorks.setBounds(425, 0, 361, 65);
				headerPanel.add(lblWorks);
				
				
		
	}
	
		private class ButtonsMouseAdapter extends MouseAdapter{
			//this methos is the one responsible for the visual effects of the next and back button
			JLabel label;
			public ButtonsMouseAdapter(JLabel label) {
				this.label = label;
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(new Color(0, 0, 0));
				label.setBorder(new LineBorder(new Color(44, 26, 210)));
				label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			}
			public void mousePressed(MouseEvent e) {
				label.setForeground(new Color(218, 207, 1));
				label.setBorder(new LineBorder(new Color(218, 207, 1)));
				label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
			}
			public void mouseExited(MouseEvent e) {
				label.setForeground(new Color(0, 0, 0));
				label.setBorder(new LineBorder(new Color(0, 0, 0)));
				label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
			}
			public void mouseReleased(MouseEvent e) {
				label.setForeground(new Color(0, 0, 0));
				label.setBorder(new LineBorder(new Color(44, 26, 210)));
				label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			}
		}

}
