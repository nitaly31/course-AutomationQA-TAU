package chapter5;

import java.util.Scanner;

/*
*ALCANCE VARIABLE.
* Escriba un programa de 'verificación de crédito instantánea' que apruebe
* a cualquiera que gane más de $25,000 y tenga un alcance crediticio de 700 o más.
* Rechazar todos los demás.
* */
public class InstantCreditCheck {
    // Inicializar lo que sabemos
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Obtener lo que no sabemos
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        //Verificar si el usuario esta calificado
        boolean qualified = isUserQualified(creditScore, salary);
        //Notificar al usuario
        notifyUser(qualified);
    }
    public static void getFormData(){

    }
    public static double getSalary(){
        System.out.println("Ingrese su salario:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Ingrese su puntaje de crédito:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary) {
        if( creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("¡Felicitaciones! Has sido aprobado.");
        }else {
            System.out.println("Lo siento. te han rechazado");
        }

    }
}

