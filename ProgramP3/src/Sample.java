
public class Sample 
{

	int empid=1002;
	String empname="azar";//class or instance variable
	void input()
	{
		System.out.println("Your empid and empname::"+empid+""+empname);
	}
	void display()
	{
		int cid=2001;//local variable
		System.out.println("Your category Id::"+cid);
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
