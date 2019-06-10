package org.game.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

/**
 *Title: MatrixTextColor
 *Description: This class is used to change the game matrix. It will change the color, the font
 *and the text according the inputs of functions.
 *Copyright: Copyright(c)2014
 *@author DONG Chuan
 *@version 1.0
 */
public class GameMatrix {
	
	public GameMatrix(){}
	
	public static void setMatrix(JLabel[][] matrixGame, int i, int j, String str){
		
		matrixGame[i][j].setFont(new Font(str,Font.BOLD,50)); 
		matrixGame[i][j].setText(str);
			
		switch(str){
			case "2":
				matrixGame[i][j].setBackground(Color.decode("#eee4da"));
				matrixGame[i][j].setForeground(Color.decode("#776e65"));
				break;
			case "4":
				matrixGame[i][j].setBackground(Color.decode("#ede0c8"));
				matrixGame[i][j].setForeground(Color.decode("#776e65"));
				break;
			case "8":
				matrixGame[i][j].setBackground(Color.decode("#f2b179"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "16":
				matrixGame[i][j].setBackground(Color.decode("#f59563"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "32":
				matrixGame[i][j].setBackground(Color.decode("#f67c5f"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "64":
				matrixGame[i][j].setBackground(Color.decode("#e95937"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "128":
				matrixGame[i][j].setBackground(Color.decode("#E3C762"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "256":
				matrixGame[i][j].setBackground(Color.decode("#edcc61"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "512":
				matrixGame[i][j].setBackground(Color.decode("#f9ca58"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "1024":
				matrixGame[i][j].setBackground(Color.decode("#e3ba14"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "2048":
				matrixGame[i][j].setBackground(Color.decode("#FAB20A"));
				matrixGame[i][j].setForeground(Color.white);
				break;
				
			case "4096":
				matrixGame[i][j].setBackground(Color.decode("#60d994"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "8192":
				matrixGame[i][j].setBackground(Color.decode("#53bb7e"));
				matrixGame[i][j].setForeground(Color.white);
				break;
			case "10":
				matrixGame[i][j].setBackground(Color.decode("#554813"));
				break;
			case "11":
				matrixGame[i][j].setBackground(Color.decode("#554813"));
				break;
			case "": 
				matrixGame[i][j].setBackground(Color.decode("#eee4da"));
				break;
			default:
				break;
		}
	}
}
