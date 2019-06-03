package org.game.controller;

import java.awt.Color;
import java.awt.EventQueue;
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
import org.game.view.GameNewItem;
import org.game.view.GameKeyEvent;
import org.game.view.GameInit;
import org.game.view.GameMatrix;
import org.game.view.window;
import org.xml.sax.SAXException;



public class GameMainWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int Score;
	private JLabel[][] matrixGame;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
	private JLabel[][] matrixGame2;
	int i = 0, j = 0;//i= 1p 타이머를 위한 변수 j=2p 타이머를 위한 변수
	static Random random = new Random();
	int firstItem = random.nextInt(10);
	int secondItem = random.nextInt(10);
	int firstItemCnt = 4, secondItemCnt = 4;
	
	
>>>>>>> eunsun
=======
	int i,j,t;
>>>>>>> eseul
=======
>>>>>>> sun060
	
	public GameMainWindow(int tilenum) throws ParserConfigurationException, SAXException, IOException{
		super();
		this.t = tilenum; 
		System.out.println(t);
		setTitle("Game Java 2048");
		getContentPane().setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null); //This line will center the window on the screen.
<<<<<<< HEAD
<<<<<<< HEAD
	    setSize(500, 700);
=======
	    setSize(1125, 700);
>>>>>>> eunsun
=======
	    if(tilenum==5)
	    {
	    	setSize(1100,700);
	    }
	    else
	    {
	    	setSize(500,700);
	    }
>>>>>>> eseul
	    setDefaultCloseOperation(EXIT_ON_CLOSE);//Exit the application using the Systexit method.
	    /*
		 * Components
		 */
		JLabel gameTitle = new JLabel();
		gameTitle.setText("2048");
		gameTitle.setFont(new Font("", Font.BOLD,50));
		gameTitle.setForeground(Color.decode("#776e65"));
		gameTitle.setBounds(20, 20, 150, 50);
		add(gameTitle);
		
<<<<<<< HEAD
		
		final JLabel firstTimer = new JLabel();
		firstTimer.setText(String.valueOf(100));
		firstTimer.setFont(new Font("", Font.BOLD,40));
		firstTimer.setForeground(Color.decode("#776e65"));
		firstTimer.setBounds(350, 80, 150, 50);
		add(firstTimer);
		
		final JLabel secondTimer = new JLabel();
		secondTimer.setText(String.valueOf(100));
		secondTimer.setFont(new Font("", Font.BOLD,40));
		secondTimer.setForeground(Color.decode("#776e65"));
		secondTimer.setBounds(950, 80, 150, 50);
		add(secondTimer);
		
		final Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				firstTimer.setText(String.valueOf(100-i));
				i++;
				secondTimer.setText(String.valueOf(100-j));
				j++;
			}
		});
		
=======
>>>>>>> sun060
		JLabel gameSlogan = new JLabel();
		gameSlogan.setText("Join the numbers and get to the 2048 tile!");
		gameSlogan.setFont(new Font("", Font.BOLD,15));
		gameSlogan.setBounds(20, 70, 320, 50);
		add(gameSlogan);
		
		final JTextField currentScore = new JTextField(" SCORE :0");
		currentScore.setOpaque(true); 
		currentScore.setBackground(Color.decode("#bbada0"));
		currentScore.setForeground(Color.WHITE);
		currentScore.setFont(new Font("", Font.BOLD,15));
		currentScore.setBounds(200, 20, 130, 50);
		currentScore.setEditable(false);
		add(currentScore);
<<<<<<< HEAD
<<<<<<< HEAD
=======

		final JTextField currentScore2 = new JTextField(" SCORE :0");
		currentScore2.setOpaque(true); 
		currentScore2.setBackground(Color.decode("#bbada0"));
		currentScore2.setForeground(Color.WHITE);
		currentScore2.setFont(new Font("", Font.BOLD,15));
		currentScore2.setBounds(820, 20, 130, 50);
		currentScore2.setEditable(false);
		add(currentScore2);
