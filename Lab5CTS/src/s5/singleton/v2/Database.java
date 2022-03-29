package s5.singleton.v2;

public class Database {
	private static Database INSTANCE=new Database();
	
	static {
		INSTANCE=new Database();
	}
	
	
	private Database() {
		
	}
	
	public Database getInstance() {
		return INSTANCE;
	}

}
