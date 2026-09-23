package javaprogram;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(num>0) {
			int r=(num%10);
			sum=sum+(r*r*r);
			num/=10;
		}
		if(n==sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
        sc.close();
	}

}