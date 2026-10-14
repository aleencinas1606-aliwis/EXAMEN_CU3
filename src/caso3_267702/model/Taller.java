package caso3_267702.model;
/**
 *
 * @author Alejandra
 */
public class Taller {
    private String id;
    private String nombre;
    private String instructor;
    private String fecha;
    private String horario;

    public Taller(String id, String nombre, String instructor, String fecha, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.instructor = instructor;
        this.fecha = fecha;
        this.horario = horario;
    }

    public String getId() 
    { return id; }
    public String getNombre() 
    { return nombre; }
    public String getInstructor() 
    { return instructor; }
    public String getFecha() 
    { return fecha; }
    public String getHorario() 
    { return horario; }

    @Override
    public String toString() {
        return nombre; // Permite que se despliegue el nombre directamente en las listas visuales
    }
}
