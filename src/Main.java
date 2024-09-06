import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        menu();


    }

    public static void menu() {
        System.out.println("--- MENU (MATRIZ CREADA CON ÉXITO) ---");
        System.out.println("A) Para crear una nueva matriz");
        System.out.println("B) Para mostrar tu matriz por fila");
        System.out.println("C) Para verificar si la matriz creada es de tipo CERO");
        opciones();


    }


    static int crearFila() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el número de filas");
        int filas = in.nextInt();
        in.nextLine();
        return(filas);

    }

    static int crearCols() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el número de Columnas");
        int cols = in.nextInt();
        in.nextLine();

        return(cols);

    }



    public static void llenarMatriz(int[][] matriz, int filas, int cols) {
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
    }


    public static void opciones() {
        String options = null;
        Scanner scan = new Scanner(System.in);
        int filas = 0;
        int cols = 0;
        int[][] matris = null;
        do {
            options = scan.nextLine();
            switch (options) {
                case "A":
                    filas = crearFila();
                    cols = crearCols();
                    matris = crearMatriz(filas,cols);
                    System.out.println(Arrays.deepToString(matris));
                    break;
                case "B":
                    llenarMatriz(matris, filas, cols);
                    System.out.println(Arrays.deepToString(matris));




            }
        } while(!options.equals("Q"));




    }




    boolean ValidarDimensiones() {

        return(false);
    }

    static int [][] crearMatriz(int filas, int cols) {

        return(new int[filas][cols]);
    }








}
