package MethodsInArray;
import java.util.*;
public class avg {
	public static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the length of Array");
		int sizeOfArray=s.nextInt();
		int[] myInt=getArray(sizeOfArray);
		System.out.println("The average is :"+getAvg(myInt));
		printArray(myInt);
	}
		
	public static void printArray(int[] array) {
			for(int i=0;i<array.length;i++) {
			
			System.out.println("element "+i+" value is "+array[i]);
			
		}
	}
	
		public static int[] getArray(int number) {
			System.out.println("Enter "+number+" elements");
			
			int[] value=new int[number];
			for(int i=0;i<value.length;i++) {
				value[i]=s.nextInt();
			}
			return value;
		}
		
		
		public static double  getAvg(int[] array) {
			double sum=0;
			for(int i=0;i<array.length;i++) {
				sum+=array[i];
			}
			return sum / array.length;
			
		}	
		
}
