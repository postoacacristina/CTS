package solid.d2;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operation o=Calculator.Operation.ADD;
		Calculator c= new Calculator();
		SubstractNumbers substractNumbers=new SubstractNumbers();
		Calculator.calculate(10, 15, substractNumbers);

	}

}
