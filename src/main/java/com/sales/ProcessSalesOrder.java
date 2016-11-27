package com.sales;

import java.util.List;

import com.sales.data.Orders;
import com.sales.items.Item;
import com.sales.output.Receipt;
import com.sales.tax.ISalesTaxCalculator;
import com.sales.tax.SalesTaxCalculator;

/**
 * Process all the orders and print our a receipt
 * 
 * @author Chris Lebuso
 *
 */
public class ProcessSalesOrder {

	/**
	 * Create and checkout orders
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		shoppingBasket = Orders.getInstance().createFirstOrder();
		checkout(shoppingBasket);

		shoppingBasket = Orders.getInstance().createSecondOrder();
		checkout(shoppingBasket);

		shoppingBasket = Orders.getInstance().createThirdOrder();
		checkout(shoppingBasket);
	}

	/**
	 * @param shoppingBasket
	 */
	private static void checkout(ShoppingBasket shoppingBasket) {
		List<Item> orders = shoppingBasket.getItemsFromBasket();
		calculateTax(orders);
	}

	/**
	 *  calculate the tax for each order
	 * 
	 * @param orders
	 */
	private static void calculateTax(List<Item> orders) {
		ISalesTaxCalculator iSalesTaxCalculator = new SalesTaxCalculator();
		double totalTax = 0;
		double totalPrice = 0;
		for (Item item : orders) {
			iSalesTaxCalculator.calculateTax(item);
			totalPrice += item.getPrice().doubleValue();
			totalTax += item.getCostOfTax().doubleValue();
		}

		printReceipt(orders, totalTax, totalPrice);
	}

	/**
	 * print a receipt for each order
	 * 
	 * @param items
	 * @param tax
	 * @param amount
	 */
	private static void printReceipt(List<Item> items, double tax, double amount) {
		
		Receipt receipt = new Receipt(items, tax, amount);
		System.out.println(receipt.printReceipt());
	}

}
