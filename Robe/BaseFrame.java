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

public class BaseFrame extends JFrame {

	private JPanel contentPane;
	public boolean integrated;

	/**
	 * Launch the application.
	 */
	public static void main(boolean integrated) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseFrame frame = new BaseFrame(integrated);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public BaseFrame() {
		initialize();
	}
	public BaseFrame(boolean integrated) {
		this.integrated = integrated;
        initialize();
	}
	
	public void initialize() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tabsPanel = new JPanel();
		tabsPanel.setOpaque(false);
		tabsPanel.setLayout(null);
		tabsPanel.setBackground(new Color(236, 236, 236));
		tabsPanel.setBounds(450, 0, 320, 80);
		contentPane.add(tabsPanel);
		
		JPanel homeTabPanel = new JPanel();
		homeTabPanel.setLayout(null);
		homeTabPanel.setBackground(new Color(236, 236, 236));
		homeTabPanel.setBounds(10, 20, 100, 30);
		tabsPanel.add(homeTabPanel);
		
		JLabel homeTabLbl = new JLabel("HOME");
		homeTabPanel.addMouseListener(new TabsButtonMouseAdapter(homeTabPanel,homeTabLbl) {
			@Override
			public void mouseClicked(MouseEvent e) {
				//this action closes the BaseFrame and show the HomeTab
				BaseFrame.this.dispose();
				HomeTab home = new HomeTab(true);
				home.setVisible(true);
			}
		});
		homeTabLbl.setHorizontalAlignment(SwingConstants.CENTER);
		homeTabLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		homeTabLbl.setBounds(20, 0, 60, 30);
		homeTabPanel.add(homeTabLbl);
		
		JPanel aboutTabPanel = new JPanel();
		aboutTabPanel.setLayout(null);
		aboutTabPanel.setBackground(new Color(236, 236, 236));
		aboutTabPanel.setBounds(110, 20, 100, 30);
		tabsPanel.add(aboutTabPanel);
		
		JLabel aboutTabLbl = new JLabel("ABOUT");
		aboutTabPanel.addMouseListener(new TabsButtonMouseAdapter(aboutTabPanel,aboutTabLbl) {
			@Override
			public void mouseClicked(MouseEvent e) {
				//this action closes the BaseFrame and show the AboutTab
				BaseFrame.this.dispose();
				AboutTab about = new AboutTab(true);
				about.setVisible(true);
			}
		});
		aboutTabLbl.setHorizontalAlignment(SwingConstants.CENTER);
		aboutTabLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		aboutTabLbl.setBounds(20, 0, 60, 30);
		aboutTabPanel.add(aboutTabLbl);
		
		JPanel portfolioTabPanel = new JPanel();
		portfolioTabPanel.setLayout(null);
		portfolioTabPanel.setBackground(new Color(236, 236, 236));
		portfolioTabPanel.setBounds(210, 20, 100, 30);
		tabsPanel.add(portfolioTabPanel);
		
		JLabel portfolioTabLbl = new JLabel("WORKS");
		portfolioTabPanel.addMouseListener(new TabsButtonMouseAdapter(portfolioTabPanel,portfolioTabLbl) {
			@Override
			public void mouseClicked(MouseEvent e) {
				//this action closes the BaseFrame and show the WorksTab
				BaseFrame.this.dispose();
				WorksTab works = new WorksTab(true);
				works.setVisible(true);
			}
		});
		portfolioTabLbl.setHorizontalAlignment(SwingConstants.CENTER);
		portfolioTabLbl.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		portfolioTabLbl.setBounds(20, 0, 60, 30);
		portfolioTabPanel.add(portfolioTabLbl);
		
		JLabel watercolor = new JLabel("");
		watercolor.setIcon(new ImageIcon(BaseFrame.class.getResource("/Robe/images/watercolor background (2).png")));
		watercolor.setBounds(-342, -93, 720, 336);
		contentPane.add(watercolor);
		
		JLabel cornerDesgin = new JLabel("");
		cornerDesgin.setIcon(new ImageIcon(BaseFrame.class.getResource("/Robe/images/Rasd (1).png")));
		cornerDesgin.setBackground(new Color(236, 236, 236));
		cornerDesgin.setBounds(950, 5, 250, 225);
		contentPane.add(cornerDesgin);
		
		JPanel exitPanel = new JPanel();
		exitPanel.setLayout(null);
		exitPanel.setBackground(new Color(236, 236, 236));
		exitPanel.setBounds(1160, 0, 40, 40);
		contentPane.add(exitPanel);
		
		JLabel exitLbl = new JLabel("X");
		exitLbl.setHorizontalAlignment(SwingConstants.CENTER);
		exitLbl.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		exitLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BaseFrame.this.dispose();		
			}
			public void mouseEntered(MouseEvent e) {
				exitLbl.setForeground(new Color (0, 0, 0));
				exitPanel.setBackground(new Color(200, 200, 200));
			}
			public void mouseExited(MouseEvent e) {
				exitLbl.setForeground(new Color (40, 40, 40));
				exitPanel.setBackground(new Color(236, 236, 236));
			}
			
		});
		exitLbl.setBounds(10, 10, 20, 20);
		exitPanel.add(exitLbl);
		
		
		if(integrated) {
			homeTabPanel.addMouseListener(new TabsButtonMouseAdapter(homeTabPanel,homeTabLbl) {
				@Override
				public void mouseClicked(MouseEvent e) {
					//this action closes the BaseFrame and show the HomeTab
					
					HomeTab Home = new HomeTab(true);
					Home.setVisible(true);
					BaseFrame.this.dispose();
				}
			});
			aboutTabPanel.addMouseListener(new TabsButtonMouseAdapter(aboutTabPanel,aboutTabLbl) {
				@Override
				public void mouseClicked(MouseEvent e) {
					//this action closes the BaseFrame and show the AboutTab
					
					AboutTab about = new AboutTab(true);
					about.setVisible(true);
					BaseFrame.this.dispose();
				}
			});
			portfolioTabPanel.addMouseListener(new TabsButtonMouseAdapter(portfolioTabPanel,portfolioTabLbl) {
				@Override
				public void mouseClicked(MouseEvent e) {
					//this action closes the BaseFrame and show the WorksTab
					
					WorksTab works = new WorksTab(true);
					works.setVisible(true);
					BaseFrame.this.dispose();
				}
			});
			
		}
		
	
	}
	
	private class TabsButtonMouseAdapter extends MouseAdapter {
		//this method is the one responsible for the visual effects of the tabs panel (changing colors of foregound and background)
		JPanel panel;
		JLabel label;
		public TabsButtonMouseAdapter(JPanel panel, JLabel label) {
			this.panel = panel;
			this.label = label;
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(44, 26, 210));
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 10));
		}
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(218, 207, 1));
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 10));
		}
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(236, 236, 236));
			panel.setBorder(null);
			label.setForeground(Color.BLACK);
			label.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 10));
		}
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(44, 26, 210));
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 10));
		}
		
	}
	
}
