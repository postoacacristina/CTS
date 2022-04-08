package builder_implement;

public class User {
	//mandatory
	String username;
	String password;
	String emil;
	
	//optional
	String address;
	String phoneNo;
	String birthday;
		
//userbuilder primeste ca parametru un obiect User, iar User foloseste Userbuilder

	public User(UserBuilder ub) {
		super();
		this.username = ub.username;
		this.password = ub.password;
		this.emil = ub.emil;
		this.address = ub.address;
		this.phoneNo = ub.phoneNo;
		this.birthday = ub.birthday;
	}
	
	public static class UserBuilder{	// (inner class)
		//mandatory
		String username;
		String password;
		String emil;
		
		//optional
		String address;
		String phoneNo;
		String birthday;
		
		public UserBuilder(String username, String password, String emil) {
			this.username = username;
			this.password = password;
			this.emil = emil;
		}
		
		//setteri speciali
		UserBuilder address(String address) {
			this.address=address;
			return this;
		}
		UserBuilder phoneNo(String address) {
			this.address=address;
			return this;
		}
		UserBuilder birthday(String address) {
			this.address=address;
			return this;
		}
		
		//functia de returnare
		public User build() {
			User user=new User(this);
			return user;
		}
		
		
	}
}


