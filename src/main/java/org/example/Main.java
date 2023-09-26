package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Authentication.check("sky_8888ro", "sky_Pro", "sky_pro");
            System.out.println("Авторизация выполнена!");
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
