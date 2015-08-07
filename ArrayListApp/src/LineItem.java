import java.text.NumberFormat;

public class LineItem {

	private Product prod;
	private int quantity;
	private double total;

	public LineItem() {
		this.prod = new Product();
		this.quantity = 0;
		this.total = 0;
	}

	public void setProduct(Product product) {
		this.prod = product;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		this.calculatedTotal();
		return total;
	}

	private void calculatedTotal() {
		total = quantity * prod.getprice();
	}

	public String getFormattedTotal() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getTotal());
	}

}
