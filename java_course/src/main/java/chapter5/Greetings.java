package chapter5;

import java.util.Scanner;

/*
* NUESTRO PRIMER MÉTODO.
* Escriba un método que le pida a un usuario su nombre y luego lo salude por su nombre.
* */
public class Greetings {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        GreetUser(name);
    }
    public static void GreetUser(String name) {
        System.out.println("Hola " + name);
    }
}
