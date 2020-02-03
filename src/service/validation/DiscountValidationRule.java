package service.validation;

import java.math.BigDecimal;

import domain.Product;

public class DiscountValidationRule implements ProductValidationRule {

	@Override
	public void validate(Product product) {
		if (product.getDiscount().compareTo(BigDecimal.ZERO) < 0 ||
				product.getDiscount().compareTo(BigDecimal.valueOf(100)) > 0){
			product.setDiscount(BigDecimal.valueOf(0));
			throw new ProductValidationException("The discount must be between 0 and 100");
		} else if (product.getPrice().compareTo(BigDecimal.valueOf(20)) < 0) {
			product.setDiscount(BigDecimal.valueOf(0));
			throw new ProductValidationException("Product price must be at least 20 to add a discount");
		}
	}
}
