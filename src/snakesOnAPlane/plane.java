package snakesOnAPlane;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class plane {
	static int totalVenom;
	static float chanceOfDeath;
	static randomness y = new randomness();
	static int numberOfPassengers = 1062;
	static ArrayList <snake> snakes = new ArrayList<snake>();
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			snakes.add(new snake(y.oneToTen(), y.trueOrFalse()));
		}
		for(snake snake: snakes){
			if(snake.getVenomous()== true){
			totalVenom += snake.getViciousness();
			}
			else{
				
			}
			
		}
		chanceOfDeath = (totalVenom*10)/numberOfPassengers;
		System.out.println("Your chance of death is " + chanceOfDeath + "%");
	}

}
