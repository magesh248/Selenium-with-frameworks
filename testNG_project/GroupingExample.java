package testNG_project;

import org.testng.annotations.Test;

/*
 * 
 * XML 
Scenario: A big basket is having a different kind of mobiles.
Let us say there are Apple phones, Moto G, VIVO and Lenovo.
I want to run tests only for VIVO and Moto phones. Write a program for that.
 */
public class GroupingExample {

	@Test(groups = {"Apple"}) // to group the method to execute particular group what we want.
	public void Apple1() {
		System.out.println("Apple Testing");
	}
	@Test(groups = {"Apple"})
	public void Apple2() {

		System.out.println("Apple Testing");

	}
	@Test(groups = {"moto"})
	public void Moto1() {
	                         	                //		<include name="moto"></include> Execute only included method
		                                        //		<include name="Vivo"></include>
		System.out.println("Moto Testing");

	}
	@Test(groups = {"moto"})
	public void Moto2() {

		System.out.println("Moto Testing");

	}
	@Test(groups = {"Vivo"})
	public void Vivo1() {

		System.out.println("Vivo Testing");

	}
	@Test(groups = {"Vivo"})
	public void Vivo2() {

		System.out.println("Vivo Testing");

	}
	@Test(groups = {"Lenovo"})
	public void Lenovo1() {

		System.out.println("Lenovo Testing");

	}
	@Test(groups = {"Lenovo"})
	public void Lenovo2() {

		System.out.println("Lenovo Testing");

	}

}

