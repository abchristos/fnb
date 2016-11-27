package com.sales.itemfactories;

import java.math.BigDecimal;

import com.sales.items.OtherItem;

/**
 * Create a new OtherItem object with specified values.
 * 
 * @author Chris Lebuso
 */
public class OtherItemFactory extends ItemFactory {

	@Override
	public OtherItem createItem(String name, BigDecimal price, boolean imported, int quantity) {
		return new OtherItem(name, price, imported, quantity);
	}

}
