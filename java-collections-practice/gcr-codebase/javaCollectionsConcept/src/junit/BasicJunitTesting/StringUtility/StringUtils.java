package junit.BasicJunitTesting.StringUtility;


public class StringUtils {
	
	public String reverse(String str) {
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}
		return ans;
	}
	
	public boolean isPalindrome(String str) {
		String rev = reverse(str);
		
		return str.equals(rev);
	}
	public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
