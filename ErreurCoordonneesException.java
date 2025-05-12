/*
R2.03 : TP1b
Professeur : M. Lecoeuche
Auteur : AMEDRO Louis, BUT1, TD2/TPD

licence CC BY SA
*/

public class ErreurCoordonneesException extends Exception {
    // Attributs :
    private int x, y;

    /////////////////////////
    /// Constructeurs :
    /////////////////////////

    public ErreurCoordonneesException() {
        this.x = 0;
        this.y = 0;
    }

    public ErreurCoordonneesException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /////////////////////////
    /// getMessage :
    /////////////////////////

    public String getMessage() {
        String retour = "";
        if (this.x < 0 || this.x > 7)
            retour = "Erreur dans la position X : " + x + " - Les indices doivent être compris entre 0 et 7.\n";
        if (this.y < 0 || this.y > 7)
            retour = retour + "Erreur dans la position Y : " + y
                    + " - Les indices doivent être compris entre 0 et 7.\n";
        if (retour.equals(""))
            retour = "Erreur de coodonnées non detectée.\n";
        return retour;
    }
}
