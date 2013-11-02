
public class SparseFactorialDiv2 {
	public long getCount(long lo, long hi, long divisor) {
		if (lo % divisor != 0) {
			lo = (lo / divisor + 1) * divisor;
		}
		if (hi % divisor != 0) {
			hi = (hi / divisor) * divisor;
		}
		return (hi - lo) / divisor + 1;
	}

}
