package entregable;

import java.util.Scanner;

public class Entregable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "Piero";
        double saldo = 1000.0;
        System.out.println("Holaa");
        System.out.println("Bienvenido, " + usuario);

        int opcion;
        boolean continuar = true;
        String rpta = "";

        while (continuar) {
            System.out.println("Opciones:");
            System.out.println("-----------------------");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro de saldo");
            System.out.println("3. Consulta de saldo");
            System.out.println("4. Salir del sistema");
            System.out.println("-----------------------");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
                    System.out.print("¿Desea realizar otra operación? (s/n): ");
                    rpta = scanner.next();
                    continuar = rpta.equalsIgnoreCase("s");
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    System.out.print("¿Desea realizar otra operación? (s/n): ");
                    rpta = scanner.next();
                    continuar = rpta.equalsIgnoreCase("s");
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("Saldo actual: $" + saldo);
                    System.out.print("¿Desea realizar otra operación? (s/n): ");
                    rpta = scanner.next();
                    continuar = rpta.equalsIgnoreCase("s");
                    System.out.println("-----------------");
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro servicio.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("-----------------");
            }
        }
        System.out.println("Gracias por su visita.");
        scanner.close();
    }

}
