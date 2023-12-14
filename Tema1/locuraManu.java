import java.util.Scanner;

public class locuraManu {
    public static void main(String[] args) {

        // login de usuario
        Scanner escaner = new Scanner(System.in);

        boolean verificacion = false;
        System.out.println("introduce tu nombre de usuario: ");
        String username = escaner.nextLine();

        System.out.println("introduce la contraseña: ");
        String contrasenia = escaner.nextLine();

        if (username.equals("admin") && contrasenia.equals("admin")) {

            verificacion = true;
            System.out.println("Logueado como administrador");

        } else {

            System.out.println("introduce la contraseña: ");

            contrasenia = escaner.nextLine();
            System.out.println("logueado como usuario");

        }

        System.out.println("Bienvenido al sistema");

        String[] opcionesAdmin = { "1) Añadir producto", "2) Modificar prducto", "3) Eliminar producto",
                "4) Desconectar", };
        String[] opcionesUsuario = { "1) Comprar producto", "2) Desconectar", };
        int opcion;

        if (verificacion) {
            for (int i = 0; i < opcionesAdmin.length; i++) {
                System.out.println(opcionesAdmin[i]);

            }
            System.out.println("introduce una opcion: ");
            opcion = escaner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("añadir producto");
                    break;
                case 2:
                    System.out.println("modificar producto");
                    break;
                case 3:
                    System.out.println("eliminar producto");
                    break;
                case 4:
                    System.out.println("desconectar");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } else {
            for (int i = 0; i < opcionesUsuario.length; i++) {
                System.out.println(opcionesUsuario[i]);

            }
            System.out.println("introduce una opcion: ");
            opcion = escaner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("comprar producto");
                    break;
                case 2:
                    System.out.println("desconectar");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }
}