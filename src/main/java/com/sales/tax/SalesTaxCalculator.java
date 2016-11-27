/**
 * 
 */
package com.sales.tax;

import java.math.BigDecimal;

import com.sales.items.Item;

/**
 * calculate the tax for all items
 * 
 * @author Chris Lebuso
 *
 */
public class SalesTaxCalculator implements ISalesTaxCalculator {

	private final BigDecimal IMPORTED_TAX_PERCENTAGE = new BigDecimal("5");
	private BigDecimal taxPercentage;
	private final BigDecimal ROUNDED_FACTOR = new BigDecimal("0.05");
	private final BigDecimal BASIC_SALES_TAX_PERCENTAGE = new BigDecimal("10");

	public void calculateTax(Item item) {
		calculateTaxPercentage(item);
		calculateSalesTax(item);
	}

	/**
	 * Calculate tax percentage for items<BR>
	 * 
	 * @param item
	 */
	private void calculateTaxPercentage(Item item) {

		if (item.isExempt()) {
			taxPercentage = new BigDecimal(0.00);
		} else {
			taxPercentage = BASIC_SALES_TAX_PERCENTAGE;
		}

		if (item.isImported()) {
			taxPercentage = taxPercentage.add(IMPORTED_TAX_PERCENTAGE);
		}
	}

	/**
	 * Calculate Sales Tax for an item.
	 * 
	 * @param item
	 */
	private void calculateSalesTax(Item item) {
		BigDecimal salesTax = item.getPrice().multiply(taxPercentage).divide(new BigDecimal("100"));
		salesTax = roundOff(salesTax);
		item.setCostOfTax(salesTax);
		item.setPrice(item.getPrice().add(salesTax));
	}

	/**
	 * Returns the value rounded up to the nearest 0.05.
	 * 
	 * @param value
	 * @return 
	 */
	private BigDecimal roundOff(BigDecimal value) {
		value = value.divide(ROUNDED_FACTOR);
		value = new BigDecimal(Math.ceil(value.doubleValue()));
		value = value.multiply(ROUNDED_FACTOR);
		return value;
	}

}
