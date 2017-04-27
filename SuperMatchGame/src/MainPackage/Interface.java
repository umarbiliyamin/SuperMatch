package MainPackage;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Interface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setTitle("Super Match!!");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interface.class.getResource("/ImagePackage/Logo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, new Color(0, 0, 128)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel im1 = new JLabel("");
		im1.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im1.setBounds(40, 40, 130, 130);
		panel.add(im1);
		
		JLabel im2 = new JLabel("");
		im2.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im2.setBounds(40, 205, 130, 130);
		panel.add(im2);
		
		JLabel im3 = new JLabel("");
		im3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im3.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im3.setBounds(40, 372, 130, 130);
		panel.add(im3);
		
		JLabel im4 = new JLabel("");
		im4.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im4.setBounds(204, 40, 130, 130);
		panel.add(im4);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/Logo.jpg")));
		logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logo.setBounds(180, 181, 180, 180);
		panel.add(logo);
		
		JLabel im5 = new JLabel("");
		im5.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im5.setBounds(204, 372, 130, 130);
		panel.add(im5);
		
		JLabel im6 = new JLabel("");
		im6.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im6.setBounds(368, 40, 130, 130);
		panel.add(im6);
		
		JLabel im7 = new JLabel("");
		im7.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im7.setBounds(370, 205, 130, 130);
		panel.add(im7);
		
		JLabel im8 = new JLabel("");
		im8.setIcon(new ImageIcon(Interface.class.getResource("/ImagePackage/back.jpg")));
		im8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		im8.setBounds(368, 372, 130, 130);
		panel.add(im8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(530, 40, 184, 462);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel ScoreTiltle = new JLabel("SCORE");
		ScoreTiltle.setBounds(27, 5, 130, 34);
		ScoreTiltle.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 30));
		ScoreTiltle.setForeground(new Color(230, 230, 250));
		panel_1.add(ScoreTiltle);
		
		JLabel PlayerOneTitle = new JLabel("Player One");
		PlayerOneTitle.setForeground(new Color(25, 25, 112));
		PlayerOneTitle.setFont(new Font("MS Gothic", Font.PLAIN, 28));
		PlayerOneTitle.setBounds(10, 50, 150, 39);
		panel_1.add(PlayerOneTitle);
		
		JLabel PlayerTwoTitle = new JLabel("Player Two");
		PlayerTwoTitle.setForeground(new Color(25, 25, 112));
		PlayerTwoTitle.setFont(new Font("MS Gothic", Font.PLAIN, 28));
		PlayerTwoTitle.setBounds(10, 234, 150, 39);
		panel_1.add(PlayerTwoTitle);
		
		JLabel score1 = new JLabel("0");
		score1.setFont(new Font("Times New Roman", Font.BOLD, 99));
		score1.setForeground(new Color(255, 255, 224));
		score1.setBounds(92, 100, 50, 130);
		panel_1.add(score1);
		
		JLabel score2 = new JLabel("0");
		score2.setForeground(new Color(255, 255, 224));
		score2.setFont(new Font("Times New Roman", Font.BOLD, 99));
		score2.setBounds(92, 283, 50, 130);
		panel_1.add(score2);
		
		
		
		
	}
}
