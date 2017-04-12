package persons;

public class Elderly implements Person{
	
	public double getDiscount(double price){
		return (price -((price * 30)/100));
	}
}