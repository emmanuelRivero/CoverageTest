package ProgramKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void Concattest() {
		MyJunitClass junit = new MyJunitClass();
		
		String result = junit.concat("Hello ", "World!");
		
		assertEquals("Hello World!", result);
	}

}
