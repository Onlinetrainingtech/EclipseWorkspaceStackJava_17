import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Demo
{
	//HashSet<Integer>list1=new HashSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1003);
		System.out.println("your value is::"+list1);
		System.out.println("Your data size::"+list1.size());
		System.out.println("Searching data  is::"+list1.contains(1001));
		System.out.println("Remove the data is::"+list1.remove(1001));
		System.out.println("After delete the data is::"+list1.contains(1001));
		System.out.println("After delete the data total size is::"+list1.size());
		Iterator h1=list1.iterator();
		
		while(h1.hasNext())
		{
			System.out.println("Inside the while loop::"+h1.next());
		}
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();

	}

}
