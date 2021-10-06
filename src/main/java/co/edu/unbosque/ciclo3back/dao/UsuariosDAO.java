package co.edu.unbosque.ciclo3back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.ciclo3back.model.Usuarios;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosDAO extends JpaRepository<Usuarios, Long> {

}
/*El repositorio extiende Spring Data Commons 
 CrudRepository y conecta el tipo de objeto de dominio y su clave principal*/
 