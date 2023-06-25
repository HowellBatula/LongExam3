package Integration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class BullGodz {

	private JFrame frmBullgodzPortfolio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BullGodz window = new BullGodz();
					window.frmBullgodzPortfolio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BullGodz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBullgodzPortfolio = new JFrame();
		frmBullgodzPortfolio.setIconImage(Toolkit.getDefaultToolkit().getImage(BullGodz.class.getResource("/Paulo/PICS/NU (2).png")));
		frmBullgodzPortfolio.setTitle("BullGodz");
		frmBullgodzPortfolio.setBounds(100, 100, 1200, 674);
		frmBullgodzPortfolio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBullgodzPortfolio.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Team team = new Team();
				team.main(null);
				frmBullgodzPortfolio.dispose();
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(BullGodz.class.getResource("/MainFrame/images/OURTEAM.png")));
		lblNewLabel_1.setBounds(1067, 334, 92, 46);
		frmBullgodzPortfolio.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BullGodz.class.getResource("/MainFrame/images/Canvas (6).png")));
		lblNewLabel.setBounds(0, 0, 1186, 637);
		frmBullgodzPortfolio.getContentPane().add(lblNewLabel);
	}

}
