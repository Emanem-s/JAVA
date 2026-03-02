import java.util.Scanner;
class ContadorPosivos {
    public static void main(string[] args) {
        scanner sc = new Scanner(System.in);
        int contador = 0;
        double PromedioPoitivos,PromGeneral;
        sout("Ingrese los numeros que desee ya sea positivos o negativos.");
        contador = sc.nextInt();
        if (contador > 0) {
            PromedioPoitivos = contador / 2;
            sout("El promedio de los numeros positivos es: " + PromedioPoitivos);
        } else if (contador < 0) {
            PromGeneral = contador / 2;
            sout("El promedio general es: " + PromGeneral);
        } else {
            sout("No se han ingresado numeros.");
        }


    }
}