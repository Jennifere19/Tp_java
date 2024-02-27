public class Equations {
    public static void main(String[] args) { // la methode main est appelée qu'a l'execution
        if (args.length == 3) { // Vérifier si d'abord les 3 arguments sont renseignés avant de faire un
                                // traitement

            // Recupération des valeurs de chaque coéfficient à partir des arguments
            // (conversion en double necessaire car les arguments sont de types String)
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]); // parseDouble(String s) est une méthode dans Double qui permet de
                                                    // convertir un String s en double
            double c = Double.parseDouble(args[2]);
            if (a == 0) {
                System.out.println((b == 0) ? "Pas de solution" : "Une solution : " + (-c / b)); // Affiche Pas de
                                                                                                 // solution si b=0 et
                                                                                                 // la seule solution
                                                                                                 // dans le cas
                                                                                                 // contraire
            } else { // si a != 0
                double delta = b * b - 4 * a * c; // Calcul de delta
                if (delta < 0) {
                    System.out.println("Pas de solution");
                } else if (delta == 0) {
                    System.out.println("Une solution : " + (-b / (2 * a)));
                } else {
                    // Affichage des deux solutions avec Math.sqrt pour calculer la racine carré de
                    // delta
                    System.out.println("Une solution x1 : " + ((-b - Math.sqrt(delta)) / (2 * a)) + " et x2: "
                            + ((-b + Math.sqrt(delta)) / (2 * a)));
                }
            }
        } else { // le nombre d'argument es différent de 3
            System.out.println("Merci de renseigner que 3 arguments");
        }
    }
}
