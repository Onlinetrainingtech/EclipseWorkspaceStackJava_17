import java.util.Scanner;

class Demo
{
	void get1()
	{
		try
		{
		String g1=null;
		System.out.println(g1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check the value..");
		}
	}
	void get2()
	{
		int empid[]=new int[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=3;i++)
		{
			try
			{
			System.out.println("Enter the Array value is::");
			empid[i]=sc.nextInt();
			System.out.println("Array Value is::"+empid[i]);
			}
			catch(ArrayIndexOutOfBoundsException t)
			{
				System.out.println("Plese check the index..");
			}
		}
		
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
f1.get2();
	}

}
