import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panel1;
    private JTextField usuarioTexto;
    private JPanel panel2;
    private JPasswordField contraseñaTexto;
    private JButton enviarBoton;

    public Ventana() {
        inicializarVentana();
        enviarBoton.addActionListener(e -> validar());
    }

    public void inicializarVentana() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    private void validar() {
        //leer valores

        var usuario=this.usuarioTexto.getText();
        var contraseña= new String(this.contraseñaTexto.getPassword());
        if ("root".equals(usuario) && "admin".equals(contraseña)) {
            mostrarMensaje("Datos correctos, bienvenido");
        }else if("root".equals(usuario)){
            mostrarMensaje("Contraseña incorrecta");
        }else{
            mostrarMensaje("Usuario incorrecto");
        }
        }


    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);

    }
}
