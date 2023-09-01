package Myprogramme;

import org.testng.annotations.Test;

public class runnerclass {
	@Test
	public void test1()
	{
		System.out.println("hello Bangalore");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Hello india");
	}
	
	
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		System.out.println("hello Asia");
	}
	
	

}
