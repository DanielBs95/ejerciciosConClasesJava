package domain;

/**
 *
 * @author cleys
 */
public class Raices {
    private double a,b,c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    //Obtener raices
    public void obtenerRaices(){
        double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("Raiz x1 vale:");
        System.out.println(x1);
        System.out.println("Raiz x2 vale:");
        System.out.println(x2);
    }
    
    public void obtenerRaiz(){
        double x = (-b)/(2*a);
        System.out.println("Solo tiene una solución");
        System.out.println(x);
    }
    public double getDiscriminante(){
        double discriminante =(Math.pow(b, 2)-4*a*c);
        return discriminante;
    }
    
    public boolean tieneRaices(){
        if (getDiscriminante()>0) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean tieneRaiz(){
        if (getDiscriminante()==0) {
            return true;
        }else{
            return false;
        } 
    }
    
    public void calculoFinal(){
        if (tieneRaices()) {
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene solución");
        }
    }
}
