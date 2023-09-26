package fr.jmahoux.gestionparking.model.parkingetage;

import fr.jmahoux.gestionparking.model.parking.Parking;

public class ParkingEtage {

    private Parking[] parkingEtage = new Parking[3];

    public ParkingEtage() {
        this.parkingEtage[0] = new Parking(20, "Etage 1");
        this.parkingEtage[1] = new Parking(20, "Etage 2");
        this.parkingEtage[2] = new Parking(20, "Etage 3");
    }
}
