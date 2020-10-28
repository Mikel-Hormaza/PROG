package Erronka1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Faktura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faktura frame = new Faktura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Faktura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Izen abizena:");
		lblNewLabel.setBounds(10, 11, 80, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(89, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDninan = new JLabel("DNI/NAN:");
		lblDninan.setBounds(10, 46, 69, 14);
		contentPane.add(lblDninan);
		
		JButton btnNewButton = new JButton("Hurrengoa");
		btnNewButton.setBounds(326, 210, 98, 40);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 43, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Helbidea:");
		lblNewLabel_1.setBounds(10, 82, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 79, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Probintzia:");
		lblNewLabel_1_1.setBounds(10, 119, 69, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(89, 116, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefonoa:");
		lblNewLabel_1_1_1.setBounds(10, 154, 69, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(89, 151, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("CP/Herria");
		lblNewLabel_1_1_1_1.setBounds(10, 187, 69, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(89, 184, 86, 20);
		contentPane.add(textField_5);
	}
}
