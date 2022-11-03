package jose.recluta2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Candidato implements Serializable {
	
	private static final long serialVersionUID = 3759230923879432156L;
	private int cvePersona;
	private String nombre = "";
	private String apellido = "";
	private String horasProyecto = "";
	private int experienciaEnAnios;
	private String horasDisponiblesTotales = "1";
	private String horasPermitidas = "1";
	private String telefono = "5555";
	private String correo = "";
	private String correoOtraVez = "";
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	private Map<String, Object> persona;
	
	public Candidato() {
		this.persona = new HashMap<>();
        this.persona.put("type", "number");
        this.persona.put("min", "1");
        this.persona.put("max", "50");
        this.persona.put("required", "required");
        this.persona.put("title",
                "Ingrese un núnero entre 1 y 50.");
	}
	
	
	public int getCvePersona() {
		return cvePersona;
	}
	public void setCvePersona(int cvePersona) {
		this.cvePersona = cvePersona;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getExperienciaEnAnios() {
		return experienciaEnAnios;
	}
	public void setExperienciaEnAnios(int experienciaEnAnios) {
		this.experienciaEnAnios = experienciaEnAnios;
	}

	public String getHorasDisponiblesTotales() {
		return horasDisponiblesTotales;
	}
	public void setHorasDisponiblesTotales(String horasDisponiblesTotales) {
		this.horasDisponiblesTotales = horasDisponiblesTotales;
	}

	public String getHorasPermitidas() {
		return horasPermitidas;
	}
	public void setHorasPermitidas(String horasPermitidas) {
		this.horasPermitidas = horasPermitidas;
	}


	public String getHorasProyecto() {
		return horasProyecto;
	}
	public void setHorasProyecto(String horasProyecto) {
		this.horasProyecto = horasProyecto;
	}

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
	
	public String getCorreoOtraVez() {
		return correoOtraVez;
	}
	public void setCorreoOtraVez(String correoOtraVez) {
		this.correoOtraVez = correoOtraVez;
	}

	public Map<String, Object> getPersona() {
		return persona;
	}
	public void setPersona(Map<String, Object> persona) {
		this.persona = persona;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	public void calculateTotal(AjaxBehaviorEvent event)
            throws AbortProcessingException {
        int horasDisponibles = 1;
        int horasRestantes = 0;
        int total;

        if (horasDisponiblesTotales.trim().length() > 0) {
            horasDisponibles = Integer.parseInt(horasDisponiblesTotales);
        }
        if (horasPermitidas.trim().length() > 0) {
            horasRestantes = Integer.parseInt(horasPermitidas);
        }
        total = (horasRestantes - horasDisponibles);
        horasProyecto = String.valueOf(total) + " horas efectivas";
    }
	
	 public void clear(AjaxBehaviorEvent event)
	            throws AbortProcessingException {
	        nombre = "";
	        correo = "";
	        correoOtraVez = "";
	        horasPermitidas = "1";
	        horasProyecto = "20";
	        horasDisponiblesTotales = "1";
	    }

	//AjaxBehaviorEvent event
	public void agregar () {
		Candidato candidato = new Candidato();
		candidato.setNombre(nombre);
		candidato.setApellido(apellido);
		candidato.setTelefono(telefono);
		candidato.setCorreo(correo);
		candidato.setExperienciaEnAnios(experienciaEnAnios);
		candidato.setHorasDisponiblesTotales(horasDisponiblesTotales);
		candidato.setHorasProyecto(horasProyecto);
		candidato.setHorasPermitidas(horasPermitidas);
		candidatos.add(candidato);
		System.out.print("Cadidatos Totales: " + candidatos.size());
		
		//return "index";
	}
	
	public void limpiar(AjaxBehaviorEvent event)
            throws AbortProcessingException {
        nombre = "";
        apellido = "";
        correo = "";
        correoOtraVez = "";
        telefono = "";
        experienciaEnAnios = 0;
        horasProyecto = "10";
        horasDisponiblesTotales = "20";
        horasPermitidas = "1";
    }
	
}
