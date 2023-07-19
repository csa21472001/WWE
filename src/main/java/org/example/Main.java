package org.example;
public class Main {
    public static void main(String[] args) throws WrongLoginException {
            try {
                Authentication.check("sky_pro", "sky_pro", "sky_pro");
                System.out.println("Авторизация выполнена!");
            } catch (WrongLoginException  | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
