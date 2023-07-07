package pe.zegel.laboratorio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.zegel.laboratorio.model.Inventario;
import pe.zegel.laboratorio.repository.InventarioRepository;

@Service
public class InventarioServiceImpl implements InventarioService {
	
	@Autowired
	private InventarioRepository inventarioRepository;

	@Override
	public List<Inventario> listarInventario() {
		return inventarioRepository.findAll();
	}

	@Override
	public Inventario save(Inventario inventario) {
		return inventarioRepository.save(inventario);
	}

	@Override
	public Inventario update(Inventario inventario) {
		return inventarioRepository.save(inventario);
	}

	@Override
	public void delete(Integer id) {
		inventarioRepository.deleteById(id);
	}

	@Override
	public Optional<Inventario> get(Integer id) {
		return inventarioRepository.findById(id);
	}
	
}
