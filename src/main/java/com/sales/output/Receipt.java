package com.sales.output;

import java.text.DecimalFormat;
import java.util.List;

import com.sales.items.Item;

/**
 * The Receipt holds items purchased with their cost of tax, the total tax and
 * total amount payable.
 * 
 * @author Chris Lebuso
 */
public class Receipt {
	// The list of items purchased.
	private List<Item> itemList;

	// The net tax cost of all items purchased
	private double totalSalesTax;

	// The net amount payable for all items purchased.
	private double totalAmount;

	// Round up to 2 decimal places
	private DecimalFormat decimalFormat = new DecimalFormat("##.00");

	/**
	 * Creates a new Receipt object.
	 * 
	 * @param items
	 * @param tax
	 * @param amount
	 */
	public Receipt(List<Item> items, double tax, double amount) {
		itemList = items;
		totalSalesTax = tax;
		totalAmount = amount;
	}

	/**
	 * Gets the list of purchased items.
	 * 
	 * @return List<Item>
	 */
	public List<Item> getItemList() {
		return itemList;
	}

	/**
	 * Sets the list of items purchased.
	 * 
	 * @param itemList
	 */
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	/**
	 * Gets the net sales tax of all items
	 * 
	 * @return double
	 */
	public double getTotalSalesTax() {
		return totalSalesTax;
	}

	/**
	 * Sets the net sales tax of all items
	 * 
	 * @param totalSalesTax
	 */
	public void setTotalSalesTax(double totalSalesTax) {
		this.totalSalesTax = totalSalesTax;
	}

	/**
	 * Gets the net amount payable for all items.
	 * 
	 * @return double
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * Sets the net amount payable of all items
	 * 
	 * @param totalAmount
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * Gets the total number of items purchased.
	 * 
	 * @return int
	 */
	public int getTotalNumberOfItems() {
		return itemList.size();
	}

	/**
	 *  print out the actual receipt
	 * @return
	 */
	public String printReceipt() {
		String receipt = "";

		for (Item item : itemList) {
			receipt += (item.printItem() + "\n");
		}

		receipt += "Total sales tax = " + decimalFormat.format(totalSalesTax) + "\n";
		receipt += "Total amount = " + decimalFormat.format(totalAmount) + "\n";

		return receipt;
	}

}
