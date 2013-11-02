
public class ColorfulRoad {
	private char prev(char c) {
		switch (c) {
		case 'R':
			return 'B';
		case 'G':
			return 'R';
		case 'B':
			return 'G';
		default:
			return '-';
		}
	}
	public int getMin(String road) {
		int[] f = new int[road.length()];
		for (int i=0;i < road.length();i++) {
			f[i] = Integer.MAX_VALUE;
		}
		f[0] = 0;
		for (int i=1;i < road.length();i++) {
			char prev = this.prev(road.charAt(i));
			for (int j=0;j<i;j++) {
				if (road.charAt(j) == prev && f[j] < Integer.MAX_VALUE) {
					f[i] = Math.min(f[i], f[j] + (i-j)*(i-j));
				}
			}
		}
		if (f[road.length()-1] < Integer.MAX_VALUE) {
			return f[road.length()-1];
		} else {
			return -1;
		}
	}
}
