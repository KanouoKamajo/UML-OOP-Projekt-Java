package party;

import java.util.ArrayList;

public class Theke {
		
	private Barmixer barmixer;
	private ArrayList<Cocktails> cocktails;
	
	public Theke(Barmixer barmixer, Cocktails cocktails1, Cocktails cocktails2) {
		this.barmixer = barmixer;
		this.cocktails = new ArrayList<>();
		this.cocktails.add(cocktails1);
		this.cocktails.add(cocktails2);
	}

	
	
	
	public ArrayList<Cocktails> getCocktails() {
		return cocktails;
	}


	public Barmixer getBarmixer() {
		return barmixer;
	}

	
	//Methode
	
	public void getCocktails(Gäste gäste,Cocktails cocktails) {
		System.out.println(gäste.getName()+ " holt sich seinen "+ cocktails.getName());
	}
	
	
	
}
