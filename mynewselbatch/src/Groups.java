import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("compose");
	}
	@Test(groups= {"sanity","regression"})
	public void test2()
	{
		System.out.println("sentitems");
	}
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("Trash");
	}
}
