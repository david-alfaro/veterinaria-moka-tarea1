package alfaroviquez.david.ui;

import alfaroviquez.david.bl.Usuario;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in).useDelimiter("\\n");
    private static PrintStream output = new PrintStream(System.out);
    private static Usuario[] arregloUsuarios = new Usuario[50];
    private static int nextUsuario = 1;

    public static void main(String[] args) {
        int opcion = 0;
        do {
            MostrarMenu();
            opcion = input.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 9);
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

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarUsuario();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                listarUsuarios();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                output.println("Opicón inválida! ");
        }
    }

    private static void registrarUsuario() {
        output.println("Nombre: ");
        String Nombre = input.next();
        output.println("Primer Apellido: ");
        String Apellido1 = input.next();
        output.println("Segundo Apellido: ");
        String Apellido2 = input.next();
        output.println("Número de cédula: ");
        int Cedula = input.nextInt();
        output.println("Número de teléfono: ");
        int Telefono = input.nextInt();
        output.println("Direccion: ");
        String Direccion = input.next();
        output.println("Estado (Activo/Inactivo): ");
        String Estado = input.next();
        output.println("Rol: ");
        String Rol = input.next();
        Usuario nuevoUsuario = new Usuario(Nombre, Apellido1, Apellido2, Cedula, Telefono, Direccion, Estado, Rol);
       
        for(int i=0; i<arregloUsuarios.length;i++){
            if(arregloUsuarios[i]!=null){
                if(arregloUsuarios[i].getCedula()== nuevoUsuario.getCedula()){
                    output.println("El usuario ya existe en el sistema");
                }
            }else{
                arregloUsuarios[i]=nuevoUsuario;
                break;
                
            }
        }
        output.println("Usuario registrado de forma exitosa ");
      

    }

    private static void listarUsuarios() {
        for(int i=0;i<arregloUsuarios.length;i++){
            output.println("#"+(i+1)+": "+arregloUsuarios[i]);
        }
    }
}
