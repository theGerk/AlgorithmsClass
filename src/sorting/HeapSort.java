package sorting;

public class HeapSort {
	public static int[] execute(int[] arg) {
		//Build heap from start
		for(int firstIndexOutOfHeap = 1; firstIndexOutOfHeap < arg.length; firstIndexOutOfHeap++)
			siftUp(arg, firstIndexOutOfHeap);
		
		//Sort from heap
		for(int firstIndexOutOfHeap = arg.length - 1; firstIndexOutOfHeap > 0; firstIndexOutOfHeap--)
			siftDown(arg, firstIndexOutOfHeap);
		
		//return
		return arg;
	}
		
	private static int parent(int index) {
		return (index - 1) / 2;
	}
	
	private static int child(int index) {
		return index * 2 + 1;
	}
	
	private static int[] siftUp(int[] input, int indexAddedIn) {
		for(int p; input[indexAddedIn] > input[p = parent(indexAddedIn)]; indexAddedIn = p)
			ArrayStuff.swap(input, p, indexAddedIn);
		return input;
	}
	
	private static int[] siftDown(int[] input, int index) {

//		System.out.println(index + "  -\t" + ArrayStuff.printString(input));
		ArrayStuff.swap(input, 0, index);
		//sift down loop and if else tree
		for(int i = 0, c; (c = child(i)) < index; i = c) {
//			System.out.println(index + "  -\t" + ArrayStuff.printString(input));
			if(c + 1 < index) {
				if(input[c] > input[c + 1]) {
					if(input[c + 1] > input[i] || input[c] > input[i]) {
						ArrayStuff.swap(input, i, c);
					} else {
						break;
					}
				} else {
					if(input[c] > input[i] || input[c + 1] > input[i]) {
						ArrayStuff.swap(input, i, ++c);
					} else {
						break;
					}
				}
			} else {
				if(input[c] > input[i]) {
					ArrayStuff.swap(input, i, c);
				}
				break;
			}
		}
//		System.out.println("\t" + ArrayStuff.printString(input) + "\n");
		
		return input;
	}
}
