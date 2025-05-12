/*
R2.03 : TP1b
Professeur : M. Lecoeuche
Auteur : AMEDRO Louis, BUT1, TD2/TPD

licence CC BY SA
*/

public class RoiNonTrouveException extends Exception {

    private char couleur;

    /////////////////////////
    /// Constructeur :
    /////////////////////////

    public RoiNonTrouveException(char couleur) {
        this.couleur = couleur;
    }

    /////////////////////////
    /// getMessage :
    /////////////////////////

    public String getMessage() {
        return "Le roi " + couleur + " est introuvable.";
    }
}
