import java.util.Iterator;
import java.util.*;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.HashMap;


 /*Day-10 Assignment Questions:
 1. Write a Java program 
a. to create a new array list, add some colors (string) and print out the collection.
 b. to iterate through all elements in an array list. 
c. to insert an element into the array list at the first position. 
d. to retrieve an element (at a specified index) from a given array list. 
e. to update specific array element by given element. 
f. to remove the third element from an array list. 
g. to search an element in an array list. 
h. to sort a given arrays list. 
i. to copy one array list into another. 
j. to shuffle elements in an array list. 
2. Write a Java program to,
 a. append the specified element to the end of a linked list. 
b. iterate through all elements in a linked list. 
c. iterate through all elements in a linked list starting at the specified position. 
d. iterate a linked list in reverse order. 
e. insert the specified element at the specified position in the linked list. 
f. insert elements into the linked list at the first and last position. 
g. insert the specified element at the front of a linked list. 
h. insert the specified element at the end of a linked list. 
i. insert some elements at the specified position into a linked list. 
j. get the first and last occurrence of the specified elements in a linked list.
 3. Write a Java program to,
 a. append the specified element to the end of a hash set. 
b. iterate through all elements in a hash list. 
c. get the number of elements in a hash set. 
d. empty the hash set. 
e. test a hash set is empty or not. 
f. clone a hash set to another hash set. 
g. convert a hash set to an array. 
h. convert a hash set to a tree set. 
i. convert a hash set to a List/ArrayList. 
j. compare two hash set. 
4. Write a Java program to,
 a. create a new tree set, add some colors (string) and print out the tree set. 
b. iterate through all elements in a tree set. 
c. add all the elements of a specified tree set to another tree set. 
d. create a reverse order view of the elements contained in a given tree set. 
e. get the first and last elements in a tree set. 
f. clone a tree set list to another tree set. 
g. get the number of elements in a tree set. 
h. compare two tree sets. 
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set. 
j. get the element in a tree set which is greater than or equal to the given element. 
k. get the element in a tree set which is less than or equal to the given element. 
l. get the element in a tree set which is strictly greater than or equal to the given element. 
m. get an element in a tree set which is strictly less than the given element. 
n. retrieve and remove the first element of a tree set. 
o. retrieve and remove the last element of a tree set. 
p. remove a given element from a tree set.
 5. Write a Java program to,
 1. create a new priority queue, add some colors (string) and print out the elements of the priority queue. 
2. iterate through all elements in the priority queue. 
3. add all the elements of a priority queue to another priority queue.
 4. insert a given element into a priority queue. 
5. remove all the elements from a priority queue. 
6. count the number of elements in a priority queue. 
7. compare two priority queues. 
8. retrieve the first element of the priority queue. 
9. retrieve and remove the first element. 
10. convert a priority queue to an array containing all of the elements of the queue.
 6. Write a Java program to,
 1. associate the specified value with the specified key in a Tree Map. 
2. copy a Tree Map content to another Tree Map. 
3. search a key in a Tree Map. 
4. search a value in a Tree Map. 
5. get all keys from the given a Tree Map. 
6. delete all elements from a given Tree Map. 
7. sort keys in Tree Map by using comparator. 
8. get a key-value mapping associated with the greatest key and the least key in a map. 
9. get the first (lowest) key and the last (highest) key currently in a map. 
10. get a reverse order view of the keys contained in a given map.
 7. Write a Java program to,
 1. associate the specified value with the specified key in a HashMap. 
2. count the number of key-value (size) mappings in a map. 
3. copy all of the mappings from the specified map to another map. 
4. remove all of the mappings from a map. 
5. check whether a map contains key-value mappings (empty) or not. 
6. get a shallow copy of a HashMap instance. 
7. test if a map contains a mapping for the specified key. 
8. test if a map contains a mapping for the specified value. 
9. create a set view of the mappings contained in a map. 
10. get the value of a specified key in a map. 
8. Develop a Java program to manage a list of bank accounts using ArrayList.--->Create an Account class with the following attributes:
 a. accountNumber (int)
 b. holderName (String)
 c. balance (double)--->Use auto-boxing to store the balance and interest as Double wrapper objects.--->Use manual boxing to convert a primitive interest rate into a Double object.--->Unbox the values (both automatic and manual) to calculate and update the new balance.--->Add at least three Account objects to an ArrayList<Account>.--->For each account:
 a. Display the holder name, account number, original balance
 b. Apply 5% interest
 c. Show the new balance using primitive values (unboxed)*/
 
 
 /*1. Write a Java program 
a. to create a new array list, add some colors (string) and print out the collection.
 b. to iterate through all elements in an array list. 
c. to insert an element into the array list at the first position. 
d. to retrieve an element (at a specified index) from a given array list. 
e. to update specific array element by given element. 
f. to remove the third element from an array list. 
g. to search an element in an array list. 
h. to sort a given arrays list. 
i. to copy one array list into another. 
j. to shuffle elements in an array list. */

