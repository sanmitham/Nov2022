package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

//@Listeners({listeners.MyListener.class})
public class DemoTest{

	@Test
	public void test1()
	{
		System.out.println("DemoTest Class - Test 1 Executed");
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue("Selenium".contains("WebDriver"));
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("Test 3 Executed");
	}
}
