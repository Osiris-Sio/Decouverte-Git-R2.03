/*
R2.03 : TP1b
Professeur : M. Lecoeuche
Auteur : AMEDRO Louis, BUT1, TD2/TPD

licence CC BY SA
*/

public class CouleurPieceException extends Exception {
    private char couleur;

    /////////////////////////
    /// Constructeurs :
    /////////////////////////

    public CouleurPieceException() {
        this.couleur = 'B';
    }

    public CouleurPieceException(char couleur) {
        this.couleur = couleur;
    }

    /////////////////////////
    /// getMessage :
    /////////////////////////

    public String getMessage() {
        String retour = "";
        if (this.couleur != 'B' || this.couleur != 'N')
            retour = "Erreur dans la couleur de la pièce : " + couleur + " - La couleur doit être B ou N.\n";
        if (retour.equals(""))
            retour = "Erreur de couleur non detectée.\n";
        return retour;
    }
}
