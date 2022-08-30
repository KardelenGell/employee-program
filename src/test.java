public class Test {

	public static void main(String[] args) {
		Payable payableObjects[] = new Payable[6];
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Yeliz", "Sahan", "16-16-0507", 7000, 0.04, 400);

		System.out.println("-----Invoices and Employees Processed Polymorphically-----");
		System.out.println("   ");

		payableObjects[0] = new Invoice("01234", "seat", 3, 475);
		payableObjects[1] = new Invoice("56789", "tire", 5, 65.5);
		payableObjects[2] = new SalariedEmployee("Kardelen", "Gel", "18-18-0507", 700);
		payableObjects[3] = new HourlyEmployee("Serpil", "Yaman", "19-19-0507", 14.25, 40);
		payableObjects[4] = new CommissionEmployee("Cansu", "Tarakci  ", "17-17-0507", 10000, 0.04);
		payableObjects[5] = basePlusCommissionEmployee;

		for (int i = 0; i < payableObjects.length; i++) {
			if (payableObjects[i] instanceof BasePlusCommissionEmployee) {
				System.out.println(payableObjects[i]);

				double baseSalary = basePlusCommissionEmployee.getBaseSalary();
				basePlusCommissionEmployee.setBaseSalary(baseSalary + (baseSalary * 0.1));

				System.out.println("New Base Salary with %10 increase is: $" + basePlusCommissionEmployee.getBaseSalary());
				System.out.println("Payment Amount: $" + payableObjects[i].getPaymentAmount());
				System.out.println("    ");

			} else {
				System.out.println(payableObjects[i]);
				System.out.println("Payment Amount: $" + payableObjects[i].getPaymentAmount());
				System.out.println("    ");
			}

		}

		for (int i = 0; i < payableObjects.length; i++) {
			System.out.println("Payable object" + " " + i + " " + "is a" + " " + payableObjects[i].getClass().getName());
		}
	}
}