package service;

import java.util.Optional;

import domain.Product;
import repository.ProductInMemoryRepository;
import service.validation.ProductValidationService;

public class ProductService {
	private ProductInMemoryRepository repository = new ProductInMemoryRepository();
	private ProductValidationService validationService = new ProductValidationService();

	public Long createProduct(Product product) {
		validationService.validate(product);
		Product createdProduct = repository.insert(product);
		return createdProduct.getId();
	}

	public Product findByID(Long id) {
		return Optional.of(repository.findProductByID(id)).get();
	}
}
