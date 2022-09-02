package test;

import domain.Appliance;
import domain.Tv;
import domain.WashingMachine;

/**
 *
 * @author cleys
 */
public class MainAll {

    public static void main(String[] args) {

        Appliance appliances[] = new Appliance[10];

        appliances[0] = new WashingMachine(30, 2000, "Rojo", 'b', 60);
        appliances[1] = new Tv(50, true, 2000, "Negro", 'C', 15);
        appliances[2] = new WashingMachine(80, 1000, "Rojo", 'B', 20);
        appliances[3] = new Tv(21, false, 2800, "Gris", 'B', 80);
        appliances[4] = new WashingMachine(35, 2850, "Azul", 'B', 49);
        appliances[5] = new Tv(70, true, 5500, "Azul", 'B', 75);
        appliances[6] = new WashingMachine(31, 3650, "Negro", 'B', 82);
        appliances[7] = new Tv(56, false, 3120, "Blanco", 'B', 60);
        appliances[8] = new WashingMachine(55, 3000, "Gris", 'B', 40);
        appliances[9] = new Tv(45, true, 2500, "Rojo", 'B', 15);

        double priceWm = 0.0;
        double priceTv = 0.0;
        double total = 0.0;
        System.out.println("Precio de lavadoras:");
        for (Appliance appliance : appliances) {
            if (appliance instanceof WashingMachine) {
                priceWm += appliance.finalPrice();
                System.out.println("Precio Lavadora:" + appliance.finalPrice());
            }
        }
        System.out.println("");
        System.out.println("Precio de Televisores");
        for (Appliance appliance : appliances) {
            if (appliance instanceof Tv) {
                priceTv += appliance.finalPrice();
                System.out.println("Precio de Televisores:" + appliance.finalPrice());
            }
            if (appliance instanceof Appliance) {
                total += appliance.finalPrice();
            }
        }

        System.out.println("**********Totales**********");

        System.out.println("Precio total de Tvs: " + priceTv);
        System.out.println("Precio total de Lavadoras: " + priceWm);
        System.out.println("Precio total de Electrodomesticos: " + total);

    }

}
