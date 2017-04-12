package drugs;

public class Generic implements Drug {
	private double price;
	
	public Generic(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
}
