package app.new_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
	String author;
	int bookID;
	String publisher;
	Book(String author,int bookID,String publisher){
		this.author=author;
		this.bookID= bookID;
		this.publisher=publisher;
		   }
	public String toString(){
		return author+" "+bookID+" "+publisher;
		
	}
	}

  public class TestBook{
	  public static void main(String[] args) {
		  Book b1=new Book("jwala",11,"Dariyaganj");
		  Book b2=new Book("kumar",12,"Nayi Sadak ");
		  Book b3=new Book("sonu",13," Macmillan ");
		  Book b4=new Book("monu",14,"MMMMMMMM ");
		
		  List<Book>  books = new ArrayList<Book>();
		  books.add(b1);
		  books.add(b2);
		  books.add(b3);
		  books.add(b4);
		 
		  Iterator<Book> it=books.iterator();
		  while(it.hasNext()){
			 // Book bb2 = (Book) iterator.next();
			 // System.out.println(bb2);
			  Book bk= it.next();
			 // System.out.println(bk.bookID+", "+bk.author+", "+bk.publisher);
			  System.out.println(bk);
		  }
		   
		/*  for(Book b:books) {
			  System.out.println(b.author +" ,"+b.publisher+" "+b.bookID);
		  }
	*/
  }
 }