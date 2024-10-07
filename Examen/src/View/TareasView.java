package View;

import javax.swing.*;
import java.awt.*;

public class TareasView extends JFrame {
    private JTextField tituloField, descripcionField, fechaField, estadoField, eliminarField;
    private JButton agregarButton, eliminarButton;
    private JTextArea tareasArea;

    public TareasView() {
        // Configurar el JFrame
        setTitle("Gestor de Tareas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para el formulario de tareas
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 5, 5));

        // Campos de texto y etiquetas
        formPanel.add(new JLabel("Título:"));
        tituloField = new JTextField();
        formPanel.add(tituloField);

        formPanel.add(new JLabel("Descripción:"));
        descripcionField = new JTextField();
        formPanel.add(descripcionField);

        formPanel.add(new JLabel("Fecha:"));
        fechaField = new JTextField();
        formPanel.add(fechaField);

        formPanel.add(new JLabel("Estado:"));
        estadoField = new JTextField();
        formPanel.add(estadoField);

        agregarButton = new JButton("Agregar");
        formPanel.add(agregarButton);

        // Espacio vacío para ajustar el diseño
        formPanel.add(new JLabel());

        // Panel para eliminar tareas
        JPanel eliminarPanel = new JPanel();
        eliminarPanel.setLayout(new GridLayout(2, 2, 5, 5));
        eliminarPanel.add(new JLabel("Eliminación de tarea:"));
        eliminarField = new JTextField();
        eliminarPanel.add(eliminarField);

        eliminarButton = new JButton("Eliminar");
        eliminarPanel.add(eliminarButton);


        eliminarPanel.add(new JLabel());

        // Panel para las tareas (textarea)
        tareasArea = new JTextArea();
        tareasArea.setEditable(false);

        // Agregar los paneles al JFrame
        JPanel izquierdaPanel = new JPanel();
        izquierdaPanel.setLayout(new BorderLayout());
        izquierdaPanel.add(formPanel, BorderLayout.NORTH);
        izquierdaPanel.add(eliminarPanel, BorderLayout.SOUTH);

        add(izquierdaPanel, BorderLayout.WEST);
        add(new JScrollPane(tareasArea), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TareasView app = new TareasView();
            app.setVisible(true);
        });
    }
}
