package Cycles;

public class VeloElec extends Velo {
    private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

    // Constructeurs
    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super(diamRoue); // Utilise le braquet par défaut
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec() {
        super(); // Velo par défaut
        this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }

    public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
        this.facteurPuissanceMoteur = facteurPuissanceMoteur;
    }
    
    public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_COUPLE_MOTEUR;
	}

    @Override
    public String toString() {
        return super.toString() + " | VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }

    @Override
    public double getPuissance(double frequenceCoupsDePedale) {
        return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
    }


    
}
