package application;

import drugs.Drug;
import drugs.Generic;
import persons.*;

public class DrugStore {

	public static void main(String[] args) {
		
		Drug paracetamol = new Generic(20.0);
		
		Person person = new Elderly();
		showData(person, paracetamol);
		
		person = new Kid();
		showData(person, paracetamol);
		
		person = new Woman();
		showData(person, paracetamol);
		
		person = new Deficienty();
		showData(person, paracetamol);
		
	}

	public static void showData(Person person, Drug drug){
		System.out.println("Valor final: " + person.getDiscount(drug.getPrice()));
	}
}
