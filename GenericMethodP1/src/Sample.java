class Demo
{
	public <M> M test(M t)//public void int(int t)
	{
		return t;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g=new Demo();
		System.out.println(g.test(1001));
		System.out.println(g.test("azar"));
		System.out.println(g.test(12.5));

	}

}
