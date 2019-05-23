package org.game.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Newsun extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newsun frame = new Newsun();
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
	public Newsun() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Object[][] matrixGame;
		int j;
		int i;
		String str = ((JTextComponent) matrixGame[i][j]).getText();			
		Object strNeighbour = ((JTextComponent) matrixGame[i][j-1]).getText();	
		if(((String) strNeighbour).compareTo("") == 0)

		textField = new JTextField();
		textField.setFont(new Font("«‘√ ∑“πŸ≈¡", Font.PLAIN, 15));
		textField.setText("2048\uC774 \uB098\uC654\uC2B5\uB2C8\uB2E4 \uC774\uC5B4\uC11C \uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		textField.setBounds(88, 87, 289, 59);
		contentPane.add(textField);
		textField.setColumns(10);
		
	}
	str = matrixGame[i][j].getText();			
	strNeighbour = matrixGame[i][j-1].getText();			


