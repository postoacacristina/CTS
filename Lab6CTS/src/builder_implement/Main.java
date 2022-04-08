package builder_implement;

public class Main {

	public static void main(String[] args) {
		
		User user=new User.UserBuilder("cristina", "cristina20", "crs@gmail.com").address("bucharest").build();
	}
}
