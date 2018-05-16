package View;

import Controller.*;
import Model.*;
import java.awt.*;
import static java.awt.Event.ENTER;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class View1 extends javax.swing.JFrame {

    //instacio controladores
    private ProductoController Proco = new ProductoController();
    private ProveedorController Proveeco = new ProveedorController();
    private InsumoController Insumco = new InsumoController();
    private InsumoFacturaController InsuFactCo = new InsumoFacturaController();
    private ProductoFacturaController ProduFactCo = new ProductoFacturaController();
    private GraficoController GrafCo = new GraficoController();

    private Object IndexTable = null;
    public static String FileName = "";
    Panaderia Panaderia;

    public View1(String FileName, Panaderia Panaderia) {
        this.FileName = FileName;
        this.Panaderia = Panaderia;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        IconosPanel();
        cargar_datos(FileName);
        mbar_nameUser.setText("Usuario: " + FileName);
        ListAll();
        nombrePanReg_txt.requestFocus();

        this.setVisible(true);
    }

    public View1() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        IconosPanel();
        ListAll();
        nombrePanReg_txt.requestFocus();

        this.setVisible(true);
    }

    public String getFileName() {
        return FileName;
    }

    public Panaderia getPanaderia() {
        return Panaderia;
    }

    public void cargar_datos(String nameFile) {
        String path = "..\\PanaderiasData\\" + nameFile + ".dat";
        File fichero = new File(path);

        if (fichero.exists()) {
            try {
                FileInputStream archivo = new FileInputStream(path);
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                Usuario u1 = ((Usuario) obj_archivo.readObject());
                //poner las demas instancias aquí
                Proco.setLista_producto(u1.getLista_Producto());
                Proveeco.setLista_proovedor(u1.getLista_Proovedor());
                Insumco.setLista_Insumos(u1.getLista_Insumos());
                InsuFactCo.setLista_Factura(u1.getLista_Factura_insumo());
                GrafCo.setLista_Graficas(u1.getLista_Graficas());
                ProduFactCo.setLista_Factura(u1.getLista_Factura_producto());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo", "Error", 0);
            }
        }
        if (Proveeco.getLista_proovedor().size() <= 0 && Panaderia != null) {
            Proveeco.Create(new Proveedor(UUID.randomUUID().toString(), Panaderia.getNombre(), "PANADERIA", Panaderia.getContacto(),
                    Panaderia.getDireccion(), Panaderia.getNit(), 0));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_General = new javax.swing.JTabbedPane();
        Productos = new javax.swing.JTabbedPane();
        Registrar_Producto = new javax.swing.JPanel();
        nombrePanReg_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        precioPanReg_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPanesReg_tbl = new javax.swing.JTable();
        registrarPan_btn = new javax.swing.JButton();
        provePanReg_cmbx = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Modificar_Producto = new javax.swing.JPanel();
        GuardarEditPan_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPanesEdit_tbl = new javax.swing.JTable();
        precioPanEdit_txt = new javax.swing.JTextField();
        nombrePanEdit_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selecEditPan_chbx = new javax.swing.JCheckBox();
        nombrePanConsultEdit_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        consultPanEdit_btn = new javax.swing.JButton();
        EditPan_btn = new javax.swing.JButton();
        cancelarEditPan_btn = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        provePanEdit_cmbx = new javax.swing.JComboBox<>();
        cancelarBusqProd_btn = new javax.swing.JButton();
        Consultar_Producto = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nombrePanConsult_txt = new javax.swing.JTextField();
        consultPan_btn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPanesConsult_tbl = new javax.swing.JTable();
        cancelarBusquedaProd_btn = new javax.swing.JButton();
        Eliminar_Producto = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPanesEliminar_tbl = new javax.swing.JTable();
        nombrePanEliminar_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selecPanEliminar_chbx = new javax.swing.JCheckBox();
        eliminarPan_btn = new javax.swing.JButton();
        consultPanEliminar_btn = new javax.swing.JButton();
        cancelarElimProd_btn = new javax.swing.JButton();
        Cantidades = new javax.swing.JPanel();
        btn_GuardarEditCantidad = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbl_listaProdCantidad = new javax.swing.JTable();
        txt_CantidadProd = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_nombreProdConsultCantidad = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        btn_consultProdCantidad = new javax.swing.JButton();
        btn_EditProdCantidad = new javax.swing.JButton();
        btn_cancelarEditProdCantidad = new javax.swing.JButton();
        btn_cancelarBusqProdCantidad = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        tbl_listaProdSelectCantidad = new javax.swing.JTable();
        Proveedores = new javax.swing.JTabbedPane();
        Registrar_Proveedores = new javax.swing.JPanel();
        nombreProvReg_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaProveedorReg_tbl = new javax.swing.JTable();
        registrarProv_btn = new javax.swing.JButton();
        serviProvReg_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        telefonoProvReg_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        direcProvReg_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        nitProvReg_txt = new javax.swing.JTextField();
        Modificar_Proveedores = new javax.swing.JPanel();
        selecEditProv_chbx = new javax.swing.JCheckBox();
        nombreProvConsultEdit_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaProveedoresEdit_tbl = new javax.swing.JTable();
        nombreProvEdit_txt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        serviProvEdit_txt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        direcProvEdit_txt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        telefonoProvEdit_txt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        nitProvEdit_txt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        consultProvEdit_btn = new javax.swing.JButton();
        EditProv_btn = new javax.swing.JButton();
        GuardarEditProv_btn = new javax.swing.JButton();
        cancelarEditProv_btn = new javax.swing.JButton();
        cancelarBusqPov_btn = new javax.swing.JButton();
        Consultar_Proveedores = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        nombreProvConsult_txt = new javax.swing.JTextField();
        consultProv_btn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaProvConsult_tbl = new javax.swing.JTable();
        cancelarBusquedaProv_btn = new javax.swing.JButton();
        Eliminar_Proveedores = new javax.swing.JPanel();
        nombreEliminarProv_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        selecEliminarProv_chbx = new javax.swing.JCheckBox();
        EliminarProv_btn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaProvEliminar_tbl = new javax.swing.JTable();
        consultProvEliminar_btn = new javax.swing.JButton();
        cancelarElimProv_btn = new javax.swing.JButton();
        Insumos = new javax.swing.JPanel();
        InsumosCont = new javax.swing.JTabbedPane();
        Registrar = new javax.swing.JPanel();
        Registrar_Insumo = new javax.swing.JPanel();
        txt_nombreInsumoReg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_precioInsumoReg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_listaInsumosReg = new javax.swing.JTable();
        btn_registrarInsumo = new javax.swing.JButton();
        cmbx_proveInsumoReg = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cmbx_unidadInsumoReg = new javax.swing.JComboBox<>();
        Modificar_Insumo = new javax.swing.JPanel();
        btn_GuardarEditInsumo = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbl_listaInsumoEdit = new javax.swing.JTable();
        txt_precioInsumoEdit = new javax.swing.JTextField();
        txt_nombreInsumosEdit = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        chbx_selecEditInsumo = new javax.swing.JCheckBox();
        txt_nombreInsumoConsultEdit = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btn_consultInsumoEdit = new javax.swing.JButton();
        btn_EditInsumo = new javax.swing.JButton();
        btn_EliminarEditInsumo = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        cmbx_proveInsumoEdit = new javax.swing.JComboBox<>();
        btn_cancelBusqInsumoEdit = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        cmbx_unidadInsumoEdit = new javax.swing.JComboBox<>();
        btn_cancelarEditInsumo = new javax.swing.JButton();
        Pre_Compra_Insumo = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbl_listaInsumoVenta = new javax.swing.JTable();
        chbx_selecInsumoConsultVenta = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        txt_nombreInsumoConsultVenta = new javax.swing.JTextField();
        btn_consultInsumoVenta = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        tbl_listaInsumoConsultVentas = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        txt_nombreInsumoVenta = new javax.swing.JTextField();
        txt_cantidadInsumoVenta = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btn_agregarInsumoVenta = new javax.swing.JButton();
        retirarInsumoVenta_btn = new javax.swing.JButton();
        chbx_selecInsumoVenta = new javax.swing.JCheckBox();
        comprarInsumoVenta_btn = new javax.swing.JButton();
        cancelarInsumoVenta_btn = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txt_pagoClientInsumoVenta = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_totalProdInsumoVenta = new javax.swing.JTextField();
        btn_cancelarBusquedaInsumoVenta = new javax.swing.JButton();
        cmbx_unidadInsumoVenta = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        Ventas = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaProdVenta_tbl = new javax.swing.JTable();
        selecProdConsultVenta_chbx = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        nombrePanConsultVenta_txt = new javax.swing.JTextField();
        consultPanVenta_btn = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        listaProdConsultVentas_tbl = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        nombreProdVenta_txt = new javax.swing.JTextField();
        cantidadProdVenta_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agregarProdVenta_btn = new javax.swing.JButton();
        retirarProdVenta_btn = new javax.swing.JButton();
        selecProdVenta_chbx = new javax.swing.JCheckBox();
        comprarVenta_btn = new javax.swing.JButton();
        cancelarVenta_btn = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txt_PagoVenta = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        totalProdVenta = new javax.swing.JTextField();
        cancelarBusquedaPan_btn = new javax.swing.JButton();
        Estadisticas = new javax.swing.JPanel();
        Contenedor_Stast = new javax.swing.JTabbedPane();
        Historial_ventas = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_HistoVenta = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbl_HistoVentasFact = new javax.swing.JTable();
        btn_EliminarVenta = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        chbx_selecHistoVenta = new javax.swing.JCheckBox();
        btn_ConsultHistoVenta = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        btn_cancelarBusquedaHistoVenta = new javax.swing.JButton();
        Date_DesdeHistoVentas = new datechooser.beans.DateChooserCombo();
        Date_HastaHistoVentas = new datechooser.beans.DateChooserCombo();
        jPanel4 = new javax.swing.JPanel();
        Historial_ventas1 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tbl_HistoCompra = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        tbl_HistoComprasFact = new javax.swing.JTable();
        btn_EliminarCompra = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        chbx_selecHistoCompra = new javax.swing.JCheckBox();
        btn_ConsultHistoCompra = new javax.swing.JButton();
        Date_HastaHistoCompra = new datechooser.beans.DateChooserCombo();
        jLabel46 = new javax.swing.JLabel();
        btn_cancelarBusquedaHistoCompra = new javax.swing.JButton();
        Date_DesdeHistoCompra = new datechooser.beans.DateChooserCombo();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        pn_MasVendidosProducto = new javax.swing.JPanel();
        pn_MasGananciaProducto = new javax.swing.JPanel();
        pn_MenosVendidoProducto = new javax.swing.JPanel();
        pn_MenosGananciaProducto = new javax.swing.JPanel();
        Date_ConsultProducto = new datechooser.beans.DateChooserCombo();
        btn_ConsultProducto = new javax.swing.JButton();
        btn_cancelarBusquedaProducto = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        pn_MasVendidosInsumo = new javax.swing.JPanel();
        pn_MasGananciaInsumo = new javax.swing.JPanel();
        pn_MenosVendidoInsumo = new javax.swing.JPanel();
        pn_MenosGananciaInsumo = new javax.swing.JPanel();
        Date_ConsultInsumo = new datechooser.beans.DateChooserCombo();
        btn_ConsultInsumo = new javax.swing.JButton();
        btn_cancelarBusquedaInsumo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mbar_nameUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        Panel_General.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Panel_GeneralStateChanged(evt);
            }
        });

        Productos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProductosStateChanged(evt);
            }
        });

        nombrePanReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanReg_txtKeyPressed(evt);
            }
        });

        jLabel1.setText("Nombre del Tipo de Producto : ");

        precioPanReg_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioPanReg_txtActionPerformed(evt);
            }
        });
        precioPanReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioPanReg_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioPanReg_txtKeyTyped(evt);
            }
        });

        jLabel3.setText("Precio : ");

        listaPanesReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Index", "Nombre", "Precio", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesReg_tbl.setFocusable(false);
        listaPanesReg_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaPanesReg_tbl);
        if (listaPanesReg_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesReg_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaPanesReg_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaPanesReg_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaPanesReg_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesReg_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaPanesReg_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        registrarPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        registrarPan_btn.setText("Registrar");
        registrarPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPan_btnregistrarPan(evt);
            }
        });
        registrarPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registrarPan_btnKeyPressed(evt);
            }
        });

        provePanReg_cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provePanReg_cmbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                provePanReg_cmbxKeyPressed(evt);
            }
        });

        jLabel11.setText("Proveedor:");

        javax.swing.GroupLayout Registrar_ProductoLayout = new javax.swing.GroupLayout(Registrar_Producto);
        Registrar_Producto.setLayout(Registrar_ProductoLayout);
        Registrar_ProductoLayout.setHorizontalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(provePanReg_cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        Registrar_ProductoLayout.setVerticalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provePanReg_cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(registrarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Productos.addTab("Registrar Producto", Registrar_Producto);

        Modificar_Producto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuardarEditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        GuardarEditPan_btn.setText("Guardar");
        GuardarEditPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GuardarEditPan_btn.setEnabled(false);
        GuardarEditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEditPan_btnmodificarPan(evt);
            }
        });
        GuardarEditPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GuardarEditPan_btnKeyPressed(evt);
            }
        });
        Modificar_Producto.add(GuardarEditPan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 80, 149, -1));

        listaPanesEdit_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Precio", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesEdit_tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPanesEdit_tbl.getTableHeader().setReorderingAllowed(false);
        listaPanesEdit_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPanesEdit_tblselecProdModif_tbl(evt);
            }
        });
        listaPanesEdit_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaPanesEdit_tblKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(listaPanesEdit_tbl);
        if (listaPanesEdit_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesEdit_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaPanesEdit_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaPanesEdit_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaPanesEdit_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesEdit_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaPanesEdit_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaPanesEdit_tbl.getColumnModel().getColumn(3).setHeaderValue("Proveedor");
        }

        Modificar_Producto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1061, 390));

        precioPanEdit_txt.setEnabled(false);
        precioPanEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioPanEdit_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioPanEdit_txtKeyTyped(evt);
            }
        });
        Modificar_Producto.add(precioPanEdit_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 44, 118, -1));

        nombrePanEdit_txt.setEnabled(false);
        nombrePanEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanEdit_txtKeyPressed(evt);
            }
        });
        Modificar_Producto.add(nombrePanEdit_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 44, 130, -1));

        jLabel4.setText("Nuevo Nombre :  ");
        Modificar_Producto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 23, -1, -1));

        jLabel5.setText("Nuevo Precio : ");
        Modificar_Producto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 23, -1, -1));

        selecEditPan_chbx.setText("Seleccionado");
        selecEditPan_chbx.setEnabled(false);
        selecEditPan_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecEditPan_chbxActionPerformed(evt);
            }
        });
        Modificar_Producto.add(selecEditPan_chbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 64, -1, -1));

        nombrePanConsultEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanConsultEdit_txtKeyPressed(evt);
            }
        });
        Modificar_Producto.add(nombrePanConsultEdit_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 43, 113, -1));

        jLabel7.setText("Buscar :");
        Modificar_Producto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 45, -1, -1));

        consultPanEdit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanEdit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultPanEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEdit_btnActionPerformed(evt);
            }
        });
        consultPanEdit_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultPanEdit_btnKeyPressed(evt);
            }
        });
        Modificar_Producto.add(consultPanEdit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 35, 78, -1));

        EditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditPan_btn.setText("Modificar");
        EditPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditPan_btn.setEnabled(false);
        EditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPan_btnActionPerformed(evt);
            }
        });
        EditPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EditPan_btnKeyPressed(evt);
            }
        });
        Modificar_Producto.add(EditPan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 35, 149, 76));

        cancelarEditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarEditPan_btn.setText("Cancelar");
        cancelarEditPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarEditPan_btn.setEnabled(false);
        cancelarEditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEditPan_btnmodificarPan(evt);
            }
        });
        cancelarEditPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarEditPan_btnKeyPressed(evt);
            }
        });
        Modificar_Producto.add(cancelarEditPan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 35, 149, -1));

        jLabel42.setText("Nuevo Proveedor:");
        Modificar_Producto.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        provePanEdit_cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provePanEdit_cmbx.setEnabled(false);
        provePanEdit_cmbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                provePanEdit_cmbxKeyPressed(evt);
            }
        });
        Modificar_Producto.add(provePanEdit_cmbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 118, -1));

        cancelarBusqProd_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusqProd_btn.setText("Cancelar Consulta");
        cancelarBusqProd_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarBusqProd_btn.setEnabled(false);
        cancelarBusqProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusqProd_btnActionPerformed(evt);
            }
        });
        cancelarBusqProd_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarBusqProd_btnKeyPressed(evt);
            }
        });
        Modificar_Producto.add(cancelarBusqProd_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 160, -1));

        Productos.addTab("Modificar Producto", Modificar_Producto);

        jLabel8.setText("Buscar :");

        nombrePanConsult_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePanConsult_txtActionPerformed(evt);
            }
        });
        nombrePanConsult_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanConsult_txtKeyPressed(evt);
            }
        });

        consultPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPan_btn.setText("Consultar");
        consultPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPan_btn(evt);
            }
        });
        consultPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultPan_btnKeyPressed(evt);
            }
        });

        listaPanesConsult_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Precio", "Proveerdor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesConsult_tbl.setFocusable(false);
        listaPanesConsult_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(listaPanesConsult_tbl);
        if (listaPanesConsult_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesConsult_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaPanesConsult_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaPanesConsult_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaPanesConsult_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesConsult_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaPanesConsult_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        cancelarBusquedaProd_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusquedaProd_btn.setText("Cancelar Búsqueda");
        cancelarBusquedaProd_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarBusquedaProd_btn.setEnabled(false);
        cancelarBusquedaProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaProd_btnmodificarPan(evt);
            }
        });
        cancelarBusquedaProd_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarBusquedaProd_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Consultar_ProductoLayout = new javax.swing.GroupLayout(Consultar_Producto);
        Consultar_Producto.setLayout(Consultar_ProductoLayout);
        Consultar_ProductoLayout.setHorizontalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBusquedaProd_btn)
                        .addGap(26, 26, 26)
                        .addComponent(consultPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE))
                .addContainerGap())
        );
        Consultar_ProductoLayout.setVerticalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cancelarBusquedaProd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        Productos.addTab("Consultar Producto", Consultar_Producto);

        listaPanesEliminar_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Precio", "Proveerdor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesEliminar_tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPanesEliminar_tbl.getTableHeader().setReorderingAllowed(false);
        listaPanesEliminar_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPanesEliminar_tblselecProdEliminar_tbl(evt);
            }
        });
        listaPanesEliminar_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaPanesEliminar_tblKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(listaPanesEliminar_tbl);
        if (listaPanesEliminar_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesEliminar_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaPanesEliminar_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaPanesEliminar_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaPanesEliminar_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesEliminar_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaPanesEliminar_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        nombrePanEliminar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePanEliminar_txtActionPerformed(evt);
            }
        });
        nombrePanEliminar_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanEliminar_txtKeyPressed(evt);
            }
        });

        jLabel9.setText("Buscar :");

        selecPanEliminar_chbx.setText("Seleccionado");
        selecPanEliminar_chbx.setEnabled(false);
        selecPanEliminar_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecPanEliminar_chbxActionPerformed(evt);
            }
        });

        eliminarPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        eliminarPan_btn.setText("Eliminar");
        eliminarPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminarPan_btn.setEnabled(false);
        eliminarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPan_btnActionPerformed(evt);
            }
        });
        eliminarPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eliminarPan_btnKeyPressed(evt);
            }
        });

        consultPanEliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanEliminar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultPanEliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEliminar_btnActionPerformed(evt);
            }
        });
        consultPanEliminar_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultPanEliminar_btnKeyPressed(evt);
            }
        });

        cancelarElimProd_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarElimProd_btn.setText("Cancelar");
        cancelarElimProd_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarElimProd_btn.setEnabled(false);
        cancelarElimProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarElimProd_btnmodificarPan(evt);
            }
        });
        cancelarElimProd_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarElimProd_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Eliminar_ProductoLayout = new javax.swing.GroupLayout(Eliminar_Producto);
        Eliminar_Producto.setLayout(Eliminar_ProductoLayout);
        Eliminar_ProductoLayout.setHorizontalGroup(
            Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE))
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombrePanEliminar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selecPanEliminar_chbx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultPanEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarElimProd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Eliminar_ProductoLayout.setVerticalGroup(
            Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eliminarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelarElimProd_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultPanEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nombrePanEliminar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecPanEliminar_chbx)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Productos.addTab("Eliminar Producto", Eliminar_Producto);

        btn_GuardarEditCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btn_GuardarEditCantidad.setText("Guardar");
        btn_GuardarEditCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_GuardarEditCantidad.setEnabled(false);
        btn_GuardarEditCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarEditCantidadmodificarPan(evt);
            }
        });
        btn_GuardarEditCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_GuardarEditCantidadKeyPressed(evt);
            }
        });

        tbl_listaProdCantidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaProdCantidad.getTableHeader().setReorderingAllowed(false);
        tbl_listaProdCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaProdCantidadselecProdModif_tbl(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_listaProdCantidadselecProdModif_tbl(evt);
            }
        });
        tbl_listaProdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_listaProdCantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_listaProdCantidadKeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(tbl_listaProdCantidad);
        if (tbl_listaProdCantidad.getColumnModel().getColumnCount() > 0) {
            tbl_listaProdCantidad.getColumnModel().getColumn(0).setMinWidth(80);
            tbl_listaProdCantidad.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_listaProdCantidad.getColumnModel().getColumn(0).setMaxWidth(80);
            tbl_listaProdCantidad.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaProdCantidad.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaProdCantidad.getColumnModel().getColumn(3).setResizable(false);
        }

        txt_CantidadProd.setEnabled(false);
        txt_CantidadProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CantidadProdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadProdKeyTyped(evt);
            }
        });

        jLabel49.setText("Cantidad Nueva:");

        txt_nombreProdConsultCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProdConsultCantidadActionPerformed(evt);
            }
        });
        txt_nombreProdConsultCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreProdConsultCantidadKeyPressed(evt);
            }
        });

        jLabel50.setText("Buscar :");

        btn_consultProdCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_consultProdCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_consultProdCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultProdCantidadActionPerformed(evt);
            }
        });
        btn_consultProdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_consultProdCantidadKeyPressed(evt);
            }
        });

        btn_EditProdCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btn_EditProdCantidad.setText("Modificar");
        btn_EditProdCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_EditProdCantidad.setEnabled(false);
        btn_EditProdCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditProdCantidadActionPerformed(evt);
            }
        });
        btn_EditProdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EditProdCantidadKeyPressed(evt);
            }
        });

        btn_cancelarEditProdCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelarEditProdCantidad.setText("Cancelar");
        btn_cancelarEditProdCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancelarEditProdCantidad.setEnabled(false);
        btn_cancelarEditProdCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarEditProdCantidadmodificarPan(evt);
            }
        });
        btn_cancelarEditProdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelarEditProdCantidadKeyPressed(evt);
            }
        });

        btn_cancelarBusqProdCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelarBusqProdCantidad.setText("Cancelar Consulta");
        btn_cancelarBusqProdCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancelarBusqProdCantidad.setEnabled(false);
        btn_cancelarBusqProdCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarBusqProdCantidadActionPerformed(evt);
            }
        });
        btn_cancelarBusqProdCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelarBusqProdCantidadKeyPressed(evt);
            }
        });

        tbl_listaProdSelectCantidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaProdSelectCantidad.getTableHeader().setReorderingAllowed(false);
        tbl_listaProdSelectCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaProdSelectCantidadselecProdModif_tbl(evt);
            }
        });
        tbl_listaProdSelectCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_listaProdSelectCantidadKeyPressed(evt);
            }
        });
        jScrollPane19.setViewportView(tbl_listaProdSelectCantidad);
        if (tbl_listaProdSelectCantidad.getColumnModel().getColumnCount() > 0) {
            tbl_listaProdSelectCantidad.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_listaProdSelectCantidad.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_listaProdSelectCantidad.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_listaProdSelectCantidad.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaProdSelectCantidad.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaProdSelectCantidad.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout CantidadesLayout = new javax.swing.GroupLayout(Cantidades);
        Cantidades.setLayout(CantidadesLayout);
        CantidadesLayout.setHorizontalGroup(
            CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CantidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CantidadesLayout.createSequentialGroup()
                        .addComponent(btn_EditProdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cancelarEditProdCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_GuardarEditCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CantidadesLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btn_consultProdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CantidadesLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btn_cancelarBusqProdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CantidadesLayout.createSequentialGroup()
                        .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CantidadesLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(26, 26, 26)
                                .addComponent(txt_CantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombreProdConsultCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        CantidadesLayout.setVerticalGroup(
            CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CantidadesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CantidadesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CantidadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(txt_nombreProdConsultCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CantidadesLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_EditProdCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CantidadesLayout.createSequentialGroup()
                                .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CantidadesLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btn_cancelarEditProdCantidad))
                                    .addGroup(CantidadesLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_consultProdCantidad)))
                                .addGap(18, 18, 18)
                                .addGroup(CantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_GuardarEditCantidad)
                                    .addComponent(btn_cancelarBusqProdCantidad))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Productos.addTab("Cantidades", Cantidades);

        Panel_General.addTab("Productos", Productos);

        Proveedores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProveedoresStateChanged(evt);
            }
        });

        nombreProvReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreProvReg_txtKeyPressed(evt);
            }
        });

        jLabel10.setText("Nombre del Proveedor : ");

        listaProveedorReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProveedorReg_tbl.setFocusable(false);
        listaProveedorReg_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(listaProveedorReg_tbl);
        if (listaProveedorReg_tbl.getColumnModel().getColumnCount() > 0) {
            listaProveedorReg_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaProveedorReg_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaProveedorReg_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaProveedorReg_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(4).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(5).setResizable(false);
        }

        registrarProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        registrarProv_btn.setText("Registrar");
        registrarProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProv_btnregistrarPan(evt);
            }
        });
        registrarProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registrarProv_btnKeyPressed(evt);
            }
        });

        serviProvReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serviProvReg_txtKeyPressed(evt);
            }
        });

        jLabel19.setText("Producto/Servicio :");

        telefonoProvReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoProvReg_txtKeyPressed(evt);
            }
        });

        jLabel20.setText("Telefono :");

        jLabel21.setText("Direccion :");

        direcProvReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direcProvReg_txtKeyPressed(evt);
            }
        });

        jLabel22.setText("NIT :");

        nitProvReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nitProvReg_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitProvReg_txtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Registrar_ProveedoresLayout = new javax.swing.GroupLayout(Registrar_Proveedores);
        Registrar_Proveedores.setLayout(Registrar_ProveedoresLayout);
        Registrar_ProveedoresLayout.setHorizontalGroup(
            Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Registrar_ProveedoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())
                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreProvReg_txt)
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel19))))
                            .addComponent(serviProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(direcProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel20)))
                                .addGap(75, 75, 75)
                                .addComponent(jLabel22))
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel21))
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(telefonoProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nitProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                        .addComponent(registrarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        Registrar_ProveedoresLayout.setVerticalGroup(
            Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProveedoresLayout.createSequentialGroup()
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Registrar_ProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nitProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonoProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direcProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        Proveedores.addTab("Registrar Prooverdor", Registrar_Proveedores);

        selecEditProv_chbx.setText("Seleccionado");
        selecEditProv_chbx.setEnabled(false);
        selecEditProv_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecEditProv_chbxActionPerformed(evt);
            }
        });

        nombreProvConsultEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreProvConsultEdit_txtKeyPressed(evt);
            }
        });

        jLabel16.setText("Buscar :");

        listaProveedoresEdit_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProveedoresEdit_tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProveedoresEdit_tbl.getTableHeader().setReorderingAllowed(false);
        listaProveedoresEdit_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProveedoresEdit_tblMouseClicked(evt);
            }
        });
        listaProveedoresEdit_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaProveedoresEdit_tblKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(listaProveedoresEdit_tbl);
        if (listaProveedoresEdit_tbl.getColumnModel().getColumnCount() > 0) {
            listaProveedoresEdit_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(4).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(5).setResizable(false);
        }

        nombreProvEdit_txt.setEnabled(false);
        nombreProvEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreProvEdit_txtKeyPressed(evt);
            }
        });

        jLabel23.setText("Nombre del Proveedor : ");

        serviProvEdit_txt.setEnabled(false);
        serviProvEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serviProvEdit_txtKeyPressed(evt);
            }
        });

        jLabel24.setText("Producto/Servicio :");

        direcProvEdit_txt.setEnabled(false);
        direcProvEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direcProvEdit_txtKeyPressed(evt);
            }
        });

        jLabel25.setText("Direccion :");

        telefonoProvEdit_txt.setEnabled(false);
        telefonoProvEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoProvEdit_txtKeyPressed(evt);
            }
        });

        jLabel26.setText("Telefono :");

        nitProvEdit_txt.setEnabled(false);
        nitProvEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nitProvEdit_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitProvEdit_txtKeyTyped(evt);
            }
        });

        jLabel27.setText("NIT :");

        consultProvEdit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProvEdit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultProvEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvEdit_btnActionPerformed(evt);
            }
        });
        consultProvEdit_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultProvEdit_btnKeyPressed(evt);
            }
        });

        EditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditProv_btn.setText("Modificar");
        EditProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditProv_btn.setEnabled(false);
        EditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProv_btnActionPerformed(evt);
            }
        });
        EditProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EditProv_btnKeyPressed(evt);
            }
        });

        GuardarEditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        GuardarEditProv_btn.setText("Guardar");
        GuardarEditProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GuardarEditProv_btn.setEnabled(false);
        GuardarEditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEditProv_btnmodificarPan(evt);
            }
        });
        GuardarEditProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GuardarEditProv_btnKeyPressed(evt);
            }
        });

        cancelarEditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarEditProv_btn.setText("Cancelar");
        cancelarEditProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarEditProv_btn.setEnabled(false);
        cancelarEditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEditProv_btnmodificarPan(evt);
            }
        });
        cancelarEditProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarEditProv_btnKeyPressed(evt);
            }
        });

        cancelarBusqPov_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusqPov_btn.setText("Cancelar Consulta");
        cancelarBusqPov_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarBusqPov_btn.setEnabled(false);
        cancelarBusqPov_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusqPov_btnActionPerformed(evt);
            }
        });
        cancelarBusqPov_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarBusqPov_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Modificar_ProveedoresLayout = new javax.swing.GroupLayout(Modificar_Proveedores);
        Modificar_Proveedores.setLayout(Modificar_ProveedoresLayout);
        Modificar_ProveedoresLayout.setHorizontalGroup(
            Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(45, 45, 45))
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addComponent(serviProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(direcProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(14, 14, 14))
                                    .addComponent(nombreProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel26))
                                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(telefonoProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel27))
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nitProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(EditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addComponent(GuardarEditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreProvConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(selecEditProv_chbx))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultProvEdit_btn))
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addComponent(cancelarEditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarBusqPov_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        Modificar_ProveedoresLayout.setVerticalGroup(
            Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                    .addComponent(GuardarEditProv_btn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelarEditProv_btn))
                                .addComponent(EditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addGap(41, 41, 41)
                                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel24))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(serviProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(direcProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(telefonoProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nitProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreProvConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecEditProv_chbx, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(consultProvEdit_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarBusqPov_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Proveedores.addTab("Modificar Prooverdor", Modificar_Proveedores);

        jLabel17.setText("Buscar :");

        nombreProvConsult_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProvConsult_txtActionPerformed(evt);
            }
        });
        nombreProvConsult_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreProvConsult_txtKeyPressed(evt);
            }
        });

        consultProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProv_btn.setText("Consultar");
        consultProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProv_btnActionPerformed(evt);
            }
        });
        consultProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultProv_btnKeyPressed(evt);
            }
        });

        listaProvConsult_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProvConsult_tbl.setFocusable(false);
        listaProvConsult_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(listaProvConsult_tbl);
        if (listaProvConsult_tbl.getColumnModel().getColumnCount() > 0) {
            listaProvConsult_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaProvConsult_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaProvConsult_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaProvConsult_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(4).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(5).setResizable(false);
        }

        cancelarBusquedaProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusquedaProv_btn.setText("Cancelar Búsqueda");
        cancelarBusquedaProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarBusquedaProv_btn.setEnabled(false);
        cancelarBusquedaProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaProv_btnmodificarPan(evt);
            }
        });
        cancelarBusquedaProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarBusquedaProv_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Consultar_ProveedoresLayout = new javax.swing.GroupLayout(Consultar_Proveedores);
        Consultar_Proveedores.setLayout(Consultar_ProveedoresLayout);
        Consultar_ProveedoresLayout.setHorizontalGroup(
            Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBusquedaProv_btn)
                        .addGap(26, 26, 26)
                        .addComponent(consultProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE))
                .addContainerGap())
        );
        Consultar_ProveedoresLayout.setVerticalGroup(
            Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultProv_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cancelarBusquedaProv_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Consultar Prooverdor", Consultar_Proveedores);

        nombreEliminarProv_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreEliminarProv_txtKeyPressed(evt);
            }
        });

        jLabel18.setText("Buscar :");

        selecEliminarProv_chbx.setText("Seleccionado");
        selecEliminarProv_chbx.setEnabled(false);
        selecEliminarProv_chbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecEliminarProv_chbxActionPerformed(evt);
            }
        });

        EliminarProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        EliminarProv_btn.setText("Eliminar");
        EliminarProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EliminarProv_btn.setEnabled(false);
        EliminarProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProv_btnActionPerformed(evt);
            }
        });
        EliminarProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EliminarProv_btnKeyPressed(evt);
            }
        });

        listaProvEliminar_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProvEliminar_tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProvEliminar_tbl.getTableHeader().setReorderingAllowed(false);
        listaProvEliminar_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProvEliminar_tblMouseClicked(evt);
            }
        });
        listaProvEliminar_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaProvEliminar_tblKeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(listaProvEliminar_tbl);
        if (listaProvEliminar_tbl.getColumnModel().getColumnCount() > 0) {
            listaProvEliminar_tbl.getColumnModel().getColumn(0).setMinWidth(80);
            listaProvEliminar_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaProvEliminar_tbl.getColumnModel().getColumn(0).setMaxWidth(80);
            listaProvEliminar_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        consultProvEliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProvEliminar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultProvEliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvEliminar_btnActionPerformed(evt);
            }
        });
        consultProvEliminar_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultProvEliminar_btnKeyPressed(evt);
            }
        });

        cancelarElimProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarElimProv_btn.setText("Cancelar");
        cancelarElimProv_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarElimProv_btn.setEnabled(false);
        cancelarElimProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarElimProv_btnmodificarPan(evt);
            }
        });
        cancelarElimProv_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarElimProv_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Eliminar_ProveedoresLayout = new javax.swing.GroupLayout(Eliminar_Proveedores);
        Eliminar_Proveedores.setLayout(Eliminar_ProveedoresLayout);
        Eliminar_ProveedoresLayout.setHorizontalGroup(
            Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                        .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(selecEliminarProv_chbx))
                            .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreEliminarProv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultProvEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarElimProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE))
                .addContainerGap())
        );
        Eliminar_ProveedoresLayout.setVerticalGroup(
            Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                            .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EliminarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelarElimProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProveedoresLayout.createSequentialGroup()
                            .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombreEliminarProv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(selecEliminarProv_chbx)
                            .addGap(11, 11, 11)))
                    .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                        .addComponent(consultProvEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Eliminar Prooverdor", Eliminar_Proveedores);

        Panel_General.addTab("Proveedores", null, Proveedores, "");

        InsumosCont.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                InsumosContStateChanged(evt);
            }
        });

        txt_nombreInsumoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumoRegKeyPressed(evt);
            }
        });

        jLabel2.setText("Nombre del Tipo de Producto : ");

        txt_precioInsumoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioInsumoRegActionPerformed(evt);
            }
        });
        txt_precioInsumoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioInsumoRegKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioInsumoRegKeyTyped(evt);
            }
        });

        jLabel6.setText("Precio por Unidad: ");

        tbl_listaInsumosReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Precio por Unidad", "Proveedor", "Unidad de Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaInsumosReg.setFocusable(false);
        tbl_listaInsumosReg.getTableHeader().setReorderingAllowed(false);
        tbl_listaInsumosReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaInsumosRegMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_listaInsumosReg);
        if (tbl_listaInsumosReg.getColumnModel().getColumnCount() > 0) {
            tbl_listaInsumosReg.getColumnModel().getColumn(0).setMinWidth(80);
            tbl_listaInsumosReg.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_listaInsumosReg.getColumnModel().getColumn(0).setMaxWidth(80);
            tbl_listaInsumosReg.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaInsumosReg.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaInsumosReg.getColumnModel().getColumn(3).setResizable(false);
            tbl_listaInsumosReg.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_registrarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btn_registrarInsumo.setText("Registrar");
        btn_registrarInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarInsumoregistrarPan(evt);
            }
        });
        btn_registrarInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_registrarInsumoKeyPressed(evt);
            }
        });

        cmbx_proveInsumoReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_proveInsumoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbx_proveInsumoRegKeyPressed(evt);
            }
        });

        jLabel15.setText("Proveedor:");

        jLabel28.setText("Unidad de Medida:");

        cmbx_unidadInsumoReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNIDAD", "DOCENA", "GRAMOS", "KILOGRAGRAMOS", "MILÍGRAMOS", "LITRO", "KILOLITRO", "MILÍLITRO" }));
        cmbx_unidadInsumoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbx_unidadInsumoRegKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Registrar_InsumoLayout = new javax.swing.GroupLayout(Registrar_Insumo);
        Registrar_Insumo.setLayout(Registrar_InsumoLayout);
        Registrar_InsumoLayout.setHorizontalGroup(
            Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombreInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_precioInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(110, 110, 110)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_proveInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_unidadInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_InsumoLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(21, 21, 21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(btn_registrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        Registrar_InsumoLayout.setVerticalGroup(
            Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbx_unidadInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombreInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precioInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbx_proveInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_registrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout RegistrarLayout = new javax.swing.GroupLayout(Registrar);
        Registrar.setLayout(RegistrarLayout);
        RegistrarLayout.setHorizontalGroup(
            RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
            .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistrarLayout.createSequentialGroup()
                    .addComponent(Registrar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        RegistrarLayout.setVerticalGroup(
            RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
            .addGroup(RegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistrarLayout.createSequentialGroup()
                    .addComponent(Registrar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        InsumosCont.addTab("Registrar", Registrar);

        Modificar_Insumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_GuardarEditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btn_GuardarEditInsumo.setText("Guardar");
        btn_GuardarEditInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_GuardarEditInsumo.setEnabled(false);
        btn_GuardarEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarEditInsumomodificarPan(evt);
            }
        });
        btn_GuardarEditInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_GuardarEditInsumoKeyPressed(evt);
            }
        });

        tbl_listaInsumoEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Nombre", "Precio por Unidad", "Proveedor", "Unidad de Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaInsumoEdit.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_listaInsumoEdit.getTableHeader().setReorderingAllowed(false);
        tbl_listaInsumoEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaInsumoEditselecProdModif_tbl(evt);
            }
        });
        tbl_listaInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_listaInsumoEditKeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(tbl_listaInsumoEdit);
        if (tbl_listaInsumoEdit.getColumnModel().getColumnCount() > 0) {
            tbl_listaInsumoEdit.getColumnModel().getColumn(0).setMinWidth(80);
            tbl_listaInsumoEdit.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_listaInsumoEdit.getColumnModel().getColumn(0).setMaxWidth(80);
            tbl_listaInsumoEdit.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaInsumoEdit.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaInsumoEdit.getColumnModel().getColumn(3).setResizable(false);
            tbl_listaInsumoEdit.getColumnModel().getColumn(4).setResizable(false);
        }

        txt_precioInsumoEdit.setEnabled(false);
        txt_precioInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioInsumoEditKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioInsumoEditKeyTyped(evt);
            }
        });

        txt_nombreInsumosEdit.setEnabled(false);
        txt_nombreInsumosEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumosEditKeyPressed(evt);
            }
        });

        jLabel32.setText("Nuevo Nombre :  ");

        jLabel33.setText("Nuevo Precio por Unidad : ");

        chbx_selecEditInsumo.setText("Seleccionado");
        chbx_selecEditInsumo.setEnabled(false);
        chbx_selecEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbx_selecEditInsumoActionPerformed(evt);
            }
        });

        txt_nombreInsumoConsultEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumoConsultEditKeyPressed(evt);
            }
        });

        jLabel34.setText("Buscar :");

        btn_consultInsumoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_consultInsumoEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_consultInsumoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultInsumoEditActionPerformed(evt);
            }
        });
        btn_consultInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_consultInsumoEditKeyPressed(evt);
            }
        });

        btn_EditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btn_EditInsumo.setText("Modificar");
        btn_EditInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_EditInsumo.setEnabled(false);
        btn_EditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditInsumoActionPerformed(evt);
            }
        });
        btn_EditInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EditInsumoKeyPressed(evt);
            }
        });

        btn_EliminarEditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        btn_EliminarEditInsumo.setText("Eliminar");
        btn_EliminarEditInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_EliminarEditInsumo.setEnabled(false);
        btn_EliminarEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarEditInsumomodificarPan(evt);
            }
        });
        btn_EliminarEditInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_EliminarEditInsumoKeyPressed(evt);
            }
        });

        jLabel43.setText("Nuevo Proveedor:");

        cmbx_proveInsumoEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_proveInsumoEdit.setEnabled(false);
        cmbx_proveInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbx_proveInsumoEditKeyPressed(evt);
            }
        });

        btn_cancelBusqInsumoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelBusqInsumoEdit.setText("Cancelar Consulta");
        btn_cancelBusqInsumoEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancelBusqInsumoEdit.setEnabled(false);
        btn_cancelBusqInsumoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelBusqInsumoEditActionPerformed(evt);
            }
        });
        btn_cancelBusqInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelBusqInsumoEditKeyPressed(evt);
            }
        });

        jLabel35.setText("Unidad de Medida:");

        cmbx_unidadInsumoEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNIDAD", "DOCENA", "GRAMOS", "KILOGRAGRAMOS", "MILÍGRAMOS", "LITRO", "KILOLITRO", "MILÍLITRO" }));
        cmbx_unidadInsumoEdit.setEnabled(false);
        cmbx_unidadInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbx_unidadInsumoEditKeyPressed(evt);
            }
        });

        btn_cancelarEditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelarEditInsumo.setText("Cancelar");
        btn_cancelarEditInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancelarEditInsumo.setEnabled(false);
        btn_cancelarEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarEditInsumomodificarPan(evt);
            }
        });
        btn_cancelarEditInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelarEditInsumoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Modificar_InsumoLayout = new javax.swing.GroupLayout(Modificar_Insumo);
        Modificar_Insumo.setLayout(Modificar_InsumoLayout);
        Modificar_InsumoLayout.setHorizontalGroup(
            Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreInsumosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbx_proveInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel43))))
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel35))
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmbx_unidadInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_precioInsumoEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(66, 66, 66)
                        .addComponent(btn_EditInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancelarEditInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_GuardarEditInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_EliminarEditInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btn_cancelBusqInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chbx_selecEditInsumo)
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombreInsumoConsultEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_consultInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane14)))
                .addContainerGap())
        );
        Modificar_InsumoLayout.setVerticalGroup(
            Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                        .addComponent(btn_cancelarEditInsumo)
                        .addGap(7, 7, 7)
                        .addComponent(btn_GuardarEditInsumo)
                        .addGap(7, 7, 7)
                        .addComponent(btn_EliminarEditInsumo))
                    .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_EditInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addComponent(btn_consultInsumoEdit)
                                .addGap(17, 17, 17)
                                .addComponent(btn_cancelBusqInsumoEdit))
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(txt_nombreInsumoConsultEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(chbx_selecEditInsumo))))
                    .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(txt_precioInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(6, 6, 6)
                                .addComponent(txt_nombreInsumosEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(Modificar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_InsumoLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(6, 6, 6)
                                .addComponent(cmbx_proveInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_InsumoLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(6, 6, 6)
                                .addComponent(cmbx_unidadInsumoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InsumosCont.addTab("Modificar", Modificar_Insumo);

        tbl_listaInsumoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Insumo", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaInsumoVenta.getTableHeader().setReorderingAllowed(false);
        tbl_listaInsumoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaInsumoVentaMouseClicked(evt);
            }
        });
        tbl_listaInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_listaInsumoVentaKeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(tbl_listaInsumoVenta);
        if (tbl_listaInsumoVenta.getColumnModel().getColumnCount() > 0) {
            tbl_listaInsumoVenta.getColumnModel().getColumn(0).setMinWidth(55);
            tbl_listaInsumoVenta.getColumnModel().getColumn(0).setPreferredWidth(55);
            tbl_listaInsumoVenta.getColumnModel().getColumn(0).setMaxWidth(55);
            tbl_listaInsumoVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaInsumoVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaInsumoVenta.getColumnModel().getColumn(3).setResizable(false);
        }

        chbx_selecInsumoConsultVenta.setText("Seleccionado");
        chbx_selecInsumoConsultVenta.setEnabled(false);

        jLabel36.setText("Buscar :");

        txt_nombreInsumoConsultVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreInsumoConsultVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreInsumoConsultVentaActionPerformed(evt);
            }
        });
        txt_nombreInsumoConsultVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumoConsultVentaKeyPressed(evt);
            }
        });

        btn_consultInsumoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_consultInsumoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_consultInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultInsumoVentaActionPerformed(evt);
            }
        });
        btn_consultInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_consultInsumoVentaKeyPressed(evt);
            }
        });

        tbl_listaInsumoConsultVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Insumo", "Precio por Unidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_listaInsumoConsultVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_listaInsumoConsultVentas.getTableHeader().setReorderingAllowed(false);
        tbl_listaInsumoConsultVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaInsumoConsultVentasMouseClicked(evt);
            }
        });
        tbl_listaInsumoConsultVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_listaInsumoConsultVentasKeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(tbl_listaInsumoConsultVentas);
        if (tbl_listaInsumoConsultVentas.getColumnModel().getColumnCount() > 0) {
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel37.setText("Insumo:");

        txt_nombreInsumoVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreInsumoVenta.setEnabled(false);
        txt_nombreInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreInsumoVentaActionPerformed(evt);
            }
        });

        txt_cantidadInsumoVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cantidadInsumoVenta.setEnabled(false);
        txt_cantidadInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantidadInsumoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadInsumoVentaKeyTyped(evt);
            }
        });

        jLabel38.setText("Cantidad :");

        btn_agregarInsumoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png"))); // NOI18N
        btn_agregarInsumoVenta.setText("Agregar");
        btn_agregarInsumoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_agregarInsumoVenta.setEnabled(false);
        btn_agregarInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarInsumoVentaActionPerformed(evt);
            }
        });
        btn_agregarInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_agregarInsumoVentaKeyPressed(evt);
            }
        });

        retirarInsumoVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        retirarInsumoVenta_btn.setText("Retirar");
        retirarInsumoVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        retirarInsumoVenta_btn.setEnabled(false);
        retirarInsumoVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarInsumoVenta_btnActionPerformed(evt);
            }
        });
        retirarInsumoVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                retirarInsumoVenta_btnKeyPressed(evt);
            }
        });

        chbx_selecInsumoVenta.setText("Seleccionado");
        chbx_selecInsumoVenta.setEnabled(false);

        comprarInsumoVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png"))); // NOI18N
        comprarInsumoVenta_btn.setText("Presupuestar");
        comprarInsumoVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comprarInsumoVenta_btn.setEnabled(false);
        comprarInsumoVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarInsumoVenta_btnActionPerformed(evt);
            }
        });
        comprarInsumoVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comprarInsumoVenta_btnKeyPressed(evt);
            }
        });

        cancelarInsumoVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarInsumoVenta_btn.setText("Cancelar Pre-Compra");
        cancelarInsumoVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarInsumoVenta_btn.setEnabled(false);
        cancelarInsumoVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInsumoVenta_btnActionPerformed(evt);
            }
        });
        cancelarInsumoVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarInsumoVenta_btnKeyPressed(evt);
            }
        });

        txt_pagoClientInsumoVenta.setEnabled(false);
        txt_pagoClientInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pagoClientInsumoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pagoClientInsumoVentaKeyTyped(evt);
            }
        });

        jLabel40.setText("Dinero Recibido :");

        txt_totalProdInsumoVenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_totalProdInsumoVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_totalProdInsumoVenta.setText("Total de la venta: 0.0");
        txt_totalProdInsumoVenta.setEnabled(false);
        txt_totalProdInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalProdInsumoVentaActionPerformed(evt);
            }
        });

        btn_cancelarBusquedaInsumoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelarBusquedaInsumoVenta.setText("Cancelar Búsqueda");
        btn_cancelarBusquedaInsumoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancelarBusquedaInsumoVenta.setEnabled(false);
        btn_cancelarBusquedaInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarBusquedaInsumoVentamodificarPan(evt);
            }
        });
        btn_cancelarBusquedaInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelarBusquedaInsumoVentaKeyPressed(evt);
            }
        });

        cmbx_unidadInsumoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNIDAD", "DOCENA", "GRAMOS", "KILOGRAGRAMOS", "MILÍGRAMOS", "LITRO", "KILOLITRO", "MILÍLITRO" }));
        cmbx_unidadInsumoVenta.setEnabled(false);

        jLabel41.setText("Medida:");

        javax.swing.GroupLayout Pre_Compra_InsumoLayout = new javax.swing.GroupLayout(Pre_Compra_Insumo);
        Pre_Compra_Insumo.setLayout(Pre_Compra_InsumoLayout);
        Pre_Compra_InsumoLayout.setHorizontalGroup(
            Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(88, 88, 88))
            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addComponent(chbx_selecInsumoConsultVenta)
                                .addGap(32, 32, 32)
                                .addComponent(btn_cancelarBusquedaInsumoVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_consultInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombreInsumoConsultVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel38))
                            .addComponent(txt_cantidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombreInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel37)))
                                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel41))
                                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbx_unidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(chbx_selecInsumoVenta)))))
                        .addGap(70, 70, 70)
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retirarInsumoVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregarInsumoVenta)))
                    .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                            .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comprarInsumoVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelarInsumoVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pre_Compra_InsumoLayout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_pagoClientInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_totalProdInsumoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pre_Compra_InsumoLayout.setVerticalGroup(
            Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pre_Compra_InsumoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pre_Compra_InsumoLayout.createSequentialGroup()
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_nombreInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(25, 25, 25))
                                    .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addGap(5, 5, 5)
                                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbx_unidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chbx_selecInsumoVenta))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cantidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addComponent(btn_agregarInsumoVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(retirarInsumoVenta_btn)
                                .addGap(5, 5, 5)))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_pagoClientInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_totalProdInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pre_Compra_InsumoLayout.createSequentialGroup()
                                .addComponent(comprarInsumoVenta_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarInsumoVenta_btn))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pre_Compra_InsumoLayout.createSequentialGroup()
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombreInsumoConsultVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pre_Compra_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_consultInsumoVenta)
                            .addComponent(chbx_selecInsumoConsultVenta)
                            .addComponent(btn_cancelarBusquedaInsumoVenta))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(jLabel39)
                .addContainerGap())
        );

        InsumosCont.addTab("Pre-Compra", Pre_Compra_Insumo);

        javax.swing.GroupLayout InsumosLayout = new javax.swing.GroupLayout(Insumos);
        Insumos.setLayout(InsumosLayout);
        InsumosLayout.setHorizontalGroup(
            InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsumosLayout.createSequentialGroup()
                .addComponent(InsumosCont)
                .addContainerGap())
        );
        InsumosLayout.setVerticalGroup(
            InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsumosLayout.createSequentialGroup()
                .addComponent(InsumosCont, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        Panel_General.addTab("Insumos", Insumos);

        listaProdVenta_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Producto", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProdVenta_tbl.getTableHeader().setReorderingAllowed(false);
        listaProdVenta_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdVenta_tblMouseClicked(evt);
            }
        });
        listaProdVenta_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaProdVenta_tblKeyPressed(evt);
            }
        });
        jScrollPane10.setViewportView(listaProdVenta_tbl);
        if (listaProdVenta_tbl.getColumnModel().getColumnCount() > 0) {
            listaProdVenta_tbl.getColumnModel().getColumn(0).setMinWidth(55);
            listaProdVenta_tbl.getColumnModel().getColumn(0).setPreferredWidth(55);
            listaProdVenta_tbl.getColumnModel().getColumn(0).setMaxWidth(55);
            listaProdVenta_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProdVenta_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProdVenta_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        selecProdConsultVenta_chbx.setText("Seleccionado");
        selecProdConsultVenta_chbx.setEnabled(false);

        jLabel12.setText("Buscar :");

        nombrePanConsultVenta_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombrePanConsultVenta_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePanConsultVenta_txtActionPerformed(evt);
            }
        });
        nombrePanConsultVenta_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanConsultVenta_txtKeyPressed(evt);
            }
        });

        consultPanVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultPanVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanVenta_btnActionPerformed(evt);
            }
        });
        consultPanVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultPanVenta_btnKeyPressed(evt);
            }
        });

        listaProdConsultVentas_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Producto", "Cant. Disp.", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProdConsultVentas_tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProdConsultVentas_tbl.getTableHeader().setReorderingAllowed(false);
        listaProdConsultVentas_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdConsultVentas_tblMouseClicked(evt);
            }
        });
        listaProdConsultVentas_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaProdConsultVentas_tblKeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(listaProdConsultVentas_tbl);
        if (listaProdConsultVentas_tbl.getColumnModel().getColumnCount() > 0) {
            listaProdConsultVentas_tbl.getColumnModel().getColumn(0).setMinWidth(50);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(0).setPreferredWidth(50);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(0).setMaxWidth(50);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel13.setText("Producto :");

        nombreProdVenta_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreProdVenta_txt.setEnabled(false);
        nombreProdVenta_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProdVenta_txtActionPerformed(evt);
            }
        });

        cantidadProdVenta_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadProdVenta_txt.setEnabled(false);
        cantidadProdVenta_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadProdVenta_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadProdVenta_txtKeyTyped(evt);
            }
        });

        jLabel14.setText("Cantidad :");

        agregarProdVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png"))); // NOI18N
        agregarProdVenta_btn.setText("Agregar");
        agregarProdVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregarProdVenta_btn.setEnabled(false);
        agregarProdVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdVenta_btnActionPerformed(evt);
            }
        });
        agregarProdVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agregarProdVenta_btnKeyPressed(evt);
            }
        });

        retirarProdVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        retirarProdVenta_btn.setText("Retirar");
        retirarProdVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        retirarProdVenta_btn.setEnabled(false);
        retirarProdVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarProdVenta_btnActionPerformed(evt);
            }
        });
        retirarProdVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                retirarProdVenta_btnKeyPressed(evt);
            }
        });

        selecProdVenta_chbx.setText("Seleccionado");
        selecProdVenta_chbx.setEnabled(false);

        comprarVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png"))); // NOI18N
        comprarVenta_btn.setText("Comprar");
        comprarVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comprarVenta_btn.setEnabled(false);
        comprarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarVenta_btnActionPerformed(evt);
            }
        });
        comprarVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comprarVenta_btnKeyPressed(evt);
            }
        });

        cancelarVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarVenta_btn.setText("Cancelar Compra");
        cancelarVenta_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarVenta_btn.setEnabled(false);
        cancelarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVenta_btnActionPerformed(evt);
            }
        });
        cancelarVenta_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarVenta_btnKeyPressed(evt);
            }
        });

        txt_PagoVenta.setEnabled(false);
        txt_PagoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PagoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PagoVentaKeyTyped(evt);
            }
        });

        jLabel30.setText("Dinero Recibido :");

        totalProdVenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        totalProdVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalProdVenta.setText("Total de la venta: 0.0");
        totalProdVenta.setEnabled(false);
        totalProdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalProdVentaActionPerformed(evt);
            }
        });

        cancelarBusquedaPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusquedaPan_btn.setText("Cancelar Búsqueda");
        cancelarBusquedaPan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarBusquedaPan_btn.setEnabled(false);
        cancelarBusquedaPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaPan_btnmodificarPan(evt);
            }
        });
        cancelarBusquedaPan_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarBusquedaPan_btnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(selecProdConsultVenta_chbx)
                                .addGap(32, 32, 32)
                                .addComponent(cancelarBusquedaPan_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultPanVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(nombrePanConsultVenta_txt))))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comprarVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelarVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(totalProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_PagoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))))
                        .addGap(2, 2, 2))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel14))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel13))
                            .addComponent(nombreProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarProdVenta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(retirarProdVenta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jLabel29))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(selecProdVenta_chbx)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePanConsultVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultPanVenta_btn)
                            .addComponent(selecProdConsultVenta_chbx)
                            .addComponent(cancelarBusquedaPan_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel29))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(4, 4, 4)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(retirarProdVenta_btn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidadProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(selecProdVenta_chbx)
                                        .addComponent(agregarProdVenta_btn)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(comprarVenta_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarVenta_btn))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_PagoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Panel_General.addTab("Ventas", Ventas);

        Contenedor_Stast.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Contenedor_StastStateChanged(evt);
            }
        });

        tbl_HistoVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Fecha", "N# de Productos", "Total Pagado", "Dinero Entregado", "Dinero Devuelto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_HistoVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_HistoVenta.getTableHeader().setReorderingAllowed(false);
        tbl_HistoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_HistoVentaMouseClicked(evt);
            }
        });
        tbl_HistoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_HistoVentaKeyPressed(evt);
            }
        });
        jScrollPane12.setViewportView(tbl_HistoVenta);
        if (tbl_HistoVenta.getColumnModel().getColumnCount() > 0) {
            tbl_HistoVenta.getColumnModel().getColumn(0).setMinWidth(80);
            tbl_HistoVenta.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_HistoVenta.getColumnModel().getColumn(0).setMaxWidth(80);
            tbl_HistoVenta.getColumnModel().getColumn(1).setResizable(false);
            tbl_HistoVenta.getColumnModel().getColumn(2).setResizable(false);
            tbl_HistoVenta.getColumnModel().getColumn(3).setResizable(false);
            tbl_HistoVenta.getColumnModel().getColumn(4).setResizable(false);
            tbl_HistoVenta.getColumnModel().getColumn(5).setResizable(false);
        }

        tbl_HistoVentasFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_HistoVentasFact.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tbl_HistoVentasFact);

        btn_EliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        btn_EliminarVenta.setText("Eliminar Venta");
        btn_EliminarVenta.setEnabled(false);
        btn_EliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarVentaActionPerformed(evt);
            }
        });

        jLabel31.setText("Desde:");

        chbx_selecHistoVenta.setText("Seleccionado");
        chbx_selecHistoVenta.setEnabled(false);

        btn_ConsultHistoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_ConsultHistoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultHistoVentaActionPerformed(evt);
            }
        });

        jLabel44.setText("Hasta:");

        btn_cancelarBusquedaHistoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelarBusquedaHistoVenta.setText("Cancelar Búsqueda");
        btn_cancelarBusquedaHistoVenta.setEnabled(false);
        btn_cancelarBusquedaHistoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarBusquedaHistoVentamodificarPan(evt);
            }
        });
        btn_cancelarBusquedaHistoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelarBusquedaHistoVentaKeyPressed(evt);
            }
        });

        Date_DesdeHistoVentas.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    Date_DesdeHistoVentas.setAutoScroll(false);

    Date_HastaHistoVentas.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
