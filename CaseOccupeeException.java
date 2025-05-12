/*
R2.03 : TP1b
Professeur : M. Lecoeuche
Auteur : AMEDRO Louis, BUT1, TD2/TPD

licence CC BY SA
*/

public class CaseOccupeeException extends Exception {
    private Piece piece1, piece2;

    /////////////////////////
    /// Constructeur :
    /////////////////////////

    public CaseOccupeeException(Piece piece1, Piece piece2) {
        this.piece1 = piece1;
        this.piece2 = piece2;
    }

    /////////////////////////
    /// getMessage :
    /////////////////////////

    public String getMessage() {
        String retour = "";
        if (piece1.getPosition().equals(piece2.getPosition()))
            retour = "Impossible de placer " + piece1.toString() + " . " + piece2.toString() + " est déjà présent.\n";
        if (retour.equals(""))
            retour = "Erreur de case occupee non detectée.\n";
        return retour;
    }
}
