package sorting;

public class MyMath {
	public static int uIntPow(int base, int exp) {
		int output = 1;
		while(exp-- > 0)
			output *= base;
		return output;
	}
}
