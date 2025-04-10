package party;

public class Gastgeber extends Person {

	
	
	
	
	
	public Gastgeber(String name, int alter) {
		super(name, alter);
		// TODO Auto-generated constructor stub
	}
	public void unterhalten() {
		System.out.println("Der Gastgeber " + getName()+ " unterhält die Party!");
	}
	public void Gastunterhalten(Gäste gast) {
		System.out.println("Der Gastgeber " +getName() +" unterhält sich mit "+ gast.getName() );
	}
}
