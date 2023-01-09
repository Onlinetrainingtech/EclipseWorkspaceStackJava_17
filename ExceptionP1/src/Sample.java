class Demo
{
	void get1()
	{
		try
		{
		int a=100/0;
		System.out.println("Your value is::"+a);
		}
		catch(Exception t)
		{
		System.out.println("Please Check the Exception");
		}
		get2();
	}
	void get2()
	{
		System.out.println("Get2 is a function..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
