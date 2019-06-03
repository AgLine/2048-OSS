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

<<<<<<< HEAD
	public static void CreateNew(JLabel[][] matrixGame,int tilenum){
		int i,j;
=======
	public static void CreateNew(JLabel[][] matrixGame){
		
		int i ,j;
>>>>>>> sun060
		boolean flag = false;
		String str;
		
		while(!flag){
<<<<<<< HEAD
			i = random.nextInt(4);// Random 0 ~ 3
			j = random.nextInt(4);

			// Get the current text of cell
			str = matrixGame[i][j].getText();
			
			// If this cell is still empty, we initialize it
			if((str.compareTo("") == 0)){
=======
			switch(tilenum) {
			case 1:
				i = random.nextInt(3);// Random 0 ~ 2
				j = random.nextInt(3);

				// Get the current text of cell
				str = matrixGame[i][j].getText();
				System.out.printf("%d, %d",i,j);
				// If this cell is still empty, we initialize it
				if((str.compareTo("") == 0)){

					// Create a new "2" cell
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			case 2:
				i = random.nextInt(3);// Random 0 ~ 3
				j = random.nextInt(3);

				// Get the current text of cell
				str = matrixGame[i][j].getText();
				
				// If this cell is still empty, we initialize it
				if((str.compareTo("") == 0)){
					
					// Create a new "2" cell
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			case 3:
				i = random.nextInt(5);// Random 0 ~ 4
				j = random.nextInt(5);

				// Get the current text of cell
				str = matrixGame[i][j].getText();
				
				// If this cell is still empty, we initialize it
				if((str.compareTo("") == 0)){
					
					// Create a new "2" cell
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			case 4:
				i = random.nextInt(6);// Random 0 ~ 5
				j = random.nextInt(6);

				// Get the current text of cell
				str = matrixGame[i][j].getText();
>>>>>>> eseul
				
				// If this cell is still empty, we initialize it
				if((str.compareTo("") == 0)){
					
					// Create a new "2" cell
					GameMatrix.setMatrix(matrixGame, i, j, "2");
					flag = true;	
				}
				break;
			}
		}
	}
}
