import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Pianos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pianos window = new Pianos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pianos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 872, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\C.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(10, 128, 63, 259);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnD = new JButton("D");
		btnD.setBackground(Color.WHITE);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\D.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD.setBounds(89, 128, 63, 259);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setBackground(Color.WHITE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\E.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnE.setBounds(161, 128, 63, 259);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBackground(Color.WHITE);
		btnF.setForeground(Color.BLACK);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\F.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnF.setBounds(244, 128, 63, 259);
		frame.getContentPane().add(btnF);
		
		JButton btnA = new JButton("A");
		btnA.setBackground(Color.WHITE);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\A.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnA.setBounds(390, 128, 63, 259);
		frame.getContentPane().add(btnA);
		
		JButton btnG = new JButton("G");
		btnG.setBackground(Color.WHITE);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\G.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnG.setBounds(320, 128, 63, 259);
		frame.getContentPane().add(btnG);
		
		JButton btnB = new JButton("B");
		btnB.setBackground(Color.WHITE);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\B.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnB.setBounds(460, 128, 63, 259);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C.");
		btnC.setBackground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\C1.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC.setBounds(533, 128, 63, 259);
		frame.getContentPane().add(btnC);
		
		JButton btnD_1 = new JButton("D.");
		btnD_1.setBackground(Color.WHITE);
		btnD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\D1.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD_1.setBounds(620, 128, 63, 259);
		frame.getContentPane().add(btnD_1);
		
		JButton btnF_1 = new JButton("F.");
		btnF_1.setBackground(Color.WHITE);
		btnF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\F1.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnF_1.setBounds(699, 128, 63, 259);
		frame.getContentPane().add(btnF_1);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.setBackground(Color.WHITE);
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\C.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnC_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC_1.setBounds(783, 128, 63, 259);
		frame.getContentPane().add(btnC_1);
		
		JButton btnC_2 = new JButton("C#");
		btnC_2.setBackground(Color.BLACK);
		btnC_2.setForeground(Color.WHITE);
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\C_s.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnC_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC_2.setBounds(26, 0, 70, 105);
		frame.getContentPane().add(btnC_2);
		
		JButton btnD_2 = new JButton("D#");
		btnD_2.setBackground(Color.BLACK);
		btnD_2.setForeground(Color.WHITE);
		btnD_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\D_s.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnD_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD_2.setBounds(119, 0, 70, 105);
		frame.getContentPane().add(btnD_2);
		
		JButton btnC_3 = new JButton("C..");
		btnC_3.setBackground(Color.BLACK);
		btnC_3.setForeground(Color.WHITE);
		btnC_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\Cq1_Drum.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnC_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC_3.setBounds(626, 0, 82, 105);
		frame.getContentPane().add(btnC_3);
		
		JButton btnD_3 = new JButton("D..");
		btnD_3.setBackground(Color.BLACK);
		btnD_3.setForeground(Color.WHITE);
		btnD_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\Dq1_Drum.wav"));
					Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
				catch(Exception ex)
					{
					
					}
			}
		});
		btnD_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD_3.setBounds(721, 0, 82, 105);
		frame.getContentPane().add(btnD_3);
		
		JButton btnF_2 = new JButton("F#");
		btnF_2.setBackground(Color.BLACK);
		btnF_2.setForeground(Color.WHITE);
		btnF_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\F_s.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnF_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnF_2.setBounds(310, 0, 70, 105);
		frame.getContentPane().add(btnF_2);
		
		JButton btnG_1 = new JButton("G#");
		btnG_1.setBackground(Color.BLACK);
		btnG_1.setForeground(Color.WHITE);
		btnG_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\G_s.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnG_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnG_1.setBounds(390, 0, 70, 105);
		frame.getContentPane().add(btnG_1);
		
		JButton btnBb = new JButton("Bb");
		btnBb.setBackground(Color.BLACK);
		btnBb.setForeground(Color.WHITE);
		btnBb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\hp\\Desktop\\Music_Note\\Bb.wav"));
				Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
			catch(Exception ex)
				{
				
				}
			}
		});
		btnBb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBb.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBb.setBounds(476, 0, 70, 105);
		frame.getContentPane().add(btnBb);
	}
}
