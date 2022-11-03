package jose.recluta2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Proyecto implements Serializable {
	
	private static final long serialVersionUID = 4903482730785679981L;
	private int cveProyecto;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private int diasEstimados;
	private String etapa;
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();
	
	public Proyecto() {
		super();
	}
	
	
	public int getCveProyecto() {
		return cveProyecto;
	}
	public void setCveProyecto(int cveProyecto) {
		this.cveProyecto = cveProyecto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getDiasEstimados() {
		return diasEstimados;
	}
	public void setDiasEstimados(int diasEstimados) {
		this.diasEstimados = diasEstimados;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	//AjaxBehaviorEvent event
	public void agregar () {
		Proyecto proyecto = new Proyecto();
		proyecto.setNombre(nombre);
		proyecto.setDescripcion(descripcion);
		proyecto.setFechaInicio(fechaInicio);
		proyecto.setDiasEstimados(diasEstimados);
		proyecto.setEtapa(etapa);
		proyectos.add(proyecto);
		System.out.print("Proyectos Totales: " + proyectos.size());
		
		//return "index";
	}
	
	public void limpiar(AjaxBehaviorEvent event)
            throws AbortProcessingException {
        nombre = "";
        descripcion = "";
        //fechaInicio= null;
        diasEstimados = 120;
        etapa = "Exploratoria";
    }

}
