package shiva;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicatenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,5,2,6,1,5,9,4,2};
		int[] arr1 = new int[arr.length];
		int j=0;
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				arr1[j] =arr[i];
				j++;
			}
		}
		for(int ar:arr1) {
			System.out.println(ar);
		}
		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		
//		for(int c1 : arr) {
//			
//			if(!hs.add(c1)) {
//				
//				System.out.println(c1);
//			}
//		}
//		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//		for(int s : arr) {
//			
//			if(!hm.containsKey(s)) {
//				hm.put(s, 1);
//			}
//			else {
//				
//				hm.put(s, hm.get(s)+1);
//			}
//		}
//		
//		hm.forEach((key,value)->System.out.println(key+" = "+value));
//		
//		String str = "hello wello sheloo hello mellow wello";
//		String[] c1 = str.split("\s");
//		HashSet<String> hs = new HashSet<String>();
//		
//		for(String s : c1) {
//			
//			hs.add(s);
//		}
//		
//		System.out.println(hs);
		
		
		
}

}
