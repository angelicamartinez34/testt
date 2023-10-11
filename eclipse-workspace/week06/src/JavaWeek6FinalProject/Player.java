package JavaWeek6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	// Fields
	  
	    private List<Card> hand = new ArrayList<>();
	    int score = 0;
	    private String name;

    // player class constructor
	    
	    public Player() {
	    	setScore(0);
	    }

	    
    // methods
	    
	    // the describe method
	    public void describe() {
	        System.out.println("Player: " + name);
	        System.out.println("Score: " + score);
	        System.out.println("Hand: " + hand);
	        for (Card card : hand) {
	            card.describe();
	    	}
	    }
	    
	   
	   
	    // this method removes and returns the top card of the hand
	    public Card flip() {
	    	return hand.remove(0);
	    }
	    
	    //this method takes the deck and calls the draw method and adds the returning card to the hand
	    public void draw(Deck deck) {
	    	hand.add(deck.draw());
	    }
	    
	    // this method adds 1 to the players score
	    public void incrementScore() {
	    	setScore(getScore() + 1);
	    }
		
	    // getter and setter
        public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		
}

	   
