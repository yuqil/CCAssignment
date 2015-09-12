
public class Solution09 {
	public static boolean StringRotation(String str, String rotatedstr) {
                if (str.length() != rotatedstr.length()) return false;
		return isSubstring(str + str, rotatedstr); 
	}
}
