import java.util.Scanner;

public class Demo 
{
	int pid;
	String pname;
	Scanner sc=new Scanner(System.in);
    void get1()
    {
    	
    	System.out.print("Enter the value is::");
    	pid=sc.nextInt();//100
    	pname=sc.next();//apple
    }
    void get2()
    {
    	System.out.print("Your value is::"+pid+""+pname);
    }
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
