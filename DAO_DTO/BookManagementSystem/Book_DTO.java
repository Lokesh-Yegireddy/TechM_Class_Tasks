package DAO_DTO.BookManagementSystem;

public class Book_DTO {
private int bookId;
private String bookName;
private String authorName;
public Book_DTO(int bookId, String bookName, String authorName) {
	
	this.bookId = bookId;
	this.bookName = bookName;
	this.authorName = authorName;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}




}
