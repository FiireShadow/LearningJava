//Created by: Edward Mankiewicz
//Created on: November 4th, 2023
//Purpose: To show basic understanding / progress of LinkedList

package introToFuncProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSummary {

	public static List<Integer> findMissingElements(int[] a, int[] b){
		List<Integer> missingElements = new ArrayList<>();
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i : b) {
			hashSet.add(i);//Add elements of b to hashSet
		}
		
		for (int i : a) {
			if (!hashSet.contains(i)) {//Check if elements from a match b
				missingElements.add(i);//Add to List if not
			}
		}
		return missingElements;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,3,6,7,9,10,12};
		int[] arr2 = {1,4,6,8,9,11,12};
		
		findMissingElements(arr1,arr2)
				.forEach(System.out::println);
		
	}
}
