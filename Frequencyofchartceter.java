package shiva;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequencyofchartceter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reverse the String in alphabetic order and count the each character in String
		
		
				String str = "aiming for high";
				
				String st = str.replace(" ", "");
				
				char[] ch = st.toCharArray();
				
				Arrays.sort(ch);
				
				
				Map<Character,Integer> charCount = new LinkedHashMap<Character,Integer>();
				
				for(char count: ch) {
					if(!charCount.containsKey(count)) 
						{
							charCount.put(count, 1);
						}
						else {
							charCount.put(count, charCount.get(count)+1);
						}
					}
				
				charCount.forEach((key,value) -> System.out.println(key + " = " + value));
				
				}
				  


	}


