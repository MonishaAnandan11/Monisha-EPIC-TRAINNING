package javaprogram;
import java.util.Scanner;
public class Countcharstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		int count=0;
		for(int i=0;i<ch.length();i++) {
	    count++;
		
	}
		System.out.print(count);
	}
}
