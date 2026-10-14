package caso3_267702.model;
/**
 *
 * @author Alejandra
 */
public class Inscripcion {
 private int idTicket;
    private Alumno alumno;
    private Taller taller;

    public Inscripcion(int idTicket, Alumno alumno, Taller taller) {
        this.idTicket = idTicket;
        this.alumno = alumno;
        this.taller = taller;
    }

    public int getIdTicket() 
    { return idTicket; }
    public Alumno getAlumno() 
    { return alumno; }
    public Taller getTaller() 
    { return taller; }
}
