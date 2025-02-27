package DAO_DTO.BookManagementSystem;

public class BookMain {
public static void main(String args[])
{
	Book_DAO bookDAO=new BookDAO_Implementation();
	
	//Adding Books
	Book_DTO book1 = new Book_DTO(101, "Wings of Fire", "Dr. A.P.J. Abdul Kalam");
	Book_DTO book2 = new Book_DTO(102, "The Alchemist", "Paulo Coelho");
	Book_DTO book3 = new Book_DTO(103, "Rich Dad Poor Dad", "Robert Kiyosaki");
	Book_DTO book4 = new Book_DTO(104, "The Monk Who Sold His Ferrari", "Robin Sharma");
	Book_DTO book5 = new Book_DTO(105, "You Can Win", "Shiv Khera");
   
	
	bookDAO.addBook(book1);
	bookDAO.addBook(book2);
	bookDAO.addBook(book3);
	bookDAO.addBook(book4);
	bookDAO.addBook(book5);
	
	
	//Displaying Books List
	System.out.println("Displaying Books List");
	bookDAO.displayBooks();
	
	//Remove Book From Books List
	System.out.println("Remove Book From Books List");
	bookDAO.removeBook(104);
	
	// Displaying Books List After Removing Book
	System.out.println("Displaying Books List After Removing a Book :");
	bookDAO.displayBooks();
	
	
}
}
