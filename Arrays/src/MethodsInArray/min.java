package MethodsInArray;

import java.util.Scanner;

public class min {
	public static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		int[] a= {4,6,0,5,7};
		for(int array:a) {
			System.out.println(array);
		}
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(" Min Value "+min);
			
		}
		
		
		

}