Date_HastaHistoVentas.setAutoScroll(false);

javax.swing.GroupLayout Historial_ventasLayout = new javax.swing.GroupLayout(Historial_ventas);
Historial_ventas.setLayout(Historial_ventasLayout);
Historial_ventasLayout.setHorizontalGroup(
    Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(Historial_ventasLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Historial_ventasLayout.createSequentialGroup()
                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_EliminarVenta))
                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel31))
                                    .addComponent(Date_DesdeHistoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel44))
                                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(Date_HastaHistoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(btn_ConsultHistoVenta))
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addComponent(chbx_selecHistoVenta)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelarBusquedaHistoVenta)))))
                .addGap(20, 20, 20)))
        .addContainerGap())
    );
    Historial_ventasLayout.setVerticalGroup(
        Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(Historial_ventasLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Historial_ventasLayout.createSequentialGroup()
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(Historial_ventasLayout.createSequentialGroup()
                    .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Historial_ventasLayout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(btn_ConsultHistoVenta))
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_HastaHistoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_DesdeHistoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(14, 14, 14)
                    .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbx_selecHistoVenta)
                        .addComponent(btn_cancelarBusquedaHistoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                    .addComponent(btn_EliminarVenta)
                    .addGap(56, 56, 56))))
    );

    Contenedor_Stast.addTab("Historial de Ventas", Historial_ventas);

    tbl_HistoCompra.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Index", "Fecha", "N# de Insumos", "Total Pagado", "Dinero Entregado", "Dinero Devuelto"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tbl_HistoCompra.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tbl_HistoCompra.getTableHeader().setReorderingAllowed(false);
    tbl_HistoCompra.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_HistoCompraMouseClicked(evt);
        }
    });
    tbl_HistoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tbl_HistoCompraKeyPressed(evt);
        }
    });
    jScrollPane17.setViewportView(tbl_HistoCompra);
    if (tbl_HistoCompra.getColumnModel().getColumnCount() > 0) {
        tbl_HistoCompra.getColumnModel().getColumn(0).setMinWidth(80);
        tbl_HistoCompra.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbl_HistoCompra.getColumnModel().getColumn(0).setMaxWidth(80);
        tbl_HistoCompra.getColumnModel().getColumn(1).setResizable(false);
        tbl_HistoCompra.getColumnModel().getColumn(2).setResizable(false);
        tbl_HistoCompra.getColumnModel().getColumn(3).setResizable(false);
        tbl_HistoCompra.getColumnModel().getColumn(4).setResizable(false);
        tbl_HistoCompra.getColumnModel().getColumn(5).setResizable(false);
    }

    tbl_HistoComprasFact.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Insumo", "Cantidad", "SubTotal"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tbl_HistoComprasFact.getTableHeader().setReorderingAllowed(false);
    jScrollPane20.setViewportView(tbl_HistoComprasFact);

    btn_EliminarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
    btn_EliminarCompra.setText("Eliminar Compra");
    btn_EliminarCompra.setEnabled(false);
    btn_EliminarCompra.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_EliminarCompraActionPerformed(evt);
        }
    });
    btn_EliminarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btn_EliminarCompraKeyPressed(evt);
        }
    });

    jLabel45.setText("Desde:");

    chbx_selecHistoCompra.setText("Seleccionado");
    chbx_selecHistoCompra.setEnabled(false);

    btn_ConsultHistoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
    btn_ConsultHistoCompra.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_ConsultHistoCompraActionPerformed(evt);
        }
    });
    btn_ConsultHistoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btn_ConsultHistoCompraKeyPressed(evt);
        }
    });

    Date_HastaHistoCompra.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
