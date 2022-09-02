package domain;

/**
 *
 * @author cleys
 */
public class Tv extends Appliance {

    //attributes
    private double resolution;
    private boolean tdt;

    //Constantes
    private static final double DEF_RESOLUTION = 20.0;
    private static final boolean DEF_TDT = false;

    public Tv() {
        this(DEF_RESOLUTION, DEF_TDT, DEF_BASEPRICE, DEF_COLOR, DEF_ECONSUMPTION, DEF_WEIGHT);
    }

    public Tv(double resolution, boolean tdt) {
        this(resolution, tdt, DEF_BASEPRICE, DEF_COLOR, DEF_ECONSUMPTION, DEF_WEIGHT);
    }

    public Tv(double resolution, boolean tdt, double basePrice, String color, char energyConsumption, double weight) {
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double finalPrice() {
//        return super.finalPrice(); //To change body of generated methods, choose Tools | Templates.
        double finalPriceTv = super.finalPrice();
        if (this.resolution > 40) {
            finalPriceTv += super.finalPrice() * 0.30;
        }
        if (this.tdt) {
            finalPriceTv += 50.00;
        }
        return finalPriceTv;
    }

}
