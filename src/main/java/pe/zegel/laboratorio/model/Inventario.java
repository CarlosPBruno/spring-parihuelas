package pe.zegel.laboratorio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario_parihuelas")
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo_parihuela;
	private String dimensiones;
	private String material;
	
	public Inventario() {
		super();
	}

	public Inventario(String tipo_parihuela, String dimensiones, String material) {
		super();
		this.tipo_parihuela = tipo_parihuela;
		this.dimensiones = dimensiones;
		this.material = material;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo_parihuela() {
		return tipo_parihuela;
	}

	public void setTipo_parihuela(String tipo_parihuela) {
		this.tipo_parihuela = tipo_parihuela;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