class ArrayListProgram{
	public static void main(String[] args)
	{
//a. to create a new array list, add some colors (string) and print out the collection.
		
		ArrayList<String>colors = new ArrayList<>();
		colors.add("Blue");
		colors.add("black");
		colors.add("yellow");
		colors.add("pink");
		
		System.out.println(" list of colors : " + colors);
  // b. to iterate through all elements in an array list. 
		
		System.out.println("Iterable all elements");
		Iterator<String> iter = colors.iterator();  // Get the iterator
            while (iter.hasNext()) {
              System.out.println(iter.next() + " ");
             }
		/*for(String i : colors)
		{
			System.out.println(i + " ");
		}*/
	     System.out.println();
		
//c. to insert an element into the array list at the first position. 
		colors.add(0,"purple");
		System.out.println("After insert first position :" + colors);
		
 //d. to retrieve an element (at a specified index) from a given array list. 
		String colors3 = colors.get(3);
		System.out.println("Elemnet at index position 3 :" + colors3);
	
 //e. to update specific array element by given element. 
	   colors.set(2,"Brown");
	   System.out.println("Updated element :" + colors);
	  
 //f. to remove the third element from an array list. 
	   colors.remove(2);
	   System.out.println("Remove third element: "  + colors);
	   
 //g. to search an element in an array list. 
	   String SearchClr = "Dark blue";
	   if(colors.contains(SearchClr))
	   {
		   System.out.println(SearchClr + "This color found to the list");
	   }
	   else{
		   System.out.println(SearchClr+ "This color not found to the list");
	   }
	   
  //h. to sort a given arrays list.
		Collections.sort(colors);
		
		System.out.println("Sorted array list : " + colors);
		
		
 //i. to copy one array list into another. 
		ArrayList<String>copyElement = new ArrayList<>(colors);
		System.out.println("Copy to one array list into another array : " +copyElement);
		
 //j. to shuffle elements in an array list. 
	    Collections.shuffle(colors);
		System.out.println("Shuffle elements in array list are : "+ colors);
	}
}
	   

/* list of colors : [Blue, black, yellow, pink]
Iterable all elements
Blue
black
yellow
pink

After insert first position :[purple, Blue, black, yellow, pink]
Elemnet at index position 3 :yellow
Updated element :[purple, Blue, Brown, yellow, pink]
Remove third element: [purple, Blue, yellow, pink]
Dark blueThis color not found to the list
Sorted array list : [Blue, pink, purple, yellow]
Copy to one array list into another array : [Blue, pink, purple, yellow]
Shuffle elements in array list are : [pink, yellow, purple, Blue]*/

/*2. Write a Java program to,
 a. append the specified element to the end of a linked list. 
b. iterate through all elements in a linked list. 
c. iterate through all elements in a linked list starting at the specified position. 
d. iterate a linked list in reverse order. 
e. insert the specified element at the specified position in the linked list. 
f. insert elements into the linked list at the first and last position. 
g. insert the specified element at the front of a linked list. 
h. insert the specified element at the end of a linked list. 
i. insert some elements at the specified position into a linked list. 
j. get the first and last occurrence of the specified elements in a linked list.*/

