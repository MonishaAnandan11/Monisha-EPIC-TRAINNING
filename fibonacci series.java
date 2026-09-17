package javaprogram;
import java.util.Scanner;
public class fibonacciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int second=1;
		for(int i=1;i<=n;i++) {
			System.out.println(first +"");
			int next=first+second;
			first=second;
			second=next;
		}

	}

}
