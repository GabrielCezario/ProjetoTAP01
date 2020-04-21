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
		
		JProgressBar progressProject = new JProgressBar();
		progressProject.setBackground(new Color(148, 0, 211));
		progressProject.setBounds(10, 599, 1029, 32);
		panel_2.add(progressProject);
		
		JPanel Dev01 = new JPanel();
		Dev01.setBounds(10, 337, 250, 66);
		panel_2.add(Dev01);
		Dev01.setLayout(null);
		
		JLabel lblDev01 = new JLabel("New label");
		lblDev01.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01.setBounds(10, 11, 207, 14);
		Dev01.add(lblDev01);
		
		JLabel lblActivity01 = new JLabel("New label");
		lblActivity01.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01.setBounds(10, 41, 207, 14);
		Dev01.add(lblActivity01);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 414, 250, 24);
		panel_2.add(progressBar);
		
		JPanel Dev01_1 = new JPanel();
		Dev01_1.setLayout(null);
		Dev01_1.setBounds(270, 337, 250, 66);
		panel_2.add(Dev01_1);
		
		JLabel lblDev01_1 = new JLabel("New label");
		lblDev01_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_1.setBounds(10, 11, 207, 14);
		Dev01_1.add(lblDev01_1);
		
		JLabel lblActivity01_1 = new JLabel("New label");
		lblActivity01_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_1.setBounds(10, 41, 207, 14);
		Dev01_1.add(lblActivity01_1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(270, 414, 250, 24);
		panel_2.add(progressBar_1);
		
		JPanel Dev01_2 = new JPanel();
		Dev01_2.setLayout(null);
		Dev01_2.setBounds(530, 337, 250, 66);
		panel_2.add(Dev01_2);
		
		JLabel lblDev01_2 = new JLabel("New label");
		lblDev01_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_2.setBounds(10, 11, 207, 14);
		Dev01_2.add(lblDev01_2);
		
		JLabel lblActivity01_2 = new JLabel("New label");
		lblActivity01_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_2.setBounds(10, 41, 207, 14);
		Dev01_2.add(lblActivity01_2);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(530, 414, 250, 24);
		panel_2.add(progressBar_2);
		
		JPanel Dev01_3 = new JPanel();
		Dev01_3.setLayout(null);
		Dev01_3.setBounds(789, 337, 250, 66);
		panel_2.add(Dev01_3);
		
		JLabel lblDev01_3 = new JLabel("New label");
		lblDev01_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3.setBounds(10, 11, 207, 14);
		Dev01_3.add(lblDev01_3);
		
		JLabel lblActivity01_3 = new JLabel("New label");
		lblActivity01_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3.setBounds(10, 41, 207, 14);
		Dev01_3.add(lblActivity01_3);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setBounds(789, 414, 250, 24);
		panel_2.add(progressBar_3);
		
		JPanel Dev01_3_1 = new JPanel();
		Dev01_3_1.setLayout(null);
		Dev01_3_1.setBounds(10, 467, 250, 66);
		panel_2.add(Dev01_3_1);
		
		JLabel lblDev01_3_1 = new JLabel("New label");
		lblDev01_3_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_1.setBounds(10, 11, 207, 14);
		Dev01_3_1.add(lblDev01_3_1);
		
		JLabel lblActivity01_3_1 = new JLabel("New label");
		lblActivity01_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_1.setBounds(10, 41, 207, 14);
		Dev01_3_1.add(lblActivity01_3_1);
		
		JProgressBar progressBar_3_1 = new JProgressBar();
		progressBar_3_1.setBounds(10, 544, 250, 24);
		panel_2.add(progressBar_3_1);
		
		JPanel Dev01_3_2 = new JPanel();
		Dev01_3_2.setLayout(null);
		Dev01_3_2.setBounds(270, 467, 250, 66);
		panel_2.add(Dev01_3_2);
		
		JLabel lblDev01_3_2 = new JLabel("New label");
		lblDev01_3_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_2.setBounds(10, 11, 207, 14);
		Dev01_3_2.add(lblDev01_3_2);
		
		JLabel lblActivity01_3_2 = new JLabel("New label");
		lblActivity01_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_2.setBounds(10, 41, 207, 14);
		Dev01_3_2.add(lblActivity01_3_2);
		
		JProgressBar progressBar_3_2 = new JProgressBar();
		progressBar_3_2.setBounds(270, 544, 250, 24);
		panel_2.add(progressBar_3_2);
		
		JPanel Dev01_3_3 = new JPanel();
		Dev01_3_3.setLayout(null);
		Dev01_3_3.setBounds(530, 467, 250, 66);
		panel_2.add(Dev01_3_3);
		
		JLabel lblDev01_3_3 = new JLabel("New label");
		lblDev01_3_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_3.setBounds(10, 11, 207, 14);
		Dev01_3_3.add(lblDev01_3_3);
		
		JLabel lblActivity01_3_3 = new JLabel("New label");
		lblActivity01_3_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_3.setBounds(10, 41, 207, 14);
		Dev01_3_3.add(lblActivity01_3_3);
		
		JProgressBar progressBar_3_3 = new JProgressBar();
		progressBar_3_3.setBounds(530, 544, 250, 24);
		panel_2.add(progressBar_3_3);
		
		JPanel Dev01_3_4 = new JPanel();
		Dev01_3_4.setLayout(null);
		Dev01_3_4.setBounds(789, 467, 250, 66);
		panel_2.add(Dev01_3_4);
		
		JLabel lblDev01_3_4 = new JLabel("New label");
		lblDev01_3_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_4.setBounds(10, 11, 207, 14);
		Dev01_3_4.add(lblDev01_3_4);
		
		JLabel lblActivity01_3_4 = new JLabel("New label");
		lblActivity01_3_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_4.setBounds(10, 41, 207, 14);
		Dev01_3_4.add(lblActivity01_3_4);
		
		JProgressBar progressBar_3_4 = new JProgressBar();
		progressBar_3_4.setBounds(789, 544, 250, 24);
		panel_2.add(progressBar_3_4);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(221, 160, 221));
		panel_3.setBounds(10, 10, 340, 299);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TO DO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel_1.setBounds(121, 11, 83, 17);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(26, 39, 50, 50);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NAME");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(86, 39, 50, 50);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("NAME");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(146, 39, 50, 50);
		panel_3.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("NAME");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_3.setBounds(206, 39, 50, 50);
		panel_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("NAME");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4.setBackground(Color.WHITE);
		lblNewLabel_2_4.setBounds(266, 39, 50, 50);
		panel_3.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("NAME");
		lblNewLabel_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_1.setBounds(266, 100, 50, 50);
		panel_3.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("NAME");
		lblNewLabel_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_1.setBounds(206, 100, 50, 50);
		panel_3.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("NAME");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1.setBounds(146, 100, 50, 50);
		panel_3.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("NAME");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(86, 100, 50, 50);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("NAME");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_5.setBackground(Color.WHITE);
		lblNewLabel_2_5.setBounds(26, 100, 50, 50);
		panel_3.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("NAME");
		lblNewLabel_2_4_2.setForeground(Color.WHITE);
		lblNewLabel_2_4_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_2.setBackground(Color.WHITE);
		lblNewLabel_2_4_2.setBounds(266, 161, 50, 50);
		panel_3.add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("NAME");
		lblNewLabel_2_3_2.setForeground(Color.WHITE);
		lblNewLabel_2_3_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_2.setBackground(Color.WHITE);
		lblNewLabel_2_3_2.setBounds(206, 161, 50, 50);
		panel_3.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("NAME");
		lblNewLabel_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2_2.setBounds(146, 161, 50, 50);
		panel_3.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("NAME");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_2.setBackground(Color.WHITE);
		lblNewLabel_2_1_2.setBounds(86, 161, 50, 50);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_6 = new JLabel("NAME");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_6.setBackground(Color.WHITE);
		lblNewLabel_2_6.setBounds(26, 161, 50, 50);
		panel_3.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("NAME");
		lblNewLabel_2_4_3.setForeground(Color.WHITE);
		lblNewLabel_2_4_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_3.setBackground(Color.WHITE);
		lblNewLabel_2_4_3.setBounds(266, 222, 50, 50);
		panel_3.add(lblNewLabel_2_4_3);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("NAME");
		lblNewLabel_2_3_3.setForeground(Color.WHITE);
		lblNewLabel_2_3_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_3.setBackground(Color.WHITE);
		lblNewLabel_2_3_3.setBounds(206, 222, 50, 50);
		panel_3.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("NAME");
		lblNewLabel_2_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_2_3.setBounds(146, 222, 50, 50);
		panel_3.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("NAME");
		lblNewLabel_2_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_3.setBackground(Color.WHITE);
		lblNewLabel_2_1_3.setBounds(86, 222, 50, 50);
		panel_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_7 = new JLabel("NAME");
		lblNewLabel_2_7.setForeground(Color.WHITE);
		lblNewLabel_2_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_7.setBackground(Color.WHITE);
		lblNewLabel_2_7.setBounds(26, 222, 50, 50);
		panel_3.add(lblNewLabel_2_7);
		
		Panel panel_3_1 = new Panel();
		panel_3_1.setBackground(new Color(216, 191, 216));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(356, 10, 340, 299);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("DOING");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(124, 11, 76, 25);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_8 = new JLabel("NAME");
		lblNewLabel_2_8.setForeground(Color.WHITE);
		lblNewLabel_2_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_8.setBackground(Color.WHITE);
		lblNewLabel_2_8.setBounds(27, 39, 50, 50);
		panel_3_1.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("NAME");
		lblNewLabel_2_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_4.setBackground(Color.WHITE);
		lblNewLabel_2_1_4.setBounds(87, 39, 50, 50);
		panel_3_1.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("NAME");
		lblNewLabel_2_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_4.setBackground(Color.WHITE);
		lblNewLabel_2_2_4.setBounds(147, 39, 50, 50);
		panel_3_1.add(lblNewLabel_2_2_4);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("NAME");
		lblNewLabel_2_3_4.setForeground(Color.WHITE);
		lblNewLabel_2_3_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_4.setBackground(Color.WHITE);
		lblNewLabel_2_3_4.setBounds(207, 39, 50, 50);
		panel_3_1.add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_4_4 = new JLabel("NAME");
		lblNewLabel_2_4_4.setForeground(Color.WHITE);
		lblNewLabel_2_4_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_4.setBackground(Color.WHITE);
		lblNewLabel_2_4_4.setBounds(267, 39, 50, 50);
		panel_3_1.add(lblNewLabel_2_4_4);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("NAME");
		lblNewLabel_2_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_1_1.setBounds(267, 100, 50, 50);
		panel_3_1.add(lblNewLabel_2_4_1_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("NAME");
		lblNewLabel_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_1_1.setBounds(207, 100, 50, 50);
		panel_3_1.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("NAME");
		lblNewLabel_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1_1.setBounds(147, 100, 50, 50);
		panel_3_1.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("NAME");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_1.setBounds(87, 100, 50, 50);
		panel_3_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("NAME");
		lblNewLabel_2_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_5_1.setBackground(Color.WHITE);
		lblNewLabel_2_5_1.setBounds(27, 100, 50, 50);
		panel_3_1.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("NAME");
		lblNewLabel_2_6_1.setForeground(Color.WHITE);
		lblNewLabel_2_6_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_6_1.setBackground(Color.WHITE);
		lblNewLabel_2_6_1.setBounds(27, 161, 50, 50);
		panel_3_1.add(lblNewLabel_2_6_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("NAME");
		lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_2_1.setBounds(87, 161, 50, 50);
		panel_3_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("NAME");
		lblNewLabel_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_2_1.setBounds(147, 161, 50, 50);
		panel_3_1.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("NAME");
		lblNewLabel_2_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_2_1.setBounds(207, 161, 50, 50);
		panel_3_1.add(lblNewLabel_2_3_2_1);
		
		JLabel lblNewLabel_2_4_2_1 = new JLabel("NAME");
		lblNewLabel_2_4_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_2_1.setBounds(267, 161, 50, 50);
		panel_3_1.add(lblNewLabel_2_4_2_1);
		
		JLabel lblNewLabel_2_4_3_1 = new JLabel("NAME");
		lblNewLabel_2_4_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_3_1.setBounds(267, 222, 50, 50);
		panel_3_1.add(lblNewLabel_2_4_3_1);
		
		JLabel lblNewLabel_2_3_3_1 = new JLabel("NAME");
		lblNewLabel_2_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_3_1.setBounds(207, 222, 50, 50);
		panel_3_1.add(lblNewLabel_2_3_3_1);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("NAME");
		lblNewLabel_2_2_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_3_1.setBounds(147, 222, 50, 50);
		panel_3_1.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("NAME");
		lblNewLabel_2_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_3_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_3_1.setBounds(87, 222, 50, 50);
		panel_3_1.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_7_1 = new JLabel("NAME");
		lblNewLabel_2_7_1.setForeground(Color.WHITE);
		lblNewLabel_2_7_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_7_1.setBackground(Color.WHITE);
		lblNewLabel_2_7_1.setBounds(27, 222, 50, 50);
		panel_3_1.add(lblNewLabel_2_7_1);
		
		Panel panel_3_2 = new Panel();
		panel_3_2.setBackground(new Color(221, 160, 221));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(702, 10, 340, 299);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("DONE");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(134, 11, 76, 19);
		panel_3_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_8_1 = new JLabel("NAME");
		lblNewLabel_2_8_1.setForeground(Color.WHITE);
		lblNewLabel_2_8_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_8_1.setBackground(Color.WHITE);
		lblNewLabel_2_8_1.setBounds(28, 38, 50, 50);
		panel_3_2.add(lblNewLabel_2_8_1);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("NAME");
		lblNewLabel_2_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_4_1.setBounds(88, 38, 50, 50);
		panel_3_2.add(lblNewLabel_2_1_4_1);
		
		JLabel lblNewLabel_2_2_4_1 = new JLabel("NAME");
		lblNewLabel_2_2_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_4_1.setBounds(148, 38, 50, 50);
		panel_3_2.add(lblNewLabel_2_2_4_1);
		
		JLabel lblNewLabel_2_3_4_1 = new JLabel("NAME");
		lblNewLabel_2_3_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_4_1.setBounds(208, 38, 50, 50);
		panel_3_2.add(lblNewLabel_2_3_4_1);
		
		JLabel lblNewLabel_2_4_4_1 = new JLabel("NAME");
		lblNewLabel_2_4_4_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_4_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_4_1.setBounds(268, 38, 50, 50);
		panel_3_2.add(lblNewLabel_2_4_4_1);
		
		JLabel lblNewLabel_2_4_1_1_1 = new JLabel("NAME");
		lblNewLabel_2_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_1_1_1.setBounds(268, 99, 50, 50);
		panel_3_2.add(lblNewLabel_2_4_1_1_1);
		
		JLabel lblNewLabel_2_3_1_1_1 = new JLabel("NAME");
		lblNewLabel_2_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_1_1_1.setBounds(208, 99, 50, 50);
		panel_3_2.add(lblNewLabel_2_3_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("NAME");
		lblNewLabel_2_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1_1_1.setBounds(148, 99, 50, 50);
		panel_3_2.add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("NAME");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setBounds(88, 99, 50, 50);
		panel_3_2.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("NAME");
		lblNewLabel_2_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_5_1_1.setBounds(28, 99, 50, 50);
		panel_3_2.add(lblNewLabel_2_5_1_1);
		
		JLabel lblNewLabel_2_6_1_1 = new JLabel("NAME");
		lblNewLabel_2_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_6_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_6_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_6_1_1.setBounds(28, 160, 50, 50);
		panel_3_2.add(lblNewLabel_2_6_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("NAME");
		lblNewLabel_2_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_2_1_1.setBounds(88, 160, 50, 50);
		panel_3_2.add(lblNewLabel_2_1_2_1_1);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("NAME");
		lblNewLabel_2_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_2_1_1.setBounds(148, 160, 50, 50);
		panel_3_2.add(lblNewLabel_2_2_2_1_1);
		
		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("NAME");
		lblNewLabel_2_3_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_2_1_1.setBounds(208, 160, 50, 50);
		panel_3_2.add(lblNewLabel_2_3_2_1_1);
		
		JLabel lblNewLabel_2_4_2_1_1 = new JLabel("NAME");
		lblNewLabel_2_4_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_2_1_1.setBounds(268, 160, 50, 50);
		panel_3_2.add(lblNewLabel_2_4_2_1_1);
		
		JLabel lblNewLabel_2_4_3_1_1 = new JLabel("NAME");
		lblNewLabel_2_4_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_4_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_4_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_4_3_1_1.setBounds(268, 221, 50, 50);
		panel_3_2.add(lblNewLabel_2_4_3_1_1);
		
		JLabel lblNewLabel_2_3_3_1_1 = new JLabel("NAME");
		lblNewLabel_2_3_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_3_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_3_3_1_1.setBounds(208, 221, 50, 50);
		panel_3_2.add(lblNewLabel_2_3_3_1_1);
		
		JLabel lblNewLabel_2_2_3_1_1 = new JLabel("NAME");
		lblNewLabel_2_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_2_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_3_1_1.setBounds(148, 221, 50, 50);
		panel_3_2.add(lblNewLabel_2_2_3_1_1);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("NAME");
		lblNewLabel_2_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_1_3_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_3_1_1.setBounds(88, 221, 50, 50);
		panel_3_2.add(lblNewLabel_2_1_3_1_1);
		
		JLabel lblNewLabel_2_7_1_1 = new JLabel("NAME");
		lblNewLabel_2_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_7_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2_7_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_7_1_1.setBounds(28, 221, 50, 50);
		panel_3_2.add(lblNewLabel_2_7_1_1);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(128, 0, 128));
		panel_1.setBounds(0, 0, 230, 78);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGO DO PROJETO");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 210, 56);
		panel_1.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 230, 641);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Number Activity: ");
		label.setFont(new Font("Arial Black", Font.BOLD, 14));
		label.setBounds(10, 209, 124, 22);
		panel.add(label);
		
		Label label_1 = new Label("Number Sprint:");
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(10, 237, 124, 22);
		panel.add(label_1);
		
		Label label_5 = new Label("(0 / 0)");
		label_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5.setBounds(140, 209, 60, 22);
		panel.add(label_5);
		
		Label label_5_1 = new Label("(0 / 0)");
		label_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_1.setBounds(140, 237, 60, 22);
		panel.add(label_5_1);
		
		JButton btnStart_1 = new JButton("Start");
		btnStart_1.setForeground(Color.WHITE);
		btnStart_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnStart_1.setBackground(new Color(128, 0, 128));
		btnStart_1.setBounds(10, 91, 96, 35);
		panel.add(btnStart_1);
		
		JButton btnStop_1 = new JButton("Stop");
		btnStop_1.setForeground(Color.WHITE);
		btnStop_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnStop_1.setBackground(new Color(128, 0, 128));
		btnStop_1.setBounds(116, 92, 99, 35);
		panel.add(btnStop_1);
		
		JLabel lblNewLabel_3 = new JLabel("(00:00:00)");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(29, 148, 161, 35);
		panel.add(lblNewLabel_3);
	}
}
