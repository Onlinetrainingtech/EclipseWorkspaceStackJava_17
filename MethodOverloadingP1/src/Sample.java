class Demo
{
	void get1(int cid)
	{
		System.out.println("This is get1 function is::"+cid);
	}
	void get1(String cname)
	{
		System.out.println("This is get2 function is::"+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1(1001);
		t1.get1("Azar");

	}

}
