interface B1
{
	int pid=1001;
	void get1();
}
interface B2 extends B1
{
	String pname="apple";
	void get2();
	
}
class Demo implements B2
{

	public void get1() {
		System.out.println("Your value is::"+pid);
		
	}

	public void get2() {
		System.out.println("Your value is::"+pname);
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo r1=new Demo();
		r1.get1();
		r1.get2();

	}

}
