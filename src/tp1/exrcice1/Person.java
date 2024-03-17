package tp1.exrcice1;

public class Person {
    String CIN;
    String nom;
    String prenom ;
    String email;
    int age ;
    public void initialiser(){
        this.CIN ="PB125236";
        this.nom = "lamnai";
        this.prenom = "lahcen";
        this.email = "lahcen12@gmail.com";
        this.age = 21;
    }
    public void afficher(String CIN,String nom ,String prenom ,String email , int age){
        System.out.println(CIN +" "+ nom+" " +prenom + " "+email + " " + age);
    }
}
