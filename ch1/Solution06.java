
public class Solution06 {
	public static String Compression(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i ++) {
			char ch = str.charAt(i);
			int count = 0;
			while (i < str.length() && str.charAt(i) == ch) {
				count ++;
				i ++;
			}
			result.append(ch);
			result.append(count);
			if (i == str.length()) break;
			i --;
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Compression("sssdfgdsfgggd"));
	}

}
