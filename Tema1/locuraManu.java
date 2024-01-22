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

        // menu de opciones
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
        if (opcion == 4 && verificacion == true) {
            System.out.println("desconectando...");
        }
        if (opcion == 2 && verificacion == false) {
            System.out.println("desconectando...");
        }

        String[] productos = { "1) patatas", "2) leche", "3) pan", "4) agua", "5) cerveza", "6) vino", "7) carne",
                "8) pescado", "9) fruta", "10) verdura" };
        double[] precios = { 1.5, 0.8, 0.5, 0.3, 1.2, 2.5, 3.5, 4.5, 1.5, 1.5 };
        int seleccion;

        for (int i = 0; i < 10; i++) {
            System.out.println(productos[i] + " " + precios[i]);
        }

        String continuar = "";
        if (opcion == 2 && verificacion) {

            do {
                System.out.println("introduce el numero del producto que quieres modificar: ");
                seleccion = escaner.nextInt();
                System.out.println("introduce el nuevo precio: ");
                precios[seleccion - 1] = escaner.nextDouble();
                System.out.println("el nuevo precio de " + productos[seleccion - 1] + " es " + precios[seleccion - 1]);

                System.out.println("desea continuar? Y/N");
                continuar = escaner.nextLine();

            } while (!continuar.equals("Y") || !continuar.equals("y"));
        }

    }
}