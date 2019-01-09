package package1;
import java.util.*;
public class PermutationNumber {
	

	static boolean isPermutation(String str1, String str2)  
	{    
	    int n1 = str1.length();  
	    int n2 = str2.length();  
	 
	    if (n1 != n2)  
	    return false;  
	    
	    char ch1[] = str1.toCharArray(); 
	    char ch2[] = str2.toCharArray(); 
	  
	    Arrays.sort(ch1);  
	    Arrays.sort(ch2);  
	   
	    for (int i = 0; i < n1; i++)  
	    if (ch1[i] != ch2[i])  
	        return false;  
	  
	    return true;  
	}  
	public static void permutation(String input)
	{ 
		permutation("", input); 
	} 

	
	public static void permutation(String perm, String word)
	{ 
		if(word.isEmpty())
		{ 
			System.err.println(perm + word);
       } 
		else
		{ 
			for(int i = 0; i < word.length(); i++)
			{
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
			} 
		}

	
public static void main(String[] args)  
	{  
	    String str1 = "A13";  
	    String str2 = "ACA";  
	    permutation(str1);
	    if (isPermutation(str1, str2))  
	    System.out.println("The Given Strings are permutated each other");  
	    else
	    System.out.println("The Given Strings are not permutated each other");  
	  
	} 
	
}  