class LinkedListProgram{
	public static void main(String[] args)
	{
	
	  LinkedList<String> list = new LinkedList<>();
	  
//a. append the specified element to the end of a linked list.
	  list.add("apple");
	  list.add("banana");
	  list.add("orange");
	  System.out.println("Append elements to end  : " + list);
	  
 //b. iterate through all elements in a linked list. 
	  System.out.println("Iterate all elements in linked list " );
	  Iterator itr = list.iterator();
	  System.out.println("list all element");
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println();
	  
 //c. iterate through all elements in a linked list starting at the specified position. 
	  System.out.println("Start at the first index " );
	  int startind = 1;
	  for(int i = startind;i < list.size();i++)
	  {
		  System.out.println(list.get(i));
	  }

//d. iterate a linked list in reverse order. 
	  System.out.println("Reverse order : " );
	 /* for(int i = list.size()-1;i>=0;i--)
	  {
		  System.out.println(list.get(i));
	  }*/
	  Collections.reverse(list);
	  System.out.println(list);
	  
// e. insert the specified element at the specified position in the linked list. 
	  System.out.println("Insert element at position");
	  list.add(2,"grapes");
	  System.out.println("After Insert to the element : " + list);
	  
// f. insert elements into the linked list at the first and last position. 
	 System.out.println("insert element first and last position ");
	 list.addFirst("green apple");
	 list.addLast("watermelon");
	 System.out.println("After inserting first and last added the list : " + list);
	 
// g. insert the specified element at the front of a linked list.
	   System.out.println("insert the front of list:");
     	list.offerFirst("mangos");
		System.out.println("Insert the front of list  : " + list);
	
//h. insert the specified element at the end of a linked list.
	System.out.println("Insert to the end of list : ");
	list.offerLast("Strawberries");
	System.out.println("Insert to the end list : " + list);
	
//i. insert some elements at the specified position into a linked list
	List<String>addfruits= Arrays.asList("papayas","green grapes");
	list.addAll(4,addfruits);
	System.out.println("After insert the elements in the list:" + list);
	
//j. get the first and last occurrence of the specified elements in a linked list.
	System.out.println("First and last elements occurrence : ");
	list.add("apple");
	System.out.println("after insert the list : " + list);
	System.out.println("First occurrence of the list : " + list.indexOf("apple"));
	System.out.println("Last occurrence of the list : " + list.lastIndexOf("apple"));
	}
}
/*Append elements to end  : [apple, banana, orange]
Iterate all elements in linked list
apple
banana
orange

Start at the first index
banana
orange
Reverse order :
[orange, banana, apple]
Insert element at position
After Insert to the element : [orange, banana, grapes, apple]
insert element first and last position
After inserting first and last added the list : [green apple, orange, banana, grapes, apple, watermelon]
insert the front of list:
Insert the front of list  : [mangos, green apple, orange, banana, grapes, apple, watermelon]
Insert to the end of list :
Insert to the end list : [mangos, green apple, orange, banana, grapes, apple, watermelon, Strawberries]
After insert the elements in the list:[mangos, green apple, orange, banana, papayas, green grapes, grapes, apple, watermelon, Strawberries]
First and last elements occurrence :
after insert the list : [mangos, green apple, orange, banana, papayas, green grapes, grapes, apple, watermelon, Strawberries, apple]
First occurrence of the list : 7
Last occurrence of the list : 10*/

/*3. Write a Java program to,
 a. append the specified element to the end of a hash set. 
b. iterate through all elements in a hash list. 
c. get the number of elements in a hash set. 
d. empty the hash set. 
e. test a hash set is empty or not. 
f. clone a hash set to another hash set. 
g. convert a hash set to an array. 
h. convert a hash set to a tree set. 
i. convert a hash set to a List/ArrayList. 
j. compare two hash set.*/

//a. append the specified element to the end of a hash set.

class HashSetProgram{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
	    System.out.println(" a) Append hashset :" );
		set.add("apple");
		set.add("jackfruit");
		set.add("green apple");
		System.out.println("After add : " + set);

//b. iterate through all elements in a hash list. 
     
       System.out.println("b) Iterate all element : ");
	  for(String i : set)
	 {
		System.out.println(i + " ");
	 }
	 System.out.println();
	 

//c. get the number of elements in a hash set. 	
     System.out.println("c) Get number of elements :" );
	 System.out.println("Size of set : " +set.size());
	System.out.println();
//d. empty the hash set. 
     
