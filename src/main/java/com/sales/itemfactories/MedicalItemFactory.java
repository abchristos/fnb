package com.sales.itemfactories;

import java.math.BigDecimal;

import com.sales.items.MedicalItem;

/**
 * Create a new Medical Item object with specified values.
 * 
 * @author Chris Lebuso
 */
public class MedicalItemFactory extends ItemFactory {

	@Override
	public MedicalItem createItem(String name, BigDecimal price, boolean imported, int quantity) {
		return new MedicalItem(name, price, imported, quantity);
	}

}
