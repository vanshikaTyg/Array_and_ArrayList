// VANSHIKA TYAGI 
// 22070126128
// AIML B3

import java.util.*;
 
public class Input{
	// int[] since we're returning an int array
	public static int[] Inp(int size) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i=0; i<size; i++){
			array[i] = sc.nextInt();
		}
		return array;
	}
}