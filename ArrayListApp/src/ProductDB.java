public class ProductDB {
	public static Product getProduct(String code) {
		Product p = new Product();
		p.setcode(code);

		if (code.equalsIgnoreCase("shirt")) {
			p.setdescription("Black shirt");
			// p.settaxable(true);
			p.setprice(20.00);
		} else if (code.equalsIgnoreCase("jeans")) {
			p.setdescription("Skinny Jeans");
			// p.settaxable(true);
			p.setprice(30.00);
		} else if (code.equalsIgnoreCase("food")) {
			p.setdescription("Groceries");
			// p.settaxable(false);
			p.setprice(62.78);
		} else {
			p.setdescription("Unknown");
		}
		return p;
	}

}
