public class IncrementAndDoubling {
	public int getMin(int[] desiredArray) {
		int count = 0;
		while (true) {
			boolean allZero = true;
			for (int i = 0; i < desiredArray.length; i++) {

				if (desiredArray[i] % 2 == 1) {
					desiredArray[i]--;
					count++;
				}
				if (desiredArray[i] > 0) {
					allZero = false;
				}
			}
			if (allZero) {
				break;
			} else {
				for (int i = 0; i < desiredArray.length; i++) {
					desiredArray[i] /= 2;
				}
				count++;
			}
		}
		return count;
	}

}
