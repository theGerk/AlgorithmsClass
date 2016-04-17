package sorting;

public class InsertionSort {
	public static int[] execute(int[] arg) {
		for(int i = 1; i < arg.length; i++)
		{
			int val = arg[i];
			int j;
			for(j = i - 1; j >= 0 && arg[j] > val; j--)
			{
				arg[j + 1] = arg[j];
			}
			arg[j + 1] = val;
		}
		return arg;
	}
}
