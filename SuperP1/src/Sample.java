class B
{
	int a1=100;//global variable
	void get1()
	{
		System.out.println("Your Base class value is::"+a1);
	}
}
class D extends B
{
	void get2()
	{
		int a1=200;//local variable
		System.out.println("Your Derived class value is::"+super.a1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D d1=new D();
		d1.get1();
		d1.get2();

	}

}
