package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import personnages.Personnage.mirmillon;

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
        Bob.setValeurMaxAttaque(15);
        Bob.setValeurDefense(15);
        Bob.setPointsDeVie(70);
        Bob.setInitiative(15);

        Igor.setNom("Igor l'empaleur");
        Igor.setValeurMaxAttaque(25);
        Igor.setValeurDefense(5);
        Igor.setPointsDeVie(100);
        Igor.setInitiative(30);
        
        
        
        
         ///////////////////////////////////////////////////////
       Personnage.mirmillon bobMirmillon = Bob.new mirmillon(); 
       
       bobMirmillon.setNom("Bob le malchanceux");
       bobMirmillon.setPointsDeVie(70);
       bobMirmillon.setValeurMaxAttaque(15);
       bobMirmillon.setValeurDefense(15);
       bobMirmillon.setInitiative(15);
       bobMirmillon.afficherInfosPersonnage();
      // bobMirmillon.setNewInitiativeRandom();
       
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
                if (bobMirmillon.getInitiative() == i) {
                    Igor.frapperPersonnage(bobMirmillon);

                } else if (Igor.getInitiative() == i) {
                    bobMirmillon.frapperPersonnage(Igor);
                }
            }
            affichage.afficherSeparateurInfosPerso();
            bobMirmillon.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            bobMirmillon.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();

        } while (Bob.getPointsDeVie() > 0 && Igor.getPointsDeVie() > 0);
        affichage.afficheVictoire(Bob, Igor);
//        /////////////////////////////////////////////////
        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
    }

}
