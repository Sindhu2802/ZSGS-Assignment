import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.util.*;


/*Day-11 Assignment Questions:
 1. Write a Java program to read the contents of a text file and display it on the console.
 2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file 
to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it 
appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
3. Write a Java program that reads a file and prints the number of lines, words, and characters.
 4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.
 5. Design a Java application to manage a product inventory system using file handling and object serialization.
 Create a class Product with the following attributes:--->int productId--->String name--->double price--->int quantity
 a. Ensure the class implements the Serializable interface.
 b. Methods: --->Add a Product: Accept product details from the user and write the object to a file (products.dat).--->View All Products: Read all product objects from the file and display them.--->Search Product by ID: Search for a product by productId in the file and display its details if found.--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to 
the file.--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and 
efficiently.*/


// 1. Write a Java program to read the contents of a text file and display it on the console.

  class ReadFile{
	 public static void main(String[] args)
	 {
		 
		 File file = new File("C:/Users/SV/Desktop/java/From.txt");
		 try{
			 FileReader fr = new FileReader(file);
			 BufferedReader br = new BufferedReader(fr);
			 
			 String line = "";
			 
			 while((line = br.readLine()) != null)
			 {
				 System.out.println(line);
			 }
			 br.close();
			 fr.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 System.out.println("The file reader successfully " );
	 }
 }
 
///The file reader successfully


/*2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file 
to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it 
appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.*/


 class FileMenu {
    static Scanner sc = new Scanner(System.in);

    // a) Read from user and write into another file
    public static void writeUserToFile() {
        try {
            System.out.print("Enter destination file name: ");
            String destFile = sc.nextLine();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter content (type 'stop' on a new line to finish):");
            StringBuilder content = new StringBuilder();
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("stop")) {
                content.append(line).append("\n");
            }

            FileWriter fw = new FileWriter(destFile);
            fw.write(content.toString());
            fw.close();

            System.out.println("Content written successfully to " + destFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // b) Copy from file to another file
    static void copyFileToFile() {
        try {
            System.out.print("Enter source file name: ");
            String src = sc.nextLine();
            System.out.print("Enter destination file name: ");
            String dest = sc.nextLine();

            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // c) Modify file content
    static void modifyFile() {
        try {
            System.out.print("Enter file name to modify: ");
            String fileName = sc.nextLine();

            // Read existing content
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            br.close();

            // Take new content from user
            System.out.println("Enter new content to replace old content:");
            String newContent = sc.nextLine();

            // Write new content
            FileWriter fw = new FileWriter(fileName);
            fw.write(newContent);
            fw.close();

            System.out.println("File modified successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // d) Search for a word in a file
    static void searchWordInFile() {
        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            br.close();

            System.out.println("The word '" + word + "' appears " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // e) Read .txt file and copy to .csv file
    static void txtToCsv() {
        try {
            System.out.print("Enter source .txt file name: ");
            String txtFile = sc.nextLine();
            System.out.print("Enter destination .csv file name: ");
            String csvFile = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));

            String line;
            while ((line = br.readLine()) != null) {
                // Convert spaces to commas for CSV format
                String csvLine = line.replace(" ", ",");
                bw.write(csvLine);
                bw.newLine();
            }
            br.close();
            bw.close();

            System.out.println("Data copied from " + txtFile + " to " + csvFile + " successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== FILE MENU =====");
            System.out.println("1. Write from user to file");
            System.out.println("2. Copy from file to another file");
            System.out.println("3. Modify file content");
            System.out.println("4. Search word in file");
            System.out.println("5. Convert .txt to .csv");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: writeUserToFile(); break;
                case 2: copyFileToFile(); break;
                case 3: modifyFile(); break;
                case 4: searchWordInFile(); break;
                case 5: txtToCsv(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }
}

//3. Write a Java program that reads a file and prints the number of lines, words, and characters.

class FileCount{
	public static void main(String[] args)
	{
		
		File f = new File("C:/Users/SV/Desktop/food.txt");
	
		
		try{
			
			FileReader fr =new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			int lineCount =0;
		    int wordCount =0;
		   int charCount =0;
		
			String line="";
			while((line = br.readLine()) != null)
			{
				lineCount ++;
			String[]words = line.trim().split("\\s+");
			if(line.trim().length() != 0)
			{
				wordCount += words.length;
			}
			charCount += line.length();
			}
			System.out.println("FileName " + fr);
			System.out.println("Number of lines  : " + lineCount);
			System.out.println("Number of words : " + wordCount);
			System.out.println("Numbers of characters : " +  charCount);
		}
		catch(IOException e)
		{
			System.out.println("Exception error : " + e.getMessage());
		}
		
	}
}

/*FileName java.io.FileReader@77459877
Number of lines  : 1
Number of words : 5
Numbers of characters : 23
*/

			
			
//4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.
			
	class Append{
		public static void main(String[] args)
		{
			
			File F = new File("C:/Users/SV/Desktop/java/file2.txt");
			try{
				FileWriter F1 = new FileWriter(F,true);
				
			F1.write("\nJava is an object-oriented programming language.\n");
            F1.write("Java was created by Sun Microsystems and is a robust language.\n");
			
			F1.close();
			System.out.println("Text Appended successfully : " + F);
			}
			catch(IOException e)
			{
				System.out.println("Error : " + e.getMessage());
			}
		}
	}
	
/*5. Design a Java application to manage a product inventory system using file handling and object serialization.
 Create a class Product with the following attributes:--->int productId--->String name--->double price--->int quantity
 a. Ensure the class implements the Serializable interface.
 b. Methods: --->Add a Product: Accept product details from the user and write the object to a file (products.dat).--->View All Products: Read all product objects from the file and display them.--->Search Product by ID: Search for a product by productId in the file and display its details if found.--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to 
the file.--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and 
efficiently.*/



// Product class implements Serializable
 class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int productId;
    String name;
    double price;
    int quantity;
    
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String toString() {
        return "Product ID: " + productId + 
               ", Name: " + name + 
               ", Price: " + price + 
               ", Quantity: " + quantity;
    }
}

 class ProductInventory {
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "products.dat";
    
    // Method to load all products from file
    private static List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return products; // return empty list if file doesn't exist
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            products = (List<Product>) ois.readObject();
        } catch (EOFException e) {
            // Ignore: end of file reached
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return products;
    }
    
    // Method to save products to file
    private static void saveProducts(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
    
    // Add a product
    private static void addProduct() {
        List<Product> products = loadProducts();
        
        System.out.print("Enter Product ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());
        
        products.add(new Product(id, name, price, qty));
        saveProducts(products);
        
        System.out.println("Product added successfully!");
    }
    
    // View all products
    private static void viewAllProducts() {
        List<Product> products = loadProducts();
        if (products.isEmpty()) {
            System.out.println("No products found.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }
    
    // Search product by ID
    private static void searchProductById() {
        System.out.print("Enter Product ID to search: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Product> products = loadProducts();
        for (Product p : products) {
            if (p.productId == id) {
                System.out.println("Product Found: " + p);
                return;
            }
        }
        System.out.println("Product not found.");
    }
    
    // Update product
    private static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Product> products = loadProducts();
        boolean found = false;
        for (Product p : products) {
            if (p.productId == id) {
                found = true;
                System.out.print("Enter new price: ");
                p.price = Double.parseDouble(sc.nextLine());
                System.out.print("Enter new quantity: ");
                p.quantity = Integer.parseInt(sc.nextLine());
                break;
            }
        }
        if (found) {
            saveProducts(products);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }
    
    // Delete product
    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());
        List<Product> products = loadProducts();
        boolean removed = products.removeIf(p -> p.productId == id);
        if (removed) {
            saveProducts(products);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== PRODUCT INVENTORY MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1: addProduct(); break;
                case 2: viewAllProducts(); break;
                case 3: searchProductById(); break;
                case 4: updateProduct(); break;
                case 5: deleteProduct(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }
}
