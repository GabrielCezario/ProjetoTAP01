package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import Controller.AtividadeController;
import Controller.DesenvolvedorController;
import Controller.DeveloperThread;
import Controller.SystemController;

public class Main {
	private DesenvolvedorController dc;
	private AtividadeController ac;
	private JFrame frame;
	
	private static JLabel lblToDo0;
	private static JLabel lblToDo1;
	private static JLabel lblToDo2;
	private static JLabel lblToDo3;
	private static JLabel lblToDo4;
	private static JLabel lblToDo5;
	private static JLabel lblToDo6;
	private static JLabel lblToDo7;
	private static JLabel lblToDo8;
	private static JLabel lblToDo9;
	private static JLabel lblToDo10;
	private static JLabel lblToDo11;
	private static JLabel lblToDo12;
	private static JLabel lblToDo13;
	private static JLabel lblToDo14;
	private static JLabel lblToDo15;
	private static JLabel lblToDo16;
	private static JLabel lblToDo17;
	private static JLabel lblToDo18;
	private static JLabel lblToDo19;
	
	private static JLabel lblDoing0;
	private static JLabel lblDoing1;
	private static JLabel lblDoing2;
	private static JLabel lblDoing3;
	private static JLabel lblDoing4;
	private static JLabel lblDoing5;
	private static JLabel lblDoing6;
	private static JLabel lblDoing7;
	
	private static JLabel lblDone0;
	private static JLabel lblDone1;
	private static JLabel lblDone2;
	private static JLabel lblDone3;
	private static JLabel lblDone4;
	private static JLabel lblDone5;
	private static JLabel lblDone6;
	private static JLabel lblDone7;
	private static JLabel lblDone8;
	private static JLabel lblDone9;
	private static JLabel lblDone10;
	private static JLabel lblDone11;
	private static JLabel lblDone12;
	private static JLabel lblDone13;
	private static JLabel lblDone14;
	private static JLabel lblDone15;
	private static JLabel lblDone16;
	private static JLabel lblDone17;
	private static JLabel lblDone18;
	private static JLabel lblDone19;
	
