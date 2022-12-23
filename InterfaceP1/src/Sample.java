interface S1
{
	void get1();
}
class Demo implements S1
{
	public void get1()
	{
		System.out.println("This is a interface method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
