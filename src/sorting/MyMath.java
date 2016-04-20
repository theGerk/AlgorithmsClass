package sorting;

public class MyMath {
	public static int uIntPow(int base, int exp) {
		int output = 1;
		while(exp-- > 0)
			output *= base;
		return output;
	}
	
	public static String toNicelyFormatedTime (long t) {
		boolean negitive = false;
		
		if(t < 0) {
			t *= -1;
			negitive = true;
		}
		
		int day, hour, min, sec, nano = (int) (t % uIntPow(10, 9));
		
		t /= uIntPow(10, 9);
		if(t != 0) {
			sec = (int) (t % 60);
			t /= 60;
		} else {
			return (negitive ? "-" : "") + String.format("%9dns", nano);
		}
		
		if(t != 0) {
			min = (int) (t % 60);
			t/=60;
		} else {
			return (negitive ? "-" : "") + String.format("%2ds, %09dns", sec, nano);
		}

		if(t != 0) {
			hour = (int) (t % 24);
			t/=60;
		} else {
			return (negitive ? "-" : "") + String.format("%2dm, %02ds, %09dns", min, sec, nano);
		}

		if(t != 0) {
			day = (int) (t % 365);
			t/=24;
		} else {
			return (negitive ? "-" : "") + String.format("%2dh, %02dm, %02ds, %09dns", hour, min, sec, nano);
		}

		if(t == 0) {
			return (negitive ? "-" : "") + String.format("%3ddays, %02dh, %02dm, %02ds, %09dns", day, hour, min, sec, nano);
		} else {
			return (negitive ? "-" : "") + String.format("%d years, %03d days, %02dh, %02dm, %02ds, %09dns", t, day, hour, min, sec, nano);
		}
	}
}
