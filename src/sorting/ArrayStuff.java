package sorting;

public class ArrayStuff
{
	public static void print(int[] arg)
	{
		System.out.println(printString(arg));
	}
	
	public static String printString(int[] arg) {
		String output = "[";
		for(int i = 0; i < arg.length; i++) {
			output += arg[i];
			output += (i == arg.length - 1) ? ']' : ", ";
		}
		if(arg.length == 0)
			output += ']';
		return output;
	}
	
	public static int[] copy(int[] arg)
	{
		int [] output = new int [arg.length];
		for(int i = 0; i < arg.length; i++)
			output[i] = arg[i];
		return output;
	}
	
	public static int[] swap(int[] A, int a, int b) {
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
		return A;
	}
	
	
	public static int[] randomize(int[] arg) {
		for(int i = 0; i < arg.length; i++)
			swap(arg, Main.rand.nextInt(arg.length), i);
		return arg;
	}
	
	
	public static int[] arrayAccending(int length) {
		int[] output = new int[length];
		for(int i = 0; i < length; i++)
			output[i] = i;
		return output;
	}
	
	public static int[] arrayDecending(int length) {
		int[] output = new int[length];
		for(int i = 0; i < length; i++)
			output[i] = length - i - 1;
		return output;
	}
}
