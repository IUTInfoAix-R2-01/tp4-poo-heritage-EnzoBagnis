package Cycles;

import java.util.Random;

public class Velo {
    private static double DEFAUT_BRAQUET = 13.0;
    private double braquet;
    private double diamRoue;
    private Random genAlea = new Random();

    public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		genAlea = new Random();
		
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
		this.diamRoue = 2.5; //Diamètre de roue par défaut a 2.5 car sinon mettre a 0 signifie qu'elle n'a pas de roue est un vélo sans roue n'est pas un vélo
		genAlea = new Random();
	}
	
	public Velo() {
		this.braquet = DEFAUT_BRAQUET;
		this.diamRoue = 2.5; //Diamètre de roue par défaut a 2.5 car sinon mettre a 0 signifie qu'elle n'a pas de roue est un vélo sans roue n'est pas un vélo
		genAlea = new Random();
	}

    // Getters
    public double getBraquet() {
        return braquet;
    }

    public double getDiamRoue() {
        return diamRoue;
    }

    // Setters
    public void setBraquet(double braquet) {
        this.braquet = braquet;
    }

    public void setDiamRoue(double diamRoue) {
        this.diamRoue = diamRoue;
    }

    @Override
    public String toString() {
        return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
    }

    public double getPuissance(double frequenceCoupsDePedale) {
        return frequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
    }
    
    
    
}


