package tp1.exercice1;

public class Person {
    private String CIN;
    String nom;
    String prenom ;
    String email;
    int age ;
    public void initialiser(String CIN, String nom, String prenom, String email, int age){
        this.CIN =CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    public void afficher(Person person){
        System.out.println("CIN : " + person.CIN);
        System.out.println("Nom : " + person.nom);
        System.out.println("Prénom : " + person.prenom);
        System.out.println("Email : " + person.email);
        System.out.println("Age : " + person.age);

}}
