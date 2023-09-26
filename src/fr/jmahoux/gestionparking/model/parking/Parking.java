package fr.jmahoux.gestionparking.model.parking;

public class Parking {

    private String nom;

    private int nbPlaces;

    private Emplacement[] emplacements;

    public Parking(int nbPlaces, String nom) {
        this.nbPlaces = nbPlaces;
        this.nom = nom;
        this.emplacements = new Emplacement[nbPlaces];
        this.init();
    }

    private void init() {
        // Charger les Emplacements par défaut
        for (int i =  0; i < nbPlaces; i++) {
            this.emplacements[i] = new Emplacement(i);
        }
    }

    public void setVehicule(Vehicule vehicule, int emplacement) {
        if (this.emplacements[emplacement].isFree()) {
            this.emplacements[emplacement].setVehicule(vehicule);
            this.emplacements[emplacement].setStatus(StatusEmplacement.INDISPO);
        }
    }

    public void display() {
        for (Emplacement emplacement : this.emplacements) {
            if (!emplacement.isFree()) {
                System.out.print(emplacement.toString() + " ");
                System.out.println(emplacement.getVehicule().toString());
            } else {
                System.out.println(emplacement.toString());
            }
        }
    }

}
