
public class Solution02 {
	public static boolean checkPermulation (String str1, String str2) {
		if (str1 == null && str2 == null) {
			return true;
		}
		
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] count = new int[256];
		int str1_letter_count = 0;
		int str2_letter_count = 0;
		
		for (int i = 0; i < str1.length(); i ++) {
			int val = str1.charAt(i);
			if (count[val] == 0) str1_letter_count++;
			count[val] ++;
		}
		
		for (int i = 0; i < str2.length(); i ++) {
			int val = str2.charAt(i);
			if (count[val] == 0) {
				return false;
			} 
			count[val] --;
			if (count[val] == 0) {
				str2_letter_count ++;
				if (str2_letter_count == str1_letter_count) {
					return i == str2.length() - 1;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((checkPermulation("abc", "cbfa") == true? " true" : "false"));
	}

}
