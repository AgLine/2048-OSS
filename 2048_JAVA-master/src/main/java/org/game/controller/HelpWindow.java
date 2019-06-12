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
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class HelpWindow extends JFrame {

	private JPanel contentPane;
	private Font title;
	private Font regular;
	
	public HelpWindow() {
		title = new Font("�����ھ� �帲 8 Heavy",Font.BOLD,30);
		regular = new Font("�����ھ� �帲 5 Medium",Font.BOLD,18);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#FDE6DB"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		//		
		//		JLabel lblNewLabel = new JLabel();
		//		lblNewLabel.setBounds(12, 180, 450, 461);
		//		panel.add(lblNewLabel);
			
				JButton backbutton = new JButton(new ImageIcon("b.png"));
				backbutton.setBorderPainted(false);
				backbutton.setContentAreaFilled(false);
				backbutton.setFocusPainted(false);
				backbutton.setBounds(380, 550, 80, 80);
				panel.add(backbutton);
				backbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Mainmenu mainmenu=new Mainmenu();
						mainmenu.setVisible(true);
						dispose();
					}
				
				});
		
		JLabel helptitle = new JLabel("���� ���");
		helptitle.setFont(title);
		helptitle.setBounds(20, 30, 150, 50);
		panel.add(helptitle);
		
		JLabel playhelp = new JLabel("<html>����Ű�� ���������� '2'����� �����ϰ� �����ϰ� ���� ���ڰ�  ������ ��������."
				+ " '2048'���� ����� �¸��ϸ�, �̾ �ִ� '8192'������ ������ִ�. ���̻� ���ο� ���� ������ �� ���� ��, ������ ����ȴ�.</html>");
		playhelp.setHorizontalAlignment(SwingConstants.LEFT);
		playhelp.setFont(regular);
		playhelp.setBounds(20,67,430,110);
		panel.add(playhelp);
		
		JLabel twotitle = new JLabel("2�ο�");
		twotitle.setFont(title);
		twotitle.setBounds(20,200,150,40);
		panel.add(twotitle);
		
		JLabel twohelp = new JLabel("<html>1p�� WASD, 2p�� ����Ű�� �����δ� <br>"
				+ "��밡 ���̻� ���� �����Ҽ� ���ų�, ���� �ð��� �� �Ǿ����� ������ ���� �÷��̾ �¸��Ѵ�.");
		twohelp.setFont(regular);
		twohelp.setBounds(20,232,430,100);
		panel.add(twohelp);
		
		JLabel itemtitle=new JLabel("������");
		itemtitle.setFont(title);
		itemtitle.setBounds(20,340,150,40);
		panel.add(itemtitle);
		
		JLabel tpic=new JLabel(new ImageIcon("30.png"));
		tpic.setBounds(20,380,100,100);
		panel.add(tpic);
		
		JLabel thelp=new JLabel("<html>�ش� ���� ��ġ�� ������ �ð� ��<br> 30�ʸ� ����.</html>");
		thelp.setFont(regular);
		thelp.setBounds(140,395,400,50);
		panel.add(thelp);
		
		JLabel ttpic=new JLabel(new ImageIcon("10.png"));
		ttpic.setBounds(20,500,100,100);
		panel.add(ttpic);
		
		JLabel tthelp=new JLabel("<html>�ش� ���� ��ġ�� �ڽ��� �ð�<br> 10�ʸ� ���Ѵ�.</html>");
		tthelp.setFont(regular);
		tthelp.setBounds(140,515,400,50);
		panel.add(tthelp);
		
		JLabel backg = new JLabel(new ImageIcon("tback.png"));
		backg.setBounds(-22, -56, 500, 700);
		panel.add(backg);
		
	
	}
}
