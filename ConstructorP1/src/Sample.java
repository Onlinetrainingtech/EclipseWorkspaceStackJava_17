class Demo
{
	String p1;
	int p2;
	Demo()//default cons
	{
		System.out.println("Demo is an default cons..");
	}
	Demo(String p1,int p2)//param cons
	{
		System.out.println("This is param cons..::"+p1+""+p2);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		new Demo();//default cons
		new Demo("azar",1000);//param cons

	}

}
