package strategy;

import java.util.*;

public class ShoppingCart {
	private PaymentMethod paymentMethod;
	private List<Item> items = new ArrayList<>();
	
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	private double calculateTotal() {
		return this.items.stream().mapToDouble(Item::getPrice).sum();
	}
	
	public void payBill() {
		double total=this.calculateTotal();
		
		if(this.paymentMethod==null) {
			System.out.println("Select a payment method.");
		}
		else {
			paymentMethod.processPayment(total);
		}
	}
}
