package actividades.condicionales;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Diseña una aplicación donde un usuario pueda elegir el idioma de una frase de saludo. En primer lugar se mostrará un menú
        //El usuario escribirá un número entero entre 1 y 4 para señalar qué opción quiere y, a continuación, aparecerá la frase "Buenos días" en el idioma que corresponda (puedes usar Google translator). Si escribe otro número, el mensaje se mostrará en español.
        //1. Inglés
        //2. Francés
        //3. Alemán
        //4. Italiano
        //5. Español

        int idioma;

        System.out.println("Elige el idioma de la frase de saludo");
        System.out.println("1. Inglés");
        System.out.println("2. Francés");
        System.out.println("3. Alemán");
        System.out.println("4. Italiano");
        System.out.println("5. Español");

        idioma = Integer.parseInt(System.console().readLine());

        switch (idioma) {
            case 1:
                System.out.println("Good morning");
                break;
            case 2:
                System.out.println("Bonjour");
                break;
            case 3:
                System.out.println("Guten Morgen");
                break;
            case 4:
                System.out.println("Buongiorno");
                break;
            case 5:
                System.out.println("Buenos días");
                break;
            default:
                System.out.println("El valor introducido no es correcto");
                break;
        }

        
    }
}
