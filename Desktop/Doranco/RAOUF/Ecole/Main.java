package Ecole;



public class Main {
    public static void main(String[] args) {
        Enfant son = new Enfant("Chiboub","Raouf");
        System.out.println(son.toString());

        Parent pere = new Parent("Chiboub","Mohamed","Informaticien");
        Parent mere = new Parent("Malin","Lilas","Commerciale");

        son.addParent(pere);
        son.addParent(mere);

        son.addNote(8,"Histoire");
        son.addNote(10,"Philo");
        son.addNote(20,"Physique");

        son.removeParent("Chiboub");

        son.addNote(14,"EPS");

        System.out.println(son.toString());

    }
}
