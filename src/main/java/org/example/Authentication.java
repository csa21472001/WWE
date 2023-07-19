package org.example;

import java.util.Arrays;

public class Authentication {
    private static final String allowedCharacters = "0123456789_ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        checkForAllowedCharacters(login);
        checkForAllowedCharacters(password);
        checkLogin(login);
        checkPassword(password);
        checkConfirmPassword(password, confirmPassword);

        return true;
    }

    private static boolean checkForAllowedCharacters(String str) {
        for (char symbol : str.toCharArray()) {
            if (!allowedCharacters.contains(Character.toString(symbol))) {
                return false;
            }
        }
        return true;
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!checkForAllowedCharacters(login)) {
            throw new WrongLoginException();
        } else if (login.length() > 20){
            throw new WrongLoginException();
        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        if ( !checkForAllowedCharacters(password)) {
            throw new WrongPasswordException(" Пароль содержит недопустимые символы!");
        } else if (password.length() > 20) {
            throw new WrongPasswordException(" Логин должен содержать не более 20 символов!");
        }
    }

    private static void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" Пароли не совпадают!");
        }
    }


}