	private static Label lblArCont;
	private static Label lblDCont;
	private static Label lblCtCont;
	private static Label lblFbCont;
	private static Label lblAbCont;
	private static Label lblNaCont;
	
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
		initComponents();
	}
	
	private void initComponents() {
		dc = new DesenvolvedorController();
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

		Panel MainContent = new Panel();
		MainContent.setBackground(new Color(255, 255, 255));
		MainContent.setBounds(225, 0, 1049, 642);
		frame.getContentPane().add(MainContent);
		MainContent.setLayout(null);

		JPanel Dev01 = new JPanel();
		Dev01.setBounds(10, 355, 250, 66);
		MainContent.add(Dev01);
		Dev01.setLayout(null);

		JLabel lblDev01 = new JLabel();
		lblDev01.setText(dc.getListDevelopers().get(0).getName());
		lblDev01.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01.setBounds(10, 11, 207, 14);
		Dev01.add(lblDev01);

		JLabel lblActivity01 = new JLabel();
		lblActivity01.setText(dc.getListDevelopers().get(0).getDevCategory());
		lblActivity01.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01.setBounds(10, 41, 207, 14);
		Dev01.add(lblActivity01);

		JProgressBar progressDev0 = new JProgressBar();
		progressDev0.setStringPainted(true);
		progressDev0.setToolTipText("");
		progressDev0.setBackground(Color.WHITE);
		progressDev0.setBounds(10, 432, 250, 24);
		MainContent.add(progressDev0);

		JPanel Dev01_1 = new JPanel();
		Dev01_1.setLayout(null);
		Dev01_1.setBounds(270, 355, 250, 66);
		MainContent.add(Dev01_1);

		JLabel lblDev01_1 = new JLabel(dc.getListDevelopers().get(1).getName());
		lblDev01_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_1.setBounds(10, 11, 207, 14);
		Dev01_1.add(lblDev01_1);

		JLabel lblActivity01_1 = new JLabel(dc.getListDevelopers().get(1).getDevCategory());
		lblActivity01_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_1.setBounds(10, 41, 207, 14);
		Dev01_1.add(lblActivity01_1);

		JProgressBar progressDev1 = new JProgressBar();
		progressDev1.setStringPainted(true);
		progressDev1.setBounds(270, 432, 250, 24);
		MainContent.add(progressDev1);

		JPanel Dev01_2 = new JPanel();
		Dev01_2.setLayout(null);
		Dev01_2.setBounds(530, 355, 250, 66);
		MainContent.add(Dev01_2);

		JLabel lblDev01_2 = new JLabel(dc.getListDevelopers().get(2).getName());
		lblDev01_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_2.setBounds(10, 11, 207, 14);
		Dev01_2.add(lblDev01_2);

		JLabel lblActivity01_2 = new JLabel();
		lblActivity01_2.setText(dc.getListDevelopers().get(2).getDevCategory());
		lblActivity01_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_2.setBounds(10, 41, 207, 14);
		Dev01_2.add(lblActivity01_2);

		JProgressBar progressDev2 = new JProgressBar();
		progressDev2.setStringPainted(true);
		progressDev2.setBounds(530, 432, 250, 24);
		MainContent.add(progressDev2);

		JPanel Dev01_3 = new JPanel();
		Dev01_3.setLayout(null);
		Dev01_3.setBounds(789, 355, 250, 66);
		MainContent.add(Dev01_3);

		JLabel lblDev01_3 = new JLabel(dc.getListDevelopers().get(3).getName());
		lblDev01_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3.setBounds(10, 11, 207, 14);
		Dev01_3.add(lblDev01_3);

		JLabel lblActivity01_3 = new JLabel();
		lblActivity01_3.setText(dc.getListDevelopers().get(3).getDevCategory());
		lblActivity01_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3.setBounds(10, 41, 207, 14);
		Dev01_3.add(lblActivity01_3);

		JProgressBar progressDev3 = new JProgressBar();
		progressDev3.setStringPainted(true);
		progressDev3.setBounds(789, 432, 250, 24);
		MainContent.add(progressDev3);

		JPanel Dev01_3_1 = new JPanel();
		Dev01_3_1.setLayout(null);
		Dev01_3_1.setBounds(10, 496, 250, 66);
		MainContent.add(Dev01_3_1);

		JLabel lblDev01_3_1 = new JLabel(dc.getListDevelopers().get(4).getName());
		lblDev01_3_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_1.setBounds(10, 11, 207, 14);
		Dev01_3_1.add(lblDev01_3_1);

		JLabel lblActivity01_3_1 = new JLabel();
		lblActivity01_3_1.setText(dc.getListDevelopers().get(4).getDevCategory());
		lblActivity01_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_1.setBounds(10, 41, 207, 14);
		Dev01_3_1.add(lblActivity01_3_1);

		JProgressBar progressDev4 = new JProgressBar();
		progressDev4.setStringPainted(true);
		progressDev4.setBounds(10, 573, 250, 24);
		MainContent.add(progressDev4);

		JPanel Dev01_3_2 = new JPanel();
		Dev01_3_2.setLayout(null);
		Dev01_3_2.setBounds(270, 496, 250, 66);
		MainContent.add(Dev01_3_2);

		JLabel lblDev01_3_2 = new JLabel(dc.getListDevelopers().get(5).getName());
		lblDev01_3_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_2.setBounds(10, 11, 207, 14);
		Dev01_3_2.add(lblDev01_3_2);

		JLabel lblActivity01_3_2 = new JLabel();
		lblActivity01_3_2.setText(dc.getListDevelopers().get(5).getDevCategory());
		lblActivity01_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_2.setBounds(10, 41, 207, 14);
		Dev01_3_2.add(lblActivity01_3_2);

		JProgressBar progressDev5 = new JProgressBar();
		progressDev5.setStringPainted(true);
		progressDev5.setBounds(270, 573, 250, 24);
		MainContent.add(progressDev5);

		JPanel Dev01_3_3 = new JPanel();
		Dev01_3_3.setLayout(null);
		Dev01_3_3.setBounds(530, 496, 250, 66);
		MainContent.add(Dev01_3_3);

		JLabel lblDev01_3_3 = new JLabel(dc.getListDevelopers().get(6).getName());
		lblDev01_3_3.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_3.setBounds(10, 11, 207, 14);
		Dev01_3_3.add(lblDev01_3_3);

		JLabel lblActivity01_3_3 = new JLabel();
		lblActivity01_3_3.setText(dc.getListDevelopers().get(6).getDevCategory());
		lblActivity01_3_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_3.setBounds(10, 41, 207, 14);
		Dev01_3_3.add(lblActivity01_3_3);

		JProgressBar progressDev6 = new JProgressBar();
		progressDev6.setStringPainted(true);
		progressDev6.setBounds(530, 573, 250, 24);
		MainContent.add(progressDev6);

		JPanel Dev01_3_4 = new JPanel();
		Dev01_3_4.setLayout(null);
		Dev01_3_4.setBounds(789, 496, 250, 66);
		MainContent.add(Dev01_3_4);

		JLabel lblDev01_3_4 = new JLabel(dc.getListDevelopers().get(7).getName());
		lblDev01_3_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDev01_3_4.setBounds(10, 11, 207, 14);
		Dev01_3_4.add(lblDev01_3_4);

		JLabel lblActivity01_3_4 = new JLabel();
		lblActivity01_3_4.setText(dc.getListDevelopers().get(7).getDevCategory());
		lblActivity01_3_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivity01_3_4.setBounds(10, 41, 207, 14);
		Dev01_3_4.add(lblActivity01_3_4);

		JProgressBar progressDev7 = new JProgressBar();
		progressDev7.setStringPainted(true);
		progressDev7.setBounds(789, 573, 250, 24);
		MainContent.add(progressDev7);

		Panel panel_todo = new Panel();
		panel_todo.setBackground(new Color(221, 160, 221));
		panel_todo.setBounds(10, 10, 340, 299);
		MainContent.add(panel_todo);
		panel_todo.setLayout(null);

		JLabel lblToDo = new JLabel("TO DO");
		lblToDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblToDo.setBounds(121, 11, 83, 17);
		panel_todo.add(lblToDo);

		lblToDo0 = new JLabel(AtividadeController.getSoftActivityList().get(0).getInitialLetters());
		lblToDo0.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo0.setForeground(new Color(255, 255, 255));
		lblToDo0.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo0.setBackground(new Color(255, 255, 255));		
		lblToDo0.setBounds(26, 39, 50, 50);
		panel_todo.add(lblToDo0);

		lblToDo1 = new JLabel(AtividadeController.getSoftActivityList().get(1).getInitialLetters());
		lblToDo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo1.setForeground(Color.WHITE);
		lblToDo1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo1.setBackground(Color.WHITE);
		lblToDo1.setBounds(86, 39, 50, 50);
		panel_todo.add(lblToDo1);

		lblToDo2 = new JLabel(AtividadeController.getSoftActivityList().get(2).getInitialLetters());
		lblToDo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo2.setForeground(Color.WHITE);
		lblToDo2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo2.setBackground(Color.WHITE);
		lblToDo2.setBounds(146, 39, 50, 50);
		panel_todo.add(lblToDo2);

		lblToDo3 = new JLabel(AtividadeController.getSoftActivityList().get(3).getInitialLetters());
		lblToDo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo3.setForeground(Color.WHITE);
		lblToDo3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo3.setBackground(Color.WHITE);
		lblToDo3.setBounds(206, 39, 50, 50);
		panel_todo.add(lblToDo3);

		lblToDo4 = new JLabel(AtividadeController.getSoftActivityList().get(4).getInitialLetters());
		lblToDo4.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo4.setForeground(Color.WHITE);
		lblToDo4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo4.setBackground(Color.WHITE);
		lblToDo4.setBounds(266, 39, 50, 50);
		panel_todo.add(lblToDo4);

		lblToDo8 = new JLabel(AtividadeController.getSoftActivityList().get(6).getInitialLetters());
		lblToDo8.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo8.setForeground(Color.WHITE);
		lblToDo8.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo8.setBackground(Color.WHITE);
		lblToDo8.setBounds(206, 100, 50, 50);
		panel_todo.add(lblToDo8);

		lblToDo7 = new JLabel(AtividadeController.getSoftActivityList().get(7).getInitialLetters());
		lblToDo7.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo7.setForeground(Color.WHITE);
		lblToDo7.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo7.setBackground(Color.WHITE);
		lblToDo7.setBounds(146, 100, 50, 50);
		panel_todo.add(lblToDo7);

		lblToDo5 = new JLabel(AtividadeController.getSoftActivityList().get(9).getInitialLetters());
		lblToDo5.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo5.setForeground(Color.WHITE);
		lblToDo5.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo5.setBackground(Color.WHITE);
		lblToDo5.setBounds(26, 100, 50, 50);
		panel_todo.add(lblToDo5);

		lblToDo9 = new JLabel(AtividadeController.getSoftActivityList().get(5).getInitialLetters());
		lblToDo9.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo9.setForeground(Color.WHITE);
		lblToDo9.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo9.setBackground(Color.WHITE);
		lblToDo9.setBounds(266, 100, 50, 50);
		panel_todo.add(lblToDo9);

		lblToDo6 = new JLabel(AtividadeController.getSoftActivityList().get(8).getInitialLetters());
		lblToDo6.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo6.setForeground(Color.WHITE);
		lblToDo6.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo6.setBackground(Color.WHITE);
		lblToDo6.setBounds(86, 100, 50, 50);
		panel_todo.add(lblToDo6);

		lblToDo13 = new JLabel(AtividadeController.getSoftActivityList().get(11).getInitialLetters());
		lblToDo13.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo13.setForeground(Color.WHITE);
		lblToDo13.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo13.setBackground(Color.WHITE);
		lblToDo13.setBounds(206, 161, 50, 50);
		panel_todo.add(lblToDo13);

		lblToDo12 = new JLabel(AtividadeController.getSoftActivityList().get(12).getInitialLetters());
		lblToDo12.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo12.setForeground(Color.WHITE);
		lblToDo12.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo12.setBackground(Color.WHITE);
		lblToDo12.setBounds(146, 161, 50, 50);
		panel_todo.add(lblToDo12);

		lblToDo11 = new JLabel(AtividadeController.getSoftActivityList().get(13).getInitialLetters());
		lblToDo11.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo11.setForeground(Color.WHITE);
		lblToDo11.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo11.setBackground(Color.WHITE);
		lblToDo11.setBounds(86, 161, 50, 50);
		panel_todo.add(lblToDo11);

		lblToDo10 = new JLabel(AtividadeController.getSoftActivityList().get(14).getInitialLetters());
		lblToDo10.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo10.setForeground(Color.WHITE);
		lblToDo10.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo10.setBackground(Color.WHITE);
		lblToDo10.setBounds(26, 161, 50, 50);
		panel_todo.add(lblToDo10);

		lblToDo15 = new JLabel(AtividadeController.getSoftActivityList().get(19).getInitialLetters());
		lblToDo15.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo15.setForeground(Color.WHITE);
		lblToDo15.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo15.setBackground(Color.WHITE);
		lblToDo15.setBounds(26, 222, 50, 50);
		panel_todo.add(lblToDo15);

		lblToDo16 = new JLabel(AtividadeController.getSoftActivityList().get(18).getInitialLetters());
		lblToDo16.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo16.setForeground(Color.WHITE);
		lblToDo16.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo16.setBackground(Color.WHITE);
		lblToDo16.setBounds(86, 222, 50, 50);
		panel_todo.add(lblToDo16);

		lblToDo14 = new JLabel(AtividadeController.getSoftActivityList().get(10).getInitialLetters());
		lblToDo14.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo14.setForeground(Color.WHITE);
		lblToDo14.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo14.setBackground(Color.WHITE);
		lblToDo14.setBounds(266, 161, 50, 50);
		panel_todo.add(lblToDo14);

		lblToDo17 = new JLabel(AtividadeController.getSoftActivityList().get(17).getInitialLetters());
		lblToDo17.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo17.setForeground(Color.WHITE);
		lblToDo17.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo17.setBackground(Color.WHITE);
		lblToDo17.setBounds(146, 222, 50, 50);
		panel_todo.add(lblToDo17);

		lblToDo18 = new JLabel(AtividadeController.getSoftActivityList().get(16).getInitialLetters());
		lblToDo18.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo18.setForeground(Color.WHITE);
		lblToDo18.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo18.setBackground(Color.WHITE);
		lblToDo18.setBounds(206, 222, 50, 50);
		panel_todo.add(lblToDo18);

		lblToDo19 = new JLabel(AtividadeController.getSoftActivityList().get(15).getInitialLetters());
		lblToDo19.setHorizontalAlignment(SwingConstants.CENTER);
		lblToDo19.setForeground(Color.WHITE);
		lblToDo19.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblToDo19.setBackground(Color.WHITE);
		lblToDo19.setBounds(266, 222, 50, 50);
		panel_todo.add(lblToDo19);

		Panel panel_doing = new Panel();
		panel_doing.setBackground(new Color(216, 191, 216));
		panel_doing.setLayout(null);
		panel_doing.setBounds(356, 10, 340, 299);
		MainContent.add(panel_doing);

		JLabel lblDoing = new JLabel("DOING");
		lblDoing.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblDoing.setBounds(124, 11, 76, 25);
		panel_doing.add(lblDoing);

		lblDoing0 = new JLabel("*");
		lblDoing0.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing0.setForeground(Color.WHITE);
		lblDoing0.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing0.setBackground(Color.WHITE);
		lblDoing0.setBounds(37, 58, 50, 50);
		panel_doing.add(lblDoing0);

		lblDoing1 = new JLabel("*");
		lblDoing1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing1.setForeground(Color.WHITE);
		lblDoing1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing1.setBackground(Color.WHITE);
		lblDoing1.setBounds(116, 58, 50, 50);
		panel_doing.add(lblDoing1);

		lblDoing2 = new JLabel("*");
		lblDoing2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing2.setForeground(Color.WHITE);
		lblDoing2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing2.setBackground(Color.WHITE);
		lblDoing2.setBounds(187, 58, 50, 50);
		panel_doing.add(lblDoing2);

		lblDoing3 = new JLabel("*");
		lblDoing3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing3.setForeground(Color.WHITE);
		lblDoing3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing3.setBackground(Color.WHITE);
		lblDoing3.setBounds(265, 58, 50, 50);
		panel_doing.add(lblDoing3);

		lblDoing4 = new JLabel("*");
		lblDoing4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing4.setForeground(Color.WHITE);
		lblDoing4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing4.setBackground(Color.WHITE);
		lblDoing4.setBounds(37, 191, 50, 50);
		panel_doing.add(lblDoing4);

		lblDoing7 = new JLabel("*");
		lblDoing7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing7.setForeground(Color.WHITE);
		lblDoing7.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing7.setBackground(Color.WHITE);
		lblDoing7.setBounds(265, 191, 50, 50);
		panel_doing.add(lblDoing7);

		lblDoing6 = new JLabel("*");
		lblDoing6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing6.setForeground(Color.WHITE);
		lblDoing6.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing6.setBackground(Color.WHITE);
		lblDoing6.setBounds(187, 191, 50, 50);
		panel_doing.add(lblDoing6);

		lblDoing5 = new JLabel("*");
		lblDoing5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoing5.setForeground(Color.WHITE);
		lblDoing5.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDoing5.setBackground(Color.WHITE);
		lblDoing5.setBounds(116, 191, 50, 50);
		panel_doing.add(lblDoing5);

		Panel panel_done = new Panel();
		panel_done.setBackground(new Color(221, 160, 221));
		panel_done.setLayout(null);
		panel_done.setBounds(702, 10, 340, 299);
		MainContent.add(panel_done);

		JLabel lblDone = new JLabel("DONE");
		lblDone.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblDone.setBounds(134, 11, 76, 19);
		panel_done.add(lblDone);

		lblDone0 = new JLabel("*");
		lblDone0.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone0.setForeground(Color.WHITE);
		lblDone0.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone0.setBackground(Color.WHITE);
		lblDone0.setBounds(28, 38, 50, 50);
		panel_done.add(lblDone0);

		lblDone1 = new JLabel("*");
		lblDone1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone1.setForeground(Color.WHITE);
		lblDone1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone1.setBackground(Color.WHITE);
		lblDone1.setBounds(88, 38, 50, 50);
		panel_done.add(lblDone1);

		lblDone2 = new JLabel("*");
		lblDone2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone2.setForeground(Color.WHITE);
		lblDone2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone2.setBackground(Color.WHITE);
		lblDone2.setBounds(148, 38, 50, 50);
		panel_done.add(lblDone2);

		lblDone3 = new JLabel("*");
		lblDone3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone3.setForeground(Color.WHITE);
		lblDone3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone3.setBackground(Color.WHITE);
		lblDone3.setBounds(208, 38, 50, 50);
		panel_done.add(lblDone3);

		lblDone4 = new JLabel("*");
		lblDone4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone4.setForeground(Color.WHITE);
		lblDone4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone4.setBackground(Color.WHITE);
		lblDone4.setBounds(268, 38, 50, 50);
		panel_done.add(lblDone4);

		lblDone9 = new JLabel("*");
		lblDone9.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone9.setForeground(Color.WHITE);
		lblDone9.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone9.setBackground(Color.WHITE);
		lblDone9.setBounds(268, 99, 50, 50);
		panel_done.add(lblDone9);

		lblDone8 = new JLabel("*");
		lblDone8.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone8.setForeground(Color.WHITE);
		lblDone8.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone8.setBackground(Color.WHITE);
		lblDone8.setBounds(208, 99, 50, 50);
		panel_done.add(lblDone8);

		lblDone7 = new JLabel("*");
		lblDone7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone7.setForeground(Color.WHITE);
		lblDone7.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone7.setBackground(Color.WHITE);
		lblDone7.setBounds(148, 99, 50, 50);
		panel_done.add(lblDone7);

		lblDone6 = new JLabel("*");
		lblDone6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone6.setForeground(Color.WHITE);
		lblDone6.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone6.setBackground(Color.WHITE);
		lblDone6.setBounds(88, 99, 50, 50);
		panel_done.add(lblDone6);

		lblDone5 = new JLabel("*");
		lblDone5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone5.setForeground(Color.WHITE);
		lblDone5.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone5.setBackground(Color.WHITE);
		lblDone5.setBounds(28, 99, 50, 50);
		panel_done.add(lblDone5);

		lblDone10 = new JLabel("*");
		lblDone10.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone10.setForeground(Color.WHITE);
		lblDone10.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone10.setBackground(Color.WHITE);
		lblDone10.setBounds(28, 160, 50, 50);
		panel_done.add(lblDone10);

		lblDone11 = new JLabel("*");
		lblDone11.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone11.setForeground(Color.WHITE);
		lblDone11.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone11.setBackground(Color.WHITE);
		lblDone11.setBounds(88, 160, 50, 50);
		panel_done.add(lblDone11);

		lblDone12 = new JLabel("*");
		lblDone12.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone12.setForeground(Color.WHITE);
		lblDone12.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone12.setBackground(Color.WHITE);
		lblDone12.setBounds(148, 160, 50, 50);
		panel_done.add(lblDone12);

		lblDone13 = new JLabel("*");
		lblDone13.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone13.setForeground(Color.WHITE);
		lblDone13.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone13.setBackground(Color.WHITE);
		lblDone13.setBounds(208, 160, 50, 50);
		panel_done.add(lblDone13);

		lblDone14 = new JLabel("*");
		lblDone14.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone14.setForeground(Color.WHITE);
		lblDone14.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone14.setBackground(Color.WHITE);
		lblDone14.setBounds(268, 160, 50, 50);
		panel_done.add(lblDone14);

		lblDone19 = new JLabel("*");
		lblDone19.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone19.setForeground(Color.WHITE);
		lblDone19.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone19.setBackground(Color.WHITE);
		lblDone19.setBounds(268, 221, 50, 50);
		panel_done.add(lblDone19);

		lblDone18 = new JLabel("*");
		lblDone18.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone18.setForeground(Color.WHITE);
		lblDone18.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone18.setBackground(Color.WHITE);
		lblDone18.setBounds(208, 221, 50, 50);
		panel_done.add(lblDone18);

		lblDone17 = new JLabel("*");
		lblDone17.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone17.setForeground(Color.WHITE);
		lblDone17.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone17.setBackground(Color.WHITE);
		lblDone17.setBounds(148, 221, 50, 50);
		panel_done.add(lblDone17);

		lblDone16 = new JLabel("*");
		lblDone16.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone16.setForeground(Color.WHITE);
		lblDone16.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone16.setBackground(Color.WHITE);
		lblDone16.setBounds(88, 221, 50, 50);
		panel_done.add(lblDone16);

		lblDone15 = new JLabel("*");
		lblDone15.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone15.setForeground(Color.WHITE);
		lblDone15.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDone15.setBackground(Color.WHITE);
		lblDone15.setBounds(28, 221, 50, 50);
		panel_done.add(lblDone15);

		Panel PanelLogo = new Panel();
		PanelLogo.setBackground(new Color(128, 0, 128));
		PanelLogo.setBounds(0, 0, 230, 78);
		frame.getContentPane().add(PanelLogo);
		PanelLogo.setLayout(null);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setText("LOGO DO PROJETO");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 210, 56);
		PanelLogo.add(lblNewLabel);

		Panel PanelRelatorio = new Panel();
		PanelRelatorio.setBackground(new Color(51, 51, 51));
		PanelRelatorio.setForeground(Color.WHITE);
		PanelRelatorio.setBounds(0, 0, 230, 641);
		frame.getContentPane().add(PanelRelatorio);
		PanelRelatorio.setLayout(null);

		Label label = new Label("AR:");
		label.setFont(new Font("Arial Black", Font.BOLD, 14));
		label.setBounds(10, 165, 124, 22);
		PanelRelatorio.add(label);

		lblArCont = new Label(String.valueOf(SystemController.totalAnalyzingRequirements));
		lblArCont.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblArCont.setBounds(135, 165, 60, 22);
		PanelRelatorio.add(lblArCont);

		JButton btnStart_1 = new JButton("Start");
		btnStart_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DeveloperThread developerThread0 = new DeveloperThread(dc.getListDevelopers().get(0), progressDev0);
				DeveloperThread developerThread1 = new DeveloperThread(dc.getListDevelopers().get(1), progressDev1);
				DeveloperThread developerThread2 = new DeveloperThread(dc.getListDevelopers().get(2), progressDev2);
				DeveloperThread developerThread3 = new DeveloperThread(dc.getListDevelopers().get(3), progressDev3);
				DeveloperThread developerThread4 = new DeveloperThread(dc.getListDevelopers().get(4), progressDev4);
				DeveloperThread developerThread5 = new DeveloperThread(dc.getListDevelopers().get(5), progressDev5);
				DeveloperThread developerThread6 = new DeveloperThread(dc.getListDevelopers().get(6), progressDev6);
				DeveloperThread developerThread7 = new DeveloperThread(dc.getListDevelopers().get(7), progressDev7);

				developerThread0.start();
				developerThread1.start();
				developerThread2.start();
				developerThread3.start();
				developerThread4.start();
				developerThread5.start();
				developerThread6.start();
				developerThread7.start();

			}
		});

		btnStart_1.setForeground(Color.WHITE);
		btnStart_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnStart_1.setBackground(new Color(128, 0, 128));
		btnStart_1.setBounds(10, 91, 96, 35);
		PanelRelatorio.add(btnStart_1);

		JButton btnStop_1 = new JButton("Stop");
		btnStop_1.setForeground(Color.WHITE);
		btnStop_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnStop_1.setBackground(new Color(128, 0, 128));
		btnStop_1.setBounds(116, 92, 99, 35);
		PanelRelatorio.add(btnStop_1);

		Label label_1 = new Label("D:");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_1.setBounds(10, 193, 124, 22);
		PanelRelatorio.add(label_1);

		lblDCont = new Label(String.valueOf(SystemController.totalDeveloping));
		lblDCont.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblDCont.setBounds(135, 193, 60, 22);
		PanelRelatorio.add(lblDCont);

		Label label_2 = new Label("CT:");
		label_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_2.setBounds(10, 221, 124, 22);
		PanelRelatorio.add(label_2);

		lblCtCont = new Label(String.valueOf(SystemController.totalCreatingTests));
		lblCtCont.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCtCont.setBounds(135, 221, 60, 22);
		PanelRelatorio.add(lblCtCont);

		Label label_3 = new Label("FB:");
		label_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_3.setBounds(10, 249, 124, 22);
		PanelRelatorio.add(label_3);

		lblFbCont = new Label(String.valueOf(SystemController.totalFixingBugs));
		lblFbCont.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblFbCont.setBounds(135, 249, 60, 22);
		PanelRelatorio.add(lblFbCont);

		Label label_4 = new Label("AB:");
		label_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_4.setBounds(10, 277, 124, 22);
		PanelRelatorio.add(label_4);

		lblAbCont = new Label(String.valueOf(SystemController.totalAnalyzingBackLogs));
		lblAbCont.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblAbCont.setBounds(135, 277, 60, 22);
		PanelRelatorio.add(lblAbCont);

		Label label_6 = new Label("Number Activity: ");
		label_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_6.setBounds(10, 305, 124, 22);
		PanelRelatorio.add(label_6);

		lblNaCont = new Label(String.valueOf(SystemController.totalActivityDone));
		lblNaCont.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNaCont.setBounds(135, 305, 29, 22);
		PanelRelatorio.add(lblNaCont);

		Label label_8 = new Label("AB - Analyzing Backlog");
		label_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_8.setBounds(10, 581, 205, 22);
		PanelRelatorio.add(label_8);

		Label label_9 = new Label("FB - Fixing Bugs");
		label_9.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_9.setBounds(10, 553, 205, 22);
		PanelRelatorio.add(label_9);

		Label label_10 = new Label("CT - Creating Tests");
		label_10.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_10.setBounds(10, 525, 205, 22);
		PanelRelatorio.add(label_10);

		Label label_11 = new Label("D - Developing");
		label_11.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_11.setBounds(10, 497, 205, 22);
		PanelRelatorio.add(label_11);

		Label label_12 = new Label("AR - Analyzing Requirements");
		label_12.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_12.setBounds(10, 469, 205, 22);
		PanelRelatorio.add(label_12);
		
		Label lblNaCont_1 = new Label(String.valueOf(SystemController.numberOfActivityToDo));
		lblNaCont_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNaCont_1.setBounds(183, 305, 37, 22);
		PanelRelatorio.add(lblNaCont_1);
		
		Label lblNaCont_2 = new Label("/");
		lblNaCont_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNaCont_2.setBounds(170, 305, 15, 22);
		PanelRelatorio.add(lblNaCont_2);
	}
	
	public static void updateCounters() {
		lblArCont.setText(String.valueOf(SystemController.totalAnalyzingRequirements));
		lblDCont.setText(String.valueOf(SystemController.totalDeveloping));
		lblCtCont.setText(String.valueOf(SystemController.totalCreatingTests));
		lblFbCont.setText(String.valueOf(SystemController.totalFixingBugs));
		lblAbCont.setText(String.valueOf(SystemController.totalAnalyzingBackLogs));
		lblNaCont.setText(String.valueOf(SystemController.totalActivityDone));
	}
	
	public static void updateLabelsToDo() {
		
		try {
			if (AtividadeController.getSoftActivityList().get(0) != null) {
				lblToDo0.setText(AtividadeController.getSoftActivityList().get(0).getInitialLetters());
			} else {
				lblToDo0.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo0.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(1) != null) {
				lblToDo1.setText(AtividadeController.getSoftActivityList().get(1).getInitialLetters());
			} else {
				lblToDo1.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo1.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(2) != null) {
				lblToDo2.setText(AtividadeController.getSoftActivityList().get(2).getInitialLetters());
			} else {
				lblToDo2.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo2.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(3) != null) {
				lblToDo3.setText(AtividadeController.getSoftActivityList().get(3).getInitialLetters());
			} else {
				lblToDo3.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo3.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(4) != null) {
				lblToDo4.setText(AtividadeController.getSoftActivityList().get(4).getInitialLetters());
			} else {
				lblToDo4.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo4.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(5) != null) {
				lblToDo5.setText(AtividadeController.getSoftActivityList().get(5).getInitialLetters());
			} else {
				lblToDo5.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo5.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(6) != null) {
				lblToDo6.setText(AtividadeController.getSoftActivityList().get(6).getInitialLetters());
			} else {
				lblToDo6.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo6.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(7) != null) {
				lblToDo7.setText(AtividadeController.getSoftActivityList().get(7).getInitialLetters());
			} else {
				lblToDo7.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo7.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(8) != null) {
				lblToDo8.setText(AtividadeController.getSoftActivityList().get(8).getInitialLetters());
			} else {
				lblToDo8.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo8.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(9) != null) {
				lblToDo9.setText(AtividadeController.getSoftActivityList().get(9).getInitialLetters());
			} else {
				lblToDo9.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo9.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(10) != null) {
				lblToDo10.setText(AtividadeController.getSoftActivityList().get(10).getInitialLetters());
			} else {
				lblToDo10.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo10.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(11) != null) {
				lblToDo11.setText(AtividadeController.getSoftActivityList().get(11).getInitialLetters());
			} else {
				lblToDo11.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo11.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(12) != null) {
				lblToDo12.setText(AtividadeController.getSoftActivityList().get(12).getInitialLetters());
			} else {
				lblToDo12.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo12.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(13) != null) {
				lblToDo13.setText(AtividadeController.getSoftActivityList().get(13).getInitialLetters());
			} else {
				lblToDo13.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo13.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(14) != null) {
				lblToDo14.setText(AtividadeController.getSoftActivityList().get(14).getInitialLetters());
			} else {
				lblToDo14.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo14.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(15) != null) {
				lblToDo15.setText(AtividadeController.getSoftActivityList().get(15).getInitialLetters());
			} else {
				lblToDo15.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo15.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(16) != null) {
				lblToDo16.setText(AtividadeController.getSoftActivityList().get(16).getInitialLetters());
			} else {
				lblToDo16.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo16.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(17) != null) {
				lblToDo17.setText(AtividadeController.getSoftActivityList().get(17).getInitialLetters());
			} else {
				lblToDo17.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo17.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(18) != null) {
				lblToDo18.setText(AtividadeController.getSoftActivityList().get(18).getInitialLetters());
			} else {
				lblToDo18.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo18.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityList().get(19) != null) {
				lblToDo19.setText(AtividadeController.getSoftActivityList().get(19).getInitialLetters());
			} else {
				lblToDo19.setText(" * ");
			}
		} catch (Exception e) {
			lblToDo19.setText(" * ");
		}
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void updateLabelsDoing() {
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(0) != null) {
				lblDoing0.setText(AtividadeController.getSoftActivityListDoing().get(0).getInitialLetters());
			} else {
				lblDoing0.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing0.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(1) != null) {
				lblDoing1.setText(AtividadeController.getSoftActivityListDoing().get(1).getInitialLetters());
			} else {
				lblDoing1.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing1.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(2) != null) {
				lblDoing2.setText(AtividadeController.getSoftActivityListDoing().get(2).getInitialLetters());
			} else {
				lblDoing2.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing2.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(3) != null) {
				lblDoing3.setText(AtividadeController.getSoftActivityListDoing().get(3).getInitialLetters());
			} else {
				lblDoing3.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing3.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(4) != null) {
				lblDoing4.setText(AtividadeController.getSoftActivityListDoing().get(4).getInitialLetters());
			} else {
				lblDoing4.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing4.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(5) != null) {
				lblDoing5.setText(AtividadeController.getSoftActivityListDoing().get(5).getInitialLetters());
			} else {
				lblDoing5.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing5.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(6) != null) {
				lblDoing6.setText(AtividadeController.getSoftActivityListDoing().get(6).getInitialLetters());
			} else {
				lblDoing6.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing6.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDoing().get(7) != null) {
				lblDoing7.setText(AtividadeController.getSoftActivityListDoing().get(7).getInitialLetters());
			} else {
				lblDoing7.setText(" * ");
			}
		} catch (Exception e) {
			lblDoing7.setText(" * ");
		}
		
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static void updateLabelsDone() {
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(0) != null) {
				lblDone0.setText(AtividadeController.getSoftActivityListDone().get(0).getInitialLetters());
			} else {
				lblDone0.setText(" * ");
			}
		} catch (Exception e) {
			lblDone0.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(1) != null) {
				lblDone1.setText(AtividadeController.getSoftActivityListDone().get(1).getInitialLetters());
			} else {
				lblDone1.setText(" * ");
			}
		} catch (Exception e) {
			lblDone1.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(2) != null) {
				lblDone2.setText(AtividadeController.getSoftActivityListDone().get(2).getInitialLetters());
			} else {
				lblDone2.setText(" * ");
			}
		} catch (Exception e) {
			lblDone2.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(3) != null) {
				lblDone3.setText(AtividadeController.getSoftActivityListDone().get(3).getInitialLetters());
			} else {
				lblDone3.setText(" * ");
			}
		} catch (Exception e) {
			lblDone3.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(4) != null) {
				lblDone4.setText(AtividadeController.getSoftActivityListDone().get(4).getInitialLetters());
			} else {
				lblDone4.setText(" * ");
			}
		} catch (Exception e) {
			lblDone4.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(5) != null) {
				lblDone5.setText(AtividadeController.getSoftActivityListDone().get(5).getInitialLetters());
			} else {
				lblDone5.setText(" * ");
			}
		} catch (Exception e) {
			lblDone5.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(6) != null) {
				lblDone6.setText(AtividadeController.getSoftActivityListDone().get(6).getInitialLetters());
			} else {
				lblDone6.setText(" * ");
			}
		} catch (Exception e) {
			lblDone6.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(7) != null) {
				lblDone7.setText(AtividadeController.getSoftActivityListDone().get(7).getInitialLetters());
			} else {
				lblDone7.setText(" * ");
			}
		} catch (Exception e) {
			lblDone7.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(8) != null) {
				lblDone8.setText(AtividadeController.getSoftActivityListDone().get(8).getInitialLetters());
			} else {
				lblDone8.setText(" * ");
			}
		} catch (Exception e) {
			lblDone8.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(9) != null) {
				lblDone9.setText(AtividadeController.getSoftActivityListDone().get(9).getInitialLetters());
			} else {
				lblDone9.setText(" * ");
			}
		} catch (Exception e) {
			lblDone9.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(10) != null) {
				lblDone10.setText(AtividadeController.getSoftActivityListDone().get(10).getInitialLetters());
			} else {
				lblDone10.setText(" * ");
			}
		} catch (Exception e) {
			lblDone10.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(11) != null) {
				lblDone11.setText(AtividadeController.getSoftActivityListDone().get(11).getInitialLetters());
			} else {
				lblDone11.setText(" * ");
			}
		} catch (Exception e) {
			lblDone11.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(12) != null) {
				lblDone12.setText(AtividadeController.getSoftActivityListDone().get(12).getInitialLetters());
			} else {
				lblDone12.setText(" * ");
			}
		} catch (Exception e) {
			lblDone12.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(13) != null) {
				lblDone13.setText(AtividadeController.getSoftActivityListDone().get(13).getInitialLetters());
			} else {
				lblDone13.setText(" * ");
			}
		} catch (Exception e) {
			lblDone13.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(14) != null) {
				lblDone14.setText(AtividadeController.getSoftActivityListDone().get(14).getInitialLetters());
			} else {
				lblDone14.setText(" * ");
			}
		} catch (Exception e) {
			lblDone14.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(15) != null) {
				lblDone15.setText(AtividadeController.getSoftActivityListDone().get(15).getInitialLetters());
			} else {
				lblDone15.setText(" * ");
			}
		} catch (Exception e) {
			lblDone15.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(16) != null) {
				lblDone16.setText(AtividadeController.getSoftActivityListDone().get(16).getInitialLetters());
			} else {
				lblDone16.setText(" * ");
			}
		} catch (Exception e) {
			lblDone16.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(17) != null) {
				lblDone17.setText(AtividadeController.getSoftActivityListDone().get(17).getInitialLetters());
			} else {
				lblDone17.setText(" * ");
			}
		} catch (Exception e) {
			lblDone17.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(18) != null) {
				lblDone18.setText(AtividadeController.getSoftActivityListDone().get(18).getInitialLetters());
			} else {
				lblDone18.setText(" * ");
			}
		} catch (Exception e) {
			lblDone18.setText(" * ");
		}
		
		try {
			if (AtividadeController.getSoftActivityListDone().get(19) != null) {
				lblDone19.setText(AtividadeController.getSoftActivityListDone().get(19).getInitialLetters());
			} else {
				lblDone19.setText(" * ");
			}
		} catch (Exception e) {
			lblDone19.setText(" * ");
		}
		
	}
}
