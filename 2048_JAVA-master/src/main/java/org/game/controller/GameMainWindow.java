package org.game.controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

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
import org.game.view.GameInit;
import org.game.view.GameMatrix;
import org.xml.sax.SAXException;



public class GameMainWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int Score;
	private JLabel[][] matrixGame;
	int i,j,t;
	
	public GameMainWindow(int tilenum) throws ParserConfigurationException, SAXException, IOException{
		super();
		this.t = tilenum; 
		System.out.println(t);
		setTitle("Game Java 2048");
		getContentPane().setLayout(null);
	    setResizable(false);
	    setLocationRelativeTo(null); //This line will center the window on the screen.
	    if(tilenum==5)
	    {
	    	setSize(1100,700);
	    }
	    else
	    {
	    	setSize(500,700);
	    }
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
		
		JLabel gameTitle2 = new JLabel();
		gameTitle2.setText("2048");
		gameTitle2.setFont(new Font("", Font.BOLD,40));
		gameTitle2.setForeground(Color.decode("#776e65"));
		gameTitle2.setBounds(640, 20, 150, 50);
		add(gameTitle2);
		
		JLabel gameSlogan = new JLabel();
		gameSlogan.setText("Join the numbers and get to the 2048 tile!");
		gameSlogan.setFont(new Font("", Font.BOLD,15));
		gameSlogan.setBounds(20, 70, 320, 50);
		add(gameSlogan);
		
		JLabel gameSlogan2 = new JLabel();
		gameSlogan2.setText("Join the numbers and get to the 2048 tile!");
		gameSlogan2.setFont(new Font("", Font.BOLD,15));
		gameSlogan2.setBounds(640, 70, 320, 50);
		add(gameSlogan2);
		
		final JTextField currentScore = new JTextField(" SCORE :0");
		currentScore.setOpaque(true); 
		currentScore.setBackground(Color.decode("#bbada0"));
		currentScore.setForeground(Color.WHITE);
		currentScore.setFont(new Font("", Font.BOLD,15));
		currentScore.setBounds(200, 20, 130, 50);
		currentScore.setEditable(false);
		add(currentScore);
		
		final JTextField currentScore2 = new JTextField(" SCORE :0");
		currentScore2.setOpaque(true); 
		currentScore2.setBackground(Color.decode("#bbada0"));
		currentScore2.setForeground(Color.WHITE);
		currentScore2.setFont(new Font("", Font.BOLD,15));
		currentScore2.setBounds(820, 20, 130, 50);
		currentScore2.setEditable(false);
		add(currentScore2);
		
		final JLabel bestScore = new JLabel();//현재 사용가능한 아이템 갯수로 바꿈
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
		newGame.setBounds(350, 80, 130, 30);
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
		
		/*
		 * Layout
		 */
		mainPanel.setBounds(20, 150, 460, 500);	
		mainPanel.setLayout(null);			
		
		
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
		add(mainPanel);
		
		Score = 0;//처음점수 0점
		bestScore.setText(" BEST : " + String.valueOf(GameScore.getScoreXML().getScore()));
		
		/*
		 * Get the best score from the xml file
		 */

		GameScore.setScore(GameScore.getScoreXML());//새로운게임 다시시작
		
		newGame.addMouseListener(new MouseAdapter()
		{
		    @Override
		    public void mouseClicked(MouseEvent arg0) 
		    {
		    	GameInit.startNewGame(matrixGame,t);
		    }
		});
		
		currentScore.addKeyListener(new KeyAdapter(){//키보드 입력값이랑 점수	
			public void keyPressed(KeyEvent e){
				int code = e.getKeyCode();	//Returns the integer keyCode associated with the key in this event
				switch(code){
				//Left
				case KeyEvent.VK_LEFT:
				case KeyEvent.VK_A:		    
					Score += GameKeyEvent.do_Left(matrixGame,t);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				//Right
				case KeyEvent.VK_RIGHT:
				case KeyEvent.VK_D:
					Score += GameKeyEvent.do_Right(matrixGame,t);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				//Up
				case KeyEvent.VK_UP:
				case KeyEvent.VK_W:
					Score += GameKeyEvent.do_Up(matrixGame,t);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				//Down
				case KeyEvent.VK_DOWN:
				case KeyEvent.VK_S:
					Score += GameKeyEvent.do_Down(matrixGame,t);
					currentScore.setText(" SCORE : " + String.valueOf(Score));
					break;
				}
				
				/*
				* Compared with the best score, if > bestScore, show this score 
				* in the JLabel bestScore 
				*/
				if(Score > GameScore.getScore().getScore()){
					bestScore.setText(" BEST : " + String.valueOf(Score));
				}
			}
		});
		
		this.addWindowListener(new WindowAdapter() {  //예외처리의 코드를 찾을수가 없음(모름)
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
