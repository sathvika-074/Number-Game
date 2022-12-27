import java.util.Random;
import java.util.Scanner;
class Generate
{
	public void newGame()
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int number=r.nextInt(151);
		System.out.println("--->Generating a Random Number...");
		System.out.println("--->Number is generated!");
		System.out.println("***The number generated is in between 1-150***");
		System.out.print("--->Number of guesses you want make (less than 5): ");
		int count=sc.nextInt();
		while(count>5)
		{
			System.out.print("--->Limit exceeded! Enter a number less than 5: ");
			count=sc.nextInt();
		}
		System.out.println("You have only "+count+" chances");
		int marks=100;
		int i=0;
		for(i=0;i<count;i++)
		{
			
			System.out.println("*Chance no: "+(i+1)+"*");
			System.out.print("--->Enter the guessed number: ");
			int guess=sc.nextInt();
			if(guess==number)
			{
				System.out.println("Hurray! You won the Game");
				System.out.println("Your score: "+marks);
				break;
			}
			else if(guess<number)
			{
				System.out.println("--->Guess a Larger Number");
			}
			else
			{
				System.out.println("--->Guess a Smaller Number");
			}
			marks-=10;
		} 
		if(i>=count)
		{
			System.out.println("You Lost the game, better luck next time...");
			System.out.println("Your score: 0 ");
			System.out.println("The generated number is "+number);
		}
	}
}
class NumberGuess
{
    public static void main(String args[])
    {
	    System.out.println("***Task-2***");
        System.out.println("***Number Guessing game***");
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Start the game (Yes/No): ");
	    String s=sc.nextLine();
        Generate g=new Generate();
	    while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
	    {
		    g.newGame();
		    System.out.print("Want to play one more time (Yes/No): ");
		    s=sc.nextLine();
	    }
	
    }
} 