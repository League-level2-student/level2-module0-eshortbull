package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String NEW[] = {"Banna", "Apple", "Cherry", "Grape", "StrawBerry"};
		String Fruit3 = NEW[2];
		//2. print the third element in the array
		System.out.println(Fruit3);
		//3. set the third element to a different value
	Fruit3 = "Kiwi";
		//4. print the third element again
	  System.out.println(Fruit3);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	  for (int i = 0; i < NEW.length; i++) {
			System.out.println(NEW[i]);
		}
		
		//6. make an array of 50 integers
		int[] ints = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		int Random = rand.nextInt(50);
		for (int i = 0; i < ints.length; i++) {
			
			ints[i] = Random;
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int Small = Integer.MIN_VALUE;
		System.out.println(Small);
		//9 print the entire array to see if step 8 was correct
		
		System.out.println(Arrays.toString(NEW));
		//10. print the largest number in the array.
		int Big = Integer.MAX_VALUE;
		
		System.out.println(Big);
	}
}
