package gm.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.gui.ZonaFitVentana;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.lang.module.Configuration;
@SpringBootApplication
public class ZonaFitSwing {

    public static void main(String[] args) {
        //Configurar modo oscuro
        FlatDarculaLaf.setup();
        //Instanciar la fabrica de srpring
        ConfigurableApplicationContext contextoSpring=
                new SpringApplicationBuilder(ZonaFitSwing.class).headless(false).web(WebApplicationType.NONE)
                        .run(args);
        //Crear un objeto de swing
        SwingUtilities.invokeLater(()-> {
            ZonaFitVentana zonaFitVentana = contextoSpring.getBean(ZonaFitVentana.class);
            zonaFitVentana.setVisible(true);
        });
    }
}


