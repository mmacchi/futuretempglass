package enums;

public enum ProductionSteps {

	TEMPER("Tempering");
	
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
