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
	
	public static int[] prettyPrint(int[] array, int start, int end, String tabs) {
		System.out.println(tabs + "BEFORE PIVOT");
		System.out.println(tabs + "array: " + ArrayStuff.printString(array));
		System.out.println(tabs + "start: " + start);
		System.out.println(tabs + "end: " + end);
		
		int swapPoint = start;
		int iterator = start + 1;
		System.out.println(tabs + '\t' + "IN PIVOT");
		System.out.println(tabs + '\t' + "swapPoint: " + swapPoint);
		System.out.println(tabs + '\t' + "iterator: " + iterator);
		
		for(; iterator <= end; iterator++)
			if(array[start] > array[iterator])
				ArrayStuff.swap(array, ++swapPoint, iterator);
		ArrayStuff.swap(array, swapPoint, start);
		System.out.println(tabs + '\t' + "END OF PIVOT");
		System.out.println(tabs + '\t' + "swapPoint: " + swapPoint);
		System.out.println(tabs + '\t' + "iterator: " + iterator);
		
		System.out.println(tabs + "AFTER PIVOT");
		System.out.println(tabs + "return value: " + swapPoint);
		System.out.println(tabs + "array: " + ArrayStuff.printString(array));
		
		if(start < swapPoint - 1)
			array = prettyPrint(array, start, swapPoint - 1, tabs + '\t');
		System.out.println(tabs + "SORTED LESSER HALF");
		
		if(swapPoint + 1 < end)
			array = prettyPrint(array, swapPoint + 1, end, tabs + '\t');
		System.out.println(tabs + "SORTED GREATER HALF");
		return array;
	}
}
