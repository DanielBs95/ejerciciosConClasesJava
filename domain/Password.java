package domain;

/**
 *
 * @author cleys
 */
public class Password {

    private int length;
    private String password;

    //CONSTANTES
    private static int DEFAULT_LENGTH = 8;

    public Password() {
        this(Password.DEFAULT_LENGTH, "");
    }

    public Password(int length) {
        this.length = length;
        this.password = generatePassword();
    }

    public Password(int length, String password) {
        this.length = length;
        this.password = password;
    }

    private String generatePassword() {

        String pwd = "";
        for (int i = 0; i < this.length; i++) {
            int randomN = (int) (Math.random() * (3 - 1 + 1) + 1);
            if (randomN == 1) {
                char numbers = (char) (Math.random() * (57 - 49 + 1) + 49);
                pwd += numbers;
            } else if (randomN == 2) {
                char minusculas = (char) (Math.random() * (122 - 97 + 1) + 97);
                pwd += minusculas;
            } else {
                char mayusculas = (char) (Math.random() * (90 - 65 + 1) + 65);
                pwd += mayusculas;
            }

        }
        return pwd;
    }

    public boolean isStrong() {
        int counterNumbers = 0;
        int counterCapital = 0;
        int counterLower = 0;
        for (int i = 0; i < this.password.length(); i++) {
            char x = (char) this.password.charAt(i);
            if (x >= 49 && x <= 57) {
                counterNumbers++;
            }else if(x >=65 && x<=90){
                counterCapital++;
            }else{
                counterLower++;
            }
        }
        
        if (counterCapital > 2 && counterLower > 1 && counterNumbers > 5) {
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Password:" + ", password= " + password;
    }

}
