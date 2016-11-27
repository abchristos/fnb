/**
 * 
 */
package com.sales.items;

import java.math.BigDecimal;

import com.sales.itemfactories.FoodFactory;

/**
 * Food is an item in the store.
 *
 * @author Chris Lebuso
 */
public class Food extends Item {

	public Food() {
		super();
	}

	/**
	 * Initialize the values of the Food attributes
	 * 
	 */
	public Food(String name, BigDecimal price, boolean imported, int quantity) {
		super(name, price, imported, quantity);

	}

	/**
	 * 
	 * @return FoodFactory
	 */
	@Override
	public FoodFactory getFactory() {

		return new FoodFactory();

	}

	@Override
	public boolean isExempt() {
		return true;
	}

}
