package de.telran.module5.homeWork2;

public class UserInit {
    public static void main(String[] args) {
        try {
         boolean isCorrect = userInit("SalomonSamsa_55","nixtoNEznaeSALO1968", "nixtoNEznaeSALO1968");
            System.out.println("Registration is valid: " + isCorrect);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Registration filed: " + e.getMessage());
        }
    }

    public static boolean userInit(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            throw e;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
            throw new WrongLoginException("Invalid login");
        }
    }

    private static void validatePassword(String passvord, String confirmPassword) throws WrongPasswordException {
        if (!passvord.matches("[A-Za-z0-9_]+") || passvord.length() >= 20 || !passvord.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}
