
package es.ubu.lsi.model.multas;

import javax.persistence.*;

@Entity // Entidad
@NamedQueries({
		@NamedQuery(name = "Bonus.findAll", query = "SELECT b FROM Bonus b")
})
public class Bonus {
	
	private BonusPK id;

	@MapsId("nif")
	@ManyToOne
	@JoinColumn(name = "NIF")
	private Conductor conductor;
	@Lob
	private String descripcion;
	
	public Bonus() {
		
	}

	public BonusPK getId() {
		return id;
	}

	public void setId(BonusPK id) {
		this.id = id;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Bonus [conductor=" + conductor + ", descripcion=" + descripcion + "]";
	}
	
	

}
