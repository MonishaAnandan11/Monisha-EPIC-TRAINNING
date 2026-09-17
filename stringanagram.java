package javaprogram;
import java.util.Scanner;
public class Stringanagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n1=sc.nextLine();
		String n2=sc.nextLine();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		for(int i=0;i<n1.length();i++) {
			for(int j=0;j<n2.length();j++) {
				System.out.print(arr1(i)==arr2(j));
			}
		}
	}

}
