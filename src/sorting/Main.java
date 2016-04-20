package sorting;

import java.util.Random;


public class Main
{
	static Random rand = new Random(System.nanoTime());

	
	public static void main(String[] args) {
		long programTime = System.nanoTime();
		int[] arr;
		
		//Ascending
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2));
			callAll(arr, "Ascending");
		}
		
		//Descending
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.arrayDecending(MyMath.uIntPow(10, i + 2));
			callAll(arr, "Descending");
		
		}
		
		//Random
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2)));
			callAll(arr, "Randomized");
		}

		//semi-randoms
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2)), 2);
			callAll(arr, "Semi-Random by 2");
		}
		
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2)), 5);
			callAll(arr, "Semi-Random by 5");
		}

		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2)), 10);
			callAll(arr, "Semi-Random by 10");
		}
		
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2)), 33);
			callAll(arr, "Semi-Random by 33");
		}
		
		for(int k = 100; k <= 1000000; k *= 10) {
			for(int i = 0; i < 5; i++) {
				arr = ArrayStuff.randomize(ArrayStuff.arrayAccending(MyMath.uIntPow(10, i + 2)), k);
				callAll(arr, String.format("Semi-Random by %d", k));
			}
		}		
		
		//semi-random reverse
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayDecending(MyMath.uIntPow(10, i + 2)), 2);
			callAll(arr, "Semi-Random-revsrse by 2");
		}
		
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayDecending(MyMath.uIntPow(10, i + 2)), 5);
			callAll(arr, "Semi-Random-revsrse by 5");
		}

		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayDecending(MyMath.uIntPow(10, i + 2)), 10);
			callAll(arr, "Semi-Random-revsrse by 10");
		}
		
		for(int i = 0; i < 5; i++) {
			arr = ArrayStuff.randomize(ArrayStuff.arrayDecending(MyMath.uIntPow(10, i + 2)), 33);
			callAll(arr, "Semi-Random-revsrse by 33");
		}
		
		for(int k = 100; k <= 1000000; k *= 10) {
			for(int i = 0; i < 5; i++) {
				arr = ArrayStuff.randomize(ArrayStuff.arrayDecending(MyMath.uIntPow(10, i + 2)), k);
				callAll(arr, String.format("Semi-Random-revsrse by %d", k));
			}
		}
		
		System.out.printf("\nProgram took: %s.", MyMath.toNicelyFormatedTime(System.nanoTime() - programTime));
	}
	
	public static void callAll(int[] test, String i) {
		final String format = "\t%s - %s\n";
		System.out.printf("%s%s (length: %d)\n", "Test array ", i, test.length);
		System.out.printf(format, Sorting.bubble(ArrayStuff.copy(test)).toString(), "Bubble");
		System.out.printf(format, Sorting.selection(ArrayStuff.copy(test)).toString(), "Selection");
		System.out.printf(format, Sorting.insertion(ArrayStuff.copy(test)).toString(), "Insertion");
		System.out.printf(format, Sorting.heap(ArrayStuff.copy(test)).toString(), "Heap");
		System.out.printf(format, Sorting.merge(ArrayStuff.copy(test)).toString(), "Merge");
		System.out.printf(format, Sorting.quick(ArrayStuff.copy(test)).toString(), "Quick");
		System.out.printf(format, Sorting.binaryTree(ArrayStuff.copy(test)).toString(), "Binary Tree");
		System.out.printf(format, Sorting.improvedBubble(ArrayStuff.copy(test)).toString(), "Improved Bubble");
		System.out.printf(format, Sorting.radix(ArrayStuff.copy(test)).toString(), "Radix");
		System.out.print('\n');
	}
}
