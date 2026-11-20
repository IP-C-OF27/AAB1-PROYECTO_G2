import java.util.Scanner;

public class ProyectoBimestralFinal {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int desayunos = 0, almuerzos = 0, cenas = 0;
        int frutas = 0, cereales = 0, carnes = 0, otros = 0;
        int diasCompletos = 0;
        for (int dia = 1; dia <= 7; dia++) {
            int comidasDelDia = 0;
            System.out.print("Comiste el desayuno en el dia " + dia + " (S/N): ");
            String rta;
            rta = tcl.next();
            if (rta == "s")
                desayunos++;
                comidasDelDia++;
                System.out.println("1: Frutas y Verduras");
                System.out.println("2: Cereales y Tuberculos");
                System.out.println("3: Carnes, Huevos y Legumbres");
                System.out.println("4: Otros");
                int tipo = tcl.nextInt();
                while (tipo < 1 || tipo > 4) {
                    System.out.println("Valor invalido, intente de nuevo.");
                    tipo = tcl.nextInt();
                    }
                if (tipo == 1) {
                    frutas++;
                }
                if (tipo == 2) {
                    cereales++;
                }
                if (tipo == 3) {
                    carnes++;
                }
                if (tipo == 4) {
                    otros++;
                }
        }
    }
}
