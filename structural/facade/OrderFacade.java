package facade;

public class OrderFacade {
	private Restaurant restaurant;
	private Payment payment;
	private Delievery delievery;
	private Notification notification;
	
	public OrderFacade() {
		this.restaurant=new Restaurant();
		this.payment=new Payment();
		this.delievery=new Delievery();
		this.notification=new Notification();
	}
	
	public void placeOrder(String foodItem, long amount) {
		payment.makePayment(amount);
		restaurant.prepareFood(foodItem);
		delievery.makeDeliever(foodItem);
		notification.sendNotification(foodItem);
	}
}
