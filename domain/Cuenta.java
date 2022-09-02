package domain;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
//        this.cantidad = 0;
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if (cantidad > 0) {
            this.cantidad = cantidad;
        }else{
            System.out.println("Esta insertando una cantidad negativa");
            System.out.println("Su saldo por defecto será de 0.00");
        }
    }
    
    public void abonar(double cantidad){
        this.cantidad += cantidad;
    }
    
    public void retirar(double cantidad){
        if (cantidad > this.cantidad) {
            System.out.println("Fondos Insuficientes");
        }else{
            this.cantidad -= cantidad;
        }
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
}
