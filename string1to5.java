package javaprogram;
import java.util.Scanner;
public class string1to5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=0;k<n;k++) {
		for(int i=k;i<n;i++){
			for(int j=k;j<i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	}
}
