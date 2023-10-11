package JavaWeek6FinalProject;

public class Card {

	// created fields value and name
	    private String name;
	    private int value;

	    
	 // constructor for the Card class   
	    public Card(String name, int value) {
	        this.name = name;
	        this.value = value;
	    }

	    
	    // added the getters and setters 
	    public int getValue() {
	        return value;
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setValue(int value) {
			this.value = value;
		}

		// the describe method 
		public void describe() {
	        System.out.println(name + " - value of " + value);
	    }
	}

