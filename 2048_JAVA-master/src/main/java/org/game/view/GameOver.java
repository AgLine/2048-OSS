package org.game.view;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameOver {
		
	public static void over(JLabel[][] matrixGame, int tilenum) {

		String str;
		int i,j;
		int cnt=0;
		switch(tilenum) {
		case 1:
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					str = matrixGame[i][j].getText();
					if(!str.equals("")) {
						cnt++;
					}								
				}
				if(cnt == 9) {
					JOptionPane.showMessageDialog(null,"게임종료","game over",JOptionPane.ERROR_MESSAGE);
				}
			}
			break;
		case 5:
		case 2:
			for(i=0;i<4;i++) {
				for(j=0;j<4;j++) {
					str = matrixGame[i][j].getText();
					if(!str.equals("")) {
						cnt++;
					}								
				}
				if(cnt == 16) {
					JOptionPane.showMessageDialog(null,"게임종료","game over",JOptionPane.ERROR_MESSAGE);
				}
			}
			break;
		case 3:
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					str = matrixGame[i][j].getText();
					if(!str.equals("")) {
						cnt++;
					}								
				}
				if(cnt == 25) {
					JOptionPane.showMessageDialog(null,"게임종료","game over",JOptionPane.ERROR_MESSAGE);
				}
			}
			break;
		case 4:
			for(i=0;i<6;i++) {
				for(j=0;j<6;j++) {
					str = matrixGame[i][j].getText();
					if(!str.equals("")) {
						cnt++;
					}								
				}
				if(cnt == 36) {
					JOptionPane.showMessageDialog(null,"게임종료","game over",JOptionPane.ERROR_MESSAGE);
				}
			}
			break;
		}
	}
	
	public static void firstWin(){
		JOptionPane.showMessageDialog(null,"1P WIN","GAME OVER",JOptionPane.ERROR_MESSAGE);
	}
	
	public static void secondWin(){
		JOptionPane.showMessageDialog(null,"2P WIN","GAME OVER",JOptionPane.ERROR_MESSAGE);
	}
}
	
