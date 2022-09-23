package unit.test.assignment;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.ObjectAssert;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;


class TestDemoTest {

	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@SuppressWarnings("unchecked")
	
	@ParameterizedTest
	@MethodSource("assertThatTwoPositiveNumbersAreAddedCorrectly") 
	void assertThatTwoPositiveNumbersAreAddedCorrectly() {
		
		//assertEquals(4, testDemo.addPositive(2, 2));
		arguments(2, 2, 4, false);
		
		int a = 2;
		int b = 2;
		Integer expected = 4;
		boolean expectException = false;
		
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
			//assertEquals(4, testDemo.addPositive(2, 2));
		} else {
			assertThatThrownBy(()-> ((AbstractAssert<ObjectAssert<Object>, Object>) testDemo.addPositive(2, 2)).isInstanceOf(IllegalArgumentException.class));
		}
		
	}
	@Test
	static int assertThatNumberSquaredIsCorrect(){
		testDemo testDemo = new testDemo();
		testDemo mockDemo = Mockito.spy(testDemo);
		int fiveSquared = mockDemo.randomNumberSquared();
		
		  return doReturn(5).when(mockDemo).getRandomInt();
	}
public static Stream argumentsForAddPositive()	{
	
	//arguments(2, 2, 4, false);


	return Stream.of(arguments());
}

}
