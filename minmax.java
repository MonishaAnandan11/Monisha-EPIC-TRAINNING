package javaprogram;

public class array {

	public static void main(String[] args) {
		int[] arr= {2,5,3,4,7};
//		for(int i=4;i>=0;i--) { 
//			System.out.println(arr[i]);
//		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<5;i++) {
			if(arr[i]>max) {
				 max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println(max);	
		System.out.println(min);
        
	}

}
