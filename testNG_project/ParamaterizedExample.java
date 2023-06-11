package testNG_project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterizedExample {

	@Parameters({"object"})
	@Test
	public void name(String obj1) {
//Passing parameter through XML 
		System.out.println("My Name is " + obj1);

	}

}