>>>>>>> eunsun
		
		final JLabel bestScore = new JLabel();//현재 사용가능한 아이템 갯수로 바꿈
=======
		
		final JLabel bestScore = new JLabel();
>>>>>>> sun060
		bestScore.setText(" BEST :0");
		bestScore.setOpaque(true); 
		bestScore.setBackground(Color.decode("#bbada0"));
		bestScore.setForeground(Color.WHITE);
		bestScore.setFont(new Font("", Font.BOLD,15));
		bestScore.setBounds(350, 20, 130, 50);
		add(bestScore);
		
		JButton newGame = new JButton();
		newGame.setText("New Game");
		newGame.setFont(new Font("", Font.BOLD,15));
		newGame.setBackground(Color.decode("#8f7a66"));
		newGame.setForeground(Color.decode("#f9f6f2"));
		newGame.setBounds(500, 80, 130, 30);
		add(newGame);
	
		JLabel copyRight = new JLabel();
		copyRight.setText("짤 2014 Chuan Dong. Simulation of game 2048 by Java Swing");
		copyRight.setFont(new Font("", Font.BOLD,10));
		copyRight.setBounds(20, 630, 150, 50);
		add(copyRight);
		
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
		
<<<<<<< HEAD
		mainPanel2.setBounds(640, 150, 460, 500);	
		mainPanel2.setLayout(null);
		
