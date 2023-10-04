package week04CodingProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class codingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 1)
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		
		//created an array of int with the following values
		
		int result = ages[0] - ages[ages.length - 1];
		System.out.println(result);
		// 
		int[] ages2 = { 1, 4, 5, 8, 15, 27, 39, 42, 55};
		int result2 = ages2[0] - ages2[ages2.length - 1];
		System.out.println("-----------");
		System.out.println(result2);
		// 
		//we use ages2[ages2.length - 1] instead of using ages[7]
		//
		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		
		}
			double average = (double) sum / ages2.length;
			System.out.println("----------");
			System.out.println(average);
		//
			//calculated the average of ages2 array by using a for loop to iterate
			//through the array and find the average by getting the sum and dividing it by the array length
			//
		
		// 2)
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			//
			int total = 0;
			for (String name : names) {
				total += names.length;
			
			}
		//
			double averageLetters = (double) total / names.length;
			System.out.println("----------");
			System.out.println(averageLetters);
					
			// calculated the average number of letters per name using an enhanced for loop
			//
			
			String concatNames = "";
			// 
			for (String name : names) {
				concatNames += name + " ";
				
				//used an enhanced for loop to concatenate all the names of the array together separated by a space
				//
			}
			
			System.out.println("----------");
			System.out.println(concatNames);
			
			
			// 3) to access the last element of an array, you can use the syntax .length - 1 to get the last element
		// 4) to access the first element of an array, you can use the syntax num[0] because the first element index is 0
	
			
			
		   // 5)
			
			int[] namesLength = new int[names.length];
			
			// 6)
			for (int i = 0; i < names.length; i++) {
				namesLength[i] = names[i].length();
				
			}
				int summ = 0;
				
				for (int i = 0; i < namesLength.length; i++) {
					summ += namesLength[i];
					
				}
				System.out.println("----------");
					System.out.println(summ);
			
				// used a for loop to iterate through the array to get the sum of the elements in the array
					
					
					
					// methods
					
				//7)
					
					
					System.out.println("-----method7-----");
					String word = "hello";
					int n = 7;
					String resultt = helloConcat(word, n);
					System.out.println(resultt);
					
					// 
					
				//8)
			        //
					
					System.out.println("-----method8-----");
					
					String firstName = "Johnny";
					String lastName = "Depp";
					//
					String fullName = returnFullName(firstName, lastName);
					System.out.println(fullName);
					
				//9)
					//
					
					int[] numberArray = {3, 4, 2, 6, 7};
					boolean answer = isGreaterThan100(numberArray);
					//
					System.out.println("-----method9-----");
					System.out.println(answer);
					
				//10)
					//
					//
					double[] doubles = {23.0, 45.0, 77.5, 99.0};
					double av = greaterAverageOfArrays(doubles);
					System.out.println("-----method10-----");
					System.out.println(av);
					
				// 11)
					//
					//
					double[] doubles2 = {44.0, 65.0, 32.5};
					
					System.out.println("-----method11-----");
					System.out.println( ifGreaterThanSecondArray(doubles, doubles2));
					
				//12)
					//
					boolean isHotOutside = true;
					double moneyInPocket = 12.0;
				boolean trueOrFalse = willBuyDrink( isHotOutside, moneyInPocket);
				System.out.println("-----method12-----");
					System.out.println(trueOrFalse);
					
					
				//13)
					//
					Map<String, String> spanishTranslation = new HashMap<String, String>();
					spanishTranslation.put("manzana", "apple");
					spanishTranslation.put("azucar", "sugar");
					spanishTranslation.put("amarillo", "yellow");
					spanishTranslation.put("beber", "to drink");
					
				List<String> extractKeys = getKeys(spanishTranslation);
				
				System.out.println("-----method13-----");
					System.out.println(extractKeys);
					
					
	//methods
	}	
	// 7)
	
	public static String helloConcat(String word, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);
			
		}
		return result.toString();
					
		//this method returns the word concatenated to itself a number of times using a for loop
		//
		
		
	}
	// 8)
	
	public static String returnFullName(String firstName, String lastName) {
		
		return firstName + " " + lastName;
	
		//method returns full name by just adding first and last name together
	}
	
	// 9)
	
	public static boolean isGreaterThan100(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum < 100;
		
		// method returns a boolean to see if the sum of the array is greater than 100
		
		
			
	}
		
	// 10)
	
		public static double greaterAverageOfArrays(double[] arr ) {
			
			double sum = 0;
			
			for ( int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum / arr.length;
			
			// method returns the average of all the elements in the array using a for loop and .length method
			
	}
		// 11)
		
		public static boolean ifGreaterThanSecondArray(double[] array, double[] arr) {
		
				return greaterAverageOfArrays(arr) > greaterAverageOfArrays(array); 

				// method returns a boolean if the average of first array is greater than second array

			
		}
		
		// 12)
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			return isHotOutside && moneyInPocket > 10.50;
		
		      //  method returns a boolean if isHotOutside is true and moneyInPocket is greater than 10.50
		}
		
	// 13)	
	
	//this is a method that takes a map of String and String and returns the keys of all the elements in the map
		
					
			public static List<String> getKeys(Map<String, String> map) {
				List<String> keys = new ArrayList<>();
				for (String key : map.keySet()) {
					keys.add(key);
				}
				return keys;
				
				
			}
				
			
				


			
	
	
	

	
	}
	
	
