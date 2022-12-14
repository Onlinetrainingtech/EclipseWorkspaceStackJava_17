
class Product
{
	int pid=1001;//class or instance variable
	String pname="*****";
	void addProduct()
	{
		int price=100;//local variable
		//System.out.println("This is addProduct"+pid+"****"+pname+"Your Price::"+price);
		//System.out.println(pid+pid);
		System.out.println(pid);
		System.out.println(pname);
	}
	void addCategory()
	{
		System.out.println("This is addCategory"+pid);
	}
	
}

public  class Sample {

	public static void main(String[] args) {
		
		System.out.println("This is main function..");
		
		Product f1=new Product();//Creating Object
		f1.addProduct();
		f1.addCategory();
		
		

	}

}
