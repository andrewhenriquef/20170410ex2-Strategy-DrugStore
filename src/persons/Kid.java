package persons;

public class Kid implements Person{
	
	public double getDiscount(double price){
		return (price -((price * 20)/100));
	}
}