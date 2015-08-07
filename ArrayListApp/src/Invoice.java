import java.util.ArrayList;
import java.text.NumberFormat;

public class Invoice {
	ArrayList<LineItem> list;

	public Invoice() {
		list = new ArrayList<LineItem>();
	}

	public void addItem(LineItem lineItem) {
		list.add(lineItem);
	}

	public ArrayList<LineItem> getLineItems() {
		return list;
	}

	public double getInvoiceTotal() {
		double total = 0;
		for (LineItem item : list) {
			total = total + item.getTotal();
		}

		return total;

	}

	public String getFormattedTotal(double total) {
		double grandTotal = getInvoiceTotal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String totalD = currency.format(grandTotal);
		return totalD;
	}
}
