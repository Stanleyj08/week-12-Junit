package unit.test.assignment;

import java.util.Random;

public class testDemo {

	public static Object addPositive(int a, int b) {
		Object Integer = 0;
		if( a >= 0 && b >=0) 
			
		  Integer = a + b;
		
		return Integer;
	}
	
	public static int randomNumberSquared1 (int a)	{
	int something = a;
	int anything = something * something;
	return anything; 
}
	
	public static int randomNumberSquared ()	{
	int something = getRandomInt();
	int anything = something * something;
	return anything; 
}
static int getRandomInt() {
	Random random = new Random();
	return random.nextInt(10) + 1;
	
}
}
