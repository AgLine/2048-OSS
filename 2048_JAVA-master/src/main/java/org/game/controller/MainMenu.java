package org.game.controller;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.xml.sax.SAXException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainMenu ex=null;
				try {
						ex=new MainMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ex.setVisible(true);
			}
		});
	}
	
	public MainMenu() {
		setTitle("2048");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#FDE6DB"));
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JButton btnOnePlayer = new JButton(new ImageIcon("image/One player.png"));
		btnOnePlayer.setBorderPainted(false);
		btnOnePlayer.setContentAreaFilled(false);
		btnOnePlayer.setFocusPainted(false);
		btnOnePlayer.setBounds(80, 189, 330, 100);
		btnOnePlayer.setBackground(Color.decode("#d5e5f2"));
		panel.add(btnOnePlayer);
		btnOnePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TileSelect tyle = new TileSelect();
				tyle.setVisible(true);
				dispose();
				}}
		);
		
		
		JButton btnTwoPlayer = new JButton(new ImageIcon("image/Two Player.png"));
		btnTwoPlayer.setBorderPainted(false);
		btnTwoPlayer.setContentAreaFilled(false);
		btnTwoPlayer.setFocusPainted(false);
		btnTwoPlayer.setBounds(80, 299, 330, 100);
		panel.add(btnTwoPlayer);
		btnTwoPlayer.addActionListener(new ActionListener() {
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
		
		JButton btnHelp = new JButton(new ImageIcon("image/Help.png"));
		btnHelp.setBorderPainted(false);
		btnHelp.setContentAreaFilled(false);
		btnHelp.setFocusPainted(false);
		btnHelp.setBounds(80, 409, 330, 100);
		panel.add(btnHelp);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a3) {
				HelpWindow help = new HelpWindow();
				help.setVisible(true);
				dispose();
		}
	});
		
		JButton Close = new JButton(new ImageIcon("image/Close.png"));
		Close.setBorderPainted(false);
		Close.setContentAreaFilled(false);
		Close.setFocusPainted(false);
		Close.setBounds(80, 519, 330, 100);
		panel.add(Close);
		Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a4) {
				System.exit(0);	
		}
	});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("image/mainbg.png"));
		lblNewLabel.setBounds(0, -30, 500, 700);
		panel.add(lblNewLabel);
	}
}
