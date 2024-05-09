package de.telran.myNewsGroup.module4.homeWork1.exceptions;

import static de.telran.myNewsGroup.module4.homeWork1.exceptions.Verification.loginAndPasswordValid;

public class SimpleVerification {
    public static void main(String[] args) {
        System.out.println(loginAndPasswordValid("john", "123", "123"));
        System.out.println(loginAndPasswordValid("john", "123", "1234"));
        System.out.println(loginAndPasswordValid("john", "123@", "123@"));
        System.out.println(loginAndPasswordValid("john@", "123", "123"));
    }
}
