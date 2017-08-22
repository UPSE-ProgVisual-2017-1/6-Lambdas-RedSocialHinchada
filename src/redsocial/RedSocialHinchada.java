package redsocial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
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

	//Enfoque 6
	public static List<Fanatico> buscarFanaticoPorCriterioDadoInterfazFuncionalEstandar(
			List<Fanatico> miembros,
			Predicate<Fanatico> predicate, 
			String detalleCriterio)
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
	
	//Enfoque 7: Aplicar accion sobre filtrados.
	public static List<Fanatico> buscarFanaticosAplicandoAccion(
			List<Fanatico> miembros,
			Predicate<Fanatico> predicate, 
			String detalleCriterio, 
			Consumer<Fanatico> consumidora)
	{
		List<Fanatico> resultadoBusqueda = new ArrayList<Fanatico>();
		System.out.println("Las fanaticos que cumplen con el criterio " + detalleCriterio + " son: ");
		
		for(Fanatico f: miembros)
		{
			if(predicate.test(f))
			{
				System.out.println("Antes de aplicar accion: " + f);
				consumidora.accept(f);
				resultadoBusqueda.add(f);
				System.out.println("Depues de aplicar accion: " + f);
			}
		}
		
		return resultadoBusqueda;
		
	}
	
	//Enfoque 7.2: Aplicar accion sobre filtrados.
		public static List<Fanatico> buscarFanaticosAplicandoAccionYMapeando(
				List<Fanatico> miembros,
				Predicate<Fanatico> predicate, 
				String detalleCriterio, 
				Consumer<Fanatico> consumidora, 
				Function<Fanatico, String> mapeadora,
				Consumer<String> procesadoraCadenita) 
		{
			List<Fanatico> resultadoBusqueda = new ArrayList<Fanatico>();
			System.out.println("Las fanaticos que cumplen con el criterio " + detalleCriterio + " son: ");
			
			for(Fanatico f: miembros)
			{
				if(predicate.test(f))
				{
					System.out.println("Antes de aplicar accion: " + f);
					consumidora.accept(f);
					String cadenita = mapeadora.apply(f);
					System.out.println("La cadena es: " + cadenita);
					procesadoraCadenita.accept(cadenita);
					resultadoBusqueda.add(f);
					System.out.println("Depues de aplicar accion: " + f);
				}
			}
			
			return resultadoBusqueda;
			
		}
		
		//Enfoque 8: Genericos
	public static <X, Y> List<X> procesarElementos(
			Iterable<X> elementos,
			Predicate<X> predicado,
			Function<X,Y> mapeadora,
			Consumer<Y> consumidora)
	{
		List<X> elementosProcesados = new ArrayList<X>();
		
		for(X x: elementos)
		{
			if(predicado.test(x))
			{
				System.out.println("El elemento es:" + x);
				elementosProcesados.add(x);
				Y resultadoMapeo = mapeadora.apply(x);
				System.out.println("El objeto producto de mapeo es:" + resultadoMapeo);
				consumidora.accept(resultadoMapeo);
			}
		}
		return elementosProcesados;
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
