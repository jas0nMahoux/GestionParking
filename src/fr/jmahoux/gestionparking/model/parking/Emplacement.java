package fr.jmahoux.gestionparking.model.parking;

public class Emplacement {

    private int id;

    private Vehicule vehicule;

    private StatusEmplacement status; // 0 = dispo, 1 = indispo, 2 = reserve

    public Emplacement (int id) {
        this.id = id;
        this.status = StatusEmplacement.DISPO;
        this.vehicule = null;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public void setStatus(StatusEmplacement status) {
        this.status = status;
    }

    public Vehicule getVehicule() {
        return this.vehicule;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        if (this.status == StatusEmplacement.DISPO) {
            return "Disponible";
        } else if (this.status == StatusEmplacement.INDISPO) {
            return "Indisponible";
        } else if (this.status == StatusEmplacement.RESERVE) {
            return "Reservé";
        } else {
            return "Reservé Handicapé";
        }
    }

    public Boolean isFree() {
        return this.status == StatusEmplacement.DISPO;
    }

    public String toString() {
        return "Emplacement " + this.getId() + " : " + this.getStatus();
    }
}
