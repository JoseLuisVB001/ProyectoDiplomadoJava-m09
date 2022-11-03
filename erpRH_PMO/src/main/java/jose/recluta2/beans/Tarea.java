package jose.recluta2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Tarea implements Serializable {
	
	private static final long serialVersionUID = 5352304857358693362L;
	private int cveTarea;
	private String nombre;
	private String descripcion;
	private int horasEstimadas;
	private String area;
	private String estado;
	private List<Tarea> tareas = new ArrayList<Tarea>();
	
	public Tarea() {
		super();
	}
	
	
	public int getCveTarea() {
		return cveTarea;
	}
	public void setCveTarea(int cveTarea) {
		this.cveTarea = cveTarea;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public List<Tarea> getTareas() {
		return tareas;
	}
	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	//AjaxBehaviorEvent event
	public void agregar () {
		Tarea tarea = new Tarea();
		tarea.setNombre(nombre);
		tarea.setDescripcion(descripcion);
		tarea.setHorasEstimadas(horasEstimadas);
		tarea.setArea(area);
		tarea.setEstado(estado);
		tareas.add(tarea);
		System.out.print("Tareas Totales: " + tareas.size());
		
		//return "index";
	}
	
	public void limpiar(AjaxBehaviorEvent event)
            throws AbortProcessingException {
        nombre = "";
        descripcion = "";
        descripcion = "";
        area = "Investigación";
        horasEstimadas = 20;
        estado = "Inicial";
    }

}
