package Model;

import java.util.Date;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica {
    
    private DefaultCategoryDataset Datos;
    private JFreeChart Grafico;
    private ChartPanel Panel;
    private Date Fecha;

    public Grafica(DefaultCategoryDataset Datos, JFreeChart Grafico, ChartPanel Panel, Date Fecha) {
        this.Datos = Datos;
        this.Grafico = Grafico;
        this.Panel = Panel;
        this.Fecha = Fecha;
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
