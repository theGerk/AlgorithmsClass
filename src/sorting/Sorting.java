package sorting;

public class Sorting
{	
	public static SortReturn selection(int[] arg) {
		return new SortReturn(System.nanoTime(), SelectionSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn bubble(int[] arg)	{
		return new SortReturn(System.nanoTime(), BubbleSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn insertion(int[] arg) {
		return new SortReturn(System.nanoTime(), InsertionSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn merge(int[] arg) {
		return new SortReturn(System.nanoTime(), MergeSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn quick(int[] arg) {
		return new SortReturn(System.nanoTime(), QuickSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn binaryTree(int[] arg) {
		return new SortReturn(System.nanoTime(), BinaryTreeSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn improvedBubble(int[] arg) {
		return new SortReturn(System.nanoTime(), ImprovedBubbleSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn heap(int[] arg) {
		return new SortReturn(System.nanoTime(), HeapSort.execute(arg), System.nanoTime());
	}
	
	public static SortReturn radix(int[] arg) {
		return new SortReturn(System.nanoTime(), RadixSort.execute(arg), System.nanoTime());
	}
}
