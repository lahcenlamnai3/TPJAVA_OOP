package tp1.exercice2;

public class Point {
    private char nom_point;
    private double abscisse;

    public void inisialiser_point(char nom_point, double abscisse) {
        this.nom_point = nom_point;
        this.abscisse = abscisse;
    }

    public void inisialiser_objet(Point objet) {
        objet.nom_point = 'y';
        objet.abscisse = 12.89;
    }

    public void afficher_point() {
        System.out.println(nom_point + " : " + abscisse);

    }
    public void translate(double valeur){
        abscisse+=valeur;
    }
}
