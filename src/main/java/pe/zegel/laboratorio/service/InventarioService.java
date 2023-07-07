package pe.zegel.laboratorio.service;

import java.util.List;
import java.util.Optional;

import pe.zegel.laboratorio.model.Inventario;

public interface InventarioService {

		public List<Inventario> listarInventario();
		public Inventario save(Inventario inventario);
		public Inventario update(Inventario inventario);
		public void delete(Integer id);
		public Optional<Inventario> get(Integer id);
}
