package com.sales.items;

import java.math.BigDecimal;

import com.sales.itemfactories.MedicalItemFactory;

/**
 * MedicalItem is an item belonging to the category 'Medical' in the shopping
 * store.
 *
 * @author Chris Lebuso
 */
public class MedicalItem extends Item {

	public MedicalItem() {
		super();
	}

	/**
	 * Initialize the values of the MedicalItem attributes
	 *
	 * @param name
	 * @param price
	 * @param imported
	 * @param quantity
	 */
	public MedicalItem(String name, BigDecimal price, boolean imported, int quantity) {
		super(name, price, imported, quantity);

	}

	/**
	 * 
	 * @return MedicalItemFactory
	 */
	@Override
	public MedicalItemFactory getFactory() {
		return new MedicalItemFactory();

	}

	@Override
	public boolean isExempt() {
		return true;
	}

}
