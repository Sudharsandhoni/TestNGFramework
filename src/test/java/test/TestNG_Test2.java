package test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Test2 {
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Class Name: TestNG_Test2 - Hey i am Before Class");
	}
	
	
	@Test(groups = "smoke")
	public void Test1() {
		System.out.println("Class Name: TestNG_Test2 - Hey i am Test1 Tagged 'smoke'");
	}
	
	@Test(groups = "smoke")
	public void Test2() {
		System.out.println("Class Name: TestNG_Test2 - Hey i am Test2 Tagged 'smoke'");
	}
	
	@Test(groups = "smoke")
	public void Test3() {
		System.out.println("Class Name: TestNG_Test2 - Hey i am Test3 Tagged 'smoke'");
	}
	
	@Test(groups = "regression")
	public void Test4() {
		System.out.println("Class Name: TestNG_Test2 - Hey i am Test4 Tagged 'regression'");
	}

}
