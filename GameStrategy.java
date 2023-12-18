public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		if(cellId%8==0) return 0;
		else if(cellId%8==1) return 1;
		else if(cellId%8==2) return 2;
		else if(cellId%8==3) return 3;
		else if(cellId%8==4) return 4;
		else if(cellId%8==5) return 5;
		else if(cellId%8==6) return 6;
		else if(cellId%8==7) return 7;
		

		return 0;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		if(cellId>=0 && cellId<=7) return 0;
		else if(cellId>=8 && cellId<=15) return 1;
		else if(cellId>=16 && cellId<=23) return 2;
		else if(cellId>=24 && cellId<=31) return 3;
		else if(cellId>=32 && cellId<=39) return 4;
		else if(cellId>=40 && cellId<=47) return 5;
		else if(cellId>=48 && cellId<=55)  return 6;
		else if(cellId>=56 && cellId<=63) return 7;
        
		return 0;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId); 
		for (int i = 0; i < 8; i++) {
			if (placedQueens[row][i]||(placedQueens[i][col])) {
				isValid = false;
			}
		}
		
		
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (placedQueens[i][j]) {
				isValid = false;
			}
		}
		
		for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {
			if (placedQueens[i][j]) {
				isValid = false;
			}
		}
		
		for (int i = row, j = col; i >=0 && j < 8; i--, j++) {
			if (placedQueens[i][j]) {
				isValid = false;
			}
		}
		
		for (int i = row, j = col; i < 8 && j < 8; i++, j++) {
			if (placedQueens[i][j]) {
				isValid = false;
			}
		}
		
		if (isValid) {
			placedQueens[row][col] = true;
			numQueens++;
			return isValid;
		}
		


		return isValid;
	}
}














