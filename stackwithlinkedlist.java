import java.util.*;
class Node{
    int data;
    Node next;
    Node top=null,head=null;
    
    Node(int d,Node n){
        this.data=d;
        this.next=n;
    }
    
    Node(){
        
    }
    
    public void push(Scanner sc){
        System.out.println("Enter the number of data: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            Node obj = new Node(val,null);
            if(top==null){
                top=obj;
            }else{
                obj.next=top;
            }
            top=obj;
    }
        
    }
    public void display(){
        Node temp=top;
        while(top.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("stack Overflow");
        }else{
           top=top.next;
           System.out.println("data poped");
        }
    }
    public boolean isEmply(){
        if(top==-1){
            return true;
        }
         return false;
    }
    public void peek(){
        if(isEmply()){
            System.out.println("stact isEmply");
        }else{
            System.out.println(top);
        }
    }
 
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node s=new Node();
		while(true){
		    System.out.println("1)PUSH\n2)POP\n3)display\n4)isEmpty\n5)peek");
		    int n = sc.nextInt();
		    switch(n){
		        
    		    case 1:{
    		        s.push(sc);
    		        break;
    		    }
    		    case 2:{
    		        s.pop();
    		        break;
    		    }
    		    case 3:{
    		        s.display();
    		        break;
    		    }
    		    case 4:{
    		        s.isEmply();
    		        break;
    		    }
    		    case 5:{
    		        s.peek();
    		        break;
    		    }
		    }
		}
		}
}

		
	}

