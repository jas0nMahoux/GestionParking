package fr.jmahoux.gestionparking.model.parking;

public class Vehicule {

    private String marque;

    private String model;

    private String matricule;

    public Vehicule(String marque, String model, String matricule) {
        this.marque = marque;
        this.model = model;
        this.matricule = matricule;
    }

    public String getMarque(){
        return this.marque;
    }

    public String getModel(){
        return this.model;
    }

    public String getMatricule(){
        return this.matricule;
    }

    public String toString() {
        return "C'est une " + getMarque() + " modele " + getModel() + " avec matricule " + getMatricule();
    }
}
