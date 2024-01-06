package shiva;

import java.util.HashMap;
import java.util.Map;

public class countnoofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d1 = "this is my first program";
		String[] k1 = d1.split("\\s+");
		//int count = 0;
		
		Map<String , Integer> charcount = new HashMap<String, Integer>();
		
		for(String count : k1) {
			
			if(!charcount.containsKey(count)) {
				
				charcount.put(count, 1);
			}
			else {
				charcount.put(count, charcount.get(count)+1);
			}
		}
		
		charcount.forEach((Key,Value) -> System.out.println(Key + "=" +Value));
		
//		for(String s :k1) {
//			
//			
//			count ++;
//	}
//		
//		System.out.println(count);
	}
}
