package GuesserGame;
import java.util.Scanner;

class Guesser
{
	int guessNum;
	public int guessNumber()
	{
		System.out.println("Guesser Please guess a number : ");
		Scanner scan = new Scanner(System.in);
		guessNum=scan.nextInt();
		//scan.close();
		return guessNum;
	}  
}

class Player
{
	int PguessNum;
	public int guessNumber()
	{
		System.out.println("Player please guess guess number : ");
		Scanner scan = new Scanner(System.in);
		PguessNum= scan.nextInt();
		//scan.close();
		return PguessNum;	
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void CollectFromGuesser()
	{
		Guesser gs= new Guesser();
		numFromGuesser=gs.guessNumber();
	}
	
	public void CollectFromPlayers()
	{
		Player p1= new Player();
		Player p2= new Player();
		Player p3= new Player();
	    numFromPlayer1 = p1.guessNumber();
	    numFromPlayer2 = p2.guessNumber();
	    numFromPlayer3 = p3.guessNumber();  
	}
	
	public void Compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All three players won the game");
			}
			
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Both player 1 and player 2 won the game");
			}
			
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Both player 1 and player 3  won the game ");
			}
		 
		
			else
			{
				System.out.println("Player 1 won the game");
			}
		}
		
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Both player 2 and player 3 won the game");
			}
			
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		
		else 
		{
			System.out.println("Player 3 won the game");
		}
	}	
}

public class LaunchGuesserGame
{
	public static void main(String[]args)
	{
		Umpire ump = new Umpire();
		ump.CollectFromGuesser();
		ump.CollectFromPlayers();
		ump.Compare();
	}
		
}
