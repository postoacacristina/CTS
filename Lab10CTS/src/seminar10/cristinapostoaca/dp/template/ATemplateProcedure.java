package seminar10.cristinapostoaca.dp.template;

public abstract class ATemplateProcedure {
	
	public abstract void getProcedurePapers();
	public abstract void getOfficerApprovalForProcedure();
	public abstract void identifyDamage();
	public abstract void evaluateHouse();
	public abstract void sendEvaluation();
	
	public void getInsurance() {
		getProcedurePapers();
		getOfficerApprovalForProcedure();
		identifyDamage();
		evaluateHouse();
		sendEvaluation();
		//return
	}
	

}
