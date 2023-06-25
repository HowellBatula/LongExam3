package Howell;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutMe {

	private JFrame frmAboutMe;
	private boolean integrated;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe window = new AboutMe();
					window.frmAboutMe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutMe() {
		initialize();
	}
	public AboutMe(boolean integrated) {
		this.integrated = integrated;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutMe = new JFrame();
		frmAboutMe.setTitle("About Me");
		frmAboutMe.setBounds(100, 100, 1175, 695);
        frmAboutMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAboutMe.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 1260, 804);
        frmAboutMe.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	main howell = new main(true);
        	howell.main(true);
        	frmAboutMe.dispose();
        	}
        });
        lblNewLabel_1.setIcon(new ImageIcon(AboutMe.class.getResource("/Howell/images/back-button (1).png")));
        lblNewLabel_1.setBounds(54, 68, 32, 39);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(AboutMe.class.getResource("/Howell/images/Canvas (3).jpg")));
        lblNewLabel.setBounds(0, 0, 1164, 657);
        panel.add(lblNewLabel);
       
	}

}
