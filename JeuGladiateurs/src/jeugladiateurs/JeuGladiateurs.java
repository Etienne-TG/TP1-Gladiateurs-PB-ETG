package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage Bob = new Personnage("Bob le malchanceux", 70, 15, 15, 15);
        Personnage Igor = new Personnage("Igor l'empaleur", 100, 25, 5, 30);

        Bob.setNom("Bob le malchanceux");
        Bob.setValeurMaxAttaque(70);
        Bob.setValeurDefense(15);
        Bob.setPointsDeVie(15);
        Bob.setInitiative(15);

        Igor.setNom("Igor l'empaleur");
        Igor.setValeurMaxAttaque(100);
        Igor.setValeurDefense(25);
        Igor.setPointsDeVie(5);
        Igor.setInitiative(30);

        //test
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        // TODO : Afficher les infos de chaque personnage
        // TODO : Afficher le message du début du combat
        tour.afficheTour();
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();

        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        // TODO : La boucle contenant les étapes du combat
        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
    }

}
