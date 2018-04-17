package Model;

import java.io.Serializable;
import java.util.Calendar;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica implements Serializable{
    
    private DefaultCategoryDataset Datos;
    private JFreeChart Grafico;
    private ChartPanel Panel;
    private Calendar Fecha;
    private int Tipo;

    public Grafica(DefaultCategoryDataset Datos, JFreeChart Grafico, Calendar Fecha, int Tipo) {
        this.Datos = Datos;
        this.Grafico = Grafico;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
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

    public Calendar getFecha() {
        return Fecha;
    }

    public int getTipo() {
        return Tipo;
    }
    
}
