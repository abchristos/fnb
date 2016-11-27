package com.sales.itemfactories;

import java.math.BigDecimal;

import com.sales.items.Item;

/**
 * The ItemFactory is an abstract factory class.
 * 
 * @author Chris Lebuso
 */
public abstract class ItemFactory {

	/**
	 * Creates a new Item object.
	 * 
	 * @param name
	 * @param price
	 * @param imported
	 * @param quantity
	 * @return
	 */
	public abstract Item createItem(String name, BigDecimal price, boolean imported, int quantity);

}
