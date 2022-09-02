package test;

import domain.Cuenta;

/**
 *
 * @author cleys
 */
public class TestCuenta {

    public static void main(String[] args) {
//        Cuenta account = new Cuenta("Daniel");
//        account.abonar(1733.50);
//        account.retirar(150);
//        account.retirar(83.5);
//        
        Cuenta account2 = new Cuenta("Pedrito", -100);
        System.out.println(account2.toString());
        account2.retirar(100);
        account2.abonar(1500);
        System.out.println(account2);
//        System.out.println(account.toString());

    }

}
