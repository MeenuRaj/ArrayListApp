import java.util.ArrayList;
import java.util.Scanner;


public class InvoiceApp {

	public static void main(String[] args) {
		//initializing variables and objects
		double total = 0;
		int thisQty = 0;
		Invoice invoice = new Invoice();
		ArrayList<LineItem> alist = new ArrayList<LineItem>();
		Scanner scan = new Scanner(System.in);
		String thisCode = "";
		
		System.out.println("Welome to the Line Item Display");
		System.out.println();
		System.out.println("Do you want to enter an item?(y/n) ");
		String choice = scan.next();

		while (choice.equalsIgnoreCase("y")) {

			thisCode = Validator.getString(scan, "Enter item code: ");

			thisQty = Validator.getInt(scan, "Enter quantity: ", 0, 50);

			Product product = ProductDB.getProduct(thisCode);

			LineItem lineItem = new LineItem();
			lineItem.setProduct(product);
			lineItem.setQuantity(thisQty);

			invoice.addItem(lineItem);

			alist = invoice.getLineItems();

			System.out.print("Continue? (y/n): ");
			choice = scan.nextLine();
			System.out.println();

		}

		alist = invoice.getLineItems();

		System.out.println("Code\tDescription\t\t\tPrice\tQty\tTotal");
		System.out.println("----\t-----------\t\t\t----\t---\t-----");

		for (LineItem item : alist) {
			System.out.println(item.getProd().getcode() + "\t"
					+ item.getProd().getdescription() + "\t\t\t"
					+ item.getProd().getFormattedPrice() + "\t"
					+ item.getQuantity() + "\t" + item.getFormattedTotal());

			System.out.println();
		}
		System.out.println("\t\t\t\t\tInvoice Total\t"
				+ invoice.getFormattedTotal(total));
	}

}
