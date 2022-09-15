package com.AkifZahin.Lab_Exercises.Assignment1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Ex5Test {
	
	Ex5 C;
	@BeforeEach
	void InIt()
	{
		C = new Ex5();
	}
	
	@Test
	@DisplayName("Testing IsPrime Method for Ex5")
	void testIsPrime() 
	{
//		int num = 7;
//		boolean expected = true;
//		boolean actual = C.IsPrime(num);
	//String message = num + "should be " + expected;
		
		assertAll(
				()->assertEquals(true,C.IsPrime(3)),
				()->assertEquals(true,C.IsPrime(5)),
				()->assertEquals(true,C.IsPrime(7))
				
				);
		
		
		
	}

}
