import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node head,tail;
    
    public Node(Node prev,int data,Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    
    public Node(){
        
        
    }
    
    
    public void insertData(Scanner in){
        System.out.println("Enter the no of data: ");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the val: ");
            int val = in.nextInt();
            Node obj =new Node(null,val,null);
            if(head==null){
                head=obj;
                
            }
            else{
                tail.next=obj;
                obj.prev=tail;
            }
            tail=obj;
            obj.prev=obj;
            obj.next=head;
        }
    }
    
    public void display(){
        Node temp=head;
        do{
        System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
    
    // public void displayrev(){
    //     Node temp=tail;
    //     do{
    //     System.out.println(temp.data);
    //         temp=temp.next;
    //     }while(temp!=tail);
    // }
    
    public void inserANode(){
       Scanner in=new Scanner(System.in);
       System.out.println("enter the pos:");
       int pos=in.nextInt();
       System.out.println("enter the data:");
       int val=in.nextInt();
       Node newnode=new Node(null,val,null);
       Node temp=head;
       if(pos==1){
           newnode.next=head;
           newnode.prev=tail;
           head.prev=newnode;
           newnode=head;
        }else{
          for(int i=0;i<pos-2;i++){
          temp= temp.next;
          
          }
            newnode.next=temp.next;
            newnode.prev=temp;
            temp.next.prev=newnode;
            temp.next=newnode;
        }
        if(temp.next.next==head){
            newnode.prev=temp;
            newnode.next=head;
            temp.next=newnode;
            head.prev=newnode;
        }
    }
    
    public void deleteANode(){
       System.out.println("enter the pos:");
       int pos=in.nextInt();
       if(pos==1){
           head=head.next;
           tail.next=head;
           head.prev=tail;
        }else{
               Node temp=head;
               for(int i=0;i<pos-2;i++){
                   temp=temp.next;
        }
        }
        if(temp.next==tail){
          tail=temp;
          tail.next=head;
          head.prev=tail;
        }else{
        temp.next=temp.next.next;
        temp.next.prev=temp;

    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Node node=new Node();
		node.insertData(in);
		node.display();
		node.inserANode();
		node.display();
	}
}