Date_HastaHistoCompra.setAutoScroll(false);

jLabel46.setText("Hasta:");

btn_cancelarBusquedaHistoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
btn_cancelarBusquedaHistoCompra.setText("Cancelar Búsqueda");
btn_cancelarBusquedaHistoCompra.setEnabled(false);
btn_cancelarBusquedaHistoCompra.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_cancelarBusquedaHistoCompramodificarPan(evt);
    }
    });
    btn_cancelarBusquedaHistoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btn_cancelarBusquedaHistoCompraKeyPressed(evt);
        }
    });

    Date_DesdeHistoCompra.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
Date_DesdeHistoCompra.setAutoScroll(false);

javax.swing.GroupLayout Historial_ventas1Layout = new javax.swing.GroupLayout(Historial_ventas1);
Historial_ventas1.setLayout(Historial_ventas1Layout);
Historial_ventas1Layout.setHorizontalGroup(
    Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(Historial_ventas1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Historial_ventas1Layout.createSequentialGroup()
                .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_EliminarCompra)
                    .addGroup(Historial_ventas1Layout.createSequentialGroup()
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Historial_ventas1Layout.createSequentialGroup()
                                .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Historial_ventas1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel45))
                                    .addComponent(Date_DesdeHistoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Historial_ventas1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel46))
                                    .addComponent(Date_HastaHistoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(btn_ConsultHistoCompra))
                            .addGroup(Historial_ventas1Layout.createSequentialGroup()
                                .addComponent(chbx_selecHistoCompra)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancelarBusquedaHistoCompra)))))
                .addGap(20, 20, 20)))
        .addContainerGap())
    );
    Historial_ventas1Layout.setVerticalGroup(
        Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(Historial_ventas1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Historial_ventas1Layout.createSequentialGroup()
                    .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Historial_ventas1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(btn_ConsultHistoCompra))
                        .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Historial_ventas1Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_HastaHistoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Historial_ventas1Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_DesdeHistoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(14, 14, 14)
                    .addGroup(Historial_ventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbx_selecHistoCompra)
                        .addComponent(btn_cancelarBusquedaHistoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                    .addComponent(btn_EliminarCompra)
                    .addGap(56, 56, 56))
                .addGroup(Historial_ventas1Layout.createSequentialGroup()
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())))
    );

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1154, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Historial_ventas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 562, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Historial_ventas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    Contenedor_Stast.addTab("Historial de Compras", jPanel4);

    pn_MasVendidosProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MasVendidosProducto.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MasVendidosProducto.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MasVendidosProducto.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MasVendidosProductoLayout = new javax.swing.GroupLayout(pn_MasVendidosProducto);
    pn_MasVendidosProducto.setLayout(pn_MasVendidosProductoLayout);
    pn_MasVendidosProductoLayout.setHorizontalGroup(
        pn_MasVendidosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MasVendidosProductoLayout.setVerticalGroup(
        pn_MasVendidosProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    pn_MasGananciaProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MasGananciaProducto.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MasGananciaProducto.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MasGananciaProducto.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MasGananciaProductoLayout = new javax.swing.GroupLayout(pn_MasGananciaProducto);
    pn_MasGananciaProducto.setLayout(pn_MasGananciaProductoLayout);
    pn_MasGananciaProductoLayout.setHorizontalGroup(
        pn_MasGananciaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MasGananciaProductoLayout.setVerticalGroup(
        pn_MasGananciaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    pn_MenosVendidoProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MenosVendidoProducto.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MenosVendidoProducto.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MenosVendidoProducto.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MenosVendidoProductoLayout = new javax.swing.GroupLayout(pn_MenosVendidoProducto);
    pn_MenosVendidoProducto.setLayout(pn_MenosVendidoProductoLayout);
    pn_MenosVendidoProductoLayout.setHorizontalGroup(
        pn_MenosVendidoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MenosVendidoProductoLayout.setVerticalGroup(
        pn_MenosVendidoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );

    pn_MenosGananciaProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MenosGananciaProducto.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MenosGananciaProducto.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MenosGananciaProducto.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MenosGananciaProductoLayout = new javax.swing.GroupLayout(pn_MenosGananciaProducto);
    pn_MenosGananciaProducto.setLayout(pn_MenosGananciaProductoLayout);
    pn_MenosGananciaProductoLayout.setHorizontalGroup(
        pn_MenosGananciaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MenosGananciaProductoLayout.setVerticalGroup(
        pn_MenosGananciaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    Date_ConsultProducto.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
Date_ConsultProducto.setAutoScroll(false);

btn_ConsultProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
btn_ConsultProducto.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ConsultProductoActionPerformed(evt);
    }
    });

    btn_cancelarBusquedaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
    btn_cancelarBusquedaProducto.setText("Cancelar ");
    btn_cancelarBusquedaProducto.setEnabled(false);
    btn_cancelarBusquedaProducto.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cancelarBusquedaProductomodificarPan(evt);
        }
    });
    btn_cancelarBusquedaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btn_cancelarBusquedaProductoKeyPressed(evt);
        }
    });

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(pn_MasVendidosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_cancelarBusquedaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ConsultProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Date_ConsultProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(pn_MenosVendidoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_MasGananciaProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pn_MenosGananciaProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pn_MasVendidosProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pn_MasGananciaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(Date_ConsultProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_ConsultProducto)
                    .addGap(18, 18, 18)
                    .addComponent(btn_cancelarBusquedaProducto)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_MenosGananciaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(pn_MenosVendidoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
            .addContainerGap(26, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1154, Short.MAX_VALUE)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE)))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 562, Short.MAX_VALUE)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    Contenedor_Stast.addTab("Graficas de Productos", jPanel5);

    pn_MasVendidosInsumo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MasVendidosInsumo.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MasVendidosInsumo.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MasVendidosInsumo.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MasVendidosInsumoLayout = new javax.swing.GroupLayout(pn_MasVendidosInsumo);
    pn_MasVendidosInsumo.setLayout(pn_MasVendidosInsumoLayout);
    pn_MasVendidosInsumoLayout.setHorizontalGroup(
        pn_MasVendidosInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MasVendidosInsumoLayout.setVerticalGroup(
        pn_MasVendidosInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    pn_MasGananciaInsumo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MasGananciaInsumo.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MasGananciaInsumo.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MasGananciaInsumo.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MasGananciaInsumoLayout = new javax.swing.GroupLayout(pn_MasGananciaInsumo);
    pn_MasGananciaInsumo.setLayout(pn_MasGananciaInsumoLayout);
    pn_MasGananciaInsumoLayout.setHorizontalGroup(
        pn_MasGananciaInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MasGananciaInsumoLayout.setVerticalGroup(
        pn_MasGananciaInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    pn_MenosVendidoInsumo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MenosVendidoInsumo.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MenosVendidoInsumo.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MenosVendidoInsumo.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MenosVendidoInsumoLayout = new javax.swing.GroupLayout(pn_MenosVendidoInsumo);
    pn_MenosVendidoInsumo.setLayout(pn_MenosVendidoInsumoLayout);
    pn_MenosVendidoInsumoLayout.setHorizontalGroup(
        pn_MenosVendidoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MenosVendidoInsumoLayout.setVerticalGroup(
        pn_MenosVendidoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    pn_MenosGananciaInsumo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    pn_MenosGananciaInsumo.setMaximumSize(new java.awt.Dimension(470, 265));
    pn_MenosGananciaInsumo.setMinimumSize(new java.awt.Dimension(470, 265));
    pn_MenosGananciaInsumo.setPreferredSize(new java.awt.Dimension(470, 265));

    javax.swing.GroupLayout pn_MenosGananciaInsumoLayout = new javax.swing.GroupLayout(pn_MenosGananciaInsumo);
    pn_MenosGananciaInsumo.setLayout(pn_MenosGananciaInsumoLayout);
    pn_MenosGananciaInsumoLayout.setHorizontalGroup(
        pn_MenosGananciaInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 466, Short.MAX_VALUE)
    );
    pn_MenosGananciaInsumoLayout.setVerticalGroup(
        pn_MenosGananciaInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 261, Short.MAX_VALUE)
    );

    Date_ConsultInsumo.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
Date_ConsultInsumo.setAutoScroll(false);

btn_ConsultInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
btn_ConsultInsumo.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ConsultInsumoActionPerformed(evt);
    }
    });

    btn_cancelarBusquedaInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
    btn_cancelarBusquedaInsumo.setText("Cancelar ");
    btn_cancelarBusquedaInsumo.setEnabled(false);
    btn_cancelarBusquedaInsumo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_cancelarBusquedaInsumomodificarPan(evt);
        }
    });
    btn_cancelarBusquedaInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            btn_cancelarBusquedaInsumoKeyPressed(evt);
        }
    });

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(pn_MasVendidosInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pn_MenosVendidoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(btn_ConsultInsumo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Date_ConsultInsumo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(btn_cancelarBusquedaInsumo))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(pn_MasGananciaInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_MenosGananciaInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(Date_ConsultInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_ConsultInsumo)
                    .addGap(18, 18, 18)
                    .addComponent(btn_cancelarBusquedaInsumo))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(pn_MasVendidosInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_MenosVendidoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(pn_MasGananciaInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pn_MenosGananciaInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(26, Short.MAX_VALUE))
    );

    Contenedor_Stast.addTab("Graficas de Insumos", jPanel9);

    javax.swing.GroupLayout EstadisticasLayout = new javax.swing.GroupLayout(Estadisticas);
    Estadisticas.setLayout(EstadisticasLayout);
    EstadisticasLayout.setHorizontalGroup(
        EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Contenedor_Stast)
    );
    EstadisticasLayout.setVerticalGroup(
        EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(EstadisticasLayout.createSequentialGroup()
            .addComponent(Contenedor_Stast)
            .addContainerGap())
    );

    Panel_General.addTab("Estadisticas", Estadisticas);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    jMenu3.setText("Inicio");
    jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
    jMenuItem1.setText("Salir");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    jMenu3.add(jMenuItem1);

    jMenuBar1.add(jMenu3);

    mbar_nameUser.setText("user");
    jMenuBar1.add(mbar_nameUser);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo para los iconos de la pantalla
    public void IconosPanel() {//ICONOS 

        // Titulo + Icono del programa
        setTitle("Panapa 2.0.0");
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Icons/bread.png")));

        //Productos
        Panel_General.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/groceries.png")));
        //Proveedores
        Panel_General.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/packing.png")));
        //Ventas
        Panel_General.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png")));
        //Estadisticas
        Panel_General.setIconAt(4, new javax.swing.ImageIcon(getClass().getResource("/Icons/estadisticas.png")));

        Panel_General.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/groceries_1.png")));

        //Prod_Registrar
        Productos.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png")));
        //Prod_Modificar
        Productos.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png")));
        //Prod_Consultar
        Productos.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png")));
        //Prod_Eliminar
        Productos.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png")));

        Productos.setIconAt(4, new javax.swing.ImageIcon(getClass().getResource("/Icons/folder.png")));

        //Prod_Registrar
        InsumosCont.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/groceries.png")));
        //Prod_Modificar
        InsumosCont.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png")));
        //Prod_Consultar
        InsumosCont.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png")));

        //Prov_Registrar
        Proveedores.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png")));
        //Prov_Modificar
        Proveedores.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png")));
        //Prov_Consultar
        Proveedores.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png")));
        //Prov_Modificar
        Proveedores.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png")));

        //Historial de Ventas
        Contenedor_Stast.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/receipt.png")));
        //Datos del Producto
        Contenedor_Stast.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/receipt.png")));

        Contenedor_Stast.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/folder.png")));

        Contenedor_Stast.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/folder.png")));

        listaProdVenta_tbl.getColumnModel().getColumn(0).setPreferredWidth(150);

    }


    private void totalProdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalProdVentaActionPerformed

    }//GEN-LAST:event_totalProdVentaActionPerformed

    //Evento enter
    private void txt_PagoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PagoVentaKeyPressed
        EventoEnter(evt, comprarVenta_btn);
    }//GEN-LAST:event_txt_PagoVentaKeyPressed

    private void cancelarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVenta_btnActionPerformed
        BorrarTextFieldVentas(nombreProdVenta_txt, cantidadProdVenta_txt);
        HabilitarTXT_BTN_Agregar_Venta(cantidadProdVenta_txt, comprarVenta_btn, false);
        retirarProdVenta_btn.setEnabled(false);
        txt_PagoVenta.setEnabled(false);
        cantidadProdVenta_txt.setEnabled(false);
        SelecTable(listaProdConsultVentas_tbl, selecProdConsultVenta_chbx, agregarProdVenta_btn, false);
        cancelarVenta_btn.setEnabled(false);
        totalProdVenta.setText("Total de la venta: 0.0");
        for (int i = 0; i < listaProdVenta_tbl.getRowCount(); i++) {
            Proco.CantidadVentaCancelar(Integer.parseInt(listaProdVenta_tbl.getValueAt(i, 0).toString()), Integer.parseInt(listaProdVenta_tbl.getValueAt(i, 2).toString()));
        }
        txt_PagoVenta.setText(null);
        Listar((DefaultTableModel) listaProdVenta_tbl.getModel(), new ArrayList());
        Listar((DefaultTableModel) listaProdConsultVentas_tbl.getModel(), Proco.ReadVenta());
    }//GEN-LAST:event_cancelarVenta_btnActionPerformed

    //Comprar Producto
    private void comprarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarVenta_btnActionPerformed
        try {
            double Total = TotalPreCompra(listaProdVenta_tbl, 3, totalProdVenta, "Total de la venta:");
            if (Double.parseDouble(txt_PagoVenta.getText()) < Total) {
                JOptionPane.showMessageDialog(null, "Verifique el pago ingresado", "Error", 0);
            } else {
                ArrayList<Producto> Get = new ArrayList<Producto>();
                for (int i = 0; i < listaProdVenta_tbl.getRowCount(); i++) {
                    Producto H = Proco.GetProducto(Integer.parseInt(listaProdVenta_tbl.getValueAt(i, 0).toString()));
                    Get.add(new Producto(H.getId(), H.getNombre(), H.getPrecio(), H.getProveedor(),
                            Integer.parseInt(listaProdVenta_tbl.getValueAt(i, 2).toString())));
                }
                ProduFactCo.Create(new FacturaProducto(UUID.randomUUID().toString(), Calendar.getInstance(),
                        Total, Get, Double.parseDouble(txt_PagoVenta.getText())));
                Listar((DefaultTableModel) listaProdVenta_tbl.getModel(), new ArrayList());
                cancelarVenta_btn.doClick();
                GrafCo.Create(Graficar("Productos Mas Vendidos", "Productos", "Cantidades", ProduFactCo.MayoresVendidos(Calendar.getInstance()), 4, true));
                GrafCo.Create(Graficar("Productos Menos Vendidos", "Productos", "Cantidades", ProduFactCo.MenoresVendidos(Calendar.getInstance()), 5, true));
                GrafCo.Create(Graficar("Productos Con Mayores Ganancias", "Productos", "Ganancias", ProduFactCo.MayoresGanancias(Calendar.getInstance()), 6, false));
                GrafCo.Create(Graficar("Productos Con Menores Ganancias", "Productos", "Ganancias", ProduFactCo.MenoresGanancias(Calendar.getInstance()), 7, false));
                JOptionPane.showMessageDialog(null, "La compra ha sido efectuada", "Compra", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        }
    }//GEN-LAST:event_comprarVenta_btnActionPerformed

    private void retirarProdVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarProdVenta_btnActionPerformed
        try {
            if (ConfirmDialog("¿Estas seguro que desea retirar este item?")) {
                JOptionPane.showMessageDialog(null, "Se ha retirado el item correctamente", "Retirado", 1);
                ((DefaultTableModel) listaProdVenta_tbl.getModel()).removeRow(listaProdVenta_tbl.getSelectedRow());
                selecProdVenta_chbx.setSelected(false);
                TotalPreCompra(listaProdVenta_tbl, 3, totalProdVenta, "Total de la venta:");
                if (listaProdVenta_tbl.getRowCount() <= 0) {
                    cancelarVenta_btn.doClick();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_retirarProdVenta_btnActionPerformed

    private void agregarProdVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdVenta_btnActionPerformed
        try {
            if (cantidadProdVenta_txt.getText() == null || cantidadProdVenta_txt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Verifique la cantidad", "Error", 0);
            } else if (Integer.parseInt(cantidadProdVenta_txt.getText()) > Proco.GetProducto(Integer.parseInt(listaProdConsultVentas_tbl.getValueAt(listaProdConsultVentas_tbl.getSelectedRow(), 0).toString())).getCantidad()
                    || Integer.parseInt(cantidadProdVenta_txt.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Verifique la cantidad disponible", "Error", 0);
            } else {
                ((DefaultTableModel) listaProdVenta_tbl.getModel()).addRow(new String[]{(listaProdConsultVentas_tbl.getValueAt(listaProdConsultVentas_tbl.getSelectedRow(), 0).toString()),
                    nombreProdVenta_txt.getText(), cantidadProdVenta_txt.getText(), (Integer.parseInt(cantidadProdVenta_txt.getText())
                    * Proco.GetProducto(Integer.parseInt(listaProdConsultVentas_tbl.getValueAt(listaProdConsultVentas_tbl.getSelectedRow(), 0).toString())).getPrecio()) + ""});
                Proco.CantidadVenta(Integer.parseInt(listaProdConsultVentas_tbl.getValueAt(listaProdConsultVentas_tbl.getSelectedRow(), 0).toString()), Integer.parseInt(cantidadProdVenta_txt.getText()));
                BorrarTextFieldVentas(nombreProdVenta_txt, cantidadProdVenta_txt);
                HabilitarTXT_BTN_Agregar_Venta(cantidadProdVenta_txt, comprarVenta_btn, true);
                cancelarVenta_btn.setEnabled(true);
                txt_PagoVenta.setEnabled(true);
                SelecTable(listaProdConsultVentas_tbl, selecProdConsultVenta_chbx, agregarProdVenta_btn, false);
                agregarProdVenta_btn.setEnabled(false);
                TotalPreCompra(listaProdVenta_tbl, 3, totalProdVenta, "Total de la venta:");
                Listar((DefaultTableModel) listaProdConsultVentas_tbl.getModel(), Proco.ReadVenta());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", 0);
        }
    }//GEN-LAST:event_agregarProdVenta_btnActionPerformed

    //Evento  Enter
    private void cantidadProdVenta_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProdVenta_txtKeyPressed
        EventoEnter(evt, agregarProdVenta_btn);
    }//GEN-LAST:event_cantidadProdVenta_txtKeyPressed

    private void listaProdConsultVentas_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdConsultVentas_tblMouseClicked
        try {
            IndexTable = null;
            SelecTable(listaProdConsultVentas_tbl, selecProdConsultVenta_chbx, agregarProdVenta_btn, true);
            cantidadProdVenta_txt.setEnabled(true);
            nombreProdVenta_txt.setText(listaProdConsultVentas_tbl.getValueAt(listaProdConsultVentas_tbl.getSelectedRow(), 1).toString());
        } catch (Exception e) {

        }

    }//GEN-LAST:event_listaProdConsultVentas_tblMouseClicked

    private void consultPanVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanVenta_btnActionPerformed
        BuscarAll(nombrePanConsultVenta_txt.getText().toUpperCase(), listaProdConsultVentas_tbl, Proco.ReadVenta(nombrePanConsultVenta_txt.getText().toUpperCase()), cancelarBusquedaPan_btn);
    }//GEN-LAST:event_consultPanVenta_btnActionPerformed

    //Evento del enter venta
    private void nombrePanConsultVenta_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanConsultVenta_txtKeyPressed
        EventoEnter(evt, consultPanVenta_btn);
    }//GEN-LAST:event_nombrePanConsultVenta_txtKeyPressed

    private void listaProdVenta_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdVenta_tblMouseClicked
        try {
            SelecTable(listaProdVenta_tbl, selecProdVenta_chbx, retirarProdVenta_btn, true);
            retirarProdVenta_btn.setEnabled(true);
            selecProdVenta_chbx.setSelected(true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_listaProdVenta_tblMouseClicked

    //Buscar en el eliminar proveedores
    private void consultProvEliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvEliminar_btnActionPerformed
        BuscarAll(nombreEliminarProv_txt.getText().toUpperCase(), listaProvEliminar_tbl, Proveeco.Read(nombreEliminarProv_txt.getText().toUpperCase()), cancelarElimProv_btn);
    }//GEN-LAST:event_consultProvEliminar_btnActionPerformed

    //Evento del enter para eliminar proveedor
    private void listaProvEliminar_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProvEliminar_tblKeyPressed
        if (evt.getKeyChar() == ENTER) {
            listaProvEliminar_tblMouseClicked(null);
        }
    }//GEN-LAST:event_listaProvEliminar_tblKeyPressed

    private void listaProvEliminar_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProvEliminar_tblMouseClicked
        try {
            SelecTable(listaProvEliminar_tbl, selecEliminarProv_chbx, EliminarProv_btn, true);
            cancelarElimProv_btn.setEnabled(true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_listaProvEliminar_tblMouseClicked

    private void EliminarProv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProv_btnActionPerformed
        try {
            if (ConfirmDialog("¿Esta seguro que deasea eliminar este proveedor?")) {
                Proveeco.Delete(Integer.parseInt(IndexTable.toString()));
                JOptionPane.showMessageDialog(null, "Se ha eliminado el item correctamente", "Eliminado", 1);
            }
            ListAll();
            SelecTable(listaProvEliminar_tbl, selecEliminarProv_chbx, EliminarProv_btn, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_EliminarProv_btnActionPerformed

    //Evento del enter en el eliminar proveedro para buscar
    private void nombreEliminarProv_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreEliminarProv_txtKeyPressed
        EventoEnter(evt, consultProvEliminar_btn);
    }//GEN-LAST:event_nombreEliminarProv_txtKeyPressed

    //Buscar en el consultar Proveedores
    private void consultProv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProv_btnActionPerformed

        BuscarAll(nombreProvConsult_txt.getText().toUpperCase(), listaProvConsult_tbl, Proveeco.Read(nombreProvConsult_txt.getText().toUpperCase()), cancelarBusquedaProv_btn);
    }//GEN-LAST:event_consultProv_btnActionPerformed

    //Evento del enter en el consultar proveedor
    private void nombreProvConsult_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreProvConsult_txtKeyPressed
        EventoEnter(evt, consultProv_btn);
    }//GEN-LAST:event_nombreProvConsult_txtKeyPressed

    private void nombreProvConsult_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProvConsult_txtActionPerformed

    }//GEN-LAST:event_nombreProvConsult_txtActionPerformed

    //Evento para cancelar el modificar del proveedor
    private void cancelarEditProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEditProv_btnmodificarPan
        BorrarTextFieldProv(nombreProvEdit_txt, telefonoProvEdit_txt, nitProvEdit_txt, serviProvEdit_txt, direcProvEdit_txt);
        EnabledBtn(EditProv_btn, GuardarEditProv_btn, cancelarEditProv_btn, false);
        EnabledTxt_Proveedor(nombreProvEdit_txt, telefonoProvEdit_txt, nitProvEdit_txt, serviProvEdit_txt, direcProvEdit_txt, false);
        SelecTable(listaProveedoresEdit_tbl, selecEditProv_chbx, EditProv_btn, false);
    }//GEN-LAST:event_cancelarEditProv_btnmodificarPan

    //evento para guardar modificacion
    private void GuardarEditProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEditProv_btnmodificarPan
        try {
            if (ConfirmDialog("¿Esta seguro que desea modificar este proveedorq?")) {
                if (ValProveedor(nombreProvEdit_txt.getText(), telefonoProvEdit_txt.getText(), nitProvEdit_txt.getText(), serviProvEdit_txt.getText(), direcProvEdit_txt.getText())) {
                    if (Val_Nit(nitProvEdit_txt.getText()) && nitProvEdit_txt.getText().length() == 10) {
                        Proveeco.Update(Integer.parseInt(IndexTable.toString()), new Proveedor(UUID.randomUUID().toString(), nombreProvEdit_txt.getText().toUpperCase(),
                                serviProvEdit_txt.getText().toUpperCase(), telefonoProvEdit_txt.getText(), direcProvEdit_txt.getText().toUpperCase(), nitProvEdit_txt.getText().toUpperCase(), 0));
                        ListAll();
                        cancelarEditProv_btn.doClick();
                        JOptionPane.showMessageDialog(null, "El proveedor ha sido modificado", "modoficado", 1);
                    } else if (nitProvEdit_txt.getText().length() > 10 || nitProvEdit_txt.getText().length() < 10) {
                        JOptionPane.showMessageDialog(null, "El NIT es de 10 digitos", "Error", 0);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido algun error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_GuardarEditProv_btnmodificarPan

    //Evento del boton de modificar proveedor
    private void EditProv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProv_btnActionPerformed
        EnabledTxt_Proveedor(nombreProvEdit_txt, telefonoProvEdit_txt, nitProvEdit_txt, serviProvEdit_txt, direcProvEdit_txt, true);
        EnabledMod(EditProv_btn, GuardarEditProv_btn, true);
    }//GEN-LAST:event_EditProv_btnActionPerformed

    //Metodo para consular en el modificar proveedor
    private void consultProvEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvEdit_btnActionPerformed
        BuscarAll(nombreProvConsultEdit_txt.getText().toUpperCase(), listaProveedoresEdit_tbl, Proveeco.Read(nombreProvConsultEdit_txt.getText().toUpperCase()), cancelarBusqPov_btn);
    }//GEN-LAST:event_consultProvEdit_btnActionPerformed

    //Evento del enter para el modificar proveedor
    private void direcProvEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcProvEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_direcProvEdit_txtKeyPressed

    //Evento del enter para el modificar proveedor tabla
    private void listaProveedoresEdit_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProveedoresEdit_tblKeyPressed
        if (evt.getKeyChar() == ENTER) {
            listaProveedoresEdit_tblMouseClicked(null);
        }
    }//GEN-LAST:event_listaProveedoresEdit_tblKeyPressed

    //Evento para seleccionar un proveedor del modificar
    private void listaProveedoresEdit_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProveedoresEdit_tblMouseClicked
        try {
            cancelarEditProv_btn.doClick();
            SelecTable(listaProveedoresEdit_tbl, selecEditProv_chbx, EditProv_btn, true);
            cancelarEditProv_btn.setEnabled(true);
            nombreProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 1).toString());
            serviProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 2).toString());
            telefonoProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 3).toString());
            direcProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 4).toString());
            nitProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 5).toString());
        } catch (Exception e) {

        }

    }//GEN-LAST:event_listaProveedoresEdit_tblMouseClicked

    //Evento del enter en el consultar proveedor en el modificar
    private void nombreProvConsultEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreProvConsultEdit_txtKeyPressed
        EventoEnter(evt, consultProvEdit_btn);
    }//GEN-LAST:event_nombreProvConsultEdit_txtKeyPressed

    //Evento del enter para registrar proveedor
    private void direcProvReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcProvReg_txtKeyPressed
        EventoEnter(evt, registrarProv_btn);
    }//GEN-LAST:event_direcProvReg_txtKeyPressed

    //Evento para registrar proveedor
    private void registrarProv_btnregistrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProv_btnregistrarPan
        try {
            if (ValProveedor(nombreProvReg_txt.getText(), telefonoProvReg_txt.getText(), nitProvReg_txt.getText(), serviProvReg_txt.getText(), direcProvReg_txt.getText())) {
                if (Val_Nit(nitProvReg_txt.getText()) && nitProvReg_txt.getText().length() == 10) {
                    Proveeco.Create(new Proveedor(UUID.randomUUID().toString(), nombreProvReg_txt.getText().toUpperCase(),
                            serviProvReg_txt.getText().toUpperCase(), telefonoProvReg_txt.getText(), direcProvReg_txt.getText().toUpperCase(), nitProvReg_txt.getText().toUpperCase(), 0));
                    BorrarTextFieldProv(nombreProvReg_txt, telefonoProvReg_txt, nitProvReg_txt, serviProvReg_txt, direcProvReg_txt);
                } else {
                    if (nitProvEdit_txt.getText().length() > 10 || nitProvEdit_txt.getText().length() < 10) {
                        JOptionPane.showMessageDialog(null, "El NIT es de 10 digitos", "Error", 0);
                    }
                }
            }
            ListAll();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, vuelva a intentar.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_registrarProv_btnregistrarPan

    //Boton de consultar en el consultar producto
    private void consultPanEliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanEliminar_btnActionPerformed
        BuscarAll(nombrePanEliminar_txt.getText().toUpperCase(), listaPanesEliminar_tbl, Proco.Read(nombrePanEliminar_txt.getText().toUpperCase()), cancelarElimProd_btn);
    }//GEN-LAST:event_consultPanEliminar_btnActionPerformed

    //Boton de Eliminar producto
    private void eliminarPan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPan_btnActionPerformed
        try {
            if (ConfirmDialog("¿Estas seguro que desea eliminar este item?")) {
                Proco.Delete(Integer.parseInt(IndexTable.toString()));
                JOptionPane.showMessageDialog(null, "Se ha eliminado el item correctamente", "Eliminado", 1);
            }
            ListAll();
            SelecTable(listaPanesEliminar_tbl, selecPanEliminar_chbx, eliminarPan_btn, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_eliminarPan_btnActionPerformed

    //Evento enter del buscar  producto eliminar
    private void nombrePanEliminar_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanEliminar_txtKeyPressed
        EventoEnter(evt, consultPanEliminar_btn);
    }//GEN-LAST:event_nombrePanEliminar_txtKeyPressed

    //Evento para seleccionar un producto del eliminar
    private void listaPanesEliminar_tblselecProdEliminar_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPanesEliminar_tblselecProdEliminar_tbl
        try {
            SelecTable(listaPanesEliminar_tbl, selecPanEliminar_chbx, eliminarPan_btn, true);
            cancelarElimProd_btn.setEnabled(true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_listaPanesEliminar_tblselecProdEliminar_tbl

    //Consultar Productos Eventos
    private void consultPan_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPan_btn
        BuscarAll(nombrePanConsult_txt.getText().toUpperCase(), listaPanesConsult_tbl, Proco.Read(nombrePanConsult_txt.getText().toUpperCase()), cancelarBusquedaProd_btn);
    }//GEN-LAST:event_consultPan_btn

    //Evento del enter consultar productos
    private void nombrePanConsult_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanConsult_txtKeyPressed
        EventoEnter(evt, consultPan_btn);
    }//GEN-LAST:event_nombrePanConsult_txtKeyPressed

    private void nombrePanConsult_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePanConsult_txtActionPerformed

    }//GEN-LAST:event_nombrePanConsult_txtActionPerformed

    //Evento de cancelar en el Editar
    private void cancelarEditPan_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEditPan_btnmodificarPan
        BorrarProducto_txt(nombrePanEdit_txt, precioPanEdit_txt, provePanEdit_cmbx);
        EnabledBtn(EditPan_btn, GuardarEditPan_btn, cancelarEditPan_btn, false);
        EnabledTxt_Producto(nombrePanEdit_txt, precioPanEdit_txt, provePanEdit_cmbx, false);
        SelecTable(listaPanesEdit_tbl, selecEditPan_chbx, EditPan_btn, false);
    }//GEN-LAST:event_cancelarEditPan_btnmodificarPan

    //Evento para modificar producto
    private void EditPan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPan_btnActionPerformed
        EnabledTxt_Producto(nombrePanEdit_txt, precioPanEdit_txt, provePanEdit_cmbx, true);
        EnabledMod(EditPan_btn, GuardarEditPan_btn, true);
    }//GEN-LAST:event_EditPan_btnActionPerformed

    //Evento para buscar en el modificar en el producto
    private void consultPanEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanEdit_btnActionPerformed
        BuscarAll(nombrePanConsultEdit_txt.getText().toUpperCase(), listaPanesEdit_tbl, Proco.Read(nombrePanConsultEdit_txt.getText().toUpperCase()), cancelarBusqProd_btn);
    }//GEN-LAST:event_consultPanEdit_btnActionPerformed

    //Evento enter para la tabla del modificar producto
    private void listaPanesEdit_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPanesEdit_tblKeyPressed
        if (evt.getKeyChar() == ENTER) {
            listaPanesEdit_tblselecProdModif_tbl(null);
        }
    }//GEN-LAST:event_listaPanesEdit_tblKeyPressed

    //Evento para cuando se seleccione un pan de la tabla del modificar
    private void listaPanesEdit_tblselecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPanesEdit_tblselecProdModif_tbl
        try {
            cancelarEditPan_btn.doClick();
            SelecTable(listaPanesEdit_tbl, selecEditPan_chbx, EditPan_btn, true);
            cancelarEditPan_btn.setEnabled(true);
            nombrePanEdit_txt.setText(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 1).toString());
            precioPanEdit_txt.setText(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 2).toString());
            provePanEdit_cmbx.setSelectedItem(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 3).toString());
        } catch (Exception e) {

        }

    }//GEN-LAST:event_listaPanesEdit_tblselecProdModif_tbl

    //Evento para Guardar La Modificación
    private void GuardarEditPan_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEditPan_btnmodificarPan
        try {
            //Confirmo el la petición
            if (ConfirmDialog("¿Esta seguro que desea modificar este producto?")) {
                if (ValProducto(nombrePanEdit_txt.getText(), precioPanEdit_txt.getText())) {
                    Proco.Update(Integer.parseInt(IndexTable.toString()),
                            new Producto(Proco.getLista_producto().get(Integer.parseInt(IndexTable.toString())).getId(), nombrePanEdit_txt.getText(),
                                    Double.parseDouble(precioPanEdit_txt.getText()), Proveeco.getLista_proovedor().get(provePanEdit_cmbx.getSelectedIndex()), 0));
                    cancelarEditPan_btn.doClick();
                    ListAll();
                    JOptionPane.showMessageDialog(null, "El producto ha sido modificado", "modificado", 1);
                } else {
                    //si los datos no son validos
                    JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_GuardarEditPan_btnmodificarPan

    //Evento de registrar Producto
    private void registrarPan_btnregistrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPan_btnregistrarPan
        //Valido la entrada
        if (ValProducto(nombrePanReg_txt.getText(), precioPanReg_txt.getText())) {
            //valido el combobox
            if (provePanReg_cmbx.getSelectedIndex() >= 0) {
                //creo el producto
                Proco.Create(new Producto(UUID.randomUUID().toString(), nombrePanReg_txt.getText().toUpperCase(),
                        Double.parseDouble(precioPanReg_txt.getText()), Proveeco.getLista_proovedor().get(provePanReg_cmbx.getSelectedIndex()), 0));
                ListAll();
                BorrarProducto_txt(nombrePanReg_txt, precioPanReg_txt, provePanReg_cmbx);
                nombrePanReg_txt.requestFocus();
                JOptionPane.showMessageDialog(null, "El producto ha sido registrado", "Registrado", 1);
            } else {
                //si los datos no son validos
                JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
            }
        } else {
            //si los datos no son validos
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        }
    }//GEN-LAST:event_registrarPan_btnregistrarPan

    private void nombrePanConsultVenta_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePanConsultVenta_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePanConsultVenta_txtActionPerformed

    //Evento del enter en buscar producto modificar
    private void nombrePanConsultEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanConsultEdit_txtKeyPressed
        EventoEnter(evt, consultPanEdit_btn);
    }//GEN-LAST:event_nombrePanConsultEdit_txtKeyPressed

    //Evento del Enter en registrar producto
    private void precioPanReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPanReg_txtKeyPressed
        EventoEnter(evt, registrarPan_btn);
    }//GEN-LAST:event_precioPanReg_txtKeyPressed

    private void precioPanReg_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioPanReg_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioPanReg_txtActionPerformed

    private void nombrePanEliminar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePanEliminar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePanEliminar_txtActionPerformed

    private void selecEliminarProv_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecEliminarProv_chbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecEliminarProv_chbxActionPerformed

    private void selecEditProv_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecEditProv_chbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecEditProv_chbxActionPerformed

    private void selecPanEliminar_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecPanEliminar_chbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecPanEliminar_chbxActionPerformed

    private void selecEditPan_chbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecEditPan_chbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecEditPan_chbxActionPerformed

    //Evento del enter Para registrar producto
    private void nombrePanReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanReg_txtKeyPressed
        EventoEnter(evt, registrarPan_btn);
    }//GEN-LAST:event_nombrePanReg_txtKeyPressed

    //Evento del enter para modificar producto guardar
    private void nombrePanEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditPan_btn);
    }//GEN-LAST:event_nombrePanEdit_txtKeyPressed

    //Evento del enter para modificar producto guardar
    private void precioPanEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPanEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditPan_btn);
    }//GEN-LAST:event_precioPanEdit_txtKeyPressed

    //Evento del enter para registrar proveedor
    private void nombreProvReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreProvReg_txtKeyPressed
        EventoEnter(evt, registrarProv_btn);
    }//GEN-LAST:event_nombreProvReg_txtKeyPressed

    //Evento del enter para registrar proveedor
    private void telefonoProvReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoProvReg_txtKeyPressed
        EventoEnter(evt, registrarProv_btn);
    }//GEN-LAST:event_telefonoProvReg_txtKeyPressed

    //Evento del enter para registrar proveedor
    private void nitProvReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProvReg_txtKeyPressed
        EventoEnter(evt, registrarProv_btn);
    }//GEN-LAST:event_nitProvReg_txtKeyPressed

    //Evento del enter para registrar proveedor
    private void serviProvReg_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serviProvReg_txtKeyPressed
        EventoEnter(evt, registrarProv_btn);
    }//GEN-LAST:event_serviProvReg_txtKeyPressed

    //Evento del enter para modificar proveedor
    private void nombreProvEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreProvEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_nombreProvEdit_txtKeyPressed

    //Evento del enter para modificar proveedor
    private void telefonoProvEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoProvEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_telefonoProvEdit_txtKeyPressed

    //Evento del entenr para modificar proveedor
    private void nitProvEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProvEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_nitProvEdit_txtKeyPressed

    //Evento del enter para el modificar proveedor
    private void serviProvEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serviProvEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_serviProvEdit_txtKeyPressed

    //Actualizar Panel de Productos
    private void ProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProductosStateChanged
        try {
            ActualizarPanelCrud(nombrePanReg_txt, nombrePanConsultEdit_txt, nombrePanConsult_txt, nombrePanEliminar_txt, Productos);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_ProductosStateChanged

    //Actualizar Panel Proveedores
    private void ProveedoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProveedoresStateChanged
        try {
            ActualizarPanelCrud(nombreProvReg_txt, nombreProvConsultEdit_txt, nombreProvConsult_txt, nombreEliminarProv_txt, Proveedores);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_ProveedoresStateChanged

    //Actualizar Panel General
    private void Panel_GeneralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Panel_GeneralStateChanged
        try {
            switch (Panel_General.getSelectedIndex()) {
                case 0:
                    ActualizarPanelCrud(nombrePanReg_txt, nombrePanConsultEdit_txt, nombrePanConsult_txt, nombrePanEliminar_txt, Productos);
                    break;
                case 1:
                    ActualizarPanelCrud(nombreProvReg_txt, nombreProvConsultEdit_txt, nombreProvConsult_txt, nombreEliminarProv_txt, Proveedores);
                    break;
                case 2:
                    ActualizarPanelCrud(txt_nombreInsumoReg, txt_nombreInsumoConsultEdit, txt_nombreInsumoConsultVenta, txt_nombreInsumoReg, InsumosCont);
                    break;
                case 3:
                    nombrePanConsultVenta_txt.requestFocus();
                    break;
            }
        } catch (Exception e) {

        }

        ListAll();
    }//GEN-LAST:event_Panel_GeneralStateChanged

    private void nombreProdVenta_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProdVenta_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProdVenta_txtActionPerformed

    private void cancelarBusquedaPan_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusquedaPan_btnmodificarPan
        Listar((DefaultTableModel) listaProdConsultVentas_tbl.getModel(), Proco.ReadVenta());
        nombreProdVenta_txt.setText(null);
        nombrePanConsultVenta_txt.setText(null);
        cancelarBusquedaPan_btn.setEnabled(false);
        totalProdVenta.setText("Total de la venta: 0.0");
    }//GEN-LAST:event_cancelarBusquedaPan_btnmodificarPan

    private void cancelarBusquedaProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusquedaProv_btnmodificarPan
        Listar((DefaultTableModel) listaProvConsult_tbl.getModel(), Proveeco.ReadAll());
        nombreProvConsult_txt.setText(null);
        cancelarBusquedaProv_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusquedaProv_btnmodificarPan

    private void cancelarBusquedaProd_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusquedaProd_btnmodificarPan
        Listar((DefaultTableModel) listaPanesConsult_tbl.getModel(), Proco.ReadAll());
        nombrePanConsult_txt.setText(null);
        cancelarBusquedaProd_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusquedaProd_btnmodificarPan

    private void cancelarElimProd_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarElimProd_btnmodificarPan
        Listar((DefaultTableModel) listaPanesEliminar_tbl.getModel(), Proco.ReadAll());
        SelecTable(listaPanesEliminar_tbl, selecPanEliminar_chbx, cancelarElimProd_btn, false);
        nombrePanEliminar_txt.setText(null);
        eliminarPan_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarElimProd_btnmodificarPan

    private void cancelarElimProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarElimProv_btnmodificarPan
        Listar((DefaultTableModel) listaProvEliminar_tbl.getModel(), Proveeco.ReadAll());
        SelecTable(listaProvEliminar_tbl, selecEliminarProv_chbx, cancelarElimProv_btn, false);
        nombreEliminarProv_txt.setText(null);
        EliminarProv_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarElimProv_btnmodificarPan

    private void cancelarBusqProd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusqProd_btnActionPerformed
        Listar((DefaultTableModel) listaPanesEdit_tbl.getModel(), Proco.ReadAll());
        nombrePanConsultEdit_txt.setText(null);
        cancelarBusqProd_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusqProd_btnActionPerformed

    private void cancelarBusqPov_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusqPov_btnActionPerformed
        Listar((DefaultTableModel) listaProveedoresEdit_tbl.getModel(), Proveeco.ReadAll());
        nombreProvConsultEdit_txt.setText(null);
        cancelarBusqPov_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusqPov_btnActionPerformed

    //Evento del enter para los insumos registrar
    private void txt_nombreInsumoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumoRegKeyPressed
        EventoEnter(evt, btn_registrarInsumo);
    }//GEN-LAST:event_txt_nombreInsumoRegKeyPressed

    private void txt_precioInsumoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioInsumoRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioInsumoRegActionPerformed

    //evento del enter en el registrar insumo
    private void txt_precioInsumoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioInsumoRegKeyPressed
        EventoEnter(evt, btn_registrarInsumo);
    }//GEN-LAST:event_txt_precioInsumoRegKeyPressed

    private void btn_registrarInsumoregistrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarInsumoregistrarPan
        //Valida la entrada
        if (ValProducto(txt_nombreInsumoReg.getText(), txt_precioInsumoReg.getText())) {
            //Valida el combobox proveedor
            if (cmbx_proveInsumoReg.getSelectedIndex() >= 0) {
                //Se crea el insumo
                Insumco.Create(new Insumo(UUID.randomUUID().toString(), txt_nombreInsumoReg.getText().toUpperCase(),
                        Double.parseDouble(txt_precioInsumoReg.getText()), Proveeco.getLista_proovedor().get(cmbx_proveInsumoReg.getSelectedIndex()), 0, cmbx_unidadInsumoReg.getSelectedItem().toString()));
                Listar((DefaultTableModel) tbl_listaInsumosReg.getModel(), Insumco.ReadAll());
                BorrarInsumo_txt(txt_nombreInsumoReg, txt_precioInsumoReg, cmbx_proveInsumoReg, cmbx_unidadInsumoReg);
                txt_nombreInsumoReg.requestFocus();
            } else {
                //Si los datos no son validos
                JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
            }
        } else {
            //Si los datos no son validos
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        }
    }//GEN-LAST:event_btn_registrarInsumoregistrarPan

    private void btn_GuardarEditInsumomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarEditInsumomodificarPan
        try {
            //Confirmo el la petición
            if (ConfirmDialog("¿Esta seguro que desea modificar este Insumo?")) {
                if (ValProducto(txt_nombreInsumosEdit.getText(), txt_precioInsumoEdit.getText())) {
                    Insumco.Update(Integer.parseInt(IndexTable.toString()),
                            new Insumo(Insumco.getLista_Insumos().get(Integer.parseInt(IndexTable.toString())).getId(), txt_nombreInsumosEdit.getText(), Double.parseDouble(txt_precioInsumoEdit.getText()), Proveeco.getLista_proovedor().get(cmbx_proveInsumoEdit.getSelectedIndex()), 0, cmbx_unidadInsumoEdit.getSelectedItem().toString()));
                    btn_cancelarEditInsumo.doClick();
                    ListAll();
                    JOptionPane.showMessageDialog(null, "El Insumo ha sido modificado", "modificado", 1);
                } else {
                    //si los datos no son validos
                    JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_btn_GuardarEditInsumomodificarPan

    //Evento para las tablas del eliminar insumos
    private void tbl_listaInsumoEditselecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaInsumoEditselecProdModif_tbl
        try {
            btn_cancelarEditInsumo.doClick();
            SelecTable(tbl_listaInsumoEdit, chbx_selecEditInsumo, btn_EditInsumo, true);
            btn_cancelarEditInsumo.setEnabled(true);
            btn_EliminarEditInsumo.setEnabled(true);
            txt_nombreInsumosEdit.setText(tbl_listaInsumoEdit.getValueAt(tbl_listaInsumoEdit.getSelectedRow(), 1).toString());
            txt_precioInsumoEdit.setText(tbl_listaInsumoEdit.getValueAt(tbl_listaInsumoEdit.getSelectedRow(), 2).toString());
            cmbx_proveInsumoEdit.setSelectedItem(tbl_listaInsumoEdit.getValueAt(tbl_listaInsumoEdit.getSelectedRow(), 3).toString());
            cmbx_unidadInsumoEdit.setSelectedItem(tbl_listaInsumoEdit.getValueAt(tbl_listaInsumoEdit.getSelectedRow(), 4).toString());
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbl_listaInsumoEditselecProdModif_tbl

    //Evento del enter en las tablas del editar insumos
    private void tbl_listaInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_listaInsumoEditKeyPressed
        if (evt.getKeyChar() == ENTER) {
            tbl_listaInsumoEditselecProdModif_tbl(null);
        }
    }//GEN-LAST:event_tbl_listaInsumoEditKeyPressed

    //Evento del enter en el modificar los insumos
    private void txt_precioInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioInsumoEditKeyPressed
        EventoEnter(evt, btn_GuardarEditInsumo);
    }//GEN-LAST:event_txt_precioInsumoEditKeyPressed

    //Evento del enter para el modificar insumos
    private void txt_nombreInsumosEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumosEditKeyPressed
        EventoEnter(evt, btn_GuardarEditInsumo);
    }//GEN-LAST:event_txt_nombreInsumosEditKeyPressed

    private void chbx_selecEditInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbx_selecEditInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbx_selecEditInsumoActionPerformed

    //Evento del enter
    private void txt_nombreInsumoConsultEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumoConsultEditKeyPressed
        EventoEnter(evt, btn_consultInsumoEdit);
    }//GEN-LAST:event_txt_nombreInsumoConsultEditKeyPressed

    private void btn_consultInsumoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultInsumoEditActionPerformed
        BuscarAll(txt_nombreInsumoConsultEdit.getText().toUpperCase(), tbl_listaInsumoEdit, Insumco.Read(txt_nombreInsumoConsultEdit.getText().toUpperCase()), btn_cancelBusqInsumoEdit);
        chbx_selecEditInsumo.setEnabled(false);
        SelecTable(tbl_listaInsumoEdit, chbx_selecEditInsumo, btn_EditInsumo, false);
        BorrarInsumo_txt(txt_nombreInsumosEdit, txt_precioInsumoEdit, cmbx_proveInsumoEdit, cmbx_unidadInsumoEdit);
        EnabledBtn(btn_EditInsumo, btn_GuardarEditInsumo, btn_cancelarEditInsumo, false);
        EnabledTxt_Insumo(txt_nombreInsumosEdit, txt_precioInsumoEdit, cmbx_proveInsumoEdit, cmbx_unidadInsumoEdit, false);
        btn_EliminarEditInsumo.setEnabled(false);
    }//GEN-LAST:event_btn_consultInsumoEditActionPerformed

    private void btn_EditInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditInsumoActionPerformed
        EnabledTxt_Insumo(txt_nombreInsumosEdit, txt_precioInsumoEdit, cmbx_proveInsumoEdit, cmbx_unidadInsumoEdit, true);
        EnabledMod(btn_EditInsumo, btn_GuardarEditInsumo, true);
        btn_EliminarEditInsumo.setEnabled(false);
    }//GEN-LAST:event_btn_EditInsumoActionPerformed

    private void btn_EliminarEditInsumomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarEditInsumomodificarPan
        try {
            if (ConfirmDialog("¿Estas seguro que desea eliminar este item?")) {
                Insumco.Delete(Integer.parseInt(IndexTable.toString()));
                JOptionPane.showMessageDialog(null, "Se ha eliminado el item correctamente", "Eliminado", 1);
            }
            ListAll();
            BorrarInsumo_txt(txt_nombreInsumosEdit, txt_precioInsumoEdit, cmbx_proveInsumoEdit, cmbx_unidadInsumoEdit);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_btn_EliminarEditInsumomodificarPan

    private void btn_cancelBusqInsumoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelBusqInsumoEditActionPerformed
        Listar((DefaultTableModel) tbl_listaInsumoEdit.getModel(), Insumco.ReadAll());
        txt_nombreInsumoConsultEdit.setText(null);
        btn_cancelBusqInsumoEdit.setEnabled(false);
    }//GEN-LAST:event_btn_cancelBusqInsumoEditActionPerformed

    private void btn_cancelarEditInsumomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarEditInsumomodificarPan
        BorrarInsumo_txt(txt_nombreInsumosEdit, txt_precioInsumoEdit, cmbx_proveInsumoEdit, cmbx_unidadInsumoEdit);
        EnabledBtn(btn_EditInsumo, btn_GuardarEditInsumo, btn_cancelarEditInsumo, false);
        EnabledTxt_Insumo(txt_nombreInsumosEdit, txt_precioInsumoEdit, cmbx_proveInsumoEdit, cmbx_unidadInsumoEdit, false);
        SelecTable(tbl_listaInsumoEdit, chbx_selecEditInsumo, btn_EditInsumo, false);
        btn_EliminarEditInsumo.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarEditInsumomodificarPan

    private void tbl_listaInsumoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaInsumoVentaMouseClicked
        try {
            SelecTable(tbl_listaInsumoVenta, chbx_selecInsumoVenta, retirarInsumoVenta_btn, true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbl_listaInsumoVentaMouseClicked

    private void txt_nombreInsumoConsultVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreInsumoConsultVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoConsultVentaActionPerformed

    //Evento Enter
    private void txt_nombreInsumoConsultVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumoConsultVentaKeyPressed
        EventoEnter(evt, btn_consultInsumoVenta);
    }//GEN-LAST:event_txt_nombreInsumoConsultVentaKeyPressed

    private void btn_consultInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultInsumoVentaActionPerformed
        try {
            BuscarAll(txt_nombreInsumoConsultVenta.getText().toUpperCase(), tbl_listaInsumoConsultVentas, Insumco.Read(txt_nombreInsumoConsultVenta.getText().toUpperCase()), btn_cancelarBusquedaInsumoVenta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "digite solo valores numericosPor favor digite solo valores numericos", "Error", 0);
        }
    }//GEN-LAST:event_btn_consultInsumoVentaActionPerformed

    //Evento de click para para editar cantidad
    private void tbl_listaInsumoConsultVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaInsumoConsultVentasMouseClicked
        try {
            IndexTable = null;
            SelecTable(tbl_listaInsumoConsultVentas, chbx_selecInsumoConsultVenta, btn_agregarInsumoVenta, true);
            txt_cantidadInsumoVenta.setEnabled(true);
            txt_nombreInsumoVenta.setText(tbl_listaInsumoConsultVentas.getValueAt(tbl_listaInsumoConsultVentas.getSelectedRow(), 1).toString());
            cmbx_unidadInsumoVenta.setSelectedItem(Insumco.getLista_Insumos().get(Integer.parseInt(tbl_listaInsumoConsultVentas.getValueAt(tbl_listaInsumoConsultVentas.getSelectedRow(), 0).toString())).getUnidad());
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbl_listaInsumoConsultVentasMouseClicked

    private void txt_nombreInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreInsumoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoVentaActionPerformed

    //Evento enter
    private void txt_cantidadInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadInsumoVentaKeyPressed
        EventoEnter(evt, btn_agregarInsumoVenta);
    }//GEN-LAST:event_txt_cantidadInsumoVentaKeyPressed

    //Evento para sacar subtotal en Pre-Compra
    private void btn_agregarInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarInsumoVentaActionPerformed
        try {
            ((DefaultTableModel) tbl_listaInsumoVenta.getModel()).addRow(new String[]{(tbl_listaInsumoConsultVentas.getValueAt(tbl_listaInsumoConsultVentas.getSelectedRow(), 0).toString()),
                txt_nombreInsumoVenta.getText(), txt_cantidadInsumoVenta.getText(), (Integer.parseInt(txt_cantidadInsumoVenta.getText()) * Insumco.getLista_Insumos().get(Integer.parseInt(tbl_listaInsumoConsultVentas.getValueAt(tbl_listaInsumoConsultVentas.getSelectedRow(), 0).toString())).getPrecio()) + ""});
            BorrarInsumoPreCompra_txt(txt_nombreInsumoVenta, txt_cantidadInsumoVenta, txt_pagoClientInsumoVenta, chbx_selecInsumoVenta);
            comprarInsumoVenta_btn.setEnabled(true);
            cancelarInsumoVenta_btn.setEnabled(true);
            txt_cantidadInsumoVenta.setEnabled(false);
            SelecTable(tbl_listaInsumoConsultVentas, chbx_selecInsumoConsultVenta, btn_agregarInsumoVenta, false);
            TotalPreCompra(tbl_listaInsumoVenta, 3, txt_totalProdInsumoVenta, "Total de la venta:");
            txt_pagoClientInsumoVenta.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        }

    }//GEN-LAST:event_btn_agregarInsumoVentaActionPerformed

    private void retirarInsumoVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarInsumoVenta_btnActionPerformed
        try {
            if (ConfirmDialog("¿Estas seguro que desea retirar este item?")) {
                JOptionPane.showMessageDialog(null, "Se ha retirado el item correctamente", "Retirado", 1);
                ((DefaultTableModel) tbl_listaInsumoVenta.getModel()).removeRow(tbl_listaInsumoVenta.getSelectedRow());
                TotalPreCompra(tbl_listaInsumoVenta, 3, txt_totalProdInsumoVenta, "Total de la venta:");
                BorrarInsumoPreCompra_txt(txt_nombreInsumoVenta, txt_cantidadInsumoVenta, txt_pagoClientInsumoVenta, chbx_selecInsumoVenta);
                if (tbl_listaInsumoVenta.getRowCount() <= 0) {
                    cancelarInsumoVenta_btn.doClick();
                }
                retirarInsumoVenta_btn.setEnabled(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar", "Error", 0);
        }
    }//GEN-LAST:event_retirarInsumoVenta_btnActionPerformed

    //Metodo del boton de presupuestar los insumos
    private void comprarInsumoVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarInsumoVenta_btnActionPerformed
        try {
            double Total = TotalPreCompra(tbl_listaInsumoVenta, 3, txt_totalProdInsumoVenta, "Total de la venta:");
            if (Double.parseDouble(txt_pagoClientInsumoVenta.getText()) < Total) {
                JOptionPane.showMessageDialog(null, "Verifique el pago ingresado", "Error", 0);
            } else {
                ArrayList<Insumo> Get = new ArrayList<Insumo>();
                System.err.println(Insumco.getLista_Insumos().get(0).getCantidad());
                for (int i = 0; i < tbl_listaInsumoVenta.getRowCount(); i++) {
                    Insumo H = Insumco.Get_Insumo(Integer.parseInt(tbl_listaInsumoVenta.getValueAt(i, 0).toString()));
                    Get.add(new Insumo(H.getId(), H.getNombre(), H.getPrecio(), H.getProveedor(),
                            Integer.parseInt(tbl_listaInsumoVenta.getValueAt(i, 2).toString()), H.getUnidad()));
                }
                InsuFactCo.Create(new FacturaInsumo(UUID.randomUUID().toString(), Calendar.getInstance(),
                        Total, Double.parseDouble(txt_pagoClientInsumoVenta.getText()), Get));
                Listar((DefaultTableModel) tbl_listaInsumoVenta.getModel(), new ArrayList());
                cancelarInsumoVenta_btn.doClick();
                GrafCo.Create(Graficar("Insumos Mas Comprados", "Insumos", "Cantidades", InsuFactCo.MayoresVendidos(Calendar.getInstance()), 0, true));
                GrafCo.Create(Graficar("Insumos Menos Comprados", "Insumos", "Cantidades", InsuFactCo.MenoresVendidos(Calendar.getInstance()), 1, true));
                GrafCo.Create(Graficar("Insumos Con Mayores Inversiónes", "Insumos", "Inversiónes", InsuFactCo.MayoresGanancias(Calendar.getInstance()), 2, false));
                GrafCo.Create(Graficar("Insumos Con Menores Inversiónes", "Insumos", "Inversiónes", InsuFactCo.MenoresGanancias(Calendar.getInstance()), 3, false));
                JOptionPane.showMessageDialog(null, "Los items han sido presupuestado", "Presupuestado", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error vuelva a intentar o verifique los datos", "Error", 0);
        }
    }//GEN-LAST:event_comprarInsumoVenta_btnActionPerformed

    private void cancelarInsumoVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInsumoVenta_btnActionPerformed
        //Bucle para borrar datos de la lista "tbl_listaInsumoVenta"
        Listar((DefaultTableModel) tbl_listaInsumoVenta.getModel(), new ArrayList());
        BorrarInsumoPreCompra_txt(txt_nombreInsumoVenta, txt_cantidadInsumoVenta, txt_pagoClientInsumoVenta, chbx_selecInsumoVenta);
        EnabledBtn(btn_agregarInsumoVenta, retirarInsumoVenta_btn, cancelarInsumoVenta_btn, false);
        txt_pagoClientInsumoVenta.setEnabled(false);
        comprarInsumoVenta_btn.setEnabled(false);
        txt_totalProdInsumoVenta.setText("Total de la venta: 0.0");
    }//GEN-LAST:event_cancelarInsumoVenta_btnActionPerformed

    //Evento Enter
    private void txt_pagoClientInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pagoClientInsumoVentaKeyPressed
        EventoEnter(evt, comprarInsumoVenta_btn);
    }//GEN-LAST:event_txt_pagoClientInsumoVentaKeyPressed

    private void txt_totalProdInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalProdInsumoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalProdInsumoVentaActionPerformed

    private void btn_cancelarBusquedaInsumoVentamodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaInsumoVentamodificarPan
        Listar((DefaultTableModel) tbl_listaInsumoConsultVentas.getModel(), Insumco.ReadAll());
        btn_cancelarBusquedaInsumoVenta.setEnabled(false);
        txt_nombreInsumoConsultVenta.setText(null);
    }//GEN-LAST:event_btn_cancelarBusquedaInsumoVentamodificarPan

    //Guardar Cantidades Producto
    private void btn_GuardarEditCantidadmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarEditCantidadmodificarPan
        try {
            if (Integer.parseInt(txt_CantidadProd.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Por digite numeros mayores a 0", "Error", 0);
            } else {
                int[] Index = new int[tbl_listaProdSelectCantidad.getRowCount()];
                for (int i = 0; i < Index.length; i++) {
                    Index[i] = Integer.parseInt(tbl_listaProdSelectCantidad.getValueAt(i, 0).toString());
                }
                Proco.UpateCantidad(Index, Integer.parseInt(txt_CantidadProd.getText()));
                btn_cancelarEditProdCantidad.doClick();
                Listar((DefaultTableModel) tbl_listaProdCantidad.getModel(), Proco.ReadVenta());
                JOptionPane.showMessageDialog(null, "Se han modificado la cantidad", "Error", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor digite solo valores numericos", "Error", 0);
        }
    }//GEN-LAST:event_btn_GuardarEditCantidadmodificarPan

    //Evento para cuando se selecciona un producto de las cantidades
    private void tbl_listaProdCantidadselecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaProdCantidadselecProdModif_tbl
        try {
            ArrayList<String[]> Get = new ArrayList<String[]>();
            for (int i = 0; i < tbl_listaProdCantidad.getSelectedRows().length; i++) {
                Get.add(new String[]{listaPanesEdit_tbl.getValueAt(tbl_listaProdCantidad.getSelectedRows()[i], 0).toString(),
                    tbl_listaProdCantidad.getValueAt(tbl_listaProdCantidad.getSelectedRows()[i], 1).toString(),
                    tbl_listaProdCantidad.getValueAt(tbl_listaProdCantidad.getSelectedRows()[i], 2).toString(),
                    tbl_listaProdCantidad.getValueAt(tbl_listaProdCantidad.getSelectedRows()[i], 3).toString()});
            }
            Listar((DefaultTableModel) tbl_listaProdSelectCantidad.getModel(), Get);
            EnabledBtn(btn_EditProdCantidad, btn_GuardarEditCantidad, btn_cancelarEditProdCantidad, true);
            EnabledMod(btn_EditProdCantidad, btn_GuardarEditCantidad, false);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbl_listaProdCantidadselecProdModif_tbl

    //Evento para la tabla de la cantidad
    private void tbl_listaProdCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_listaProdCantidadKeyPressed
        if (evt.getKeyChar() == ENTER || evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            tbl_listaProdCantidadselecProdModif_tbl(null);
        }
    }//GEN-LAST:event_tbl_listaProdCantidadKeyPressed

    //Evento del enter para guardar la cantidad del producto
    private void txt_CantidadProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadProdKeyPressed
        EventoEnter(evt, btn_GuardarEditCantidad);
    }//GEN-LAST:event_txt_CantidadProdKeyPressed

    private void txt_nombreProdConsultCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProdConsultCantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProdConsultCantidadKeyPressed

    private void btn_consultProdCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultProdCantidadActionPerformed
        BuscarAll(txt_nombreProdConsultCantidad.getText().toUpperCase(), tbl_listaProdCantidad, Proco.Read(txt_nombreProdConsultCantidad.getText().toUpperCase()), btn_cancelarBusqProdCantidad);
    }//GEN-LAST:event_btn_consultProdCantidadActionPerformed

    //Modificar Cantidad Producto
    private void btn_EditProdCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditProdCantidadActionPerformed
        txt_CantidadProd.setEnabled(true);
        EnabledMod(btn_EditProdCantidad, btn_GuardarEditCantidad, true);
    }//GEN-LAST:event_btn_EditProdCantidadActionPerformed

    //Cancelar Modificar CANTIDAD PRODUCTO
    private void btn_cancelarEditProdCantidadmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarEditProdCantidadmodificarPan
        txt_CantidadProd.setText(null);
        txt_CantidadProd.setEnabled(false);
        Listar((DefaultTableModel) tbl_listaProdSelectCantidad.getModel(), new ArrayList());
        EnabledBtn(btn_EditProdCantidad, btn_GuardarEditCantidad, btn_cancelarEditProdCantidad, false);
    }//GEN-LAST:event_btn_cancelarEditProdCantidadmodificarPan

    private void btn_cancelarBusqProdCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusqProdCantidadActionPerformed
        Listar((DefaultTableModel) tbl_listaProdCantidad.getModel(), Proco.ReadAll());
        txt_nombreProdConsultCantidad.setText(null);
        btn_cancelarBusqProdCantidad.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarBusqProdCantidadActionPerformed

    private void tbl_listaProdSelectCantidadselecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaProdSelectCantidadselecProdModif_tbl
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_listaProdSelectCantidadselecProdModif_tbl

    private void tbl_listaProdSelectCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_listaProdSelectCantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_listaProdSelectCantidadKeyPressed

    private void txt_nombreProdConsultCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProdConsultCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProdConsultCantidadActionPerformed

    //Evento Del Enter para el combobox registrar producto
    private void provePanReg_cmbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provePanReg_cmbxKeyPressed
        EventoEnter(evt, registrarPan_btn);
    }//GEN-LAST:event_provePanReg_cmbxKeyPressed

    //Evento Del Enter para el boton registrar producto
    private void registrarPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarPan_btnKeyPressed
        EventoEnter(evt, registrarPan_btn);
    }//GEN-LAST:event_registrarPan_btnKeyPressed

    //Evento dele enter para el guardar modificar producto
    private void provePanEdit_cmbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provePanEdit_cmbxKeyPressed
        EventoEnter(evt, GuardarEditPan_btn);
    }//GEN-LAST:event_provePanEdit_cmbxKeyPressed

    //Evento del enter para el boton edit pan
    private void EditPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EditPan_btnKeyPressed
        EventoEnter(evt, EditPan_btn);
    }//GEN-LAST:event_EditPan_btnKeyPressed

    //Evento del enter para el boton del cancelar modificar producto
    private void cancelarEditPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarEditPan_btnKeyPressed
        EventoEnter(evt, cancelarEditPan_btn);
    }//GEN-LAST:event_cancelarEditPan_btnKeyPressed

    //evento del enter para el modificar el producto guardar
    private void GuardarEditPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GuardarEditPan_btnKeyPressed
        EventoEnter(evt, GuardarEditPan_btn);
    }//GEN-LAST:event_GuardarEditPan_btnKeyPressed

    //Evento del enter para el cancelar busqueda boton
    private void cancelarBusqProd_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarBusqProd_btnKeyPressed
        EventoEnter(evt, cancelarBusqProd_btn);
    }//GEN-LAST:event_cancelarBusqProd_btnKeyPressed

    //Evento del enter para el consultar en el modificar producto
    private void consultPanEdit_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultPanEdit_btnKeyPressed
        EventoEnter(evt, consultPanEdit_btn);
    }//GEN-LAST:event_consultPanEdit_btnKeyPressed

    //Evento del enter para el cancelar consultar  productos
    private void cancelarBusquedaProd_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarBusquedaProd_btnKeyPressed
        EventoEnter(evt, cancelarBusquedaProd_btn);
    }//GEN-LAST:event_cancelarBusquedaProd_btnKeyPressed

    //Evento del enter para el consultar producto
    private void consultPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultPan_btnKeyPressed
        EventoEnter(evt, consultPan_btn);
    }//GEN-LAST:event_consultPan_btnKeyPressed

    //Evento del enter para el eliminar producto
    private void consultPanEliminar_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultPanEliminar_btnKeyPressed
        EventoEnter(evt, consultPanEliminar_btn);
    }//GEN-LAST:event_consultPanEliminar_btnKeyPressed

    //Evento enter para cancelar eliminacion de los productos
    private void cancelarElimProd_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarElimProd_btnKeyPressed
        EventoEnter(evt, cancelarElimProd_btn);
    }//GEN-LAST:event_cancelarElimProd_btnKeyPressed

    //Evento para la eliminacion de los productos
    private void eliminarPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminarPan_btnKeyPressed
        EventoEnter(evt, eliminarPan_btn);
    }//GEN-LAST:event_eliminarPan_btnKeyPressed

    //Evento del enter para el editar cantidad
    private void btn_EditProdCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EditProdCantidadKeyPressed
        EventoEnter(evt, btn_EditProdCantidad);
    }//GEN-LAST:event_btn_EditProdCantidadKeyPressed

    //Evento del enter para el cancelar de la cantidad
    private void btn_cancelarEditProdCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarEditProdCantidadKeyPressed
        EventoEnter(evt, btn_cancelarEditProdCantidad);
    }//GEN-LAST:event_btn_cancelarEditProdCantidadKeyPressed

    //Evento del enter para el btn de la cantidad guardar
    private void btn_GuardarEditCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_GuardarEditCantidadKeyPressed
        EventoEnter(evt, btn_GuardarEditCantidad);
    }//GEN-LAST:event_btn_GuardarEditCantidadKeyPressed

    //Evento del eneter para el cancelar cantidad busqueda
    private void btn_cancelarBusqProdCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarBusqProdCantidadKeyPressed
        EventoEnter(evt, btn_cancelarBusqProdCantidad);
    }//GEN-LAST:event_btn_cancelarBusqProdCantidadKeyPressed

    //Evento del enter pata el busqueda de la cantidad
    private void btn_consultProdCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_consultProdCantidadKeyPressed
        EventoEnter(evt, btn_consultProdCantidad);
    }//GEN-LAST:event_btn_consultProdCantidadKeyPressed

    //Evento del enter para el eliminar productos
    private void listaPanesEliminar_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPanesEliminar_tblKeyPressed
        if (evt.getKeyChar() == ENTER) {
            listaPanesEliminar_tblselecProdEliminar_tbl(null);
        }
    }//GEN-LAST:event_listaPanesEliminar_tblKeyPressed

    //Evento del enter para el registrar proveedor
    private void registrarProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarProv_btnKeyPressed
        EventoEnter(evt, registrarProv_btn);
    }//GEN-LAST:event_registrarProv_btnKeyPressed

    //Evento del enter para el eeditar proveedor
    private void EditProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EditProv_btnKeyPressed
        EventoEnter(evt, EditProv_btn);
    }//GEN-LAST:event_EditProv_btnKeyPressed

    //Evento del enter para el guardar proveedor edit
    private void GuardarEditProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GuardarEditProv_btnKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_GuardarEditProv_btnKeyPressed

    //Evento del cancelar para el modificar proveedor
    private void cancelarEditProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarEditProv_btnKeyPressed
        EventoEnter(evt, cancelarEditProv_btn);
    }//GEN-LAST:event_cancelarEditProv_btnKeyPressed

    //Evento del cancelar consultar en el modifciar proveedor
    private void cancelarBusqPov_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarBusqPov_btnKeyPressed
        EventoEnter(evt, cancelarBusqPov_btn);
    }//GEN-LAST:event_cancelarBusqPov_btnKeyPressed

    //Evento de consulta en el modificar proveedor
    private void consultProvEdit_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultProvEdit_btnKeyPressed
        EventoEnter(evt, consultProvEdit_btn);
    }//GEN-LAST:event_consultProvEdit_btnKeyPressed

    //Evento dek consultar proveedor
    private void consultProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultProv_btnKeyPressed
        EventoEnter(evt, consultProv_btn);
    }//GEN-LAST:event_consultProv_btnKeyPressed

    //Evento del cancelar consulta proveedor
    private void cancelarBusquedaProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarBusquedaProv_btnKeyPressed
        EventoEnter(evt, cancelarBusquedaProv_btn);
    }//GEN-LAST:event_cancelarBusquedaProv_btnKeyPressed

    //Evento dle enter en el eliminar proveedor
    private void EliminarProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EliminarProv_btnKeyPressed
        EventoEnter(evt, EliminarProv_btn);
    }//GEN-LAST:event_EliminarProv_btnKeyPressed

    //Evento del enter en el cancelar proveedor
    private void cancelarElimProv_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarElimProv_btnKeyPressed
        EventoEnter(evt, cancelarElimProv_btn);
    }//GEN-LAST:event_cancelarElimProv_btnKeyPressed

    //Evento del enter en el consult proveedor
    private void consultProvEliminar_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultProvEliminar_btnKeyPressed
        EventoEnter(evt, consultProvEliminar_btn);
    }//GEN-LAST:event_consultProvEliminar_btnKeyPressed

    //Evento del enter para registrar insumo
    private void cmbx_proveInsumoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbx_proveInsumoRegKeyPressed
        EventoEnter(evt, btn_registrarInsumo);
    }//GEN-LAST:event_cmbx_proveInsumoRegKeyPressed

    //Evento del enter registrar insumo
    private void cmbx_unidadInsumoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbx_unidadInsumoRegKeyPressed
        EventoEnter(evt, btn_registrarInsumo);
    }//GEN-LAST:event_cmbx_unidadInsumoRegKeyPressed

    //Evento del enter registrar insumos
    private void btn_registrarInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_registrarInsumoKeyPressed
        EventoEnter(evt, btn_registrarInsumo);
    }//GEN-LAST:event_btn_registrarInsumoKeyPressed

    //Evento para actualizar el panel de los insumos
    private void InsumosContStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_InsumosContStateChanged
        try {
            ActualizarPanelCrud(txt_nombreInsumoReg, txt_nombreInsumoConsultEdit, txt_nombreInsumoConsultVenta, txt_nombreInsumoReg, InsumosCont);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_InsumosContStateChanged

    //Evento del enter para el modificar insumos
    private void cmbx_proveInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbx_proveInsumoEditKeyPressed
        EventoEnter(evt, btn_GuardarEditInsumo);
    }//GEN-LAST:event_cmbx_proveInsumoEditKeyPressed

    //Evento del enter insumos modificar
    private void cmbx_unidadInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbx_unidadInsumoEditKeyPressed
        EventoEnter(evt, btn_GuardarEditInsumo);
    }//GEN-LAST:event_cmbx_unidadInsumoEditKeyPressed

    //Evento del enter
    private void btn_EditInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EditInsumoKeyPressed
        EventoEnter(evt, btn_EditInsumo);
    }//GEN-LAST:event_btn_EditInsumoKeyPressed
    //Evento del enter
    private void btn_cancelarEditInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarEditInsumoKeyPressed
        EventoEnter(evt, btn_cancelarEditInsumo);
    }//GEN-LAST:event_btn_cancelarEditInsumoKeyPressed

    //EVENTO DEL ENTER
    private void btn_GuardarEditInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_GuardarEditInsumoKeyPressed
        EventoEnter(evt, btn_GuardarEditInsumo);
    }//GEN-LAST:event_btn_GuardarEditInsumoKeyPressed

    //Evento del enter
    private void btn_EliminarEditInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EliminarEditInsumoKeyPressed
        EventoEnter(evt, btn_EliminarEditInsumo);
    }//GEN-LAST:event_btn_EliminarEditInsumoKeyPressed

    //Evento del enter
    private void btn_cancelBusqInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelBusqInsumoEditKeyPressed
        EventoEnter(evt, btn_cancelBusqInsumoEdit);
    }//GEN-LAST:event_btn_cancelBusqInsumoEditKeyPressed

    //Evento del enter
    private void btn_consultInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_consultInsumoEditKeyPressed
        EventoEnter(evt, btn_consultInsumoEdit);
    }//GEN-LAST:event_btn_consultInsumoEditKeyPressed

    private void tbl_listaInsumosRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaInsumosRegMouseClicked

    }//GEN-LAST:event_tbl_listaInsumosRegMouseClicked

    //Evento del enter
    private void consultPanVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultPanVenta_btnKeyPressed
        EventoEnter(evt, consultPanVenta_btn);
    }//GEN-LAST:event_consultPanVenta_btnKeyPressed

    //Evento del enter
    private void cancelarBusquedaPan_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarBusquedaPan_btnKeyPressed
        EventoEnter(evt, cancelarBusquedaPan_btn);
    }//GEN-LAST:event_cancelarBusquedaPan_btnKeyPressed

    //Evento del enter ventas
    private void listaProdConsultVentas_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProdConsultVentas_tblKeyPressed
        if (evt.getKeyChar() == ENTER) {
            listaProdConsultVentas_tblMouseClicked(null);
        }
    }//GEN-LAST:event_listaProdConsultVentas_tblKeyPressed

    //Evento del enter
    private void tbl_listaProdCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_listaProdCantidadKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_SHIFT) {
            tbl_listaProdCantidadselecProdModif_tbl(null);
        }
    }//GEN-LAST:event_tbl_listaProdCantidadKeyReleased

    //Evento del enter
    private void agregarProdVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarProdVenta_btnKeyPressed
        EventoEnter(evt, agregarProdVenta_btn);
    }//GEN-LAST:event_agregarProdVenta_btnKeyPressed

    //Evento Del enter
    private void retirarProdVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retirarProdVenta_btnKeyPressed
        EventoEnter(evt, retirarProdVenta_btn);
    }//GEN-LAST:event_retirarProdVenta_btnKeyPressed

    //Evento del enter
    private void comprarVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comprarVenta_btnKeyPressed
        EventoEnter(evt, comprarVenta_btn);
    }//GEN-LAST:event_comprarVenta_btnKeyPressed

    //Evento enter
    private void cancelarVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarVenta_btnKeyPressed
        EventoEnter(evt, cancelarVenta_btn);
    }//GEN-LAST:event_cancelarVenta_btnKeyPressed

    //Evento enter
    private void tbl_listaInsumoConsultVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_listaInsumoConsultVentasKeyPressed
        if (evt.getKeyChar() == ENTER) {
            tbl_listaInsumoConsultVentasMouseClicked(null);
        }
    }//GEN-LAST:event_tbl_listaInsumoConsultVentasKeyPressed

    //Evento enter
    private void tbl_listaInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_listaInsumoVentaKeyPressed
        if (evt.getKeyChar() == ENTER) {
            tbl_listaInsumoVentaMouseClicked(null);
        }
    }//GEN-LAST:event_tbl_listaInsumoVentaKeyPressed

    //Evento enter
    private void btn_cancelarBusquedaInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaInsumoVentaKeyPressed
        EventoEnter(evt, btn_cancelarBusquedaInsumoVenta);
    }//GEN-LAST:event_btn_cancelarBusquedaInsumoVentaKeyPressed

    //Evento Enter
    private void btn_consultInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_consultInsumoVentaKeyPressed
        EventoEnter(evt, btn_consultInsumoVenta);
    }//GEN-LAST:event_btn_consultInsumoVentaKeyPressed

    //Evento enter
    private void btn_agregarInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_agregarInsumoVentaKeyPressed
        EventoEnter(evt, btn_agregarInsumoVenta);
    }//GEN-LAST:event_btn_agregarInsumoVentaKeyPressed

    //Evento Enter
    private void retirarInsumoVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retirarInsumoVenta_btnKeyPressed
        EventoEnter(evt, retirarInsumoVenta_btn);
    }//GEN-LAST:event_retirarInsumoVenta_btnKeyPressed

    //Evento Enter
    private void comprarInsumoVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comprarInsumoVenta_btnKeyPressed
        EventoEnter(evt, comprarInsumoVenta_btn);
    }//GEN-LAST:event_comprarInsumoVenta_btnKeyPressed

    //Evento Enter
    private void cancelarInsumoVenta_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarInsumoVenta_btnKeyPressed
        EventoEnter(evt, cancelarInsumoVenta_btn);
    }//GEN-LAST:event_cancelarInsumoVenta_btnKeyPressed

    private void btn_cancelarBusquedaProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaProductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarBusquedaProductoKeyPressed

    //Cancelar buscar Producto
    private void btn_cancelarBusquedaProductomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaProductomodificarPan
        btn_cancelarBusquedaProducto.setEnabled(false);
        Contenedor_StastStateChanged(null);
    }//GEN-LAST:event_btn_cancelarBusquedaProductomodificarPan

    //Metodo buscar graficas
    private void btn_ConsultProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultProductoActionPerformed
        GraficarProductos(Date_ConsultProducto.getSelectedDate());
        btn_cancelarBusquedaProducto.setEnabled(true);
    }//GEN-LAST:event_btn_ConsultProductoActionPerformed

    //Evento enter
    private void btn_cancelarBusquedaHistoCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaHistoCompraKeyPressed
        EventoEnter(evt, btn_cancelarBusquedaHistoCompra);
    }//GEN-LAST:event_btn_cancelarBusquedaHistoCompraKeyPressed

    //Cancelar busqueda
    private void btn_cancelarBusquedaHistoCompramodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaHistoCompramodificarPan
        Listar((DefaultTableModel) tbl_HistoCompra.getModel(), InsuFactCo.ReadAll());
        Listar((DefaultTableModel) tbl_HistoComprasFact.getModel(), new ArrayList());
        SelecTable(tbl_HistoCompra, chbx_selecHistoCompra, btn_cancelarBusquedaHistoCompra, false);
    }//GEN-LAST:event_btn_cancelarBusquedaHistoCompramodificarPan

    //Buscar Historial de compras
    private void btn_ConsultHistoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultHistoCompraActionPerformed
        BuscarDate(tbl_HistoCompra, InsuFactCo.Read(Date_DesdeHistoCompra.getSelectedDate(), Date_HastaHistoCompra.getSelectedDate()), btn_cancelarBusquedaHistoCompra);
    }//GEN-LAST:event_btn_ConsultHistoCompraActionPerformed

    //Eliminar Compra
    private void btn_EliminarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarCompraActionPerformed
        try {
            if (ConfirmDialog("¿Esta seguro de querer eliminar este item?")) {
                InsuFactCo.Delete(Integer.parseInt(IndexTable.toString()));
                SelecTable(tbl_HistoCompra, chbx_selecHistoCompra, btn_EliminarCompra, false);
                Listar((DefaultTableModel) tbl_HistoCompra.getModel(), InsuFactCo.ReadAll());
                Listar((DefaultTableModel) tbl_HistoComprasFact.getModel(), new ArrayList());
                JOptionPane.showMessageDialog(null, "El item ha sido eliminado satisfactoriamente", "Eliminado", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error, digite de nuevo", "Error", 0);
        }
    }//GEN-LAST:event_btn_EliminarCompraActionPerformed

    //Evento mouse
    private void tbl_HistoCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HistoCompraMouseClicked
        try {
            Listar((DefaultTableModel) tbl_HistoComprasFact.getModel(),
                    InsuFactCo.ReadSelect(Integer.parseInt(tbl_HistoCompra.getValueAt(tbl_HistoCompra.getSelectedRow(), 0).toString())));
            SelecTable(tbl_HistoCompra, chbx_selecHistoCompra, btn_EliminarCompra, true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbl_HistoCompraMouseClicked

    private void btn_cancelarBusquedaHistoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaHistoVentaKeyPressed
        EventoEnter(evt, btn_cancelarBusquedaHistoVenta);
    }//GEN-LAST:event_btn_cancelarBusquedaHistoVentaKeyPressed

    //Cancelar Busqieda
    private void btn_cancelarBusquedaHistoVentamodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaHistoVentamodificarPan
        Listar((DefaultTableModel) tbl_HistoVenta.getModel(), ProduFactCo.ReadAll());
        Listar((DefaultTableModel) tbl_HistoVentasFact.getModel(), new ArrayList());
        SelecTable(tbl_HistoVenta, chbx_selecHistoVenta, btn_cancelarBusquedaHistoVenta, false);
    }//GEN-LAST:event_btn_cancelarBusquedaHistoVentamodificarPan

    private void btn_ConsultHistoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultHistoVentaActionPerformed
      BuscarDate(tbl_HistoVenta, ProduFactCo.Read(Date_DesdeHistoVentas.getSelectedDate(), Date_HastaHistoVentas.getSelectedDate()), btn_cancelarBusquedaHistoVenta);
    }//GEN-LAST:event_btn_ConsultHistoVentaActionPerformed

    //Eliminar Venta
    private void btn_EliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarVentaActionPerformed
        try {
            if (ConfirmDialog("¿Esta seguro de querer eliminar este item?")) {
                ProduFactCo.Delete(Integer.parseInt(IndexTable.toString()));
                SelecTable(tbl_HistoVenta, chbx_selecHistoVenta, btn_EliminarVenta, false);
                Listar((DefaultTableModel) tbl_HistoVenta.getModel(), ProduFactCo.ReadAll());
                Listar((DefaultTableModel) tbl_HistoVentasFact.getModel(), new ArrayList());
                JOptionPane.showMessageDialog(null, "El item ha sido eliminado satisfactoriamente", "Eliminado", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error, digite de nuevo", "Error", 0);
        }
    }//GEN-LAST:event_btn_EliminarVentaActionPerformed

    //Eventos del mouse
    private void tbl_HistoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HistoVentaMouseClicked
        try {
            Listar((DefaultTableModel) tbl_HistoVentasFact.getModel(),
                    ProduFactCo.ReadSelect(Integer.parseInt(tbl_HistoVenta.getValueAt(tbl_HistoVenta.getSelectedRow(), 0).toString())));
            SelecTable(tbl_HistoVenta, chbx_selecHistoVenta, btn_EliminarVenta, true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_tbl_HistoVentaMouseClicked

    //Buscar Grafica Insumos
    private void btn_ConsultInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultInsumoActionPerformed
        GraficarInsumos(Date_ConsultInsumo.getSelectedDate());
        btn_cancelarBusquedaInsumo.setEnabled(true);
    }//GEN-LAST:event_btn_ConsultInsumoActionPerformed

    //Cancelar El buscar Grafica insumo
    private void btn_cancelarBusquedaInsumomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaInsumomodificarPan
        btn_cancelarBusquedaInsumo.setEnabled(false);
        Contenedor_StastStateChanged(null);
    }//GEN-LAST:event_btn_cancelarBusquedaInsumomodificarPan

    private void btn_cancelarBusquedaInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaInsumoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarBusquedaInsumoKeyPressed

    //Evento enter
    private void tbl_HistoCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_HistoCompraKeyPressed
        if (evt.getKeyChar() == ENTER) {
            tbl_HistoCompraMouseClicked(null);
        }
    }//GEN-LAST:event_tbl_HistoCompraKeyPressed

    //Evento enter
    private void btn_EliminarCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_EliminarCompraKeyPressed
        EventoEnter(evt, btn_EliminarCompra);
    }//GEN-LAST:event_btn_EliminarCompraKeyPressed

    //Evento enter
    private void btn_ConsultHistoCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ConsultHistoCompraKeyPressed
        EventoEnter(evt, btn_ConsultHistoCompra);
    }//GEN-LAST:event_btn_ConsultHistoCompraKeyPressed

    //Evento de actualizar estadistica
    private void Contenedor_StastStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Contenedor_StastStateChanged
        try {
            switch (Contenedor_Stast.getSelectedIndex()) {
                case 2:
                    GraficarProductos(Calendar.getInstance());
                    break;
                case 3:
                    GraficarInsumos(Calendar.getInstance());
                    break;
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_Contenedor_StastStateChanged
    //Evento Solo numero en los txtfield
    private void precioPanReg_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPanReg_txtKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_precioPanReg_txtKeyTyped
    //Evento Solo numero en los txtfield
    private void precioPanEdit_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPanEdit_txtKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_precioPanEdit_txtKeyTyped
    //Evento Solo numero en los txtfield
    private void txt_CantidadProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CantidadProdKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_txt_CantidadProdKeyTyped
    //Evento Solo numero en los txtfield
    private void nitProvReg_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProvReg_txtKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_nitProvReg_txtKeyTyped
    //Evento Solo numero en los txtfield
    private void nitProvEdit_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProvEdit_txtKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_nitProvEdit_txtKeyTyped
    //Evento Solo numero en los txtfield
    private void txt_precioInsumoRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioInsumoRegKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_txt_precioInsumoRegKeyTyped
    //Evento Solo numero en los txtfield
    private void txt_precioInsumoEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioInsumoEditKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_txt_precioInsumoEditKeyTyped
    //Evento Solo numero en los txtfield
    private void txt_cantidadInsumoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadInsumoVentaKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_txt_cantidadInsumoVentaKeyTyped
    //Evento Solo numero en los txtfield
    private void cantidadProdVenta_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProdVenta_txtKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_cantidadProdVenta_txtKeyTyped
    //evento para cerrar seccion
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int close = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea Cerrar?", "Exit", close);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //Evento type
    private void txt_pagoClientInsumoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pagoClientInsumoVentaKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_txt_pagoClientInsumoVentaKeyTyped

    //Evento del type
    private void txt_PagoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PagoVentaKeyTyped
        ValTexfieldSNum(evt);
    }//GEN-LAST:event_txt_PagoVentaKeyTyped

    //Evento enter
    private void tbl_HistoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_HistoVentaKeyPressed
        if (evt.getKeyChar() == ENTER) {
            tbl_HistoVentaMouseClicked(null);
        }
    }//GEN-LAST:event_tbl_HistoVentaKeyPressed

    //Evento enter
    private void listaProdVenta_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProdVenta_tblKeyPressed
        if (evt.getKeyChar() == ENTER) {
            listaProdVenta_tblMouseClicked(null);
        }
    }//GEN-LAST:event_listaProdVenta_tblKeyPressed

    //Metodo para actualizar paneles que sean de tipo CRUD
    private void ActualizarPanelCrud(JTextField Create, JTextField Update, JTextField Read, JTextField Delete, JTabbedPane Panel) {
        switch (Panel.getSelectedIndex()) {
            case 0:
                Create.requestFocus();
                break;
            case 1:
                Update.requestFocus();
                break;
            case 2:
                Read.requestFocus();
                break;
            case 3:
                Delete.requestFocus();
                break;
        }
        ListAll();
    }

    //Este Metodo Sirve Para Validar Los Productos
    private boolean ValProducto(String Nombre, String Precio) {
        try {
            //valido si no hay algun error y retorno si es verdadero o falso
            if (Nombre.isEmpty() || Nombre == null || Double.parseDouble(Precio) == 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    //Metodo para validar los prveedores
    private boolean ValProveedor(String Nombre, String Telefono, String Nit, String Producto, String Direccion) {
        try {
            if (Nombre.isEmpty() || Nombre == null || Telefono.isEmpty() || Telefono == null || Nit.isEmpty() || Nit == null || Producto.isEmpty() || Producto == null || Direccion.isEmpty() || Direccion == null) {
                JOptionPane.showMessageDialog(null, "Hubo un error, rellene todos los campos.", "Error", 0);
                return false;
            } else {

                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error, digite de nuevo", "Error", 0);
            return false;
        }
    }

    //Metodo para validar texfield como numero
    private void ValTexfieldSNum(KeyEvent n) {
        char validar = n.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            n.consume();

            JOptionPane.showMessageDialog(null, "Solo se admiten numeros.", "Aviso", 1);
        }
    }

    public Boolean Val_Nit(String nit) {
        boolean valid = true;
        boolean valid1 = true;

        for (int i = 0; i < nit.length(); i++) {
            if (!Character.isDigit(nit.charAt(i))) {
                valid1 = false;
                valid = false;
                JOptionPane.showMessageDialog(null, "Caracter no valido: " + nit.charAt(i));
                break;
            }
        }
        if (valid1) {
            for (int i = 0; i < Proveeco.getLista_proovedor().size(); i++) {
                if (nit.equals(Proveeco.getLista_proovedor().get(i).getNIT())) {
                    valid = false;
                    JOptionPane.showMessageDialog(null, "NIT Existente");
                    break;
                }
            }
        }
        return valid;
    }

    //Este Metodo Sirve para listar todo
    private void ListAll() {
        Listar((DefaultTableModel) listaProdConsultVentas_tbl.getModel(), Proco.ReadVenta());
        Listar((DefaultTableModel) tbl_listaInsumoConsultVentas.getModel(), Insumco.ReadVenta());
        Listar((DefaultTableModel) tbl_listaInsumosReg.getModel(), Insumco.ReadAll());
        Listar((DefaultTableModel) tbl_listaInsumoEdit.getModel(), Insumco.ReadAll());
        Listar((DefaultTableModel) listaPanesReg_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaPanesEdit_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaPanesEliminar_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaPanesConsult_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaProdConsultVentas_tbl.getModel(), Proco.ReadVenta());
        Listar((DefaultTableModel) tbl_listaProdCantidad.getModel(), Proco.ReadVenta());
        Listar((DefaultTableModel) listaProveedorReg_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProveedoresEdit_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProvConsult_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProvEliminar_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) tbl_HistoCompra.getModel(), InsuFactCo.ReadAll());
        Listar((DefaultTableModel) tbl_HistoVenta.getModel(), ProduFactCo.ReadAll());
        ComboBoxList(provePanReg_cmbx, Proveeco.getLista_proovedor());
        ComboBoxList(provePanEdit_cmbx, Proveeco.getLista_proovedor());
        ComboBoxList(cmbx_proveInsumoReg, Proveeco.getLista_proovedor());
        ComboBoxList(cmbx_proveInsumoEdit, Proveeco.getLista_proovedor());
    }

    //Este Metodo Sirve Para Listar las Tablas
    private void Listar(DefaultTableModel Tabla, ArrayList<String[]> Lista) {
        //Elimino todas las filas
        while (Tabla.getRowCount() != 0) {
            Tabla.removeRow(0);
        }
        //Agrego las Filas
        for (String[] Row : Lista) {
            Tabla.addRow(Row);
        }
    }

    //Este metodo sirve para listar combobox
    private void ComboBoxList(JComboBox Cb, ArrayList<Proveedor> Array) {
        //Elimino todos los elementos del comobobox
        Cb.removeAllItems();
        //Agrego items Al combobox
        for (Proveedor Pro : Array) {
            Cb.addItem(Pro.getNombre());
        }
    }

    //Este metodo sirve para borrar texto en productos
    private void BorrarProducto_txt(JTextField Nombre, JTextField Precio, JComboBox Cb) {
        Nombre.setText(null);
        Precio.setText(null);
        Cb.setSelectedIndex(0);
    }

    //Este metodo sirve para borrar el texto en los insumos y poner los combobox en el index 0
    private void BorrarInsumo_txt(JTextField Nombre, JTextField Precio, JComboBox proveedor, JComboBox unidad) {
        Nombre.setText(null);
        Precio.setText(null);
        proveedor.setSelectedIndex(0);
        unidad.setSelectedIndex(0);
    }

    private void BorrarInsumoPreCompra_txt(JTextField Nombre, JTextField Cantidad, JTextField Pago, JCheckBox chbx_selecionado) {
        Nombre.setText(null);
        Cantidad.setText(null);
        Pago.setText(null);
        chbx_selecionado.setSelected(false);
    }

    //envento del enter
    private boolean EventoEnter(java.awt.event.KeyEvent evt, JButton boton) {
        if (evt.getKeyChar() == ENTER) {
            boton.doClick();
            return true;
        }
        return false;
    }

    //Metodo para buscar en todos las tablas
    private void BuscarAll(String Filter, JTable Tabla, ArrayList Array, JButton Cancelar) {
        //Valido la entrada del buscar
        if (Filter.isEmpty() || Filter == null) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        } else if (Array.size() <= 0 || Array == null) {
            JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "No se han encontrado", 1);
        } else {
            Listar((DefaultTableModel) Tabla.getModel(), Array);
            Cancelar.setEnabled(true);
        }
    }

    //Metodo para buscar con fechas
    private void BuscarDate(JTable Tabla, ArrayList Array, JButton Cancelar) {
        if (Array.size() <= 0 || Array == null) {
            JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "No se han encontrado", 1);
        } else {
            Listar((DefaultTableModel) Tabla.getModel(), Array);
            Cancelar.setEnabled(true);
        }
    }

    //Metodo para habilitar o deshabilitar los botones del modificar
    private void EnabledBtn(JButton Mod, JButton Save, JButton Cancel, boolean Cond) {
        Mod.setEnabled(Cond);
        Save.setEnabled(Cond);
        Cancel.setEnabled(Cond);
    }

    //Metodo para habilitar o deshabilitar los botones, Combobox y txtField del modificar
    private void EnabledTxt_Insumo(JTextField txtNNombre, JTextField txtNPrecio, JComboBox cmbxNProveedor, JComboBox cmbxNUnidad, boolean Cond) {
        txtNNombre.setEnabled(Cond);
        txtNPrecio.setEnabled(Cond);
        cmbxNProveedor.setEnabled(Cond);
        cmbxNUnidad.setEnabled(Cond);
    }

    //Metodo para habilitar o deshabilitar los Jtextfield del modificar producto
    private void EnabledTxt_Producto(JTextField Nombre, JTextField Precio, JComboBox Cb, boolean Cond) {
        Nombre.setEnabled(Cond);
        Precio.setEnabled(Cond);
        Cb.setEnabled(Cond);
    }

    //Metodo para habilitar o desbailitar los Jtextfields y JButtons de las Ventas
    public void HabilitarTXT_BTN_Agregar_Venta(JTextField cantidad, JButton comprar, boolean Cond) {
        cantidad.setEnabled(!Cond);
        comprar.setEnabled(Cond);
    }

    //Metodo para habilitar o deshabilitar los Jtextfield del modificar Proveedor
    private void EnabledTxt_Proveedor(JTextField Nombre, JTextField Telefono, JTextField Nit, JTextField Producto, JTextField Direccion, boolean Cond) {
        Nombre.setEnabled(Cond);
        Telefono.setEnabled(Cond);
        Nit.setEnabled(Cond);
        Producto.setEnabled(Cond);
        Direccion.setEnabled(Cond);
    }

    //Metodo para cuando seleccione un elemento de una tabla y asi mismo cuando termina el proceso
    private void SelecTable(JTable Tabla, JCheckBox Check, JButton Boton, boolean Cond) {
        if (IndexTable == null || Cond == false) {
            Check.setSelected(Cond);
            Boton.setEnabled(Cond);
        }
        if (Cond) {
            IndexTable = Integer.parseInt(Tabla.getValueAt(Tabla.getSelectedRow(), 0).toString());
        } else {
            IndexTable = null;
        }
    }

    //Metodo para cuando se presiona el boton de modificar
    private void EnabledMod(JButton Mod, JButton Save, boolean Cond) {
        Save.setEnabled(Cond);
        Mod.setEnabled(!Cond);
    }

    //Metodo para hacer confirm dialog
    private boolean ConfirmDialog(String Mensaje) {
        if (JOptionPane.showConfirmDialog(null, Mensaje) == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo sirve para borrar texto de los proveedores
    private void BorrarTextFieldProv(JTextField Nombre, JTextField Telefono, JTextField Nit, JTextField Producto, JTextField Direccion) {
        String t = null;
        Nombre.setText(t);
        Telefono.setText(t);
        Nit.setText(t);
        Producto.setText(t);
        Direccion.setText(t);
    }

    //Metodo para borrar TextField al agregar producto a ventas
    public void BorrarTextFieldVentas(JTextField nombre, JTextField cantidad) {
        nombre.setText(null);
        cantidad.setText(null);
    }

    //Meotodo para sacar el total de la Pre-Compra
    public double TotalPreCompra(JTable tabla, int NumColumna, JTextField JTextMensaje, String texto) {
        double TotalVenta = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            TotalVenta += Double.parseDouble(tabla.getValueAt(i, NumColumna).toString());
        }

        JTextMensaje.setText(texto + " " + TotalVenta);
        return TotalVenta;
    }

    //Metodo para graficar
    private Grafica Graficar(String Titulo, String Horizontal, String Vertical, ArrayList<String[]> Array, int Tipo, boolean Cond) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String[] valor : Array) {
            if (Cond) {
                dataset.addValue(Integer.parseInt(valor[1]), valor[0], "");
            } else {
                dataset.addValue(Double.parseDouble(valor[1]), valor[0], "");
            }
        }
        JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                Titulo, //Título de la gráfica  
                Horizontal, //leyenda Eje horizontal  
                Vertical, //leyenda Eje vertical  
                dataset, //datos  
                PlotOrientation.VERTICAL, //orientación  
                true, //incluir leyendas  
                true, //mostrar tooltips  
                true);
        graficoBarras.setBackgroundPaint(Color.WHITE);
        CaregoryPlot(graficoBarras);
        ChartPanel frame = new ChartPanel(graficoBarras);
        return new Grafica(dataset, graficoBarras, Calendar.getInstance(), Tipo);
    }

    //Metodo para graficar
    private void Graficar(Grafica grafica, JPanel Panel) {
        Panel.removeAll();
        Panel.setLayout(new BorderLayout());
        Panel.setPreferredSize(new Dimension(460, 265));
        if (grafica != null) {
            Panel.add(grafica.getPanel());
        } else {
            JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                    "Titulo", //Título de la gráfica  
                    "Eje Horizontal", //leyenda Eje horizontal  
                    "Eje Vertical", //leyenda Eje vertical  
                    new DefaultCategoryDataset(), //datos  
                    PlotOrientation.VERTICAL, //orientación  
                    false, //incluir leyendas  
                    false, //mostrar tooltips  
                    false);
            graficoBarras.setBackgroundPaint(Color.WHITE);
            CaregoryPlot(graficoBarras);
            ChartPanel frame = new ChartPanel(graficoBarras);
            Panel.add(frame);
        }
        Panel.validate();
        Panel.paintAll(Panel.getGraphics());
    }

    //Metodo para el pot
    private void CaregoryPlot(JFreeChart graf) {
        CategoryPlot plot = (CategoryPlot) graf.getPlot();
        plot.setBackgroundPaint(Color.CYAN); //fondo del grafico  
        plot.setBackgroundPaint(Color.WHITE); //fondo del grafico  
        plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles  
        plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos  
    }

    //Metodo para graficar Insumos
    private void GraficarInsumos(Calendar Dia) {
        Graficar(GrafCo.Read(Dia, 0), pn_MasVendidosInsumo);
        Graficar(GrafCo.Read(Dia, 1), pn_MenosVendidoInsumo);
        Graficar(GrafCo.Read(Dia, 2), pn_MasGananciaInsumo);
        Graficar(GrafCo.Read(Dia, 3), pn_MenosGananciaInsumo);
    }

    //Metodo para graficar Insumos
    private void GraficarProductos(Calendar Dia) {
        Graficar(GrafCo.Read(Dia, 4), pn_MasVendidosProducto);
        Graficar(GrafCo.Read(Dia, 5), pn_MenosVendidoProducto);
        Graficar(GrafCo.Read(Dia, 6), pn_MasGananciaProducto);
        Graficar(GrafCo.Read(Dia, 7), pn_MenosGananciaProducto);
    }

    public static void main(String args[]) {

        JOptionPane.showMessageDialog(null, "Debes iniciar desde el login");

        String s = "de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel";

        try {
            javax.swing.UIManager.setLookAndFeel(s);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(View1.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            Logger.getLogger(View1.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            Logger.getLogger(View1.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
        }
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View1().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cantidades;
    private javax.swing.JPanel Consultar_Producto;
    private javax.swing.JPanel Consultar_Proveedores;
    private javax.swing.JTabbedPane Contenedor_Stast;
    private datechooser.beans.DateChooserCombo Date_ConsultInsumo;
    private datechooser.beans.DateChooserCombo Date_ConsultProducto;
    private datechooser.beans.DateChooserCombo Date_DesdeHistoCompra;
    private datechooser.beans.DateChooserCombo Date_DesdeHistoVentas;
    private datechooser.beans.DateChooserCombo Date_HastaHistoCompra;
    private datechooser.beans.DateChooserCombo Date_HastaHistoVentas;
    private javax.swing.JButton EditPan_btn;
    private javax.swing.JButton EditProv_btn;
    private javax.swing.JButton EliminarProv_btn;
    private javax.swing.JPanel Eliminar_Producto;
    private javax.swing.JPanel Eliminar_Proveedores;
    private javax.swing.JPanel Estadisticas;
    private javax.swing.JButton GuardarEditPan_btn;
    private javax.swing.JButton GuardarEditProv_btn;
    private javax.swing.JPanel Historial_ventas;
    private javax.swing.JPanel Historial_ventas1;
    private javax.swing.JPanel Insumos;
    private javax.swing.JTabbedPane InsumosCont;
    private javax.swing.JPanel Modificar_Insumo;
    private javax.swing.JPanel Modificar_Producto;
    private javax.swing.JPanel Modificar_Proveedores;
    private javax.swing.JTabbedPane Panel_General;
    private javax.swing.JPanel Pre_Compra_Insumo;
    private javax.swing.JTabbedPane Productos;
    private javax.swing.JTabbedPane Proveedores;
    private javax.swing.JPanel Registrar;
    private javax.swing.JPanel Registrar_Insumo;
    private javax.swing.JPanel Registrar_Producto;
    private javax.swing.JPanel Registrar_Proveedores;
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton agregarProdVenta_btn;
    private javax.swing.JButton btn_ConsultHistoCompra;
    private javax.swing.JButton btn_ConsultHistoVenta;
    private javax.swing.JButton btn_ConsultInsumo;
    private javax.swing.JButton btn_ConsultProducto;
    private javax.swing.JButton btn_EditInsumo;
    private javax.swing.JButton btn_EditProdCantidad;
    private javax.swing.JButton btn_EliminarCompra;
    private javax.swing.JButton btn_EliminarEditInsumo;
    private javax.swing.JButton btn_EliminarVenta;
    private javax.swing.JButton btn_GuardarEditCantidad;
    private javax.swing.JButton btn_GuardarEditInsumo;
    private javax.swing.JButton btn_agregarInsumoVenta;
    private javax.swing.JButton btn_cancelBusqInsumoEdit;
    private javax.swing.JButton btn_cancelarBusqProdCantidad;
    private javax.swing.JButton btn_cancelarBusquedaHistoCompra;
    private javax.swing.JButton btn_cancelarBusquedaHistoVenta;
    private javax.swing.JButton btn_cancelarBusquedaInsumo;
    private javax.swing.JButton btn_cancelarBusquedaInsumoVenta;
    private javax.swing.JButton btn_cancelarBusquedaProducto;
    private javax.swing.JButton btn_cancelarEditInsumo;
    private javax.swing.JButton btn_cancelarEditProdCantidad;
    private javax.swing.JButton btn_consultInsumoEdit;
    private javax.swing.JButton btn_consultInsumoVenta;
    private javax.swing.JButton btn_consultProdCantidad;
    private javax.swing.JButton btn_registrarInsumo;
    private javax.swing.JButton cancelarBusqPov_btn;
    private javax.swing.JButton cancelarBusqProd_btn;
    private javax.swing.JButton cancelarBusquedaPan_btn;
    private javax.swing.JButton cancelarBusquedaProd_btn;
    private javax.swing.JButton cancelarBusquedaProv_btn;
    private javax.swing.JButton cancelarEditPan_btn;
    private javax.swing.JButton cancelarEditProv_btn;
    private javax.swing.JButton cancelarElimProd_btn;
    private javax.swing.JButton cancelarElimProv_btn;
    private javax.swing.JButton cancelarInsumoVenta_btn;
    private javax.swing.JButton cancelarVenta_btn;
    private javax.swing.JTextField cantidadProdVenta_txt;
    private javax.swing.JCheckBox chbx_selecEditInsumo;
    private javax.swing.JCheckBox chbx_selecHistoCompra;
    private javax.swing.JCheckBox chbx_selecHistoVenta;
    private javax.swing.JCheckBox chbx_selecInsumoConsultVenta;
    private javax.swing.JCheckBox chbx_selecInsumoVenta;
    private javax.swing.JComboBox<String> cmbx_proveInsumoEdit;
    private javax.swing.JComboBox<String> cmbx_proveInsumoReg;
    private javax.swing.JComboBox<String> cmbx_unidadInsumoEdit;
    private javax.swing.JComboBox<String> cmbx_unidadInsumoReg;
    private javax.swing.JComboBox<String> cmbx_unidadInsumoVenta;
    private javax.swing.JButton comprarInsumoVenta_btn;
    private javax.swing.JButton comprarVenta_btn;
    private javax.swing.JButton consultPanEdit_btn;
    private javax.swing.JButton consultPanEliminar_btn;
    private javax.swing.JButton consultPanVenta_btn;
    private javax.swing.JButton consultPan_btn;
    private javax.swing.JButton consultProvEdit_btn;
    private javax.swing.JButton consultProvEliminar_btn;
    private javax.swing.JButton consultProv_btn;
    private javax.swing.JTextField direcProvEdit_txt;
    private javax.swing.JTextField direcProvReg_txt;
    private javax.swing.JButton eliminarPan_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable listaPanesConsult_tbl;
    private javax.swing.JTable listaPanesEdit_tbl;
    private javax.swing.JTable listaPanesEliminar_tbl;
    private javax.swing.JTable listaPanesReg_tbl;
    private javax.swing.JTable listaProdConsultVentas_tbl;
    private javax.swing.JTable listaProdVenta_tbl;
    private javax.swing.JTable listaProvConsult_tbl;
    private javax.swing.JTable listaProvEliminar_tbl;
    private javax.swing.JTable listaProveedorReg_tbl;
    private javax.swing.JTable listaProveedoresEdit_tbl;
    private javax.swing.JMenu mbar_nameUser;
    private javax.swing.JTextField nitProvEdit_txt;
    private javax.swing.JTextField nitProvReg_txt;
    private javax.swing.JTextField nombreEliminarProv_txt;
    private javax.swing.JTextField nombrePanConsultEdit_txt;
    private javax.swing.JTextField nombrePanConsultVenta_txt;
    private javax.swing.JTextField nombrePanConsult_txt;
    private javax.swing.JTextField nombrePanEdit_txt;
    private javax.swing.JTextField nombrePanEliminar_txt;
    private javax.swing.JTextField nombrePanReg_txt;
    private javax.swing.JTextField nombreProdVenta_txt;
    private javax.swing.JTextField nombreProvConsultEdit_txt;
    private javax.swing.JTextField nombreProvConsult_txt;
    private javax.swing.JTextField nombreProvEdit_txt;
    private javax.swing.JTextField nombreProvReg_txt;
    private javax.swing.JPanel pn_MasGananciaInsumo;
    private javax.swing.JPanel pn_MasGananciaProducto;
    private javax.swing.JPanel pn_MasVendidosInsumo;
    private javax.swing.JPanel pn_MasVendidosProducto;
    private javax.swing.JPanel pn_MenosGananciaInsumo;
    private javax.swing.JPanel pn_MenosGananciaProducto;
    private javax.swing.JPanel pn_MenosVendidoInsumo;
    private javax.swing.JPanel pn_MenosVendidoProducto;
    private javax.swing.JTextField precioPanEdit_txt;
    private javax.swing.JTextField precioPanReg_txt;
    private javax.swing.JComboBox<String> provePanEdit_cmbx;
    private javax.swing.JComboBox<String> provePanReg_cmbx;
    private javax.swing.JButton registrarPan_btn;
    private javax.swing.JButton registrarProv_btn;
    private javax.swing.JButton retirarInsumoVenta_btn;
    private javax.swing.JButton retirarProdVenta_btn;
    private javax.swing.JCheckBox selecEditPan_chbx;
    private javax.swing.JCheckBox selecEditProv_chbx;
    private javax.swing.JCheckBox selecEliminarProv_chbx;
    private javax.swing.JCheckBox selecPanEliminar_chbx;
    private javax.swing.JCheckBox selecProdConsultVenta_chbx;
    private javax.swing.JCheckBox selecProdVenta_chbx;
    private javax.swing.JTextField serviProvEdit_txt;
    private javax.swing.JTextField serviProvReg_txt;
    private javax.swing.JTable tbl_HistoCompra;
    private javax.swing.JTable tbl_HistoComprasFact;
    private javax.swing.JTable tbl_HistoVenta;
    private javax.swing.JTable tbl_HistoVentasFact;
    private javax.swing.JTable tbl_listaInsumoConsultVentas;
    private javax.swing.JTable tbl_listaInsumoEdit;
    private javax.swing.JTable tbl_listaInsumoVenta;
    private javax.swing.JTable tbl_listaInsumosReg;
    private javax.swing.JTable tbl_listaProdCantidad;
    private javax.swing.JTable tbl_listaProdSelectCantidad;
    private javax.swing.JTextField telefonoProvEdit_txt;
    private javax.swing.JTextField telefonoProvReg_txt;
    private javax.swing.JTextField totalProdVenta;
    private javax.swing.JTextField txt_CantidadProd;
    private javax.swing.JTextField txt_PagoVenta;
    private javax.swing.JTextField txt_cantidadInsumoVenta;
    private javax.swing.JTextField txt_nombreInsumoConsultEdit;
    private javax.swing.JTextField txt_nombreInsumoConsultVenta;
    private javax.swing.JTextField txt_nombreInsumoReg;
    private javax.swing.JTextField txt_nombreInsumoVenta;
    private javax.swing.JTextField txt_nombreInsumosEdit;
    private javax.swing.JTextField txt_nombreProdConsultCantidad;
    private javax.swing.JTextField txt_pagoClientInsumoVenta;
    private javax.swing.JTextField txt_precioInsumoEdit;
    private javax.swing.JTextField txt_precioInsumoReg;
    private javax.swing.JTextField txt_totalProdInsumoVenta;
    // End of variables declaration//GEN-END:variables

}
