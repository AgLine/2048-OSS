package org.game.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class HelpWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public HelpWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#FDE6DB"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FDE6DB"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("2048");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(0, 0, 430, 137);
		panel.add(label);
		label.setFont(new Font("Verdana", Font.BOLD, 100));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 180, 450, 461);
		panel.add(lblNewLabel);
	
		JButton backbutton = new JButton(new ImageIcon("b.png"));
		backbutton.setBorderPainted(false);
		backbutton.setContentAreaFilled(false);
		backbutton.setFocusPainted(false);
		backbutton.setBounds(400, 570, 80, 80);
		panel.add(backbutton);
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainmenu mainmenu=new Mainmenu();
				mainmenu.setVisible(true);
				dispose();
			}
		
		});
		
	
	}
}
