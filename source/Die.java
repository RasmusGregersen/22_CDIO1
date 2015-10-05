package Dicegame;

public class Die {

	private int eye;
	
	public int getRoll(){
		eye = (int) Math.ceil(Math.random()*6);
	return eye;
	}
	//private int øjne1 = (int) Math.ceil(Math.random()*6);
	//private int øjne2 = (int) Math.ceil(Math.random()*6);
	
	 
}
