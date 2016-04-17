package sorting;

public class Main
{
	public static void main0(String [] args) {
		int[] array = {7, 3, 1, 8, 10, 2, 14, 4, 6};
		QuickSort.prettyPrint(array, 0, array.length - 1, "");
	}
	public static void main(String [] args) {
		for(int i = 0; i < ArrayStuff.test.length; i++) {
			System.out.printf("%s - %s%d (length: %d)\n", ArrayStuff.printString(ArrayStuff.test[i]), "Test array ", i, ArrayStuff.test[i].length);
			System.out.printf("%s - %s\n", Sorting.bubble(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Bubble");
			System.out.printf("%s - %s\n", Sorting.selection(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Selection");
			System.out.printf("%s - %s\n", Sorting.insertion(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Insertion");
			//System.out.printf("%s - %s\n", Sorting.improvedBubble(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Improved Bubble");
			System.out.printf("%s - %s\n", Sorting.merge(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Merge");
			System.out.printf("%s - %s\n", Sorting.quick(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Quick");
			System.out.printf("%s - %s\n", Sorting.binaryTree(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Binary Tree");
			System.out.printf("%s - %s\n", Sorting.heap(ArrayStuff.copy(ArrayStuff.test[i])).toString(), "Heap");
			System.out.print('\n');
		}
	}
}
