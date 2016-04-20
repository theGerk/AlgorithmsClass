package sorting;

public class SortReturn {
	public int[] array;
	public long time;
	
	public SortReturn(long t_start, int[] arg, long t_end) {
		array = arg;
		time = t_end - t_start;
	}
	
	public String toString() {
		return MyMath.toNicelyFormatedTime(time);
	}
}
