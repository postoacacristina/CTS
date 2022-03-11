package solid.o.resolved;

public class ProgMainOResolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empMada=new FTEmployee(1, "Mada", 2000);

		System.out.println(empMada.toString()+"BONUS: "+(FTEmployee) empMada.calculateBonus());
	}

}
