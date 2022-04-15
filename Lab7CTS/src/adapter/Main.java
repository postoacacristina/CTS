package adapter;

public class Main {

	public static void main(String[] args) {
		
		Student s= new Student();
		Pen penFav=(Pen) new PenAdapter();
		s.getPen(penFav);
		s.write();
	}

}