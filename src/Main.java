import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        run();

    }


    public static void run(){  //metodo run para inicar el mensajeInicial, el cual espero dps inicie el Menu

        llenarMatriz();



    }


    static int llenarFila() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el número de filas");
        int filas = in.nextInt();
        in.nextLine();
        return(filas);

    }

    static int llenarCols() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el número de Columnas");
        int cols = in.nextInt();
        in.nextLine();
        return(cols);

    }





    public static void llenarMatriz() {
        System.out.println("Hola bienvenido al sistema de creación de matrices.");  // muestra el primer mensaje
        Scanner in = new Scanner(System.in);   // considero mala practica pero por ahora todavia no hago el metodo aparte asi q ; _ ;
        System.out.println("Ingresa el numero de filas");
        int filas = llenarFila();
        int cols = llenarCols();
        int[][] matris = crearMatriz(filas,cols);
        System.out.println(Arrays.deepToString(matris));








    }



    public static void menu() {

        System.out.println("--- MENU (MATRIZ CREADA CON ÉXITO) ---");
        System.out.println("A) Para crear una nueva matriz");
        System.out.println("B) Para mostrar tu matriz por fila");
        System.out.println("C) Para verificar si la matriz creada es de tipo CERO");




    }

    public static void elegirOpcion() {


    }


    boolean ValidarDimensiones() {




        return(false);
    }





    static int [][] crearMatriz(int filas, int cols) {

        return(new int[filas][cols]);









    }








}
