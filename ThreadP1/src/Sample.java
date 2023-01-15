class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIn");
			Thread.sleep(10000);
		System.out.println("ThreadNames::"+currentThread().getName());
		System.out.println("ThreadPriority::"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("NewBatch");
		t2.start();
		System.out.println(t1.isAlive());

	}

}
