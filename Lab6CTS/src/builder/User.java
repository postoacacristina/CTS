package builder;

public class User {
	//mandatory
	String username;
	String password;
	String emil;
	
	//optional
	String address;
	String phoneNo;
	String birthday;
	
	public User(String username, String password, String emil, String address, String phoneNo, String birthday) {
		super();
		this.username = username;
		this.password = password;
		this.emil = emil;
		this.address = address;
		this.phoneNo = phoneNo;
		this.birthday = birthday;
	}
	

	
	public User(String username, String password, String emil, String birthday) {
		super();
		this.username = username;
		this.password = password;
		this.emil = emil;
		this.birthday = birthday;
	}

	//urmatorul constructor nu e ok, pt ca are acelasi antet, deci nu il pot crea
//	public User(String username, String password, String emil, String phoneNo) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.emil = emil;
//		this.phoneNo = phoneNo;
//	}
	
	//deci, vom folosi o clasa builder (care construieste obiectul de tip user), cu aceeasi parametrii, care seteaza atributele necesare si returneaza noul obiect

}