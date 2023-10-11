package JavaWeek6FinalProject;

public class App {

	public static void main(String[] args) {
			
		// instantiated a deck and 2 players 
			Deck deck = new Deck();
			
			Player player1 = new Player();
			Player player2 = new Player();
			
			// called the shuffle method on the deck
			deck.shuffle();
			
			// used a for loop to iterate 52 times , called the draw method on the players each iteration 
			for(int i = 0; i < 52; i++) {
				if (i % 2 ==  0) { 
					player1.draw(deck); } 		
				else { 
					player2.draw(deck); }
			}	
			
			// used a for loop to iterate 26 times and called the flip method for each player
			for(int j = 1; j < 26; j++) {
				Card p1 = player1.flip();
				Card p2 = player2.flip();
				
				//prints out both the players card each round to see who's is higher
				System.out.println("Player1's card is:");
				p1.describe();
				System.out.println("Player2's card is:");
				p2.describe();
			
				
				int value1 = p1.getValue();
				int value2 = p2.getValue();
				
				
				// used and if statement to compare the value of each card returned by the players flip methods
				// called the incrementScore method to find which player has the higher value 
				// prints out the players updated scores to see who won that round or if its a tie
				
				if (value1 > value2) {
					player1.incrementScore();
					System.out.println("Player1 wins the round!");
				} else if (value1 < value2){
					player2.incrementScore();
					System.out.println("Player2 wins the round!");
				} else {
					System.out.println("It\'s a tie!");
				
				}
				System.out.println("----round " + j);
			}
			// prints out the final score after the loop has finished
			System.out.println("Player1's score is now " + player1.getScore());
			System.out.println("Player2's score is now " + player2.getScore());
			
			
			//prints out the final score and who won the game
			if (player1.score > player2.score) {
				System.out.println("Player1 is the winner of the game with a final score of " + player1.score + " to " + player2.score + "!!");
			} else if (player2.score > player1.score){
				System.out.println("Player2 is the winner of the game with a final score of " + player2.score + " to " + player1.score + "!!");
			} else {
				System.out.println("The game ended in a draw with the final score: " + player1.score + " to " + player2.score + "!!");
			}
			
						
		}
	}	