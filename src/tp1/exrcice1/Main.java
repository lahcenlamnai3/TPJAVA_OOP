package tp1.exrcice1;
public class Main{
    public static void main(String[] args) {
        Person person = new Person();
        person.initialiser();
        person.afficher(person.CIN,person.nom,person.prenom,person.email,person.age);
    }
}
