import java.util.Scanner;

class Demo
{
	int pid[]=new int[2];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the array value is::");
			pid[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("I value is::"+pid[i]);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo s1=new Demo();
		s1.get1();
		s1.display();

	}

}
