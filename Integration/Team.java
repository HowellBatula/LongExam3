package Integration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Robe.*;
import Howell.*;
import Paulo.*;

public class Team {

    private static boolean isMainSystem = false; // Flag to indicate if the main system is being accessed

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Team window = new Team();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Team() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1206, 709);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel PauloBTN = new JLabel("");
        PauloBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isMainSystem = true;
                BasicInformation Paulo = new BasicInformation(true);
                Paulo.main(true);;
                frame.dispose();

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                PauloBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/COLORED_03.png")));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                PauloBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/BNWW_03.png")));
            }
        });
        PauloBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/BNWW_03.png")));
        PauloBTN.setBounds(40, 191, 374, 470);
        frame.getContentPane().add(PauloBTN);

        JLabel HowellBTN = new JLabel("");
        HowellBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isMainSystem = true;
                main Howell = new main(true);
                Howell.main(true);
                frame.dispose();

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                HowellBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/COLORED_02.png")));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                HowellBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/BNWW_02.png")));

            }
        });
        HowellBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/BNWW_02.png")));
        HowellBTN.setBounds(424, 180, 374, 470);
        frame.getContentPane().add(HowellBTN);

        JLabel RobeBTN = new JLabel("");
        RobeBTN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isMainSystem = true;
                HomeTab Robe = new HomeTab(true);
                Robe.main(true);
                frame.dispose();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                RobeBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/COLORED_01.png")));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                RobeBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/BNWW_01.png")));

            }
        });
        RobeBTN.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/BNWW_01.png")));
        RobeBTN.setBounds(791, 180, 374, 470);
        frame.getContentPane().add(RobeBTN);

        JLabel Background = new JLabel("");
        Background.setIcon(new ImageIcon(Team.class.getResource("/MainFrame/images/OurTeam.jpg")));
        Background.setBounds(0, 0, 1200, 681);
        frame.getContentPane().add(Background);
        
        JLabel label = new JLabel("New label");
        label.setBounds(903, 291, 49, 14);
        frame.getContentPane().add(label);
        
        
    }
}
