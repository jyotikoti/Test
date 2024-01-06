package shiva;

import java.util.HashMap;
import java.util.Map;

public class CounttheOccuranceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "shivanand";
		char c = 'a';
		System.out.println(singlecharcount(s1,c));
		
	}
	
	public static int singlecharcount(String s1,char c) {
		
		
		int res = 0;
		
		for(int i=0;i<s1.length();i++) {
			
			
			if(s1.charAt(i) == c)
				
			res++;
	    }
		return res;
		
	}
	/*public static void charctercount(String s1, char c) {
		
       char[] ch = s1.toCharArray();
		
	   Map<Character , Integer> charcount = new HashMap<Character , Integer>();
		
	   for(char count : ch) {
			
			if(!charcount.containsKey(count)) {
				
				charcount.put(count, 1);
			}
			
			else {
				
				charcount.put(count, charcount.get(count) + 1);
			}
		}
		
		charcount.forEach((key,value) -> System.out.println(key + " = " + value));
		
	}*/
	
	

}
