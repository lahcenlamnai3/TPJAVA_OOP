package tp1.exercice3;

import javax.security.auth.callback.CallbackHandler;

public class Point {
    char nom_point;
    double abscisse;
    public Point(char nom , double abscisse){
        this.nom_point=nom;
        this.abscisse=abscisse;
    }
    public void afficherpoint(){
        System.out.println("point: nom : "+nom_point+" , abscisse : "+abscisse);
    }
    public void translate(double val){
        abscisse+=val;
    }
}
