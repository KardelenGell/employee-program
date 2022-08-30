public class SalariedEmployee extends Employee {
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
		super(firstName, lastName, SSN);

		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'weeklySalary' variable is not within the desired range. Weekly Salary must be >= 0");
		this.weeklySalary = weeklySalary;

	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'weeklySalary' variable is not within the desired range. Weekly Salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried Employee: " + super.toString() + "\nWeekly Salary: $" + weeklySalary;
	}
}
