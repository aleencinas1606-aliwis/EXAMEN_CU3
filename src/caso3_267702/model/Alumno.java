package caso3_267702.model;
/**
 *
 * @author Alejandra
 */
public class Alumno {
  private String id;
    private String nombre;
    private int semestre;
    private String programme;

    public Alumno(String id, String nombre, int semestre, String programme) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programme = programme;
    }

    public String getId() 
    { return id; }
    public String getNombre() 
    { return nombre; }
    public int getSemestre() 
    { return semestre; }
    public String getProgramme() 
    { return programme; }
}