package MethodsInArray;

public class reverse {
	
	public static void revArray(int[] array) {
		int[] newArray=new int[array.length];
		int j=array.length;
		
		for(int i=0;i<array.length;i++) {
			newArray[j-1]=array[i];
			j-=1;
			
		}
		for(int i=0;i<newArray.length;i++) {
		System.out.println(newArray[i]);}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		revArray(a);
	}
}
