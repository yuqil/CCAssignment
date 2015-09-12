
public class Solution05 {
	public static boolean OneWay (String str1, String str2) {
		if (Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}
		
		if (str1.length() == str2.length()) {
			return str1.equals(str2);
		}
		
		if (str1.length() > str2.length()) {
			int diff = 0;
			int index = 0;
			for (int i = 0; i < str2.length(); i ++) {
				if (str2.charAt(i) != str1.charAt(index)) {
					diff ++;
					i --;
					if (diff > 1) {
						return false;
					}
				}
				index ++;
			}
		}
		
		if (str2.length() > str1.length()) {
			int diff = 0;
			int index = 0;
			for (int i = 0; i < str1.length(); i ++) {
				if (str1.charAt(i) != str2.charAt(index)) {
					diff ++;
					i --;
					if (diff > 1) {
						return false;
					}
				}
				index ++;
			}
		}		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((OneWay("abbcd", "abbcdd") == true? " true" : "false"));
	}

}
