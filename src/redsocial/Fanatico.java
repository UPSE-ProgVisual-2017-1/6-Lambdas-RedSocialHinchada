package redsocial;

import java.time.LocalDate;

public class Fanatico extends Persona{

	public enum Estado{
		ACTIVO, INACTIVO, INHABILITADO;
	}
	
	private Equipo equipo;
	private boolean socio = false;
	private boolean antecedentes = false;
	private int antiguedadAnios = 0;
	private Estado estado = Estado.INACTIVO;
	
	public Fanatico(String nombre, LocalDate fechaNacimiento, Genero genero, String email, Equipo equipo) {
		super(nombre, fechaNacimiento, genero, email);
		this.equipo = equipo;
		this.socio = false;
		this.antecedentes = false;
		this.antiguedadAnios = 0;
		this.estado = Estado.ACTIVO;
		// TODO Auto-generated constructor stub
	}

	public Fanatico(String nombre, LocalDate fechaNacimiento, Genero genero, String email, Equipo equipo, boolean socio,
			boolean antecedentes, int antiguedadAnios, Estado estado) {
		super(nombre, fechaNacimiento, genero, email);
		this.equipo = equipo;
		this.socio = socio;
		this.antecedentes = antecedentes;
		this.antiguedadAnios = antiguedadAnios;
		this.estado = estado;
	}

	public Fanatico(String nombre, LocalDate fechaNacimiento, Genero genero, String email, Equipo equipo,
			boolean socio) {
		super(nombre, fechaNacimiento, genero, email);
		this.equipo = equipo;
		this.socio = socio;
		this.antecedentes = false;
		this.antiguedadAnios = 0;
		this.estado = Estado.ACTIVO;
	}
	
	public Fanatico(String nombre, LocalDate fechaNacimiento, String email, Equipo equipo,
			boolean socio) {
		super(nombre, fechaNacimiento, email);
		this.equipo = equipo;
		this.socio = socio;
		this.antecedentes = false;
		this.antiguedadAnios = 0;
		this.estado = Estado.ACTIVO;
	}
	
	public Fanatico(String nombre, LocalDate fechaNacimiento, String email, Equipo equipo) {
		super(nombre, fechaNacimiento, email);
		this.equipo = equipo;
		this.socio = false;
		this.antecedentes = false;
		this.antiguedadAnios = 0;
		this.estado = Estado.ACTIVO;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public boolean isAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(boolean antecedentes) {
		this.antecedentes = antecedentes;
	}

	public int getAntiguedadAnios() {
		return antiguedadAnios;
	}

	public void setAntiguedadAnios(int antiguedadAnios) {
		this.antiguedadAnios = antiguedadAnios;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Fanatico [" + super.toString() + (equipo != null ? ", equipo=" + equipo + ", " : "") + "socio=" + socio + ", antecedentes="
				+ antecedentes + ", antiguedadAnios=" + antiguedadAnios + ", "
				+ (estado != null ? "estado=" + estado : "") + "]\n";
	}
	
	
	

}
