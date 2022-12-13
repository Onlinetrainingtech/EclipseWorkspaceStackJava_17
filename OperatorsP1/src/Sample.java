class Demo
{
	void arithmeticOperators()
	{
        int a=100,b=200;
        System.out.println("Adding::"+(a+b));
        System.out.println("Divided::"+(a/b));
        System.out.println("Module::"+(a%b));
        
	}
	void relationalOperators()
	{
		int a1=100,b1=200;
		System.out.println("Lessthan::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("Equal to::"+(a1==b1));
		
	}
	void logicalOperators()
	{
		int a2=100,b2=200;
		System.out.println("logicalAND::"+((a2<b2)&&(b2>a2)));
		System.out.println("logicalOR::"+((a2>b2)||(b2>a2)));
		System.out.println("LogicalNot::"+(!(a2>b2)));
	}
	void bitwise()
	{
		int a=2,b=3;
		System.out.println("BitWiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("BitWiseXOR::"+(a^b));
		System.out.println("BitWiseleftshift::"+(a<<1));
		System.out.println("BitWiserightshift::"+(a>>1));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.arithmeticOperators();
		//f1.relationalOperators();
		//f1.logicalOperators();
		f1.bitwise();

	}

}
