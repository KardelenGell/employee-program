public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.setPartNumber(partNumber);
		this.setPartDescription(partDescription);

		if (quantity < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'quantity' variable is not within the desired range. Quantity must be >= 0.0");
		this.setQuantity(quantity);

		if (pricePerItem <= 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'pricePerItem' variable is not within the desired range. Price Per Item must be > 0.0");
		this.setPricePerItem(pricePerItem);
	}

	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'quantity' variable is not within the desired range. Quantity must be >= 0.0");
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem <= 0.0)
			throw new IllegalArgumentException(
					"The program has been terminated! 'pricePerItem' variable is not within the desired range. Price Per Item must be > 0.0");
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}

	@Override
	public String toString() {
		return "Invoice: " + "\nPart Number: " + partNumber + " (" + partDescription + ")" + "\nQuantity: " + quantity
				+ "\nPrice Per Item: $" + pricePerItem;
	}

	

	

}
