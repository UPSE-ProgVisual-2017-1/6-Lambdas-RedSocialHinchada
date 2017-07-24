package redsocial;

import java.util.ArrayList;
import java.util.List;

public class RedSocialHinchada {

	private List<Fanatico> miembros = new ArrayList<Fanatico>();

	
	
	public List<Fanatico> buscarPersonasPorEquipo(Equipo e)
	{
		List<Fanatico> resultadoBusqueda = new ArrayList<Fanatico>();
		System.out.println("Las personas del Equipo " + e + " son: ");
		
		for(Fanatico f: miembros)
		{
			if(f.getEquipo().equals(e))
			{
				resultadoBusqueda.add(f);
				System.out.println(f);
			}
		}
		return resultadoBusqueda;
	}



	public List<Fanatico> getMiembros() {
		return miembros;
	}

	public void setMiembros(List<Fanatico> miembros) {
		this.miembros = miembros;
	}
	
	public void agregarMiembro(Fanatico f)
	{
		this.miembros.add(f);
	}
}
