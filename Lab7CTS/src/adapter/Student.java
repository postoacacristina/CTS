package adapter;

public class Student {
	Pen pen;
	public void getPen(Pen p) {
		this.pen=p;
	}
	public void write() {
		System.out.println("happy to have that pen");
	}
}