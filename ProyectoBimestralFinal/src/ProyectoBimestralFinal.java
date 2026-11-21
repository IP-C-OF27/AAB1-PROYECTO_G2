import java.util.Scanner;

public class ProyectoBimestralFinal {
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        Scanner tcl = new Scanner(System.in);
        int dia, momento, condicionComida, tipo, totalComidasOmi = 0; 
        int frutas = 0, cereales = 0, carnes = 0, otros = 0, totalDesayunos = 0,
                totalAlmuerzos = 0, totalCenas = 0, comidasDia = 0, 
                diasCompletos = 0;
        double promedio, porcentaje, totalComidasReali = 0;
        String nombreMomento = null, nombreDia = null;
        //INICIO PROCESO
        for (int i = 1; i <= 7; i++) { //INICIO CICLO PARA CADA DIA
            dia = i;
            switch (dia) {
                case 1:
                    nombreDia = "LUNES";
                    break;
                case 2:
                    nombreDia = "MARTES";
                    break;
                case 3:
                    nombreDia = "MIERCOLES";
                    break;
                case 4:
                    nombreDia = "JUEVES";
                    break;
                case 5:
                    nombreDia = "VIERNES";
                    break;
                case 6:
                    nombreDia = "SABADO";
                    break;
                case 7:
                    nombreDia = "DOMINGO";
                    break;
            }
            System.out.println("---- DIA " + nombreDia + " ----");
            int realizadasDia = 0;
            int omitidasDia = 0;
            for (int j = 1; j <= 3; j++) {//INICIO CICLO PARA MOMENTO DEL DIA
                momento = j;
                switch (momento) {
                    case 1:
                        nombreMomento = "desayuno";
                        break;
                    case 2:
                        nombreMomento = "almuerzo";
                        break;
                    case 3:
                        nombreMomento = "cena";
                        break;
                }
                System.out.print("Completaste tu " + nombreMomento + "? (1= "
                        + "Si, 2= No): ");
                condicionComida = tcl.nextInt();
                while (condicionComida != 1 && condicionComida != 2){
                    System.out.print("Ingrese una de las opciones (1= Si, 2"
                            + "= No):");
                    condicionComida = tcl.nextInt();
                }
                if (condicionComida == 1){
                    totalComidasReali +=1;
                    comidasDia +=1;
                    System.out.println("Que tipo de comida predomino?");
                    System.out.println("  1. Frutas y vegetales");
                    System.out.println("  2. Cereales y tuberculos");
                    System.out.println("  3. Carne, huevos y legumbres");
                    System.out.println("  4. Otros");
                    System.out.print("Ingrese el numero de su respuesta: ");
                    tipo = tcl.nextInt();
                    while (tipo<1 || tipo>4){
                        System.out.print("Ingrese una de las opciones (1, 2 ,"
                                + "3 o 4):");
                        tipo = tcl.nextInt();
                    }
                    switch (tipo) {
                        case 1:
                            frutas += 1;
                            break;
                        case 2:
                            cereales += 1;
                            break;
                        case 3:
                            carnes += 1;
                            break;
                        case 4:
                            otros += 1;
                            break;
                    }
                    System.out.println("Se ha registrado tu " + nombreMomento);
                }
                else {
                    totalComidasOmi += 1;
                    omitidasDia += 1;
                }
            }
         }
    }
}
