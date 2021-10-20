package deckofcards;

public class DeckOfCards {
	public static void main(String[] args) {
		//initialising the suits of the deck in a String array named 'SUITS'
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        
        //initialising the ranks of the deck in a String array named 'RANKS'
        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        int n = SUITS.length * RANKS.length; // a deck consists of 4*13 cards
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
        	//using random function
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            //swapping and shuffling
            deck[i] = temp;
        }

        // print shuffled deck of four cards
        for (int i = 0; i<=3; i++) {
            System.out.println(deck[i]);
        }
    }

}
