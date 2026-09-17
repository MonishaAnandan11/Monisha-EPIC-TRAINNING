package javaprogram;

public class strongnumber {

	public static void main(String[] args) {
		int num1=145;
		int sum=0;
		int temp=num1;
		while(num1>0) {
			int digit=num1%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact=fact*i;
			}
			
			sum=sum+fact;
			num1/=10;
		}
		if(sum==temp) {
			System.out.println("strong number");
		}else {
			System.out.println("not strong");
		}

	}

}
