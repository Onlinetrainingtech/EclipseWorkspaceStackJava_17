abstract class Shape
{
	abstract void draw();
}
//In real scenario implementation is provided by others

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle..");
	}
}
class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle..");
	}
}
public class TestAbstaraction1 {

	public static void main(String[] args) {
		
		//Shape s=new Circle1();
		Shape s=new Rectangle();
        s.draw();
	}

}
