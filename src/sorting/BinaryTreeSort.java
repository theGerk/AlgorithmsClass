package sorting;

public class BinaryTreeSort {
	public static int[] execute(int[] input) {
		 return (new BinaryTreeSort(input)).toArray(input.length);
	}
	
	private int value;
	private int frequency;
	private BinaryTreeSort less;
	private BinaryTreeSort greater;
	
	public BinaryTreeSort addValue(int v) {
		if(v == value) {
			frequency++;
			return this;
		} else if(v < value) {
			if(less == null) 
				return less = new BinaryTreeSort(v);
			else
				return less.addValue(v);
		} else {
			if(greater == null)
				return greater = new BinaryTreeSort(v);
			else
				return greater.addValue(v);
		}
	}
	
	public int[] toArray(int l) {
		int[] output = new int[l];
		this.toArray(output, 0);
		return output;
	}
	
	private int toArray(int[] a, int v) {
		if(less != null)
			v = less.toArray(a, v);
		for(int i = 0; i < frequency; i++)
			a[v++] = value;
		if(greater != null)
			v = greater.toArray(a, v);
		return v;
	}
	
	BinaryTreeSort() {
		frequency = 0;
	}
	
	BinaryTreeSort(int v) {
		value = v;
		frequency = 1;
	}
	
	BinaryTreeSort(int[] val) {
		if(val.length > 0) {
			value = val[0];
			frequency = 1;
			for(int i = 1; i < val.length; i++) {
				addValue(val[i]);
			}
		} else {
			frequency = 0;
		}
	}
	
	//merge sort like method
	BinaryTreeSort(int[] val, int start, int end) {
		if(start < end) {
			value = val[start];
			frequency = 1;
			int ptr = start;
			for(int i = start + 1; i <= end - frequency; i++)
				if(val[i] < value)
					ArrayStuff.swap(val, i, ++ptr);
				else if(val[i] == value) {
					ArrayStuff.swap(val, i--, end - frequency++ + 1);
				}
			if(start < ptr)
				less = new BinaryTreeSort(val, start, ptr);
			if(ptr + 1 < end - frequency + 1)
				greater = new BinaryTreeSort(val, ptr + 1, end - frequency + 1);
		} else {
			frequency = 0;
		}
	}
}
