package es.ubu.lsi.model.multas;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BonusPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// Se mapea a una columna timeStamp de la base de datos
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecha;
		
	// No se insertará y actualizará directamente en la bd.
	@Column(insertable = false, updatable = false)
	private String nif;	
	
	public BonusPK() {
	}
	
	public BonusPK(String nif, java.util.Date fecha) {
		this.nif = nif;
		this.fecha = fecha;
	}

	public java.util.Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BonusPK other = (BonusPK) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(nif, other.nif);
	}

	@Override
	public String toString() {
		return "BonusPK [fecha=" + fecha + ", nif=" + nif + "]";
	}
	
	

}
