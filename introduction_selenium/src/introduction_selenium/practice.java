package introduction_selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class practice {
	public static void main(String args[]) {
		int arr[] = {-1,-2,-3,-4,5};  // {-1,-2,-3,-4,5}  
		int arrAbs[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arrAbs[i] = Math.abs(arr[i]);
		}
		Arrays.sort(arr);
		int maxProduct = arr[arr.length-1];
		int number =1;
		for(int j=arr.length-2;j>=0;j--) {
			if(number ==3) {
				break;
			}
			maxProduct = maxProduct*arr[j];
			number++;
		}
		System.out.println(maxProduct); // 2, -4, 5  // -4 , 4, 5
	}
}
