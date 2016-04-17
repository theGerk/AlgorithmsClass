package sorting;

public class ImprovedBubbleSort {
	public static int[] execute(int[] arg) {
		for(int i = arg.length; i > 0;)
		{
			int flipped = 0;
			for(int j = 1; j < i; j++)
			{
				if(arg[j - 1] < arg[j])
				{
					int temp = arg[j - 1];
					arg[j - 1] = arg[j];
					arg[j] = temp;
					flipped = j;
				}
			}
			i = flipped - 1;
		}
		return arg;
	}
}
