

/*--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/

package stringutils;
 public class TwoString{
	 public String concat(String str1, String str2)
	 {
		 return str1 + str2;
	  }
	  
	  public String reverse(String str)
	  {
		  String s = "";
		  for(int i =str.length()-1;i>=0;i--)
		  {
			  s += str.charAt(i);
		  }
		  return s;
	  }
	  
	  public int lengthstr(String s1)
	  {
		  return s1.length();
	  }
 }
 
