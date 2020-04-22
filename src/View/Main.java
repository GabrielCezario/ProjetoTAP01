package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controller.AtividadeController;
import Controller.DesenvolvedorController;
import Controller.SystemController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
	private DesenvolvedorController dc;
	private AtividadeController ac;
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
		loadInitialMethods();
		initialize();
	}
	
	public void loadInitialMethods() {
		SystemController.getNumberOfThreadsFromComputer();
		initDevs();
		initActivity();
	}
	
	private void initDevs() {
		dc = new DesenvolvedorController();
	}

	private void initActivity() {
		ac = new AtividadeController();
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

		JLabel lblDev01 = new JLabel();
		lblDev01.setText(dc.getDeveloperList().get(0).getName());
		lblDev01.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01.setBounds(10, 11, 207, 14);
		Dev01.add(lblDev01);

		JLabel lblActivity01 = new JLabel();
		lblActivity01.setText("New label");
		lblActivity01.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01.setBounds(10, 41, 207, 14);
		Dev01.add(lblActivity01);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(255, 255, 255));
		progressBar.setBounds(10, 414, 250, 24);
		panel_2.add(progressBar);

		JPanel Dev01_1 = new JPanel();
		Dev01_1.setLayout(null);
		Dev01_1.setBounds(270, 337, 250, 66);
		panel_2.add(Dev01_1);

		JLabel lblDev01_1 = new JLabel(dc.getDeveloperList().get(1).getName());
		lblDev01_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_1.setBounds(10, 11, 207, 14);
		Dev01_1.add(lblDev01_1);

		JLabel lblActivity01_1 = new JLabel();
		lblActivity01_1.setText("New Label");
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

		JLabel lblDev01_2 = new JLabel(dc.getDeveloperList().get(2).getName());
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

		JLabel lblDev01_3 = new JLabel(dc.getDeveloperList().get(3).getName());
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

		JLabel lblDev01_3_1 = new JLabel(dc.getDeveloperList().get(4).getName());
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

		JLabel lblDev01_3_2 = new JLabel(dc.getDeveloperList().get(5).getName());
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

		JLabel lblDev01_3_3 = new JLabel(dc.getDeveloperList().get(6).getName());
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

		JLabel lblDev01_3_4 = new JLabel(dc.getDeveloperList().get(7).getName());
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

		Panel panel_todo = new Panel();
		panel_todo.setBackground(new Color(221, 160, 221));
		panel_todo.setBounds(10, 10, 340, 299);
		panel_2.add(panel_todo);
		panel_todo.setLayout(null);

		JLabel todoLabel_1 = new JLabel("TO DO");
		todoLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		todoLabel_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		todoLabel_1.setBounds(121, 11, 83, 17);
		panel_todo.add(todoLabel_1);

		JLabel todoLabel_2 = new JLabel(ac.getSoftActivityList().get(0).getInitialLetters());
		todoLabel_2.setForeground(new Color(255, 255, 255));
		todoLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_2.setBackground(new Color(255, 255, 255));
		todoLabel_2.setBounds(26, 39, 50, 50);
		panel_todo.add(todoLabel_2);

		JLabel todoLabel_3 = new JLabel(ac.getSoftActivityList().get(1).getInitialLetters());
		todoLabel_3.setForeground(Color.WHITE);
		todoLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_3.setBackground(Color.WHITE);
		todoLabel_3.setBounds(86, 39, 50, 50);
		panel_todo.add(todoLabel_3);

		JLabel todoLabel_4 = new JLabel(ac.getSoftActivityList().get(2).getInitialLetters());
		todoLabel_4.setForeground(Color.WHITE);
		todoLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_4.setBackground(Color.WHITE);
		todoLabel_4.setBounds(146, 39, 50, 50);
		panel_todo.add(todoLabel_4);

		JLabel todoLabel_5 = new JLabel(ac.getSoftActivityList().get(3).getInitialLetters());
		todoLabel_5.setForeground(Color.WHITE);
		todoLabel_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_5.setBackground(Color.WHITE);
		todoLabel_5.setBounds(206, 39, 50, 50);
		panel_todo.add(todoLabel_5);

		JLabel todoLabel_6 = new JLabel(ac.getSoftActivityList().get(4).getInitialLetters());
		todoLabel_6.setForeground(Color.WHITE);
		todoLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_6.setBackground(Color.WHITE);
		todoLabel_6.setBounds(266, 39, 50, 50);
		panel_todo.add(todoLabel_6);

		JLabel todoLabel_7 = new JLabel(ac.getSoftActivityList().get(5).getInitialLetters());
		todoLabel_7.setForeground(Color.WHITE);
		todoLabel_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_7.setBackground(Color.WHITE);
		todoLabel_7.setBounds(266, 100, 50, 50);
		panel_todo.add(todoLabel_7);

		JLabel todoLabel_8 = new JLabel(ac.getSoftActivityList().get(6).getInitialLetters());
		todoLabel_8.setForeground(Color.WHITE);
		todoLabel_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_8.setBackground(Color.WHITE);
		todoLabel_8.setBounds(206, 100, 50, 50);
		panel_todo.add(todoLabel_8);

		JLabel todoLabel_9 = new JLabel(ac.getSoftActivityList().get(7).getInitialLetters());
		todoLabel_9.setForeground(Color.WHITE);
		todoLabel_9.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_9.setBackground(Color.WHITE);
		todoLabel_9.setBounds(146, 100, 50, 50);
		panel_todo.add(todoLabel_9);

		JLabel todoLabel_10 = new JLabel(ac.getSoftActivityList().get(8).getInitialLetters());
		todoLabel_10.setForeground(Color.WHITE);
		todoLabel_10.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_10.setBackground(Color.WHITE);
		todoLabel_10.setBounds(86, 100, 50, 50);
		panel_todo.add(todoLabel_10);

		JLabel todoLabel_11 = new JLabel(ac.getSoftActivityList().get(9).getInitialLetters());
		todoLabel_11.setForeground(Color.WHITE);
		todoLabel_11.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_11.setBackground(Color.WHITE);
		todoLabel_11.setBounds(26, 100, 50, 50);
		panel_todo.add(todoLabel_11);

		JLabel todoLabel_12 = new JLabel(ac.getSoftActivityList().get(10).getInitialLetters());
		todoLabel_12.setForeground(Color.WHITE);
		todoLabel_12.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_12.setBackground(Color.WHITE);
		todoLabel_12.setBounds(266, 161, 50, 50);
		panel_todo.add(todoLabel_12);

		JLabel todoLabel_13 = new JLabel(ac.getSoftActivityList().get(11).getInitialLetters());
		todoLabel_13.setForeground(Color.WHITE);
		todoLabel_13.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_13.setBackground(Color.WHITE);
		todoLabel_13.setBounds(206, 161, 50, 50);
		panel_todo.add(todoLabel_13);

		JLabel todoLabel_14 = new JLabel(ac.getSoftActivityList().get(12).getInitialLetters());
		todoLabel_14.setForeground(Color.WHITE);
		todoLabel_14.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_14.setBackground(Color.WHITE);
		todoLabel_14.setBounds(146, 161, 50, 50);
		panel_todo.add(todoLabel_14);

		JLabel todoLabel_15 = new JLabel(ac.getSoftActivityList().get(13).getInitialLetters());
		todoLabel_15.setForeground(Color.WHITE);
		todoLabel_15.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_15.setBackground(Color.WHITE);
		todoLabel_15.setBounds(86, 161, 50, 50);
		panel_todo.add(todoLabel_15);

		JLabel todoLabel_16 = new JLabel(ac.getSoftActivityList().get(14).getInitialLetters());
		todoLabel_16.setForeground(Color.WHITE);
		todoLabel_16.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_16.setBackground(Color.WHITE);
		todoLabel_16.setBounds(26, 161, 50, 50);
		panel_todo.add(todoLabel_16);

		JLabel todoLabel_17 = new JLabel(ac.getSoftActivityList().get(15).getInitialLetters());
		todoLabel_17.setForeground(Color.WHITE);
		todoLabel_17.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_17.setBackground(Color.WHITE);
		todoLabel_17.setBounds(266, 222, 50, 50);
		panel_todo.add(todoLabel_17);

		JLabel todoLabel_18 = new JLabel(ac.getSoftActivityList().get(16).getInitialLetters());
		todoLabel_18.setForeground(Color.WHITE);
		todoLabel_18.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_18.setBackground(Color.WHITE);
		todoLabel_18.setBounds(206, 222, 50, 50);
		panel_todo.add(todoLabel_18);

		JLabel todoLabel_19 = new JLabel(ac.getSoftActivityList().get(17).getInitialLetters());
		todoLabel_19.setForeground(Color.WHITE);
		todoLabel_19.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_19.setBackground(Color.WHITE);
		todoLabel_19.setBounds(146, 222, 50, 50);
		panel_todo.add(todoLabel_19);

		JLabel todoLabel_20 = new JLabel(ac.getSoftActivityList().get(18).getInitialLetters());
		todoLabel_20.setForeground(Color.WHITE);
		todoLabel_20.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_20.setBackground(Color.WHITE);
		todoLabel_20.setBounds(86, 222, 50, 50);
		panel_todo.add(todoLabel_20);

		JLabel todoLabel_21 = new JLabel(ac.getSoftActivityList().get(19).getInitialLetters());
		todoLabel_21.setForeground(Color.WHITE);
		todoLabel_21.setFont(new Font("Arial Black", Font.BOLD, 14));
		todoLabel_21.setBackground(Color.WHITE);
		todoLabel_21.setBounds(26, 222, 50, 50);
		panel_todo.add(todoLabel_21);

		Panel panel_doing = new Panel();
		panel_doing.setBackground(new Color(216, 191, 216));
		panel_doing.setLayout(null);
		panel_doing.setBounds(356, 10, 340, 299);
		panel_2.add(panel_doing);

		JLabel doingLabel_1 = new JLabel("DOING");
		doingLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		doingLabel_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		doingLabel_1.setBounds(124, 11, 76, 25);
		panel_doing.add(doingLabel_1);

		JLabel doingLabel_2 = new JLabel("NAME");
		doingLabel_2.setForeground(Color.WHITE);
		doingLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_2.setBackground(Color.WHITE);
		doingLabel_2.setBounds(27, 39, 50, 50);
		panel_doing.add(doingLabel_2);

		JLabel doingLabel_3 = new JLabel("NAME");
		doingLabel_3.setForeground(Color.WHITE);
		doingLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_3.setBackground(Color.WHITE);
		doingLabel_3.setBounds(87, 39, 50, 50);
		panel_doing.add(doingLabel_3);

		JLabel doingLabel_4 = new JLabel("NAME");
		doingLabel_4.setForeground(Color.WHITE);
		doingLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_4.setBackground(Color.WHITE);
		doingLabel_4.setBounds(147, 39, 50, 50);
		panel_doing.add(doingLabel_4);

		JLabel doingLabel_5 = new JLabel("NAME");
		doingLabel_5.setForeground(Color.WHITE);
		doingLabel_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_5.setBackground(Color.WHITE);
		doingLabel_5.setBounds(207, 39, 50, 50);
		panel_doing.add(doingLabel_5);

		JLabel doingLabel_6 = new JLabel("NAME");
		doingLabel_6.setForeground(Color.WHITE);
		doingLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_6.setBackground(Color.WHITE);
		doingLabel_6.setBounds(267, 39, 50, 50);
		panel_doing.add(doingLabel_6);

		JLabel doingLabel_7 = new JLabel("NAME");
		doingLabel_7.setForeground(Color.WHITE);
		doingLabel_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_7.setBackground(Color.WHITE);
		doingLabel_7.setBounds(267, 100, 50, 50);
		panel_doing.add(doingLabel_7);

		JLabel doingLabel_8 = new JLabel("NAME");
		doingLabel_8.setForeground(Color.WHITE);
		doingLabel_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_8.setBackground(Color.WHITE);
		doingLabel_8.setBounds(207, 100, 50, 50);
		panel_doing.add(doingLabel_8);

		JLabel doingLabel_9 = new JLabel("NAME");
		doingLabel_9.setForeground(Color.WHITE);
		doingLabel_9.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_9.setBackground(Color.WHITE);
		doingLabel_9.setBounds(147, 100, 50, 50);
		panel_doing.add(doingLabel_9);

		JLabel doingLabel_10 = new JLabel("NAME");
		doingLabel_10.setForeground(Color.WHITE);
		doingLabel_10.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_10.setBackground(Color.WHITE);
		doingLabel_10.setBounds(87, 100, 50, 50);
		panel_doing.add(doingLabel_10);

		JLabel doingLabel_11 = new JLabel("NAME");
		doingLabel_11.setForeground(Color.WHITE);
		doingLabel_11.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_11.setBackground(Color.WHITE);
		doingLabel_11.setBounds(27, 100, 50, 50);
		panel_doing.add(doingLabel_11);

		JLabel doingLabel_12 = new JLabel("NAME");
		doingLabel_12.setForeground(Color.WHITE);
		doingLabel_12.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_12.setBackground(Color.WHITE);
		doingLabel_12.setBounds(27, 161, 50, 50);
		panel_doing.add(doingLabel_12);

		JLabel doingLabel_13 = new JLabel("NAME");
		doingLabel_13.setForeground(Color.WHITE);
		doingLabel_13.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_13.setBackground(Color.WHITE);
		doingLabel_13.setBounds(87, 161, 50, 50);
		panel_doing.add(doingLabel_13);

		JLabel doingLabel_14 = new JLabel("NAME");
		doingLabel_14.setForeground(Color.WHITE);
		doingLabel_14.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_14.setBackground(Color.WHITE);
		doingLabel_14.setBounds(147, 161, 50, 50);
		panel_doing.add(doingLabel_14);

		JLabel doingLabel_15 = new JLabel("NAME");
		doingLabel_15.setForeground(Color.WHITE);
		doingLabel_15.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_15.setBackground(Color.WHITE);
		doingLabel_15.setBounds(207, 161, 50, 50);
		panel_doing.add(doingLabel_15);

		JLabel doingLabel_16 = new JLabel("NAME");
		doingLabel_16.setForeground(Color.WHITE);
		doingLabel_16.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_16.setBackground(Color.WHITE);
		doingLabel_16.setBounds(267, 161, 50, 50);
		panel_doing.add(doingLabel_16);

		JLabel doingLabel_17 = new JLabel("NAME");
		doingLabel_17.setForeground(Color.WHITE);
		doingLabel_17.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_17.setBackground(Color.WHITE);
		doingLabel_17.setBounds(267, 222, 50, 50);
		panel_doing.add(doingLabel_17);

		JLabel doingLabel_18 = new JLabel("NAME");
		doingLabel_18.setForeground(Color.WHITE);
		doingLabel_18.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_18.setBackground(Color.WHITE);
		doingLabel_18.setBounds(207, 222, 50, 50);
		panel_doing.add(doingLabel_18);

		JLabel doingLabel_19 = new JLabel("NAME");
		doingLabel_19.setForeground(Color.WHITE);
		doingLabel_19.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_19.setBackground(Color.WHITE);
		doingLabel_19.setBounds(147, 222, 50, 50);
		panel_doing.add(doingLabel_19);

		JLabel doingLabel_20 = new JLabel("NAME");
		doingLabel_20.setForeground(Color.WHITE);
		doingLabel_20.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_20.setBackground(Color.WHITE);
		doingLabel_20.setBounds(87, 222, 50, 50);
		panel_doing.add(doingLabel_20);

		JLabel doingLabel_21 = new JLabel("NAME");
		doingLabel_21.setForeground(Color.WHITE);
		doingLabel_21.setFont(new Font("Arial Black", Font.BOLD, 14));
		doingLabel_21.setBackground(Color.WHITE);
		doingLabel_21.setBounds(27, 222, 50, 50);
		panel_doing.add(doingLabel_21);

		Panel panel_done = new Panel();
		panel_done.setBackground(new Color(221, 160, 221));
		panel_done.setLayout(null);
		panel_done.setBounds(702, 10, 340, 299);
		panel_2.add(panel_done);

		JLabel doneLabel_1 = new JLabel("DONE");
		doneLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		doneLabel_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		doneLabel_1.setBounds(134, 11, 76, 19);
		panel_done.add(doneLabel_1);

		JLabel doneLabel_2 = new JLabel("NAME");
		doneLabel_2.setForeground(Color.WHITE);
		doneLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_2.setBackground(Color.WHITE);
		doneLabel_2.setBounds(28, 38, 50, 50);
		panel_done.add(doneLabel_2);

		JLabel doneLabel_3 = new JLabel("NAME");
		doneLabel_3.setForeground(Color.WHITE);
		doneLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_3.setBackground(Color.WHITE);
		doneLabel_3.setBounds(88, 38, 50, 50);
		panel_done.add(doneLabel_3);

		JLabel doneLabel_4 = new JLabel("NAME");
		doneLabel_4.setForeground(Color.WHITE);
		doneLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_4.setBackground(Color.WHITE);
		doneLabel_4.setBounds(148, 38, 50, 50);
		panel_done.add(doneLabel_4);

		JLabel doneLabel_5 = new JLabel("NAME");
		doneLabel_5.setForeground(Color.WHITE);
		doneLabel_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_5.setBackground(Color.WHITE);
		doneLabel_5.setBounds(208, 38, 50, 50);
		panel_done.add(doneLabel_5);

		JLabel doneLabel_6 = new JLabel("NAME");
		doneLabel_6.setForeground(Color.WHITE);
		doneLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_6.setBackground(Color.WHITE);
		doneLabel_6.setBounds(268, 38, 50, 50);
		panel_done.add(doneLabel_6);

		JLabel doneLabel_7 = new JLabel("NAME");
		doneLabel_7.setForeground(Color.WHITE);
		doneLabel_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_7.setBackground(Color.WHITE);
		doneLabel_7.setBounds(268, 99, 50, 50);
		panel_done.add(doneLabel_7);

		JLabel doneLabel_8 = new JLabel("NAME");
		doneLabel_8.setForeground(Color.WHITE);
		doneLabel_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_8.setBackground(Color.WHITE);
		doneLabel_8.setBounds(208, 99, 50, 50);
		panel_done.add(doneLabel_8);

		JLabel doneLabel_9 = new JLabel("NAME");
		doneLabel_9.setForeground(Color.WHITE);
		doneLabel_9.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_9.setBackground(Color.WHITE);
		doneLabel_9.setBounds(148, 99, 50, 50);
		panel_done.add(doneLabel_9);

		JLabel doneLabel_10 = new JLabel("NAME");
		doneLabel_10.setForeground(Color.WHITE);
		doneLabel_10.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_10.setBackground(Color.WHITE);
		doneLabel_10.setBounds(88, 99, 50, 50);
		panel_done.add(doneLabel_10);

		JLabel doneLabel_11 = new JLabel("NAME");
		doneLabel_11.setForeground(Color.WHITE);
		doneLabel_11.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_11.setBackground(Color.WHITE);
		doneLabel_11.setBounds(28, 99, 50, 50);
		panel_done.add(doneLabel_11);

		JLabel doneLabel_12 = new JLabel("NAME");
		doneLabel_12.setForeground(Color.WHITE);
		doneLabel_12.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_12.setBackground(Color.WHITE);
		doneLabel_12.setBounds(28, 160, 50, 50);
		panel_done.add(doneLabel_12);

		JLabel doneLabel_13 = new JLabel("NAME");
		doneLabel_13.setForeground(Color.WHITE);
		doneLabel_13.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_13.setBackground(Color.WHITE);
		doneLabel_13.setBounds(88, 160, 50, 50);
		panel_done.add(doneLabel_13);

		JLabel doneLabel_14 = new JLabel("NAME");
		doneLabel_14.setForeground(Color.WHITE);
		doneLabel_14.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_14.setBackground(Color.WHITE);
		doneLabel_14.setBounds(148, 160, 50, 50);
		panel_done.add(doneLabel_14);

		JLabel doneLabel_15 = new JLabel("NAME");
		doneLabel_15.setForeground(Color.WHITE);
		doneLabel_15.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_15.setBackground(Color.WHITE);
		doneLabel_15.setBounds(208, 160, 50, 50);
		panel_done.add(doneLabel_15);

		JLabel doneLabel_16 = new JLabel("NAME");
		doneLabel_16.setForeground(Color.WHITE);
		doneLabel_16.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_16.setBackground(Color.WHITE);
		doneLabel_16.setBounds(268, 160, 50, 50);
		panel_done.add(doneLabel_16);

		JLabel doneLabel_17 = new JLabel("NAME");
		doneLabel_17.setForeground(Color.WHITE);
		doneLabel_17.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_17.setBackground(Color.WHITE);
		doneLabel_17.setBounds(268, 221, 50, 50);
		panel_done.add(doneLabel_17);

		JLabel doneLabel_18 = new JLabel("NAME");
		doneLabel_18.setForeground(Color.WHITE);
		doneLabel_18.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_18.setBackground(Color.WHITE);
		doneLabel_18.setBounds(208, 221, 50, 50);
		panel_done.add(doneLabel_18);

		JLabel doneLabel_19 = new JLabel("NAME");
		doneLabel_19.setForeground(Color.WHITE);
		doneLabel_19.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_19.setBackground(Color.WHITE);
		doneLabel_19.setBounds(148, 221, 50, 50);
		panel_done.add(doneLabel_19);

		JLabel doneLabel_20 = new JLabel("NAME");
		doneLabel_20.setForeground(Color.WHITE);
		doneLabel_20.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_20.setBackground(Color.WHITE);
		doneLabel_20.setBounds(88, 221, 50, 50);
		panel_done.add(doneLabel_20);

		JLabel doneLabel_21 = new JLabel("NAME");
		doneLabel_21.setForeground(Color.WHITE);
		doneLabel_21.setFont(new Font("Arial Black", Font.BOLD, 14));
		doneLabel_21.setBackground(Color.WHITE);
		doneLabel_21.setBounds(28, 221, 50, 50);
		panel_done.add(doneLabel_21);

		Panel panel_title = new Panel();
		panel_title.setBackground(new Color(128, 0, 128));
		panel_title.setBounds(0, 0, 230, 78);
		frame.getContentPane().add(panel_title);
		panel_title.setLayout(null);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setText("LOGO DO PROJETO");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 210, 56);
		panel_title.add(lblNewLabel);

		Panel panel_feed = new Panel();
		panel_feed.setBackground(new Color(51, 51, 51));
		panel_feed.setForeground(Color.WHITE);
		panel_feed.setBounds(0, 0, 230, 641);
		frame.getContentPane().add(panel_feed);
		panel_feed.setLayout(null);

		Label label = new Label("AR:");
		label.setFont(new Font("Arial Black", Font.BOLD, 14));
		label.setBounds(10, 209, 124, 22);
		panel_feed.add(label);

		Label label_5 = new Label("( 0 )");
		label_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5.setBounds(140, 209, 60, 22);
		panel_feed.add(label_5);

		JButton btnStart_1 = new JButton("Start");

		btnStart_1.setForeground(Color.WHITE);
		btnStart_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnStart_1.setBackground(new Color(128, 0, 128));
		btnStart_1.setBounds(10, 91, 96, 35);
		panel_feed.add(btnStart_1);

		JButton btnStop_1 = new JButton("Stop");
		btnStop_1.setForeground(Color.WHITE);
		btnStop_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnStop_1.setBackground(new Color(128, 0, 128));
		btnStop_1.setBounds(116, 92, 99, 35);
		panel_feed.add(btnStop_1);

		JLabel lblNewLabel_3 = new JLabel("(00:00:00)");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(29, 148, 161, 35);
		panel_feed.add(lblNewLabel_3);
		
		Label label_1 = new Label("D:");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_1.setBounds(10, 237, 124, 22);
		panel_feed.add(label_1);
		
		Label label_5_1 = new Label("( 0 )");
		label_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_1.setBounds(140, 237, 60, 22);
		panel_feed.add(label_5_1);
		
		Label label_2 = new Label("CT:");
		label_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2.setBounds(10, 265, 124, 22);
		panel_feed.add(label_2);
		
		Label label_5_2 = new Label("( 0 )");
		label_5_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_2.setBounds(140, 265, 60, 22);
		panel_feed.add(label_5_2);
		
		Label label_3 = new Label("FB:");
		label_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_3.setBounds(10, 293, 124, 22);
		panel_feed.add(label_3);
		
		Label label_5_3 = new Label("( 0 )");
		label_5_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_3.setBounds(140, 293, 60, 22);
		panel_feed.add(label_5_3);
		
		Label label_4 = new Label("AB:");
		label_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_4.setBounds(10, 321, 124, 22);
		panel_feed.add(label_4);
		
		Label label_5_4 = new Label("( 0 )");
		label_5_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_4.setBounds(140, 321, 60, 22);
		panel_feed.add(label_5_4);
		
		Label label_6 = new Label("Number Activity: ");
		label_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_6.setBounds(10, 349, 124, 22);
		panel_feed.add(label_6);
		
		Label label_5_5 = new Label("( 0 )");
		label_5_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_5_5.setBounds(140, 349, 60, 22);
		panel_feed.add(label_5_5);
		
		Label label_8 = new Label("AB - Analyzing Backlog");
		label_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_8.setBounds(10, 581, 205, 22);
		panel_feed.add(label_8);
		
		Label label_9 = new Label("FB - Fixing Bugs");
		label_9.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_9.setBounds(10, 553, 205, 22);
		panel_feed.add(label_9);
		
		Label label_10 = new Label("CT - Creating Tests");
		label_10.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_10.setBounds(10, 525, 205, 22);
		panel_feed.add(label_10);
		
		Label label_11 = new Label("D - Developing");
		label_11.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_11.setBounds(10, 497, 205, 22);
		panel_feed.add(label_11);
		
		Label label_12 = new Label("AR - Analyzing Requirements");
		label_12.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_12.setBounds(10, 469, 205, 22);
		panel_feed.add(label_12);
	}
}
