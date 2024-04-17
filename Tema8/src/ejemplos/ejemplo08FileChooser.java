package ejemplos;

import java.awt.FlowLayout;
import java.io.File;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ejemplo08FileChooser extends JFrame{
    
    private JLabel label;
    
    public ejemplo08FileChooser(){
        super("FileChooser");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        label = new JLabel("Ningún archivo seleccionado.");

        JButton boton = new JButton("Abrir archivo");
        boton.addActionListener(e -> {
           
            elegirArchivo();
        });

        add(boton);
        add(label);
        
        setVisible(true);
    }

    private void elegirArchivo() {
        // Crear un objeto JFileChooser
        JFileChooser eleccion = new JFileChooser();
        // Mostrar el cuadro de diálogo
        eleccion.showOpenDialog(this); // this es el JFrame
        // Obtener el archivo seleccionado
        if (eleccion.getSelectedFile() != null) {
            // Obtener el archivo seleccionado para usarlo despúes para lo que queramos.
            File archivo = eleccion.getSelectedFile();
            // Mostrar el nombre del archivo seleccionado
            label.setText("Archivo seleccionado: " + eleccion.getSelectedFile().getName());

        }
    }

    public static void main(String[] args) {
        
        new ejemplo08FileChooser();

    }
}
