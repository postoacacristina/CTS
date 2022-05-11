package seminar10.cristinapostoaca.dp.chain;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AHandler waiter=new Waiter();
		AHandler chief=new Chief();
		
		waiter.setSuccessor(chief);
		waiter.processOrder(new Order("Coffee", 3));
		waiter.processOrder(new Order("Pizza",15));

	}

}
