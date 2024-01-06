package shiva;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "GADAG";
		String rev = "";
		
		char[] c1 = str1.toCharArray();
		
		for(int i = str1.length()-1; i>=0 ;i--) {
			 rev = rev + str1.charAt(i);
		}
		
		
		System.out.println(rev);
		
		if(str1.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		
//		String str = "hello everyone welcome to this world";
//		
//		
//		
//		String[] str1 = str.split("\\s+");
//		
//		String rev ="";
//		
//		//char[] ch = str.toCharArray();
//		
//		for(int i = str1.length-1;i>=0;i--) {
//			
//			rev = rev+" "+str1[i];
//			
//		}
//		
//		System.out.println(rev);
		
		
	}
}

