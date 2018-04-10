package View;

import Controller.*;
import Model.*;
import java.awt.*;
import static java.awt.Event.ENTER;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.panaderia;
import org.jfree.chart.*;
import org.jfree.data.category.DefaultCategoryDataset;

public class View1 extends javax.swing.JFrame {

    //instacio controladores
    private ProductoController Proco = new ProductoController();
    private ProveedorController Proveeco = new ProveedorController();

    private Object IndexTable = null;
    public static String FileName = "";
    String Nombre_Panaderia = "";

    public View1(String FileName, String Nombre_Panaderia) {
        this.FileName = FileName;
        this.Nombre_Panaderia = Nombre_Panaderia;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        IconosPanel();
        cargar_datos(FileName);
        mbar_nameUser.setText("Usuario: " + FileName);
        ListAll();
        nombrePanReg_txt.requestFocus();
    }

    public View1() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        IconosPanel();
        ListAll();
        nombrePanReg_txt.requestFocus();
    }

    public String getFileName() {
        return FileName;
    }

    public String getNombre_Panaderia() {
        return Nombre_Panaderia;
    }

    public void cargar_datos(String nameFile) {
        String path = ".\\PanaderiasData\\" + nameFile + ".dat";
        File fichero = new File(path);

        if (fichero.exists()) {
            try {
                FileInputStream archivo = new FileInputStream(path);
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                Usuario u1 = ((Usuario) obj_archivo.readObject());
                //poner las demas instancias aquí
                Proco.setLista_producto(u1.getLista_Producto());
                Proveeco.setLista_proovedor(u1.getLista_Proovedor());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton1 = new javax.swing.JButton();
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
        jPanel9 = new javax.swing.JPanel();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        Modificar_Insumo = new javax.swing.JPanel();
        btn_GuardarEditInsumo = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        listaPanesEdit_tbl1 = new javax.swing.JTable();
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
        btn_cancelarEditInsumo1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        PreCompra = new javax.swing.JPanel();
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
        pagoClientVenta_txt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        totalProdVenta = new javax.swing.JTextField();
        cancelarBusquedaPan_btn = new javax.swing.JButton();
        Estadisticas = new javax.swing.JPanel();
        Contenedor_Stast = new javax.swing.JTabbedPane();
        Historial_ventas = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        listaProdVenta_tbl1 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        listaProdVenta_tbl2 = new javax.swing.JTable();
        EliminarVentas_btn = new javax.swing.JButton();
        ConsultVentas_txt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        selecEliminarVentas_chbx = new javax.swing.JCheckBox();
        consultVentas_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mbar_nameUser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        nombrePanReg_txt.setText("brazo");
        nombrePanReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePanReg_txtKeyPressed(evt);
            }
        });

        jLabel1.setText("Nombre del Tipo de Producto : ");

        precioPanReg_txt.setText("500");
        precioPanReg_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioPanReg_txtActionPerformed(evt);
            }
        });
        precioPanReg_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioPanReg_txtKeyPressed(evt);
            }
        });

        jLabel3.setText("Precio : ");

        listaPanesReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        registrarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPan_btnregistrarPan(evt);
            }
        });

        provePanReg_cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Proveedor:");

        javax.swing.GroupLayout Registrar_ProductoLayout = new javax.swing.GroupLayout(Registrar_Producto);
        Registrar_Producto.setLayout(Registrar_ProductoLayout);
        Registrar_ProductoLayout.setHorizontalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(provePanReg_cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Productos.addTab("Registrar Producto", Registrar_Producto);

        Modificar_Producto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuardarEditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        GuardarEditPan_btn.setText("Guardar");
        GuardarEditPan_btn.setEnabled(false);
        GuardarEditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEditPan_btnmodificarPan(evt);
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
        }

        Modificar_Producto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, 1061, 380));

        precioPanEdit_txt.setEnabled(false);
        precioPanEdit_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioPanEdit_txtKeyPressed(evt);
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
        consultPanEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEdit_btnActionPerformed(evt);
            }
        });
        Modificar_Producto.add(consultPanEdit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 35, 78, -1));

        EditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditPan_btn.setText("Modificar");
        EditPan_btn.setEnabled(false);
        EditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPan_btnActionPerformed(evt);
            }
        });
        Modificar_Producto.add(EditPan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 35, 149, 76));

        cancelarEditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarEditPan_btn.setText("Cancelar");
        cancelarEditPan_btn.setEnabled(false);
        cancelarEditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEditPan_btnmodificarPan(evt);
            }
        });
        Modificar_Producto.add(cancelarEditPan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 35, 149, -1));

        jLabel42.setText("Nuevo Proveedor:");
        Modificar_Producto.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 69, -1, -1));

        provePanEdit_cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        provePanEdit_cmbx.setEnabled(false);
        Modificar_Producto.add(provePanEdit_cmbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 90, 118, -1));

        cancelarBusqProd_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusqProd_btn.setText("Cancelar Consulta");
        cancelarBusqProd_btn.setEnabled(false);
        cancelarBusqProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusqProd_btnActionPerformed(evt);
            }
        });
        Modificar_Producto.add(cancelarBusqProd_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 160, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Modificar_Producto.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

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
        consultPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPan_btn(evt);
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
        cancelarBusquedaProd_btn.setEnabled(false);
        cancelarBusquedaProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaProd_btnmodificarPan(evt);
            }
        });

        javax.swing.GroupLayout Consultar_ProductoLayout = new javax.swing.GroupLayout(Consultar_Producto);
        Consultar_Producto.setLayout(Consultar_ProductoLayout);
        Consultar_ProductoLayout.setHorizontalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBusquedaProd_btn)
                        .addGap(26, 26, 26)
                        .addComponent(consultPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
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
        eliminarPan_btn.setEnabled(false);
        eliminarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPan_btnActionPerformed(evt);
            }
        });

        consultPanEliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanEliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEliminar_btnActionPerformed(evt);
            }
        });

        cancelarElimProd_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarElimProd_btn.setText("Cancelar");
        cancelarElimProd_btn.setEnabled(false);
        cancelarElimProd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarElimProd_btnmodificarPan(evt);
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
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        Productos.addTab("Eliminar Producto", Eliminar_Producto);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        Productos.addTab("Cantidades", jPanel9);

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
        registrarProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProv_btnregistrarPan(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
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
        });

        jLabel27.setText("NIT :");

        consultProvEdit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProvEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvEdit_btnActionPerformed(evt);
            }
        });

        EditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditProv_btn.setText("Modificar");
        EditProv_btn.setEnabled(false);
        EditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProv_btnActionPerformed(evt);
            }
        });

        GuardarEditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        GuardarEditProv_btn.setText("Guardar");
        GuardarEditProv_btn.setEnabled(false);
        GuardarEditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEditProv_btnmodificarPan(evt);
            }
        });

        cancelarEditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarEditProv_btn.setText("Cancelar");
        cancelarEditProv_btn.setEnabled(false);
        cancelarEditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEditProv_btnmodificarPan(evt);
            }
        });

        cancelarBusqPov_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarBusqPov_btn.setText("Cancelar Consulta");
        cancelarBusqPov_btn.setEnabled(false);
        cancelarBusqPov_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusqPov_btnActionPerformed(evt);
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
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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
        consultProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProv_btnActionPerformed(evt);
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
        cancelarBusquedaProv_btn.setEnabled(false);
        cancelarBusquedaProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaProv_btnmodificarPan(evt);
            }
        });

        javax.swing.GroupLayout Consultar_ProveedoresLayout = new javax.swing.GroupLayout(Consultar_Proveedores);
        Consultar_Proveedores.setLayout(Consultar_ProveedoresLayout);
        Consultar_ProveedoresLayout.setHorizontalGroup(
            Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBusquedaProv_btn)
                        .addGap(26, 26, 26)
                        .addComponent(consultProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Consultar_ProveedoresLayout.setVerticalGroup(
            Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultProv_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(cancelarBusquedaProv_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
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
        EliminarProv_btn.setEnabled(false);
        EliminarProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProv_btnActionPerformed(evt);
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
        consultProvEliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvEliminar_btnActionPerformed(evt);
            }
        });

        cancelarElimProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarElimProv_btn.setText("Cancelar");
        cancelarElimProv_btn.setEnabled(false);
        cancelarElimProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarElimProv_btnmodificarPan(evt);
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
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE))
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Eliminar Prooverdor", Eliminar_Proveedores);

        Panel_General.addTab("Proveedores", null, Proveedores, "");

        txt_nombreInsumoReg.setText("brazo");
        txt_nombreInsumoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumoRegKeyPressed(evt);
            }
        });

        jLabel2.setText("Nombre del Tipo de Producto : ");

        txt_precioInsumoReg.setText("500");
        txt_precioInsumoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioInsumoRegActionPerformed(evt);
            }
        });
        txt_precioInsumoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioInsumoRegKeyPressed(evt);
            }
        });

        jLabel6.setText("Precio : ");

        tbl_listaInsumosReg.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_listaInsumosReg.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tbl_listaInsumosReg);
        if (tbl_listaInsumosReg.getColumnModel().getColumnCount() > 0) {
            tbl_listaInsumosReg.getColumnModel().getColumn(0).setMinWidth(80);
            tbl_listaInsumosReg.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_listaInsumosReg.getColumnModel().getColumn(0).setMaxWidth(80);
            tbl_listaInsumosReg.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaInsumosReg.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaInsumosReg.getColumnModel().getColumn(3).setResizable(false);
        }

        btn_registrarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btn_registrarInsumo.setText("Registrar");
        btn_registrarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarInsumoregistrarPan(evt);
            }
        });

        cmbx_proveInsumoReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Proveedor:");

        jLabel28.setText("Unidad:");

        cmbx_unidadInsumoReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout Registrar_InsumoLayout = new javax.swing.GroupLayout(Registrar_Insumo);
        Registrar_Insumo.setLayout(Registrar_InsumoLayout);
        Registrar_InsumoLayout.setHorizontalGroup(
            Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addContainerGap())
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombreInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_precioInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_proveInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_unidadInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(145, 145, 145)
                        .addComponent(btn_registrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        Registrar_InsumoLayout.setVerticalGroup(
            Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                .addGroup(Registrar_InsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_registrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Registrar_InsumoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
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
                                    .addComponent(cmbx_proveInsumoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(Registrar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(Registrar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registrar", jPanel2);

        Modificar_Insumo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_GuardarEditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btn_GuardarEditInsumo.setText("Guardar");
        btn_GuardarEditInsumo.setEnabled(false);
        btn_GuardarEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarEditInsumomodificarPan(evt);
            }
        });
        Modificar_Insumo.add(btn_GuardarEditInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 149, -1));

        listaPanesEdit_tbl1.setModel(new javax.swing.table.DefaultTableModel(
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
        listaPanesEdit_tbl1.getTableHeader().setReorderingAllowed(false);
        listaPanesEdit_tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPanesEdit_tbl1selecProdModif_tbl(evt);
            }
        });
        listaPanesEdit_tbl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaPanesEdit_tbl1KeyPressed(evt);
            }
        });
        jScrollPane14.setViewportView(listaPanesEdit_tbl1);
        if (listaPanesEdit_tbl1.getColumnModel().getColumnCount() > 0) {
            listaPanesEdit_tbl1.getColumnModel().getColumn(0).setMinWidth(80);
            listaPanesEdit_tbl1.getColumnModel().getColumn(0).setPreferredWidth(80);
            listaPanesEdit_tbl1.getColumnModel().getColumn(0).setMaxWidth(80);
            listaPanesEdit_tbl1.getColumnModel().getColumn(1).setResizable(false);
            listaPanesEdit_tbl1.getColumnModel().getColumn(2).setResizable(false);
            listaPanesEdit_tbl1.getColumnModel().getColumn(3).setResizable(false);
        }

        Modificar_Insumo.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 1061, 400));

        txt_precioInsumoEdit.setEnabled(false);
        txt_precioInsumoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioInsumoEditKeyPressed(evt);
            }
        });
        Modificar_Insumo.add(txt_precioInsumoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 118, -1));

        txt_nombreInsumosEdit.setEnabled(false);
        txt_nombreInsumosEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumosEditKeyPressed(evt);
            }
        });
        Modificar_Insumo.add(txt_nombreInsumosEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        jLabel32.setText("Nuevo Nombre :  ");
        Modificar_Insumo.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel33.setText("Nuevo Precio : ");
        Modificar_Insumo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        chbx_selecEditInsumo.setText("Seleccionado");
        chbx_selecEditInsumo.setEnabled(false);
        chbx_selecEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbx_selecEditInsumoActionPerformed(evt);
            }
        });
        Modificar_Insumo.add(chbx_selecEditInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, -1));

        txt_nombreInsumoConsultEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreInsumoConsultEditKeyPressed(evt);
            }
        });
        Modificar_Insumo.add(txt_nombreInsumoConsultEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 113, -1));

        jLabel34.setText("Buscar :");
        Modificar_Insumo.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));

        btn_consultInsumoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_consultInsumoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultInsumoEditActionPerformed(evt);
            }
        });
        Modificar_Insumo.add(btn_consultInsumoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 78, -1));

        btn_EditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btn_EditInsumo.setText("Modificar");
        btn_EditInsumo.setEnabled(false);
        btn_EditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditInsumoActionPerformed(evt);
            }
        });
        Modificar_Insumo.add(btn_EditInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 149, 90));

        btn_EliminarEditInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        btn_EliminarEditInsumo.setText("Eliminar");
        btn_EliminarEditInsumo.setEnabled(false);
        btn_EliminarEditInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarEditInsumomodificarPan(evt);
            }
        });
        Modificar_Insumo.add(btn_EliminarEditInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 149, -1));

        jLabel43.setText("Nuevo Proveedor:");
        Modificar_Insumo.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        cmbx_proveInsumoEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_proveInsumoEdit.setEnabled(false);
        Modificar_Insumo.add(cmbx_proveInsumoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        btn_cancelBusqInsumoEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelBusqInsumoEdit.setText("Cancelar Consulta");
        btn_cancelBusqInsumoEdit.setEnabled(false);
        btn_cancelBusqInsumoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelBusqInsumoEditActionPerformed(evt);
            }
        });
        Modificar_Insumo.add(btn_cancelBusqInsumoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 160, -1));

        jLabel35.setText("Unidad:");
        Modificar_Insumo.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        cmbx_unidadInsumoEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_unidadInsumoEdit.setEnabled(false);
        Modificar_Insumo.add(cmbx_unidadInsumoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, -1));

        btn_cancelarEditInsumo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btn_cancelarEditInsumo1.setText("Cancelar");
        btn_cancelarEditInsumo1.setEnabled(false);
        btn_cancelarEditInsumo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarEditInsumo1modificarPan(evt);
            }
        });
        Modificar_Insumo.add(btn_cancelarEditInsumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 149, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificar_Insumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Modificar_Insumo, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        tbl_listaInsumoVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_listaInsumoVenta.getTableHeader().setReorderingAllowed(false);
        tbl_listaInsumoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaInsumoVentaMouseClicked(evt);
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
        btn_consultInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultInsumoVentaActionPerformed(evt);
            }
        });

        tbl_listaInsumoConsultVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_listaInsumoConsultVentas.getTableHeader().setReorderingAllowed(false);
        tbl_listaInsumoConsultVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_listaInsumoConsultVentasMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tbl_listaInsumoConsultVentas);
        if (tbl_listaInsumoConsultVentas.getColumnModel().getColumnCount() > 0) {
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(1).setResizable(false);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(2).setResizable(false);
            tbl_listaInsumoConsultVentas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel37.setText("Producto :");

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
        });

        jLabel38.setText("Cantidad :");

        btn_agregarInsumoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png"))); // NOI18N
        btn_agregarInsumoVenta.setText("Agregar");
        btn_agregarInsumoVenta.setEnabled(false);
        btn_agregarInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarInsumoVentaActionPerformed(evt);
            }
        });

        retirarInsumoVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        retirarInsumoVenta_btn.setText("Retirar");
        retirarInsumoVenta_btn.setEnabled(false);
        retirarInsumoVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarInsumoVenta_btnActionPerformed(evt);
            }
        });

        chbx_selecInsumoVenta.setText("Seleccionado");
        chbx_selecInsumoVenta.setEnabled(false);

        comprarInsumoVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png"))); // NOI18N
        comprarInsumoVenta_btn.setText("Presupuestar");
        comprarInsumoVenta_btn.setEnabled(false);
        comprarInsumoVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarInsumoVenta_btnActionPerformed(evt);
            }
        });

        cancelarInsumoVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarInsumoVenta_btn.setText("Cancelar Pre-Compra");
        cancelarInsumoVenta_btn.setEnabled(false);
        cancelarInsumoVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInsumoVenta_btnActionPerformed(evt);
            }
        });

        txt_pagoClientInsumoVenta.setEnabled(false);
        txt_pagoClientInsumoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pagoClientInsumoVentaKeyPressed(evt);
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
        btn_cancelarBusquedaInsumoVenta.setEnabled(false);
        btn_cancelarBusquedaInsumoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarBusquedaInsumoVentamodificarPan(evt);
            }
        });

        cmbx_unidadInsumoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_unidadInsumoVenta.setEnabled(false);

        jLabel41.setText("Unidad:");

        javax.swing.GroupLayout PreCompraLayout = new javax.swing.GroupLayout(PreCompra);
        PreCompra.setLayout(PreCompraLayout);
        PreCompraLayout.setHorizontalGroup(
            PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreCompraLayout.createSequentialGroup()
                .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PreCompraLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PreCompraLayout.createSequentialGroup()
                                .addComponent(chbx_selecInsumoConsultVenta)
                                .addGap(32, 32, 32)
                                .addComponent(btn_cancelarBusquedaInsumoVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_consultInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PreCompraLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombreInsumoConsultVenta))))
                    .addGroup(PreCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PreCompraLayout.createSequentialGroup()
                            .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PreCompraLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabel38))
                                .addGroup(PreCompraLayout.createSequentialGroup()
                                    .addComponent(txt_cantidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(chbx_selecInsumoVenta))
                                .addGroup(PreCompraLayout.createSequentialGroup()
                                    .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombreInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PreCompraLayout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel37)))
                                    .addGap(18, 18, 18)
                                    .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PreCompraLayout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel41))
                                        .addComponent(cmbx_unidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                            .addComponent(jLabel39)
                            .addGap(113, 113, 113)
                            .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(retirarInsumoVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_agregarInsumoVenta)))
                        .addGroup(PreCompraLayout.createSequentialGroup()
                            .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comprarInsumoVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelarInsumoVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreCompraLayout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_pagoClientInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_totalProdInsumoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        PreCompraLayout.setVerticalGroup(
            PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreCompraLayout.createSequentialGroup()
                .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PreCompraLayout.createSequentialGroup()
                        .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PreCompraLayout.createSequentialGroup()
                                .addGap(0, 41, Short.MAX_VALUE)
                                .addComponent(jLabel39)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreCompraLayout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreCompraLayout.createSequentialGroup()
                                        .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_nombreInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PreCompraLayout.createSequentialGroup()
                                                .addComponent(jLabel37)
                                                .addGap(25, 25, 25))
                                            .addGroup(PreCompraLayout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addGap(6, 6, 6)
                                                .addComponent(cmbx_unidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_cantidadInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chbx_selecInsumoVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PreCompraLayout.createSequentialGroup()
                                        .addComponent(btn_agregarInsumoVenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(retirarInsumoVenta_btn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PreCompraLayout.createSequentialGroup()
                                .addComponent(comprarInsumoVenta_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarInsumoVenta_btn))
                            .addGroup(PreCompraLayout.createSequentialGroup()
                                .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_pagoClientInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))
                                .addGap(18, 18, 18)
                                .addComponent(txt_totalProdInsumoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(PreCompraLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombreInsumoConsultVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PreCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_consultInsumoVenta)
                            .addComponent(chbx_selecInsumoConsultVenta)
                            .addComponent(btn_cancelarBusquedaInsumoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1094, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(PreCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PreCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Pre-Compra", jPanel8);

        javax.swing.GroupLayout InsumosLayout = new javax.swing.GroupLayout(Insumos);
        Insumos.setLayout(InsumosLayout);
        InsumosLayout.setHorizontalGroup(
            InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        InsumosLayout.setVerticalGroup(
            InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
        consultPanVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanVenta_btnActionPerformed(evt);
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
        listaProdConsultVentas_tbl.getTableHeader().setReorderingAllowed(false);
        listaProdConsultVentas_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdConsultVentas_tblMouseClicked(evt);
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
        });

        jLabel14.setText("Cantidad :");

        agregarProdVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png"))); // NOI18N
        agregarProdVenta_btn.setText("Agregar");
        agregarProdVenta_btn.setEnabled(false);
        agregarProdVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdVenta_btnActionPerformed(evt);
            }
        });

        retirarProdVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        retirarProdVenta_btn.setText("Retirar");
        retirarProdVenta_btn.setEnabled(false);
        retirarProdVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarProdVenta_btnActionPerformed(evt);
            }
        });

        selecProdVenta_chbx.setText("Seleccionado");
        selecProdVenta_chbx.setEnabled(false);

        comprarVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png"))); // NOI18N
        comprarVenta_btn.setText("Comprar");
        comprarVenta_btn.setEnabled(false);
        comprarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarVenta_btnActionPerformed(evt);
            }
        });

        cancelarVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarVenta_btn.setText("Cancelar Compra");
        cancelarVenta_btn.setEnabled(false);
        cancelarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVenta_btnActionPerformed(evt);
            }
        });

        pagoClientVenta_txt.setEnabled(false);
        pagoClientVenta_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pagoClientVenta_txtKeyPressed(evt);
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
        cancelarBusquedaPan_btn.setEnabled(false);
        cancelarBusquedaPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBusquedaPan_btnmodificarPan(evt);
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
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGap(30, 30, Short.MAX_VALUE)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel13)))
                                .addGap(43, 43, 43)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cantidadProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selecProdVenta_chbx)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addComponent(agregarProdVenta_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(retirarProdVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comprarVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelarVenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(195, 195, 195)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalProdVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pagoClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(agregarProdVenta_btn)
                                    .addComponent(retirarProdVenta_btn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selecProdVenta_chbx))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombreProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(25, 25, 25))
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(27, 27, 27))
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidadProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(comprarVenta_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarVenta_btn))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pagoClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addGap(18, 18, 18)
                                .addComponent(totalProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePanConsultVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultPanVenta_btn)
                            .addComponent(selecProdConsultVenta_chbx)
                            .addComponent(cancelarBusquedaPan_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        Panel_General.addTab("Ventas", Ventas);

        listaProdVenta_tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "N# de Productos", "Total Pagado", "Dinero Entregado", "Dinero Devuelto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProdVenta_tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdVenta_tbl1MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(listaProdVenta_tbl1);
        if (listaProdVenta_tbl1.getColumnModel().getColumnCount() > 0) {
            listaProdVenta_tbl1.getColumnModel().getColumn(2).setResizable(false);
        }

        listaProdVenta_tbl2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(listaProdVenta_tbl2);

        EliminarVentas_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        EliminarVentas_btn.setText("Eliminar Compra");
        EliminarVentas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarVentas_btnActionPerformed(evt);
            }
        });

        jLabel31.setText("Buscar :");

        selecEliminarVentas_chbx.setText("Seleccionado");
        selecEliminarVentas_chbx.setEnabled(false);

        consultVentas_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultVentas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultVentas_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Historial_ventasLayout = new javax.swing.GroupLayout(Historial_ventas);
        Historial_ventas.setLayout(Historial_ventasLayout);
        Historial_ventasLayout.setHorizontalGroup(
            Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Historial_ventasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Historial_ventasLayout.createSequentialGroup()
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EliminarVentas_btn))
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addComponent(jScrollPane13)
                                .addGap(18, 18, 18)
                                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selecEliminarVentas_chbx)
                                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(ConsultVentas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultVentas_btn)
                                .addGap(8, 8, 8)))
                        .addGap(12, 12, 12)))
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
                        .addGap(13, 13, 13)
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ConsultVentas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selecEliminarVentas_chbx))
                            .addComponent(consultVentas_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(EliminarVentas_btn)
                        .addGap(27, 27, 27))))
        );

        Contenedor_Stast.addTab("Historial de Ventas", Historial_ventas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        Contenedor_Stast.addTab("tab3", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        Contenedor_Stast.addTab("tab4", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        Contenedor_Stast.addTab("tab5", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        Contenedor_Stast.addTab("tab6", jPanel7);

        javax.swing.GroupLayout EstadisticasLayout = new javax.swing.GroupLayout(Estadisticas);
        Estadisticas.setLayout(EstadisticasLayout);
        EstadisticasLayout.setHorizontalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor_Stast)
        );
        EstadisticasLayout.setVerticalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor_Stast)
        );

        Panel_General.addTab("Estadisticas", Estadisticas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu3.setText("Inicio");

        jMenuItem1.setText("Salir");
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        mbar_nameUser.setText("user");
        jMenuBar1.add(mbar_nameUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Panel_General.setIconAt(4, new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png")));
        //Estadisticas
        Panel_General.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/estadisticas.png")));

        Panel_General.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/groceries_1.png")));

        //Prod_Registrar
        Productos.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png")));
        //Prod_Modificar
        Productos.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png")));
        //Prod_Consultar
        Productos.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png")));
        //Prod_Eliminar
        Productos.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png")));

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
        Contenedor_Stast.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/folder.png")));

        listaProdVenta_tbl.getColumnModel().getColumn(0).setPreferredWidth(150);

    }


    private void totalProdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalProdVentaActionPerformed

    }//GEN-LAST:event_totalProdVentaActionPerformed

    private void pagoClientVenta_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagoClientVenta_txtKeyPressed

    }//GEN-LAST:event_pagoClientVenta_txtKeyPressed

    private void cancelarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVenta_btnActionPerformed

    }//GEN-LAST:event_cancelarVenta_btnActionPerformed

    private void comprarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarVenta_btnActionPerformed

    }//GEN-LAST:event_comprarVenta_btnActionPerformed

    private void retirarProdVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarProdVenta_btnActionPerformed

    }//GEN-LAST:event_retirarProdVenta_btnActionPerformed

    private void agregarProdVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdVenta_btnActionPerformed

    }//GEN-LAST:event_agregarProdVenta_btnActionPerformed

    private void cantidadProdVenta_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProdVenta_txtKeyPressed

    }//GEN-LAST:event_cantidadProdVenta_txtKeyPressed

    private void listaProdConsultVentas_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdConsultVentas_tblMouseClicked
        SelecTable(listaProdConsultVentas_tbl, selecEditPan_chbx, EditPan_btn, true);
        cancelarBusquedaPan_btn.setEnabled(true);
        nombreProdVenta_txt.setText(listaProdConsultVentas_tbl.getValueAt(listaProdConsultVentas_tbl.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_listaProdConsultVentas_tblMouseClicked

    private void consultPanVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanVenta_btnActionPerformed
        BuscarAll(nombrePanConsultVenta_txt.getText().toUpperCase(), listaProdConsultVentas_tbl, Proco.ReadVenta(nombrePanConsultVenta_txt.getText().toUpperCase()), cancelarBusquedaPan_btn);
    }//GEN-LAST:event_consultPanVenta_btnActionPerformed

    private void nombrePanConsultVenta_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePanConsultVenta_txtKeyPressed

    }//GEN-LAST:event_nombrePanConsultVenta_txtKeyPressed

    private void listaProdVenta_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdVenta_tblMouseClicked
        SelecTable(listaProdVenta_tbl, selecProdVenta_chbx, EditProv_btn, true);
    }//GEN-LAST:event_listaProdVenta_tblMouseClicked

    //Buscar en el eliminar proveedores
    private void consultProvEliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvEliminar_btnActionPerformed
        BuscarAll(nombreEliminarProv_txt.getText().toUpperCase(), listaProvEliminar_tbl, Proveeco.Read(nombreEliminarProv_txt.getText().toUpperCase()), cancelarElimProv_btn);
    }//GEN-LAST:event_consultProvEliminar_btnActionPerformed

    //Evento del enter para eliminar proveedor
    private void listaProvEliminar_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProvEliminar_tblKeyPressed
        EventoEnter(evt, EliminarProv_btn);
    }//GEN-LAST:event_listaProvEliminar_tblKeyPressed

    private void listaProvEliminar_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProvEliminar_tblMouseClicked
        SelecTable(listaProvEliminar_tbl, selecEliminarProv_chbx, EliminarProv_btn, true);
        cancelarElimProv_btn.setEnabled(true);
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
                    Proveeco.Update(Integer.parseInt(IndexTable.toString()), new Proveedor(UUID.randomUUID().toString(), nombreProvEdit_txt.getText().toUpperCase(),
                            serviProvEdit_txt.getText().toUpperCase(), telefonoProvEdit_txt.getText(), direcProvEdit_txt.getText().toUpperCase(), nitProvEdit_txt.getText().toUpperCase(), 0));
                    ListAll();
                    cancelarEditProv_btn.doClick();
                    JOptionPane.showMessageDialog(null, "El proveedor ha sido modificado", "modoficado", 1);
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
        nombreProvConsultEdit_txt.setText(null);
    }//GEN-LAST:event_consultProvEdit_btnActionPerformed

    //Evento del enter para el modificar proveedor
    private void direcProvEdit_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcProvEdit_txtKeyPressed
        EventoEnter(evt, GuardarEditProv_btn);
    }//GEN-LAST:event_direcProvEdit_txtKeyPressed

    //Evento del enter para el modificar proveedor tabla
    private void listaProveedoresEdit_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProveedoresEdit_tblKeyPressed
        EventoEnter(evt, EditProv_btn);
    }//GEN-LAST:event_listaProveedoresEdit_tblKeyPressed

    //Evento para seleccionar un proveedor del modificar
    private void listaProveedoresEdit_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProveedoresEdit_tblMouseClicked
        SelecTable(listaProveedoresEdit_tbl, selecEditProv_chbx, EditProv_btn, true);
        cancelarEditProv_btn.setEnabled(true);
        nombreProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 1).toString());
        serviProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 2).toString());
        telefonoProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 3).toString());
        direcProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 4).toString());
        nitProvEdit_txt.setText(listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 5).toString());
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
                Proveeco.Create(new Proveedor(UUID.randomUUID().toString(), nombreProvReg_txt.getText().toUpperCase(),
                        serviProvReg_txt.getText().toUpperCase(), telefonoProvReg_txt.getText(), direcProvReg_txt.getText().toUpperCase(), nitProvReg_txt.getText().toUpperCase(), 0));
                BorrarTextFieldProv(nombreProvReg_txt, telefonoProvReg_txt, nitProvReg_txt, serviProvReg_txt, direcProvReg_txt);
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

    //Evento del enter para el eliminar producto tabla
    private void listaPanesEliminar_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPanesEliminar_tblKeyPressed
        EventoEnter(evt, eliminarPan_btn);
    }//GEN-LAST:event_listaPanesEliminar_tblKeyPressed

    //Evento para seleccionar un producto del eliminar
    private void listaPanesEliminar_tblselecProdEliminar_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPanesEliminar_tblselecProdEliminar_tbl
        SelecTable(listaPanesEliminar_tbl, selecPanEliminar_chbx, eliminarPan_btn, true);
        cancelarElimProd_btn.setEnabled(true);
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
        nombrePanConsultEdit_txt.setText(null);
    }//GEN-LAST:event_consultPanEdit_btnActionPerformed

    //Evento enter para la tabla del modificar producto
    private void listaPanesEdit_tblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPanesEdit_tblKeyPressed
        EventoEnter(evt, EditPan_btn);
    }//GEN-LAST:event_listaPanesEdit_tblKeyPressed

    //Evento para cuando se seleccione un pan de la tabla del modificar
    private void listaPanesEdit_tblselecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPanesEdit_tblselecProdModif_tbl
        SelecTable(listaPanesEdit_tbl, selecEditPan_chbx, EditPan_btn, true);
        cancelarEditPan_btn.setEnabled(true);
        nombrePanEdit_txt.setText(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 1).toString());
        precioPanEdit_txt.setText(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 2).toString());
        provePanEdit_cmbx.setSelectedItem(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 3).toString());
        System.out.println(listaPanesEdit_tbl.getSelectedRows());
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

    private void consultVentas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultVentas_btnActionPerformed

    }//GEN-LAST:event_consultVentas_btnActionPerformed

    private void EliminarVentas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarVentas_btnActionPerformed

    }//GEN-LAST:event_EliminarVentas_btnActionPerformed

    private void listaProdVenta_tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdVenta_tbl1MouseClicked

    }//GEN-LAST:event_listaProdVenta_tbl1MouseClicked

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
        ActualizarPanelCrud(nombrePanReg_txt, nombrePanConsultEdit_txt, nombrePanConsult_txt, nombrePanEliminar_txt, Productos);
    }//GEN-LAST:event_ProductosStateChanged

    //Actualizar Panel Proveedores
    private void ProveedoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProveedoresStateChanged
        ActualizarPanelCrud(nombreProvReg_txt, nombreProvConsultEdit_txt, nombreProvConsult_txt, nombreEliminarProv_txt, Proveedores);
    }//GEN-LAST:event_ProveedoresStateChanged

    //Actualizar Panel General
    private void Panel_GeneralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Panel_GeneralStateChanged
        switch (Panel_General.getSelectedIndex()) {
            case 0:
                ActualizarPanelCrud(nombrePanReg_txt, nombrePanConsultEdit_txt, nombrePanConsult_txt, nombrePanEliminar_txt, Productos);
                break;
            case 1:
                ActualizarPanelCrud(nombreProvReg_txt, nombreProvConsultEdit_txt, nombreProvConsult_txt, nombreEliminarProv_txt, Proveedores);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
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
    }//GEN-LAST:event_cancelarBusquedaPan_btnmodificarPan

    private void cancelarBusquedaProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusquedaProv_btnmodificarPan
        Listar((DefaultTableModel) listaProvConsult_tbl.getModel(), Proveeco.ReadAll());
        cancelarBusquedaProv_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusquedaProv_btnmodificarPan

    private void cancelarBusquedaProd_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusquedaProd_btnmodificarPan
        Listar((DefaultTableModel) listaPanesConsult_tbl.getModel(), Proco.ReadAll());
        cancelarBusquedaProd_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusquedaProd_btnmodificarPan

    private void cancelarElimProd_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarElimProd_btnmodificarPan
        Listar((DefaultTableModel) listaProvEliminar_tbl.getModel(), Proveeco.ReadAll());
        SelecTable(listaPanesEliminar_tbl, selecPanEliminar_chbx, cancelarElimProd_btn, false);
        eliminarPan_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarElimProd_btnmodificarPan

    private void cancelarElimProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarElimProv_btnmodificarPan
        Listar((DefaultTableModel) listaPanesEliminar_tbl.getModel(), Proco.ReadAll());
        SelecTable(listaProvEliminar_tbl, selecEliminarProv_chbx, cancelarElimProv_btn, false);
        EliminarProv_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarElimProv_btnmodificarPan

    private void cancelarBusqProd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusqProd_btnActionPerformed
        Listar((DefaultTableModel) listaPanesEdit_tbl.getModel(), Proco.ReadAll());
        cancelarBusqProd_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusqProd_btnActionPerformed

    private void cancelarBusqPov_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBusqPov_btnActionPerformed
        Listar((DefaultTableModel) listaProveedoresEdit_tbl.getModel(), Proveeco.ReadAll());
        cancelarBusqPov_btn.setEnabled(false);
    }//GEN-LAST:event_cancelarBusqPov_btnActionPerformed

    private void txt_nombreInsumoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumoRegKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoRegKeyPressed

    private void txt_precioInsumoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioInsumoRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioInsumoRegActionPerformed

    private void txt_precioInsumoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioInsumoRegKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioInsumoRegKeyPressed

    private void btn_registrarInsumoregistrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarInsumoregistrarPan
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarInsumoregistrarPan

    private void btn_GuardarEditInsumomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarEditInsumomodificarPan
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarEditInsumomodificarPan

    private void listaPanesEdit_tbl1selecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPanesEdit_tbl1selecProdModif_tbl
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPanesEdit_tbl1selecProdModif_tbl

    private void listaPanesEdit_tbl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPanesEdit_tbl1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPanesEdit_tbl1KeyPressed

    private void txt_precioInsumoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioInsumoEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioInsumoEditKeyPressed

    private void txt_nombreInsumosEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumosEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumosEditKeyPressed

    private void chbx_selecEditInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbx_selecEditInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbx_selecEditInsumoActionPerformed

    private void txt_nombreInsumoConsultEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumoConsultEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoConsultEditKeyPressed

    private void btn_consultInsumoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultInsumoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultInsumoEditActionPerformed

    private void btn_EditInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditInsumoActionPerformed

    private void btn_EliminarEditInsumomodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarEditInsumomodificarPan
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarEditInsumomodificarPan

    private void btn_cancelBusqInsumoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelBusqInsumoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelBusqInsumoEditActionPerformed

    private void btn_cancelarEditInsumo1modificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarEditInsumo1modificarPan
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarEditInsumo1modificarPan

    private void tbl_listaInsumoVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaInsumoVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_listaInsumoVentaMouseClicked

    private void txt_nombreInsumoConsultVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreInsumoConsultVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoConsultVentaActionPerformed

    private void txt_nombreInsumoConsultVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreInsumoConsultVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoConsultVentaKeyPressed

    private void btn_consultInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultInsumoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultInsumoVentaActionPerformed

    private void tbl_listaInsumoConsultVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_listaInsumoConsultVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_listaInsumoConsultVentasMouseClicked

    private void txt_nombreInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreInsumoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreInsumoVentaActionPerformed

    private void txt_cantidadInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadInsumoVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadInsumoVentaKeyPressed

    private void btn_agregarInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarInsumoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarInsumoVentaActionPerformed

    private void retirarInsumoVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarInsumoVenta_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retirarInsumoVenta_btnActionPerformed

    private void comprarInsumoVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarInsumoVenta_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprarInsumoVenta_btnActionPerformed

    private void cancelarInsumoVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInsumoVenta_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarInsumoVenta_btnActionPerformed

    private void txt_pagoClientInsumoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pagoClientInsumoVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pagoClientInsumoVentaKeyPressed

    private void txt_totalProdInsumoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalProdInsumoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalProdInsumoVentaActionPerformed

    private void btn_cancelarBusquedaInsumoVentamodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarBusquedaInsumoVentamodificarPan
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarBusquedaInsumoVentamodificarPan

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < listaPanesEdit_tbl.getSelectedRows().length; i++) {
            System.out.println(listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRows()[i], 0).toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    //Este Metodo Sirve para listar todo
    private void ListAll() {
        Listar((DefaultTableModel) listaPanesReg_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaPanesEdit_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaPanesEliminar_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaPanesConsult_tbl.getModel(), Proco.ReadAll());
        Listar((DefaultTableModel) listaProveedorReg_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProveedoresEdit_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProvConsult_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProvEliminar_tbl.getModel(), Proveeco.ReadAll());
        Listar((DefaultTableModel) listaProdConsultVentas_tbl.getModel(), Proco.ReadVenta());
        ComboBoxList(provePanReg_cmbx, Proveeco.getLista_proovedor());
        ComboBoxList(provePanEdit_cmbx, Proveeco.getLista_proovedor());
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

    //envento del enter
    private void EventoEnter(java.awt.event.KeyEvent evt, JButton boton) {
        if (evt.getKeyChar() == ENTER) {
            boton.doClick();
        }
    }

    //Metodo para buscar en todos las tablas
    private void BuscarAll(String Filter, JTable Tabla, ArrayList Array, JButton Cancelar) {
        //Valido la entrada del buscar
        if (Filter.isEmpty() || Filter == null) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados deben ser validos", "Error", 0);
        } else {
            if (Array.size() <= 0 || Array == null) {
                JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "No se han encontrado", 1);
            } else {
                Listar((DefaultTableModel) Tabla.getModel(), Array);
                Cancelar.setEnabled(true);
            }
        }
    }

    //Metodo para habilitar o deshabilitar los botones del modificar
    private void EnabledBtn(JButton Mod, JButton Save, JButton Cancel, boolean Cond) {
        Mod.setEnabled(Cond);
        Save.setEnabled(Cond);
        Cancel.setEnabled(Cond);
    }

    //Metodo para habilitar o deshabilitar los Jtextfield del modificar producto
    private void EnabledTxt_Producto(JTextField Nombre, JTextField Precio, JComboBox Cb, boolean Cond) {
        Nombre.setEnabled(Cond);
        Precio.setEnabled(Cond);
        Cb.setEnabled(Cond);
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
    private javax.swing.JTextField ConsultVentas_txt;
    private javax.swing.JPanel Consultar_Producto;
    private javax.swing.JPanel Consultar_Proveedores;
    private javax.swing.JTabbedPane Contenedor_Stast;
    private javax.swing.JButton EditPan_btn;
    private javax.swing.JButton EditProv_btn;
    private javax.swing.JButton EliminarProv_btn;
    private javax.swing.JButton EliminarVentas_btn;
    private javax.swing.JPanel Eliminar_Producto;
    private javax.swing.JPanel Eliminar_Proveedores;
    private javax.swing.JPanel Estadisticas;
    private javax.swing.JButton GuardarEditPan_btn;
    private javax.swing.JButton GuardarEditProv_btn;
    private javax.swing.JPanel Historial_ventas;
    private javax.swing.JPanel Insumos;
    private javax.swing.JPanel Modificar_Insumo;
    private javax.swing.JPanel Modificar_Producto;
    private javax.swing.JPanel Modificar_Proveedores;
    private javax.swing.JTabbedPane Panel_General;
    private javax.swing.JPanel PreCompra;
    private javax.swing.JTabbedPane Productos;
    private javax.swing.JTabbedPane Proveedores;
    private javax.swing.JPanel Registrar_Insumo;
    private javax.swing.JPanel Registrar_Producto;
    private javax.swing.JPanel Registrar_Proveedores;
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton agregarProdVenta_btn;
    private javax.swing.JButton btn_EditInsumo;
    private javax.swing.JButton btn_EliminarEditInsumo;
    private javax.swing.JButton btn_GuardarEditInsumo;
    private javax.swing.JButton btn_agregarInsumoVenta;
    private javax.swing.JButton btn_cancelBusqInsumoEdit;
    private javax.swing.JButton btn_cancelarBusquedaInsumoVenta;
    private javax.swing.JButton btn_cancelarEditInsumo1;
    private javax.swing.JButton btn_consultInsumoEdit;
    private javax.swing.JButton btn_consultInsumoVenta;
    private javax.swing.JButton btn_registrarInsumo;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JButton consultVentas_btn;
    private javax.swing.JTextField direcProvEdit_txt;
    private javax.swing.JTextField direcProvReg_txt;
    private javax.swing.JButton eliminarPan_btn;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable listaPanesConsult_tbl;
    private javax.swing.JTable listaPanesEdit_tbl;
    private javax.swing.JTable listaPanesEdit_tbl1;
    private javax.swing.JTable listaPanesEliminar_tbl;
    private javax.swing.JTable listaPanesReg_tbl;
    private javax.swing.JTable listaProdConsultVentas_tbl;
    private javax.swing.JTable listaProdVenta_tbl;
    private javax.swing.JTable listaProdVenta_tbl1;
    private javax.swing.JTable listaProdVenta_tbl2;
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
    private javax.swing.JTextField pagoClientVenta_txt;
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
    private javax.swing.JCheckBox selecEliminarVentas_chbx;
    private javax.swing.JCheckBox selecPanEliminar_chbx;
    private javax.swing.JCheckBox selecProdConsultVenta_chbx;
    private javax.swing.JCheckBox selecProdVenta_chbx;
    private javax.swing.JTextField serviProvEdit_txt;
    private javax.swing.JTextField serviProvReg_txt;
    private javax.swing.JTable tbl_listaInsumoConsultVentas;
    private javax.swing.JTable tbl_listaInsumoVenta;
    private javax.swing.JTable tbl_listaInsumosReg;
    private javax.swing.JTextField telefonoProvEdit_txt;
    private javax.swing.JTextField telefonoProvReg_txt;
    private javax.swing.JTextField totalProdVenta;
    private javax.swing.JTextField txt_cantidadInsumoVenta;
    private javax.swing.JTextField txt_nombreInsumoConsultEdit;
    private javax.swing.JTextField txt_nombreInsumoConsultVenta;
    private javax.swing.JTextField txt_nombreInsumoReg;
    private javax.swing.JTextField txt_nombreInsumoVenta;
    private javax.swing.JTextField txt_nombreInsumosEdit;
    private javax.swing.JTextField txt_pagoClientInsumoVenta;
    private javax.swing.JTextField txt_precioInsumoEdit;
    private javax.swing.JTextField txt_precioInsumoReg;
    private javax.swing.JTextField txt_totalProdInsumoVenta;
    // End of variables declaration//GEN-END:variables

}
