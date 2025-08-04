/* Day-4 Assignment Questions:
 1. We want to store the information about different vehicles. Create a class named Vehicle with two data members 
named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity, and fuel type (diesel or 
gasoline).---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel 
type(alloys or spokes) and fuel tank size(in inches)
 Make another two subclasses, Audi and Ford of Car, each having a data member to store the model type. 
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
 Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating 
capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
 2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class 
called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a 
method to find the distance of two threeD Points.
 sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
 In main:
 Create one ThreeD object using the default constructor.
 Use the setters to set x, y, and z.
 Create the second ThreeD object using the constructor with three arguments.
 in the TwoD class:
 Add a print statement to the TwoD default constructor with a message "TwoD default constructor"
 Add a print statement to other TwoD constructor with a message "TwoD constructor with two arguments"
 3. A class Point is declared as follows:
 class Point{
 public:
 Point(){int=0;int=0;} //default constructor
 void setPoint(int,int); //set coordinates
 final int getX(){return x;} //get x coordinates
 final int getY() return y;} //get y coordinates
 void printPoint(); // print (x,y) coordinates
 private int x;
 private int y;
 };
 Write the implementation of the class Point in the same file. Then, declare a class called Circle that is derived from the 
class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and 
one private data member radius. The class Circle indirectly uses the private members x and y of class Point to store the 
coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number; 
otherwise, it is set to the default value 1.
 Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class 
point. Implement the class Circle and write a driver program to test the class Circle. An example of the output of the 
driver program is.
 Enter x: 2
 Enter y: 2
 Enter radius: 1
 Circle center is (2,2)
 Radius is 1
 Area is 3.14
 4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.
 5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon 
inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named 
Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" 
respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
 Now, try calling the method by the object of each of these classes.
6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables 
and object containment.
 Create two classes:---Store---Product
 Requirements:
 The Store class should have:
 a. storeName and storeLocation as static variables since they are common to all products in the store.
 b. A static method setStoreDetails(String name, String location) to initialize the static variables.
 c. A static method displayStoreDetails() to print store details.
 d. A list to maintain multiple Product objects (i.e., the store contains many products).
 e. A method addProduct(Product product) to add products to the store.
 f. A method displayAllProducts() to display details of all products.
 The Product class should have:
 a. Product ID, name, price, and quantity as instance variables.
 b. A constructor to initialize these fields.
 c. A method displayProduct() to show product details.
 Task: Implement the above classes and demonstrate their use in the main() method by:
 a. Setting store details once.
 b. Creating multiple product objects.
 c. Adding them to the store.
 d. Displaying store and product information.
 Also Check how many .class files are generated.
 7. Design a calculator application using Java Inheritance. Create the following class hierarchy:--->BasicCalculator (Base class):
 Implement all the basic arithmetic methods, such as:--->add(int a, int b)--->subtract(int a, int b)--->multiply(int a, int b)--->divide(int a, int b)--->AdvancedCalculator (Inherits from BasicCalculator)
 Add 3 to 4 advanced mathematical operations, such as:--->power(int base, int exponent)--->modulus(int a, int b)--->squareRoot(double number)--->ScientificCalculator (Inherits from AdvancedCalculator)
 Add scientific functions, such as:--->sin(double angle)--->cos(double angle)--->log(double value)--->exp(double value)
 * Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three 
levels of the class hierarchy.
 * Use appropriate access specifiers and method overrides where required.
 * Add a main() method to test all operations*/


class Vehicles{
	double mileage;
	double price;
	
