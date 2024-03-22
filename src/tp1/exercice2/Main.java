package tp1.exercice2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        //Question 1
        point.inisialiser_point('a', 6.99);
        point.afficher_point();
        //Qestion 2
        point.inisialiser_objet(point);
        point.afficher_point();
        System.out.println("la translation d'abscisse : ");
        point.translate(2);
        System.out.println("apres la translation : ");
        point.afficher_point();

    }
}
