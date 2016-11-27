package com.sales.items;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.sales.itemfactories.ItemFactory;

/**
 * Item refers to goods that are purchased
 *
 * @author Chris Lebuso
 * 
 */
public abstract class Item {

	// name of the Item.
	protected String name;

	// price of the Item.
	protected BigDecimal price;

	// indication of whether an item is imported or not
	protected boolean imported;

	// Indicates how many Items are to be purchased.
	protected int quantity;

	//total cost of tax.
	protected BigDecimal costOfTax;

	public Item() {
		this.name = "";
		this.price = new BigDecimal(0.00);
		this.imported = false;
		this.quantity = 0;
		this.costOfTax = new BigDecimal(0.00);
	}

	/**
	 * Initialize the values of the item attributes.
	 * 
	 * @param name
	 * @param price
	 * @param imported
	 * @param quantity
	 */
	public Item(String name, BigDecimal price, boolean imported, int quantity) {
		this.name = name;
		this.price = price.multiply(new BigDecimal(quantity));
		this.imported = imported;
		this.quantity = quantity;
	}

	/**
	 * Gets the name of the item
	 *
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the item
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the price of the item.
	 *
	 * @return double
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Calculates the price for the number of items mentioned in the quantity.
	 *
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		price = price.multiply(new BigDecimal(quantity));
		this.price = price.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Checks if item is imported.
	 * 
	 * @return
	 */
	public boolean isImported() {
		return imported;
	}

	/**
	 * Sets a boolean value for imported attribute
	 *
	 * @param imported
	 */
	public void setImported(boolean imported) {
		this.imported = imported;
	}

	/**
	 * Gets the quantity of the item.
	 *
	 * @return int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity of item.
	 *
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the net cost of the item including tax.
	 *
	 * @return double
	 */
	public BigDecimal getCostOfTax() {
		return costOfTax;
	}

	/**
	 * Sets the total taxed cost of the item.
	 *
	 * @param costOfTax
	 */
	public void setCostOfTax(BigDecimal taxedCost) {
		this.costOfTax = taxedCost;
	}

	/**
	 * Indicate which items are exempt from basic sale tax
	 * 
	 * @return
	 */
	public abstract boolean isExempt();

	/**
	 * Gets the factory object to create a item.
	 *
	 * @return ItemFactory
	 */
	public abstract ItemFactory getFactory();

	/**
	 * Print the line output for an item
	 * 
	 * @return
	 */
	public String printItem() {
		return (quantity + (imported == true ? " imported" : "") + " " + name + " : " + price.doubleValue());
	}

}
