package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(225, 0, 1049, 642);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel Dev01 = new JPanel();
		Dev01.setBounds(10, 337, 250, 66);
		panel_2.add(Dev01);
		Dev01.setLayout(null);
		
		JLabel lblDev01 = new JLabel("New label");
		lblDev01.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01.setBounds(10, 11, 207, 19);
		Dev01.add(lblDev01);
		
		JLabel lblActivity01 = new JLabel("New label");
		lblActivity01.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01.setBounds(10, 41, 207, 14);
		Dev01.add(lblActivity01);
		
		JProgressBar progressBarDev01 = new JProgressBar();
		progressBarDev01.setBounds(10, 414, 250, 24);
		panel_2.add(progressBarDev01);
		
		JPanel Dev02 = new JPanel();
		Dev02.setLayout(null);
		Dev02.setBounds(270, 337, 250, 66);
		panel_2.add(Dev02);
		
		JLabel lblDev02 = new JLabel("New label");
		lblDev02.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev02.setBounds(10, 11, 207, 19);
		Dev02.add(lblDev02);
		
		JLabel lblActivity02 = new JLabel("New label");
		lblActivity02.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity02.setBounds(10, 41, 207, 14);
		Dev02.add(lblActivity02);
		
		JProgressBar progressBarDev02 = new JProgressBar();
		progressBarDev02.setBounds(270, 414, 250, 24);
		panel_2.add(progressBarDev02);
		
		JPanel Dev03 = new JPanel();
		Dev03.setLayout(null);
		Dev03.setBounds(530, 337, 250, 66);
		panel_2.add(Dev03);
		
		JLabel lblDev03 = new JLabel("New label");
		lblDev03.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev03.setBounds(10, 11, 207, 19);
		Dev03.add(lblDev03);
		
		JLabel lblActivity03 = new JLabel("New label");
		lblActivity03.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity03.setBounds(10, 41, 207, 14);
		Dev03.add(lblActivity03);
		
		JProgressBar progressBarDev03 = new JProgressBar();
		progressBarDev03.setBounds(530, 414, 250, 24);
		panel_2.add(progressBarDev03);
		
		JPanel Dev04 = new JPanel();
		Dev04.setLayout(null);
		Dev04.setBounds(789, 337, 253, 66);
		panel_2.add(Dev04);
		
		JLabel lblDev04 = new JLabel("New label");
		lblDev04.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev04.setBounds(10, 11, 207, 19);
		Dev04.add(lblDev04);
		
		JLabel lblActivity04 = new JLabel("New label");
		lblActivity04.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity04.setBounds(10, 41, 207, 14);
		Dev04.add(lblActivity04);
		
		JProgressBar progressBarDev04 = new JProgressBar();
		progressBarDev04.setBounds(789, 414, 253, 24);
		panel_2.add(progressBarDev04);
		
		JPanel Dev05 = new JPanel();
		Dev05.setLayout(null);
		Dev05.setBounds(10, 467, 250, 66);
		panel_2.add(Dev05);
		
		JLabel lblDev05 = new JLabel("New label");
		lblDev05.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev05.setBounds(10, 11, 207, 19);
		Dev05.add(lblDev05);
		
		JLabel lblActivity05 = new JLabel("New label");
		lblActivity05.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity05.setBounds(10, 41, 207, 14);
		Dev05.add(lblActivity05);
		
		JProgressBar progressBarDev05 = new JProgressBar();
		progressBarDev05.setBounds(10, 544, 250, 24);
		panel_2.add(progressBarDev05);
		
		JPanel Dev06 = new JPanel();
		Dev06.setLayout(null);
		Dev06.setBounds(270, 467, 250, 66);
		panel_2.add(Dev06);
		
		JLabel lblDev06 = new JLabel("New label");
		lblDev06.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev06.setBounds(10, 11, 207, 19);
		Dev06.add(lblDev06);
		
		JLabel lblActivity06 = new JLabel("New label");
		lblActivity06.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity06.setBounds(10, 41, 207, 14);
		Dev06.add(lblActivity06);
		
		JProgressBar progressBarDev06 = new JProgressBar();
		progressBarDev06.setBounds(270, 544, 250, 24);
		panel_2.add(progressBarDev06);
		
		JPanel Dev07 = new JPanel();
		Dev07.setLayout(null);
		Dev07.setBounds(530, 467, 250, 66);
		panel_2.add(Dev07);
		
		JLabel lblDev07 = new JLabel("New label");
		lblDev07.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev07.setBounds(10, 11, 207, 19);
		Dev07.add(lblDev07);
		
		JLabel lblActivity07 = new JLabel("New label");
		lblActivity07.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity07.setBounds(10, 41, 207, 14);
		Dev07.add(lblActivity07);
		
		JProgressBar progressBarDev07 = new JProgressBar();
		progressBarDev07.setBounds(530, 544, 250, 24);
		panel_2.add(progressBarDev07);
		
		JPanel Dev08 = new JPanel();
		Dev08.setLayout(null);
		Dev08.setBounds(789, 467, 253, 66);
		panel_2.add(Dev08);
		
		JLabel lblDev08 = new JLabel("New label");
		lblDev08.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev08.setBounds(10, 11, 207, 19);
		Dev08.add(lblDev08);
		
		JLabel lblActivity08 = new JLabel("New label");
		lblActivity08.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity08.setBounds(10, 41, 207, 14);
		Dev08.add(lblActivity08);
		
		JProgressBar progressBarDev08 = new JProgressBar();
		progressBarDev08.setBounds(789, 544, 253, 24);
		panel_2.add(progressBarDev08);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(221, 160, 221));
		panel_3.setBounds(10, 10, 340, 299);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblToDo = new JLabel("TO DO");
		lblToDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblToDo.setBounds(121, 11, 83, 17);
		panel_3.add(lblToDo);
		
		JLabel lblToDoActivity01 = new JLabel("NAME");
		lblToDoActivity01.setForeground(new Color(255, 255, 255));
		lblToDoActivity01.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity01.setBackground(new Color(255, 255, 255));
		lblToDoActivity01.setBounds(26, 39, 50, 50);
		panel_3.add(lblToDoActivity01);
		
		JLabel lblToDoActivity02 = new JLabel("NAME");
		lblToDoActivity02.setForeground(Color.WHITE);
		lblToDoActivity02.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity02.setBackground(Color.WHITE);
		lblToDoActivity02.setBounds(86, 39, 50, 50);
		panel_3.add(lblToDoActivity02);
		
		JLabel lblToDoActivity03 = new JLabel("NAME");
		lblToDoActivity03.setForeground(Color.WHITE);
		lblToDoActivity03.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity03.setBackground(Color.WHITE);
		lblToDoActivity03.setBounds(146, 39, 50, 50);
		panel_3.add(lblToDoActivity03);
		
		JLabel lblToDoActivity04 = new JLabel("NAME");
		lblToDoActivity04.setForeground(Color.WHITE);
		lblToDoActivity04.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity04.setBackground(Color.WHITE);
		lblToDoActivity04.setBounds(206, 39, 50, 50);
		panel_3.add(lblToDoActivity04);
		
		JLabel lblToDoActivity05 = new JLabel("NAME");
		lblToDoActivity05.setForeground(Color.WHITE);
		lblToDoActivity05.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity05.setBackground(Color.WHITE);
		lblToDoActivity05.setBounds(266, 39, 50, 50);
		panel_3.add(lblToDoActivity05);
		
		JLabel lblToDoActivity10 = new JLabel("NAME");
		lblToDoActivity10.setForeground(Color.WHITE);
		lblToDoActivity10.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity10.setBackground(Color.WHITE);
		lblToDoActivity10.setBounds(266, 100, 50, 50);
		panel_3.add(lblToDoActivity10);
		
		JLabel lblToDoActivity09 = new JLabel("NAME");
		lblToDoActivity09.setForeground(Color.WHITE);
		lblToDoActivity09.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity09.setBackground(Color.WHITE);
		lblToDoActivity09.setBounds(206, 100, 50, 50);
		panel_3.add(lblToDoActivity09);
		
		JLabel lblToDoActivity08 = new JLabel("NAME");
		lblToDoActivity08.setForeground(Color.WHITE);
		lblToDoActivity08.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity08.setBackground(Color.WHITE);
		lblToDoActivity08.setBounds(146, 100, 50, 50);
		panel_3.add(lblToDoActivity08);
		
		JLabel lblToDoActivity07 = new JLabel("NAME");
		lblToDoActivity07.setForeground(Color.WHITE);
		lblToDoActivity07.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity07.setBackground(Color.WHITE);
		lblToDoActivity07.setBounds(86, 100, 50, 50);
		panel_3.add(lblToDoActivity07);
		
		JLabel lblToDoActivity06 = new JLabel("NAME");
		lblToDoActivity06.setForeground(Color.WHITE);
		lblToDoActivity06.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity06.setBackground(Color.WHITE);
		lblToDoActivity06.setBounds(26, 100, 50, 50);
		panel_3.add(lblToDoActivity06);
		
		JLabel lblToDoActivity15 = new JLabel("NAME");
		lblToDoActivity15.setForeground(Color.WHITE);
		lblToDoActivity15.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity15.setBackground(Color.WHITE);
		lblToDoActivity15.setBounds(266, 161, 50, 50);
		panel_3.add(lblToDoActivity15);
		
		JLabel lblToDoActivity14 = new JLabel("NAME");
		lblToDoActivity14.setForeground(Color.WHITE);
		lblToDoActivity14.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity14.setBackground(Color.WHITE);
		lblToDoActivity14.setBounds(206, 161, 50, 50);
		panel_3.add(lblToDoActivity14);
		
		JLabel lblToDoActivity13 = new JLabel("NAME");
		lblToDoActivity13.setForeground(Color.WHITE);
		lblToDoActivity13.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity13.setBackground(Color.WHITE);
		lblToDoActivity13.setBounds(146, 161, 50, 50);
		panel_3.add(lblToDoActivity13);
		
		JLabel lblToDoActivity12 = new JLabel("NAME");
		lblToDoActivity12.setForeground(Color.WHITE);
		lblToDoActivity12.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity12.setBackground(Color.WHITE);
		lblToDoActivity12.setBounds(86, 161, 50, 50);
		panel_3.add(lblToDoActivity12);
		
		JLabel lblToDoActivity11 = new JLabel("NAME");
		lblToDoActivity11.setForeground(Color.WHITE);
		lblToDoActivity11.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity11.setBackground(Color.WHITE);
		lblToDoActivity11.setBounds(26, 161, 50, 50);
		panel_3.add(lblToDoActivity11);
		
		JLabel lblToDoActivity20 = new JLabel("NAME");
		lblToDoActivity20.setForeground(Color.WHITE);
		lblToDoActivity20.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity20.setBackground(Color.WHITE);
		lblToDoActivity20.setBounds(266, 222, 50, 50);
		panel_3.add(lblToDoActivity20);
		
		JLabel lblToDoActivity19 = new JLabel("NAME");
		lblToDoActivity19.setForeground(Color.WHITE);
		lblToDoActivity19.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity19.setBackground(Color.WHITE);
		lblToDoActivity19.setBounds(206, 222, 50, 50);
		panel_3.add(lblToDoActivity19);
		
		JLabel lblToDoActivity18 = new JLabel("NAME");
		lblToDoActivity18.setForeground(Color.WHITE);
		lblToDoActivity18.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity18.setBackground(Color.WHITE);
		lblToDoActivity18.setBounds(146, 222, 50, 50);
		panel_3.add(lblToDoActivity18);
		
		JLabel lblToDoActivity17 = new JLabel("NAME");
		lblToDoActivity17.setForeground(Color.WHITE);
		lblToDoActivity17.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity17.setBackground(Color.WHITE);
		lblToDoActivity17.setBounds(86, 222, 50, 50);
		panel_3.add(lblToDoActivity17);
		
		JLabel lblToDoActivity16 = new JLabel("NAME");
		lblToDoActivity16.setForeground(Color.WHITE);
		lblToDoActivity16.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDoActivity16.setBackground(Color.WHITE);
		lblToDoActivity16.setBounds(26, 222, 50, 50);
		panel_3.add(lblToDoActivity16);
		
		Panel panel_3_1 = new Panel();
		panel_3_1.setBackground(new Color(216, 191, 216));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(356, 10, 340, 299);
		panel_2.add(panel_3_1);
		
		JLabel lblDoing = new JLabel("DOING");
		lblDoing.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblDoing.setBounds(124, 11, 76, 25);
		panel_3_1.add(lblDoing);
		
		JLabel lblDoingActivity01 = new JLabel("NAME");
		lblDoingActivity01.setForeground(Color.WHITE);
		lblDoingActivity01.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity01.setBackground(Color.WHITE);
		lblDoingActivity01.setBounds(27, 39, 50, 50);
		panel_3_1.add(lblDoingActivity01);
		
		JLabel lblDoingActivity02 = new JLabel("NAME");
		lblDoingActivity02.setForeground(Color.WHITE);
		lblDoingActivity02.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity02.setBackground(Color.WHITE);
		lblDoingActivity02.setBounds(87, 39, 50, 50);
		panel_3_1.add(lblDoingActivity02);
		
		JLabel lblDoingActivity03 = new JLabel("NAME");
		lblDoingActivity03.setForeground(Color.WHITE);
		lblDoingActivity03.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity03.setBackground(Color.WHITE);
		lblDoingActivity03.setBounds(147, 39, 50, 50);
		panel_3_1.add(lblDoingActivity03);
		
		JLabel lblDoingActivity04 = new JLabel("NAME");
		lblDoingActivity04.setForeground(Color.WHITE);
		lblDoingActivity04.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity04.setBackground(Color.WHITE);
		lblDoingActivity04.setBounds(207, 39, 50, 50);
		panel_3_1.add(lblDoingActivity04);
		
		JLabel lblDoingActivity05 = new JLabel("NAME");
		lblDoingActivity05.setForeground(Color.WHITE);
		lblDoingActivity05.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity05.setBackground(Color.WHITE);
		lblDoingActivity05.setBounds(267, 39, 50, 50);
		panel_3_1.add(lblDoingActivity05);
		
		JLabel lblDoingActivity10 = new JLabel("NAME");
		lblDoingActivity10.setForeground(Color.WHITE);
		lblDoingActivity10.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity10.setBackground(Color.WHITE);
		lblDoingActivity10.setBounds(267, 100, 50, 50);
		panel_3_1.add(lblDoingActivity10);
		
		JLabel lblDoingActivity09 = new JLabel("NAME");
		lblDoingActivity09.setForeground(Color.WHITE);
		lblDoingActivity09.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity09.setBackground(Color.WHITE);
		lblDoingActivity09.setBounds(207, 100, 50, 50);
		panel_3_1.add(lblDoingActivity09);
		
		JLabel lblDoingActivity08 = new JLabel("NAME");
		lblDoingActivity08.setForeground(Color.WHITE);
		lblDoingActivity08.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity08.setBackground(Color.WHITE);
		lblDoingActivity08.setBounds(147, 100, 50, 50);
		panel_3_1.add(lblDoingActivity08);
		
		JLabel lblDoingActivity07 = new JLabel("NAME");
		lblDoingActivity07.setForeground(Color.WHITE);
		lblDoingActivity07.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity07.setBackground(Color.WHITE);
		lblDoingActivity07.setBounds(87, 100, 50, 50);
		panel_3_1.add(lblDoingActivity07);
		
		JLabel lblDoingActivity06 = new JLabel("NAME");
		lblDoingActivity06.setForeground(Color.WHITE);
		lblDoingActivity06.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity06.setBackground(Color.WHITE);
		lblDoingActivity06.setBounds(27, 100, 50, 50);
		panel_3_1.add(lblDoingActivity06);
		
		JLabel lblDoingActivity11 = new JLabel("NAME");
		lblDoingActivity11.setForeground(Color.WHITE);
		lblDoingActivity11.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity11.setBackground(Color.WHITE);
		lblDoingActivity11.setBounds(27, 161, 50, 50);
		panel_3_1.add(lblDoingActivity11);
		
		JLabel lblDoingActivity12 = new JLabel("NAME");
		lblDoingActivity12.setForeground(Color.WHITE);
		lblDoingActivity12.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity12.setBackground(Color.WHITE);
		lblDoingActivity12.setBounds(87, 161, 50, 50);
		panel_3_1.add(lblDoingActivity12);
		
		JLabel lblDoingActivity13 = new JLabel("NAME");
		lblDoingActivity13.setForeground(Color.WHITE);
		lblDoingActivity13.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity13.setBackground(Color.WHITE);
		lblDoingActivity13.setBounds(147, 161, 50, 50);
		panel_3_1.add(lblDoingActivity13);
		
		JLabel lblDoingActivity14 = new JLabel("NAME");
		lblDoingActivity14.setForeground(Color.WHITE);
		lblDoingActivity14.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity14.setBackground(Color.WHITE);
		lblDoingActivity14.setBounds(207, 161, 50, 50);
		panel_3_1.add(lblDoingActivity14);
		
		JLabel lblDoingActivity15 = new JLabel("NAME");
		lblDoingActivity15.setForeground(Color.WHITE);
		lblDoingActivity15.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity15.setBackground(Color.WHITE);
		lblDoingActivity15.setBounds(267, 161, 50, 50);
		panel_3_1.add(lblDoingActivity15);
		
		JLabel lblDoingActivity20 = new JLabel("NAME");
		lblDoingActivity20.setForeground(Color.WHITE);
		lblDoingActivity20.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity20.setBackground(Color.WHITE);
		lblDoingActivity20.setBounds(267, 222, 50, 50);
		panel_3_1.add(lblDoingActivity20);
		
		JLabel lblDoingActivity19 = new JLabel("NAME");
		lblDoingActivity19.setForeground(Color.WHITE);
		lblDoingActivity19.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity19.setBackground(Color.WHITE);
		lblDoingActivity19.setBounds(207, 222, 50, 50);
		panel_3_1.add(lblDoingActivity19);
		
		JLabel lblDoingActivity18 = new JLabel("NAME");
		lblDoingActivity18.setForeground(Color.WHITE);
		lblDoingActivity18.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity18.setBackground(Color.WHITE);
		lblDoingActivity18.setBounds(147, 222, 50, 50);
		panel_3_1.add(lblDoingActivity18);
		
		JLabel lblDoingActivity17 = new JLabel("NAME");
		lblDoingActivity17.setForeground(Color.WHITE);
		lblDoingActivity17.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity17.setBackground(Color.WHITE);
		lblDoingActivity17.setBounds(87, 222, 50, 50);
		panel_3_1.add(lblDoingActivity17);
		
		JLabel lblDoingActivity16 = new JLabel("NAME");
		lblDoingActivity16.setForeground(Color.WHITE);
		lblDoingActivity16.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoingActivity16.setBackground(Color.WHITE);
		lblDoingActivity16.setBounds(27, 222, 50, 50);
		panel_3_1.add(lblDoingActivity16);
		
		Panel panel_3_2 = new Panel();
		panel_3_2.setBackground(new Color(221, 160, 221));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(702, 10, 340, 299);
		panel_2.add(panel_3_2);
		
		JLabel lblDone = new JLabel("DONE");
		lblDone.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblDone.setBounds(134, 11, 76, 19);
		panel_3_2.add(lblDone);
		
		JLabel lblDoneActivity01 = new JLabel("NAME");
		lblDoneActivity01.setForeground(Color.WHITE);
		lblDoneActivity01.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity01.setBackground(Color.WHITE);
		lblDoneActivity01.setBounds(28, 38, 50, 50);
		panel_3_2.add(lblDoneActivity01);
		
		JLabel lblDoneActivity02 = new JLabel("NAME");
		lblDoneActivity02.setForeground(Color.WHITE);
		lblDoneActivity02.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity02.setBackground(Color.WHITE);
		lblDoneActivity02.setBounds(88, 38, 50, 50);
		panel_3_2.add(lblDoneActivity02);
		
		JLabel lblDoneActivity03 = new JLabel("NAME");
		lblDoneActivity03.setForeground(Color.WHITE);
		lblDoneActivity03.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity03.setBackground(Color.WHITE);
		lblDoneActivity03.setBounds(148, 38, 50, 50);
		panel_3_2.add(lblDoneActivity03);
		
		JLabel lblDoneActivity04 = new JLabel("NAME");
		lblDoneActivity04.setForeground(Color.WHITE);
		lblDoneActivity04.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity04.setBackground(Color.WHITE);
		lblDoneActivity04.setBounds(208, 38, 50, 50);
		panel_3_2.add(lblDoneActivity04);
		
		JLabel lblDoneActivity05 = new JLabel("NAME");
		lblDoneActivity05.setForeground(Color.WHITE);
		lblDoneActivity05.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity05.setBackground(Color.WHITE);
		lblDoneActivity05.setBounds(268, 38, 50, 50);
		panel_3_2.add(lblDoneActivity05);
		
		JLabel lblDoneActivity10 = new JLabel("NAME");
		lblDoneActivity10.setForeground(Color.WHITE);
		lblDoneActivity10.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity10.setBackground(Color.WHITE);
		lblDoneActivity10.setBounds(268, 99, 50, 50);
		panel_3_2.add(lblDoneActivity10);
		
		JLabel lblDoneActivity09 = new JLabel("NAME");
		lblDoneActivity09.setForeground(Color.WHITE);
		lblDoneActivity09.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity09.setBackground(Color.WHITE);
		lblDoneActivity09.setBounds(208, 99, 50, 50);
		panel_3_2.add(lblDoneActivity09);
		
		JLabel lblDoneActivity08 = new JLabel("NAME");
		lblDoneActivity08.setForeground(Color.WHITE);
		lblDoneActivity08.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity08.setBackground(Color.WHITE);
		lblDoneActivity08.setBounds(148, 99, 50, 50);
		panel_3_2.add(lblDoneActivity08);
		
		JLabel lblDoneActivity07 = new JLabel("NAME");
		lblDoneActivity07.setForeground(Color.WHITE);
		lblDoneActivity07.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity07.setBackground(Color.WHITE);
		lblDoneActivity07.setBounds(88, 99, 50, 50);
		panel_3_2.add(lblDoneActivity07);
		
		JLabel lblDoneActivity06 = new JLabel("NAME");
		lblDoneActivity06.setForeground(Color.WHITE);
		lblDoneActivity06.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity06.setBackground(Color.WHITE);
		lblDoneActivity06.setBounds(28, 99, 50, 50);
		panel_3_2.add(lblDoneActivity06);
		
		JLabel lblDoneActivity11 = new JLabel("NAME");
		lblDoneActivity11.setForeground(Color.WHITE);
		lblDoneActivity11.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity11.setBackground(Color.WHITE);
		lblDoneActivity11.setBounds(28, 160, 50, 50);
		panel_3_2.add(lblDoneActivity11);
		
		JLabel lblDoneActivity12 = new JLabel("NAME");
		lblDoneActivity12.setForeground(Color.WHITE);
		lblDoneActivity12.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity12.setBackground(Color.WHITE);
		lblDoneActivity12.setBounds(88, 160, 50, 50);
		panel_3_2.add(lblDoneActivity12);
		
		JLabel lblDoneActivity13 = new JLabel("NAME");
		lblDoneActivity13.setForeground(Color.WHITE);
		lblDoneActivity13.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity13.setBackground(Color.WHITE);
		lblDoneActivity13.setBounds(148, 160, 50, 50);
		panel_3_2.add(lblDoneActivity13);
		
		JLabel lblDoneActivity14 = new JLabel("NAME");
		lblDoneActivity14.setForeground(Color.WHITE);
		lblDoneActivity14.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity14.setBackground(Color.WHITE);
		lblDoneActivity14.setBounds(208, 160, 50, 50);
		panel_3_2.add(lblDoneActivity14);
		
		JLabel lblDoneActivity15 = new JLabel("NAME");
		lblDoneActivity15.setForeground(Color.WHITE);
		lblDoneActivity15.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity15.setBackground(Color.WHITE);
		lblDoneActivity15.setBounds(268, 160, 50, 50);
		panel_3_2.add(lblDoneActivity15);
		
		JLabel lblDoneActivity20 = new JLabel("NAME");
		lblDoneActivity20.setForeground(Color.WHITE);
		lblDoneActivity20.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity20.setBackground(Color.WHITE);
		lblDoneActivity20.setBounds(268, 221, 50, 50);
		panel_3_2.add(lblDoneActivity20);
		
		JLabel lblDoneActivity19 = new JLabel("NAME");
		lblDoneActivity19.setForeground(Color.WHITE);
		lblDoneActivity19.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity19.setBackground(Color.WHITE);
		lblDoneActivity19.setBounds(208, 221, 50, 50);
		panel_3_2.add(lblDoneActivity19);
		
		JLabel lblDoneActivity18 = new JLabel("NAME");
		lblDoneActivity18.setForeground(Color.WHITE);
		lblDoneActivity18.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity18.setBackground(Color.WHITE);
		lblDoneActivity18.setBounds(148, 221, 50, 50);
		panel_3_2.add(lblDoneActivity18);
		
		JLabel lblDoneActivity17 = new JLabel("NAME");
		lblDoneActivity17.setForeground(Color.WHITE);
		lblDoneActivity17.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity17.setBackground(Color.WHITE);
		lblDoneActivity17.setBounds(88, 221, 50, 50);
		panel_3_2.add(lblDoneActivity17);
		
		JLabel lblDoneActivity16 = new JLabel("NAME");
		lblDoneActivity16.setForeground(Color.WHITE);
		lblDoneActivity16.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoneActivity16.setBackground(Color.WHITE);
		lblDoneActivity16.setBounds(28, 221, 50, 50);
		panel_3_2.add(lblDoneActivity16);
		
		JProgressBar progressProject = new JProgressBar();
		progressProject.setBackground(new Color(148, 0, 211));
		progressProject.setBounds(10, 599, 1032, 32);
		panel_2.add(progressProject);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(128, 0, 128));
		panel_1.setBounds(0, 0, 230, 78);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogoProjeto = new JLabel("LOGO DO PROJETO");
		lblLogoProjeto.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblLogoProjeto.setBounds(10, 11, 210, 56);
		panel_1.add(lblLogoProjeto);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 230, 641);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label_1 = new Label("Number Sprint:");
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(10, 237, 124, 22);
		panel.add(label_1);
		
		JButton btnStart = new JButton("Start");
		btnStart.setForeground(Color.WHITE);
		btnStart.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnStart.setBackground(new Color(128, 0, 128));
		btnStart.setBounds(10, 91, 96, 35);
		panel.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setForeground(Color.WHITE);
		btnStop.setFont(new Font("Arial", Font.BOLD, 14));
		btnStop.setBackground(new Color(128, 0, 128));
		btnStop.setBounds(116, 92, 99, 35);
		panel.add(btnStop);
		
		JLabel lblTime = new JLabel("(00:00:00)");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setForeground(new Color(255, 255, 255));
		lblTime.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTime.setBounds(29, 148, 161, 35);
		panel.add(lblTime);
	}
}
