package redsocial;

public class CriterioBusquedaPorAntecedente implements Criterio {

	@Override
	public boolean verificar(Fanatico f) {
		return f.isAntecedentes();
	}

	@Override
	public String toString() {
		return "Antecedentes";
	}
	
	

}
