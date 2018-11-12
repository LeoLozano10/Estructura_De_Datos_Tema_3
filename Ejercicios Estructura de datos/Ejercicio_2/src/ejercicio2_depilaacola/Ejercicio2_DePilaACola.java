//lozano Mena Leonardo Daniel
package ejercicio2_depilaacola;

import java.util.Scanner;

public class Ejercicio2_DePilaACola {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Pila p = new Pila();
        Cola c = new Cola();
        System.out.print("Ingrese el Numero De Elementos Que Se Desea Ingresar: \n");
        int n = Teclado.nextInt();
        System.out.println("\nIngrese Los Elememtos De La Pila: \n");
        String e;
        for (int i = 1; i <= n; i++) {
            System.out.print("Posicion " + i + ": ");
            e = Teclado.next();
            p.insertar(e);
        }
        System.out.println("\nDatos Ingresados Correctamente: \n");
        System.out.println("\nPasando Los Datos De La Pila A La Cola: \n");
        System.out.println("\nDatos Ingresados A La Cola: \n");

        System.out.println("\nImpresion De Los Elementos De La Cola: \n");
        for (int i = 1; i <= n; i++) {
            c.insertar(p.quitar());
            System.out.println("Posicion " + i + ": " + c.quitar());
        }
    }

}
