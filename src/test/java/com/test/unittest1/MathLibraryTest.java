package com.test.unittest1;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class MathLibraryTest {



	MathLibrary mathLibrary;

    @BeforeClass
	void instantiateMathLibrary(){
		 mathLibrary = new MathLibrary();
	}

	@Test
	void additionTest(){
		   assertEquals(5,mathLibrary.add(3,2));
	}

	@Test
	void subtractionTest(){
		assertEquals(1,mathLibrary.subtract(3,2));
	}

	@Test
	void multiplicationTest(){
		assertEquals(6,mathLibrary.multiply(3,2));
	}

	@Test
	void divisionTest(){
		assertEquals(1,mathLibrary.divide(3,2));
	}

}
