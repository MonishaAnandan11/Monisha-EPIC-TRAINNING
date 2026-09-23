package javaprogram;
import java.util.Scanner;

public class Charstring
{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String str = in.nextLine();
		int[] count = new int[26];
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
		        int val = str.charAt(i)-'A';
		        count[val]++;
		    }
		    else{
		    int val = str.charAt(i)-'a';
		    count[val]++;
		    }
		}
		
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='A' && str.charAt(i)<='Z' ){
		        if(count[str.charAt(i)-'A']==1){
		          System.out.print(str.charAt(i));
		          count[str.charAt(i)-'A']=0;
		        }
		}
		
		
		
		//if duplicate----- >1
		//if distint----- ==1
		//count------- >0
		
		
		
		
		else{
		    if(count[str.charAt(i)-'a']==1)
		          System.out.print(str.charAt(i));
		          count[str.charAt(i)-'a']=0;
		}
		    }
		
// 		for(int i=0;i<str.length();i++){
// 		    if(count[str.charAt(i)-'a']>0)
// 		    System.out.print(str.charAt(i)+" "+count[str.charAt(i)-'a']+" ");
// 		    if(count[str.charAt(i)-'a']>1){
// 		        count[str.charAt(i)-'a']=0;
// 		    }
		    
// 		}
	}
}


