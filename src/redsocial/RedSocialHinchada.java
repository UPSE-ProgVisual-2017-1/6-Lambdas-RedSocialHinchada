package redsocial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RedSocialHinchada {

	private List<Fanatico> miembros = new ArrayList<Fanatico>();

	
	//Enfoque 1: Criterio Cerrado
	public static List<Fanatico> buscarPersonasPorEquipo(List<Fanatico> miembros, Equipo e)
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

	//Enfoque 2: Criterios por Rangos
	public static List<Fanatico> buscarPersonasPorRangoFechaNacimiento(List<Fanatico> miembros, LocalDate fechaMinima, LocalDate fechaMaxima)
	{
		List<Fanatico> resultadoBusqueda = new ArrayList<Fanatico>();
		System.out.println("Las hinchas nacidos entre " + fechaMinima + " y " + fechaMaxima + " son: ");
		
		for(Fanatico f: miembros)
		{
			if(f.getFechaNacimiento().isAfter(fechaMinima)
					&& f.getFechaNacimiento().isBefore(fechaMaxima))
			{
				resultadoBusqueda.add(f);
				System.out.println(f);
			}
		}
		
		return resultadoBusqueda;
	}
	
	//Enfoque 3: Criterio General
	public static List<Fanatico> buscarFanaticoPorCriterioDado(List<Fanatico> miembros, Criterio criterio)
	{
		List<Fanatico> resultadoBusqueda = new ArrayList<Fanatico>();
		System.out.println("Las fanaticos que cumplen con el criterio " + criterio + " son: ");
		
		for(Fanatico f: miembros)
		{
			if(criterio.verificar(f))
			{
				resultadoBusqueda.add(f);
				System.out.println(f);
			}
		}
		
		return resultadoBusqueda;
	}


	public static List<Fanatico> buscarFanaticoPorCriterioDadoInterfazFuncionalEstandar(List<Fanatico> miembros,
			Predicate<Fanatico> predicate, String detalleCriterio)
	{
		List<Fanatico> resultadoBusqueda = new ArrayList<Fanatico>();
		System.out.println("Las fanaticos que cumplen con el criterio " + detalleCriterio + " son: ");
		
		for(Fanatico f: miembros)
		{
			if(predicate.test(f))
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
