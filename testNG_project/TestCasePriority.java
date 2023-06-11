package testNG_project;

import org.testng.annotations.Test;

public class TestCasePriority {
	@Test(priority = 1)
	public void name1() {

		System.out.println("First Test Case");

	}
	@Test(priority = 2)
	public void name2() {

		System.out.println("Second Test Case");

	}
	@Test(priority = 3)
	public void name3() {

		System.out.println("Third Test Case");

	}
	@Test(priority = 4,enabled = false)// enable=false :It will skip the test case or method with execution
	public void name4() {

		System.out.println("Four Test Case");

	}

}
