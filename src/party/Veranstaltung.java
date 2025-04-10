package party;

public class Veranstaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Gastgeber Paul = new Gastgeber("Paul", 25);
		Gäste Daniel = new Gäste("Daniel", 26);
		Gäste Ali = new Gäste("Ali", 28);
		Caipirinha caipi = new Caipirinha();
		Ipanem ipanem = new Ipanem();
		Barmixer Josiane = new Barmixer("Josiane",caipi,ipanem);
		Theke Cocktailtheke = new Theke(Josiane, caipi, ipanem);
		Party IAD_Abschlussparty = new Party("22.11.2024", "Marburg", Daniel, Ali, Paul,Cocktailtheke );
		IAD_Abschlussparty.veranstalten();
		Paul.unterhalten();
		Daniel.sprechen(Ali);
		Daniel.bestellen(ipanem);
		Ali.bestellen(caipi);
		Josiane.Rezept(ipanem);
		Josiane.mixen(ipanem, Daniel);
		Josiane.Rezept(caipi);
		Josiane.mixen(caipi, Daniel);
		Cocktailtheke.getCocktails(Daniel, ipanem);
		Cocktailtheke.getCocktails(Ali, caipi);
		Gäste Gast_3 = new Gäste("Thomas", 35);
		IAD_Abschlussparty.addGast(Gast_3);
		IAD_Abschlussparty.veranstalten();
		IAD_Abschlussparty.removeGast(Gast_3);
		IAD_Abschlussparty.veranstalten();
		Paul.Gastunterhalten(Ali);
		Paul.bestellen(ipanem);
		Paul.unterhalten();
		Daniel.trinken();
	}

}
