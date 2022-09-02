package test;

import domain.Password;

/**
 *
 * @author cleys
 */
public class TestPassword {

    public static void main(String[] args) {

        Password passwords[] = new Password[10];
        boolean strongs[] = new boolean[10];

        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(12);
            System.out.println(passwords[i] + " " + passwords[i].isStrong());
            if (passwords[i].isStrong()) {
                strongs[i] = passwords[i].isStrong();
            } else {
                strongs[i] = false;
            }
        }

        for (int i = 0; i < strongs.length; i++) {
            System.out.println(strongs[i]);
        }
    }
}
