package p1;

public class mythread extends Thread 
{
	public void run()
	{
		for (int i = 0; i <10; i++) 
		{
			System.out.println(i);
		}
	}

	

}
