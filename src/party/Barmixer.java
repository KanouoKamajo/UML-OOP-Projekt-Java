package party;



public class Barmixer {
	
	private String name;
	private Cocktails[] cocktails;
	
	public Barmixer(String name, Cocktails cocktails1, Cocktails cocktails2) {
		this.name = name;
		this.cocktails = new Cocktails[2];
		this.cocktails[0] = cocktails1;
		this.cocktails[1] = cocktails2;
	}

	public String getName() {
		return name;
	}

	public Cocktails[] getCocktails() {
		return cocktails;
	}
	
	//Methoden
	
	public void mixen(Cocktails cocktail, Person person) {
		System.out.println(getName()+ " bereitet den "+ cocktail.getName() + " für "+ person.getName()+ " zu");
		}
	public void Rezept(Cocktails cocktails) {
		System.out.println("Das Rezept ist wie folgt:");
		System.out.println("Cocktail: " + cocktails.getName());
        System.out.println("Alkoholhaltig: " + (cocktails.isAlkoholhaltig() ? "Ja" : "Nein"));
        System.out.println("Zutaten: " + String.join(", ", cocktails.getZutaten()));
	}
	
}
