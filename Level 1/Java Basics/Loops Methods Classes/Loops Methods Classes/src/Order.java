
public class Order {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getOrder() {
		return order;
	}
	public void setOrder(double order) {
		this.order = order;
	}
	public Order(String name, double order) {
		super();
		this.name = name;
		this.order = order;
	}
	private String name;
	private double order;

}
