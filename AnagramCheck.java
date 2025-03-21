import java.util.*;
import java.lang.*;
import java.io.*;

class AnagramCheck
{
	public static void main (String[] args) 
	{

		String string1, string2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string 1");
		string1 = sc.nextLine();
		
		System.out.println("Enter string 2");
		string2 = sc.nextLine();
	
	    System.out.println(isAnagram(string1, string2));
	    
	    sc.close();
	}
	public static boolean isAnagram(String string1, String string2){
	    
	    if (string1.length() != string2.length()) return false;
	    
	    Map<Character, Integer> map = new HashMap<>();
	    
	    for(int i =0 ; i < string1.length(); i++){
	        map.put(string1.charAt(i), map.getOrDefault(string1.charAt(i), 0) + 1);
	        map.put(string2.charAt(i), map.getOrDefault(string2.charAt(i), 0) - 1);
	    }
	    
	    for(Character key: map.keySet()){
	        if (map.get(key) != 0) return false;
	    }
	    
	    return true;
	    	
	    	
	}
}
