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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnValidarId)
                                .addGap(26, 26, 26)
                                .addComponent(txtIdAlumno))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnInscribirse)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Object seleccion = listTalleres.getSelectedValue();
       if (seleccion instanceof Taller) {
        tallerSeleccionado = (Taller) seleccion;
        } else {
  
    String nombreTaller = String.valueOf(seleccion);
    for (Taller t : controlador.getTalleres()) {
        if (t.getNombre().equals(nombreTaller)) {
            tallerSeleccionado = t;
            break;
        }
       }
     }
    }//GEN-LAST:event_btnInscribirseActionPerformed

    private void btnValidarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarIdActionPerformed
     if (tallerSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Primero seleccione un taller y presione Inscribirse.");
            return;
        }
        
        String idStr = txtIdAlumno.getText().trim();
        alumnoEncontrado = controlador.buscarAlumnoPorId(idStr);
        
        if (alumnoEncontrado != null) {
            int folio = new java.util.Random().nextInt(90000) + 10000;
            txtFlujoAlumno.setText(
                "==============================================\n" +
                "               TICKET DE INSCRIPCION              \n" +
                "================================================\n" +
                "Folio Ticket: ISW-" + folio + "\n" +
                "ID Alumno:    " + alumnoEncontrado.getId() + "\n" +
                "Nombre:       " + alumnoEncontrado.getNombre() + "\n" +
                "Programa:     " + alumnoEncontrado.getProgramme() + "\n" +
                "--------------------------------------------------\n" +
                "Curso:        " + tallerSeleccionado.getNombre() + "\n" +
                "Horario:      " + tallerSeleccionado.getHorario() + "\n" +
                "=============================================="
            );
            JOptionPane.showMessageDialog(this, "La inscripcion fue exitosa... Ticket generado");
        } else {
            txtFlujoAlumno.setText("Alumno no encontrado.\n(ID de prueba valida: 00000267702)");
        }
    }//GEN-LAST:event_btnValidarIdActionPerformed
 
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
