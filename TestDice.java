/*
* TestDice
*
* Version info
*
* Copyright notice */

package test;

import game.DiceCup;

public class TestDice {
	public static void main(String[] args) {
		DiceCup dicecup = new DiceCup(); // Imports DiceCup class
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		int amountofdoubles = 0;
		// counters for analysis
		
		int n = 1000;
		int i;

		
		for (i = 0; i < n; i++) // for loop to repeat n (1000) times.
		{
			dicecup.newRoll(); // calls the method to generate a new roll
			if (dicecup.getSum() == 2)
				two++;
			if (dicecup.getSum() == 3)
				three++;
			if (dicecup.getSum() == 4)
				four++;
			if (dicecup.getSum() == 5)
				five++;
			if (dicecup.getSum() == 6)
				six++;
			if (dicecup.getSum() == 7)
				seven++;
			if (dicecup.getSum() == 8)
				eight++;
			if (dicecup.getSum() == 9)
				nine++;
			if (dicecup.getSum() == 10)
				ten++;
			if (dicecup.getSum() == 11)
				eleven++;
			if (dicecup.getSum() == 12)
				twelve++;
			if (dicecup.getEqual() == true) // checks dice values for double throws.
				amountofdoubles++;
		}
		// printouts of the results and the probability in percentages.
		System.out.println("Amount of 2: " + two + " with a probability of " + (double) two/n*100 + "%");
		System.out.println("Amount of 3: " + three + " with a probability of " + (double) three/n*100 + "%");
		System.out.println("Amount of 4: " + four + " with a probability of " + (double) four/n*100 + "%");
		System.out.println("Amount of 5: " + five + " with a probability of " + (double) five/n*100 + "%");
		System.out.println("Amount of 6: " + six + " with a probability of " + (double) six/n*100 + "%");
		System.out.println("Amount of 7: " + seven + " with a probability of " + (double) seven/n*100 + "%");
		System.out.println("Amount of 8: " + eight + " with a probability of " + (double) eight/n*100 + "%");
		System.out.println("Amount of 9: " + nine + " with a probability of " + (double) nine/n*100 + "%");
		System.out.println("Amount of 10: " + ten + " with a probability of " + (double) ten/n*100 + "%");
		System.out.println("Amount of 11: " + eleven + " with a probability of " + (double) eleven/n*100 + "%");
		System.out.println("Amount of 12: " + twelve + " with a probability of " + (double) twelve/n*100 + "%");
		System.out.println("Amount of doubles: " + amountofdoubles);
	}
}