	 System.out.println("d) Empty set :");
	 set.clear();
	 System.out.println("After empty set :" + set);
	 System.out.println();
	 
//e. test a hash set is empty or not.
      System.out.println("e) Hashset empty or not ?" + set.isEmpty());
	  
	  set.add("banana");
	  set.add("kiwi");
	  set.add("plums");
	  System.out.println();
	  
//f. clone a hash set to another hash set.   
      System.out.println("Clone to another set : ");
     //HashSet<String>setclone = (HashSet<String>) set.clone();
	 HashSet<String> setclone = new HashSet<String>(set);

	  System.out.println("After cloned set  : " + setclone);
	  System.out.println();


//g. convert a hash set to an array. 
      String[] arr = set.toArray(new String[0]);
	  System.out.println("convert to array:");
	  for(String values : arr)
	  {
		  System.out.println("Values are :" + values);
	  }
	  System.out.println();
	  
//h. convert a hash set to a tree set. 	  
	 
	 TreeSet<String>treeset = new TreeSet<>(set);
	 System.out.println("Convert to hashset to tree set (tree set is sorted) : " );
	 System.out.println(treeset);
	 System.out.println();
	 
//i. convert a hash set to a List/ArrayList. 
    ArrayList<String>array = new ArrayList<>(set);
	System.out.println("convert hashset arraylist : " + array);
	System.out.println();

//j. compare two hash set
  
     HashSet<String>another = new HashSet<>();
	 another.add("Jackfruit");
	 another.add("waltermelon");
	 another.add("plums");
	 
	 boolean isEqual = set.equals(another);
	 System.out.println("Two sets are equal ? " + isEqual);
	 System.out.println();
	}
}

/*a) Append hashset :
After add : [apple, jackfruit, green apple]
b) Iterate all element :
apple
jackfruit
green apple

c) Get number of elements :
Size of set : 3

d) Empty set :
After empty set :[]

e) Hashset empty or not true

Clone to another set :
After cloned set  : [banana, kiwi, plums]

convert to array:
Values are :banana
Values are :kiwi
Values are :plums

Convert to hashset to tree set (tree set is sorted) :
[banana, kiwi, plums]

convert hashset arraylist : [banana, kiwi, plums]

Two sets are equal ? false*/


/*4. Write a Java program to,
 a. create a new tree set, add some colors (string) and print out the tree set. 
b. iterate through all elements in a tree set. 
c. add all the elements of a specified tree set to another tree set. 
d. create a reverse order view of the elements contained in a given tree set. 
e. get the first and last elements in a tree set. 
f. clone a tree set list to another tree set. 
g. get the number of elements in a tree set. 
h. compare two tree sets. 
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set. 
j. get the element in a tree set which is greater than or equal to the given element. 
k. get the element in a tree set which is less than or equal to the given element. 
l. get the element in a tree set which is strictly greater than or equal to the given element. 
m. get an element in a tree set which is strictly less than the given element. 
n. retrieve and remove the first element of a tree set. 
o. retrieve and remove the last element of a tree set. 
p. remove a given element from a tree set.*/



