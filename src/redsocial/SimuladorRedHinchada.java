package redsocial;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

import redsocial.Fanatico.Estado;
import redsocial.Persona.Genero;
import sun.util.resources.LocaleData;

public class SimuladorRedHinchada {

	public static void main(String[] args) {
		RedSocialHinchada redSocialHinchada = new RedSocialHinchada();
		
		Fanatico jimmy = new Fanatico("Jimmy", LocalDate.of(1995, 7, 27), Genero.MASCULINO, "jimmy@hincha.com", Equipo.EMELEC);
		Fanatico gary = new Fanatico("Carlos", LocalDate.of(1995, 9, 16), Genero.MASCULINO, "gary@hincha.com", Equipo.EMELEC, true);
		Fanatico manuelito = new Fanatico("Manuelito", LocalDate.of(1997, 11, 27), Genero.MASCULINO, "manuelito@hincha.com", Equipo.BARCELONA, true, true, 4, Estado.ACTIVO);
		Fanatico angelica = new Fanatico("Angelica", LocalDate.of(1994, 2, 11), Genero.FEMENINO, "angelica@hincha.com", Equipo.LIGA_QUITO, true);
		Fanatico pro = new Fanatico("Jorge Pro", LocalDate.of(1997, 9, 6), Genero.MASCULINO, "pro@hincha.com", Equipo.RAPTOR, true,	false, 2, Estado.ACTIVO);
		Fanatico william = new Fanatico("William", LocalDate.of(1997, 4, 4), Genero.MASCULINO, "william@hincha.com", Equipo.BARCELONA, true);
		Fanatico gabriela = new Fanatico("Gaby", LocalDate.of(1996, 5, 7), Genero.FEMENINO, "gaby@hincha.com", Equipo.BARCELONA);
		Fanatico katherine = new Fanatico("Katherine", LocalDate.of(1992, 7, 23), Genero.FEMENINO, "Kate@hincha.com", Equipo.BARCELONA, true, false, 2, Estado.ACTIVO);
		Fanatico capitanCavernicola	= new Fanatico("Capitan Cavernicola", LocalDate.of(1911, 12, 5), Genero.MASCULINO, "cavernicola@hincha.com", Equipo.BARCELONA, true, true, 20, Estado.INHABILITADO);
		Fanatico cavanni = new Fanatico("Guiseppe", LocalDate.of(1955, 3, 15), Genero.OTROS, "Guiseppe@hincha.com", Equipo.EMELEC, true, true, 18, Estado.INACTIVO);
		Fanatico gordaNatosa = new Fanatico("Gorda", LocalDate.of(1972, 8, 7), Genero.FEMENINO, "gordaEmelec@hincha.com", Equipo.EMELEC, true, false, 15, Estado.ACTIVO);
		Fanatico guambrito = new Fanatico("Guambrito", LocalDate.of(2003, 5, 18), "guambritofff@hincha.com", Equipo.LIGA_QUITO);
		Fanatico orozcoJ = new Fanatico("Jaimito", LocalDate.of(1968, 10, 15), Genero.MASCULINO, "Jaimito@hincha.com", Equipo.OLMEDO, true);
		Fanatico chavon = new Fanatico("chavon", LocalDate.of(1998, 5, 8), Genero.OTROS, "chavon@hincha.com", Equipo.DELFIN);
		Fanatico cuencano = new Fanatico("Cuencano", LocalDate.of(1985, 10, 26), "cuencanoVef@hincha.com", Equipo.CUENCA);
		Fanatico hombreCampana = new Fanatico("Hombre de la Campana", LocalDate.of(1921, 11, 29), Genero.MASCULINO, "campana@hincha.com", Equipo.BARCELONA, true);
		
		redSocialHinchada.agregarMiembro(pro);
		redSocialHinchada.agregarMiembro(cuencano);
		redSocialHinchada.agregarMiembro(chavon);
		redSocialHinchada.agregarMiembro(jimmy);
		redSocialHinchada.agregarMiembro(gary);
		redSocialHinchada.agregarMiembro(manuelito);
		redSocialHinchada.agregarMiembro(angelica);
		redSocialHinchada.agregarMiembro(william);
		redSocialHinchada.agregarMiembro(gabriela);
		redSocialHinchada.agregarMiembro(katherine);
		redSocialHinchada.agregarMiembro(capitanCavernicola);
		redSocialHinchada.agregarMiembro(cavanni);
		redSocialHinchada.agregarMiembro(gordaNatosa);
		redSocialHinchada.agregarMiembro(guambrito);
		redSocialHinchada.agregarMiembro(orozcoJ);
		redSocialHinchada.agregarMiembro(hombreCampana);
		
		//Enfoque 1
		//redSocialHinchada.buscarPersonasPorEquipo(redSocialHinchada.getMiembros(),Equipo.LIGA_QUITO);
		
		//Enfoque 2
		//redSocialHinchada.buscarPersonasPorRangoFechaNacimiento(redSocialHinchada.getMiembros(), LocalDate.of(1994, 05, 01), LocalDate.of(1996, 8, 10));
		
		//Enfoque 3
		//CriterioBusquedaPorAntecedente criterioAntecedente = new CriterioBusquedaPorAntecedente();
		//redSocialHinchada.buscarFanaticoPorCriterioDado(redSocialHinchada.getMiembros(), criterioAntecedente );
		
		//Enfoque 4
		/*redSocialHinchada.buscarFanaticoPorCriterioDado(redSocialHinchada.getMiembros(), new Criterio() {
			
			@Override
			public boolean verificar(Fanatico f) {
				return f.getEstado().equals(Estado.ACTIVO);
			}
			
			@Override
			public String toString()
			{
				return "Estado activo";
			}
		} );
		*/
		/*
		RedSocialHinchada.buscarFanaticoPorCriterioDado(redSocialHinchada.getMiembros(), 
				new Criterio() {
			
			@Override
			public boolean verificar(Fanatico f) {
				if(f.isSocio() && f.getAntiguedadAnios()>2 && f.getEstado().equals(Estado.ACTIVO))
				{
					return true;
				}
				return false;
			}
			
			@Override
			public String toString()
			{
				return "Socios con derecho a voto";
			}
			
		});
		*/
		/*
		RedSocialHinchada.buscarFanaticoPorCriterioDado(redSocialHinchada.getMiembros(), 
				new Criterio() {
					
					@Override
					public boolean verificar(Fanatico f) {
						int edad = LocalDate.now().getYear() - f.getFechaNacimiento().getYear();
						if(edad>18 && f.isAntecedentes() && !f.getEstado().equals(Estado.INHABILITADO))
						{
							return true;
						}
						return false;
					}
					
					@Override
					public String toString()
					{
						return "Vandalos que deben ser vigilados"; 
					}
				});
		*/
		//Enfoque 5: Expresiones Lambda
		/*
		RedSocialHinchada.buscarFanaticoPorCriterioDado(redSocialHinchada.getMiembros(), 
				f -> f.isAntecedentes());
		*/
		/*
		RedSocialHinchada.buscarFanaticoPorCriterioDado(redSocialHinchada.getMiembros(),
				(Fanatico f) -> {
					if(f.isSocio() && f.getAntiguedadAnios()>=2 && f.getEstado().equals(Estado.ACTIVO))
					{
						return true;
					}
					return false;
				});
		*/
		
		//Enfoque 6: Lambdas con Interfaces funcionales estandar
		/*
		RedSocialHinchada.
		buscarFanaticoPorCriterioDadoInterfazFuncionalEstandar(
				redSocialHinchada.getMiembros(),
				f -> f.isAntecedentes(), 
				"Con antecedentes");
		*/
		 
		//Deber es implementar la verificacion de socios a votar con el enfoque 6
		
		//Enfoque 7: Aplicamos accion sobre hinchas filtrados a traves de lambdas y otras interfaces funcionales (Consumer).
		/*
		List<Fanatico> listaFanaticosAntecendetesBorrados = 
		RedSocialHinchada.buscarFanaticosAplicandoAccion(
				redSocialHinchada.getMiembros(), 
				f -> f.isAntecedentes(), 
				"Antecedentes", 
				f -> f.setAntecedentes(false));
		
		System.out.println("La lista a los que borramos antecedentes es: " + listaFanaticosAntecendetesBorrados);
		
		System.out.println("Lista sin antecedentes: \n" + redSocialHinchada.getMiembros());
		*/
		//Filtrar Hinchas que sean socios 
		//con mas de 2 anos y simular
		//enviarles un email 
		//(Imprimir nombre y email diciendole que se acerque 
		//a votar).
		
		//Enfoque 7.1 Enviar email a socios activos
		/*
		RedSocialHinchada.buscarFanaticosAplicandoAccion(
				redSocialHinchada.getMiembros(),
				f -> f.isSocio() && f.getAntiguedadAnios()>=2, 
				"Socios sufragantes", 
				f -> System.out.println("Socio " + f.getNombre() + " acercarse a votar a su club " + f.getEquipo() + " en las elecciones.... (Enviando email a " + f.getEmail() +" )." ));
		
		
		//Enfoque 7.2: Usando la funcion Mapper
		List<Fanatico> sociasMujeresPromo = 
				RedSocialHinchada.buscarFanaticosAplicandoAccionYMapeando(
				redSocialHinchada.getMiembros(), 
				f -> f.getGenero().equals(Genero.FEMENINO) && f.isSocio() , 
				"Promocion mujeres socios", 
				f -> f.setAntiguedadAnios(f.getAntiguedadAnios()*2), 
				f -> f.getEmail(), 
				s -> procesarEmail(s));
		
		System.out.println(sociasMujeresPromo);
		*/
		
		//Enfoque 8: Genericos email a socios activos a votar
		/*List<Fanatico> hinchasVotantesNotificados =
				RedSocialHinchada.<Fanatico, Persona> procesarElementos(
						redSocialHinchada.getMiembros(), 
						(Fanatico f) -> f.isSocio() && f.getAntiguedadAnios()>=2 
						&& f.getEstado().equals(Estado.ACTIVO),
						(Fanatico f) -> {return (Persona) f;},
						(Persona p) -> {
							if(LocalDate.now().getDayOfMonth() == p.getFechaNacimiento().getDayOfMonth() 
									&& LocalDate.now().getMonthValue() == p.getFechaNacimiento().getMonthValue())
							{
								p.emailFelicitacionCumple();
							}
						} );	
		
		System.out.println(hinchasVotantesNotificados);
		*/
		//Ejercicio enfoque 8
		//Preguntar si el fanatico es de el equipo XXXX
		//Retornar ese equipo como String
		//En base al string vamos a ejecutar una funcion que haga una barra para ese equipo
		
		//Enfoque 9: Aggregated Operations
		/*
		 redSocialHinchada.getMiembros().stream()
			.filter( f -> f.isSocio())
			.map( f -> f.getEmail())
			.forEach( s -> procesarEmail(s));
		*/
		/*
		int anoMinimoNacimientoSocio = redSocialHinchada.getMiembros().stream()
			.filter(f -> f.getGenero().equals(Genero.MASCULINO))
			.mapToInt(f -> f.getFechaNacimiento().getYear())
			.min().getAsInt();
		System.out.println("El anio minimo de nacimiento de un socio es: " + anoMinimoNacimientoSocio);
		*/
		/*
		int conteoMujeresHinchas = (int) redSocialHinchada.getMiembros().stream()
			.filter(f -> f.getGenero().equals(Genero.FEMENINO))
			.count();
		System.out.println("El numero de mujeres hincha inscritas son: " + conteoMujeresHinchas);
		*/
		redSocialHinchada.getMiembros().stream()
			.map(f -> (Persona) f)
			.forEach(f -> { if( LocalDate.now().getMonthValue() == f.getFechaNacimiento().getMonthValue() &&
					LocalDate.now().getDayOfMonth() == f.getFechaNacimiento().getDayOfMonth())
				{
					f.emailFelicitacionCumple();
				}});
		
		//
	}	
	
	
	
	public static void procesarEmail(String s){
		System.out.println("Enviando email a: " + s);
	}
	
}
