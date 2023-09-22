package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployes;

	public Company(String name, Double anualIncome, Integer numberOfEmployes) {
		super(name, anualIncome);
		this.numberOfEmployes = numberOfEmployes;
	}

	public int getNumberOfEmployes() {
		return numberOfEmployes;
	}

	public void setNumberOfEmployes(Integer numberOfEmployes) {
		this.numberOfEmployes = numberOfEmployes;
	}

	
	@Override
	public double tax() {
		if (numberOfEmployes >= 10) {
			return super.getAnualIncome() * 0.14;
		}
		else {
			return super.getAnualIncome() * 0.16;
		}
		
	}
	
	@Override
	public String toString() {
		return super.getName()
				+":  $ "
				+ String.format("%.2f", tax());
	}	
}
