package persons;


public class Woman implements Person{
	
	public double getDiscount(double price){
		return (price -((price * 10)/100));
	}
}
