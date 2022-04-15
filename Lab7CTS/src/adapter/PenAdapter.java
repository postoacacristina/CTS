package adapter;

public class PenAdapter extends PilotPen implements Pen{
	PilotPen pp=new PilotPen();
	@Override
	public void write() {
		pp.write();
	}
	
	@Override
	public void delete() {
		pp.delete();
	}
}