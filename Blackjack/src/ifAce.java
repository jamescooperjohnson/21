import java.util.Scanner;

public class ifAce
	{

		public static void ace()
			{
				Scanner userInput = new Scanner (System.in);	
				int userAce = userInput.nextInt();

					
					System.out.println("What would you like your ace to be worth? (1 or 11)");
					{
						if (userAce == 10)
							{
						(CardDeck.deck).get(0).setValue(10);
							}
						else
							
			(CardDeck.deck).get(0).setValue(1);
					}
					
				
			}
	}
			
			
	