<<<<<<< HEAD
		matrixGame = new JLabel[4][4];	
			
		for(int i = 0; i < 4; i++){	//4*4 칸생성	
=======
		for(int i = 0; i < 4; i++){			
>>>>>>> sun060
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
=======
		
			switch (t) {
			case 1:
				matrixGame = new JLabel[3][3];
				for(i=0;i<3;i++)
				{
					for (j=0;j<3;j++)
					{
						matrixGame[i][j]=new JLabel();
						matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
						matrixGame[i][j].setBounds(160*j, 160*i, 140, 140);
						GameMatrix.setMatrix(matrixGame, i,	j,"");
						matrixGame[i][j].setOpaque(true);
						mainPanel.add(matrixGame[i][j]);
					}
				}
				break;
			case 2:
				matrixGame = new JLabel[4][4];	
				for(i = 0; i < 4; i++){	//4*4 칸생성	
					for(j = 0; j < 4; j++){
						matrixGame[i][j] = new JLabel();
						matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
						matrixGame[i][j].setBounds(120 * j, 120 * i, 100, 100);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						matrixGame[i][j].setOpaque(true);
						mainPanel.add(matrixGame[i][j]);							
					}
				}
				break;
			
			case 3:
				matrixGame = new JLabel[5][5];	
				for(i = 0; i < 5; i++){	//4*4 칸생성	
					for(j = 0; j < 5; j++){
						matrixGame[i][j] = new JLabel();
						matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
						matrixGame[i][j].setBounds(96 * j, 96 * i, 76, 76);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						matrixGame[i][j].setOpaque(true);
						mainPanel.add(matrixGame[i][j]);							
					}
				}
				break;
				
			case 4:
				matrixGame = new JLabel[6][6];	
				for(i = 0; i < 6; i++){	//4*4 칸생성	
					for(j = 0; j < 6; j++){
						matrixGame[i][j] = new JLabel();
						matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
						matrixGame[i][j].setBounds(80 * j, 80 * i, 60, 60);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						matrixGame[i][j].setOpaque(true);
						mainPanel.add(matrixGame[i][j]);							
					}
				}
				break;
				
			case 5:matrixGame = new JLabel[4][4];	
			
			for(i = 0; i < 4; i++){	//2인용 코드 추가
				for(j = 0; j < 4; j++){
					matrixGame[i][j] = new JLabel();
					matrixGame[i][j].setHorizontalAlignment(SwingConstants.CENTER);
					matrixGame[i][j].setBounds(120 * j, 120 * i, 100, 100);
					GameMatrix.setMatrix(matrixGame, i, j, "");
					matrixGame[i][j].setOpaque(true);
					mainPanel.add(matrixGame[i][j]);							
				}
			}
			break;
			}
>>>>>>> eseul
		add(mainPanel);
		add(mainPanel2);
		
		Score = 0;
		bestScore.setText(" BEST : " + String.valueOf(GameScore.getScoreXML().getScore()));
		
		/*
		 * Get the best score from the xml file
		 */

		GameScore.setScore(GameScore.getScoreXML());
		
		newGame.addMouseListener(new MouseAdapter()
		{
		    @Override
		    public void mouseClicked(MouseEvent arg0) 
		    {
<<<<<<< HEAD
		    	GameInit.startNewGame(matrixGame);
		    	GameInit.startNewGame(matrixGame2);
=======
		    	GameInit.startNewGame(matrixGame,t);
>>>>>>> eseul
		    }
		});
		
<<<<<<< HEAD
		System.out.println(firstItem);
		System.out.println(secondItem);
		currentScore.addKeyListener(new KeyAdapter(){//키보드 입력값이랑 점수	
=======
		currentScore.addKeyListener(new KeyAdapter(){				
>>>>>>> sun060
			public void keyPressed(KeyEvent e){
				int code = e.getKeyCode();	//Returns the integer keyCode associated with the key in this event
				timer.start();
				System.out.println(firstItem);
				System.out.println(secondItem);
				switch(code){
				//Left
				case KeyEvent.VK_LEFT:
<<<<<<< HEAD
					Score += GameKeyEvent.do_Left(matrixGame2,--secondItem);
					currentScore2.setText(" SCORE : " + String.valueOf(Score));
					break;
				case KeyEvent.VK_A:	
					Score += GameKeyEvent.do_a_Left(matrixGame,--firstItem);
=======
				case KeyEvent.VK_A:		    
					Score += GameKeyEvent.do_Left(matrixGame,t);
>>>>>>> eseul
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					window.over(matrixGame);
					break;
				//Right
				case KeyEvent.VK_RIGHT:
					Score += GameKeyEvent.do_Right(matrixGame2,--secondItem);
					currentScore2.setText(" SCORE : " + String.valueOf(Score));
					break;
				case KeyEvent.VK_D:
<<<<<<< HEAD
					Score += GameKeyEvent.do_d_Right(matrixGame,--firstItem);
=======
					Score += GameKeyEvent.do_Right(matrixGame,t);
>>>>>>> eseul
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					window.over(matrixGame);
					break;
				//Up
				case KeyEvent.VK_UP:
					Score += GameKeyEvent.do_Up(matrixGame2,--secondItem);
					currentScore2.setText(" SCORE : " + String.valueOf(Score));
					break;
				case KeyEvent.VK_W:
<<<<<<< HEAD
					Score += GameKeyEvent.do_w_Up(matrixGame,--firstItem);
=======
					Score += GameKeyEvent.do_Up(matrixGame,t);
>>>>>>> eseul
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					window.over(matrixGame);
					break;
				//Down
				case KeyEvent.VK_DOWN:
					Score += GameKeyEvent.do_Down(matrixGame2,--secondItem);
					currentScore2.setText(" SCORE : " + String.valueOf(Score));
					break;
				case KeyEvent.VK_S:
<<<<<<< HEAD
					Score += GameKeyEvent.do_s_Down(matrixGame,--firstItem);
=======
					Score += GameKeyEvent.do_Down(matrixGame,t);
>>>>>>> eseul
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					window.over(matrixGame);
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
		
<<<<<<< HEAD
		
		this.addWindowListener(new WindowAdapter() { 
=======
		this.addWindowListener(new WindowAdapter() {  
>>>>>>> sun060
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
		
		/*
		 * Create two random positions "2" elements for a new game
		 */
		GameNewCell.CreateNew(matrixGame,t);
		GameNewCell.CreateNew(matrixGame,t);
		
		GameNewCell.CreateNew(matrixGame2);
		GameNewCell.CreateNew(matrixGame2);
		
		
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
	
}
