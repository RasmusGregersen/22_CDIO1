package Dicegame;

public class DiceCup {
	Die die = new Die();
	private int die1;
	private int die2;

	public void newRoll()
	{
		die1 = die.getRoll();
		die2 = die.getRoll();
	}
	
	public int getDie1()
	{
	return die1;
	}
	
	public int getDie2()
	{
	return die2;
	}
	
	public int getSum()
	{
		return die1 + die2;
	}
}
