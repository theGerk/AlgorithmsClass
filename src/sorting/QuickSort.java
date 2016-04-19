package sorting;

public class QuickSort {
	public static int[] execute(int[] arg) {
		if(arg.length > 1)
			return execute(arg, 0, arg.length - 1);
		else
			return arg;
	}
	
	private static int[] execute(int[] array, int start, int end) {
		int swapPoint = start;
		for(int iterator = start + 1; iterator <= end; iterator++)
			if(array[start] > array[iterator])
				ArrayStuff.swap(array, ++swapPoint, iterator);
		ArrayStuff.swap(array, swapPoint, start);
		if(start < swapPoint - 1)
			array = execute(array, start, swapPoint - 1);
		if(swapPoint + 1 < end)
			array = execute(array, swapPoint + 1, end);
		return array;
	}
}