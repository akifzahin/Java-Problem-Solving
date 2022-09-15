package com.AkifZahin.Lab_Exercises.Lab16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Calculator extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	  //Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 51));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		frame.setBounds(800, 300, 841, 439);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 204));
		panel.setBounds(8, 10, 731, 382);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(8, 10, 715, 55);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Calculator");
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(8, 10, 693, 42);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 102));
		panel_2.setBounds(8, 75, 715, 284);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(204, 204, 153));
		panel_3.setBounds(8, 72, 310, 180);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Choose Operation");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(8, 10, 294, 35);
		panel_3.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(105, 105, 105));
		separator.setForeground(new Color(105, 105, 105));
		separator.setBounds(10, 40, 292, 20);
		panel_3.add(separator);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textField.getText());
					num2 = Double.parseDouble(textField_1.getText());
					result = num1 + num2;
					textField_2.setText(""+result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(8, 55, 136, 21);
		panel_3.add(btnNewButton);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textField.getText());
					num2 = Double.parseDouble(textField_1.getText());
					result = num1 - num2;
					textField_2.setText(""+result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubtract.setBounds(8, 86, 136, 21);
		panel_3.add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textField.getText());
					num2 = Double.parseDouble(textField_1.getText());
					result = num1 * num2;
					textField_2.setText(""+result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMultiply.setBounds(152, 55, 150, 21);
		panel_3.add(btnMultiply);
		
		JButton btnDivide_1 = new JButton("Divide");
		btnDivide_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textField.getText());
					num2 = Double.parseDouble(textField_1.getText());
					result = num1 / num2;
					textField_2.setText(""+result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}
			}
		});
		btnDivide_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivide_1.setBounds(152, 86, 150, 21);
		panel_3.add(btnDivide_1);
		
		JButton btnPower = new JButton("Power");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textField.getText());
					num2 = Double.parseDouble(textField_1.getText());
					result = Math.pow(num1, num2);
					textField_2.setText(""+result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}
			}
		});
		btnPower.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPower.setBounds(8, 117, 136, 21);
		panel_3.add(btnPower);
		
		JButton btnModulo = new JButton("Modulo");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textField.getText());
					num2 = Double.parseDouble(textField_1.getText());
					result = num1 % num2;
					textField_2.setText(""+result);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}
			}
		});
		btnModulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModulo.setBounds(152, 117, 150, 21);
		panel_3.add(btnModulo);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(102, 204, 204));
		panel_4.setBounds(326, 72, 381, 180);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Result");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(8, 10, 365, 52);
		panel_4.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 59, 133, 31);
		panel_4.add(textField_2);
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnClearAll.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClearAll.setBounds(113, 112, 161, 31);
		panel_4.add(btnClearAll);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 1st Number");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(8, 10, 187, 52);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(203, 30, 115, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(521, 30, 115, 19);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter 2nd Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(326, 10, 187, 52);
		panel_2.add(lblNewLabel_1_1);
		frame.setBounds(700, 300, 761, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	}
}
