package projet0001;

public class Parking {
    private int duree;
    private String periode;
    private double taux;

    private static final double TARIF_JOUR = 2.5;
    private static final double TARIF_NUIT = 1.8;

    public Parking(int duree, String periode, double taux) {
        this.duree = duree;
        this.periode = periode;
        this.taux = taux;
    }

    public double calculerMontant() {
        double tarif = periode.equalsIgnoreCase("jour") ? TARIF_JOUR : TARIF_NUIT;
        double montant = duree * tarif;
        return montant - (montant * (taux / 100));
    }

    public int getDuree() { return duree; }
    public String getPeriode() { return periode; }
    public double getTaux() { return taux; }
}
