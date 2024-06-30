package main.java.com.arun.designpatterns.structural.FacadePattern;

public class ZomatoFacade {
	
	DeliveryTeam team;
	
	DeliveryBoy boy;
	
	Restaurant restaurant;
	
	public ZomatoFacade(DeliveryTeam team, DeliveryBoy boy, Restaurant restaurant) {
		this.team = team;
		this.boy = boy;
		this.restaurant = restaurant;
	}
	
	public void placeOrder() {
		restaurant.prepareOrder();
		team.assignDeliveryBoy();
		boy.pickupOrder();
		boy.deliverOrder();
	}

}
