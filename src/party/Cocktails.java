package party;

import java.util.List;

public class Cocktails {
    private String name;
    private List<String> zutaten; 
    private boolean alkoholhaltig;

    
    public Cocktails(String name, boolean alkoholhaltig, List<String> zutaten) {
        this.name = name;
        this.alkoholhaltig = alkoholhaltig;
        this.zutaten = zutaten;
        
    }

    
    public String getName() {
        return name;
    }

    

    public List<String> getZutaten() {
        return zutaten;
    }

    

    public boolean isAlkoholhaltig() {
        return alkoholhaltig;
    }

    

    // Methode, um die Details des Cocktails anzuzeigen
    public void CocktailDetails() {
        System.out.println("Cocktail: " + name);
        System.out.println("Alkoholhaltig: " + (alkoholhaltig ? "Ja" : "Nein"));
        System.out.println("Zutaten: " + String.join(", ", zutaten));
    }
}

