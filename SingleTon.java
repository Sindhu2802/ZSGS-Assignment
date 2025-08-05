import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
 
 
 /*Day-8 Assignment Questions:
 1. Illustrates with an example of using Singleton class.
 2. Develop a Java program that illustrates the usage of the Comparator Interface.
 3. Develop a Java program which illustrates the usage of Comparable Interface.
 4. Get some strings through the command-line prompt and use an array to store and display them.
 5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make. 
6. Develop a Java program to illustrate pass-by-value.
 7. Develop a Java program to illustrate the usage of toString() method.
 8. Write a Java program to demonstrate the concept of object cloning using the clone() method.--->Create a class Student with fields like name, rollNo, and department.--->Attempt to clone an object of this class using the clone() method.--->Catch and handle the CloneNotSupportedException if thrown.
 ***Also find out and explain why the class must implement the Cloneable interface to avoid 
CloneNotSupportedException.-->Your program should clearly illustrate:
 a. What happens if Cloneable is not implemented
 b. How the error is resolved by implementing Cloneable*/
 
 //1. Illustrates with an example of using Singleton class.

class SingleTon{
	private static SingleTon singleTon_instance ;
	private SingleTon(){
		System.out.println("SingleTon object created ");
	}
	private static SingleTon getInstance(){
		if(singleTon_instance == null)
		{
			singleTon_instance = new SingleTon();
		}
		return singleTon_instance;
	}
	public static void main(String[] args)
	{
		SingleTon single1 = SingleTon.getInstance();
		SingleTon single2 = SingleTon.getInstance();
		System.out.println(single1 ==  single2);
	}
}
		
/*SingleTon object created
true*/


 //2. Develop a Java program that illustrates the usage of the Comparator Interface.

class Student{
	int rollNo;
	String name;
	
	Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
}
	class NameConparator implements Comparator<Student>{
		public int compare(Student s1 , Student s2)
		{
			return s1.name.compareTo(s2.name); 
		}
	}
	 class Compare{
		public static void main(String[] args)
		{
			List<Student> stu = new ArrayList<>();
			
			stu.add(new Student(123,"sindhu"));
			stu.add(new Student(124,"veni"));
			stu.add(new Student(125,"dharan"));
			stu.add(new Student(126,"saran"));
			
			System.out.println("Before sorting :");
			for(Student s : stu)
			{
				System.out.println(s.rollNo + " " + s.name);
			}
			Collections.sort(stu,new NameConparator()); //name only compare sort using 
			System.out.println("After sorting :");
			for(Student s : stu)
			{
				System.out.println(s.rollNo + " " + s.name);
			}
		}
	}
	
/*Before sorting :
123 sindhu
124 veni
125 dharan
126 saran

After sorting :
125 dharan
126 saran
123 sindhu
124 veni*/


 //3. Develop a Java program which illustrates the usage of Comparable Interface.

class Students implements Comparable<Students>{
	int rollNo;
	String name;
	
	Students(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public int compareTo(Students compare) // override method
	{
		return this.rollNo - compare.rollNo;
	}
	
    public String toString() {
        return rollNo + " " + name;
    }
}

class ComparablePgm{
	public static void main(String[] args)
	{
		List<Students> stu = new ArrayList<>();
			
			stu.add(new Students(123,"sindhu"));
			stu.add(new Students(122,"veni"));
			stu.add(new Students(121,"dharan"));
			stu.add(new Students(126,"saran"));
			
			System.out.println("Before sorting :");
			for(Students s : stu)
			{
				System.out.println(s);
			}
			Collections.sort(stu); //name only compare sort using 
			System.out.println("After sorting :");
			for(Students s : stu)
			{
				System.out.println(s);
			}
	}
}

/*Before sorting :
123 sindhu
122 veni
121 dharan
126 saran
After sorting :
121 dharan
122 veni
123 sindhu
126 saran*/



