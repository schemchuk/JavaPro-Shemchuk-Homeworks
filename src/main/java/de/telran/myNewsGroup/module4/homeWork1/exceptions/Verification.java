package de.telran.myNewsGroup.module4.homeWork1.exceptions;

public class Verification {
    public static boolean loginAndPasswordValid(String login, String password, String confirmPassword) {
        try {
          if  (login.length() >= 20 || !login.matches("[a-zA-Z]+")) {
                throw new WrongLoginException("Логин должен содержать только латинские буквы и быть меньше 20 символов.");
            }
          if (password.length() >= 20 || !password.matches("[0-9]+")){
              throw new WrongPasswordException("Пароль должен содержать только цифры и быть меньше 20 символов.");
          }
          if (!password.equals(confirmPassword)){
              throw new WrongPasswordException("Пароль и подтверждение пароля должны совпадать.");
          }
        } catch (WrongLoginException | WrongPasswordException e) {
           // throw new RuntimeException(e);
            System.err.println("Ошибка: " + e.getMessage());
            return false;
        }
            return true;
    }

}
