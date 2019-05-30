package org.game.controller;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Mainmenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Mainmenu ex=null;
				try {
						ex=new Mainmenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ex.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainmenu() {
		setTitle("2048");
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
		
		JButton btnOnePlayer = new JButton("One Player");
		btnOnePlayer.setBounds(137, 257, 200, 41);
		btnOnePlayer.setBackground(Color.WHITE);
		panel.add(btnOnePlayer);
		btnOnePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TyleSelect tyle = new TyleSelect();
				tyle.setVisible(true);
				dispose();
				}}
		);
		
		JButton btnNewButton = new JButton("Two Player");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(137, 335, 200, 41);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a2) {
				try {
					GameMainWindow join = new GameMainWindow(5);
					join.setVisible(true);
					dispose();
			}catch(ParserConfigurationException | SAXException
					| IOException a) {
				a.printStackTrace();
			}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Help");
		btnNewButton_1.setBounds(137, 406, 200, 41);
		btnNewButton_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a3) {
				HelpWindow help = new HelpWindow();
				help.setVisible(true);
				dispose();
		}
	});
		
		
		JLabel label = new JLabel("2048");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(0, 0, 430, 209);
		panel.add(label);
		label.setFont(new Font("Verdana", Font.BOLD, 135));
	}
}

/*
 * public static void main(String[] args) {
 * 
 * EventQueue.invokeLater(new Runnable() {
 * 
 * @Override public void run() { GameMainWindow ex = null; try { ex = new
 * GameMainWindow(); } catch (ParserConfigurationException | SAXException |
 * IOException e) { e.printStackTrace(); } ex.setVisible(true); } }); }
 */