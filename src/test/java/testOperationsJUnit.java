package devops_lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class testOperationsJUnit {
	Operations op;

	@BeforeClass
	void instantiateObject() {
		op = new Operations();
	}
	
	@Test
	void testAdd() {
				
		for(int i=1;i<6;i++) {
			assertEquals(i+1+i, op.add(i, i+1));
		}		
	}
	
	@Test
	void testSort() {
		
	}
	
}
