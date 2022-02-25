package Labs;

public class ArraysAndMethods {

	public static void main(String[] args) {
		
		//create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = {1, 5, 2, 8, 13, 6};
		
		//print out the first element in the array
		System.out.println(array[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(array[array.length - 1]);
		
		//print out the element in the array at position -1. What happens?
//		System.out.println(array[6]); 
		/*
		 * 1
		 * 6
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6
		 * out of bounds for length 6 at
		 * Labs.ArraysAndMethods.main(ArraysAndMethods.java:17)
		 */
		
		//print out the element in the array at position -1. What happens?
//		System.out.println(array[-1]); 
		/*
		 * 1
		 * 6
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1
		 * out of bounds for length 6 at
		 * Labs.ArraysAndMethods.main(ArraysAndMethods.java:25)
		 */
		
		//write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//write an enhanced for loop that prints out each element in the array
		for (int number : array) {
			System.out.println(number);
		}
		
		//create a variable called sum, write a loop that adds each element in the array to the sum
		double sum = 0;
		for (int number : array) {
			sum += number;			
		}
		System.out.println(sum);
		
		//create a new variable called average and assign average value of the array to it
		double average = sum / array.length;
		System.out.println(average);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int number : array) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		for (String name : names) {
			System.out.println(name);
		}
		
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
			
		
		// Write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greetUser("Tom");
		greetUser("Sally");
		
		//Write a method that takes a String name and returns a greeting, do not print in the method
		System.out.println(greetReturn("Bob"));
		System.out.println(greetReturn("Susan"));
		
		// analyze the difference between these two methods - what do you find? How are they different?
		/*
		 * The first will print by calling the method directly, but the second returns a
		 * value that can be printed or used otherwise.
		 */
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int.
		System.out.println(isGreater("Hello" , 3));
		
		//write and test a method that takes an array of string and returns true if the string passed in exists in the array		
		System.out.println("The word exists: " + doesExists(names, "Thomas"));
		
		//Write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println("The smallest number is: " + findSmallestNumber(array));
		
		//Write and test a method that takes an array of double and returns the average
		double[] sample = {12.5, 24.6, 82.0, 105.4};
		System.out.println(findAverage(sample));
		
		//Write and test a method that takes an array of Strings and returns an array of int where each element 
		//matches the length of the string at that position.
		int[] stringLengths = findElementLengths(names);
		for (int number : stringLengths) {
			System.out.println(number);
		}
		
		//Write and test a method that takes an array of Strings and returns true if the sum of letters for all strings with an 
		//even amount of letters is greater than the sum of those with an odd amount of letters
		System.out.println(lessIsMore(names));
		
		//Write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println(isPalindrome("Racecar"));
	}
	
	public static boolean isPalindrome (String word) {
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				return false;
			}
		}return true;
	}
	
	public static boolean lessIsMore(String[] array) {
		int evenLength = 0;
		int oddLength = 0;
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLength += string.length();
			} else {
				oddLength += string.length();
			}			
		} return evenLength > oddLength;
	}
	
	public static int[] findElementLengths(String[] array) {
		int[] lengthsOfStrings = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			lengthsOfStrings[i] = array[i].length();			
		}	
		return lengthsOfStrings;
	}
	
	public static double findAverage(double[] array) {
		double total = 0.0;		
		for (double number : array) {
			total =+ number;
		} 
		return total / array.length;
		
	}
	
	public static int findSmallestNumber(int[] array) {
		int smallestNumber = array[0];
		for (int number : array) {
			if (smallestNumber > number) {
				smallestNumber = number; 
			}			
		} 
		return smallestNumber;
		
	}
	
	public static boolean doesExists(String[] array, String word) {
		for (String str : array) {
			if (str.equals(word)) {
				return true;
			}
		} 
		return false;
	}
	
	public static boolean isGreater(String word, int length) {
		return word.length() > length;		
	}

	public static String greetReturn(String name) {
		return "Hello " + name + "!";		
	} 

	public static void greetUser(String name) {
		System.out.println("Greetings " + name + "!");
	}
		
}
