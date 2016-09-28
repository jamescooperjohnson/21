import java.util.Scanner;

public class mainGame
	{

		public static void Game()
			{

boolean stilldraw = true;

while(stilldraw)
	{
	
System.out.println("Please type 'draw' to draw a card" );
	
Scanner userInput3 = new Scanner (System.in);
	
String userDraw = userInput3.nextLine();

if (userDraw.equals("draw") || userDraw.equals("Draw") || userDraw.equals("DRAW"))
		{
	
	System.out.println();
	stilldraw = false;
		}
	
else
	{
	System.out.println("please enter a real answer.");
	stilldraw = true;
	
			}

			}

	}
}