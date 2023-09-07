package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    // </editor-fold>
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
    }

    public Personnage() {
        nom = "ddd";
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
    // TODO : Les setters
    // </editor-fold>
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
        System.out.println("Initiative : " + valeurMaxAttaque);

        if (pointsDeVie > 0) {
            System.out.println("Statut : Vivant");

        } else if (pointsDeVie <= 0) {
            System.out.println("Statut : Mort");

        }

    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
