package shiva;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how many are matching in the below string
		
			String s1 = "abcdabcdeded";
			char[] ch = s1.toCharArray();
			
			Arrays.sort(ch);
			
			Map<Character,Integer> charcount = new LinkedHashMap<Character,Integer>();
			
			for(char count : ch) {
				
				if(!charcount.containsKey(count)) {
					
					charcount.put(count, 1);	
					
				}
				else {
					
					charcount.put(count,charcount.get(count)+1);
				}	
				
			}
			
			charcount.forEach((key,value) -> System.out.println(key + " = " + value));	
			
			
	}

}
