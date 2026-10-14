package caso3_267702.controller;

import caso3_267702.model.Alumno;
import caso3_267702.model.Taller;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandra
 */
public class InscripcionController {
    private List<Taller> listaTalleres;
    private List<Alumno> listaAlumnos;

    public InscripcionController() {
        listaTalleres = new ArrayList<>();
        listaAlumnos = new ArrayList<>();
        cargarDatosSimulados();
    }

    private void cargarDatosSimulados() {
        // Datos de prueba para simular la base de datos
        listaTalleres.add(new Taller("T1", "Arquitectura de Software", "Dr. Ramon Rene", "19/Oct/2026", "09:00 - 11:00"));
        listaTalleres.add(new Taller("T2", "Desarrollo de softw", "Mtra. Gómez", "20/Oct/2026", "11:00 - 13:00"));
        listaTalleres.add(new Taller("T3", "Modelado de procesos", "Ing. Rodríguez", "21/Oct/2026", "14:00 - 16:00"));

        listaAlumnos.add(new Alumno("0000012345", "Juan Pérez López", 5, "Ingeniería en Software"));
        listaAlumnos.add(new Alumno("0000067890", "Ana María Sosa", 7, "Ingeniería en Software"));
    }

    public List<Taller> getTalleres() {
        return listaTalleres;
    }

    public Alumno buscarAlumnoPorId(String id) {
        for (Alumno a : listaAlumnos) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

}
