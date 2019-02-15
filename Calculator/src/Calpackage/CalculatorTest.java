package Calpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static int beforecount=1;
	static int aftercount=1;
 Calculator calc=new Calculator();
    @Before
    public void print(){
    	
    	System.out.println("before statement"+beforecount++);
    }
    @BeforeClass
    public static void beforeclass()
    {
    	System.out.println("It's executed before class statement");
    }
 
	@Test
	public void testAdd() {
		int addresult=calc.add(100, 200);
		assertEquals(300,addresult);
	}

	@Test
	public void testSub() {
		int subresult=calc.sub(200, 100);
		assertEquals(100,subresult);
	}

	@Test
	public void testMul() {
		int mulresult=calc.mul(200,2);
		assertEquals(400,mulresult);
	}

	@Test
	public void testDiv() {
		int divresult=calc.div(200, 100);
		assertEquals(2,divresult);
	}
	@After
	public void tearDown()
	{
		System.out.println("after statement"+aftercount++);
	}
	@AfterClass
	public static void tearDownClass(){
		System.out.println("Afterclass statement executed");
	}

}
