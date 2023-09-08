package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    int cptrTours;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        // TODO : Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
        cptrTours = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Le getter
    public int getCptrTours() {
        return cptrTours;
    }

    // TODO : Le setter
    public void setCptrTours(int cptrTours) {
        this.cptrTours = cptrTours;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        cptrTours++;
        // TODO : Incrémenter le compteur de tour
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montré dans l'énoncé
        System.out.println("----------------");
        System.out.println("TOUR ACTUEL: " + cptrTours);
        System.out.println("----------------");

    }
    // </editor-fold>
}
