package csu.matos;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
//		Integer[] a = {10, 2, 5, 1, 7, 9, 8, 12, 1};
//		System.out.println(Array.toString(a));
//		
//		bubbleSort(a);
//		System.out.println(Array.toString(a));
		
		Integer[] a = {10, 20, 30};
		Integer[] b = {5, 7, 9};
		Integer[] c = merge(a,b);
		System.out.println(Arrays.toString(c));
		
 	
	}

	private static Integer[] merge(Integer[] a, Integer[] b) {
		Integer[] solution = new Integer[a.length + b.length];
		
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		
		while (i1 < a.length && i2 < b.length){
			if(a[i1]<=b[i2]){
				solution[i3++] = a[i1];
				i2++;
			}
		}
		
		while (i1 < a.length){
			solution[i3++] = a[i1];
			i1++;
		}
		
		while (i2 < a.length){
			solution[i3++] = a[i2];
			i2++;
		}
		
		return solution;
	}

	private static void bubbleSort(Integer[] a) {
		
	}
}