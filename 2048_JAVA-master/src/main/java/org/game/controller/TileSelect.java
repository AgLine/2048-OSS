package org.game.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

public class TileSelect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TileSelect frame = new TileSelect();
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
	public TileSelect() {
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
		
		JButton btnOnePlayer = new JButton("3   ¡¿   3");
		btnOnePlayer.setBounds(137, 250, 200, 41);
		btnOnePlayer.setBackground(Color.WHITE);
		panel.add(btnOnePlayer);
		btnOnePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GameMainWindow join = new GameMainWindow(1);
					join.setVisible(true);
					dispose();
			}catch(ParserConfigurationException | SAXException
					| IOException a) {
				a.printStackTrace();
			}
				}}
		);
		
		
		JButton btnNewButton = new JButton("4   ¡¿   4");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(137, 300, 200, 41);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a2) {
				try {
					GameMainWindow join = new GameMainWindow(2);
					join.setVisible(true);
					dispose();
			}catch(ParserConfigurationException | SAXException
					| IOException a) {
				a.printStackTrace();
			}
			}
		});
		
		JButton btnNewButton_1 = new JButton("5   ¡¿   5");
		btnNewButton_1.setBounds(137, 350, 200, 41);
		btnNewButton_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a3) {
				try {
					GameMainWindow join = new GameMainWindow(3);
					join.setVisible(true);
					dispose();
			}catch(ParserConfigurationException | SAXException
					| IOException a) {
				a.printStackTrace();
			}
		}
	});
		
		JButton btnNewButton_2 = new JButton("6   ¡¿   6");
		btnNewButton_2.setBounds(137, 400, 200, 41);
		btnNewButton_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a4) {
					try {
						GameMainWindow join = new GameMainWindow(4);
						join.setVisible(true);
						dispose();
				}catch(ParserConfigurationException | SAXException
						| IOException a) {
					a.printStackTrace();
				}
		}
	});
	}

}
