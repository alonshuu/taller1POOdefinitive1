import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        menu();
        opciones();


    }

    public static void menu() {
        System.out.println("--- MENU (MATRIX CREATION YEAH) ---");
        System.out.println("A) Para crear una nueva matriz");
        System.out.println("B) Para llenar tu matriz");
        System.out.println("C) Para mostrar tu matriz por fila");
        System.out.println("D) Para verificar si la matriz creada es de tipo CERO");
        System.out.println("Q) Para salir de la aplicacion");



    }


    static int crearFila() {
        Scanner in = new Scanner(System.in);
        int fila = -1;
        do {
            System.out.println("Ingresa el número de filas");
            fila = in.nextInt();
            if (fila <= 0) {
                System.out.println("Por favor ingresa un numero valido");
            }

        } while (fila <= 0);

        return(fila);

    }

    static int crearCols() {
        Scanner in = new Scanner(System.in);
        int fila = -1;
        do {
            System.out.println("Ingresa el número de columnas");
            fila = in.nextInt();
            if (fila <= 0) {
                System.out.println("Por favor ingresa un numero valido");

            }

        } while (fila <= 0);

        return(fila);

    }


    public static void llenarMatriz(int[][] matriz, int filas, int cols) {
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        System.out.println("MATRIZ LLENADA CON EXITO");
        menu();
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

                    break;
                case "B":
                    llenarMatriz(matris, filas, cols);
                    break;


                case "C":
                    mostrarMatriz(matris);
                    break;

                case "D":
                    boolean a = matrizCero(matris);
                    if a = true;








            }
        } while(!options.equals("Q"));




    }


    public static void mostrarMatriz(int[][] matrix){
        System.out.println(Arrays.deepToString(matrix));
    }


    static boolean matrizCero (int matriz[][]) {
        int contador = 0;
        int largo = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; largo++) {
                if (matriz[i][j] == 0) {
                    contador++;

                }
            }

        }

        return contador > largo/2;

    }







    static int [][] crearMatriz(int filas, int cols) {

        System.out.println("MATRIZ CREADA CON EXITO");
        menu();

        return(new int[filas][cols]);
    }








}
