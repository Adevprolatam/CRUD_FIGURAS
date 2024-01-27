/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import backend.Circulo;
import backend.Cuadrado;
import backend.FiguraCRUD;
import backend.Triangulo;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class VaciarFiguras extends javax.swing.JPanel {

    /**
     * Creates new form VaciarFiguras
     */
    FiguraCRUD figuraDAO;
    public VaciarFiguras(FiguraCRUD figuraDAO ) {
        this.figuraDAO = figuraDAO;
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        container_content = new javax.swing.JPanel();
        jLabelCuadrado = new javax.swing.JLabel();
        jLabelCirculo = new javax.swing.JLabel();
        jLabelTriangulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(594, 419));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(600, 400));

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(30, 33, 44));
        title.setText("Vaciar DB Figuras");

        description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        description.setForeground(new java.awt.Color(51, 51, 51));
        description.setText("Este módulo vacia toda las áreas calculadas de las figuras");

        jLabel1.setBackground(new java.awt.Color(43, 105, 92));
        jLabel1.setForeground(new java.awt.Color(43, 105, 92));
        jLabel1.setText("Para vaciar las áreas presione la figura deseada.");

        container_content.setBackground(new java.awt.Color(255, 255, 255));
        container_content.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 244, 247), 2, true));

        // Cargar la imagen del cuadrado
        java.net.URL urlCuadrado = getClass().getResource("/imagenes/Cuadrado_M.png");
        ImageIcon iconoCuadrado = new ImageIcon(urlCuadrado);
        jLabelCuadrado.setIcon(iconoCuadrado);
        jLabelCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCuadradoMouseClicked(evt);
            }
        });

        // Cargar la imagen del círculo
        java.net.URL urlCirculo = getClass().getResource("/imagenes/Circulo_M.png");
        ImageIcon iconoCirculo = new ImageIcon(urlCirculo);
        jLabelCirculo.setIcon(iconoCirculo);
        jLabelCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCirculoMouseClicked(evt);
            }
        });

        // Cargar la imagen del triángulo
        java.net.URL urlTriangulo = getClass().getResource("/imagenes/Triangulo_M.png");
        ImageIcon iconoTriangulo = new ImageIcon(urlTriangulo);
        jLabelTriangulo.setIcon(iconoTriangulo);
        jLabelTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTrianguloMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(43, 105, 92));
        jLabel2.setText("Circulo");

        jLabel3.setForeground(new java.awt.Color(43, 105, 92));
        jLabel3.setText("Cuadrado");

        jLabel4.setForeground(new java.awt.Color(43, 105, 92));
        jLabel4.setText("Triángulo");

        javax.swing.GroupLayout container_contentLayout = new javax.swing.GroupLayout(container_content);
        container_content.setLayout(container_contentLayout);
        container_contentLayout.setHorizontalGroup(
            container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_contentLayout.createSequentialGroup()
                .addGroup(container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_contentLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabelCirculo))
                    .addGroup(container_contentLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addGroup(container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_contentLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addGroup(container_contentLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelCuadrado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTriangulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_contentLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)))
                .addGap(27, 27, 27))
        );
        container_contentLayout.setVerticalGroup(
            container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_contentLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTriangulo)
                    .addComponent(jLabelCuadrado)
                    .addComponent(jLabelCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(container_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(description)
                    .addComponent(title))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(container_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTrianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTrianguloMouseClicked
        actualizarDatos("TRIANGULO");
    }//GEN-LAST:event_jLabelTrianguloMouseClicked

    private void jLabelCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCirculoMouseClicked
        actualizarDatos("CIRCULO");
    }//GEN-LAST:event_jLabelCirculoMouseClicked

    private void jLabelCuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCuadradoMouseClicked
        actualizarDatos("CUADRADO");
    }//GEN-LAST:event_jLabelCuadradoMouseClicked
    
    private void actualizarDatos(String tipoFigura) {
    
    if (tipoFigura.equals("CIRCULO")) {
       List<Circulo> listaCirculos = figuraDAO.obtenerListaCirculos();
        if (listaCirculos.size() == 0){
            JOptionPane.showMessageDialog(this, "No hay datos existentes en la DB " , "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            figuraDAO.eliminarColeccionCirculo();
            JOptionPane.showMessageDialog(this, "Coleccion de Círculos eliminados correctamente a la base de datos");
        }
    } else if (tipoFigura.equals("CUADRADO")) {
        List<Cuadrado> listaCuadrados = figuraDAO.obtenerListaCuadrado();
        if (listaCuadrados.size() == 0){
            JOptionPane.showMessageDialog(this, "No hay datos existentes en la DB " , "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            figuraDAO.eliminarColeccionCuadrado();
            JOptionPane.showMessageDialog(this, "Coleccion de Cuadrados eliminados correctamente a la base de datos");
        }
        
    } else if (tipoFigura.equals("TRIANGULO")) {
        List<Triangulo> listaTriangulos = figuraDAO.obtenerListaTriangulos();
        if (listaTriangulos.size() == 0){
            JOptionPane.showMessageDialog(this, "No hay datos existentes en la DB " , "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            figuraDAO.eliminarColeccionTriangulos();
            JOptionPane.showMessageDialog(this, "Coleccion de Triangulos eliminados correctamente a la base de datos");
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel container_content;
    private javax.swing.JLabel description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCirculo;
    private javax.swing.JLabel jLabelCuadrado;
    private javax.swing.JLabel jLabelTriangulo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
