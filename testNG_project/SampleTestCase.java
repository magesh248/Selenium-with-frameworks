package testNG_project;

import org.testng.annotations.Test;


public class SampleTestCase {

	@Test(priority = 1)
	public void FirstTestCase() {

		System.out.println("First Test Case");

	}
	@Test(priority = 2)// If we give without priority method it will execute in first letter of Alphabetic order
	public void SecondTestCase() {

		System.out.println("Second Test Case");

	}
	@Test(priority = 3)
	public void ThirdTestCase() {

		System.out.println("Third Test Case");

	}
	@Test(priority = 4,enabled = false)
	public void FourTestCase() {

		System.out.println("Four Test Case");

	}

}
