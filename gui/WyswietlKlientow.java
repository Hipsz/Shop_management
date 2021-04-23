package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import sklep.Ekstensja;
import sklep.Klient;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class WyswietlKlientow {

	private JFrame frame;
	private DefaultListModel<Klient> klienci = new DefaultListModel<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WyswietlKlientow window = new WyswietlKlientow();
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
	public WyswietlKlientow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BazaDanych"))) {
			Ekstensja.load(ois);
		} catch (Exception e) {
			System.out.println("Brak ekstensji");
		}
		try {

			for (Klient k : Ekstensja.getEkstensja(Klient.class)) {
				klienci.addElement(k);
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

		JList<Klient> list = new JList<>(klienci);
		list.setFont(new Font("Tahoma", Font.PLAIN, 24));
		JScrollPane scroll = new JScrollPane(list);
		scroll.setBounds(21, 21, 393, 322);
		frame.getContentPane().add(scroll);

		JButton btnNewButton = new JButton("Wstecz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuGlowne menu = new MenuGlowne();
				frame.setVisible(false);
				menu.getFrame().setVisible(true);
			}
		});
		btnNewButton.setBounds(103, 501, 211, 35);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Pe\u0142ne dane");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "NIe zaznaczy³eœ klienta");
				}
				Klient wybrany = list.getSelectedValue();
				if (wybrany.getEmial() == null && wybrany.getZnizka() == 0) {
					JOptionPane.showMessageDialog(null,
							wybrany + " " + wybrany.getAdres() + " " + wybrany.getTelefon());
				} else if (wybrany.getEmial() == null) {
					JOptionPane.showMessageDialog(null, wybrany + " " + wybrany.getAdres() + " " + wybrany.getTelefon()
							+ " " + wybrany.getZnizka());
				} else if (wybrany.getZnizka() == 0) {
					JOptionPane.showMessageDialog(null,
							wybrany + " " + wybrany.getAdres() + " " + wybrany.getEmial() + " " + wybrany.getTelefon());
				} else {
					JOptionPane.showMessageDialog(null, wybrany + " " + wybrany.getAdres() + " " + wybrany.getEmial()
							+ " " + wybrany.getTelefon() + " " + wybrany.getZnizka());
				}

			}
		});
		btnNewButton_1.setBounds(103, 364, 211, 35);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Usu\u0144 klienta");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedValue() == null) {
					JOptionPane.showMessageDialog(null, "Nie zanzaczyles klienta");
					return;
				}
				int wybor = JOptionPane.showConfirmDialog(null, "Na pewno chcesz usun¹c?");
				if (wybor == 0) {
					Ekstensja.getEkstensja(Klient.class).remove(list.getSelectedValue());
					JOptionPane.showMessageDialog(null, "Usuniêto klienta " + list.getSelectedValue());
				} else {
					JOptionPane.showMessageDialog(null, "Zrezygnowa³eœ z usuwania");
				}

				try {
					// zapis do ekstensji
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BazaDanych"));
					Ekstensja.save(oos);
					oos.close();
				} catch (Exception e1) {

				}

				frame.setVisible(false);
				WyswietlKlientow wyswietlanie = new WyswietlKlientow();
				wyswietlanie.getFrame().setVisible(true);

			}

		});
		btnNewButton_2.setBounds(103, 411, 211, 35);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Najdro\u017Cszy klient");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, Klient.najdrozszyKlient(Ekstensja.getEkstensja(Klient.class)));
			}
		});
		btnNewButton_3.setBounds(103, 456, 211, 35);
		frame.getContentPane().add(btnNewButton_3);

	}

	public Window getFrame() {
		return frame;
	}
}
