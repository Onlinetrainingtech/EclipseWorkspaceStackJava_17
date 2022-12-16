
public class Sample {

	public static void main(String[] args) {
		
		int exp=1;
		switch(exp)
		{
		case 1:
			System.out.println("Case-1");
			int age=18;
			if(age>=18)
			{
				System.out.println("Vote");
			}
			else
			{
				System.out.println("Not Vote");
			}
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("default case..");
			break;
		}

	}

}
