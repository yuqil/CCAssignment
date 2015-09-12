
public class Solution01 {
	public static boolean IsUnique(String str) {
		// 256 ASCII 
		if (str == null || str.length() < 2) {
			return true;
		}
		
		boolean[] isVisit = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);  
			if (isVisit[val]) {
				return false;
			}
			isVisit[val] = true;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testcases
		String str1 = "abcdefg65";
		String str2 = "abcdefdg66665";
		String str3 = null;
		
		System.out.println("abcdefg65" + (IsUnique(str1) == true? " true" : "false"));
		System.out.println("abcdefdg66665" + (IsUnique(str2)== true? " true" : "false"));
		System.out.println("null" + (IsUnique(str3)== true? " true" : "false"));
	}

}
