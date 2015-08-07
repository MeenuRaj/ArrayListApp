import java.text.NumberFormat;

public class Product {
	private String item;
	private String code;
	private String description;
	private double price;
	private int quantity;

	public Product() {
		item = "";
		code = "";
		description = "";
		price = 0;
		quantity = 0;

	}

	public void setitem(String item) {
		this.item = item;
	}

	public String getitem() {
		return item;
	}

	public void setcode(String code) {
		this.code = code;
	}

	public String getcode() {
		return code;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public String getdescription() {
		return description;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public double getprice() {
		return price;
	}

	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getprice());

	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public double getquantity() {
		return quantity;
	}

}