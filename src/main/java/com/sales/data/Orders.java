package com.sales.data;

import java.math.BigDecimal;
import java.util.HashMap;

import com.sales.ShoppingBasket;
import com.sales.items.Book;
import com.sales.items.Food;
import com.sales.items.Item;
import com.sales.items.MedicalItem;
import com.sales.items.OtherItem;

/**
 * Create a list of Items to be ordered
 * 
 * @author Chris Lebuso
 *
 */
public class Orders {

	// instance variable for creating a singleton class
	private static Orders orders;

	// map of items that belong to the shop
	private static HashMap<String, Item> items;

	private Orders() {
	}

	/**
	 * create one instance of an Order
	 * 
	 * @return
	 */
	public static Orders getInstance() {
		if (orders == null) {
			orders = new Orders();
			initialiseItems();
		}
		return orders;
	}

	/**
	 * Create a list of Items that can be ordered
	 * 
	 */
	private static void initialiseItems() {

		items = new HashMap<String, Item>();
		items.put("book", new Book());
		items.put("music CD", new OtherItem());
		items.put("chocolate bar", new Food());
		items.put("box of chocolates", new Food());
		items.put("bottle of perfume", new OtherItem());
		items.put("packet of headache pills", new MedicalItem());

	}

	/**
	 * Input order 1.<BR>
	 * 1 book at 12.49.<BR>
	 * 1 music CD at 14.99.<BR>
	 * 1 chocolate bar at 0.85.
	 * 
	 * @return ShoppingBasket
	 */
	public ShoppingBasket createFirstOrder() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();

		String name = "book";
		BigDecimal price = new BigDecimal(12.49);
		boolean imported = false;
		int quantity = 1;

		Item item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		name = "music CD";
		price = new BigDecimal(14.99);
		imported = false;
		quantity = 1;

		item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		name = "chocolate bar";
		price = new BigDecimal(0.85);
		imported = false;
		quantity = 1;

		item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		return shoppingBasket;
	}

	/**
	 * Input order 2.<BR>
	 * 1 imported box of chocolates at 10.00.<BR>
	 * 1 imported bottle of perfume at 47.50.
	 * 
	 * @return ShoppingBasket
	 */
	public ShoppingBasket createSecondOrder() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		String name = "box of chocolates";
		BigDecimal price = new BigDecimal(10.00);
		boolean imported = true;
		int quantity = 1;

		Item item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		name = "bottle of perfume";
		price = new BigDecimal(47.40);
		imported = true;
		quantity = 1;

		item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		return shoppingBasket;
	}

	/**
	 * Input order 3.<BR>
	 * 1 imported bottle of perfume at 27.99.<BR>
	 * 1 bottle of perfume at 18.99. 1 packet of headache pills at 9.75. <BR>
	 * 1 box of imported chocolates at 11.25.
	 * 
	 * @return ShoppingBasket
	 */
	public ShoppingBasket createThirdOrder() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		String name = "bottle of perfume";
		BigDecimal price = new BigDecimal(27.99);
		boolean imported = true;
		int quantity = 1;

		Item item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		name = "bottle of perfume";
		price = new BigDecimal(18.99);
		imported = false;
		quantity = 1;

		item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		name = "packet of headache pills";
		price = new BigDecimal(9.75);
		imported = false;
		quantity = 1;

		item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		name = "box of chocolates";
		price = new BigDecimal(11.25);
		imported = true;
		quantity = 1;

		item = items.get(name).getFactory().createItem(name, price, imported, quantity);
		shoppingBasket.addItemToBasket(item);

		return shoppingBasket;
	}

}
