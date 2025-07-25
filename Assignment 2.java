/*Day-2 Assignment Questions: Part-1*
1. Write a program that uses if statement to find the minimum of three numbers.
2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R
3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS
‌
5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
6. Define a method to convert the decimal number to a binary number?
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

//1. Write a program that uses if statement to find the minimum of three numbers.
class minimum{
	public static void main(String[] args)
	{
		int n1 = 45;
		int n2 = 32;
		int n3 = 55;
		if(n1 < n2 & n1 < n3)
		{
			System.out.println( "minimum of three number" + n1);
		}
		else if(n2 < n3)
		{
			System.out.println("minimum of three number " + n2);
		}
		else{
			System.out.println("minimum of three number " + n3);
		}
	}
}  

/*2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R*/

//a) Using for loop patterns
  /*1      1
    1  1
      1
	1   1
  1       1 */   	
	   

class pattern1{
	public static void main(String[] args)
	{
		int rows =5;
		for(int i=0;i<rows;i++)
		{
			for(int j =0;j<rows;j++)
			{
				
				if(i == j || i+j == rows - 1 )
				{
					System.out.print("1"+ " " );
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//b R pattern 
  
class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (
                    (i == 0) ||(j == 0) ||(i == 2) ||                 
                    (j == cols - 1 && i == 1) || 
                    (i - j == 1 && i >= 3)) {
                    System.out.print("R ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w*/
//a)
   /*  1
   2   3
 4    5   6
   7   8
     9*/
	 
 class pattern3{
	 public static void main(String[] args)
	 {
		 int r = 3;
		 int num=1;
		 int i=1;
		 while(i<=2*r-1)
		 {
			int totoalcols = (i<=r) ? i : (2*r-i);
		    int j =1;
		      while(j<=r)
			 {
				 if( j <= r-totoalcols )
				 {
					 System.out.print(" ");
				 }
				 else{
					 System.out.print(num+" ");
					  num++;
				 }
				 j++;
				
			 }
			 System.out.println();
			 i++;
		 }
	 }
 }

//b.	 
class pattern4{
	 public static void main(String[] args)
	 {
		 int r = 3;
		 int num=1;
		 int i=1;
		 while(i<=2*r-1)
		 {
			int totoalcols = (i<=r) ? i : (2*r-i);
		    int j =1;
		  while(j<=r)
			 {
				 if( j <= i )
				 {
					 System.out.print("W"+" ");
					  num++;
				 }
				 j++;
				
			 }
			 System.out.println();
			 i++;
		 }
	 }
 }

 
/*4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS*/

//a Pascal Triangle

class pascal{
	public static void main(String[]  args)
	{
		int n =4;
		int i=0;
		
		do {
			int space =0;
			do{
				System.out.print(" "); // space 
				space++;
			}while(space< n -i);
			int j=0;
			int value=1;
			do{
				if(j == 0 || i == 0)
				{
					value =1;
				}
				else{
					value = value * (i - j + 1 )/j;
				}
				System.out.print(value+ " ");
				j++;
			}
			while(j <= i );
			System.out.println();
			i++;
		}
		while(i < n);
	}
 }


/*b) ZOHO
CORP
ORAT
IONS*/

class zohocorp{
	public static void main(String[] args)
	{
		String str  = "ZOHOCORPORATIONS";
		int n = 4;
		int i =0;
		int length = str.length();
		do{
			int j=0;
			do{
				if(i + j < length)
				{
					System.out.print(str.charAt(i+j));
				}
				j++;
			}
			while(j < n );
			System.out.println();
			i += n;
		}
		while(i < length);
	}
}


 

//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class even{
	
	static int evensum(int n)
	{
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			if(i%2 != 0)
			{
				continue; 
			}
			sum += i ; //sum of even numbers
			
		}
		
		return sum;
	}
				
	public static void main(String[] args)
	{
		int n = 10;
		int sumOf = evensum(n);
		System.out.println("The sumof even numbers from the series " + sumOf );
	}
}

//6. Define a method to convert the decimal number to a binary number?

 class decimal{
	 static String decimaltobinary(int num)
	 {
		
		 int temp = num; //create temp variable store the num value
		 String binary = ""; //store the decimal to binary value 
		 
		 while(temp >0)
		 {
			 int rem = temp % 2;
			 binary = rem + binary;
			 temp /= 2;
		 }
		 
		 return binary; 
	 }
	 public static void main(String[] args)
	 {
		 int num = 10;
		 String result = decimaltobinary(num);
		 System.out.println("decimal number to binary number value is " + result);
	 }
 }
 
 
 
/*7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

class student{
	public static void main(String[] args)
	{
		int percen = 65;
		int grade ;
		if(percen>=85 && percen<=100)
		{
			grade = 3;
		}
		else if(percen >= 70)
		{
			grade = 2;
		}
		else if(percen >=50)
		{
			grade =1;
		}
		else{
			grade =0;
		}
		switch(grade)
		{
			case 3 : 
			  System.out.println("Grade 'A' . Excellent marks");
			break;
			case 2:
			   System.out.println("Grade 'B' .Good marks ");
			   break;
			case 1:
			   System.out.println("Grade 'C'");
			   break;
			default :
			    System.out.println("Fail marks");
		}
	}
}
			
	
/*Day-2 Assignment Questions: Part-2 Arrays*
1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
2. Write a program to take in 10 values and print only those numbers which are prime.
3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

class oddsum{
	public static void main(String[] args)
	{
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter  the size of the elements ");
		int arr = scan.nextInt();
		int[] num = new int[arr];
		System.out.println("enter the elements");
		int sum =0;
		for(int i=0;i<arr;i++)
		{
			num[i] = scan.nextInt();
		}
		for(int i=0;i<arr;i++)
		{
			if(num[i] % 2 != 0)
			{
				sum += num[i];
			}
			
		}
		System.out.println("sum of odd numbers " + sum );
		scan.close();
	}
}	
			
//2. Write a program to take in 10 values and print only those numbers which are prime.

class prime{
	static boolean isprime(int n)
	{
		
		if(n <=1)
		{
			return false;
		}
		for(int i =2;i*i <= n;i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
    public static void main(String[] args)
	{
    int[] elements = {2,1,4,5,15,17,7,19,0,7};
	System.out.println("prime elements in the array : ");
	for(int values : elements)
	{
		if(isprime(values)) // valid prime numbers are print
		{
			System.out.println(values + " ");
		}
	}	
	}
}

//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class fibonacci{
	public static void main(String[] args)
	{
		int num = 30;
		long[] val = new long[num];
		val[0] = 1; //1st term
		val[1] = 1; // 2nd term
		for(int i =2;i<num;i++)
		{
			val[i] = val[i-1] + val[i-2]; 
		}
		System.out.println("the fibonacci series 30 terms are " );
		for(int i=0;i<num;i++)
		{
			System.out.println(val[i] + " "); //print the all fibonacci series values
		}
	}
}

//4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
 class single{
	 public static void print(int[] x,int num)
	 {
		 int sinSum =0;
		 int doubleSum =0;
		 for(int i=0;i<num;i++)
		 {
			 if(x[i] >= 0 && x[i] <= 9)
			 {
				 sinSum+= x[i];
			 }
			 else if(x[i]>= 10 && x[i] <= 99)
			 {
				 doubleSum+= x[i];
			 }
		 }
		 System.out.println("the sum of single num is "+ sinSum);
		 System.out.println("the sum double num is "+ doubleSum);
	 }
	 public static void main(String[] args)
	 {
		 int[] x = {4,5,1,2,55,75,64,76,88,87};
		 int num =10;
		 print(x,num);
		 
	 }
 }
 
/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/

class identical{
	public static void main(String[]args)
	{
		char[] X = {'m','n','o','p'};
		char[] Y={'m','n','o','p'};
		boolean identicalchar = true;
	    for(int i=0;i<X.length;i++)
		{
			if(X[i] != Y[i])
			{
				identicalchar = false;
				break;
			}
		}
		if(identicalchar)
		{
			System.out.println("Two arrays are identical");
			}
			else{
				System.out.println("two are not identical");
				}
	}
}

/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/

class graduation{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
		System.out.println("enter the year of graduation : ");
		int yr = scan.nextInt();
		int left =0; //start of  the array
		int right = arr.length; // end of the array
		int ind = -1;
		while(left <= right) 
		{
			int mid = (left+right)/2; //middle value check
			if(arr[mid] == yr)
			{
				ind = mid;
				break;
			}
			else if(arr[mid] < yr)
			{
				left = mid+1;
			}
			else{
				mid = mid-1;
			}
		}
		if(ind == -1) 
		{
			System.out.println("Record not exists");
		}
		else{
			System.out.println("Record is exists");
		}
	}
	
}

//7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

class weight{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double arr[] = new double[10]; // weight value is 45.5 so i declare double datatype
		System.out.println("enter weight of ten members");
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextDouble();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			int max =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] > arr[max])
				{
					max=j;
				}
			}
			double temp = arr[i]; //swap the value so create temp variable
			arr[i] = arr[max];
			arr[max]=temp;
		}
		System.out.println("descending order :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("weight " + arr[i]); //print the descending order 
		}
		scan.close();
	}
}

//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
class age{
	public static void main(String[] args)
	{
		int[] ages = {23,43,11,44,55,65,12,33,21,76};
		
        int below18count =0;
		int betw18to60count=0;
		int above60count=0;
		System.out.println("enter the ages 10 people");
		for(int i : ages)
		{
			if(i < 18){
				below18count++;
			}
			else if(i>=18 && i<= 60)
			{
				betw18to60count++;
			}
			else
			{
				above60count++;
			}
		}
        System.out.println("Number of below18 people " + below18count);
		System.out.println("Number of between 18 to 60 people " + betw18to60count);
		System.out.println("Number of above60 people " + above60count);
	}
}

//9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

class subjects{
	public static void main(String[] args)
	{
		int[] rollNo = {201,202,203,204,205,206,207,208,209,210};
		int[] subject1 = {54,66,76,54,32,67,88,98,99,87};
		int[] subject2 ={45,56,43,57,76,89,65,78,65,78};
		int[] subject3 ={44,54,56,76,44,56,76,23,76,45};
		int total_marks[]=new int[10];
		int[] avg=new int[10];
		System.out.println("Roll NO   |  Marks  |     Average");
		System.out.println("________________________________________");
		for(int i =0;i<rollNo.length;i++)
		{
			total_marks[i] += subject1[i] + subject2[i]+subject3[i];
			avg[i] = total_marks[i]/3;
			System.out.println(rollNo[i]   + "     |    "  +   total_marks[i]  +  "   |     " +     avg[i]   );
		}
	}
}
			
		
		


/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

class matrix{
	//input elements 
	public static void inputElements(int[][] mat,int r,int c,Scanner scan)
	{
	   System.out.println("enter mat elements ");
	   for(int i=0;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
		   {
			   mat[i][j] = scan.nextInt();
		   }
		   
	   }
	}
	//display elements of matrix
	public static void displayMat(int[][] mat,int r,int c)
	{
		System.out.println("display matrix ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	//sum of all elements
	public static void sumOf(int[][] mat,int r,int c)
	{
		int sum=0;
		for(int[] row:mat)
		{
			for(int res:row)
			{
				sum+= res;
			}
		}
		System.out.println("the sum of "+sum );
	}


//row-wise sum of elements
    public static void rowwise(int[][]mat,int r,int c)
	{
		System.out.println("Row wise sum :");
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			sum +=  mat[i][j];
			}
			System.out.println("Row-wise" + (i+1) + sum);
		}
	}
//column wise sum 
     public static void columnwise(int[][] mat,int r,int c)
	 {
		 System.out.println("column wise sum :");
		 int sum=0;
		 for(int j=0;j<c;j++)
		 {
			 for(int i=0;i<r;i++)
			 {
			sum +=  mat[i][j];
			}
			System.out.println("column-wise" + (j+1) + sum);
			}
	 }

     public static void transposemat(int[][] mat,int r,int c)
	{
		System.out.println("Transpose matrix");
		for(int j=0;j<c;j++)
		{
			for(int i=0;i<r;i++)
		{
			System.out.println(mat[i][j] + " ");
		}
		System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter number of rows ");
		int r = scan.nextInt();
		System.out.print("enternumber of columns");
		int c =scan.nextInt();
		int[][] mat=new int[r][c];
		while(true)
		{
			System.out.println("1 . input elements");
			System.out.println("2 . display matrix");
			System.out.println("3 . sum of all elements");
			System.out.println("4. Row-wise sum");
			System.out.println("5. Column-wise sum");
			System.out.println("6. Transpose matrix");
		   
		    System.out.println("enter the options ");
			int options = scan.nextInt();
			
			switch(options)
			{
				case 1:
				  inputElements(mat,r,c,
				  scan);
				  break;
				case 2:
				  displayMat(mat,r,c);
				  break;
				case 3:
			      sumOf(mat,r,c);
				  break;
				case 4:
				  rowwise(mat,r,c);
				  break;
				case 5:
				  columnwise(mat,r,c);
				  break;
				case 6:
	              transposemat(mat,r,c);
				  break;
				  default:
				  System.out.println("invalid options");
			}
		}
	}
}
	
	
/*Day-2 Assignment Questions: Part-3 Strings
1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
‌
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
‌
3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
‌
4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
‌
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
‌
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
‌
7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
‌
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.	*/

/*1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

class binaryadd{
	public static String addBinary(String a ,String b)
	{
		StringBuilder result = new StringBuilder();
		int i = a.length()-1; // last digit value 1st add valueof a  
		int j =b.length()-1; // last digit value 1st add value of b
		int carry =0;
        while(i>=0 || j>=0 || carry==1)
		{
			int sum = carry;
			if(i>=0)
			{
				sum += a.charAt(i) - '0';
				i--;
			}
			if(j>=0)
			{
				sum += b.charAt(j)-'0';
			    j--;
			}
			result.append(sum % 2);
		    carry= sum /2; // carry give 1 loop is run
		}
		 return result.reverse().toString();
		
	} 
    public static void main(String[] args)
	{
	   String a1 = "11";
	   String b1 = "1";
	   System.out.println(addBinary(a1,b1));
	   String a2 =  "1010";
	   String b2 = "1011";
	   System.out.println(addBinary(a2,b2));
	}
}
      	



/*2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1*/

class columnnum{
	public String columnTitle(int columnNumber)
	{
		String res = "";
		//int columnNumber =1;
		while(columnNumber > 0)
		{
			columnNumber--; //adjustment base
			int rem = columnNumber% 26;
			char ch = (char)('A' + rem);
			res= ch + res;
			columnNumber = columnNumber /26;
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter column number ");
		int columnNumber = scan.nextInt();
		columnnum obj= new columnnum();
		String column = obj.columnTitle(columnNumber);
		System.out.println("excel sheet column "+column);
	}
}

/*3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.	*/
class vowels{
	public  static String rev(String str)
	{
		char ch[] = str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			while(left < right && !isVowel(ch[left])){
			left++;
			}
			while(left<right && !isVowel(ch[right]))
			{
				right--;
			}
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		return new String(ch);
	}
	static boolean isVowel(char s)
	{
		if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		String str = "leetcode";
		String res = rev(str);
		System.out.println("Reversed vowels string : "+ res);
		
	}
}

		
/*4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.*/

class random{
	public static Character difference(String s, String t)
	{
		int sum =0;
		for(int i=0;i<t.length();i++)
		{
			sum += t.charAt(i); 
		}
		for(int i=0;i<s.length();i++)
		{
			sum -= s.charAt(i); 
		}
		return (char)sum; //return  the value of char type 
	}
	public static void main(String[] args)
	{
		String s1 ="abcd";
		String t1 ="abcde";
		System.out.println(difference(s1,t1));
		String s2 = "";
		String t2 = "Y";
		System.out.println(difference(s2,t2));
	}
}

/*5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?*/

class subsequence{
	public  static boolean isSubseq(String s, String t)
	{
		int left =0;
		int right=0;
		while(left < s.length() && right < t.length())
		{
			if(s.charAt(left) == t.charAt(right))
			{
				left++;
			}
			right++;
		}
		return left == s.length();
	}
	public static void main(String[] args)
	{
		String s1 = "abc";
		String t1 = "ahbgdc";
		System.out.println(isSubseq(s1,t1));
		String s2 = "axc";
		String t2 = "ahbgdc";
		System.out.println(isSubseq(s2,t2));
	}
	
}
				
/*6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself*/

	
class str{
	
	 public static String addstr(String s1,String s2)
	 {
		 int i =s1.length()-1; //last value
		 int j=s2.length()-1;
		 int carry=0;
		 StringBuilder result = new StringBuilder();
		 while(i>=0 || j>=0 || carry != 0)
		 {
			 int digit1 = i>=0 ? s1.charAt(i) - '0' : 0; //ASCII VALUE  - '0'
			 int digit2 = j>=0 ? s2.charAt(j)- '0' : 0;
			 int sum = digit1 + digit2 + carry; 
			 carry = sum /10;
			 result.append (sum % 10);
			 i--;
			 j--;
		 }
		 return result.reverse().toString(); 
	 }
	 public static void main(String[] args)
	 {
		 String s1 = "11";
		 String s2 ="123";
		 System.out.println(addstr(s1,s2));
		 String s3 = "456";
		 String s4 ="77";
		 System.out.println(addstr(s3,s4));
		 String s5 = "0";
		 String s6 ="0";
		 System.out.println(addstr(s5,s6));
	 }
}
		 
/*7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/

class segments{
	public static int countnumber(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) 
			{
				count++; //  count to the words
			}
		}
		return count ;
	}
   public static void main(String[] args)
   {
	   String s = "Hello,my name is John";
	   System.out.println(countnumber(s));
	   String s1 = "Hello";
	   System.out.println(countnumber(s1));
   }
}

/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.	*/


class capital{
	public static boolean capitalLetter(String word)
	{
		int capcount =0;
		for(int i=0;i<word.length();i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
			{
				capcount++;
			}
		}
		if(capcount == word.length()) // word length and capital letters count are same return true
		{
			return true;
		}
		if(capcount == 0)
		{
			return true; //incase count 0 check
		}
		if(capcount == 1 && Character.isUpperCase(word.charAt(0)))
		{
			return true; //incase count 1 and uppercase in 1st letter
		}
		return false; //otherwise false
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words are : ");
		String word = scan.nextLine();
		
		
		System.out.println(capitalLetter(word));
		//System.out.println("Capital letters count "+count);
		

	}
}

