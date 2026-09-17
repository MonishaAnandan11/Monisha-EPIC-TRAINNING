package javaprogram;
import java.util.Scanner;
public class numpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			int val=0;
			for(int j=0;j<=n;j++) {
				if(j<=i) {
					System.out.println(++val);
				}else if(i+j>=n) {
					System.out.println(--val);
				}else {
					System.out.println(val);
				}
			}
		}

	}

}
