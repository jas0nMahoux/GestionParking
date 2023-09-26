package fr.jmahoux.gestionparking.model.construction;

import fr.jmahoux.gestionparking.model.parking.Parking;

public class Construction {

    private int superficie;

    private String adresse;

    private int nbEtage;

    private int nbFenetre;

    private Parking parking;

    public Construction(String adresse, int superficie, int nbFenetre, int nbEtage) {
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbFenetre = nbFenetre;
        this.nbEtage = nbEtage;
    }

    public int getSuperficie() {
        return superficie;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbEtage() {
        return nbEtage;
    }

    public int getNbFenetre() {
        return nbFenetre;
    }

    public Parking getParking() {
        return this.parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
