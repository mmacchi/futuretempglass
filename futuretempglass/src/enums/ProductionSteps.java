package enums;

public enum ProductionSteps {

	TEMPER("Tempering"),
	POLISH("Polishing");
	
	private String stepName;
	
	private ProductionSteps(String stepName)
	{
		this.stepName = stepName;
	}
	
	public String getStepName()
	{
		return stepName;
	}
}