	public Vehicles(double mileage , double price)
	{
		this.mileage = mileage;
		this.price = price;
	}
}
	
	class Car extends Vehicles{
		double cost;
		int warranty;
		int seatCapacity;
		String fuelType;
		
		public Car(double mileage , double price , double cost , int warranty,int seatCapacity,String fuelType)
		{
			super (mileage,price);
			this.cost = cost;
			this.warranty=warranty;
			this.seatCapacity=seatCapacity;
			this.fuelType=fuelType;
		}
	}
	
	class Bike extends Vehicles{
		int cylinders;
		int gears;
		String coolingType;
		String wheelType;
		double tankSize;
		
		public Bike(double mileage,double price,int cylinders,int gears,String coolingType,String wheelType,double tankSize)
	
		{
			super(mileage,price);
			this.cylinders=cylinders;
			this.gears=gears;
			this.coolingType = coolingType;
			this.wheelType=wheelType;
			this.tankSize=tankSize;
		}
	}
	
	class Audi extends Car{
		String modelType;
		
		public Audi(String modelType,double mileage,double price,double cost,int warranty,int seatCapacity,String fuelType)
		{
			super(mileage,price,cost,warranty,seatCapacity,fuelType);
			this.modelType=modelType;
		}
	}
	
	 class Ford extends Car{
		 String modelType;
		 
		 public Ford(String modelType,double mileage,double price,double cost,int warranty,int seatCapacity,String fuelType)
		 {
			 super(mileage,price,cost,warranty,seatCapacity,fuelType);
			 this.modelType = modelType;
		 }
	 }
	 
	 
	 class Bajaj extends Bike{
		 String modelType;
		 
		 public Bajaj(String modelType,double mileage,double price,int cylinders,int gears, String coolingType,String wheelType,double tankSize)
		 {
			 super(mileage,price,cylinders,gears,coolingType,wheelType,tankSize);
			 this.modelType=modelType;
		 }
	 }
	 class Tvs extends Bike{
		 String modelType;
		 
		  public Tvs(String modelType,double mileage,double price,int cylinders,int gears,String coolingType,String wheelType,double tankSize)
		 {
			 super(mileage,price,cylinders,gears,coolingType,wheelType,tankSize);
			 this.modelType=modelType;
		 }
	 }
	 

	 class CarBike{
		 public static void main(String[] args)
		 {
			  
			 Audi A = new Audi("aaa",50,10000.00,200000.00,2,4,"diesel");
			 			 
			 Ford F = new Ford("bbb",30, 200000.00, 300000.00, 3, 4, "diesel");
			 
			 Bajaj B = new Bajaj("ccc", 100.00, 20000.00, 2, 2, "Air", "tubular", 2.00);
					 
		     Tvs T = new Tvs("ddd", 100.00, 20000.00, 2, 2, "Air", "tubeless", 2.00);
			 
			 System.out.println("Audi Car details : ");
			 System.out.println("Audi car Modeltype : "+ A. modelType);
			 System.out.println("Audi car cost : " + A. cost);
			 System.out.println("Audi car warranty : " +A. warranty);
			 System.out.println("Audi car seatCapacity: " +A. seatCapacity);
             System.out.println("Audi car fuelType : " +A.fuelType);
             System.out.println("Audi car mileage : " +A.mileage);
             System.out.println("Audi Car Price : " + A.price);

             System.out.println("------------------------------------------------");	

			 
			 System.out.println("Ford Car details : ");
			 System.out.println("Ford car Modeltype : "+ F. modelType);
			 System.out.println("Ford car cost : " + F. cost);
			 System.out.println("Ford car warranty : " +F. warranty);
			 System.out.println("Ford car seatCapacity: " +F. seatCapacity);
             System.out.println("Ford car fuelType : " +F.fuelType);
             System.out.println("Ford car mileage : " +F.mileage);
             System.out.println("Ford Car Price : " + F.price);
			 
			 
			 System.out.println("------------------------------------------------");	
			 
			 System.out.println("Bajaj Bike details " );
			 System.out.println("Bajaj Bike ModelType : "  + B.modelType);
			 System.out.println("Bajaj Bike Cyilnders " + B.cylinders);
			 System.out.println("Bajaj Bike gears : "  + B.gears);
			 System.out.println("Bajaj Bike Cooling type " + B.coolingType); 
			 System.out.println("Bajaj Bike wheeltype : "  + B.wheelType);
			 System.out.println("Bajaj Bike tankSize" + B.tankSize);
			 System.out.println("Bajaj Bike Mileage : "  + B.mileage);
			 System.out.println("Bajaj Bike price " + B.price);
			 
			 System.out.println("------------------------------------------------");	
			

			 System.out.println("TVS Bike details " );
			 System.out.println("TVS Bike ModelType : "  + T.modelType);
			 System.out.println("TVS Bike Cyilnders " + T.cylinders);
			 System.out.println("TVS Bike gears : "  + T.gears);
			 System.out.println("TVS Bike Cooling type " + T.coolingType); 
			 System.out.println("TVS Bike wheeltype : "  + T.wheelType);
			 System.out.println("TVS Bike tankSize" + T.tankSize);
			 System.out.println("TVS Bike Mileage : "  + T.mileage);
			 System.out.println("TVS Bike price " + T.price);
		 }
	 }
	 
			 
