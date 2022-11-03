package jose.recluta2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public class CandidatoEntity implements Serializable {

	private static final long serialVersionUID = 4938474073478072863L;
	private String nombre;
	private String telefono;
	private String correo;
	private List<CandidatoEntity> candidatos = new ArrayList<CandidatoEntity>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<CandidatoEntity> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<CandidatoEntity> candidatos) {
		this.candidatos = candidatos;
	}
	@Override
	public String toString() {
		return "CandidatoEntity [nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", candidatos="
				+ candidatos + "]";
	}
	
	public void agregar(Candidato candidato) {
		CandidatoEntity ce = new CandidatoEntity();
		ce.setCorreo(candidato.getCorreo());
		ce.setTelefono(candidato.getTelefono());
		ce.setNombre(candidato.getNombre());
		candidatos.add(ce);
	}

}
