package JavaLab5;
//Lab 5 - Java Collections Framework: ArrayList

/* -------------------------- Q1 --------------------------
・Create an ArrayList of Integers
・Fill each of the 10 slots with a random value from 1-50.
・Display those values on the screen, and then prompt the user for an integer.
・Search through the ArrayList, and if the item is present, print a message that the number is in the list.
・If the value is not in the ArrayList, print a message that the number is not in the list */

import java.util.*;

public class Lab5Q1 {

	public static void main(String[] args) {

		Random r = new Random();

		//Create an ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();


		//Fill each of the 10 slots with a random value from 1-50.
		for (int i = 0; i < 10; i++) {
			list.add(1 + r.nextInt(50));
		}
		/*Display those values on the screen,
		  and then prompt the user for an integer.*/ 
		System.out.println("ArrayList: " + list);
		System.out.print("Value to find: ");

		Scanner scan = new Scanner(System.in);
		int value = 0;
		
		/* Search through the ArrayList, and if the item is present, 
		 * print a message that the number is in the list.*/
		try {
			value = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter 'an Integer'. Please try again.");
		} finally {
			scan.close();
		}

		/* If the value is not in the ArrayList, 
		print a message that the number is not in the list */

		/* "The contains() method" of List interface in Java 
		is used for checking if the specified element exists in the given list or not.*/ 
		if (list.contains(value)) {
			System.out.println(value + " is in the ArrayList.");
		} else {
			System.out.println(value + " is not in the ArrayList.");
		}
	}
}
