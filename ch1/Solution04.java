
public class Solution04 {
	public static boolean isPermulation(String str1) {
		if (str1 == null) {
			return true;
		}
		int[] count = new int[256];
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
				continue;
			}
			int val = str1.charAt(i);
			count[val] ++;
		}
		int oddcount = 0;
		for (int i = 0; i < 256; i++) {
			if (count[i] % 2 == 1) {
				oddcount ++;
				if (oddcount > 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((isPermulation("ta cocat") == true? " true" : "false"));
	}

}
