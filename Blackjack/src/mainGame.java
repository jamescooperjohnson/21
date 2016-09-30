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
		
		if ((CardDeck.deck).get(0).getSuit().equals("ace"))
		{
		ifAce.ace();
		}
		stilldraw = false;
		}
	
	else
		{
		System.out.println("please enter a real answer.");
		stilldraw = true;
		
				}
	
	
	}

try {
    Thread.sleep(3000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
System.out.println("The card I drew was a " + (CardDeck.deck).get(1).getRank() + " of " + (CardDeck.deck).get(1).getSuit() + " (worth " + (CardDeck.deck).get(1).getValue() + ")");
try {
    Thread.sleep(3000);                
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
System.out.println("My card value total is " + (CardDeck.deck).get(1).getValue() + " While yours is " + (CardDeck.deck).get(0).getValue());
			}
	

	public static void love(){	
		boolean redraw = true;
		while(redraw)
			{

 System.out.println("Type 'draw' to draw again");              
 
		
			
			
				
			Scanner userInput4 = new Scanner (System.in);
				
			String userreDraw = userInput4.nextLine();
			
			if (userreDraw.equals("draw") || userreDraw.equals("Draw") || userreDraw.equals("DRAW"))
					
				{
				System.out.println("The card you drew is a " + (CardDeck.deck).get(2).getRank() + " of " + (CardDeck.deck).get(2).getSuit() + " (worth " + (CardDeck.deck).get(2).getValue() + ")");
				
				if ((CardDeck.deck).get(2).getSuit().equals("ace"))
				{
				ifAce.ace();
				}
				redraw = false;
				}
			
			else
				{
				System.out.println("please enter a real answer.");
				redraw = true;
				
						}
			
			
			}

		try {
		    Thread.sleep(3000);                 
		} catch(InterruptedException xw) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("The card I drew was a " + (CardDeck.deck).get(3).getRank() + " of " + (CardDeck.deck).get(3).getSuit() + " (worth " + (CardDeck.deck).get(3).getValue() + ")");
		try {
		    Thread.sleep(3000);                
		} catch(InterruptedException xe) {
		    Thread.currentThread().interrupt();
		}
		
		
		if (((CardDeck.deck).get(2).getValue() + (CardDeck.deck).get(0).getValue() == 21) || ((CardDeck.deck).get(1).getValue() + (CardDeck.deck).get(3).getValue() >= 21))
		{
		System.out.println("You Win!");
		System.exit(0);
		}
		if (((CardDeck.deck).get(1).getValue() + (CardDeck.deck).get(3).getValue() == 21) || ((CardDeck.deck).get(2).getValue() + (CardDeck.deck).get(0).getValue() >= 21))
		{
		System.out.println("You Lose!");
		System.exit(0);
		}
		else
		{
			System.out.println("My card value total is " + ((CardDeck.deck).get(1).getValue() + (CardDeck.deck).get(3).getValue())  + " While yours is " + ((CardDeck.deck).get(2).getValue() + (CardDeck.deck).get(0).getValue()));             
		
		}
	}

		public static void snale1(){	
			boolean threedraw = true;
			while(threedraw)
				{

	 System.out.println("Type 'draw' to draw again");              
	 
			
				
				
					
				Scanner userInput5 = new Scanner (System.in);
					
				String user3Draw = userInput5.nextLine();
				
				if (user3Draw.equals("draw") || user3Draw.equals("Draw") || user3Draw.equals("DRAW"))
						
					{
					System.out.println("The card you drew is a " + (CardDeck.deck).get(4).getRank() + " of " + (CardDeck.deck).get(4).getSuit() + " (worth " + (CardDeck.deck).get(4).getValue() + ")");
					
					if ((CardDeck.deck).get(4).getSuit().equals("ace"))
					{
					ifAce.ace();
					}
					threedraw = false;
					}
				
				else
					{
					System.out.println("please enter a real answer.");
					threedraw = true;
					
							}
				
				
				}

			try {
			    Thread.sleep(3000);                 
			} catch(InterruptedException xw) {
			    Thread.currentThread().interrupt();
			}
			System.out.println("The card I drew was a " + (CardDeck.deck).get(5).getRank() + " of " + (CardDeck.deck).get(5).getSuit() + " (worth " + (CardDeck.deck).get(5).getValue() + ")");
			try {
			    Thread.sleep(3000);                
			} catch(InterruptedException xe) {
			    Thread.currentThread().interrupt();
			}
			
			
			if (((CardDeck.deck).get(2).getValue() + (CardDeck.deck).get(0).getValue() + (CardDeck.deck).get(4).getValue() == 21) || ((CardDeck.deck).get(5).getValue() + (CardDeck.deck).get(1).getValue() + (CardDeck.deck).get(3).getValue() >= 21))
			{
			System.out.println("You Win!");
			System.exit(0);
			}
			if (((CardDeck.deck).get(1).getValue() + (CardDeck.deck).get(3).getValue() + (CardDeck.deck).get(5).getValue() == 21) || ( (CardDeck.deck).get(4).getValue() +(CardDeck.deck).get(2).getValue() + (CardDeck.deck).get(0).getValue() >= 21))
			{
			System.out.println("You Lose!");
			System.exit(0);
			}
			else
			{
				System.out.println("My card value total is " + ((CardDeck.deck).get(1).getValue() + (CardDeck.deck).get(3).getValue() + (CardDeck.deck).get(5).getValue())  + " While yours is " + ((CardDeck.deck).get(4).getValue() + (CardDeck.deck).get(2).getValue() + (CardDeck.deck).get(0).getValue()) + ". Type 'draw' to draw again");             
			
			}	
		
		}
	}
	
		
	
	












