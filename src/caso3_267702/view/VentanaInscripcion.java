package caso3_267702.view;

import caso3_267702.controller.InscripcionController;
import caso3_267702.model.Alumno;
import caso3_267702.model.Taller;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandra
 */

    public class VentanaInscripcion extends javax.swing.JFrame {

    private InscripcionController controlador;
    private Taller tallerSeleccionado;
    private Alumno alumnoEncontrado;
    
    public VentanaInscripcion () {
        initComponents();
        controlador = new InscripcionController();
        txtDetallesTaller.setEditable(false);
        txtFlujoAlumno.setEditable(false);
        txtFlujoAlumno.setText("Seleccione un taller y presione 'Inscribirse'.");
        
        // Se cargan los talleres en la lista
        DefaultListModel modeloLista = new DefaultListModel();
        for (Taller t : controlador.getTalleres()) {
            modeloLista.addElement(t);
        }
        listTalleres.setModel(modeloLista);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTalleres = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDetallesTaller = new javax.swing.JTextArea();
        btnInscribirse = new javax.swing.JButton();
        txtIdAlumno = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtFlujoAlumno = new javax.swing.JTextArea();
        btnValidarId = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listTalleres.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTalleres.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTalleresValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listTalleres);

        txtDetallesTaller.setColumns(20);
        txtDetallesTaller.setRows(5);
        jScrollPane4.setViewportView(txtDetallesTaller);

        btnInscribirse.setText("Inscribirse");
        btnInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirseActionPerformed(evt);
            }
        });

        txtFlujoAlumno.setColumns(20);
        txtFlujoAlumno.setRows(5);
        jScrollPane5.setViewportView(txtFlujoAlumno);

        btnValidarId.setText("Validar Id");
        btnValidarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnValidarId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnInscribirse)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnValidarId)
                            .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInscribirse)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirseActionPerformed
        if (listTalleres.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un taller de la lista.");
            return;
        }
        // Coloca las instrucciones iniciales en la zona de flujo antes del recibo
        txtFlujoAlumno.setText("Materia apartada temporalmente.\nPor favor, ingrese su ID en la parte superior y presione 'Validar Id'.");
        txtIdAlumno.requestFocus();        
    }//GEN-LAST:event_btnInscribirseActionPerformed

    private void btnValidarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarIdActionPerformed
  if (tallerSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Primero seleccione un taller de la lista e intente de nuevo.", "Atención", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String idStr = txtIdAlumno.getText().trim();
         if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de ID no puede estar vacio. Por favor ingrese su matricula.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
            txtFlujoAlumno.setText("Error: No se ingreso ningun ID.\nEscriba su matricula para continuar.");
            txtIdAlumno.requestFocus();
            return;
        }
        alumnoEncontrado = controlador.buscarAlumnoPorId(idStr);
        if (alumnoEncontrado == null) {
            JOptionPane.showMessageDialog(this, "El ID ingresado es erroneo o no esta registrado en el sistema.", "ID Erroneo", JOptionPane.ERROR_MESSAGE);
            txtFlujoAlumno.setText("Error: Matricula no registrada.\nIntente con un ID valido (Ej. 00000267702).");
            txtIdAlumno.selectAll();
            txtIdAlumno.requestFocus();
            return;
        }
        int folio = new java.util.Random().nextInt(90000) + 10000;
        
        txtFlujoAlumno.setText(
            "==============================================\n" +
            "          RECIBO FINAL DE INSCRIPCION         \n" +
            "==============================================\n" +
            " Folio Ticket: ISW-" + folio + "\n" +
            " ID Alumno:    " + alumnoEncontrado.getId() + "\n" +
            " Nombre:       " + alumnoEncontrado.getNombre() + "\n" +
            " Programa:     " + alumnoEncontrado.getProgramme() + "\n" +
            "--------------------------------------------------\n" +
            " Curso:        " + tallerSeleccionado.getNombre() + "\n" +
            " Instructor:   " + tallerSeleccionado.getInstructor() + "\n" +
            " Horario:      " + tallerSeleccionado.getHorario() + " (" + tallerSeleccionado.getFecha() + ")\n" +
            "==============================================\n" +
            "      ¡Inscripción Confirmada Exitosamente!    ");
        JOptionPane.showMessageDialog(this, "La inscripcion fue exitosa... ¡Recibo generado en pantalla!");

    }//GEN-LAST:event_btnValidarIdActionPerformed

    private void listTalleresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTalleresValueChanged
      if (!evt.getValueIsAdjusting()) {
            Object seleccion = listTalleres.getSelectedValue();
            if (seleccion instanceof Taller) {
                tallerSeleccionado = (Taller) seleccion;
            } else if (seleccion != null) {
                String nombreTaller = String.valueOf(seleccion);
                for (Taller t : controlador.getTalleres()) {
                    if (t.getNombre().equals(nombreTaller)) {
                        tallerSeleccionado = t;
                        break;
                    }
                }
            }
            if (tallerSeleccionado != null) {
                txtDetallesTaller.setText(
                    "==============================================\n" +
                    "       VISTA DE LA MATERIA SELECCIONADA       \n" +
                    "==============================================\n" +
                    " Taller:     " + tallerSeleccionado.getNombre() + "\n" +
                    " Instructor: " + tallerSeleccionado.getInstructor() + "\n" +
                    " Fecha:      " + tallerSeleccionado.getFecha() + "\n" +
                    " Horario:    " + tallerSeleccionado.getHorario() + "\n" +
                    "=============================================="
                );
            }
      }
    }//GEN-LAST:event_listTalleresValueChanged
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInscripcion().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribirse;
    private javax.swing.JButton btnValidarId;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listTalleres;
    private javax.swing.JTextArea txtDetallesTaller;
    private javax.swing.JTextArea txtFlujoAlumno;
    private javax.swing.JTextField txtIdAlumno;
    // End of variables declaration//GEN-END:variables
}
