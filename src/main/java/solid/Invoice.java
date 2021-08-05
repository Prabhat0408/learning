//This class should have functionality of invoice only, if we add
// Print Invoice and save to file functionality here, and in future if we add /change
//functionality of print or save to file , we have to make chnage here and that violates SRP
//so better to add print and save functionality to other class
package solid;

public class Invoice {
	
	public Book book;
	public int quantity;
	public double discountRate;
	public double taxRate;
	public double total;

	public Invoice(Book book, int quantity, double discountRate, double taxRate) {
		this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
		this.total = this.calculateTotal();
	}

	public double calculateTotal() {
	        double price = ((book.price - book.price * discountRate) * this.quantity);

		double priceWithTaxes = price * (1 + taxRate);

		return priceWithTaxes;
	}


}
