package prototype.resolved;

public class Book implements Cloneable {
	private String name;
	private String author;
	private float price;
	
	public Book(String name, String author, float price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
