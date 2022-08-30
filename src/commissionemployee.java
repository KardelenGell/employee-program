public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate) {
		super(firstName, lastName, SSN);

		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'grossSales' variable is not within the desired range. Gross sales must be >= 0.0");
		this.grossSales = grossSales;

		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'commissionRate' variable is not within the desired range. Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'grossSales' variable is not within the desired range. Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'commissionRate' variable is not within the desired range. Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPaymentAmount() {
		return commissionRate * grossSales;
	}

	@Override
	public String toString() {
		return "Commission Employee: " + super.toString() + "\nGross Sales: $" + grossSales + "\nCommission Rate: "
				+ commissionRate;
	}

}