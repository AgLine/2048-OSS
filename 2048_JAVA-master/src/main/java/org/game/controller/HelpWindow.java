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
		title = new Font("에스코어 드림 8 Heavy",Font.BOLD,30);
		regular = new Font("에스코어 드림 5 Medium",Font.BOLD,18);
		
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
		
		JLabel helptitle = new JLabel("게임 방식");
		helptitle.setFont(title);
		helptitle.setBounds(20, 30, 150, 50);
		panel.add(helptitle);
		
		JLabel playhelp = new JLabel("<html>방향키를 누를때마다 '2'블록이 랜덤하게 등장하고 같은 숫자가  만나면 합쳐진다."
				+ " '2048'블럭을 만들면 승리하며, 이어서 최대 '8192'블럭까지 만들수있다. 더이상 새로운 블럭을 생성할 수 없을 때, 게임이 종료된다.</html>");
		playhelp.setHorizontalAlignment(SwingConstants.LEFT);
		playhelp.setFont(regular);
		playhelp.setBounds(20,67,430,110);
		panel.add(playhelp);
		
		JLabel twotitle = new JLabel("2인용");
		twotitle.setFont(title);
		twotitle.setBounds(20,200,150,40);
		panel.add(twotitle);
		
		JLabel twohelp = new JLabel("<html>1p는 WASD, 2p는 방향키로 움직인다 <br>"
				+ "상대가 더이상 블럭을 생성할수 없거나, 게임 시간이 다 되었을때 점수가 높은 플레이어가 승리한다.");
		twohelp.setFont(regular);
		twohelp.setBounds(20,232,430,100);
		panel.add(twohelp);
		
		JLabel itemtitle=new JLabel("아이템");
		itemtitle.setFont(title);
		itemtitle.setBounds(20,340,150,40);
		panel.add(itemtitle);
		
		JLabel tpic=new JLabel(new ImageIcon("30.png"));
		tpic.setBounds(20,380,100,100);
		panel.add(tpic);
		
		JLabel thelp=new JLabel("<html>해당 블럭을 합치면 상대방의 시간 중<br> 30초를 뺀다.</html>");
		thelp.setFont(regular);
		thelp.setBounds(140,395,400,50);
		panel.add(thelp);
		
		JLabel ttpic=new JLabel(new ImageIcon("10.png"));
		ttpic.setBounds(20,500,100,100);
		panel.add(ttpic);
		
		JLabel tthelp=new JLabel("<html>해당 블럭을 합치면 자신의 시간<br> 10초를 더한다.</html>");
		tthelp.setFont(regular);
		tthelp.setBounds(140,515,400,50);
		panel.add(tthelp);
		
		JLabel backg = new JLabel(new ImageIcon("tback.png"));
		backg.setBounds(-22, -56, 500, 700);
		panel.add(backg);
		
	
	}
}
