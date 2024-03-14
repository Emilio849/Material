import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio {

    private int id;
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;
    
    private static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Socio(int id, String dni, String nombre) {
    	this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
    }

    public Socio(int id, String dni, String nombre, String alta) {
    	this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = LocalDate.parse(alta, formatoFecha);
    }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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
		return "Socio [id=" + this.id + ",dni=" + this.dni + ", nombre=" + this.nombre + ", fechaAlta=" + this.fechaAlta.format(formatoFecha) + "]";
	}

}
