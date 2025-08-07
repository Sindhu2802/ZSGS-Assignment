
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
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
		for(String i : colors)
		{
			System.out.println(i + " ");
		}
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
	  for(String fruit : list)
	  {
		  System.out.println(fruit);
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



      
		
		
        

	




		
		
		
		 
