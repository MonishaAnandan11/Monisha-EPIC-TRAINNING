
package javaprogram;

public class duplicate {
	public static void main(String[] args) {
		int n= 7;
		int arr[]= {1,1,2,3,2,2,1};
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i !=j) {
					if(i<j && arr[i]==arr[j]) {
						System.out.print(arr[i]+ " ");
						break;
					}else if(i>j && arr[i]==arr[j]) {
						break;
					}
					
				}
			}
			
		}
	}

}

