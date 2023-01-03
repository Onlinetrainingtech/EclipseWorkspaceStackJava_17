abstract class Product
{
	abstract void addProduct();
	void display()
	{
		System.out.println("This is the display methods..");
	}
}
class Demo extends Product
{

	void addProduct() {
		System.out.println("This is abstract methods..");
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addProduct();
		f1.display();

	}

}
