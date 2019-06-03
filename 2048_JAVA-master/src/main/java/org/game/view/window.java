package org.game.view;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class window {

	/*
	 * public static void main(String[] args) { int str=0; if(str==2048) { int
	 * optionType;
	 * JOptionPane.showConfirmDialog(null,"계속하시겠습니까?","continue",JOptionPane.
	 * YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); }
	 */
		
	public static void over(JLabel[][] matrixGame) {

		String str = null;
		int i,j;
		int cnt=0;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				str = matrixGame[i][j].getText();
				if(str.compareTo("") !=0) {
					cnt++;
				}								
			}
		}

		if(cnt==16) {
			JOptionPane.showMessageDialog(null,"게임종료","game over",JOptionPane.ERROR_MESSAGE);
		}
	}
}
	
