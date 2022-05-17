package memento;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManagerVersions caretaker=new ManagerVersions();
		Contract originalContract=new Contract("Cris");
		originalContract.addClause("increase salary 14%");//v1
		caretaker.addVersion(originalContract.saveVersion());//v1
		System.out.println(originalContract);
		System.out.println("---");
		
		originalContract.addClause("note period changed");//v2
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		System.out.println("---");
		
		originalContract.addClause("manager = note period changed");//v3
		caretaker.addVersion(originalContract.saveVersion());
		System.out.println(originalContract);
		System.out.println("---");
		
		//originalContract.restoreFromVersion(0); //NOT OK
		ContractVersion desiredVersion=caretaker.recoveryVersiuonContract(0);
		originalContract.restoreFromVersion(desiredVersion);
		System.out.println(originalContract);
		

	}

}
