/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bdd;

import back.SQL.consultasSQL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kcano
 */
public class alquilarPelicula extends javax.swing.JFrame {

    /**
     * Creates new form alquilarPelicula
     */
    String Ubicacion = "Quito";
    
    public alquilarPelicula() {
        initComponents();
        DefaultTableModel modeloTabla = consulta.consultarAgencia(Ubicacion);
        tablaAgencia.setModel(modeloTabla);
        this.botonCiudad.setText(Ubicacion);

    }

    consultasSQL consulta = new consultasSQL();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnMenuD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAgencia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPeliculas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        botonCiudad = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 35, 38));

        jPanel1.setBackground(new java.awt.Color(30, 35, 38));

        jLabel16.setBackground(new java.awt.Color(28, 182, 152));
        jLabel16.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(28, 182, 152));
        jLabel16.setText("Alquiler de Peliculas");

        jButton3.setBackground(new java.awt.Color(28, 182, 152));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ALQUILAR");
        jButton3.setMaximumSize(new java.awt.Dimension(125, 30));
        jButton3.setMinimumSize(new java.awt.Dimension(125, 30));
        jButton3.setPreferredSize(new java.awt.Dimension(125, 45));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnMenuD.setBackground(new java.awt.Color(28, 182, 152));
        btnMenuD.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuD.setText("MENÚ");
        btnMenuD.setMaximumSize(new java.awt.Dimension(125, 30));
        btnMenuD.setMinimumSize(new java.awt.Dimension(125, 30));
        btnMenuD.setPreferredSize(new java.awt.Dimension(125, 45));
        btnMenuD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDActionPerformed(evt);
            }
        });

        tablaAgencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAgencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAgenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAgencia);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONAR LA AGENCIA");

        tablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPeliculasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPeliculas);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONAR PELICULA");

        botonCiudad.setText("jToggleButton1");
        botonCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnMenuD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(189, 189, 189))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(botonCiudad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addGap(31, 31, 31)
                .addComponent(botonCiudad)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDActionPerformed
        this.dispose();
        main main = new main();
        main.setVisible(true);
    }//GEN-LAST:event_btnMenuDActionPerformed

    private void tablaAgenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAgenciaMouseClicked

        int filaSeleccionada = tablaAgencia.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Se ha seleccionado una fila
            // Ahora puedes acceder a los datos de esa fila
            Object valorColumna1 = tablaAgencia.getValueAt(filaSeleccionada, 0); // Reemplaza 'columna1' con el número de la columna que deseas obtener
            DefaultTableModel modeloTabla = consulta.consultarPelicula(valorColumna1.toString());
            tablaPeliculas.setModel(modeloTabla);
        } else {
            // No se ha seleccionado ninguna fila
            System.out.println("Ninguna fila seleccionada");
        }

    }//GEN-LAST:event_tablaAgenciaMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked


    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String IDSocio = JOptionPane.showInputDialog("Ingrese su ID de socio");
        
        Object valorColumna2=null;
        Object valorColumna6=null;
        
        int filaSeleccionada0 = tablaAgencia.getSelectedRow();
        
        

        if (filaSeleccionada0 != -1) {
            // Se ha seleccionado una fila
            // Ahora puedes acceder a los datos de esa fila
            valorColumna2 = tablaAgencia.getValueAt(filaSeleccionada0, 1);// Reemplaza 'columna1' con el número de la columna que deseas obtener      
        }
        
        
        int filaSeleccionada = tablaPeliculas.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Se ha seleccionado una fila
            // Ahora puedes acceder a los datos de esa fila
                       
            valorColumna6 = tablaPeliculas.getValueAt(filaSeleccionada, 5);
        }
        
        try {
            consulta.alquilarPelicula(valorColumna6.toString(),IDSocio,valorColumna2.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPeliculasMouseClicked
        int filaSeleccionada = tablaPeliculas.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Se ha seleccionado una fila
            // Ahora puedes acceder a los datos de esa fila
            Object valorColumna4 = tablaPeliculas.getValueAt(filaSeleccionada, 3);
            Object valorColumna5 = tablaPeliculas.getValueAt(filaSeleccionada, 4);
        }
    }//GEN-LAST:event_tablaPeliculasMouseClicked

    private void botonCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCiudadActionPerformed
             
        if(this.botonCiudad.isSelected()){
            Ubicacion = "Guayaquil";          
            
        }else{
            Ubicacion = "Quito";
        }
        
        this.botonCiudad.setText(Ubicacion);
        this.tablaAgencia.setModel(consulta.consultarAgencia(Ubicacion));
    }//GEN-LAST:event_botonCiudadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(alquilarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alquilarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alquilarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alquilarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alquilarPelicula().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonCiudad;
    private javax.swing.JButton btnMenuD;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAgencia;
    private javax.swing.JTable tablaPeliculas;
    // End of variables declaration//GEN-END:variables
}
