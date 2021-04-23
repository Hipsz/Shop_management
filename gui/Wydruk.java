package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import sklep.Rodzaj;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Wydruk {

	private JFrame frame;
	private JTextField textOplata;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wydruk window = new Wydruk();
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
	public Wydruk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 416, 284);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("Rodzaj");
		lblNewLabel.setBounds(21, 40, 92, 26);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Dodatkowa op\u0142ata");
		lblNewLabel_1.setBounds(21, 93, 186, 32);
		frame.getContentPane().add(lblNewLabel_1);

		textOplata = new JTextField();
		textOplata.setBounds(228, 90, 138, 32);
		frame.getContentPane().add(textOplata);
		textOplata.setColumns(10);
		
		JComboBox<Rodzaj> comboRodzaj = new JComboBox<>();
		comboRodzaj.setBounds(228, 37, 138, 32);
		frame.getContentPane().add(comboRodzaj);
		for (Rodzaj r : Rodzaj.values()) {
			comboRodzaj.addItem(r);
		}

		JButton btnNewButton = new JButton("Wstecz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DodajProdukt produkt = new DodajProdukt();
				frame.setVisible(false);
				produkt.getFrame().setVisible(true);
			}
		});
		btnNewButton.setBounds(21, 155, 141, 35);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Dodaj");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textOplata.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Zostawi³es puste pole");
					return;
				}
				if(textOplata.getText().matches(regex))

			}
		});
		btnNewButton_1.setBounds(225, 155, 141, 35);
		frame.getContentPane().add(btnNewButton_1);

		
	}

	public Window getFrame() {
		return frame;
	}
}
