package org.game.view;

import java.util.Random;

import javax.swing.JLabel;


public class GameNewItem {
							
	static Random random = new Random();

	public static void CreateNew(JLabel[][] matrixGame){//새로운 블록 생성
		
		int i ,j ,k;
		boolean flag = false;
		String str;
		
		while(!flag){
			i = random.nextInt(4);// Random 0 ~ 3
			j = random.nextInt(4);
			k = random.nextInt(3);
			// Get the current text of cell
			str = matrixGame[i][j].getText();
			
			// If this cell is still empty, we initialize it
			if((str.compareTo("") == 0)){
				
				// Create a new item cell
				if(k == 0) {
					GameMatrix.setMatrix(matrixGame, i, j, "10");
				}else if(k == 1) {
					GameMatrix.setMatrix(matrixGame, i, j, "11");
				}else {
					GameMatrix.setMatrix(matrixGame, i, j, "12");
				}
				flag = true;	
			}
		}
	}
}
