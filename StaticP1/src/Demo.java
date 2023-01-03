class Sample
{
	static int a=100;//static variable
	Sample()
	{
		a++;
		System.out.println("Your data is::"+a);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		new Sample();
		new Sample();

	}

}
