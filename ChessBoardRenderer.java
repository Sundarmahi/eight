public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
	
			if(square>=0 && square<=7) return odd(square);
			else if(square>=8 && square<=15) return even(square);
			else if(square>=16 && square<=23) return odd(square);
			else if(square>=24 && square<=31) return even(square);
			else if(square>=32 && square<=39) return odd(square);
			else if(square>=40 && square<=47) return even(square);
			else if(square>=48 && square<=55) return odd(square);
			else if(square>=56 && square<=63) return even(square);
		
		return false;
	}
	public static boolean even(int i) {
		if(i%2==0) return true;
		 return false;
	}
	public static boolean odd(int i) {
		if(i%2!=0) return true;
		 return false;
	}
}
