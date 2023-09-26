package fr.jmahoux.gestionparking;

import fr.jmahoux.gestionparking.model.parking.Parking;
import fr.jmahoux.gestionparking.model.parking.Vehicule;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenue au Parking");

        Parking parking = new Parking(20, "Sup de Parking");

        Vehicule vehicule1 = new Vehicule("Tesla", "X", "XXX-23-276");
        System.out.println(vehicule1.toString());

        Vehicule vehicule2 = new Vehicule("Ford", "Fiesta", "XXX-78-374");
        System.out.println(vehicule2.toString());

        parking.setVehicule(vehicule1, 1);
        parking.setVehicule(vehicule2, 3);

        parking.display();

    }

}