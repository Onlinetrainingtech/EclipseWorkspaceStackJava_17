import java.util.Scanner;

class Foo
{
	int age,sal,bns;
	Scanner sc=new Scanner(System.in);
	void get2()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the Salary is::");
			sal=sc.nextInt();
			if(sal>=2000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low..");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get2();

	}

}
