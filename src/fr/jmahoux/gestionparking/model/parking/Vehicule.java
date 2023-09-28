package fr.jmahoux.gestionparking.model.parking;

public class Vehicule {

    private String marque;

    private String model;

    private String matricule;

    public Vehicule(Builder builder) {
        this.matricule = builder.matricule;
        this.marque = builder.marque;
        this.marque = builder.marque;
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

    public static class Builder {

        private String marque = "Marque";

        private String model = "Model";

        private String matricule = "XXX-XXX-XXX";

        public Builder setBrand(String marque) {
            this.marque = marque;
            return  this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return  this;
        }

        public Builder setMatricule(String matricule) {
            this.matricule = matricule;
            return  this;
        }

        public Vehicule build() {
            return new Vehicule(this);
        }

    }
}
