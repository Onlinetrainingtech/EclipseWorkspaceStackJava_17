import java.util.Scanner;

class B
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid::");
		empid=sc.nextInt();
		System.out.println("Enter the empname::");
		empname=sc.next();
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
