package jose.recluta2.beans;

import java.util.ArrayList;
import java.util.List;

public class CandidatoPorProyectoReporte {
	
	private List<Candidato> candidatos;
	private Proyecto proyecto;
	
	public CandidatoPorProyectoReporte() {
		candidatos = new ArrayList<>();	
	}
	
	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

}
