package javaprogram;
import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=12;
		int num2=18;
		int max=(num1>num2)? num1:num2;
		while(true)	{
			if(max%num1==0 && max%num2==0) {
				System.out.println(max);
			break;
			}
		max++;
		}

	}

}
