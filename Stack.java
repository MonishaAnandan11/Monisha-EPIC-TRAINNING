import java.util.Scanner;

class StackImplementation{
    int n = 10;
    int[] stack = new int[n];
    int top = -1;
    //push
    public void push(Scanner in){
        System.out.println("Enter a value: ");
        int val = in.nextInt();
        if(top==n-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;//0123456789
            stack[top] = val;
        }
        
    }
    //pop
    public void pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println(stack[top]);
            top--;
        }
    }
    //display
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    //isEmpty
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    //peek
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack isEmpty");
        }else{
            System.out.println(stack[top]);
        }
    }
}
