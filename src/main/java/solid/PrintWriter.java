package solid;

public class PrintWriter {
	 private Invoice invoice;

	    public PrintWriter(Invoice invoice) {
	        this.invoice = invoice;
	    }

	    public void print() {
	        System.out.println(this.invoice.quantity + "x " + this.invoice.book.name + " " + invoice.book.price + " $");
	        System.out.println("Discount Rate: " + invoice.discountRate);
	        System.out.println("Tax Rate: " + invoice.taxRate);
	        System.out.println("Total: " + invoice.total + " $");
	    }

}
