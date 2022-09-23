package unit.test.assignment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
class TestDemoTestTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}
	//@Test
	//public int assertThatNumberSquaredIsCorrect(){
		//testDemo testDemo = new testDemo();
		//testDemo mockDemo = spy(testDemo);
		//doReturn(5).when(mockDemo);
		//unit.test.assignment.testDemo.getRandomInt();
		//int fiveSquared = unit.test.assignment.testDemo.randomNumberSquared1(5);
		
		
		 // return fiveSquared;
	//}
	@Test
	static int	assertThatNumberSquaredIsCorrect(){
		testDemo mockDemo = new testDemo();
		//testDemo mockDemo = Mockito.spy(testDemo);
			doReturn(5).when(testDemo.getRandomInt());
			int fiveSquared = mockDemo.randomNumberSquared();
			//assertThat(fiveSquared).isEqualTo(25);
			return fiveSquared;
		}
	@Test
	void test() {
		testDemo test = new testDemo();
		assertEquals(4, testDemo.addPositive(2, 2));
		
	}
	@Test
	void isEqualTo25() {
		//assertEquals(25, TestDemoTest.assertThatNumberSquaredIsCorrect());
		assertEquals(25, testDemo.randomNumberSquared1(5));
	}
}
