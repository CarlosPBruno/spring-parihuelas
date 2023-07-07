package pe.zegel.laboratorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.zegel.laboratorio.model.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

}
