package Model;

import java.io.Serializable;
import java.util.Date;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica implements Serializable{
    
    private DefaultCategoryDataset Datos;
    private JFreeChart Grafico;
    private ChartPanel Panel;
    private Date Fecha;

    public Grafica(DefaultCategoryDataset Datos, JFreeChart Grafico, Date Fecha) {
        this.Datos = Datos;
        this.Grafico = Grafico;
        this.Fecha = Fecha;
        this.Panel = new ChartPanel(this.Grafico);
    }

    public DefaultCategoryDataset getDatos() {
        return Datos;
    }

    public JFreeChart getGrafico() {
        return Grafico;
    }

    public ChartPanel getPanel() {
        return Panel;
    }

    public Date getFecha() {
        return Fecha;
    }
    
}
