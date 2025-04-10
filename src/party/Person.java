package party;

public class Person {
		
	private String name;
	private int alter;
	
	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
		
	}
	
	//Methoden
	public void bestellen(Cocktails cocktails) {
		System.out.println(getName() + " bestellt einen "+ cocktails.getName() + " an der Theke");
	}
	
	public void trinken() {
		System.out.println(getName() +" trinkt einen Schluck vom Cocktail");
	}
	
	public void sprechen(Person person) {
		System.out.println(getName()+" spricht mit "+ person.getName());
	}

	
	
	
	
	
	public String getName() {
		return name;
	}

	public int getAlter() {
		return alter;
	}
	
	
}
