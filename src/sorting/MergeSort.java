package sorting;

public class MergeSort {
	public static int[] execute(int[] arg) {
		return split(arg, 0, arg.length);
	}
	
	private static int[] split(int[] array, int start, int length) {
		int halfway = length / 2;
		if(halfway > 1)
			array = split(array, start, halfway);
		if(length - halfway > 1)
			array = split(array, start + halfway, length - halfway);
		return parse(array, start, start + halfway, start + length);
	}
	
	private static int[] parse(int[] array, int startA, int startB, int end) {
		int a = startA;
		int b = startB;
		int[] output = ArrayStuff.copy(array);
		boolean firstComplete;	//false -> pull from a,		true -> pull from b
		while(true) {
			if(a == startB) {
				firstComplete = true;
				break;
			} else if(b == end) {
				firstComplete = false;
				break;
			} else {
				if(array[a] < array[b]) {
					output[startA++] = array[a++];
				} else {
					output[startA++] = array[b++];
				}
			}
		}
		if(firstComplete) {
			while(b < end) {
				output[startA++] = array[b++];
			}
		} else {
			while(a < startB) {
				output[startA++] = array[a++];
			}
		}
		return output;
	}
}
