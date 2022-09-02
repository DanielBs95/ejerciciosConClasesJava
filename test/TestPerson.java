package test;

import domain.Person;
import java.util.Scanner;

/**
 *
 * @author cleys
 */
public class TestPerson {

    public static void main(String[] args) {
        String name = "Juan";
        int age = 17;
        char sex = 'f';
        double weight = 70.0;
        double height = 1.68;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingresa nombre");
//        String name = entrada.nextLine();
//        System.out.println("Ingresa edad:");
//        int age = Integer.parseInt(entrada.nextLine());
//        System.out.println("Ingrese Sexo:");
//        char sex = entrada.nextLine().charAt(0);
//        System.out.println("Ingrese peso:");
//        double weight = Double.parseDouble(entrada.nextLine());
//        System.out.println("Ingrese altura:");
//        double height = Double.parseDouble(entrada.nextLine());

        Person person1 = new Person(name, age, sex, weight, height);
        Person person2 = new Person(name, age, sex);
        Person person3 = new Person();

        person3.setName("Paola");
        person3.setAge(26);
        person3.setSex('z');
        person3.setWeight(100);
        person3.setHeight(1.68);
        
//        boolean isOlder = person1.isOlder();

        System.out.println(person1 + "\n" + checkIdealWeight(person1) + "\n" +
                "La persona es mayode de edad? " +person1.isOlder() + "\n");
        
        System.out.println(person2 + "\n" + checkIdealWeight(person2) + "\n" +
                "La persona es mayode de edad? " +person2.isOlder() + "\n");
        
        System.out.println(person3 + "\n" + checkIdealWeight(person3) + "\n" +
                "La persona es mayode de edad? " +person3.isOlder());

    }

    public static String checkIdealWeight(Person person) {
        if (person.calculatorIMC() == 0) {
            return "La persona esta en su peso ideal";
        } else if (person.calculatorIMC() == -1) {
            return "La persona esta por debajo de su peso";
        } else if(person.calculatorIMC() == 1){
            return "La persona esta con sobrepeso";
        }else{
            return "EL PESO NO SE HA INGRESADO";
        }
    }

}
