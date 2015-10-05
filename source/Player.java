package Dicegame;

public class Player {
	private int point = 0;
	private int dobbeltseks = 0;

	public void nulstil()
	{
		point = 0;
	}

	public void dobbeltseks()
	{
		dobbeltseks = 1;
	}

	public void fjerndobbeltseks()
	{
		dobbeltseks = 0;
	}

	public int getDobbeltseks()
	{
		return dobbeltseks;
	}

	public int getPoint()
	{
		return point;
	}
}
