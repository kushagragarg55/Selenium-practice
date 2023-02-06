package introduction_selenium;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaabbbbc";
		String str2 = "ac";
		String result = ""; //bbbb
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(str2.indexOf(ch)>=0) {
				continue;
			}
			else {
				result = result + ch;
			}
		}
		System.out.println(result);
	}

}