class TreeSetProgram{
	public static void main(String[] args)
	{
		TreeSet<String> colors = new TreeSet<>();
//a. create a new tree set, add some colors (string) and print out the tree set. 		
		System.out.println("Add some colors in the tree set : " );
		colors.add("pink");
		colors.add("green");
		colors.add("black");
		colors.add("blue");
		colors.add("gray");
		colors.add("yellow");
		System.out.println("After adding colors in set : " + colors);
		System.out.println();
//b. iterate through all elements in a tree set. 
       System.out.println("Iterate all elements : ");
	   for(String c : colors)
	   {
		   System.out.println(c);
	   }
	   System.out.println();
//c. add all the elements of a specified tree set to another tree set. 	   
      System.out.println("Add all elements another set : ");
	  TreeSet<String>anothertree = new TreeSet<>(colors);
	  System.out.println("Another tree set elements : " + anothertree);
	  System.out.println();
	  
//d. create a reverse order view of the elements contained in a given tree set. 
      System.out.println(" Reverse order view set : ");
	  System.out.println(colors.descendingSet());
	  
    System.out.println();
	  
	  
//e. get the first and last elements in a tree set.
	 System.out.println("Get first and last set : ");
	 String First= colors.first();
	 String Last = colors.last();
	 System.out.println("Lowest element : " + First);
	 System.out.println("Highest element: " + Last);
	 System.out.println();

//f. clone a tree set list to another tree set. 
     System.out.println("Clone a tree set : ");
     TreeSet<String>treeclone = new TreeSet<>(colors);
    System.out.println("After clone set : " + treeclone);
	System.out.println();
	
//g. get the number of elements in a tree set. 
     System.out.println("Get number tree set ; " );
     System.out.println(colors.size());
	 System.out.println();
	 
//h. compare two tree sets. 
     System.out.println("compare two set : ");
     TreeSet<String>anotree = new TreeSet<>();
	 anotree.add("pink");
	 anotree.add("green");
	 anotree.add("blue");
	 anotree.add("black");
	 boolean isEqual = colors.equals(anotree);
	 System.out.println("Two strings are equal or not ? : " + isEqual);
	System.out.println();
//i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set. 	
     System.out.println("Find the numbers less than 7 : " );
	 TreeSet<Integer>num = new TreeSet<>();
	 num.add(3);
	 num.add(1);
	 num.add(4);
	 num.add(9);
	 TreeSet<Integer>lessthansevan = new TreeSet<>(num.headSet(7));
	 System.out.println(lessthansevan);
	 System.out.println();
	

//j. get the element in a tree set which is greater than or equal to the given element. 
    System.out.println(" Least element : " + num.ceiling(6));
	System.out.println();
	
    	 
//k. get the element in a tree set which is less than or equal to the given element
    
	System.out.println(" Greater element : " + num.floor(6));
	
	/* 
	int i =0;
	int val = 7;
	for(int num : number)
	{
		if(num <= val)
		{
			i = num;
			break;
		}
	}*/
	System.out.println();
	
//l. get the element in a tree set which is strictly greater than or equal to the given element. 
	 /*int value = 4;
	 int j =0;
	 for(int n : numb)
	 {
		 if(n > value)
		 {
			 j = n;
			 break;
		 }
	 }*/
	 
	 System.out.println(" Strictly greater than or equal value : " + num.higher(4));
	 System.out.println();
	 
//m. get an element in a tree set which is strictly less than the given element. 
    System.out.println(" Strictly less than : " + num.lower(4));
       System.out.println();
	
//n. retrieve and remove the first element of a tree set. 
    System.out.println(" Retrieve and remove the first element : " + num.pollFirst());
	System.out.println("After remove : " + num);
	System.out.println();
	
	/* 
	int first =0;
	Iterator<Integer>FirstIt =  num.iterator();
	if(FirstIt.hasNext()){
		first = FirstSt.next();
		FirstIt.remove();
	}
	System.out.println("First element : " + first);
	System.out.println("After removing + num);*/
	
	
//o. retrieve and remove the last element of a tree set.
   System.out.println("Retrive and remove the last element : " + num.pollLast());
   System.out.println("After remove : " + num);
   System.out.println();
  
//p. remove a given element from a tree set.
    /*int k =  4;
    Iterator<Integer>rem = num.iterator();
    while(rem.hasNext())
	{
		if(rem.next().equals(rem)){
			rem.remove();
			break;
		}
	}*/
	boolean removed =  num.remove(4);
	System.out.println("Removed number 4: " + removed);
	System.out.println("Removed element : " + num);
	}
}
	
		
/*Add some colors in the tree set :
After adding colors in set : [black, blue, gray, green, pink, yellow]

Iterate all elements :
black
blue
gray
green
pink
yellow

Add all elements another set :
Another tree set elements : [black, blue, gray, green, pink, yellow]

 Reverse order view set :
[yellow, pink, green, gray, blue, black]
Get first and last set :
Lowest element : black
Highest element: yellow

Clone a tree set :
After clone set : [black, blue, gray, green, pink, yellow]

Get number tree set ;
6

compare two set :
Two strings are equal or not ? : false

Find the numbers less than 7 :
[1, 3, 4]

 Least element : 9

 Greater element : 4

 Strictly greater than or equal value : 9

 Strictly less than : 3

 Retrieve and remove the first element : 1
After remove : [3, 4, 9]

Retrive and remove the last element : 9
After remove : [3, 4]

Removed number 4: true
Removed element : [3] */

