import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio {

    private String dni;
    private String nombre;
    private LocalDate fechaAlta;
    
    private static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
    }

    public Socio(String dni, String nombre, String alta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = LocalDate.parse(alta, formatoFecha);
    }

    public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int antiguedad() {
        return (int) this.fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object o) {
    	Socio otro = (Socio) o;
        return this.dni.equals(otro.dni);
    }

	@Override
	public String toString() {
		return "Socio [dni=" + this.dni + ", nombre=" + this.nombre + ", fechaAlta=" + this.fechaAlta.format(formatoFecha) + "]";
	}

}