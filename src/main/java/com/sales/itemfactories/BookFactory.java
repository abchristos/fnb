package com.sales.itemfactories;

import java.math.BigDecimal;

import com.sales.items.Book;

/**
 * Create a new Book object with specified values.
 * 
 * @author Chris Lebuso
 */
public class BookFactory extends ItemFactory {

	@Override
	public Book createItem(String name, BigDecimal price, boolean imported, int quantity) {
		return new Book(name, price, imported, quantity);
	}

}
