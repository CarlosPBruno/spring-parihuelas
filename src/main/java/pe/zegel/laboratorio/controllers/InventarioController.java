package pe.zegel.laboratorio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.zegel.laboratorio.model.Inventario;
import pe.zegel.laboratorio.service.InventarioService;

@Controller
@RequestMapping("/inventario")
public class InventarioController {
	
	@Autowired
	private InventarioService inventarioService;
	
	@GetMapping("")
	public String Listar (Model model) {
		List<Inventario> inv = inventarioService.listarInventario();
		model.addAttribute("inventario", inv);
		
		return "/inventario";
	}
	
	@PostMapping("/guardar")
	public String guardar(Inventario inventario) {
		inventarioService.save(inventario);
		return "redirect:/inventario";
	}
	
	@GetMapping("/editar/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		Inventario inventario = new Inventario();
		Optional<Inventario> optionalServicio=inventarioService.get(id);
		inventario = optionalServicio.get();
		
		model.addAttribute("inventario", inventario);
		return "/editar-inventario";
	}
	
	@PostMapping("/update")
	public String update(Inventario inventario) {
		inventarioService.update(inventario);
		return "redirect:/inventario";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable Integer id) {
		inventarioService.delete(id);
		return "redirect:/inventario";
	}
}
