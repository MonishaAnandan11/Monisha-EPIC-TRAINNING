import java.util.Scanner;
class Node{
    Node prev;
    int data;
    Node next;
    Node head=null,tail=null;
    
    Node(Node prev,int data,Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    Node(){
        
    }
    
    
    void insertData(Scanner in){
        System.out.println("Enter the number of data: ");
        int n = in.nextInt();//5
        for(int i=0;i<n;i++){
            int val  = in.nextInt();
            Node obj = new Node(null,val,null);
            if(head==null){
                head = obj;
            }
            else{
                obj.prev=tail;
                tail.next = obj;
            }
            tail = obj;
        }
    }
    
    
    void displaydata(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    
    void insertAnode(Scanner in){
       System.out.println("enter the pos:");
       int pos=in.nextInt();
       System.out.println("enter the data:");
       int val=in.nextInt();
       Node newnode=new Node(null,val,null);
       if(pos==1){
           
           newnode.next=head;
           head.prev=newnode;
           head=newnode;
       }
       else{
       Node temp=head;
       for(int i=0;i<pos-2;i++){
          temp= temp.next;
          
       }
       newnode.prev=temp;
       newnode.next=temp.next;
       temp.next.prev=newnode;
       temp.next=newnode;
       
    }
    }
    
    void deletenode(Scanner in){
        System.out.println("enter the pos:");
       int pos=in.nextInt();
       if(pos==1){
          head.next.prev=null;
          head = head.next;
       }
       Node temp=head;
       for(int i=0;i<pos-2;i++){
          temp= temp.next;
       } 
     
      temp.next=temp.next.next;
      temp.next.prev=temp;
    
    }
}
public class Main
{
	public static void main(String[] args) {
		Node n = new Node();
		Scanner in = new Scanner(System.in);
		    System.out.println("1) insert 2)display 3)insertmiddle 4)delete ");
		while(true){
		    System.out.println("enter ur choice");
		    int ch=in.nextInt();
		    switch(ch){
		        case 1:{
		            n.insertData(in);
		            break;
		        }
		        case 2:{
		          n.  displaydata();
		          break;
		        }
		        case 3:{
		           n. insertAnode(in);
		           break;
		        }
		        case 4:{
		            n.deletenode(in);
		        }
		    }
		}
		
	}
}
