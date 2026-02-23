public class Program {
	public static void main(String[] args) {
		products.Book book1 = new products.Book(
			"Dune",
			2017,
			"United States",
			56.3d,
			680,
			"Frank Herbert",
			1
		);

		products.Book book2 = new products.Book(
			"One of Us Is Lying",
			2018,
			"United States",
			34.93d,
			384,
			"Karen McManus",
			1
		);

		products.Book book3 = new products.Book(
			"War And Peace",
			1869,
			"United States",
			31.7d,
			272,
			"Leo Tolstoy",
			1
		);

		products.Dvd dvd1 = new products.Dvd(
			"Underworld - Blood Wars",
			2016,
			"United States",
			16.9d,
			"Anna Foerster",
			"Action",
			91
		);

		products.Dvd dvd2 = new products.Dvd(
			"Annabelle - Creation",
			2017,
			"United States",
			39.9d,
			"Jame Wan and Peter Safran",
			"Horror",
			109
		);

		OrderItem[] orderItems1 = new OrderItem[] {
			new OrderItem(book1, 1),
			new OrderItem(dvd2, 1)
		};

		Order order1 = new Order(0, orderItems1);

		order1.presentOrderSummary();

		OrderItem[] orderItems2 = new OrderItem[] {
			new OrderItem(book1, 1),
			new OrderItem(dvd2, 1)
		};

		Order order2 = new Order(10, orderItems2);

		order2.presentOrderSummary();

		OrderItem[] orderItems3 = new OrderItem[] {
			new OrderItem(book2, 1),
			new OrderItem(book3, 2),
			new OrderItem(dvd1, 1)
		};

		Order order3 = new Order(5, orderItems3);

		order3.presentOrderSummary();

		OrderItem[] orderItems4 = new OrderItem[] {
			new OrderItem(book2, 1),
			new OrderItem(book2, 1),
			new OrderItem(book3, 2),
			new OrderItem(dvd1, 1),
			new OrderItem(dvd2, 2)
		};

		Order order4 = new Order(5, orderItems4);

		order4.presentOrderSummary();
	}
}