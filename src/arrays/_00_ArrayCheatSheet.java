package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] food = { "pizza","sushi","sandwich", "burger", "hot dog"};
		//2. print the third element in the array
		System.out.println(food[3]);
		//3. set the third element to a different value
		food[3]= "pasta";
		//4. print the third element again
		System.out.println(food[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
		//6. make an array of 50 integers
		int[] age = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < age.length; i++) {
			age[i]=r.nextInt(50);
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int a = Integer.MAX_VALUE;
		for (int i = 0; i < age.length; i++) {
			if(age[i]< a) {
				a = age[i];
				
			}
			
		}
		System.out.println(a + " smallest");
		//9 print the entire array to see if step 8 was correct
		for (int j = 0; j < age.length; j++) {
			System.out.println(age[j]);
		}
		
		//10. print the largest number in the array.
		int b = Integer.MIN_VALUE;
		for (int i = 0; i < age.length; i++) {
			if(age[i]>b) {
				b= age[i];
			}
		}
		System.out.println(b + " biggest");
	}
}