/*5. Write a Java program to,
 1. create a new priority queue, add some colors (string) and print out the elements of the priority queue. 
2. iterate through all elements in the priority queue. 
3. add all the elements of a priority queue to another priority queue.
 4. insert a given element into a priority queue. 
5. remove all the elements from a priority queue. 
6. count the number of elements in a priority queue. 
7. compare two priority queues. 
8. retrieve the first element of the priority queue. 
9. retrieve and remove the first element. 
10. convert a priority queue to an array containing all of the elements of the queue.	 */

//1. create a new priority queue, add some colors (string) and print out the elements of the priority queue. 

class PriorityQueueProgram{
	public static void main(String[] args)
	{
		
	 PriorityQueue<String>colorsQueue = new PriorityQueue<>();
	 colorsQueue.add("pink");
	 colorsQueue.add("yellow");
	 colorsQueue.add("blue");
	 colorsQueue.add("purple"); 
	 System.out.println("1. After add all queue element : " + colorsQueue);
	 
//2. iterate through all elements in the priority queue. 
    System.out.println("2. Iterate all element: " );
	for(String st : colorsQueue)
	{
		System.out.println(st);
	}
//3. add all the elements of a priority queue to another priority queue.
   PriorityQueue<String>anotherqu = new PriorityQueue<>(colorsQueue);
   anotherqu.add("White");
   anotherqu.addAll(colorsQueue);
   System.out.println("3 .Add all element anotherqueue : " + anotherqu);

// 4. insert a given element into a priority queue
     
    colorsQueue.add("Baby pink");
	System.out.println("4. After insert element : " + colorsQueue);
	
//5. remove all the elements from a priority queue. 
    PriorityQueue<String> tempQue= new PriorityQueue<>(colorsQueue);
    tempQue.clear();
    System.out.println("5. Remove all element : " +  tempQue);
   
//6. count the number of elements in a priority queue. 
    System.out.println("6. Count the number :" +  colorsQueue.size());

//7. compare two priority queues. 
     System.out.println("7.Comparaing colors :");
	 for(String ch : colorsQueue)
	 {
		 System.out.println(ch + " Compare colors : " +  anotherqu.contains(ch));
	 }
	 
 //8. retrieve the first element of the priority queue.
    System.out.println("8. Retrieve the first element : " +  colorsQueue.peek());
	
//9. retrieve and remove the first element. 	 
	    System.out.println("9. Retrieve the first remove element : " +  colorsQueue.poll());
		System.out.println("After remove : " +  colorsQueue);
		
//10. convert a priority queue to an array containing all of the elements of the queue.
      String[] colorArrayQu =  colorsQueue.toArray(new String[0]);
	   System.out.println("10 . Array Element : " );
	  for(String stt : colorArrayQu)
	 {
		System.out.println(stt);
	 }
	}
}

	
/*
1. After add all queue element : [blue, purple, pink, yellow]
2. Iterate all element:
blue
purple
pink
yellow
3 .Add all element anotherqueue : [White, blue, blue, pink, purple, pink, purple, yellow, yellow]
4. After insert element : [Baby pink, blue, pink, yellow, purple]
5. Remove all element : []
6. Count the number :5
7.Comparaing colors :
Baby pink Compare colors : false
blue Compare colors : true
pink Compare colors : true
yellow Compare colors : true
purple Compare colors : true
8. Retrieve the first element : Baby pink
9. Retrieve the first remove element : Baby pink
After remove : [blue, purple, pink, yellow]
10 . Array Element :
blue
purple
pink
yellow
*/

/* 6. Write a Java program to,
 1. associate the specified value with the specified key in a Tree Map. 
2. copy a Tree Map content to another Tree Map. 
3. search a key in a Tree Map. 
4. search a value in a Tree Map. 
5. get all keys from the given a Tree Map. 
6. delete all elements from a given Tree Map. 
7. sort keys in Tree Map by using comparator. 
8. get a key-value mapping associated with the greatest key and the least key in a map. 
9. get the first (lowest) key and the last (highest) key currently in a map. 
10. get a reverse order view of the keys contained in a given map.*/

