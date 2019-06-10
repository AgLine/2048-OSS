package org.game.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TileSelect extends JFrame {

	private JPanel contentPane;

	public TileSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#FDE6DB"));
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FDE6DB"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JButton three = new JButton(new ImageIcon("3.png"));
		three.setBorderPainted(false);
		three.setContentAreaFilled(false);
		three.setFocusPainted(false);
		three.setBounds(80,112,320,100);
		panel.add(three);
		three.addActionListener(new ActionListener() {
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
		
		
		JButton four = new JButton(new ImageIcon("4.png"));
		four.setBorderPainted(false);
		four.setContentAreaFilled(false);
		four.setFocusPainted(false);
		four.setBounds(80,222,320,100);
		panel.add(four);
		four.addActionListener(new ActionListener() {
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
		
		JButton five = new JButton(new ImageIcon("5.png"));
		five.setBorderPainted(false);
		five.setContentAreaFilled(false);
		five.setFocusPainted(false);
		five.setBounds(80,332,320,100);
		panel.add(five);
		five.addActionListener(new ActionListener() {
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
		
		JButton six = new JButton(new ImageIcon("6.png"));
		six.setBorderPainted(false);
		six.setContentAreaFilled(false);
		six.setFocusPainted(false);
		six.setBounds(80,442,320,100);
		panel.add(six);
		six.addActionListener(new ActionListener() {
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
		
		JLabel backg = new JLabel(new ImageIcon("tback.png"));
//		backg.setIcon(new ImageIcon("mainbg.png"));
		backg.setBounds(0, -30, 500, 700);
		panel.add(backg);	
	}
}
