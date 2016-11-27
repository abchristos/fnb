package com.sales;

import java.util.ArrayList;
import java.util.List;

import com.sales.items.Item;

/**
 * Stores the purchased items
 * 
 * @author Chris Lebuso
 */
public class ShoppingBasket {

	//A list to store the items.
	private List<Item> itemList;

	/**
	 * Create a new shopping basket to add items.
	 */
	public ShoppingBasket() {
		itemList = new ArrayList<Item>();
	}

	/**
	 * Adds the item to the basket.
	 *
	 * @param item
	 */
	public void addItemToBasket(Item item) {
		itemList.add(item);
	}

	/**
	 * Retrieves the items from basket.
	 * 
	 * @return item list
	 */
	public List<Item> getItemsFromBasket() {
		return itemList;
	}
}
