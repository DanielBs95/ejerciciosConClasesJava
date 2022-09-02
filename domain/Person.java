package domain;

/**
 *
 * @author cleys
 */
public class Person {

    private String name;
    private int age;
    private String dni;
    private char sex;
    private double weight;
    private double height;

    //Constantes
    private static char SEX_DEFAULT = 'M';
    private static int IDEAL_WEIGHT = 0;
    private static int UNDER_WEIGHT = -1;
    private static int OVER_WEIGHT = 1;
    private static int UNKNOW_WEIGH = 100;

    public Person() {
        this("", 0, Person.SEX_DEFAULT, 0.0, 0.0);

    }

    public Person(String name, int age, char sex) {
        this(name, age, sex, 0.0, 0.0);
    }

    public Person(String name, int age, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.dni = generateDNI();
        this.sex = sex;
        checkSex(sex);
        this.weight = weight;
        this.height = height;
    }

    public int calculatorIMC() {
        double imc = this.weight / (Math.pow(this.height, 2));
        if (imc < 20) {
            return Person.UNDER_WEIGHT;
        } else if (imc <= 25 && imc >= 20) {
            return Person.IDEAL_WEIGHT;
        } else if(imc > 25){
            return Person.OVER_WEIGHT;
        }else{
            return Person.UNKNOW_WEIGH;
        }
    }

    public boolean isOlder() {
        boolean older = false;
        if (this.age >= 18) {
            older = true;
        } else {
            older = false;
        }

        return older;
    }

    private String generateDNI() {
        String dni;
        int numberRandom = (int) (10000000 + Math.random() * 90000000);
        char letterRandom = (char) Math.floor(Math.random() * (90 - 65 + 1) + 65);
        dni = String.valueOf(numberRandom) + letterRandom;
        return dni;
    }

    public void checkSex(char sex) {
        if (Character.toUpperCase(sex) == 'M'
                || Character.toUpperCase(sex) == 'F') {
            this.sex = Character.toUpperCase(sex);
        } else {
            this.sex = Person.SEX_DEFAULT;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", dni=").append(dni);
        sb.append(", sex=").append(sex);
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        checkSex(sex);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDni() {
        return dni;
    }

    public char getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

}
