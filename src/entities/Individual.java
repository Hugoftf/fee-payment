package entities;

public class Individual extends TaxPayer {


	private Double healthExpenditures;
	
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		if (super.getAnualIncome() <= 20.000) {
			return  (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.5) ;
		}
		else {
			return (super.getAnualIncome() *0.25) - (healthExpenditures * 0.5);
		}
	}
	
	@Override
	public String toString() {
		return super.getName()
				+":  $ "
				+ String.format("%.2f", tax());
	}
	
	
}