/*2. Construct a base class called twoD contains x and y and methods
 to read and write the x and y. Create another class called threeD 
 which is derived from twoD and also contains z and write methods to read and write z. 
 Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/

class TwoD{
	public int x,y; //base
	
	public TwoD(){
		System.out.println("Default constructor");
		this.x =0;
		this. y=0;
	}


	public TwoD(int x ,int y){
		this.x =x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public void write() {
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

}


class ThreeD extends TwoD{
	
	private int z;
	
	public ThreeD(){
		super(); //default
	    this. z=0;
	}
	
	public ThreeD(int x,int y,int z)
	{
		super(x,y);
		this.z =z;
	}
	
	public int getz(){
		return z;
	}
	public void setZ(int z)
	{
		this.z=z;
	}
	
	public void write(){
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println("Z : " + z);
	}
	
	void calculateValues(ThreeD X1, ThreeD X2)
	{
		System.out.println("find the distance of two threeD Point : " + (Math.pow((X2.x - X1.x ),2) + Math.pow((X2.y - X1.y),2) + Math.pow((X2.z - X1.z),2)));
	        
	}
}

class TwoThree{
	public static void main(String[] args)
	{
		TwoD t = new TwoD();
		t.write(); //default 
		ThreeD th = new ThreeD();
		th.write();
		
		ThreeD th1 = new ThreeD(3,4,1); // x,y,z values ar passed 
		th1.write();
		ThreeD th2 = new ThreeD();
		th2.setX(3);
		th2.setY(6);
		th2.setZ(8);
		th2.write();
		
		th1.calculateValues(th1,th2);
	}
	
}
		
		
 

/*3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), 
setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store 
the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14*/

class Point{
	private int x;
	private int y;
	
	public Point(){
		this.x=0;
		this.y=0;
		
    }
	public void setPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	void printPoint(){
		System.out.println("X = " + x + " Y  =" + y);
	}
}

class Circle extends Point{
	private double radius;
	
	public Circle(){
		super();
		this.radius=1;
	}
	public void setRadius(double radius)
	{
		this.radius = (radius >0) ? radius : 1;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){ 
		return 3.14 * radius * radius;
	}
	
	public void displayCircle(){
		System.out.println("circle information");
		System.out.println("Center " );
		printPoint();
		System.out.println("Radius value : " + radius);
		System.out.println("Area : " + getArea());
	}
}

class CircleRadius{
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		int x =3;
		int y = 4;
		int r = 1;
		
		circle.setPoint(x,y);
		circle.setRadius(r);
		circle.displayCircle();
	}
}
	
//4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class Animal{
	void sound(){
		System.out.println("Animal makes sounds");
	}
}
class Pet{
	void sound()
	{
		System.out.println("Pet makes sounds");
	}
}

class Cat extends Animal,Pet{
	void print(){
		sound();
	}
}
class Multiple{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		c.print();
		//System.out.println(" java is does not support any multiple inheritance ");
		}
}


/*5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting 
the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method 
which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same 
method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/


class Shape{
	public void printSt(){
		System.out.println("This is shape");
	}
}
	class Polygon extends Shape{
		public void printSt()
		{
			//super.printSt();
			System.out.println("Polygon is Shape");
		}
	}
	
	class Rectangle extends Polygon{
		public void printSt()
		{
			//super.printSt();
			System.out.println("Rectangle is Polygon");
		}
	}
	
	class Triangle extends Polygon{
		public void printSt()
		{
			//super.printSt();
			System.out.println("Triangle is a Polygon");
		}
	}
	
	class Square extends Rectangle{
		public void printSt()
		{
			//super.printSt();
			System.out.println("Square is a Rectangle");
		}
	}
	
class ShapesDetails{
		public static void main(String[] args)
		{
		   Shape s = new Shape();
		   s.printSt();
		   Polygon p = new Polygon();
		   p.printSt();
		   Rectangle r = new Rectangle();
		   r.printSt();
		   Triangle t= new Triangle ();
		   t.printSt();
		   Square S = new Square();
		   S.printSt();
		   
		}
	}

/*6. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.*/




