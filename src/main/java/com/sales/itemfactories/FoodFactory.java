package com.sales.itemfactories;

import java.math.BigDecimal;

import com.sales.items.Food;

/**
 * Create a new Food object with specified values.
 * 
 * @author Chris Lebuso
 */
public class FoodFactory extends ItemFactory {

	@Override
	public Food createItem(String name, BigDecimal price, boolean imported, int quantity) {
		return new Food(name, price, imported, quantity);
	}

}
