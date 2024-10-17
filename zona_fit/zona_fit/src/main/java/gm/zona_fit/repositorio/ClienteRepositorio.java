package gm.zona_fit.repositorio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//Se proporciona el tipo de la clase y el tipo de dato de la llave primaria
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {


}
