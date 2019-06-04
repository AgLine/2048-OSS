package org.game.view;

import java.util.Random;

import javax.swing.JLabel;

/**
 *Title: GameNewCell
 *Description: This class is used to create a new "2" element at a random position
 *Copyright: Copyright(c)2014
 *@author DONG Chuan
 *@version 1.0
 */
public class GameNewCell {
							
	static Random random = new Random();

	public static void CreateNew(JLabel[][] matrixGame,int tilenum){
		int i,j;
		boolean flag = false;
		String str;
		while(!flag){
			switch(tilenum) {
			case 1:
				i = random.nextInt(3);
				j = random.nextInt(3);
				str = matrixGame[i][j].getText();
				if((str.compareTo("") == 0)){
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			case 5:
			case 2:
				i = random.nextInt(4);
				j = random.nextInt(4);
				str = matrixGame[i][j].getText();
				if((str.compareTo("") == 0)){
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			case 3:
				i = random.nextInt(5);
				j = random.nextInt(5);
				str = matrixGame[i][j].getText();
				if((str.compareTo("") == 0)){
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			case 4:
				i = random.nextInt(6);// Random 0 ~ 5
				j = random.nextInt(6);
				str = matrixGame[i][j].getText();
				if((str.compareTo("") == 0)){
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			}

		}
	}
}
