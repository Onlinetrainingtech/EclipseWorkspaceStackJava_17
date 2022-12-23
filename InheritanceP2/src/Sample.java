class B
{
	int pid=1001;
	String pname="apple";
	int pprice=200;
	void get1()
	{
		System.out.println("Your pid is::"+pid);
	}
}
class D1 extends B
{
	void get2()
	{
		System.out.println("Your Pname is::"+pname);
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your Product Price::"+pprice);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
