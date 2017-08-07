package redsocial;

import java.time.LocalDate;

public class Persona {
	
	public enum Genero{
		MASCULINO, FEMENINO, OTROS, PREFIERO_NO_DECIR;
	}
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private Genero genero;
	private String email;
	
	public Persona(String nombre, LocalDate fechaNacimiento, Genero genero, String email) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.email = email;
	}

	public Persona(String nombre, LocalDate fechaNacimiento, String email) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.genero = Genero.PREFIERO_NO_DECIR;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", email="
				+ email + "]";
	}
	
	public void emailFelicitacionCumple()
	{
		System.out.println("Hola" + nombre + " solo te escribiamos para desearte un feliz cumpleanos.");
		System.out.println("Haz que este " + fechaNacimiento.getDayOfMonth() + "/" + fechaNacimiento.getMonthValue() +" sea especial." );
		SimuladorRedHinchada.procesarEmail(email);
	}
	
	
	
	
}
