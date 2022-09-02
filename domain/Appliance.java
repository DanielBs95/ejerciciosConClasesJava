package domain;

/**
 *
 * @author cleys
 */
public  class  Appliance {

    //attributes
    protected double basePrice;
    protected String color;
    protected char energyConsumption;
    protected double weight;

    //static attributes
    protected static final double DEF_BASEPRICE = 100.00;
    protected static final String DEF_COLOR = "Blanco";
    protected static final char DEF_ECONSUMPTION = 'F';
    protected static final double DEF_WEIGHT = 5.00;

    public Appliance() {
        this(DEF_BASEPRICE, DEF_COLOR, DEF_ECONSUMPTION, DEF_WEIGHT);
    }

    public Appliance(double basePrice, double weight) {
        this(basePrice, DEF_COLOR, DEF_ECONSUMPTION, weight);
    }

    public Appliance(double basePrice, String color, char energyConsumption, double weight) {
        this.basePrice = basePrice;
//        this.color = color;
        checkColor(color);
//        this.energyConsumption = energyConsumption;
        checkEConsumption(energyConsumption);
        this.weight = weight;

    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public String getColor() {
        return this.color;
    }

    public char getEnergyConsumption() {
        return this.energyConsumption;
    }

    public double getWeight() {
        return this.weight;
    }

    private void checkEConsumption(char letra) {
        switch (Character.toUpperCase(letra)) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                this.energyConsumption = letra;
                break;
            default:
                this.energyConsumption = DEF_ECONSUMPTION;
        }
//        return this.energyConsumption;
    }

    private void checkColor(String color) {
        switch (color.toUpperCase()) {
            case "BLANCO":
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS":
                this.color = color;
                break;
            default:
                this.color = DEF_COLOR;
        }
    }

    public  double finalPrice() {
        double fPrice=0.0;
        switch (Character.toUpperCase(this.energyConsumption)) {
            case 'A':
                fPrice = this.basePrice + 100.00;
                break;
            case 'B':
                fPrice = this.basePrice + 80.00;
                break;
            case 'C':
                fPrice = this.basePrice + 60.00;
                break;
            case 'D':
                fPrice = this.basePrice + 50.00;
                break;
            case 'E':
                fPrice = this.basePrice + 30.00;
                break;
            case 'F':
                fPrice = this.basePrice + 10.00;
                break;
        }

        if (this.weight >= 0 && this.weight <= 19) {
            fPrice += 10.00;
        } else if (this.weight >= 20 && this.weight <= 49) {
            fPrice += 50.00;
        } else if (this.basePrice >= 50 && this.weight <= 79) {
            fPrice += 80.00;
        } else {
            fPrice +=100.00;
        }
        return fPrice;
    }

    @Override
    public String toString() {
        return "Appliance{" + "basePrice=" + basePrice + ", color=" + color + ", energyConsumption=" + energyConsumption + ", weight=" + weight + '}';
    }

}

//if (this.weight >= 0 && this.weight <= 19) {
//                    this.basePrice = 100.00 + 10;
