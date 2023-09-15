package personnages;

import java.util.Random;

public class Retiaire extends Personnage {

            boolean filet = false;

    public Retiaire(String nom, int pvs, int attaqueMax, int defense, int ini) {
        super(nom, pvs, attaqueMax, defense, ini);
    }

    @Override
    public void afficherInfosPersonnage() {

        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println();

        System.out.println(nom);
        System.out.println("Classe : tertiaire");
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Defense : " + valeurDefense);
        System.out.println("Points de vie : " + pointsDeVie);
        System.out.println("Initiative : " + initiative);
        //System.out.println("Classe : " + Personnage..mirmillon.classe);

        if (pointsDeVie > 0) {
            System.out.println("Statut : Vivant");

        } else if (pointsDeVie <= 0) {
            System.out.println("Statut : Mort");

        }

    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        Random rand = new Random();
        int nombreRandom;
        nombreRandom = rand.nextInt(100 - 0) + 0;
        
        int forceFrappe = attaqueCalcul();
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
         if (filet == false){
            System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
            filet = true;
        }
         else if (filet == true) {

            System.out.println("Igor l'empaleur lance son filet");
            filet = false;
            if (nombreRandom == 0 || nombreRandom == 1 || nombreRandom == 2 || nombreRandom == 3 || nombreRandom == 4 || nombreRandom == 5 || nombreRandom == 6 || nombreRandom == 7 || nombreRandom == 8 || nombreRandom == 9) {
                System.out.println("Son filet attrape Bob le malchanceux et il l'empale sauvagement avec sa lance");
                personnageCible.pointsDeVie = 0;
            }
            else{
                System.out.println("le filet n'atteint pas sa cible!");
                filet = false;
            }
        }
        
        

//        int dommages = forceFrappe - personnageCible.valeurDefense;
//
//        if (dommages < 0) {
//            dommages = 0;
//        }
//        personnageCible.pointsDeVie = personnageCible.pointsDeVie - dommages;
//
//        if (personnageCible.pointsDeVie < 0) {
//            personnageCible.pointsDeVie = 0;
//        }
//        System.out.println();
//        System.out.println(nom + " attaque avec une puissance de : " + forceFrappe);
//        System.out.println(personnageCible.nom + " a une defense de : " + personnageCible.valeurDefense);
//        System.out.println("Les dommages sont donc de : " + dommages);

    }

}