//1. associate the specified value with the specified key in a Tree Map. 	 
	 
	class TreeMapProgram{
		public static void main(String[] args)
		{
			TreeMap<Integer,String>map = new TreeMap<>();
// 1. associate the specified value with the specified key in a Tree Map. 
			map.put(1,"kitkat");
			map.put(2,"oreo");
			map.put(3,"dairy");
			map.put(4,"milkybar");
			System.out.println("1. Associate the value with key : " +map);
			
//2. copy a Tree Map content to another Tree Map.
           TreeMap<Integer,String>map2 = new TreeMap<>();
		   map2.putAll(map);
		   System.out.println("3. Copy map : " + map2);
		   
//3. search a key in a Tree Map. 
          int searchKey = 4;
		  System.out.println("4. Search key : "+ searchKey + "inside map " + map.containsKey(searchKey));
		  
//4. search a value in a Tree Map. 
        String searchValue = "dairy";
        System.out.println("5. Search value : " + searchValue + "inside map "  + map.containsValue(searchValue));
//5. get all keys from the given a Tree Map. 
      
       System.out.println("6. Get all keys : " +  map.keySet());

//6. delete all elements from a given Tree Map.
	   
	    TreeMap<Integer,String>tempMap = new TreeMap<>(map);
	    tempMap.clear();
	    System.out.println("6. Delete all element : " +  tempMap);
	  
//7. sort keys in Tree Map by using comparator. 
       TreeMap<Integer,String>sortMap= new TreeMap<>(Collections.reverseOrder());//(des)
	   sortMap.putAll(map);
	   System.out.println("7. sorted map : " + sortMap);
	  
//8. get a key-value mapping associated with the greatest key and the least key in a map
     
	  System.out.println("Greatest key :"  + map.lastEntry());
	  System.out.println("Least key : " + map.firstEntry());
	 
//9. get the first (lowest) key and the last (highest) key currently in a map. 
     
	  System.out.println("lowest key : " +  map.firstKey());
	  System.out.println("Highest key: " +  map.lastKey());

//10. get a reverse order view of the keys contained in a given map
      System.out.println("Reverse order  : " +  map.descendingKeySet());
		}
	}
	
	 
/*
1. Associate the value with key : {1=kitkat, 2=oreo, 3=dairy, 4=milkybar}
3. Copy map : {1=kitkat, 2=oreo, 3=dairy, 4=milkybar}
4. Search key : 4inside map true
5. Search value : dairyinside map true
6. Get all keys : [1, 2, 3, 4]
6. Delete all element : {}
7. sorted map : {4=milkybar, 3=dairy, 2=oreo, 1=kitkat}
Greatest key :4=milkybar
Least key : 1=kitkat
lowest key : 1
Highest key: 4
Reverse order  : [4, 3, 2, 1]*/

	 
/*7. Write a Java program to,
 1. associate the specified value with the specified key in a HashMap. 
2. count the number of key-value (size) mappings in a map. 
3. copy all of the mappings from the specified map to another map. 
4. remove all of the mappings from a map. 
5. check whether a map contains key-value mappings (empty) or not. 
6. get a shallow copy of a HashMap instance. 
7. test if a map contains a mapping for the specified key. 
8. test if a map contains a mapping for the specified value. 
9. create a set view of the mappings contained in a map. 
10. get the value of a specified key in a map. */

