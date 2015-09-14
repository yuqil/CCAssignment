
public class Solution02 {
	public static char[] URLify(String str1, int len) {
		int space = 0;
		for (int i = 0; i < len ; i++) {
			if (str1.charAt(i) == ' ') {
				space ++;
			}
		}
		char[] URL = new char[len + space * 2];
		int t = len + space * 2 - 1;
		for (int i = len -1; i >= 0; i--) {
			if (str1.charAt(i) == ' ') {
			    URL[t] = '0';
			    URL[t - 1] = '2';
			    URL[t - 2] = '%';
			    t = t - 3;
			} else { 
			    URL[t] = str1.charAt(i);	
			    t --;
			}
		}
		return URL;
		
	}
	
	public static void main(String[] args) {
		String str = new String("acv dfg see");
		System.out.print(URLify(str, str.length()));
	}
}
