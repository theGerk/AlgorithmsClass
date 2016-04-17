package sorting;

public class BubbleSort {
	public static int[] execute(int[] arg) {
		for(int i = 0; i < arg.length; i++)
		{
			for(int j = arg.length - 1; j > i; j--)
			{
				if(arg[j] < arg[j - 1])
				{
					int temp = arg[j - 1];
					arg[j - 1] = arg[j];
					arg[j] = temp;
				}
			}
		}
		return arg;
	}
}
