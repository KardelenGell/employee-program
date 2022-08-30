public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours) {
		super(firstName, lastName, SSN);

		if (wage < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'wage' variable is not within the desired range. Wage must be >= 0");
		this.wage = wage;

		if (hours < 0.0 || hours >= 168)
			throw new IllegalArgumentException(
					"The program has been terminated! 'hours' variable is not within the desired range. Hours must be >= 0");
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'wage' variable is not within the desired range. Wage must be >= 0");
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours < 0.0 || hours >= 168)
			throw new IllegalArgumentException(
					"The program has been terminated! 'hours' variable is not within the desired range. Hours must be >= 0");
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			return 40 * wage + (hours - 40) * wage * 1.5;
		}
	}

	@Override
	public String toString() {
		return "Hourly Employee: " + super.toString() + "\nHourly Wage: $" + wage + "\nHours Worked: " + hours;
	}
}
