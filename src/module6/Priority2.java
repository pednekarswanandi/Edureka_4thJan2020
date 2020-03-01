package module6;

import org.testng.annotations.Test;

public class Priority2 {

	@Test(priority = 0)
	public void Pune() {
		System.out.println("This is the Test Case 1");
	}

	@Test
	public void Banglore() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 1)
	public void Mumbai() {
		System.out.println("This is the Test Case 3");
	}

	@Test
	public void Hyderabad() {
		System.out.println("This is the Test Case 4");
	}

	@Test(priority = 3)
	public void Chennai() {
		System.out.println("This is the Test Case 5");
	}
}