class HashMapProgram{
    public static void main(String[] args)
	{	
	  
//1. associate the specified value with the specified key in a HashMap
     
	 HashMap<Integer,String>hash = new HashMap<>();
	 hash.put(1,"banana");
	 hash.put(2,"apple");
	 hash.put(3,"orange");
	 hash.put(4,"grapes");
	 hash.put(5,"plums");
	 System.out.println("1. Associate values and keys: "  + hash);
	 
//2. count the number of key-value (size) mappings in a map. 
     
      System.out.println("2. Count the number of keys : "+ hash.size());
	
//3. copy all of the mappings from the specified map to another map. 
     HashMap<Integer,String> copyhash2 = new HashMap<>(hash);
     System.out.println("3. copy all elements : " +  copyhash2);

//4. remove all of the mappings from a map. 

     copyhash2.clear();
	 System.out.println("Remove all elements : " + hash);

//5. check whether a map contains key-value mappings (empty) or not.
      System.out.println("map contains key-value empty or not ? " + hash.isEmpty());

//6. get a shallow copy of a HashMap instance. 
     HashMap<Integer, String> shallowcopymap = new HashMap<>(hash);
     
	 System.out.println("Shallow copy : " + shallowcopymap);
	 
 //7. test if a map contains a mapping for the specified key. 
     System.out.println("7. contains key : " + hash.containsKey(3));
	
	/*if(map.containsKey(3)){
	     System.out.println(" it's find");
	}else{
	    System.out.println(" key not found");
	}*/
	 
//8 test if a map contains a mapping for the specified value.

	 System.out.println("8. contains value : " + hash.containsValue("plums"));
	 
//9. create a set view of the mappings contained in a map. 
  
	    HashSet<Map.Entry<Integer, String>> entrySet = new HashSet<>(hash.entrySet());
        
		System.out.println("Entry set copy: " + entrySet);
	   
//10. get the value of a specified key in a map.
       System.out.println("Get the value of a key : " +  hash.get(3));
	}
}
	 
/*1. Associate values and keys: {1=banana, 2=apple, 3=orange, 4=grapes, 5=plums}
2. Count the number of keys : 5
3. copy all elements : {1=banana, 2=apple, 3=orange, 4=grapes, 5=plums}
Remove all elements : {1=banana, 2=apple, 3=orange, 4=grapes, 5=plums}
map contains key-value empty or not ? false
Shallow copy : {1=banana, 2=apple, 3=orange, 4=grapes, 5=plums}
7. contains key : true
8. contains value : true
Entry set copy: [1=banana, 2=apple, 3=orange, 5=plums, 4=grapes]
Get the value of a key : orange*/


/*8. Develop a Java program to manage a list of bank accounts using ArrayList.--->Create an Account class with the following attributes:
 a. accountNumber (int)
 b. holderName (String)
 c. balance (double)--->Use auto-boxing to store the balance and interest as Double wrapper objects.--->Use manual boxing to convert a
 primitive interest rate into a Double object.--->Unbox the values (both automatic and manual) to calculate and update the new balance.--->
 Add at least three Account objects to an ArrayList<Account>.--->For each account:
 a. Display the holder name, account number, original balance
 b. Apply 5% interest
 c. Show the new balance using primitive values (unboxed)*/	 
	 
	 
class Account{
	int accountNumber;
	String holderName;
	double balance; 
	
	Account(int accountNumber,String holderName,double balance)
	{
		this.accountNumber = accountNumber; //auto box 
		this.holderName=holderName;
		this.balance = balance;
	}
}
class AccountProgram{
	public static void main(String[] args)
	{
		ArrayList<Account> acc = new ArrayList<>();
		
		//auto boxing
	    Account ac1 = new Account(2090,"sindhu",3000.00);
		Account ac2 = new Account(2091,"Karthik",70000.00);
		Account ac3 = new Account(2092,"kumar",30000.00);
		
		acc.add(ac1);
		acc.add(ac2);
		acc.add(ac3);
		
		double interestRate = 0.05;//manul box
		Double interObj = Double.valueOf(interestRate);
		
		for(Account account : acc)
		{
			System.out.println(account.holderName + " accountNumber" + account.accountNumber);
			System.out.println("Original balance : " + account.balance);
			
			//Unboxing primivitive
		    double newBa = account.balance + (account.balance * interObj);
			account.balance = newBa;
			System.out.println("new Balance : "  + account.balance);
		}
	}
}

/*sindhu accountNumber2090
Original balance : 3000.0
new Balance : 3150.0
Karthik accountNumber2091
Original balance : 70000.0
new Balance : 73500.0
kumar accountNumber2092
Original balance : 30000.0
new Balance : 31500.0*/


			
		
		
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
        

	




		
		
		
		 
		 
