//Created by: Edward Mankiewicz
//Created on: November 1st, 2023
//Purpose: To show basic understanding / progress of arrays

package introToFuncProgramming;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArraysSummary {

	//Linear Search of array using optional int
	public static OptionalInt linSearch(int[] arr, int item) { 
		return Arrays.stream(arr).filter(var -> var==item).findAny();
		//Find any variable filtered by input item
	}
	
	//Find odd numbers
	public static void findOddNumbers(int[] arr) {
		IntPredicate isOdd = num -> num%2==1; //Search for odds
		
		int[] result = Stream.of(arr)
				.flatMapToInt(Arrays::stream) //Creates mapped stream
				.filter(isOdd) //Filter odds
				.toArray(); //Change stream to array
		for (int x : result) { 
			System.out.print(x + " ");
		}
	}
	
	//Reverse array
	public static void reverseArrayInPlace(int[] arr) {
		for (int i=0; i<arr.length / 2;i++) {
			int temp = arr[i]; //Start of bubble sort
			arr[i] =arr[arr.length-1-i]; //Swaps variables at i from both ends
			arr[arr.length-1-i]=temp;
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,6,8,10,12};
		linSearch(arr, 3).ifPresent(System.out::println);
		findOddNumbers(arr);
		System.out.println();
		reverseArrayInPlace(arr);
		

	}

}
