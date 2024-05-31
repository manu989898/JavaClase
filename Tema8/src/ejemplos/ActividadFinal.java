package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ActividadFinal extends JFrame{

    public ActividadFinal(){
        super("Actividad Final");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        JTextArea textArea = new JTextArea();

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        JMenuItem item1 = new JMenuItem("Abrir");
        
        item1.addActionListener(e -> {
            // Crear un objeto JFileChooser
            JFileChooser eleccion = new JFileChooser();
            // Mostrar el cuadro de diálogo
            eleccion.showOpenDialog(this); // this es el JFrame
            // Obtener el archivo seleccionado
            if (eleccion.getSelectedFile() != null) {
                // Obtener el archivo seleccionado para usarlo despúes para lo que queramos.
                File archivo = eleccion.getSelectedFile();
                // Limpiar el textArea
                textArea.setText("");
                // Mostrar el texto de dentro del archivo en el txtArea usando buffers
                try {
                    // Para acceder al archivo usando un Buffer.
                    BufferedReader buffer = new BufferedReader(new FileReader(archivo));
                    //Leemos el archivo linea a linea
                    String linea = buffer.readLine();
                    while (linea != null) {
                        textArea.append(linea + "\n");
                        linea= buffer.readLine();
                    }
                    // Cerramos el buffer de entrada.
                    buffer.close();
                } catch (FileNotFoundException e1) {
                    textArea.setText("No se ha encontrado el archivo.");
                } catch (IOException e1) {
                    textArea.setText("Error al cerrar el archivo.");
                }
            }
        });
        JScrollPane scroll = new JScrollPane(textArea);
        menuBar.add(menu);
        menu.add(item1);
        setJMenuBar(menuBar);
        add(scroll);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        new ActividadFinal();
    }
}
