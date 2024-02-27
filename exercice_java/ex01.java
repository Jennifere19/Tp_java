class Personne { // Object
    public String nom;
    public String prenom;
    public String cni;

    public Personne() {}

    public Personne(String vPrenom, String vNom, String vCni) {
        prenom = vPrenom;
        nom = vNom;
        cni = vCni;
    }

    void travailler() {
        System.out.println(prenom + " " + nom + " travaille");
    }

    void seRepose() {
        System.out.println(prenom + " " + nom + " se repose");
    }

    public boolean equals(Personne pers) {
        return (cni.equals(pers.cni));
    }
}

/**
 * ExempleOne
 */
public class ExempleOne {
    public static void main(String[] args) {
       Personne personne1 = new Personne(); // Constructeur 
       Personne personne2 = new Personne();

       personne1.nom = "BA";
       personne1.prenom = "Demba";
       personne1.cni = "2433454656";

       personne2.nom = "BA";
       personne2.prenom = "Demba";
       personne2.cni = "2433454656";

       System.out.println(personne1);      
       System.out.println(personne2);

       System.out.println("Comparaison de référence : " + (personne1 == personne2));
       System.out.println("Comparaison de contenu : " + (personne1.equals(personne2)));

    }
    
}
