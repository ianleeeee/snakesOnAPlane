package snakesOnAPlane;

import java.util.Random;

public class randomness {
	static boolean trueOrFalse(){
		Random z = new Random();
		int x = z.nextInt(2);
		if (x == 1) {
			return false;
		}
		else{
			return true;
		}
		
	
		
	}
	int oneToTen(){
		Random z = new Random();
		int x = z.nextInt(11);
		return x;
	}
	


}
