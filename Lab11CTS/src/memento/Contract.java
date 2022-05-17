package memento;

public class Contract {
	//original
	private String clientName;
	private String clausContract;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClausContract() {
		return clausContract;
	}
	public void setClausContract(String clausContract) {
		this.clausContract = clausContract;
	}
	public Contract(String clientName) {
		super();
		this.clientName = clientName;
	}
	public Contract(String clientName, String clausContract) {
		super();
		this.clientName = clientName;
		this.clausContract = clausContract;
	}
	
	
		
	
	@Override
	public String toString() {
		return "Contract [clientName=" + clientName + ", clausContract=" + clausContract + "]";
	}
	
	public void addClause(String newClause) {
		this.clausContract+="\n"+newClause;

}
	
	public void restoreFromVersion(ContractVersion clauseVersion) {
		//this.clausContract=clauseVersion;
		System.out.println("restore a specific version of the contract");
		this.clausContract=clauseVersion.getClausVersion();
	}
	
	//save version
	public ContractVersion saveVersion() {
		System.out.println("save version of the contract");
		return new ContractVersion(this.clausContract);
		
	}
}
