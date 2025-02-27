package DAO_DTO.BookManagementSystem;

import java.util.*;

public class BookDAO_Implementation implements Book_DAO {
 
	List<Book_DTO> books=new ArrayList<Book_DTO>();
	
	public void addBook(Book_DTO book)
	{
		books.add(book);
		System.out.println("Book Added is "+book.getBookName());
	}
	
	public void removeBook(int BookId)
	{    
		 if (books.isEmpty()) {
		        System.out.println("No books to remove!");
		        return;
		    }
		 
		Book_DTO removeBook=null;
		for(Book_DTO book:books)
		{
			if(book.getBookId()==BookId)
			{
				removeBook=book;
				break;
			}
		}
		if(removeBook!=null)
		{
			books.remove(removeBook);
			System.out.println("Book Removed Successfully");
		}
		else
			System.out.println("Book Not FOund!");
	}
	
	
	public void displayBooks()
	{   
		
		if(books.isEmpty())
		{
			System.out.println("No Books Available!");
			return;
		}
		 System.out.println("-------------------------------------------------");
		    System.out.printf("%-10s %-30s %-20s\n", "Book ID", "Book Name", "Author Name");
		    System.out.println("-------------------------------------------------");
		    for (Book_DTO book : books) {
		        System.out.printf("%-10d %-30s %-20s\n", book.getBookId(), book.getBookName(), book.getAuthorName());
		    }
		    System.out.println("-------------------------------------------------");
	}
	
}

