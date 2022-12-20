package Ecole;

public class Parent {
    String nom,prenom,profession;

    public Parent(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
    }

    public void update(int note,String matiere){
        if(note<10){
            System.out.println(this.nom+" "+this.prenom+" va gronder l'enfant à cause de sa note");
        }
        else if (note>15){
            System.out.println(this.nom+" "+this.prenom+" va féliciter l'enfant pour note");
        }
        else{
            System.out.println(this.nom+" "+this.prenom+" va encourager son enfant à faire mieux");
        }

    }


    @Override
    public String toString() {
        return "Parent{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
