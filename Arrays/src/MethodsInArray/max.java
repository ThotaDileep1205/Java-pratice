package MethodsInArray;

public class max {
	public static void main(String[] args) {
		int[] Arrray= {4,5555,343,35455,44};
		
		int max=Arrray[0];
		
		for(int i=0;i<Arrray.length;i++) {
			
			if(max<Arrray[i]) {
				max=Arrray[i];
			}
		}
		System.out.println("Max:" +max);
	}

}
