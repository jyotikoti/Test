
package shiva;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class day1 {
	
	public static void main(String[] args) {	
		 
		1. Count no. of String in given Program
		
	
		/*String str = "hello everyone this is my practice program everyone practice hello";
		int count = 0;
		String[] st = str.split("\\s+");
		
		for(String s: st) 
		{
			count++;
		}
		
		System.out.println(count);*/
		
		
		//Count the occurance of words in string
		
		/*String str = "hello everyone this is my practice program everyone practice hello";
		
		String[] st = str.split("\\s+");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String s: st) 
		{
			if(!hm.containsKey(s)) 
			{
				hm.put(s, 1);
			}else 
			{
				hm.put(s,hm.get(s) + 1);
			}
		}
		
		
		hm.forEach((key, value) -> System.out.println( key + "  =" + value));*/
		
		//Count the occurrence of character in string
		
       /* String str = "hello everyone this is my practice program everyone practice hello";
		
		
		
		String st = str.replace(" ", "");
		char[] ch = st.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char s: ch) 
		{
			if(!hm.containsKey(s)) 
			{
				hm.put(s, 1);
			}else 
			{
				hm.put(s,hm.get(s) + 1);
			}
		}
		
	
		
		hm.forEach((key, value) -> System.out.println( key + "  =" + value));*/
		
		//Anagram
		
		String str1 = "army";
		String str2 = "mary";
		
		
		
		if(str1.length() == str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println(Arrays.equals(ch1, ch2));
		}else {
			System.out.println("not a anagram");
		}
		
		
		// Find first non repeated character
		
		/*String str = "hhttyuhgvbnkkg";
		
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> hm = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		for(char s: ch) 
		{
			if(!hm.containsKey(s)) 
			{
				hm.put(s, 1);
			}else 
			{
				hm.put(s,hm.get(s) + 1);
			}
		}
		
		for(Entry<Character,Integer> entry: hm.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}*/
		
		//how many are matching in the below string
		
		//String[] s1= {"dog","goD","mAc","cam","fibre"};
		
		//#separtae the lower case and uppercase letters
		
		//String s2="kIraN";
		
		
	}

}
