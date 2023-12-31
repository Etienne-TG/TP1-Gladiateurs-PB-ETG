package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    protected String nom;
    protected int pointsDeVie;
    protected int valeurMaxAttaque;
    protected int valeurDefense;
    protected int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int pvs, int attaqueMax, int defense, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
        
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;

        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getInitiative() {
        return initiative;
    }

    // TODO : Les setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {

        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println();

        System.out.println(nom);

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

    protected int attaqueCalcul() {
        Random rand = new Random();
        int valeurAttaque;
        valeurAttaque = rand.nextInt(valeurMaxAttaque - 0) + 0;
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return valeurAttaque;
    }

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

    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();
        int initiativeRandom;
        initiativeRandom = rand.nextInt(100 - 0) + 0;
        initiative = initiativeRandom;
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
