abstract class Student{
    protected String stdName;
    //method declaration
    abstract void data(String a);
}

class Data extends Student{
    //method definition
    public void data(String a){
        stdName = a;
    }
}


public class Main
{
	public static void main(String[] args) {
	        Student std = new Data();
	        //method call
	        std.data("Monisha");
	        
	        System.out.println(std.stdName);
	        
	}
}
