//¿Haz hecho alguna vez un algoritmo para un programa? ¿Qué hacía? ¿Era correcto y eficiente?

//codigo en java para el algotitmo de ordenamiento de burbuja de forma recursiva con programacion orientada a objetos

import java.util.Scanner;
public class Pregunta3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero " + (i+1) + " del arreglo");
            arreglo[i] = sc.nextInt();
        }
        burbuja burbuja = new burbuja(arreglo);
        burbuja.ordenar();
        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
