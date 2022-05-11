package seminar10.cristinapostoaca.dp.command;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chief ch1=new Chief("John");
		Chief ch2=new Chief("Maria");
		
		Waiter waiter=new Waiter();
		waiter.noteCommands(new PizzaOrder(ch1, "Diavola"));
		waiter.noteCommands(new PastaOrder(ch2, "Carbonara"));
		waiter.noteCommands(new PizzaOrder(ch1, "Margerita"));
		waiter.sendCommands();
		

	}

}
