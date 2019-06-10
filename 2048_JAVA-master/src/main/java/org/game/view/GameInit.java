package org.game.view;

import javax.swing.JLabel;

/**
 *Title: InitGame
 *Description: This class is used to restart the game.
 *Copyright: Copyright(c)2014
 *@author DONG Chuan
 *@version 1.0
 */
public class GameInit {
	
	public static void startNewGame(JLabel[][] matrixGame,int tilenum){
		
		switch (tilenum)
		{
		case 1:
			for(int i=0; i<3 ;i++){
				for(int j=0; j<3; j++){
					GameMatrix.setMatrix(matrixGame, i, j, "");
				}
			}
			break;
		case 5:
		case 2:
			for(int i=0; i<4 ;i++){
				for(int j=0; j<4; j++){
					GameMatrix.setMatrix(matrixGame, i, j, "");
				}
			}
			break;
		case 3:
			for(int i=0; i<5 ;i++){
				for(int j=0; j<5; j++){
					GameMatrix.setMatrix(matrixGame, i, j, "");
				}
			}
			break;
		case 4:
			for(int i=0; i<6 ;i++){
				for(int j=0; j<6; j++){
					GameMatrix.setMatrix(matrixGame, i, j, "");
				}
			}
			break;		
		}
		
		//Create two random positions "2" elements for a new game
		GameNewCell.CreateNew(matrixGame,tilenum);
		GameNewCell.CreateNew(matrixGame,tilenum);
	}
}
