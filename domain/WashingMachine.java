package domain;

/**
 *
 * @author cleys
 */
public class WashingMachine extends Appliance {

    //Attributes
    private double burden;

    //static attributes
    private static double DEF_BURDEN = 5.00;

    public WashingMachine() {
        this(DEF_BURDEN, DEF_BASEPRICE, DEF_COLOR, DEF_ECONSUMPTION, DEF_WEIGHT);
    }

    public WashingMachine(double basePrice, double weight) {
        this(DEF_BURDEN, basePrice, DEF_COLOR, DEF_ECONSUMPTION, weight);
    }

    public WashingMachine(double burden, double basePrice, String color, char energyConsumption, double weight) {
        super(basePrice, color, energyConsumption, weight);
        this.burden = burden;
    }

    public double getBurden() {
        return this.burden;
    }

    @Override
    public double finalPrice() {
//        return super.finalPrice(); //To change body of generated methods, choose Tools | Templates.
       double finalPriceW = super.finalPrice();
        if (this.burden > 30) {
            return finalPriceW +=  50;
        }else{
            return super.finalPrice();
        }
    }

}
