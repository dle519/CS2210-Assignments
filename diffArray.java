
public class diffArray {

	public static boolean uniqueArray(int x[]) {
		boolean trigger = true;
		int currentIndex = 0;
		while (trigger && currentIndex < x.length) {
			int current = x[currentIndex];
			int counter = 0;
			while (counter < x.length && trigger) {
				if (current == x[counter] && currentIndex != counter) {
					trigger = false;
				} else {
					counter++;
				}
			}
			currentIndex++;
		}
		return trigger;
	}

	public static void main(String args[]) {
		int[] a = new int[] { 1, 2, 1 };
		System.out.println(uniqueArray(a));
	}
}
