//Data container class for book
package solid;

public class Book {
	String name;
	String authorName;
	int year;
	int price;
	String isbn;
	
	Book(String name,String authorName,int year,int price,String isbn){ 
		this.authorName= authorName;
		this.name= name;
		this.year= year;
		this.price= price;
		this.isbn= isbn;
		
	}
	

}
