package sorting;

public class RadixSort {
	public static int[] execute(int[] arg) {
		for(int bitIndex = 1; bitIndex != 0; bitIndex <<= 1) {
			int[] hasOne = new int[arg.length], hasZero = new int[arg.length];
			int oneIndex = 0, zeroIndex = 0;
			for(int i = 0; i < arg.length; i++) {
				if((arg[i] & bitIndex) == 0)
					hasZero[zeroIndex++] = arg[i];
				else
					hasOne[oneIndex++] = arg[i];
			}
			int argIndex = 0;
			for(int i = 0; i < zeroIndex; i++)
				arg[argIndex++] = hasZero[i];
			for(int i = 0; i < oneIndex; i++)
				arg[argIndex++] = hasOne[i];
		}
		return arg;
	}
}
