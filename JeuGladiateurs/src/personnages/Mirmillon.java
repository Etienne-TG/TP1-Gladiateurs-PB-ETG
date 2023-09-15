
package personnages;

import java.util.Random;


public class Mirmillon extends Personnage {
    public Mirmillon(String nom, int pvs, int attaqueMax, int defense, int ini) {
        super(nom, pvs, attaqueMax, defense, ini);
    }

    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int initiativeRandom;
        initiativeRandom = rand.nextInt(30 - 0) + 0;
        initiative = initiativeRandom;
    }

    @Override
    public void afficherInfosPersonnage() {

        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println();

        System.out.println(nom);
        System.out.println("Classe : Mirmillon");
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
    //////////////////////////////////////////////////////

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int forceFrappe = attaqueCalcul();

        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
        int dommages = forceFrappe - personnageCible.valeurDefense;

        if (dommages < 0) {
            dommages = 0;
        }
        personnageCible.pointsDeVie = personnageCible.pointsDeVie - dommages;

        if (personnageCible.pointsDeVie < 0) {
            personnageCible.pointsDeVie = 0;
        }

        System.out.println();
        System.out.println(nom + " attaque avec une puissance de : " + forceFrappe);
        System.out.println(personnageCible.nom + " a une defense de : " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
        if (personnageCible.pointsDeVie != 0) {
            forceFrappe = attaqueCalcul();

            //modifier les points de vie du personnage cible, afficher les détails
            // sur l'attaque, tel que montré dans l'énoncé.
            dommages = forceFrappe - personnageCible.valeurDefense;

            if (dommages < 0) {
                dommages = 0;
            }
            personnageCible.pointsDeVie = personnageCible.pointsDeVie - dommages;

            if (personnageCible.pointsDeVie < 0) {
                personnageCible.pointsDeVie = 0;
            }
            System.out.println();
            System.out.println(nom + " attaque une deuxieme fois avec une puissance de : " + forceFrappe);
            System.out.println(personnageCible.nom + " a une defense de : " + personnageCible.valeurDefense);
            System.out.println("Les dommages sont donc de : " + dommages);
        } else  {
            System.out.println(nom + " decapite son adversaire!");

        }

    }

}
