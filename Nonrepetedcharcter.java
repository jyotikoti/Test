package shiva;

import java.util.HashMap;
import java.util.Map;

public class Nonrepetedcharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "sshhiivvk";
		char [] ch = str1.toCharArray();
		Map<Character,Integer> cnt = new HashMap<Character,Integer>();
		for(char c1 : ch) {
			
			if(!cnt.containsKey(c1)) {
				cnt.put(c1, 1);
			}
			else {
				cnt.put(c1, cnt.get(c1)+1);
			}
		}
		
		for (Map.Entry<Character,Integer> entry : cnt.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey() + " =" + entry.getValue());
				break;
			}
			
		}

	}

}
