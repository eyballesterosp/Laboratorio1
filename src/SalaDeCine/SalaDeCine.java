package SalaDeCine;

import java.util.Scanner;

public class SalaDeCine {

    public static boolean TARCINE;
    public static double precio;
    public static String[] Filas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    public static String[] Columnas = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    public static void main(String[] args) {

        System.out.println("Bienvenido a CINE UN");

        System.out.println("");
        System.out.println("Si posee la TARCINE escriba si, de lo contrario escriba no.");
        for (int m = 0; m < 2; m++) {

            Scanner tarjeta = new Scanner(System.in);
            String t = tarjeta.next();
            if (t.compareTo("si") == 0) {
                TARCINE = true;
                m = 1;
                System.out.println("Ingrese su documento de identidad");
                Scanner identificacion = new Scanner(System.in);
                double numIdentificacion = identificacion.nextInt();
            } else if (t.compareTo("no") == 0) {
                TARCINE = false;
                m = 1;
            } else {
                System.out.println("Escriba si o no");
                m = 0;
            }
        }
        System.out.println("->->->->->->->->->->->->->->->->->->->->->->");

        System.out.println("Cuantos asientos desea reservar?");
        Scanner asientos = new Scanner(System.in);
        int a = asientos.nextInt();

        String[][] Sillas = new String[11][20];
        int filas = 0, columnas = 0;
        Sillas[filas][columnas] = Filas[filas] + Columnas[columnas];
        for (filas = 0; filas < Sillas.length; filas++) {

            for (columnas = 0; columnas < Sillas[filas].length; columnas++) {
                Sillas[filas][columnas] = Filas[filas] + Columnas[columnas];

                if (columnas != Sillas[filas].length - 1) {

                }
            }

        }

        String[] asientosReservados = new String[a];
        double[] precioTotal = new double[a];
        String b;
        Scanner fila = new Scanner(System.in);
        System.out.println("->->->->->->->->->->->->->->->->->->->->->->");
        for (int z = 0; z < 11; z++) {
            int numAsientos = 0;
            int sillaNoDisp;
            if (numAsientos == a) {
                z = 11;
            } else {
                for (sillaNoDisp = 0; sillaNoDisp < 10; sillaNoDisp++) {

                    for (numAsientos = 0; numAsientos < a; numAsientos++) {
                        int numArrfila = 11;
                        int numArrCol = 0;
                        int i;
                        int k;
                        System.out.println("Asiento " + (numAsientos + 1));
                        System.out.println("");
                        System.out.println("Recuerde que las filas preferenciales son I, J y K.");
                        System.out.println("Las filas A hasta H son de categoria general.");
                        System.out.println("");

                        System.out.println("Estos son los asientos disponibles: ");
                        for (filas = 0; filas < Sillas.length; filas++) {
                            System.out.print("|");

                            for (columnas = 0; columnas < Sillas[filas].length; columnas++) {

                                System.out.print(Sillas[filas][columnas]);
                                if (columnas != Sillas[filas].length - 1) {
                                    System.out.print("\t");
                                }
                            }
                            System.out.println("|");

                        }

                        System.out.println("");
                        System.out.println("Con letra mayuscula escriba la fila en la que desea su asiento numero " + (numAsientos + 1));

                        b = fila.nextLine();

                        int j;

                        for (i = 0; i < 11; i++) {
                            if (b.compareTo(Filas[i]) == 0) {
                                numArrfila = i;

                            }
                        }

                        if (numArrfila > 10) {
                            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::>Esta fila no existe <:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                            System.out.println("Desea intentar de nuevo?");
                            Scanner intento = new Scanner(System.in);
                            String intentar = intento.next();
                            for (int q = 0; q < 2; q++) {
                                if (intentar.compareTo("si") == 0) {
                                    sillaNoDisp = 0;
                                    numAsientos = numAsientos - 1;
                                    q = 1;
                                } else if (intentar.compareTo("no") == 0) {
                                    sillaNoDisp = 10;
                                    numAsientos = a + 1;
                                    z = 12;
                                    q = 1;
                                } else {
                                    System.out.println("Escriba si o no");
                                    q = 0;
                                }

                                z = 0;
                            }
                        } else {

                            for (j = 0; j < 20; j++) {

                                System.out.println("Que numero de silla desea en la fila " + Filas[numArrfila] + "?");
                                Scanner numeroasiento = new Scanner(System.in);
                                String c = numeroasiento.nextLine();

                                for (k = 0; k < 20; k++) {
                                    if (c.compareTo(Columnas[k]) == 0) {
                                        j = 20;
                                        numArrCol = k;
                                    }
                                }
                                if (j != 20) {
                                    System.out.println("Seleccione un numero del 1 hasta el 20");
                                    j = 0;
                                }
                            }

                            if (Sillas[numArrfila][numArrCol].compareTo("X") == 0) {
                                System.out.println("Esta silla no esta disponible");
                                sillaNoDisp = 10;
                                System.out.println("Desea intentar de nuevo?");
                                Scanner intento = new Scanner(System.in);
                                String intentar = intento.next();
                                for (int q = 0; q < 2; q++) {
                                    if (intentar.compareTo("si") == 0) {
                                        sillaNoDisp = 0;
                                        numAsientos = numAsientos - 1;
                                        q = 1;
                                    } else if (intentar.compareTo("no") == 0) {
                                        sillaNoDisp = 10;
                                        numAsientos = a + 1;
                                        z = 12;
                                        q = 1;
                                    } else {
                                        System.out.println("Escriba si o no");
                                        q = 0;
                                    }

                                }

                            } else {

                                System.out.println("La silla que seleccionó es: " + Sillas[numArrfila][numArrCol]);
                                asientosReservados[numAsientos] = Sillas[numArrfila][numArrCol];
                                Sillas[numArrfila][numArrCol] = "X";
                                if (numArrfila < 9) {

                                    precio = 8000;
                                    if (TARCINE == true) {
                                        precio = precio - (precio * 0.1);

                                    }
                                } else {
                                    precio = 11000;
                                    if (TARCINE == true) {
                                        precio = precio - (precio * 0.1);
                                    }
                                }
                                precioTotal[numAsientos] = precio;

                                System.out.println("Este asiento cuesta: " + precio);

                                System.out.println("----------------------------------------------------");
                                sillaNoDisp = 10;
                            }
                        }
                    }

                }
                System.out.println("Los asientos seleccionados son: ");
                for (int arregloasientosReservados = 0; arregloasientosReservados < a; arregloasientosReservados++) {
                    System.out.println("  " + "#" + asientosReservados[arregloasientosReservados]);
                }
                double totalVenta = 0;
                System.out.println("");
                System.out.print("El precio total es: ");
                for (int arregloPrecioTotal = 0; arregloPrecioTotal < a; arregloPrecioTotal++) {
                    totalVenta = totalVenta + precioTotal[arregloPrecioTotal];
                }
                System.out.println("$" + totalVenta);
                z = 11;
            }

        }

    }
}
