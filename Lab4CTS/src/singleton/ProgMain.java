package singleton;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Database d1=new Database();
		//Database d2=new Database();
		
		Database d1=Database.getInstance();
		Database d2=Database.getInstance();

	}
	

}
