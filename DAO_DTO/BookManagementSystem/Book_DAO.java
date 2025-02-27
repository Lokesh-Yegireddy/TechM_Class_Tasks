package DAO_DTO.BookManagementSystem;

public interface Book_DAO {
   void addBook(Book_DTO bookName);
   void removeBook(int bookId);
   void displayBooks();
}
