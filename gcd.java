package javaprogram;

public class gcd {

	public static void main(String[] args) {
		int num1=18;
		int num2=12;
		int gcd=1;
		for(int i=1;i<=num1 && i<=num2;i++ ) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
	    System.out.println(gcd);

	}

}
