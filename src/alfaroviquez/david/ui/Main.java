package alfaroviquez.david.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in).useDelimiter("\\n");
    private static PrintStream output = new PrintStream(System.out);

    public static void main(String[] args) {
        int opcion = 0;
        do{
            MostrarMenu();
            opcion = input.nextInt();
            procesarOpcion();
        }while(opcion!=9);
    }

    private static void MostrarMenu() {
        output.println("////////////// Bienvenido a la Veterinaria Moka ////////////////");
        output.println("1. Registrar Usuario");
        output.println("2. Registrar Mascota");
        output.println("3. Registrar Cita");
        output.println("4. Registrar Reservacion");
        output.println("5. Listar Usuarios");
        output.println("6. Listar Mascotas");
        output.println("7. Listar Citas");
        output.println("8. Listar Reservaciones");
        output.println("9. Salir");
        output.println("Ingrese una opción -> ");
    }

    private static void procesarOpcion() {
        
    }
}
