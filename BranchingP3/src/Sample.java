import java.util.Scanner;

class Demo
{
	int m1,m2,m3,tot;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the marks::");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		tot=m1+m2+m3;
		if(tot>=900)
		{
			System.out.println("Grade-A");
		}	
		else if(tot<=600)
		{
			System.out.println("Grade-B");
		}
		else if(tot<=300)
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Grade-D");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.input();

	}

}
