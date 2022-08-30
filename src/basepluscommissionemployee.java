public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, SSN, grossSales, commissionRate);

		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'baseSalary' variable is not within the desired range. Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'baseSalary' variable is not within the desired range. Base Salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPaymentAmount() {
		return super.getPaymentAmount() + baseSalary;
	}

	@Override
	public String toString() {
		return "Base Salaried " + super.toString() + "\nBase Salary: $" + baseSalary;
	}

}