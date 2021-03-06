package org.game.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import java.util.Random;

import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.game.model.BestScore;
import org.game.view.GameScore;
import org.game.view.GameNewCell;
import org.game.view.GameKeyEvent;
import org.game.view.GameMatrix;
import org.game.view.GameOver;
import org.xml.sax.SAXException;



public class GameMainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private int Score;
	private JLabel[][] matrixGame;
	private JLabel[][] matrixGame2;
	private Font Ftitle;
	private Font Fsmall;
	
	int is = 0, js = 0;//i= 1p 타이머를 위한 변수 j=2p 타이머를 위한 변수
	static Random random = new Random();
	int firstItem = random.nextInt(10);
	int secondItem = random.nextInt(10);
	int firstItemCnt = 4, secondItemCnt = 4;
	
	
	int i,j,t;

	protected Timer timer;
	
	public GameMainWindow(int tilenum) throws ParserConfigurationException, SAXException, IOException{
		super();
		this.t = tilenum; 
		Ftitle= new Font("Clear Sans",Font.BOLD,90);
		Fsmall= new Font("Clear Sans",Font.BOLD,15);
		System.out.println(t);
		setTitle("Game Java 2048");
		getContentPane().setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null); //This line will center the window on the screen.
	    //2인용일 경우의 타이머,size = 1125,700
	    //1인용일 경우 size = 500,700
	    final JLabel firstTimer = new JLabel();
		firstTimer.setText(String.valueOf(100));
		firstTimer.setFont(new Font("", Font.BOLD,80));
		firstTimer.setForeground(Color.decode("#776e65"));
		firstTimer.setBounds(345, 70, 200, 70);
	
		
		final JLabel secondTimer = new JLabel();
		secondTimer.setText(String.valueOf(100));
		secondTimer.setFont(new Font("", Font.BOLD,80));
		secondTimer.setForeground(Color.decode("#776e65"));
		secondTimer.setBounds(965, 80, 200, 70);
	
	    if(tilenum==5)
	    {
	    	setSize(1135,700);
	    	getContentPane().add(firstTimer);
	    	getContentPane().add(secondTimer);
			
			timer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					firstTimer.setText(String.valueOf(100-is));
					++is;
					secondTimer.setText(String.valueOf(100-js));
					++js;
					if(is == 101) {
						GameOver.secondWin();
						timer.stop();
						is = 0;
						js = 0;
					}else if(js == 101) {
						GameOver.firstWin();
						timer.stop();
						is = 0;
						js = 0;
					}
				}
			});		
	    }
	    else
	    {
	    	setSize(520,700);
	    }
	    setDefaultCloseOperation(EXIT_ON_CLOSE);//Exit the application using the Systexit method.
	    /*
		 * Components
		 */
		JLabel gameTitle = new JLabel();
		gameTitle.setText("2048");
		gameTitle.setFont(Ftitle);
		gameTitle.setForeground(Color.decode("#776e65"));
		gameTitle.setBounds(20, 50, 300, 100);
		getContentPane().add(gameTitle);
		
		final JTextField currentScore = new JTextField(" SCORE :0");
		currentScore.setOpaque(true); 
		currentScore.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		currentScore.setForeground(Color.decode("#A19191"));
		currentScore.setFont(Fsmall);
		currentScore.setBounds(350, 20, 130, 50);
		currentScore.setEditable(false);
		getContentPane().add(currentScore);

		final JTextField currentScore2 = new JTextField(" SCORE :0");
		currentScore2.setOpaque(true); 
		currentScore2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		currentScore2.setForeground(Color.decode("#A19191"));
		currentScore2.setFont(Fsmall);
		currentScore2.setBounds(970, 20, 130, 50);
		currentScore2.setEditable(false);
		getContentPane().add(currentScore2);

		
		final JLabel bestScore = new JLabel();

		bestScore.setText(" BEST :0");
		bestScore.setOpaque(true); 
		bestScore.setBackground(Color.decode("#bbada0"));
		bestScore.setForeground(Color.WHITE);
		bestScore.setFont(new Font("", Font.BOLD,15));
		bestScore.setBounds(350, 20, 130, 50);
		
		JButton newGame = new JButton();
		newGame.setText("Back");
		newGame.setFont(Fsmall);
		newGame.setBackground(Color.decode("#D6C1CB"));
		newGame.setBorderPainted(false);
		newGame.setForeground(Color.decode("#f9f6f2"));
		if(t == 5) {
			newGame.setBounds(500, 80, 130, 30);
		}else {
			newGame.setBounds(350, 80, 130, 30);
		}
		
		getContentPane().add(newGame);
		
		JLabel copyRight = new JLabel();
		copyRight.setText("짤 2014 Chuan Dong. Simulation of game 2048 by Java Swing");
		copyRight.setFont(new Font("", Font.BOLD,10));
		copyRight.setBounds(20, 630, 150, 50);
		getContentPane().add(copyRight);
		
		/*
		 * Panel
		 */
		JPanel mainPanel = new JPanel();
		JPanel mainPanel2 = new JPanel();
		
		/*
		 * Layout
		 */
		mainPanel.setBounds(20, 150, 460, 500);	
		mainPanel.setLayout(null);			
		
		mainPanel2.setBounds(640, 150, 460, 500);	
		mainPanel2.setLayout(null);
		
		//타일생성
		switch (tilenum) {
		case 1:
			matrixGame2 = new JLabel[3][3];
			for(i=0;i<3;i++)
			{
				for (j=0;j<3;j++)
				{
					matrixGame2[i][j]=new JLabel();
					matrixGame2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame2[i][j].setBounds(160*j, 160*i, 140, 140);
					GameMatrix.setMatrix(matrixGame2, i,	j,"");
					matrixGame2[i][j].setOpaque(true);
					mainPanel.add(matrixGame2[i][j]);
				}
			}
			GameNewCell.CreateNew(matrixGame2,t);
			GameNewCell.CreateNew(matrixGame2,t);
			break;
		case 2:
			matrixGame2 = new JLabel[4][4];	
			for(i = 0; i < 4; i++){		
				for(j = 0; j < 4; j++){
					matrixGame2[i][j] = new JLabel();
					matrixGame2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame2[i][j].setBounds(120 * j, 120 * i, 100, 100);
					GameMatrix.setMatrix(matrixGame2, i, j, "");
					matrixGame2[i][j].setOpaque(true);
					mainPanel.add(matrixGame2[i][j]);							
				}
			}
			GameNewCell.CreateNew(matrixGame2,t);
			GameNewCell.CreateNew(matrixGame2,t);
			break;
		case 3:
			matrixGame2 = new JLabel[5][5];	
			for(i = 0; i < 5; i++){	
				for(j = 0; j < 5; j++){
					matrixGame2[i][j] = new JLabel();
					matrixGame2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame2[i][j].setBounds(96 * j, 96 * i, 76, 76);
					GameMatrix.setMatrix(matrixGame2, i, j, "");
					matrixGame2[i][j].setOpaque(true);
					mainPanel.add(matrixGame2[i][j]);							
				}
			}
			GameNewCell.CreateNew(matrixGame2,t);
			GameNewCell.CreateNew(matrixGame2,t);
			break;
		case 4:
			matrixGame2 = new JLabel[6][6];	
			for(i = 0; i < 6; i++){	
				for(j = 0; j < 6; j++){
					matrixGame2[i][j] = new JLabel();
					matrixGame2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame2[i][j].setBounds(80 * j, 80 * i, 60, 60);
					GameMatrix.setMatrix(matrixGame2, i, j, "");
					matrixGame2[i][j].setOpaque(true);
					mainPanel.add(matrixGame2[i][j]);							
				}
			}
			GameNewCell.CreateNew(matrixGame2,t);
			GameNewCell.CreateNew(matrixGame2,t);
			break;

		case 5:
			matrixGame = new JLabel[4][4];	

			for(int i = 0; i < 4; i++){	//4*4 칸생성		
				for(int j = 0; j < 4; j++){
					matrixGame[i][j] = new JLabel();
					matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame[i][j].setBounds(120 * j, 120 * i, 100, 100);
					GameMatrix.setMatrix(matrixGame, i, j, "");
					matrixGame[i][j].setOpaque(true);
					mainPanel.add(matrixGame[i][j]);							
				}
			}

			matrixGame2 = new JLabel[4][4];	

			for(int i = 0; i < 4; i++){	//4*4 칸생성	
				for(int j = 0; j < 4; j++){
					matrixGame2[i][j] = new JLabel();
					matrixGame2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame2[i][j].setBounds(120 * j, 120 * i, 100, 100);
					GameMatrix.setMatrix(matrixGame2, i, j, "");
					matrixGame2[i][j].setOpaque(true);
					mainPanel2.add(matrixGame2[i][j]);							
				}
			}
			GameNewCell.CreateNew(matrixGame,t);
			GameNewCell.CreateNew(matrixGame,t);
			
			GameNewCell.CreateNew(matrixGame2,t);
			GameNewCell.CreateNew(matrixGame2,t);
			break;
		}
		getContentPane().add(mainPanel);
		getContentPane().add(mainPanel2);
		
		Score = 0;
		bestScore.setText(" BEST : " + String.valueOf(GameScore.getScoreXML().getScore()));
		
		/*
		 * Get the best score from the xml file
		 */

		GameScore.setScore(GameScore.getScoreXML());
		
		newGame.addMouseListener(new MouseAdapter()
		{
		    @Override
		    public void mouseClicked(MouseEvent m) 
		    {
		    	MainMenu Mainmenu = new MainMenu();
				Mainmenu.setVisible(true);
				dispose();
		    	if(t==5) {
		    	timer.stop();
		    	is = 0;
		    	js = 0;
		    	}
		    }
		});
		
		currentScore.addKeyListener(new KeyAdapter(){				
			public void keyPressed(KeyEvent e){
				int code = e.getKeyCode();	//Returns the integer keyCode associated with the key in this event
				if(t == 5) {
					timer.start();
				}
				switch(code){
				case KeyEvent.VK_LEFT:
					Score += GameKeyEvent.do_Left(matrixGame2,t,--secondItem);
					if(GameKeyEvent.timer2() == 1) {//상대방 타이머줄이기
						is = is+30;
						GameKeyEvent.cnt2 = 0;
					}else if(GameKeyEvent.timer2() == 2){
						js = js-10;
						GameKeyEvent.cnt2 = 0;
					}
					if(t == 5) {
						currentScore2.setText(" SCORE : " + String.valueOf(Score));
						GameOver.over(matrixGame2,t);
					}else {
						currentScore.setText(" SCORE : " + String.valueOf(Score));
						if(GameOver.over(matrixGame2, t)) {
							dispose();
						}
					}
					break;
				case KeyEvent.VK_A:		    
					Score += GameKeyEvent.do_a_Left(matrixGame,t,--firstItem);
					if(GameKeyEvent.timer1() == 1) {//상대방 타이머줄이기
						js = js+30;
						GameKeyEvent.cnt1 = 0;
					}else if(GameKeyEvent.timer1() == 2){
						is = is-10;
						GameKeyEvent.cnt1 = 0;
					}
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					GameOver.over(matrixGame,t);
					break;
				case KeyEvent.VK_RIGHT:
					Score += GameKeyEvent.do_Right(matrixGame2,t,--secondItem);
					if(GameKeyEvent.timer2() == 1) {//상대방 타이머줄이기
						is = is+30;
						GameKeyEvent.cnt2 = 0;
					}else if(GameKeyEvent.timer2() == 2){
						js = js-10;
						GameKeyEvent.cnt2 = 0;
					}
					if(t == 5) {
						currentScore2.setText(" SCORE : " + String.valueOf(Score));
						GameOver.over(matrixGame2,t);
					}else {
						currentScore.setText(" SCORE : " + String.valueOf(Score));
						if(GameOver.over(matrixGame2, t)) {
							dispose();
						}
					}
					break;
				case KeyEvent.VK_D:
					Score += GameKeyEvent.do_d_Right(matrixGame,t,--firstItem);
					if(GameKeyEvent.timer1() == 1) {//상대방 타이머줄이기
						js = js+30;
						GameKeyEvent.cnt1 = 0;
					}else if(GameKeyEvent.timer1() == 2){
						is = is-10;
						GameKeyEvent.cnt1 = 0;
					}
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					GameOver.over(matrixGame,t);
					break;
				case KeyEvent.VK_UP:
					Score += GameKeyEvent.do_Up(matrixGame2,t,--secondItem);
					if(GameKeyEvent.timer2() == 1) {//상대방 타이머줄이기
						is = is+30;
						GameKeyEvent.cnt2 = 0;
					}else if(GameKeyEvent.timer2() == 2){
						js = js-10;
						GameKeyEvent.cnt2 = 0;
					}
					if(t == 5) {
						currentScore2.setText(" SCORE : " + String.valueOf(Score));
						GameOver.over(matrixGame2,t);
					}else {
						currentScore.setText(" SCORE : " + String.valueOf(Score));
						if(GameOver.over(matrixGame2, t)) {
							dispose();
						}
					}
					break;
				case KeyEvent.VK_W:
					Score += GameKeyEvent.do_w_Up(matrixGame,t,--firstItem);
					if(GameKeyEvent.timer1() == 1) {//상대방 타이머줄이기
						js = js+30;
						GameKeyEvent.cnt1 = 0;
					}else if(GameKeyEvent.timer1() == 2){
						is = is-10;
						GameKeyEvent.cnt1 = 0;
					}
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					GameOver.over(matrixGame,t);
					break;
				case KeyEvent.VK_DOWN:
					Score += GameKeyEvent.do_Down(matrixGame2,t,--secondItem);
					if(GameKeyEvent.timer2() == 1) {//상대방 타이머줄이기
						is = is+30;
						GameKeyEvent.cnt2 = 0;
					}else if(GameKeyEvent.timer2() == 2){
						js = js-10;
						GameKeyEvent.cnt2 = 0;
					}
					if(t == 5) {
						currentScore2.setText(" SCORE : " + String.valueOf(Score));
						GameOver.over(matrixGame2,t);
					}else {
						currentScore.setText(" SCORE : " + String.valueOf(Score));
						if(GameOver.over(matrixGame2, t)) {
							dispose();
						}
					}
					break;
				case KeyEvent.VK_S:
					Score += GameKeyEvent.do_s_Down(matrixGame,t,--firstItem);
					if(GameKeyEvent.timer1() == 1) {//상대방 타이머줄이기
						js = js+30;
						GameKeyEvent.cnt1 = 0;
					}else if(GameKeyEvent.timer1() == 2){
						is = is-10;
						GameKeyEvent.cnt1 = 0;
					}
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					GameOver.over(matrixGame,t);
					break;
				}
				
				/*
				* Compared with the best score, if > bestScore, show this score 
				* in the JLabel bestScore 
				*/
				if(Score > GameScore.getScore().getScore()){
					bestScore.setText(" BEST : " + String.valueOf(Score));
				}
				if(firstItem == 0 && firstItemCnt >= 0) {
					firstItem = random.nextInt(10);
					firstItemCnt--;
				}
				if(secondItem == 0 && secondItemCnt >= 0) {
					secondItem = random.nextInt(10);
					secondItemCnt--;
				}
				
			}
		});
		
		this.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e)  
            {  
            	if(Score > GameScore.getScore().getScore()){
						try {
							GameScore.setScoreXML(new BestScore(Score));
						} catch (ParserConfigurationException | SAXException
								| IOException | TransformerException e1) {
							e1.printStackTrace();
						}
            	}           
            }  
        });  
		
	}
}
