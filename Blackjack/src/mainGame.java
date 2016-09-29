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
		System.out.println("The card you drew is a " + (CardDeck.deck).get(0).getRank() + " of " + (CardDeck.deck).get(0).getSuit() + " (worth " + (CardDeck.deck).get(0).getValue() + ")");
//		ifAce.ace();
		stilldraw = false;
		}
	
	else
		{
		System.out.println("please enter a real answer.");
		stilldraw = true;
		
				}
	
	
	}

try {
    Thread.sleep(1000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
System.out.println("The card I drew was a " + (CardDeck.deck).get(1).getRank() + " of " + (CardDeck.deck).get(1).getSuit() + " (worth " + (CardDeck.deck).get(1).getValue() + ")");
try {
    Thread.sleep(1000);                
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
System.out.println("My card value total is " + (CardDeck.deck).get(1).getValue() + " While yours is " + (CardDeck.deck).get(0).getValue() + ". Press 'Enter' to continue");              //1000 milliseconds is one second.
} 
		
	}

