package party;
import java.util.ArrayList;


public class Party {
	private String datum;
	private String ort;
	private ArrayList<Gäste> gäste;
	private Gastgeber gastgeber;
	private Theke theke;
	
	public Party(String datum, String ort, Gäste gast1, Gäste gast2, Gastgeber gastgeber, Theke theke) {
        this.datum = datum;
        this.ort = ort;
        this.gäste = new ArrayList<>(); 
        this.gäste.add(gast1);
        this.gäste.add(gast2);
        this.gastgeber = gastgeber;
        this.theke = theke;
	}

	// Getter und Setter
	
	public String getDatum() {
		return datum;
	}

	public String getOrt() {
		return ort;
	}

	public ArrayList<Gäste> getGäste() {
		return gäste;
	}

	public Gastgeber getGastgeber() {
		return gastgeber;
	}

	public Theke getTheke() {
		return theke;
	}
	
	
	//Methoden
	public String getGaeste() {
	    StringBuilder gästeNamen = new StringBuilder();
	    for (Gäste gast : gäste) {
	        gästeNamen.append(gast.getName()).append(", ");
	    	
	    }
	    //Entfernt das letzte Komma und Leerzeichen, falls vorhanden
	    if (gästeNamen.length() > 0) {
	        gästeNamen.setLength(gästeNamen.length() - 2);
	    }
	    return gästeNamen.toString();
	}

	
	public void addGast(Gäste gast) {
		this.gäste.add(gast);
		System.out.println(gast.getName()+ " wurde auf die Party eingeladen!");
	}
	
	public void removeGast(Gäste gast) {
		this.gäste.remove(gast);
		System.out.println(gast.getName()+ " wurde von den Türstehern rausgeschmissen");
	}
	public void veranstalten() {
		System.out.println("Die Party wird veranstaltet von "+ gastgeber.getName()+ " mit folgenden Gästen: "+ getGaeste());
	}
}
