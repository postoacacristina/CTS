package seminar10.cristinapostoaca.dp.state;

public class VacantionState implements IState{

	@Override
	public void act(String task) {
		// TODO Auto-generated method stub
		System.out.println("This employee cannot handle this: "+task);
		
	}

}
