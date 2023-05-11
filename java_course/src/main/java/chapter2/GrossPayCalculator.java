package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
    //1. Obtener el numero de horas trabajadas
        System.out.println("Obtener el numero de horas trabajadas");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
    //2. Obtener la tasa de pago por hora
        System.out.println("Ingrese la tasa de pago del empleado.");
        double rate = scanner.nextDouble();
    //3. Multiplique las horas y pague la tasa
        double grossPay = hours * rate;
    //4. Mostrar resultado
        System.out.println("El salario bruto del empleado es: $" + grossPay);
    }
}
