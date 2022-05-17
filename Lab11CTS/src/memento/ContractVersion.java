package memento;

public class ContractVersion {
	
	private String clausVersion;

	public ContractVersion(String clausVersion) {
		super();
		this.clausVersion = clausVersion;
	}
	public ContractVersion() {
		super();
		this.clausVersion = "";
	}
	public String getClausVersion() {
		return clausVersion;
	}
	public void setClausVersion(String clausVersion) {
		this.clausVersion = clausVersion;
	}
	
	

}
