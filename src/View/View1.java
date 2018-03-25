package View;

import Model.Grafica;
import java.awt.Color;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class View1 extends javax.swing.JFrame {

    public View1() {
        initComponents();
        //Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String taxi1 = "Taxi 1";
        String taxi2 = "Taxi 2";
        String dia1 = "Día 1";
        String dia2 = "Día 2";
        String dia3 = "Día 3";
        String dia4 = "Día 4";
        dataset.addValue(18, taxi1, dia1);
        dataset.addValue(15, taxi1, dia2);
        dataset.addValue(16, taxi1, dia3);
        dataset.addValue(12, taxi1, dia4);
        dataset.addValue(16, taxi2, dia1);
        dataset.addValue(19, taxi2, dia2);
        dataset.addValue(10, taxi2, dia3);
        dataset.addValue(11, taxi2, dia4);
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Uso de los Taxis", //Título de la gráfica 
                "Días de labor", //leyenda Eje horizontal 
                "Número de carreras", //leyenda Eje vertical 
                dataset, //datos 
                PlotOrientation.VERTICAL, //orientación 
                true, //incluir leyendas 
                true, //mostrar tooltips 
                true);
        graficoBarras.setBackgroundPaint(Color.LIGHT_GRAY);
        CategoryPlot plot = (CategoryPlot) graficoBarras.getPlot();
        plot.setBackgroundPaint(Color.CYAN); //fondo del grafico 
        plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles 
        plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos 
        ChartPanel frame = new ChartPanel(graficoBarras);
        Grafica Graf = new Grafica(dataset, graficoBarras, new Date());
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(Graf.getPanel());
        jPanel1.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
