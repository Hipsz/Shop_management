package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Logowanie {

	private JFrame frame;
	private JTextField textFieldLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logowanie window = new Logowanie();
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
	public Logowanie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 280, 267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().setLayout(null);

		JTextPane tekstLogin = new JTextPane();
		tekstLogin.setText("Login:");
		tekstLogin.setBounds(21, 31, 63, 32);
		frame.getContentPane().add(tekstLogin);

		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(93, 31, 165, 32);
		frame.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);

		JTextPane tekstHaslo = new JTextPane();
		tekstHaslo.setText("Has\u0142o:");
		tekstHaslo.setBounds(21, 100, 63, 32);
		frame.getContentPane().add(tekstHaslo);

		passwordField = new JPasswordField();
		passwordField.setBounds(93, 100, 165, 32);
		frame.getContentPane().add(passwordField);
		frame.setLocationRelativeTo(null);

		JButton buttonLogin = new JButton("Zaloguj");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (textFieldLogin.getText().equals("admin") && porownanieHasel(passwordField.getPassword())) {
					MenuGlowne menu = new MenuGlowne();
					frame.setVisible(false);
					menu.getFrame().setVisible(true);

				}
				else {
					JOptionPane.showMessageDialog(null, "niepoprawny login lub haslo");
				}
			}
		});
		buttonLogin.setBounds(75, 167, 141, 35);
		frame.getContentPane().add(buttonLogin);
	}

	public static boolean porownanieHasel(char[] wprowadzoneHaslo) {

		char[] poprawneHaslo = { 'q', 'w', 'e', 'r', 't', 'y' };

		return Arrays.equals(wprowadzoneHaslo, poprawneHaslo);
	}
}
