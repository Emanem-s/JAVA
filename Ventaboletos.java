import java.util.Scanner;
public class Ventaboletos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int partido1, partido2, partido3, partido4, partido5, clave, total = 0, precioP1 = 100, precioP2 = 150, precioP3 = 200, precioP4 = 250, precioP5 = 300, boletosP1 = 0, boletosP2 = 0, boletosP3 = 0, boletosP4 = 0, boletosP5=0;
        //inventario de boletos
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese la clave del partido (1-5): ingresa 6 para finalizar");
            clave = sc.nextInt();
            if (clave == 1) {
                System.out.println("Ingrese la cantidad de boletos que se vendieron para el partido 1:");
                boletosP1 = sc.nextInt();
                total = boletosP1 * precioP1;
                System.out.println("El dinero total por el partido 1 es: " + total);
            } else if (clave == 2) {
                System.out.println("Ingrese la cantidad de boletos que se vendieron para el partido 2:");
                boletosP2 = sc.nextInt();
                total = boletosP2 * precioP2;
                System.out.println("El dinero total por el partido 2 es: " + total);
            } else if (clave == 3) {
                System.out.println("Ingrese la cantidad de boletos que se vendieron para el partido 3:");
                boletosP3 = sc.nextInt();
                total = boletosP3 * precioP3;
                System.out.println("El dinero total por el partido 3 es: " + total);
            } else if (clave == 4) {
                System.out.println("Ingrese la cantidad de boletos que se vendieron para el partido 4:");
                boletosP4 = sc.nextInt();
                total = boletosP4 * precioP4;
                System.out.println("El dinero total por el partido 4 es: " + total);
            } else if (clave == 5) {
                System.out.println("Ingrese la cantidad de boletos que se vendieron para el partido 5:");
                boletosP5 = sc.nextInt();
                total = boletosP5 * precioP5;
                System.out.println("El dinero total por el partido 5 es: " + total);
            } else if (clave == 0) {
                System.out.println("Finalizando el programa...");
                System.out.println("El total de dinero por el partido 1 es: " + (boletosP1 * precioP1));
                System.out.println("El total de dinero por el partido 2 es: " + (boletosP2 * precioP2));
                System.out.println("El total de dinero por el partido 3 es: " + (boletosP3 * precioP3));
                System.out.println("El total de dinero por el partido 4 es: " + (boletosP4 * precioP4));
                System.out.println("El total de dinero por el partido 5 es: " + (boletosP5 * precioP5));
                int ventatotal = (boletosP1 * precioP1) + (boletosP2 * precioP2) + (boletosP3 * precioP3) + (boletosP4 * precioP4) + (boletosP5 * precioP5);
                System.out.println("El total general de dinero es: " + ventatotal);

            } else {
                System.out.println("Clave no válida, por favor ingrese una clave entre 1 y 5 o 0 para finalizar.");
            }
        }

    }
}
