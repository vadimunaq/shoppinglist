package consoleView;

import java.math.BigDecimal;
import java.util.Scanner;

import domain.Product;
import service.ProductService;

public class ConsoleUI {

	private ProductService productService = new ProductService();

	public void execute() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.println("1. Create product");
				System.out.println("2. Find product by id");
				System.out.println("3. Exit");
				Integer userInput = Integer.valueOf(scanner.nextLine());
				switch (userInput) {
					case 1:
						System.out.println("Enter product name: ");
						String name = scanner.nextLine();
						System.out.println("Enter product price: ");
						BigDecimal price = new BigDecimal(scanner.nextLine());
						Product product = new Product();
						product.setName(name);
						product.setPrice(price);
						product.setDiscount(BigDecimal.ZERO);
						productService.createProduct(product);
						System.out.println("Result ID: " + product.getId());
						break;
					case 2:
						System.out.println("Enter product id: ");
						long id = scanner.nextLong();
						Product resultProduct = productService.findByID(id);
						System.out.println("Result Product Name: = " + resultProduct.getName());
						System.out.println("Result Product Price: = " + resultProduct.getPrice());
						break;
					case 3:
						return;
				}
			} catch (Exception e) {
				System.out.println("Error! Please try again.");
			}
		}
	}
}
