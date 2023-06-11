package testNG_project;

import org.testng.annotations.Test;

public class Handle_dependancy {

	@Test(enabled = true)
	public void Server_link() {
		System.out.println("www.amazon.com");
	}

	@Test(dependsOnMethods = "Successful_login")
	public void Home_Page() {                     // Depends on methods it will execute in order if one method is failed the next depended method will not execute
		System.out.println("Displaying home page");
	}

	@Test(dependsOnMethods ="Server_link")
	public void Login_page() {
		System.out.println("Displaying login page");
	}

	@Test(dependsOnMethods = "Login_page")
	public void Successful_login() {
		System.out.println("Successfull login popup");
	}

}
