package persons;

public class Deficienty implements Person{
	
	public double getDiscount(double price){
		return (price -((price * 5)/100));
	}
}