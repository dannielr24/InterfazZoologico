package cl.duoc.interfazzoologico.gui;

import cl.duoc.interfazzoologico.dto.AnimalDTO;
import cl.duoc.interfazzoologico.service.IZoologicoService;
import cl.duoc.interfazzoologico.service.ZoologicoService;
import java.util.List;
import javax.swing.JOptionPane;


public class ViewRegistrarAnimales extends javax.swing.JInternalFrame {
    
    
    private static IZoologicoService servicio;
    public ViewRegistrarAnimales() {
        initComponents();
        if(servicio == null)
            servicio = new ZoologicoService();
    }
    
    public ViewRegistrarAnimales(AnimalDTO a){
        initComponents();
        
        if(servicio == null)
            servicio = new ZoologicoService();
        
        txtNumeroRegistro.setText(String.valueOf(a.getNumeroRegistro()));
        txtNombreAnimal.setText(a.getNombre());
        txtEdad.setText(String.valueOf(a.getEdad()));
        cboTipoClima.setSelectedItem(a.getTipoClima());
        txtDescripcionAnimal.setText(a.getDescripcion());
        
                }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroRegistro = new javax.swing.JLabel();
        lblNombreAnimal = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblTipoClima = new javax.swing.JLabel();
        lblDescripcionAnimal = new javax.swing.JLabel();
        txtNumeroRegistro = new javax.swing.JTextField();
        txtNombreAnimal = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnGuardarAnimal = new javax.swing.JButton();
        btnEliminarAnimal = new javax.swing.JButton();
        cboTipoClima = new javax.swing.JComboBox<>();
        txtDescripcionAnimal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro Animales");

        lblNumeroRegistro.setText("Número Registro");

        lblNombreAnimal.setText("Nombre Animal");

        lblEdad.setText("Edad");

        lblTipoClima.setText("Tipo Clima");

        lblDescripcionAnimal.setText("Descripción Animal");

        btnGuardarAnimal.setText("Guardar Animal");
        btnGuardarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAnimalActionPerformed(evt);
            }
        });

        btnEliminarAnimal.setText("Eliminar Animal");
        btnEliminarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAnimalActionPerformed(evt);
            }
        });

        cboTipoClima.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Árido", "Tropical", "Selva", "Otro" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(btnEliminarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumeroRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTipoClima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescripcionAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroRegistro)
                            .addComponent(txtNombreAnimal)
                            .addComponent(txtEdad)
                            .addComponent(cboTipoClima, 0, 270, Short.MAX_VALUE)
                            .addComponent(txtDescripcionAnimal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroRegistro)
                    .addComponent(txtNumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreAnimal)
                    .addComponent(txtNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoClima)
                    .addComponent(cboTipoClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcionAnimal)
                    .addComponent(txtDescripcionAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnEliminarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAnimalActionPerformed
        // TODO add your handling code here:
        try{
            int numeroRegistro = Integer.parseInt(txtNumeroRegistro.getText());
            String nombre = txtNombreAnimal.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String tipoClima = cboTipoClima.getSelectedItem().toString();
            String descripcion = txtDescripcionAnimal.getText();
            
            AnimalDTO nuevoAnimal = new AnimalDTO(numeroRegistro, nombre, edad, tipoClima, descripcion) {};
            
            servicio.registrarAnimal(nuevoAnimal);
            
            JOptionPane.showMessageDialog(this, "Animal registrado exitosamente");
            
            limpiarCampos();
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese valores númericos válidos para el número de registro y la edad");
        }       
            
            
        
    }//GEN-LAST:event_btnGuardarAnimalActionPerformed

    private void btnEliminarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAnimalActionPerformed
        // TODO add your handling code here:
        int indiceSeleccionado = obtenerIndiceAnimalSeleccionedo();
        
        if(indiceSeleccionado >= 0){
            List<AnimalDTO> listaAnimales = servicio.obtenerTodosLosAnimales();
            
            if(indiceSeleccionado < listaAnimales.size()){
                AnimalDTO animalSeleccionado = listaAnimales.get(indiceSeleccionado);
                
                servicio.eliminarAnimalDeAmbiente(animalSeleccionado);
            }
        }
           
    }//GEN-LAST:event_btnEliminarAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAnimal;
    private javax.swing.JButton btnGuardarAnimal;
    private javax.swing.JComboBox<String> cboTipoClima;
    private javax.swing.JLabel lblDescripcionAnimal;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombreAnimal;
    private javax.swing.JLabel lblNumeroRegistro;
    private javax.swing.JLabel lblTipoClima;
    private javax.swing.JTextField txtDescripcionAnimal;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreAnimal;
    private javax.swing.JTextField txtNumeroRegistro;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtNumeroRegistro.setText("");
        txtNombreAnimal.setText("");
        txtEdad.setText("");
        cboTipoClima.setSelectedIndex(0);
        txtDescripcionAnimal.setText("");
    }

    private int obtenerIndiceAnimalSeleccionedo() {
        String nombreAnimalSeleccionado = JOptionPane.showInputDialog("Ingrese el nombre del animal seleccionado:");
        List<AnimalDTO> listaAnimales = servicio.obtenerTodosLosAnimales();
        for(int i = 0; i < listaAnimales.size(); i++){
            AnimalDTO animal = listaAnimales.get(i);
            if(animal.getNombre().equals(nombreAnimalSeleccionado)){
                return i;
    }
        }
        return -1;
    }
}
