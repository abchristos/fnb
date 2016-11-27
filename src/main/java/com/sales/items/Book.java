package com.sales.items;

import java.math.BigDecimal;

import com.sales.itemfactories.BookFactory;

/**
 * Book is an Item in the store.
 *
 * @author Chris Lebuso
 */
public class Book extends Item {

	public Book() {
		super();
	}

	/**
	 * Initialize the values of the Book attributes
	 * 
	 * @param name
	 * @param price
	 * @param imported
	 * @param quantity
	 */
	public Book(String name, BigDecimal price, boolean imported, int quantity) {
		super(name, price, imported, quantity);

	}

	/**
	 *  
	 * @return BookFactory
	 */
	@Override
	public BookFactory getFactory() {
		return new BookFactory();

	}

	@Override
	public boolean isExempt() {
		return true;
	}

}
