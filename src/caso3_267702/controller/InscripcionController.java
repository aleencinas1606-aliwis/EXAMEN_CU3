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
        // Datos de prueba para simular lo que seria la base de datos
        listaTalleres.add(new Taller("T1", "Arquitectura de Software", "Dr. Ramon Rene", "19/Oct/2026", "09:00 - 11:00"));
        listaTalleres.add(new Taller("T2", "Desarrollo web", "Mtra. Brianda", "20/Oct/2026", "11:00 - 13:00"));
        listaTalleres.add(new Taller("T3", "Ingenieria de Requisitos", "Ing. German", "19/Oct/2026", "14:00 - 16:00"));
        listaTalleres.add(new Taller("T4", "Calculo", "Mtra. Susana", "21/Oct/2026", "12:00 - 13:00"));
        listaTalleres.add(new Taller("T5", "Diseño de software", "Ing. Mejia", "21/Oct/2026", "14:00 - 16:00"));
        listaTalleres.add(new Taller("T6", "Redes", "Ing. Benitez", "20/Oct/2026", "08:00 - 09:00"));

        listaAlumnos.add(new Alumno("00000267702", "Alejandra Encinas Ayala", 5, "Ingeniería en Software"));
        listaAlumnos.add(new Alumno("00000267048", "Diego Saul Enriquez Campoy", 7, "Ingeniería en Software"));
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
