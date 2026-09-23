import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n= in.nextInt();
	    List<Integer> li = new ArrayList<>();
	    //10 20 10 20 30
	    for(int i=0;i<n;i++){
	        li.add(in.nextInt());
	    }
	
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
	
	    for(int val : li){
	        //set[30]
	        if(!set1.add(val)){
	            set2.add(val);
	        }
	    }
	    set1.removeAll(set2);
	    System.out.println(set1);
	
	
	
	}
}