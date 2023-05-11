package chapter3;

import java.util.Scanner;

/*
* declaración IF.
* Todos los vendedores reciben un pago de $1000 a la semana.
* Los vendedores que superan las 10 ventas obtienen un bono adicional de $250.
* */
public class SalaryCalculator {
    public static void main(String[] args) {
        //Inicializar valores conocidos
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //Obtener valores para la incógnita
        System.out.println("¿Cuántas ventas hizo el empleado esta semana?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Desvío rápido para los ganadores de bonos
        if (sales > quota){
            salary = salary + bonus;
        }
        // Producción
        System.out.println("El salario del empleado es de $" + salary);
    }
}
