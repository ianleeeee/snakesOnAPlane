package snakesOnAPlane;

public class snake {
	int viciousness;
	boolean venomous;
	
	snake(int viciousness, boolean venomous){
		this.viciousness = viciousness;
		this.venomous = venomous;
	}
	
	int getViciousness(){
		return viciousness;
	}
	boolean getVenomous(){
		return venomous;
	}

}
