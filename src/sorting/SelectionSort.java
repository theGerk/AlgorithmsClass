package sorting;

public class SelectionSort {
	public static int[] execute(int[] arg) {
		for(int i = 0; i < arg.length - 1; i++)
		{
			int least = i;
			for(int j = i; j < arg.length; j++)
			{
				if(arg[j] < arg[least])
				{
					least = j;
				}
			}
			ArrayStuff.swap(arg, least, i);
		}
		return arg;
	}
}
