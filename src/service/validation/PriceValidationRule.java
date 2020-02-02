package service.validation;

import java.math.BigDecimal;

import domain.Product;

public class PriceValidationRule implements ProductValidationRule {

	@Override
	public void validate(Product product) {
		if (product.getPrice().compareTo(BigDecimal.valueOf(0)) < 0) {
			throw new ProductValidationException("Price must be a positive number");
		}
	}
}
