package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JTextField;

import sklep.Ekstensja;
import sklep.Klient;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class DodajKlienta {

	private JFrame frame;
	private JTextField imie;
	private JTextField nazwisko;
	private JTextField adres;
	private JTextField telefon;
	private JTextField email;
	private JTextField textZnizka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKlienta window = new DodajKlienta();
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
	public DodajKlienta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 439, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		// wczytanie ekstensji z pliku
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BazaDanych"))) {
			Ekstensja.load(ois);
			// wyjatek co gdy plik jest pusty
		} catch (Exception e) {
			System.out.println("Brak ekstensji");
		}


		imie = new JTextField();
		imie.setBounds(148, 21, 223, 32);
		frame.getContentPane().add(imie);
		imie.setColumns(10);

		JLabel lblNewLabel = new JLabel("Imie:");
		lblNewLabel.setBounds(21, 24, 92, 26);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nazwisko:");
		lblNewLabel_1.setBounds(21, 71, 92, 26);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Adres:");
		lblNewLabel_2.setBounds(21, 118, 92, 26);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefon:");
		lblNewLabel_3.setBounds(21, 165, 92, 26);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setBounds(21, 212, 92, 26);
		frame.getContentPane().add(lblNewLabel_4);

		nazwisko = new JTextField();
		nazwisko.setBounds(148, 68, 223, 32);
		frame.getContentPane().add(nazwisko);
		nazwisko.setColumns(10);

		adres = new JTextField();
		adres.setBounds(148, 115, 223, 32);
		frame.getContentPane().add(adres);
		adres.setColumns(10);

		telefon = new JTextField();
		telefon.setBounds(148, 162, 223, 32);
		frame.getContentPane().add(telefon);
		telefon.setColumns(10);

		email = new JTextField();
		email.setBounds(148, 209, 223, 32);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		textZnizka = new JTextField();
		textZnizka.setBounds(148, 256, 223, 32);
		frame.getContentPane().add(textZnizka);
		textZnizka.setColumns(10);
	
		JButton btnNewButton = new JButton("Dodaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean flaga = true;

				if (imie.getText().isEmpty()) {
					imie.setBackground(Color.RED);
					flaga = false;
				} else {
					imie.setBackground(Color.WHITE);
				}

				if (nazwisko.getText().isEmpty()) {
					nazwisko.setBackground(Color.RED);
					flaga = false;
				} else {
					nazwisko.setBackground(Color.WHITE);
				}

				if (adres.getText().isEmpty()) {
					adres.setBackground(Color.RED);
					flaga = false;
				} else {
					adres.setBackground(Color.WHITE);
				}

				if (telefon.getText().isEmpty()) {
					telefon.setBackground(Color.RED);
					flaga = false;
				} else {
					telefon.setBackground(Color.WHITE);
				}
				if (!flaga) {
					return;
				}
				String bledy = "Popraw nastepujace pola: \n";
				boolean flaga2 = true;
				if (!imie.getText().matches("[A-Z][a-z]{2,}")) {
					bledy += "imie \n";
					flaga2 = false;
				}

				if (!nazwisko.getText().matches("[A-Z][a-z]{2,}")) {
					bledy += "nazwisko \n";
					flaga2 = false;
				}

				if (!telefon.getText().matches("\\d+")) {
					bledy += "telefon \n";
					flaga2 = false;
				}
				if (!email.getText().isEmpty()) {
					if (!email.getText().matches("^[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,6}")) {
						bledy += "email \n";
						flaga2 = false;
					}
				}
				if (!flaga2) {
					JOptionPane.showMessageDialog(null, bledy);
					return;
				}
				
				Klient klient;
				if(email.getText().isEmpty() && textZnizka.getText().isEmpty()) {
					klient = new Klient(imie.getText(), nazwisko.getText(), adres.getText(), telefon.getText());
				}
				else if(email.getText().isEmpty()) {
					klient = new Klient(imie.getText(), nazwisko.getText(), adres.getText(), telefon.getText(),Double.parseDouble((textZnizka.getText())));
				}
				else if(textZnizka.getText().isEmpty()) {
					klient = new Klient(imie.getText(), nazwisko.getText(), adres.getText(), telefon.getText(), email.getText());
				}
				else {
					klient = new Klient(imie.getText(), nazwisko.getText(), adres.getText(), telefon.getText(), email.getText(), Double.parseDouble((textZnizka.getText())));
				}
				// zapisywanie do ekstencji
				// nowa klasa wyswietlanie klientow
				//
				try {
					// zapis do ekstensji
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BazaDanych"));
					Ekstensja.save(oos);
					oos.close();
				} catch (Exception e1) {

				}
				

				// powrót
				JOptionPane.showMessageDialog(null, "Dodano klienta do bazy");

				frame.setVisible(false);

				DodajKlienta dodanie = new DodajKlienta();
				dodanie.getFrame().setVisible(true);

			}
		});
		btnNewButton.setBounds(251, 321, 141, 35);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Wstecz");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuGlowne menu = new MenuGlowne();
				frame.setVisible(false);
				menu.getFrame().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(21, 321, 141, 35);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_5 = new JLabel("Zni\u017Cka:");
		lblNewLabel_5.setBounds(21, 259, 92, 26);
		frame.getContentPane().add(lblNewLabel_5);

		
	}

	public Window getFrame() {
		return frame;
	}
}
