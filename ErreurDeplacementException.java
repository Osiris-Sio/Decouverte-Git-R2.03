/*
R2.03 : TP1b
Professeur : M. Lecoeuche
Auteur : AMEDRO Louis, BUT1, TD2/TPD

licence CC BY SA
*/

public class ErreurDeplacementException extends Exception {

    private Position position1, position2;
    private Plateau plateau;

    /////////////////////////
    /// Constructeur :
    /////////////////////////

    public ErreurDeplacementException(Position position1, Position position2, Plateau plateau) {
        this.position1 = position1;
        this.position2 = position2;
        this.plateau = plateau;
    }

    /////////////////////////
    /// getMessage :
    /////////////////////////

    public String getMessage() {
        String retour = "";
        Piece piece = plateau.getCase(position1);
        if (piece == null) {
            retour = "Il n’y a pas de pièce à déplacer en " + position1.toString() + ".";
        } else if (!piece.getDeplacementPossible(plateau).contains(position2)) {
            retour = "Impossible de déplacer " + piece.toString() + ".";
        }
        if (retour.equals(""))
            retour = "Erreur de case occupee non detectée.\n";
        return retour;
    }
}
