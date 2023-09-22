package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Mirmillon;
import personnages.Retiaire;

public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
//        Personnage Bob = new Personnage("Bob le malchanceux", 70, 15, 15, 15);
//        Personnage Igor = new Personnage("Igor l'empaleur", 100, 25, 5, 30);
        Mirmillon bob = new Mirmillon("Bob le malchanceux", 70, 15, 15, 15);
        Retiaire igor = new Retiaire("Igor l'empaleur", 100, 25, 5, 30);

        igor.setNom("Igor l'empaleur");
        igor.setValeurMaxAttaque(25);
        igor.setValeurDefense(5);
        igor.setPointsDeVie(100);
        igor.setInitiative(30);

        ///////////////////////////////////////////////////////
//       Personnage.mirmillon bobMirmillon = Bob.new mirmillon(); 
//       
//       bobMirmillon.setNom("Bob le malchanceux");
//       bobMirmillon.setPointsDeVie(70);
//       bobMirmillon.setValeurMaxAttaque(15);
//       bobMirmillon.setValeurDefense(15);
//       bobMirmillon.setInitiative(15);
//       bobMirmillon.afficherInfosPersonnage();
        // bobMirmillon.setNewInitiativeRandom();
//        bob.setNom("Bob le malchanceux");
//       bob.setPointsDeVie(70);
//       bob.setValeurMaxAttaque(15);
//       bob.setValeurDefense(15);
//       bob.setInitiative(15);
        bob.afficherInfosPersonnage();
        igor.afficherInfosPersonnage();

        //bobMirmillon.afficherInfosPersonnage();
        //Bob.afficherInfosPersonnage();
        ///////////////////////////////////////////////////////////////
        //test
        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        // TODO : Afficher les infos de chaque personnage
        // TODO : Afficher le message du début du combat
        // tour.afficheTour();
        //  Bob.afficherInfosPersonnage();
        // Igor.afficherInfosPersonnage();
        // affichage.afficherDebutCombat();
        affichage.afficherDebutCombat();

        // </editor-fold>
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        // TODO : La boucle contenant les étapes du combat
        do {
            tour.afficheTour();
            for (int i = 0; i < 100; i++) {
                if (bob.getInitiative() == i) {
                    if (igor.getPointsDeVie() > 0) {
                        igor.frapperPersonnage(bob);
                    }

                } else if (igor.getInitiative() == i) {
                    if (bob.getPointsDeVie() > 0){
                    bob.frapperPersonnage(igor);
                    }
                }
            }
            affichage.afficherSeparateurInfosPerso();
            bob.afficherInfosPersonnage();
            igor.afficherInfosPersonnage();
            bob.setNewInitiativeRandom();
            igor.setNewInitiativeRandom();
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();

        } while (bob.getPointsDeVie() > 0 && igor.getPointsDeVie() > 0);
        affichage.afficheVictoire(bob, igor);
//        /////////////////////////////////////////////////
        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
    }

}
