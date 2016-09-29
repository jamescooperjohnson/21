
		import java.util.ArrayList;
		import java.util.Collections;
		public class CardDeck
			{
			static ArrayList <Card> deck = new ArrayList <Card>();
			public static void fillDeck()
				{
				
				
				deck.add(new Card("two", "Spades", 2 ));
				deck.add(new Card("three", "Spades", 3 ));
				deck.add(new Card("four", "Spades", 4));
				deck.add(new Card("five", "Spades", 5));
				deck.add(new Card("six", "Spades", 6));
				deck.add(new Card("seven", "Spades", 7));
				deck.add(new Card("eight", "Spades", 8));
				deck.add(new Card("nine", "Spades", 9));
				deck.add(new Card("ten", "Spades", 10));
				deck.add(new Card("jack", "Spades", 10));
				deck.add(new Card("queen", "Spades", 10));
				deck.add(new Card("king", "Spades", 10));
				deck.add(new Card("Ace", "Spades", 11));
				
				
				deck.add(new Card("two", "Hearts", 2 ));
				deck.add(new Card("three", "Hearts", 3 ));
				deck.add(new Card("four", "Hearts", 4));
				deck.add(new Card("five", "Hearts", 5));
				deck.add(new Card("six", "Hearts", 6));
				deck.add(new Card("seven", "Hearts", 7));
				deck.add(new Card("eight", "Hearts", 8));
				deck.add(new Card("nine", "Hearts", 9));
				deck.add(new Card("ten", "Hearts", 10));
				deck.add(new Card("jack", "Hearts", 10));
				deck.add(new Card("queen", "Hearts", 10));
				deck.add(new Card("king", "Hearts", 10));
				deck.add(new Card("Ace", "Hearts", 11));
				
				
				deck.add(new Card("two", "Diamonds", 2 ));
				deck.add(new Card("three", "Diamonds", 3 ));
				deck.add(new Card("four", "Diamonds", 4));
				deck.add(new Card("five", "Diamonds", 5));
				deck.add(new Card("six", "Diamonds", 6));
				deck.add(new Card("seven", "Diamonds", 7));
				deck.add(new Card("eight", "Diamonds", 8));
				deck.add(new Card("nine", "Diamonds", 9));
				deck.add(new Card("ten", "Diamonds", 10));
				deck.add(new Card("jack", "Diamonds", 10));
				deck.add(new Card("queen", "Diamonds", 10));
				deck.add(new Card("king", "Diamonds", 10));
				deck.add(new Card("Ace", "Diamonds", 11));
				
				
				deck.add(new Card("two", "Clubs", 2 ));
				deck.add(new Card("three", "Clubs", 3 ));
				deck.add(new Card("four", "Clubs", 4));
				deck.add(new Card("five", "Clubs", 5));
				deck.add(new Card("six", "Clubs", 6));
				deck.add(new Card("seven", "Clubs", 7));
				deck.add(new Card("eight", "Clubs", 8));
				deck.add(new Card("nine", "Clubs", 9));
				deck.add(new Card("ten", "Clubs", 10));
				deck.add(new Card("jack", "Clubs", 10));
				deck.add(new Card("queen", "Clubs", 10));
				deck.add(new Card("king", "Clubs", 10));
				deck.add(new Card("Ace", "Clubs", 11));
				
				Collections.shuffle(deck);
				
				
				}
	}