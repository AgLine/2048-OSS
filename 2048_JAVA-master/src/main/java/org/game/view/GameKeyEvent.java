package org.game.view;

import javax.swing.JLabel;

/**
 *Title: GameKeyEvent
 *Description: This class is used to listen the key events. It will change the game matrix
 *according to the input key. Here, it includes UP, DOWN, LEFT, RIGHT events.
 *Copyright: Copyright(c)2014
 *@author DONG Chuan
 *@version 1.0
 */
public class GameKeyEvent {//Á¡¼ö
	
	public static int do_Left(JLabel[][] matrixGame,int itemnum){
		
		int num, score = 0, edgeLimit = 0;
		String str, strNeighbour;
		
		for(int i = 0; i < 4; i++){	
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int j = 1; j < 4; j++){					
					str = matrixGame[i][j].getText();			
					strNeighbour = matrixGame[i][j-1].getText();			
					
					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i, j-1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}else if((str.compareTo(strNeighbour) == 0) && (j !=edgeLimit) && (j != edgeLimit-1)){			
						num  = Integer.parseInt(str);
						score += num;
						str = String.valueOf(2 * num);
						if(str.compareTo("24")== 24 || str.compareTo("22")==22 || str.compareTo("20")==20) {
							GameMatrix.setMatrix(matrixGame, i+1, j, "");
						}
						GameMatrix.setMatrix(matrixGame, i, j-1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = j;
					}
				}	
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score;
	}
		
	public static int do_a_Left(JLabel[][] matrixGame,int itemnum){

		int num, score2 = 0, edgeLimit = 0;
		String str, strNeighbour;

		for(int i = 0; i < 4; i++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int j = 1; j < 4; j++){					
					str = matrixGame[i][j].getText();			
					strNeighbour = matrixGame[i][j-1].getText();			

					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i, j-1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}else if((str.compareTo(strNeighbour) == 0) && (j !=edgeLimit) && (j != edgeLimit-1)){			
						num  = Integer.parseInt(str);
						score2 += num;
						str = String.valueOf(2 * num);
						GameMatrix.setMatrix(matrixGame, i, j-1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = j;
					}
				}	
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score2;
	}

	public static int do_Right(JLabel[][] matrixGame,int itemnum){	
		
		int num, score = 0, edgeLimit = 0;
		String str, strNeighbour;
		
		for(int i = 0; i < 4; i ++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int j = 2; j >= 0; j--){
					str = matrixGame[i][j].getText();
					strNeighbour = matrixGame[i][j + 1].getText();
					
					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i, j+1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighbour) == 0 && j !=edgeLimit && j != edgeLimit+ 1){
						num  = Integer.parseInt(str);
						score += num;
						str = String.valueOf(2 * num);
						if(str.compareTo("24")==24 || str.compareTo("22")==22 || str.compareTo("20")==20) {
							GameMatrix.setMatrix(matrixGame, i+1, j, "");
						}
						GameMatrix.setMatrix(matrixGame, i, j+1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = j;
					}
				}
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score;
	}
		
	public static int do_d_Right(JLabel[][] matrixGame,int itemnum){	

		int num, score2 = 0, edgeLimit = 0;
		String str, strNeighbour;

		for(int i = 0; i < 4; i ++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int j = 2; j >= 0; j--){
					str = matrixGame[i][j].getText();
					strNeighbour = matrixGame[i][j + 1].getText();

					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i, j+1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighbour) == 0 && j !=edgeLimit && j != edgeLimit+ 1){
						num  = Integer.parseInt(str);
						score2 += num;
						str = String.valueOf(2 * num);
						GameMatrix.setMatrix(matrixGame, i, j+1, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = j;
					}
				}
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score2;
	}
	public static int do_Up(JLabel[][] matrixGame,int itemnum){	
		
		int num, score = 0, edgeLimit = 0;
		String str, strNeighbour;
		
		for(int j = 0; j < 4; j++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int i = 1; i < 4; i++){
					str = matrixGame[i][j].getText();
					strNeighbour = matrixGame[i - 1][j].getText();
				
					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i-1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighbour) == 0 && i != edgeLimit && i != edgeLimit -1){
						num  = Integer.parseInt(str);
						score += num;
						str = String.valueOf(2 * num);
						if(str.compareTo("24")==24 || str.compareTo("22")==22 || str.compareTo("20")==20) {
							GameMatrix.setMatrix(matrixGame, i+1, j, "");
						}
						GameMatrix.setMatrix(matrixGame, i-1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = i;
					}
				}
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score;
	}
		
	public static int do_w_Up(JLabel[][] matrixGame,int itemnum){	

		int num, score2 = 0, edgeLimit = 0;
		String str, strNeighbour;

		for(int j = 0; j < 4; j++){
			edgeLimit = 5;
			for(int k = 0; k < 3; k++){
				for(int i = 1; i < 4; i++){
					str = matrixGame[i][j].getText();
					strNeighbour = matrixGame[i - 1][j].getText();

					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i-1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighbour) == 0 && i != edgeLimit && i != edgeLimit -1){
						num  = Integer.parseInt(str);
						score2 += num;
						str = String.valueOf(2 * num);
						GameMatrix.setMatrix(matrixGame, i-1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = i;
					}
				}
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score2;
	}

	public static int do_Down(JLabel[][] matrixGame,int itemnum){	
		
		int num, score = 0, edgeLimit = 0;
		String str, strNeighbour;
		
		for(int j = 0; j < 4; j ++){
			edgeLimit = 5;
			for(int k = 0; k < 5; k++){
				for(int i = 2; i >= 0; i--){
					str = matrixGame[i][j].getText();
					strNeighbour = matrixGame[i + 1][j].getText();
					
					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i+1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighbour) == 0 && i != edgeLimit && i != edgeLimit + 1){
						num  = Integer.parseInt(str);
						score += num;
						str = String.valueOf(2 * num);
						if(str.compareTo("24")==24 || str.compareTo("22")==22 || str.compareTo("20")==20) {
							GameMatrix.setMatrix(matrixGame, i+1, j, "");
						}
						GameMatrix.setMatrix(matrixGame, i+1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = i;
					}
				}
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score;
	}
	
	public static int do_s_Down(JLabel[][] matrixGame,int itemnum){	
		
		int num, score2 = 0, edgeLimit = 0;
		String str, strNeighbour;
		
		for(int j = 0; j < 4; j ++){
			edgeLimit = 5;
			for(int k = 0; k < 5; k++){
				for(int i = 2; i >= 0; i--){
					str = matrixGame[i][j].getText();
					strNeighbour = matrixGame[i + 1][j].getText();
					
					if(strNeighbour.compareTo("") == 0){
						GameMatrix.setMatrix(matrixGame, i+1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
					}
					else if(str.compareTo(strNeighbour) == 0 && i != edgeLimit && i != edgeLimit + 1){
						num  = Integer.parseInt(str);
						score2 += num;
						str = String.valueOf(2 * num);
						GameMatrix.setMatrix(matrixGame, i+1, j, str);
						GameMatrix.setMatrix(matrixGame, i, j, "");
						edgeLimit = i;
					}
				}
			}
		}
		GameNewCell.CreateNew(matrixGame);
		if(itemnum == 0) {
			GameNewItem.CreateNew(matrixGame);
		}
		return score2;
	}


}