package MethodsInArray;
import java.util.Scanner;
public class Sort {
	public static void main(String[] args) {
		System.out.println("Length of array \n");
		
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a =new int[size];
		
		System.out.println("Enter "+size+ " elements \r");
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Orginal Array");
		System.out.println("===============");
		for(int i=0;i<a.length;i++) {
			System.out.printf("Element %d value %d \n",i,a[i]);
		}
		
		new Sort().getArray(a);
		
	}
	
	 int getArray(int[] array) {
		 System.out.println("==============");
		 System.out.println("The Sorted Array: ");
        for (int i=0;i<array.length;i++) {
			
			for(int j=i;j<array.length;j++) {
				
				int temp=0;
				if(array[i]<array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
			System.out.println("Element "+  i + " Value "+ array[i]);
			
		}
        return 0;
	}
}
