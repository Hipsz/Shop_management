package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuGlowne {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGlowne window = new MenuGlowne();
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
	public MenuGlowne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 312, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Dodaj klienta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajKlienta dodaj = new DodajKlienta();
				frame.setVisible(false);
				dodaj.getFrame().setVisible(true);
			}
		});
		btnNewButton.setBounds(21, 39, 264, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Wy\u015Bwietl klient\u00F3w");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WyswietlKlientow wyswietl = new WyswietlKlientow();
				frame.setVisible(false);
				wyswietl.getFrame().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(21, 95, 264, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Dodaj produkt");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajProdukt dodaj = new DodajProdukt();
				frame.setVisible(false);
				dodaj.getFrame().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(21, 151, 264, 35);
		frame.getContentPane().add(btnNewButton_2);
		frame.setLocationRelativeTo(null);
	}
	public Window getFrame() {
		return frame;
	}
	//usuwanie klientow, sprawdzanei ktory najwiecej wydal, klasa nowe zamowienie
}
