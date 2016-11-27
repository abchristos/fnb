package com.sales.items;

import java.math.BigDecimal;

import com.sales.itemfactories.OtherItemFactory;

/**
 * OtherItem refers to general items that are not exempt from tax
 *
 * @author Chris Lebuso
 */
public class OtherItem extends Item {

	public OtherItem() {
		super();
	}

	/**
	 * Initialize the values of the OtherItem attributes.
	 *
	 * @param name
	 * @param price
	 * @param imported
	 * @param quantity
	 */
	public OtherItem(String name, BigDecimal price, boolean imported, int quantity) {
		super(name, price, imported, quantity);

	}

	/**
	 * 
	 * @return OtherItemFactory
	 */
	@Override
	public OtherItemFactory getFactory() {

		return new OtherItemFactory();
	}

	@Override
	public boolean isExempt() {
		return false;
	}

}
