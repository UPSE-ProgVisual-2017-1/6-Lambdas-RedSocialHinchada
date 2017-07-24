package redsocial;

import java.time.LocalDate;

import redsocial.Fanatico.Estado;
import redsocial.Persona.Genero;

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
		Fanatico gordaNatosa = new Fanatico("Gorda", LocalDate.of(1972, 2, 6), Genero.FEMENINO, "gordaEmelec@hincha.com", Equipo.EMELEC, true, false, 15, Estado.ACTIVO);
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
		
		redSocialHinchada.buscarPersonasPorEquipo(Equipo.LIGA_QUITO);
	}

}
