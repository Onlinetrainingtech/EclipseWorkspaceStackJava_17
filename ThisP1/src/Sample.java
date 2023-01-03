
public class Sample 
{

	int empid;
	String empname;
    void get1(int empid,String empname)
    {
    	this.empid=empid;
    	this.empname=empname;
    	System.out.println("Your value is::"+empid+""+empname);
    }
    void display()
    {
    	System.out.println("Your display function value is::"+empid+""+empname);
    }
	public static void main(String[] args) {
		
		Sample t1=new Sample();
		t1.get1(100,"azar");
		t1.display();

	}

}
