package JavaWeek6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	
	// created field cards then string array lists suits and values to hold the names of the suits and the values of each card
	     List<Card> cards = new ArrayList<Card>();

	       
	        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
	        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

	        
	        // constructor for the Deck class
	        // this enhanced for-loop instantiates a new deck and populates the cards
	        public Deck() {  
	        for (String suit : suits) {
	            for (int value = 2; value <= 14; value++) {
	                String name = values[value - 2] + " of " + suit;
	                cards.add(new Card(name, value));
	            }
	        }
	    }
	        
	        // methods
	        
	        
	        // shuffle method randomizes the cards
	    public void shuffle() {
	        Collections.shuffle(cards);
	    }

	    // draw method removes and returns the top card 
	    public Card draw() {
	  return cards.remove(0);
		}
	}

