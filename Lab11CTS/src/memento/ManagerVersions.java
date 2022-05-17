package memento;

import java.util.ArrayList;

public class ManagerVersions {
	
	private ArrayList<ContractVersion> contractVersions=new ArrayList<ContractVersion>();

	public ManagerVersions() {
		super();
		this.contractVersions = null;
	}
	
	public ManagerVersions(ArrayList<ContractVersion> contractVersions) {
		super();
		this.contractVersions = contractVersions;
	}
	
	public void addVersion(ContractVersion newContractVersion) {
		this.contractVersions.add(newContractVersion);
	}
	public ContractVersion recoveryVersiuonContract(int nrVersion) {
		return this.contractVersions.get(nrVersion);
	}
	
	

}
