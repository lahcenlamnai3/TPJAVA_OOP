package tp1.exercice3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point('x',3);
        point.afficherpoint();
        System.out.println("apres translation  ");
        point.translate(4);
        point.afficherpoint();
    }

}