 //4. Get some strings through the command-line prompt and use an array to store and display them.

class CommandLine{
	public static void main(String[] args)
	{
		String[] Chocolates = args;
		System.out.println("Stored Chocolates:");
		for(String choco : Chocolates)
		{
			System.out.println(choco);
		}
	}
}

/*Sorting Chocolates:
dairy
oreo
kitkat*/

//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make. 

class CollegeStudent implements Cloneable{
	int rollNo;
	String name;
	
	CollegeStudent(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString(){
		return "Rollno:" + rollNo + " " + "Name " + name;
	}
	
}
class CloneEx{
	public static void main(String[] args)
	{
		try{
			CollegeStudent college1 = new CollegeStudent(12,"saranya");
			CollegeStudent college2 = (CollegeStudent)college1.clone();
			System.out.println("Cloned the student details : " + college2.clone());
			System.out.println("CollegeStudent rollNo :" + college2.rollNo);
			System.out.println("CollegeStudent name :" + college2.name);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("CloneNotSupportedException  handled  " );
		}
	}
}

/*Cloned the student details : Rollno:12 Name saranya
CollegeStudent rollNo :12
CollegeStudent name :saranya*/

//6. Develop a Java program to illustrate pass-by-value.

class StudentInfo{
	String name;
	
	StudentInfo(String name)
	{
		this.name =name;
	}
}
class PassbyValue{
	public static void Assign(StudentInfo s)
	{
		s = new StudentInfo("Nandihini");
		System.out.println("Inside Assign method s.name = " + s.name);
	}
	public static void change(StudentInfo s)
	{
		s.name = "Sindhu";
		System.out.println("Inside change method s.name = " + s.name);
	}
	public static void main(String[] args)
	{
		StudentInfo stu= new StudentInfo("old string");
		Assign(stu);
		System.out.println("Before assign method s.name = " + stu.name);
		change(stu);
		System.out.println("After change method stu.name = " + stu.name);
		
	}
	
}
/*Inside Assign method s.name = Nandihini
Before assign method s.name = old string
Inside change method s.name = Sindhu
After change method stu.name = Sindhu*/

 //7. Develop a Java program to illustrate the usage of toString() method.
 class ToString{
	 String fruit;
	 double price;
	 
	 ToString(String fruit,double price)
	 {
		 this.fruit = fruit;
		 this.price = price;
		 }
		 public String toString(){
			 return "fruit : " + fruit + " " + "price : " + price ;
			}
	}
class Tostr{
	public static void main(String[] args)
	{
		ToString str1 =new ToString("apple",200);
		ToString str2 = new ToString("banana",400);
	   
	   System.out.println(str1.toString());
	   System.out.println(str2.toString());
	}
}


/*fruit : apple price : 200.0
fruit : banana price : 400.0*/


/*8. Write a Java program to demonstrate the concept of object cloning using the clone() method.--->Create a class Student with fields like name, rollNo, and department.--->
Attempt to clone an object of this class using the clone() method.--->Catch and handle the CloneNotSupportedException if thrown.
 ***Also find out and explain why the class must implement the Cloneable interface to avoid 
CloneNotSupportedException.-->Your program should clearly illustrate:
 a. What happens if Cloneable is not implemented
 b. How the error is resolved by implementing Cloneable*/
 
 class CollegeStudents implements Cloneable{
	int rollNo;
	String name;
	String course;
	
	CollegeStudents(int rollNo,String name,String course)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.course=course;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString(){
		return "Rollno:" + rollNo + " " + "Name " + name + "course " + course;
	}
	
}
class CloneEx1{
	public static void main(String[] args)
	{
		try{
			CollegeStudents college1 = new CollegeStudents(12,"saranya","Cyber");
			CollegeStudents college2 = (CollegeStudents)college1.clone();
			System.out.println("Cloned the student details : " + college2.clone());
			System.out.println("CollegeStudent rollNo :" + college2.rollNo);
			System.out.println("CollegeStudent name :" + college2.name);
			System.out.println("CollegeStudents course :" + college2.course);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("CloneNotSupportedException  handled  " );
		}
	}
}
 
 

/*Cloned the student details : Rollno:12 Name saranya course Cyber
CollegeStudent rollNo :12
CollegeStudent name :saranya
CollegeStudents course :Cyber*/
