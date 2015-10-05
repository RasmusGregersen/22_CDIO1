package Dicegame;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		DiceCup bæger = new DiceCup();
		Player player1 = new Player();
		Player player2 = new Player();


		bæger.newRoll();
		int terning1 = bæger.getDie1();
		int terning2 = bæger.getDie2();
		int sum = bæger.getSum();



		//System.out.println("Terning 1: " + terning1 + " Terning 2: " + terning2 + " Terningsum: " + sum);
		//if (player1.getDobbeltseks() == 1 && bæger.getSum() == 12

		boolean win = false;

		while (win == false)
		{
			if (player1.getPoint() >= 40 || player2.getPoint() >= 40)
			{
				win = true;
			}
		}
		
		//Slutningen!
		if (player1.getPoint() > player2.getPoint())
		{
			System.out.println("Player1 wins!");
		}
		else System.out.println("Player2 wins!");

	}

}
