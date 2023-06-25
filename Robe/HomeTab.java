package Robe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Integration.Team;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HomeTab extends BaseFrame {

	private JPanel contentPane;
	private boolean integrated;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean integrated) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeTab frame = new HomeTab(true);
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
	   public HomeTab() {
	        super.initialize(); // Invoke the constructor of the base frame
	        this.integrated = false; // Assume it's opened separately by default
	        initialize();
	    }

	    public HomeTab(boolean integrated) {
	        super(true);
	        this.integrated = integrated;
	        super.initialize();
	        initialize();
	    }

	    public void initialize() {
	    setLocationRelativeTo(null);
		JPanel mainPageTextPanel = new JPanel();
		mainPageTextPanel.setOpaque(false);
		mainPageTextPanel.setLayout(null);
		mainPageTextPanel.setForeground(new Color(236, 236, 236));
		mainPageTextPanel.setBorder(null);
		mainPageTextPanel.setBackground(new Color(236, 236, 236));
		mainPageTextPanel.setAutoscrolls(true);
		mainPageTextPanel.setBounds(160, 170, 665, 350);
		getContentPane().add(mainPageTextPanel);
		
		JLabel helloWorld = new JLabel("( \"H e l l o,  w o r l d\" );");
		helloWorld.setVerticalAlignment(SwingConstants.TOP);
		helloWorld.setForeground(Color.BLACK);
		helloWorld.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 14));
		helloWorld.setBounds(10, 20, 150, 20);
		mainPageTextPanel.add(helloWorld);
		
		JLabel NameLbl = new JLabel("ROBE");
		NameLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				NameLbl.setForeground(new Color (0, 0, 0));
			}
			public void mouseExited(MouseEvent e) {
				NameLbl.setForeground(new Color(50, 50, 50));
			}
		});
		NameLbl.setForeground(new Color(50, 50, 50));
		NameLbl.setFont(new Font("Verdana", Font.BOLD, 40));
		NameLbl.setBounds(140, 50, 160, 40);
		mainPageTextPanel.add(NameLbl);
		
		JLabel imLbl = new JLabel("I am");
		imLbl.setVerticalAlignment(SwingConstants.BOTTOM);
		imLbl.setHorizontalAlignment(SwingConstants.CENTER);
		imLbl.setForeground(Color.BLACK);
		imLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		imLbl.setBounds(100, 55, 30, 35);
		mainPageTextPanel.add(imLbl);
		
		JLabel yearCourseLbl = new JLabel("1 S T   Y E A R   B S I T - M W A   S T U D E N T   O F");
		yearCourseLbl.setForeground(Color.BLACK);
		yearCourseLbl.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 22));
		yearCourseLbl.setBounds(60, 100, 520, 35);
		mainPageTextPanel.add(yearCourseLbl);
		
		JLabel nationalLbl = new JLabel("NATIONAL");
		nationalLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nationalLbl.setBounds(5, 145, 500, 70);
			}
			public void mouseExited(MouseEvent e) {
				nationalLbl.setBounds(10, 140, 500, 70);
			}
		});
		nationalLbl.setForeground(new Color(44, 26, 210));
		nationalLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		nationalLbl.setBounds(10, 140, 500, 70);
		mainPageTextPanel.add(nationalLbl);
		
		JLabel nationalShadowLbl = new JLabel("NATIONAL");
		nationalShadowLbl.setForeground(new Color(0, 2, 34));
		nationalShadowLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		nationalShadowLbl.setBounds(0, 150, 500, 70);
		mainPageTextPanel.add(nationalShadowLbl);
		
		JLabel universityLbl = new JLabel("UNIVERSITY");
		universityLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				universityLbl.setBounds(75, 225, 585, 70);
			}
			public void mouseExited(MouseEvent e) {
				universityLbl.setBounds(80, 220, 585, 70);
			}
		});
		universityLbl.setForeground(new Color(218, 207, 1));
		universityLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		universityLbl.setBounds(80, 220, 585, 70);
		mainPageTextPanel.add(universityLbl);
		
		JLabel universityShadowLbl = new JLabel("UNIVERSITY");
		universityShadowLbl.setForeground(new Color(85, 81, 0));
		universityShadowLbl.setFont(new Font("Arial Black", Font.PLAIN, 80));
		universityShadowLbl.setBounds(70, 230, 595, 70);
		mainPageTextPanel.add(universityShadowLbl);
		
		JPanel socialsIconPanel = new JPanel();
		socialsIconPanel.setOpaque(false);
		socialsIconPanel.setLayout(null);
		socialsIconPanel.setBackground(new Color(236, 236, 236));
		socialsIconPanel.setBounds(40, 260, 40, 200);
		getContentPane().add(socialsIconPanel);
		
		JLabel fbIcon = new JLabel("");
		fbIcon.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/facebook (2).png")));
		fbIcon.setHorizontalAlignment(SwingConstants.CENTER);
		fbIcon.setBounds(0, 0, 40, 40);
		socialsIconPanel.add(fbIcon);
		
		JLabel igIcon = new JLabel("");
		igIcon.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/instagram (2).png")));
		igIcon.setHorizontalAlignment(SwingConstants.CENTER);
		igIcon.setBounds(0, 42, 40, 40);
		socialsIconPanel.add(igIcon);
		
		JLabel twitterIcon = new JLabel("");
		twitterIcon.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/twitter (1).png")));
		twitterIcon.setHorizontalAlignment(SwingConstants.CENTER);
		twitterIcon.setBounds(0, 80, 40, 40);
		socialsIconPanel.add(twitterIcon);
		
		JLabel tiktokIcon = new JLabel("");
		tiktokIcon.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/tiktok (1).png")));
		tiktokIcon.setHorizontalAlignment(SwingConstants.CENTER);
		tiktokIcon.setBounds(0, 120, 40, 40);
		socialsIconPanel.add(tiktokIcon);
		
		JLabel gmailIcon = new JLabel("");
		gmailIcon.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/email.png")));
		gmailIcon.setHorizontalAlignment(SwingConstants.CENTER);
		gmailIcon.setBounds(0, 160, 40, 40);
		socialsIconPanel.add(gmailIcon);
		
		JPanel socialNamesPanel = new JPanel();
		socialNamesPanel.setOpaque(false);
		socialNamesPanel.setBounds(80, 260, 143, 200);
		getContentPane().add(socialNamesPanel);
		socialNamesPanel.setLayout(null);
		
		JPanel fbPanel = new JPanel();
		fbPanel.setOpaque(false);
		fbPanel.setLayout(null);
		fbPanel.setBackground(new Color(236, 236, 236));
		fbPanel.setBounds(0, 0, 80, 40);
		socialNamesPanel.add(fbPanel);
		
		JLabel fbLbl = new JLabel("Robe Lasan");
		fbIcon.addMouseListener(new IconMouseAdapter(fbLbl));
		fbLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		fbLbl.setBounds(0, 10, 80, 20);
		fbPanel.add(fbLbl);
		
		JPanel igPanel = new JPanel();
		igPanel.setOpaque(false);
		igPanel.setLayout(null);
		igPanel.setBackground(new Color(236, 236, 236));
		igPanel.setBounds(0, 40, 80, 40);
		socialNamesPanel.add(igPanel);
		
		JLabel igLbl = new JLabel("@jhnrbrtlsn");
		igIcon.addMouseListener(new IconMouseAdapter(igLbl));
		igLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		igLbl.setBounds(0, 10, 80, 20);
		igPanel.add(igLbl);
		
		JPanel twitterPanel = new JPanel();
		twitterPanel.setOpaque(false);
		twitterPanel.setLayout(null);
		twitterPanel.setBackground(new Color(236, 236, 236));
		twitterPanel.setBounds(0, 80, 80, 40);
		socialNamesPanel.add(twitterPanel);
		
		JLabel twitterLbl = new JLabel("@robelasan07");
		twitterIcon.addMouseListener(new IconMouseAdapter(twitterLbl));
		twitterLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		twitterLbl.setBounds(0, 10, 80, 20);
		twitterPanel.add(twitterLbl);
		
		JPanel tiktokPanel = new JPanel();
		tiktokPanel.setOpaque(false);
		tiktokPanel.setLayout(null);
		tiktokPanel.setBackground(new Color(236, 236, 236));
		tiktokPanel.setBounds(0, 120, 80, 40);
		socialNamesPanel.add(tiktokPanel);
		
		JLabel tiktokLbl = new JLabel("@robelasan");
		tiktokIcon.addMouseListener(new IconMouseAdapter(tiktokLbl));
		tiktokLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		tiktokLbl.setBounds(0, 10, 80, 20);
		tiktokPanel.add(tiktokLbl);
		
		JPanel gmailPanel = new JPanel();
		gmailPanel.setOpaque(false);
		gmailPanel.setLayout(null);
		gmailPanel.setBackground(new Color(236, 236, 236));
		gmailPanel.setBounds(0, 160, 140, 40);
		socialNamesPanel.add(gmailPanel);
		
		JLabel gmailLbl = new JLabel("robelasan07@gmail.com");
		gmailIcon.addMouseListener(new IconMouseAdapter(gmailLbl));
		gmailLbl.setFont(new Font("Yu Gothic UI Light", Font.ITALIC, 12));
		gmailLbl.setBounds(0, 10, 130, 20);
		gmailPanel.add(gmailLbl);
		
		JLabel photo = new JLabel("");
		photo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				photo.setBounds(710, 135, 443, 587);
			}
			
			public void mouseExited(MouseEvent e) {
				photo.setBounds(710, 155, 433, 577);
			}
		});
		photo.setBounds(710, 155, 433, 577);
		getContentPane().add(photo);
		photo.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/352283752_3489260031344552_3773089088528222216_n.png")));
		
		JLabel yellowWatercolor = new JLabel("");
		yellowWatercolor.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/yellowSplatter (1).png")));
		yellowWatercolor.setBounds(700, 265, 500, 500);
		getContentPane().add(yellowWatercolor);
		
		JLabel blueWatercolor = new JLabel("");
		blueWatercolor.setBounds(-120, 480, 710, 336);
		getContentPane().add(blueWatercolor);
		blueWatercolor.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/blue watercolor.png")));
		
		if (integrated) {
			JLabel lblNewLabel = new JLabel();
			lblNewLabel.setIcon(new ImageIcon(HomeTab.class.getResource("/Robe/images/back (1) (2).png")));

			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					setVisible(false);
					new Team().main(null);
					HomeTab.this.dispose();
				}
			});
			lblNewLabel.setBounds(40, 36, 47, 51);
			getContentPane().add(lblNewLabel);
			
			}
	    }
	public class IconMouseAdapter extends MouseAdapter {
		//this method is responsible for showing and hiding the account handles upon entering and exiting the social media icons 
		JLabel label;
		public IconMouseAdapter(JLabel label) {
			this.label = label;
			label.setVisible(false);
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			label.setVisible(true);
		}
		public void mouseExited(MouseEvent e) {
			label.setVisible(false);
		}
	}
}