/*7. Design a calculator application using Java Inheritance. Create the following class hierarchy:--->BasicCalculator (Base class):
 Implement all the basic arithmetic methods, such as:--->add(int a, int b)--->subtract(int a, int b)--->multiply(int a, int b)--->divide(int a, int b)--->AdvancedCalculator (Inherits from BasicCalculator)
 Add 3 to 4 advanced mathematical operations, such as:--->power(int base, int exponent)--->modulus(int a, int b)--->squareRoot(double number)--->ScientificCalculator (Inherits from AdvancedCalculator)
 Add scientific functions, such as:--->sin(double angle)--->cos(double angle)--->log(double value)--->exp(double value)
 * Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three 
levels of the class hierarchy.
 * Use appropriate access specifiers and method overrides where required.
 * Add a main() method to test all operations.*/
 
 
import java.util.ArrayList;
 
 class Store{
	 private static String storeName;
	 private static String storeLocation;
	 
	 static ArrayList<Product> list = new ArrayList<>();
	 
	 static void StoreDetails(String name , String location)
	 {
		 storeName = name;
		 storeLocation=location;
	
		 
	 }
	 
	 static void displayDetails(){
		 System.out.println("Store Name : " + storeName);
		 System.out.println("Store Location : " + storeLocation);
	 }
	 
	 void addProduct (Product product)
	 {
		 list.add(product);
	 }
	 
	 static void displayProduct()
	 {
		 displayDetails();
		 System.out.println("Product Details " );
		 for(Product pro : list)
		 {
			 pro.display();
			 System.out.println();
		 }
	 }
 }
 
 class Product{
	 private int productId;
	 private String productName;
	 private Double productPrice;
	 private int productQuantity;
	 
	 public Product(int productId,String productName,Double productPrice,int productQuantity)
	 {
		 this.productId = productId;
		 this.productName=productName;
		 this.productPrice=productPrice;
		 this.productQuantity=productQuantity;
	 }
	 
	 public void display(){
		 System.out.println("Product ID : " + productId);
		 System.out.println("Product Name : " + productName);
		 System.out.println("Product price : " + productPrice);
		 System.out.println("Product Quantity " + productQuantity);
	 }
 }
 
 class StoreProduct{
	 public static void main(String[] args)
	 {
	 Store st = new Store();
	 
	 Product pro1 = new Product(1,"Crystal salt",100.00,1000);
	 Product pro2 = new Product(2,"baking powder",50.00,1000);
	 Product pro3 = new Product(3,"Sugar",100.00,1000);
 
     st.StoreDetails("Anitha SuperMarket " , "Tirunelveli");
	 
	 st.addProduct(pro1);
	 st.addProduct(pro2);
	 st.addProduct(pro3);
	 
	 st.displayProduct();
	 }
 }
 
 /* 7. Design a calculator application using Java Inheritance. Create the following class hierarchy:--->BasicCalculator (Base class):
 Implement all the basic arithmetic methods, such as:--->add(int a, int b)--->subtract(int a, int b)--->multiply(int a, int b)--->divide(int a, int b)--->
 AdvancedCalculator (Inherits from BasicCalculator)
 Add 3 to 4 advanced mathematical operations, such as:--->power(int base, int exponent)--->modulus(int a, int b)--->squareRoot(double number)--->ScientificCalculator
 (Inherits from AdvancedCalculator)
 Add scientific functions, such as:--->sin(double angle)--->cos(double angle)--->log(double value)--->exp(double value)
 * Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three 
levels of the class hierarchy.
 * Use appropriate access specifiers and method overrides where required.
 * Add a main() method to test all operations*/
 

class BasicCalculator{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return (double)a/b;
	}
	
}

class AdvancedCalculator extends BasicCalculator{
	public double pow(int base,int exponent)
	{
		return Math.pow(base,exponent);
	}
	public int modulus(int a,int b)
	{
		return a % b;
	}
	public double squareRoot(double number)
	{
		rerturn Math.sqrt(number);
	}

class ScientificCalculator extends BasicCalculator{
	



			
		
		


