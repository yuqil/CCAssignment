
public class Solution09 {
	public static boolean StringRotation(String str, String rotatedstr) {
		if (str == null && rotatedstr == null) {
		    return true;
		}
		if (str == null || rotatedstr == null) {
			return false;
		}
		if (str.length() != rotatedstr.length()) return false;
		str = str.concat(str);
		return str.contains(rotatedstr);
	}
	
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cdab";
		System.out.println(StringRotation(str1,str2) == true ? "true": "false");
	}
}
