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
		panel_2.setBounds(225, 0, 887, 642);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(148, 0, 211));
		progressBar.setBounds(10, 599, 867, 32);
		panel_2.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBackground(new Color(148, 0, 211));
		progressBar_1.setBounds(10, 556, 867, 32);
		panel_2.add(progressBar_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 128));
		panel_3.setBounds(50, 269, 100, 100);
		panel_2.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(128, 128, 128));
		panel_3_1.setBounds(270, 269, 100, 100);
		panel_2.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(128, 128, 128));
		panel_3_2.setBounds(513, 269, 100, 100);
		panel_2.add(panel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(new Color(128, 128, 128));
		panel_3_3.setBounds(741, 269, 100, 100);
		panel_2.add(panel_3_3);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(128, 128, 128));
		panel_3_1_1.setBounds(270, 415, 100, 100);
		panel_2.add(panel_3_1_1);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(new Color(128, 128, 128));
		panel_3_4.setBounds(50, 415, 100, 100);
		panel_2.add(panel_3_4);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBackground(new Color(128, 128, 128));
		panel_3_2_1.setBounds(513, 415, 100, 100);
		panel_2.add(panel_3_2_1);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBackground(new Color(128, 128, 128));
		panel_3_3_1.setBounds(741, 415, 100, 100);
		panel_2.add(panel_3_3_1);
		
		Label label_2 = new Label("Developer Name");
		label_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2.setBounds(38, 375, 124, 22);
		panel_2.add(label_2);
		
		Label label_2_1 = new Label("Developer Name");
		label_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_1.setBounds(256, 375, 124, 22);
		panel_2.add(label_2_1);
		
		Label label_2_2 = new Label("Developer Name");
		label_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_2.setBounds(500, 375, 124, 22);
		panel_2.add(label_2_2);
		
		Label label_2_3 = new Label("Developer Name");
		label_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_3.setBounds(728, 375, 124, 22);
		panel_2.add(label_2_3);
		
		Label label_2_3_1 = new Label("Developer Name");
		label_2_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_3_1.setBounds(728, 521, 124, 22);
		panel_2.add(label_2_3_1);
		
		Label label_2_4 = new Label("Developer Name");
		label_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_4.setBounds(38, 521, 124, 22);
		panel_2.add(label_2_4);
		
		Label label_2_1_1 = new Label("Developer Name");
		label_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_1_1.setBounds(256, 521, 124, 22);
		panel_2.add(label_2_1_1);
		
		Label label_2_2_1 = new Label("Developer Name");
		label_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2_2_1.setBounds(500, 521, 124, 22);
		panel_2.add(label_2_2_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 248, 867, 2);
		panel_2.add(separator);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBackground(Color.GRAY);
		panel_3_5.setBounds(24, 11, 50, 50);
		panel_2.add(panel_3_5);
		
		JPanel panel_3_5_1 = new JPanel();
		panel_3_5_1.setBackground(Color.GRAY);
		panel_3_5_1.setBounds(84, 11, 50, 50);
		panel_2.add(panel_3_5_1);
		
		JPanel panel_3_5_2 = new JPanel();
		panel_3_5_2.setBackground(Color.GRAY);
		panel_3_5_2.setBounds(144, 11, 50, 50);
		panel_2.add(panel_3_5_2);
		
		JPanel panel_3_5_3 = new JPanel();
		panel_3_5_3.setBackground(Color.GRAY);
		panel_3_5_3.setBounds(204, 11, 50, 50);
		panel_2.add(panel_3_5_3);
		
		JPanel panel_3_5_4 = new JPanel();
		panel_3_5_4.setBackground(Color.GRAY);
		panel_3_5_4.setBounds(264, 11, 50, 50);
		panel_2.add(panel_3_5_4);
		
		JPanel panel_3_5_5 = new JPanel();
		panel_3_5_5.setBackground(Color.GRAY);
		panel_3_5_5.setBounds(324, 11, 50, 50);
		panel_2.add(panel_3_5_5);
		
		JPanel panel_3_5_6 = new JPanel();
		panel_3_5_6.setBackground(Color.GRAY);
		panel_3_5_6.setBounds(384, 11, 50, 50);
		panel_2.add(panel_3_5_6);
		
		JPanel panel_3_5_7 = new JPanel();
		panel_3_5_7.setBackground(Color.GRAY);
		panel_3_5_7.setBounds(444, 11, 50, 50);
		panel_2.add(panel_3_5_7);
		
		JPanel panel_3_5_8 = new JPanel();
		panel_3_5_8.setBackground(Color.GRAY);
		panel_3_5_8.setBounds(504, 11, 50, 50);
		panel_2.add(panel_3_5_8);
		
		JPanel panel_3_5_9 = new JPanel();
		panel_3_5_9.setBackground(Color.GRAY);
		panel_3_5_9.setBounds(564, 11, 50, 50);
		panel_2.add(panel_3_5_9);
		
		JPanel panel_3_5_10 = new JPanel();
		panel_3_5_10.setBackground(Color.GRAY);
		panel_3_5_10.setBounds(624, 11, 50, 50);
		panel_2.add(panel_3_5_10);
		
		JPanel panel_3_5_11 = new JPanel();
		panel_3_5_11.setBackground(Color.GRAY);
		panel_3_5_11.setBounds(684, 11, 50, 50);
		panel_2.add(panel_3_5_11);
		
		JPanel panel_3_5_12 = new JPanel();
		panel_3_5_12.setBackground(Color.GRAY);
		panel_3_5_12.setBounds(742, 11, 50, 50);
		panel_2.add(panel_3_5_12);
		
		JPanel panel_3_5_13 = new JPanel();
		panel_3_5_13.setBackground(Color.GRAY);
		panel_3_5_13.setBounds(802, 11, 50, 50);
		panel_2.add(panel_3_5_13);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1.setBounds(24, 64, 50, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(84, 65, 50, 14);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(144, 65, 50, 14);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Name");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(204, 65, 50, 14);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Name");
		lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_1.setBounds(444, 64, 50, 14);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Name");
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_1.setBounds(384, 64, 50, 14);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(324, 64, 50, 14);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Name");
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(264, 63, 50, 14);
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Name");
		lblNewLabel_1_3_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_2.setBounds(684, 65, 50, 14);
		panel_2.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Name");
		lblNewLabel_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_2.setBounds(624, 65, 50, 14);
		panel_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Name");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(564, 65, 50, 14);
		panel_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Name");
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(504, 64, 50, 14);
		panel_2.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel("Name");
		lblNewLabel_1_3_2_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_2_1.setBounds(802, 64, 50, 14);
		panel_2.add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Name");
		lblNewLabel_1_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_2_1.setBounds(742, 64, 50, 14);
		panel_2.add(lblNewLabel_1_2_2_1);
		
		JPanel panel_3_5_13_1 = new JPanel();
		panel_3_5_13_1.setBackground(Color.GRAY);
		panel_3_5_13_1.setBounds(802, 89, 50, 50);
		panel_2.add(panel_3_5_13_1);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel("Name");
		lblNewLabel_1_3_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_2_1_1.setBounds(802, 142, 50, 14);
		panel_2.add(lblNewLabel_1_3_2_1_1);
		
		JPanel panel_3_5_12_1 = new JPanel();
		panel_3_5_12_1.setBackground(Color.GRAY);
		panel_3_5_12_1.setBounds(742, 89, 50, 50);
		panel_2.add(panel_3_5_12_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Name");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_2_1_1.setBounds(742, 142, 50, 14);
		panel_2.add(lblNewLabel_1_2_2_1_1);
		
		JPanel panel_3_5_11_1 = new JPanel();
		panel_3_5_11_1.setBackground(Color.GRAY);
		panel_3_5_11_1.setBounds(684, 89, 50, 50);
		panel_2.add(panel_3_5_11_1);
		
		JLabel lblNewLabel_1_3_2_2 = new JLabel("Name");
		lblNewLabel_1_3_2_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_2_2.setBounds(684, 143, 50, 14);
		panel_2.add(lblNewLabel_1_3_2_2);
		
		JPanel panel_3_5_10_1 = new JPanel();
		panel_3_5_10_1.setBackground(Color.GRAY);
		panel_3_5_10_1.setBounds(624, 89, 50, 50);
		panel_2.add(panel_3_5_10_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Name");
		lblNewLabel_1_2_2_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_2_2.setBounds(624, 143, 50, 14);
		panel_2.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Name");
		lblNewLabel_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_2_1.setBounds(564, 143, 50, 14);
		panel_2.add(lblNewLabel_1_1_2_1);
		
		JPanel panel_3_5_9_1 = new JPanel();
		panel_3_5_9_1.setBackground(Color.GRAY);
		panel_3_5_9_1.setBounds(564, 89, 50, 50);
		panel_2.add(panel_3_5_9_1);
		
		JPanel panel_3_5_8_1 = new JPanel();
		panel_3_5_8_1.setBackground(Color.GRAY);
		panel_3_5_8_1.setBounds(504, 89, 50, 50);
		panel_2.add(panel_3_5_8_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Name");
		lblNewLabel_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_5_1.setBounds(504, 142, 50, 14);
		panel_2.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Name");
		lblNewLabel_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(444, 142, 50, 14);
		panel_2.add(lblNewLabel_1_3_1_1);
		
		JPanel panel_3_5_7_1 = new JPanel();
		panel_3_5_7_1.setBackground(Color.GRAY);
		panel_3_5_7_1.setBounds(444, 89, 50, 50);
		panel_2.add(panel_3_5_7_1);
		
		JPanel panel_3_5_6_1 = new JPanel();
		panel_3_5_6_1.setBackground(Color.GRAY);
		panel_3_5_6_1.setBounds(384, 89, 50, 50);
		panel_2.add(panel_3_5_6_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Name");
		lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_1_1.setBounds(384, 142, 50, 14);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(324, 142, 50, 14);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_3_5_5_1 = new JPanel();
		panel_3_5_5_1.setBackground(Color.GRAY);
		panel_3_5_5_1.setBounds(324, 89, 50, 50);
		panel_2.add(panel_3_5_5_1);
		
		JPanel panel_3_5_4_1 = new JPanel();
		panel_3_5_4_1.setBackground(Color.GRAY);
		panel_3_5_4_1.setBounds(264, 89, 50, 50);
		panel_2.add(panel_3_5_4_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Name");
		lblNewLabel_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_4_1.setBounds(264, 141, 50, 14);
		panel_2.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Name");
		lblNewLabel_1_3_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_3.setBounds(204, 143, 50, 14);
		panel_2.add(lblNewLabel_1_3_3);
		
		JPanel panel_3_5_3_1 = new JPanel();
		panel_3_5_3_1.setBackground(Color.GRAY);
		panel_3_5_3_1.setBounds(204, 89, 50, 50);
		panel_2.add(panel_3_5_3_1);
		
		JPanel panel_3_5_2_1 = new JPanel();
		panel_3_5_2_1.setBackground(Color.GRAY);
		panel_3_5_2_1.setBounds(144, 89, 50, 50);
		panel_2.add(panel_3_5_2_1);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Name");
		lblNewLabel_1_2_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_3.setBounds(144, 143, 50, 14);
		panel_2.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Name");
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_3.setBounds(84, 143, 50, 14);
		panel_2.add(lblNewLabel_1_1_3);
		
		JPanel panel_3_5_1_1 = new JPanel();
		panel_3_5_1_1.setBackground(Color.GRAY);
		panel_3_5_1_1.setBounds(84, 89, 50, 50);
		panel_2.add(panel_3_5_1_1);
		
		JPanel panel_3_5_14 = new JPanel();
		panel_3_5_14.setBackground(Color.GRAY);
		panel_3_5_14.setBounds(24, 89, 50, 50);
		panel_2.add(panel_3_5_14);
		
		JLabel lblNewLabel_1_6 = new JLabel("Name");
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_6.setBounds(24, 142, 50, 14);
		panel_2.add(lblNewLabel_1_6);
		
		JPanel panel_3_5_13_2 = new JPanel();
		panel_3_5_13_2.setBackground(Color.GRAY);
		panel_3_5_13_2.setBounds(802, 170, 50, 50);
		panel_2.add(panel_3_5_13_2);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("Name");
		lblNewLabel_1_3_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_2_1_2.setBounds(802, 223, 50, 14);
		panel_2.add(lblNewLabel_1_3_2_1_2);
		
		JPanel panel_3_5_12_2 = new JPanel();
		panel_3_5_12_2.setBackground(Color.GRAY);
		panel_3_5_12_2.setBounds(742, 170, 50, 50);
		panel_2.add(panel_3_5_12_2);
		
		JLabel lblNewLabel_1_2_2_1_2 = new JLabel("Name");
		lblNewLabel_1_2_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_2_1_2.setBounds(742, 223, 50, 14);
		panel_2.add(lblNewLabel_1_2_2_1_2);
		
		JPanel panel_3_5_11_2 = new JPanel();
		panel_3_5_11_2.setBackground(Color.GRAY);
		panel_3_5_11_2.setBounds(684, 170, 50, 50);
		panel_2.add(panel_3_5_11_2);
		
		JLabel lblNewLabel_1_3_2_3 = new JLabel("Name");
		lblNewLabel_1_3_2_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_2_3.setBounds(684, 224, 50, 14);
		panel_2.add(lblNewLabel_1_3_2_3);
		
		JPanel panel_3_5_10_2 = new JPanel();
		panel_3_5_10_2.setBackground(Color.GRAY);
		panel_3_5_10_2.setBounds(624, 170, 50, 50);
		panel_2.add(panel_3_5_10_2);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Name");
		lblNewLabel_1_2_2_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_2_3.setBounds(624, 224, 50, 14);
		panel_2.add(lblNewLabel_1_2_2_3);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Name");
		lblNewLabel_1_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_2_2.setBounds(564, 224, 50, 14);
		panel_2.add(lblNewLabel_1_1_2_2);
		
		JPanel panel_3_5_9_2 = new JPanel();
		panel_3_5_9_2.setBackground(Color.GRAY);
		panel_3_5_9_2.setBounds(564, 170, 50, 50);
		panel_2.add(panel_3_5_9_2);
		
		JPanel panel_3_5_8_2 = new JPanel();
		panel_3_5_8_2.setBackground(Color.GRAY);
		panel_3_5_8_2.setBounds(504, 170, 50, 50);
		panel_2.add(panel_3_5_8_2);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("Name");
		lblNewLabel_1_5_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_5_2.setBounds(504, 223, 50, 14);
		panel_2.add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Name");
		lblNewLabel_1_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_1_2.setBounds(444, 223, 50, 14);
		panel_2.add(lblNewLabel_1_3_1_2);
		
		JPanel panel_3_5_7_2 = new JPanel();
		panel_3_5_7_2.setBackground(Color.GRAY);
		panel_3_5_7_2.setBounds(444, 170, 50, 50);
		panel_2.add(panel_3_5_7_2);
		
		JPanel panel_3_5_6_2 = new JPanel();
		panel_3_5_6_2.setBackground(Color.GRAY);
		panel_3_5_6_2.setBounds(384, 170, 50, 50);
		panel_2.add(panel_3_5_6_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Name");
		lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_1_2.setBounds(384, 223, 50, 14);
		panel_2.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Name");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(324, 223, 50, 14);
		panel_2.add(lblNewLabel_1_1_1_2);
		
		JPanel panel_3_5_5_2 = new JPanel();
		panel_3_5_5_2.setBackground(Color.GRAY);
		panel_3_5_5_2.setBounds(324, 170, 50, 50);
		panel_2.add(panel_3_5_5_2);
		
		JPanel panel_3_5_4_2 = new JPanel();
		panel_3_5_4_2.setBackground(Color.GRAY);
		panel_3_5_4_2.setBounds(264, 170, 50, 50);
		panel_2.add(panel_3_5_4_2);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Name");
		lblNewLabel_1_4_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_4_2.setBounds(264, 222, 50, 14);
		panel_2.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Name");
		lblNewLabel_1_3_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_3_4.setBounds(204, 224, 50, 14);
		panel_2.add(lblNewLabel_1_3_4);
		
		JPanel panel_3_5_3_2 = new JPanel();
		panel_3_5_3_2.setBackground(Color.GRAY);
		panel_3_5_3_2.setBounds(204, 170, 50, 50);
		panel_2.add(panel_3_5_3_2);
		
		JPanel panel_3_5_2_2 = new JPanel();
		panel_3_5_2_2.setBackground(Color.GRAY);
		panel_3_5_2_2.setBounds(144, 170, 50, 50);
		panel_2.add(panel_3_5_2_2);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Name");
		lblNewLabel_1_2_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_2_4.setBounds(144, 224, 50, 14);
		panel_2.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Name");
		lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_1_4.setBounds(84, 224, 50, 14);
		panel_2.add(lblNewLabel_1_1_4);
		
		JPanel panel_3_5_1_2 = new JPanel();
		panel_3_5_1_2.setBackground(Color.GRAY);
		panel_3_5_1_2.setBounds(84, 170, 50, 50);
		panel_2.add(panel_3_5_1_2);
		
		JPanel panel_3_5_15 = new JPanel();
		panel_3_5_15.setBackground(Color.GRAY);
		panel_3_5_15.setBounds(24, 170, 50, 50);
		panel_2.add(panel_3_5_15);
		
		JLabel lblNewLabel_1_7 = new JLabel("Name");
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1_7.setBounds(24, 223, 50, 14);
		panel_2.add(lblNewLabel_1_7);
		
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
		panel.setBounds(0, 0, 1274, 641);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Number Activity: ");
		label.setFont(new Font("Arial Black", Font.BOLD, 14));
		label.setBounds(10, 88, 124, 22);
		panel.add(label);
		
		Label label_1 = new Label("Number Sprint:");
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(10, 116, 124, 22);
		panel.add(label_1);
		
		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnStart.setBackground(new Color(128, 0, 128));
		btnStart.setForeground(new Color(255, 255, 255));
		btnStart.setBounds(1123, 11, 141, 35);
		panel.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(new Color(128, 0, 128));
		btnStop.setForeground(new Color(255, 255, 255));
		btnStop.setFont(new Font("Arial", Font.BOLD, 14));
		btnStop.setBounds(1123, 57, 141, 35);
		panel.add(btnStop);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBackground(new Color(128, 0, 128));
		btnReturn.setForeground(new Color(255, 255, 255));
		btnReturn.setFont(new Font("Arial", Font.BOLD, 14));
		btnReturn.setBounds(1123, 103, 141, 35);
		panel.add(btnReturn);
		
		Label label_5 = new Label("(0 / 0)");
		label_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5.setBounds(140, 88, 60, 22);
		panel.add(label_5);
		
		Label label_5_1 = new Label("(0 / 0)");
		label_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_1.setBounds(140, 116, 60, 22);
		panel.add(label_5_1);
	}
}
