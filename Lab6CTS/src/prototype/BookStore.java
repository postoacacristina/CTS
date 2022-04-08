package prototype;

import java.util.ArrayList;

public class BookStore {
	private String name;
	private ArrayList<Book> lislistBooks=new ArrayList<>();
	
	public BookStore() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getLislistBooks() {
		return lislistBooks;
	}
	public void setLislistBooks(ArrayList<Book> lislistBooks) {
		this.lislistBooks = lislistBooks;
	}
	
	public static BookStore loadDataFromDatabase(String name) {
		BookStore b= new BookStore();
		b.setName(name);
		
		Book book;
		for(int i=0; i<10; i++) {
			book=new Book(name+"-"+i, "lar", i*100);
			b.lislistBooks.add(book);
			book=null;
		}
		return b;
	}
	

	@Override
	public String toString() {
		return "BookStore [name=" + name + ", lislistBooks=" + lislistBooks + "]";
	}

}