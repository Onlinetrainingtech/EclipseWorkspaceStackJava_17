import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int pid;
	String pname;
	int price;
	DataInputStream dis=new DataInputStream(System.in);
	
	void input() throws IOException
	{
		System.out.println("Enter the value is::");
		pid=Integer.parseInt(dis.readLine());
		pname=dis.readLine();
		price=Integer.parseInt(dis.readLine());
	}
	void display()
	{
		System.out.println("Your value is::"+pid+""+pname+""+price);
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
