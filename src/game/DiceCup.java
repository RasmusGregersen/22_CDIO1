/*
* DiceCup
*
* Version info
*
* Copyright notice */

package game;

public class DiceCup {
	private Die die1 = new Die();
	private Die die2 = new Die();

	//Method to return the value of die1
	public int getDie1() {
		return die1.getValue();
	}
	//Method to return the value of die2
	public int getDie2() {
		return die2.getValue();
	}
	//Method to determine if die1 and die2's values are equal.
	public boolean getEqual() {
		if (die1.getValue() == die2.getValue()) {
			return true;
		}
		else {
			return false;
		}		
	}
	//Method to return the sum of die1 and die2	
	public int getSum() {
		return die1.getValue() + die2.getValue();
	}
	//Method to roll both dices.
	public void newRoll() {
		die1.newRoll();
		die2.newRoll();
	}
}
