package prototype;

public class Main {

	//prototype se refera la definirea o singura data 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore carturesti=BookStore.loadDataFromDatabase("carturesti");
		System.out.println(carturesti);
		
		BookStore dicverta=carturesti;	//shallow copy; deci avem nevoie de cloneable (versiunea resolved)
	}

}