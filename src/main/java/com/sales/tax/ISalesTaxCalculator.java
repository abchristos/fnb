/**
 * 
 */
package com.sales.tax;

import com.sales.items.Item;

/**
 * @author Chris Lebuso
 *
 */
public interface ISalesTaxCalculator {

	/**
	 * @param item
	 */
	void calculateTax(Item item);
}
