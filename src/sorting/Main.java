package sorting;

import java.util.Random;

public class Main
{
	static Random rand = new Random(0);
	
	
	public static void main(String[] args) {
		int[] arr;
		//assending
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.arrayAccending(MyMath.uIntPow(10, (i + 2)));
			callAll(arr, "Ascending");
		}
		
		//desending
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.arrayDecending(MyMath.uIntPow(10, (i + 2)));
			callAll(arr, "Descending");
		}
		
		
		//random
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, (i + 2))));
			callAll(arr, "Randomized");
		}
	}
	
	public static void callAll(int[] test, String i) {
		System.out.printf("%s%s (length: %d)\n", "Test array ", i, test.length);
		System.out.printf("%s - %s\n", Sorting.bubble(ArrayStuff.copy(test)).toString(), "Bubble");
		System.out.printf("%s - %s\n", Sorting.selection(ArrayStuff.copy(test)).toString(), "Selection");
		System.out.printf("%s - %s\n", Sorting.insertion(ArrayStuff.copy(test)).toString(), "Insertion");
		System.out.printf("%s - %s\n", Sorting.heap(ArrayStuff.copy(test)).toString(), "Heap");
		System.out.printf("%s - %s\n", Sorting.merge(ArrayStuff.copy(test)).toString(), "Merge");
		System.out.printf("%s - %s\n", Sorting.quick(ArrayStuff.copy(test)).toString(), "Quick");
		System.out.print('\n');
	}
}
