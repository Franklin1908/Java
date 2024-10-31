package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data //Metodos get y set
@NoArgsConstructor //Agregar constructor vacio
@AllArgsConstructor //Agregar constructor con todos los parametros
@ToString//Agregar metodo to string
@EqualsAndHashCode//Metodos equals y hascode
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;

}
