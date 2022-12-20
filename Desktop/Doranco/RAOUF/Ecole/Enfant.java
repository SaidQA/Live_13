package Ecole;

import java.util.ArrayList;
import java.util.List;

public class Enfant {
    String nom,prenom;
    List<Integer> listeNotes = new ArrayList<>();
    List<Parent> listeParents = new ArrayList<>();

    public Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }

    public void addNote(int note,String matiere){
        listeNotes.add(note);
        NotifyAll(note,matiere);

    }

    public void addParent(Parent par){
        System.out.println("Ajout du parent "+par.nom +" "+par.prenom+" à la liste des observers de l'enfant "
        + this.nom+ " "+this.prenom);

        listeParents.add(par);
    }

    public void removeParent(String nom){
        for(int i=0;i<listeParents.size(); i++){

            if(listeParents.get(i).nom == nom){
                listeParents.remove(i);
            }
        }

    }

    public void NotifyAll(int note,String matiere){
        System.out.println("Notification des parents");
        for(int i=0;i < listeParents.size(); i++){
            System.out.println(listeParents.get(i).nom+" "+listeParents.get(i).prenom+" a été notifié de la note en "
            +matiere);
            listeParents.get(i).update(note,matiere);

        }
    }


    @Override
    public String toString() {
        return "Enfant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", listeNotes=" + listeNotes +
                '}';
    }
}
