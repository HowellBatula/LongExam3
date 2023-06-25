package Howell;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import Integration.Team;
import Robe.HomeTab;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class main {
    private JFrame frmAkoNaTo;
    private JLabel label;
    private String text = "Hi, I'm Howell Batula";
    private int currentIndex = 0;
    private Timer timer;
    private final int DELAY = 100; // Delay between each letter (in milliseconds)
    private final JPanel panel = new JPanel();
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_2;
	private boolean integrated;

    /**
     * Launch the application.
     */
   
    public static void main(boolean integrated) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    main window = new main(true);
                    window.frmAkoNaTo.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    

    /**
     * Create the application.
     */
   
    
    public main(boolean integrated) {
        initialize();
        this.integrated = integrated;
        startTypewriterEffect();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAkoNaTo = new JFrame();
        frmAkoNaTo.setTitle("League Of Howell");
        frmAkoNaTo.setIconImage(Toolkit.getDefaultToolkit().getImage(main.class.getResource("/Howell/images/png-transparent-league-of-legends-computer-icons-ongamenet-starleague-video-game-electronic-sports-voice-actor-video-game-desktop-wallpaper-online-game-removebg-preview.png")));
        frmAkoNaTo.setBounds(100, 100, 1175, 695);
        frmAkoNaTo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAkoNaTo.getContentPane().setLayout(null);
        			panel.setBackground(new Color(0, 0, 0));
        			panel.setBounds(0, 0, 1161, 658);
        			frmAkoNaTo.getContentPane().add(panel);
        			panel.setLayout(null);
        			
        			lblNewLabel = new JLabel("\r\n");
        			lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/Howell/images/Canvas (4) (1).png")));
        			lblNewLabel.setBounds(536, 81, 787, 527);
        			panel.add(lblNewLabel);
        			
        			        label = new JLabel();
        			        label.setBounds(102, 262, 555, 93);
        			        panel.add(label);
        			        label.setForeground(new Color(255, 77, 6));
        			        label.setFont(new Font("Monospaced", Font.PLAIN, 32));
        			        
        			        lblNewLabel_2 = new JLabel("D E S I G N E R ・ P R O G R A M M E R");
        			        lblNewLabel_2.setForeground(Color.WHITE);
        			        lblNewLabel_2.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
        			        lblNewLabel_2.setBounds(102, 322, 404, 93);
        			        panel.add(lblNewLabel_2);
        			        
        			        JLabel AboutMeBtn = new JLabel("");
        			        AboutMeBtn.addMouseListener(new MouseAdapter() {
        			        	@Override
        			        	public void mouseClicked(MouseEvent e) {
        			        		AboutMe.main(null);
        			        		frmAkoNaTo.dispose();
        			        	}
        			        });
        			        AboutMeBtn.setIcon(new ImageIcon(main.class.getResource("/Howell/images/8 (1).png")));
        			        AboutMeBtn.setBounds(0, 396, 213, 47);
        			        panel.add(AboutMeBtn);
        			        
        			        JLabel lblNewLabel_1_1 = new JLabel("");
        			        lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
        			        	@Override
        			        	public void mouseClicked(MouseEvent e) {
        			        		Skills.main(null);
        			        		frmAkoNaTo.dispose();
        			        	}
        			        });
        			        lblNewLabel_1_1.setIcon(new ImageIcon(main.class.getResource("/Howell/images/9.png")));
        			        lblNewLabel_1_1.setBounds(155, 396, 213, 47);
        			        panel.add(lblNewLabel_1_1);
        			        
        			        
        			JLabel back = new JLabel();
        			back.setBounds(1106, 11, 45, 52);
        			panel.add(back);
        			back.setIcon(new ImageIcon(main.class.getResource("/Howell/images/back-button (1).png")));
        			back.addMouseListener(new MouseAdapter() {
        				@Override
        				public void mouseClicked(MouseEvent e) {
        					frmAkoNaTo.dispose();
        					new Team().main(null);
        				}
        			});
        			        
        		
    }

    /**
     * Starts the typewriter effect.
     */
    private void startTypewriterEffect() {
        timer = new Timer(DELAY, e -> {
            if (currentIndex < text.length()) {
                label.setText(text.substring(0, currentIndex + 1));
                currentIndex++;
            } else {
                timer.stop(); // Stop the timer when the text is fully displayed
            }
        });

        timer.start();
    }
}
