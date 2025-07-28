
 /*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/

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
	
	
