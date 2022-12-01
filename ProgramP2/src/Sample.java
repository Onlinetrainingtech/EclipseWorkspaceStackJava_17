
public class Sample 
{

   void addProduct(int pid)//passing arguments
   {
	   System.out.println("This is addProduct.."+pid);
   }
   void viewProduct(String pname)
   {
	   System.out.println("This is viewProduct.."+pname);
   }
	
	public static void main(String[] args)
	{
		
		Sample s1=new Sample();
		s1.addProduct(1001);
		s1.viewProduct("apple");

	}

}
