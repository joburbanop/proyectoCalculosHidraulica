/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import hidraulica.*;
import java.util.Set;
import javax.swing.JTextField;
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
//esta clase es hija de la clase padre JFrame
public class Interfaz extends javax.swing.JFrame {
    /*---------------
    *Atributos 
    *-----------------*/
    //controla la posicion donde se van a ingresar los datos
    private static int  posicion=1;
    
    //permite realizar comparaciones 
    private static String cadena;
    
    //guarda el valor de canal que se ingreso 
    private static double valorCanal;
    
    //gurda el valor de caudal que se ingreso
    private static double valorCaudal;
    
    //guarda el valor de profundidad que se ingreso 
    private static double valorProfundidad;
    
    //relacion que se convierte en objeto y no permite acceder en cualquier parte 
    // de esta clase
    private static Hidraulica hidraulica1;
    
    //controla los eventos de movimiento 
    private static int enviarSalida=0;
   
    
    /**
     * nueva interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    /*----------------------------
     * Metodos
     *---------------------------*/
    
    /**
     * retorna el icono de la barra de tereas 
     * @return icono
     */
    public  Image getIconImage()
    {
       Image icono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
       return icono;
    }

    /**
     * polimorfismo, sobre escritura 
     * del metodo que crea formularios 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controles = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        datosIngresar = new javax.swing.JPanel();
        resalto = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        BorrarTodo = new javax.swing.JButton();
        txtPantallaIngresoProfundidad = new javax.swing.JTextField();
        txtPantallaIngresoCanal = new javax.swing.JTextField();
        txtPantallaIngresoCaudal = new javax.swing.JTextField();
        ingresarDatos = new javax.swing.JLabel();
        canalAncho = new javax.swing.JLabel();
        caudal = new javax.swing.JLabel();
        profundidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        resultado = new javax.swing.JPanel();
        txtPantallaSalidaV1 = new javax.swing.JTextField();
        txtPantallaSalidaFR1 = new javax.swing.JTextField();
        txtPantallaSalidaY2 = new javax.swing.JTextField();
        txtPantallaSalidaV2 = new javax.swing.JTextField();
        txtPantallaSalidaE1 = new javax.swing.JTextField();
        txtPantallaSalidaE2 = new javax.swing.JTextField();
        txtPantallaSalidaNe = new javax.swing.JTextField();
        eficiencia = new javax.swing.JTextField();
        txtPantallaSalidaNRH = new javax.swing.JTextField();
        v1 = new javax.swing.JLabel();
        fr1 = new javax.swing.JLabel();
        V2 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        L2 = new javax.swing.JTextField();
        l3 = new javax.swing.JTextField();
        l1 = new javax.swing.JTextField();
        resultados = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        txtEficiencia = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        txtL3 = new javax.swing.JLabel();
        txtL2 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        controles.setBackground(new java.awt.Color(204, 204, 204));
        controles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        controles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        controles.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 70, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        controles.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 80, 50));

        getContentPane().add(controles, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 770, 60));

        datosIngresar.setBackground(new java.awt.Color(0, 0, 0));
        datosIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        datosIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resalto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        resalto.setForeground(new java.awt.Color(255, 255, 255));
        resalto.setText("Tipo de resalto hidráulico");
        datosIngresar.add(resalto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 30));

        tipo.setEditable(false);
        tipo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        datosIngresar.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 150, 30));

        BorrarTodo.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BorrarTodo.setText("borar todo");
        BorrarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarTodoMouseClicked(evt);
            }
        });
        datosIngresar.add(BorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, 30));

        txtPantallaIngresoProfundidad.setEditable(false);
        txtPantallaIngresoProfundidad.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtPantallaIngresoProfundidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaIngresoProfundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaIngresoProfundidadActionPerformed(evt);
            }
        });
        datosIngresar.add(txtPantallaIngresoProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 120, 30));

        txtPantallaIngresoCanal.setEditable(false);
        txtPantallaIngresoCanal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaIngresoCanal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaIngresoCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaIngresoCanalActionPerformed(evt);
            }
        });
        datosIngresar.add(txtPantallaIngresoCanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, 30));

        txtPantallaIngresoCaudal.setEditable(false);
        txtPantallaIngresoCaudal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaIngresoCaudal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtPantallaIngresoCaudal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaIngresoCaudalActionPerformed(evt);
            }
        });
        datosIngresar.add(txtPantallaIngresoCaudal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 120, 30));

        ingresarDatos.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        ingresarDatos.setForeground(new java.awt.Color(255, 255, 255));
        ingresarDatos.setText("Ingresar Datos (unidades C.G.S.)");
        ingresarDatos.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        ingresarDatos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ingresarDatosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        datosIngresar.add(ingresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 260, 60));

        canalAncho.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        canalAncho.setForeground(new java.awt.Color(255, 255, 255));
        canalAncho.setText("Ancho canal");
        datosIngresar.add(canalAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, 20));

        caudal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        caudal.setForeground(new java.awt.Color(255, 255, 255));
        caudal.setText("Caudal");
        datosIngresar.add(caudal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 20));

        profundidad.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        profundidad.setForeground(new java.awt.Color(255, 255, 255));
        profundidad.setText("Profundidad inicial");
        datosIngresar.add(profundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 31));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 31));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, 31));

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 31));

        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, 31));

        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, 31));

        jButton7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 31));

        jButton8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 31));

        jButton9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, 31));

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        datosIngresar.add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 40, 30));

        jButtonEnter.setText("Enter");
        jButtonEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEnterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonEnterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonEnterMouseReleased(evt);
            }
        });
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });
        datosIngresar.add(jButtonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 70, 30));

        Borrar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        datosIngresar.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 100, 30));

        Punto.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Punto.setText(".");
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });
        datosIngresar.add(Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 50, 30));

        enviar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        enviar.setText("Calcular");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        datosIngresar.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        datosIngresar.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/datos.png"))); // NOI18N
        datosIngresar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 8, 150, 140));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        datosIngresar.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 790, 270));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FondoMouseClicked(evt);
            }
        });
        datosIngresar.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 260));

        getContentPane().add(datosIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 770, 520));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        resultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPantallaSalidaV1.setEditable(false);
        txtPantallaSalidaV1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaV1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        txtPantallaSalidaV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaV1ActionPerformed(evt);
            }
        });
        resultado.add(txtPantallaSalidaV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        txtPantallaSalidaFR1.setEditable(false);
        txtPantallaSalidaFR1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaFR1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        txtPantallaSalidaFR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaFR1ActionPerformed(evt);
            }
        });
        resultado.add(txtPantallaSalidaFR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        txtPantallaSalidaY2.setEditable(false);
        txtPantallaSalidaY2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaY2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        resultado.add(txtPantallaSalidaY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        txtPantallaSalidaV2.setEditable(false);
        txtPantallaSalidaV2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaV2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        txtPantallaSalidaV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaV2ActionPerformed(evt);
            }
        });
        resultado.add(txtPantallaSalidaV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        txtPantallaSalidaE1.setEditable(false);
        txtPantallaSalidaE1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaE1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        txtPantallaSalidaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaE1ActionPerformed(evt);
            }
        });
        resultado.add(txtPantallaSalidaE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        txtPantallaSalidaE2.setEditable(false);
        txtPantallaSalidaE2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaE2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.darkGray));
        resultado.add(txtPantallaSalidaE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        txtPantallaSalidaNe.setEditable(false);
        txtPantallaSalidaNe.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaNe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        txtPantallaSalidaNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaNeActionPerformed(evt);
            }
        });
        resultado.add(txtPantallaSalidaNe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        eficiencia.setEditable(false);
        eficiencia.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        eficiencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        eficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eficienciaActionPerformed(evt);
            }
        });
        resultado.add(eficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 110, 30));

        txtPantallaSalidaNRH.setEditable(false);
        txtPantallaSalidaNRH.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtPantallaSalidaNRH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        txtPantallaSalidaNRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaNRHActionPerformed(evt);
            }
        });
        resultado.add(txtPantallaSalidaNRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 100, 30));

        v1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        v1.setText("V1");
        resultado.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        fr1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        fr1.setText("FR1");
        resultado.add(fr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        V2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        V2.setText("V2");
        resultado.add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 20, 20));

        Y2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Y2.setText("Y2");
        resultado.add(Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        E1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E1.setForeground(new java.awt.Color(51, 51, 51));
        E1.setText("E1");
        resultado.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        E2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E2.setText("E2");
        resultado.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, 10));

        L2.setEditable(false);
        L2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        L2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        resultado.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 180, 90, 30));

        l3.setEditable(false);
        l3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3ActionPerformed(evt);
            }
        });
        resultado.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 220, 90, 30));

        l1.setEditable(false);
        l1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        l1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });
        resultado.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 130, 90, 30));

        resultados.setBackground(new java.awt.Color(255, 255, 255));
        resultados.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        resultados.setText("resultados");
        resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultadosMouseClicked(evt);
            }
        });
        resultado.add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 100, 30));

        E3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E3.setText("Pérdida de energia");
        resultado.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, 20));

        E4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E4.setText("nRH");
        resultado.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, 20));

        E5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E5.setText("nE");
        resultado.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, 20));

        txtEficiencia.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtEficiencia.setForeground(new java.awt.Color(255, 255, 255));
        txtEficiencia.setText("perdida de energia ");
        resultado.add(txtEficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 254, -1, 40));

        L1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        L1.setText("L1");
        resultado.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 130, 20, 50));

        txtL3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtL3.setText("L3");
        resultado.add(txtL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 220, 20, 30));

        txtL2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        txtL2.setText("L2");
        resultado.add(txtL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 180, 20, 20));

        E6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.png"))); // NOI18N
        resultado.add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 280));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otra.png"))); // NOI18N
        resultado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 140, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otra.png"))); // NOI18N
        resultado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 180, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otra.png"))); // NOI18N
        resultado.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otra.png"))); // NOI18N
        resultado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 170, 320));

        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        
        
        //es donde pasa toda la magia :)
        // crea un objeto de la clase hidraulica se pasa por argumetos 
        // todos los elementos necesarios para el funcionamiento de este objeto 
        if (!"".equals(txtPantallaIngresoCanal.getText()) 
            && !"".equals(txtPantallaIngresoCaudal.getText()) 
            && !"".equals(txtPantallaIngresoProfundidad.getText()))
        {
            valorCanal=Double.parseDouble(txtPantallaIngresoCanal.getText());
            valorCaudal=Double.parseDouble(txtPantallaIngresoCaudal.getText());
            valorProfundidad=Double.parseDouble(txtPantallaIngresoProfundidad.getText());
            
            Hidraulica hidraulica1=new Hidraulica(valorCaudal,valorCanal,valorProfundidad);
           
            txtPantallaSalidaV1.setText(String.valueOf(hidraulica1.calcularVelocidad()+" cm/s"));
            txtPantallaSalidaFR1.setText(String.valueOf(hidraulica1.FR1()));
            
            
            txtPantallaSalidaY2.setText(String.valueOf(hidraulica1.Y2()+" cm"));
            txtPantallaSalidaV2.setText(String.valueOf(hidraulica1.velocidad2()+" cm/s"));
            txtPantallaSalidaE1.setText(String.valueOf(hidraulica1.E1()+" cm"));
            txtPantallaSalidaE2.setText(String.valueOf(hidraulica1.E2()+" cm"));
            txtPantallaSalidaNRH.setText(String.valueOf(hidraulica1.nRH()));
            txtPantallaSalidaNe.setText(String.valueOf(hidraulica1.nE()));
            l1.setText(String.valueOf(hidraulica1.l1()+" cm"));
            L2.setText(String.valueOf(hidraulica1.l2()+" cm"));
            l3.setText(String.valueOf(hidraulica1.l3()+" cm"));
            eficiencia.setText(String.valueOf(hidraulica1.peridaEnergia()+" cm"));
            if(hidraulica1.FR1()==1)
            {
                tipo.setText(" No hay resalto");
            }
            else if(hidraulica1.FR1()>1 && hidraulica1.FR1()<1.7)
            {
                tipo.setText(" Resalto Ondular ");
                
            }
            else if (hidraulica1.FR1()>1.7 && hidraulica1.FR1()<2.5)
            {
                tipo.setText(" Resalto Débil");
            }
            else if (hidraulica1.FR1()>2.5 && hidraulica1.FR1()<4.5)
            {
                tipo.setText(" Resalto Oscilante");
            }
            else if (hidraulica1.FR1()>4.5 && hidraulica1.FR1()<9.0)
            {
                tipo.setText(" Resalto Estable");
            }
            else if (hidraulica1.FR1()>9.0)
            {
                tipo.setText(" Resalto Fuerte");
            }
            else
            {
                tipo.setText(" Sin clasificacion");
            }
             
        }
        else
        {
            JOptionPane.showMessageDialog(Icono, "datos incompletos ");
        }
      
    }//GEN-LAST:event_enviarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"7");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"7");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"7");
        }
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"4");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"4");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"4");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"8");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"8");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"8");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"5");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"5");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"5");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"6");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"6");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"6");
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"9");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"9");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"9");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"1");
        }
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"1");
        }
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        //-----------------------------------------------    
         if (posicion==1)
        {  
           cadena=txtPantallaIngresoCanal.getText();
           
           if(cadena.length()>0)
           {    
                /*
                *se quita la ultima posicion de la cadena
                *lo que equivale a borrar
                */
               cadena=cadena.substring(0, cadena.length()-1);
               txtPantallaIngresoCanal.setText(cadena);
           }
           
           
        }
         //--------------------------------
        if (posicion==2)
        {
           
            cadena=txtPantallaIngresoCaudal.getText();
           
           if(cadena.length()>0)
           {    
                /*
                *se quita la ultima posicion de la cadena
                *lo que equivale a borrar
                */
               cadena=cadena.substring(0, cadena.length()-1);
               txtPantallaIngresoCaudal.setText(cadena);
           }
        }
        //----------------------------------------
        if(posicion==3)
        
        {
            
            cadena=txtPantallaIngresoProfundidad.getText();
           
           if(cadena.length()>0)
           {    
                /*
                *se quita la ultima posicion de la cadena
                *lo que equivale a borrar
                */
               cadena=cadena.substring(0, cadena.length()-1);
               txtPantallaIngresoProfundidad.setText(cadena);
           }
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void txtPantallaSalidaV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaV2ActionPerformed
        
    }//GEN-LAST:event_txtPantallaSalidaV2ActionPerformed

    private void ingresarDatosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ingresarDatosAncestorAdded
   
    }//GEN-LAST:event_ingresarDatosAncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"3");
        }
         //----------------------
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"3");
        }
        //-------------------------------
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"3");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"2");
        }
         //------------------------
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"2");
        }
        //------------------------------
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"2");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPantallaSalidaNRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaNRHActionPerformed
       
    }//GEN-LAST:event_txtPantallaSalidaNRHActionPerformed

    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3ActionPerformed
        
    }//GEN-LAST:event_l3ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
       
    }//GEN-LAST:event_l1ActionPerformed

    private void txtPantallaIngresoCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaIngresoCanalActionPerformed
      
    }//GEN-LAST:event_txtPantallaIngresoCanalActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        
         if (posicion==1)
        {
           txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+"0");
        }
         //-----------------------------
        if (posicion==2)
        {
            txtPantallaIngresoCaudal.setText(txtPantallaIngresoCaudal.getText()+"0");
        }
        //------------------
        if(posicion==3)
        {
            txtPantallaIngresoProfundidad.setText(txtPantallaIngresoProfundidad.getText()+"0");
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
         
        if (posicion==1)
        {
           cadena=txtPantallaIngresoCanal.getText();
           if(cadena.length()<=0)
           {
               txtPantallaIngresoCanal.setText("0.");
           }
           else
           {
               txtPantallaIngresoCanal.setText( txtPantallaIngresoCanal.getText()+".");
           }
           
        }
        //-----------------------------------------------------------------------------
        if (posicion==2)
        {
          
            cadena=txtPantallaIngresoCaudal.getText();
           if(cadena.length()<=0)
           {
               txtPantallaIngresoCaudal.setText("0.");
           }
           else
           {
               txtPantallaIngresoCaudal.setText( txtPantallaIngresoCaudal.getText()+".");
           }
        }
        //----------------------------------------------------------------------------
        if(posicion==3)
        {
            
             cadena=txtPantallaIngresoProfundidad.getText();
           if(cadena.length()<=0)
           {
               txtPantallaIngresoProfundidad.setText("0.");
           }
           else
           {
               txtPantallaIngresoProfundidad.setText( txtPantallaIngresoProfundidad.getText()+".");
           }
        }
    }//GEN-LAST:event_PuntoActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
  
        /*
         *controla las pantallas de intreso de texto 
         * todo para que estas sean llenas resoetivamente
         */
         int aumentar=Interfaz.posicion++;
        if (aumentar==3)
        {
            posicion=1;
        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void eficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eficienciaActionPerformed
      
    }//GEN-LAST:event_eficienciaActionPerformed

    private void txtPantallaSalidaV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaV1ActionPerformed
      
    }//GEN-LAST:event_txtPantallaSalidaV1ActionPerformed

    private void txtPantallaSalidaFR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaFR1ActionPerformed
       
    }//GEN-LAST:event_txtPantallaSalidaFR1ActionPerformed

    private void txtPantallaSalidaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaE1ActionPerformed
      
    }//GEN-LAST:event_txtPantallaSalidaE1ActionPerformed

    private void txtPantallaSalidaNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaNeActionPerformed
       
    }//GEN-LAST:event_txtPantallaSalidaNeActionPerformed

    private void resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosMouseClicked
       
    }//GEN-LAST:event_resultadosMouseClicked

    private void jButtonEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMouseClicked
      
    }//GEN-LAST:event_jButtonEnterMouseClicked

    private void jButtonEnterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMousePressed
     
    }//GEN-LAST:event_jButtonEnterMousePressed

    private void jButtonEnterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMouseReleased
      
    }//GEN-LAST:event_jButtonEnterMouseReleased

    private void FondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMouseClicked
        
    }//GEN-LAST:event_FondoMouseClicked

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        
        //  Longuitudes
        AnimationClass longuitud1=new AnimationClass();
        longuitud1.jLabelXRight(-30, 10, 2, 2, L1);
        
        AnimationClass longuitud2=new AnimationClass();
        longuitud2.jLabelXRight(-30, 10, 2, 2, txtL2);
        
        AnimationClass longuitud3=new AnimationClass();
        longuitud3.jLabelXRight(-30, 10, 2, 2, txtL3);
        
        //------------------------------------------------------
        //Resultados
        AnimationClass resultado1=new AnimationClass();
        resultado1.jTextFieldXRight(-100, 30, 10, 5, l1);
        
        AnimationClass resultado2=new AnimationClass();
        resultado2.jTextFieldXRight(-100, 30, 10, 5, L2);
        
        AnimationClass resultado3=new AnimationClass();
        resultado3.jTextFieldXRight(-100, 30, 10, 5, l3);
        
        //-----------------------------------------------
        //jLabelResulatso 
        AnimationClass jLabelresultado=new AnimationClass();
        jLabelresultado.jLabelYUp(580, 50, 10, 5, resultados);
        
        //---------------------------------------------------
        //V1
        AnimationClass V1=new AnimationClass();
        V1.jLabelYUp(580, 130, 10, 5, v1);
        
        AnimationClass v1Pantalla=new AnimationClass();
        v1Pantalla.jTextFieldYUp(580, 130, 10, 5, txtPantallaSalidaV1);
        
        
         //---------------------------------------------------
        //FR1
        AnimationClass FR1=new AnimationClass();
        FR1.jLabelYUp(580, 180, 10, 5, fr1);
        
        AnimationClass FR1Pantalla=new AnimationClass();
        FR1Pantalla.jTextFieldYUp(580, 180, 10, 5, txtPantallaSalidaFR1);
        
         //---------------------------------------------------
        //Y2
        AnimationClass y2=new AnimationClass();
        y2.jLabelYUp(580, 230, 10, 5, Y2);
        
        AnimationClass y2Pantalla=new AnimationClass();
        y2Pantalla.jTextFieldYUp(580, 230, 10, 5, txtPantallaSalidaY2);
        
        
         //---------------------------------------------------
        //e1
        AnimationClass e1=new AnimationClass();
        e1.jLabelYUp(580, 280, 10, 5, E1);
        
        AnimationClass e1Pantalla=new AnimationClass();
        e1Pantalla.jTextFieldYUp(580, 280, 10, 5, txtPantallaSalidaE1);
        
        //---------------------------------------------------
        //V2
        AnimationClass v2=new AnimationClass();
        v2.jLabelYUp(580, 330, 10, 5, V2);
        
        AnimationClass v2Pantalla=new AnimationClass();
        v2Pantalla.jTextFieldYUp(580, 330, 10, 5, txtPantallaSalidaV2);
        
        
         //---------------------------------------------------
        //E2
        AnimationClass e2=new AnimationClass();
        e2.jLabelYUp(580, 380, 10, 5, E2);
        
        AnimationClass E2Pantalla=new AnimationClass();
        E2Pantalla.jTextFieldYUp(580, 380, 10, 5, txtPantallaSalidaE2);
        
         //---------------------------------------------------
        //NRH
        AnimationClass NRH=new AnimationClass();
        NRH.jLabelYUp(580, 430, 10, 5, E4);
        
        AnimationClass NRHPantalla=new AnimationClass();
        NRHPantalla.jTextFieldYUp(580, 430, 10, 5, txtPantallaSalidaNRH);
        
        
         //---------------------------------------------------
        //NE
        AnimationClass e5=new AnimationClass();
        e5.jLabelYUp(580, 480, 10, 5, E5);
        
        AnimationClass e5Pantalla=new AnimationClass();
        e5Pantalla.jTextFieldYUp(580, 480, 10, 5, txtPantallaSalidaNe);
        
        //---------------------------------------------------
        //eficiencia
        AnimationClass EFICIENCIA=new AnimationClass();
        EFICIENCIA.jLabelYUp(580, 530, 10, 5, E3);
        
        AnimationClass e3Pantalla=new AnimationClass();
        e3Pantalla.jTextFieldYUp(580, 530, 10, 5, eficiencia);
    }//GEN-LAST:event_enviarMouseClicked

    private void txtPantallaIngresoProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaIngresoProfundidadActionPerformed
     
    }//GEN-LAST:event_txtPantallaIngresoProfundidadActionPerformed

    private void txtPantallaIngresoCaudalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaIngresoCaudalActionPerformed
       
    }//GEN-LAST:event_txtPantallaIngresoCaudalActionPerformed

    private void BorrarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarTodoMouseClicked
        AnimationClass borrar1=new AnimationClass();
        borrar1.jTextFieldXLeft(30, -100, 10, 5, l1);
        
        AnimationClass borrar2=new AnimationClass();
        borrar2.jTextFieldXLeft(30, -100, 10, 5, L2);
        
        AnimationClass borrar3=new AnimationClass();
        borrar3.jTextFieldXLeft(30, -100, 10, 5, l3);
        
        //------------------------------------------------------
        //Resultados
        //  Longuitudes
        AnimationClass longuitud1=new AnimationClass();
        longuitud1.jLabelXLeft(10, -30, 2, 2, L1);
        
        AnimationClass longuitud2=new AnimationClass();
        longuitud2.jLabelXLeft(10, -30, 2, 2, txtL2);
        
        AnimationClass longuitud3=new AnimationClass();
        longuitud3.jLabelXLeft(10, -30, 2, 2, txtL3);
        
        //-----------------------------------------------
        //jLabelResulatso 
        AnimationClass jLabelresultado=new AnimationClass();
        jLabelresultado.jLabelYDown(50, 580, 10, 5, resultados);
        
        //---------------------------------------------------
        //V1
        AnimationClass V1=new AnimationClass();
        V1.jLabelYDown(130, 580, 10, 5, v1);
        
        AnimationClass v1Pantalla=new AnimationClass();
        v1Pantalla.jTextFieldYDown(130, 580, 10, 5, txtPantallaSalidaV1);
        
        
         //---------------------------------------------------
        //FR1
        AnimationClass FR1=new AnimationClass();
        FR1.jLabelYDown(180, 580, 10, 5, fr1);
        
        AnimationClass FR1Pantalla=new AnimationClass();
        FR1Pantalla.jTextFieldYDown(180, 580, 10, 5, txtPantallaSalidaFR1);
        
         //---------------------------------------------------
        //Y2
        AnimationClass y2=new AnimationClass();
        y2.jLabelYDown(230, 580, 10, 5, Y2);
        
        AnimationClass y2Pantalla=new AnimationClass();
        y2Pantalla.jTextFieldYDown(230, 580, 10, 5, txtPantallaSalidaY2);
        
        
         //---------------------------------------------------
        //e1
        AnimationClass e1=new AnimationClass();
        e1.jLabelYDown(280, 580, 10, 5, E1);
        
        AnimationClass e1Pantalla=new AnimationClass();
        e1Pantalla.jTextFieldYDown(280, 580, 10, 5, txtPantallaSalidaE1);
        
        //---------------------------------------------------
        //V2
        AnimationClass v2=new AnimationClass();
        v2.jLabelYDown(330, 580, 10, 5, V2);
        
        AnimationClass v2Pantalla=new AnimationClass();
        v2Pantalla.jTextFieldYDown(330, 580, 10, 5, txtPantallaSalidaV2);
        
        
         //---------------------------------------------------
        //E2
        AnimationClass e2=new AnimationClass();
        e2.jLabelYDown(380, 580, 10, 5, E2);
        
        AnimationClass E2Pantalla=new AnimationClass();
        E2Pantalla.jTextFieldYDown(380, 580, 10, 5, txtPantallaSalidaE2);
        
         //---------------------------------------------------
        //NRH
        AnimationClass NRH=new AnimationClass();
        NRH.jLabelYDown(430, 580, 10, 5, E4);
        
        AnimationClass NRHPantalla=new AnimationClass();
        NRHPantalla.jTextFieldYUp(430, 580, 10, 5, txtPantallaSalidaNRH);
        
        
         //---------------------------------------------------
        //NE
        AnimationClass e5=new AnimationClass();
        e5.jLabelYDown(480, 580, 10, 5, E5);
        
        AnimationClass e5Pantalla=new AnimationClass();
        e5Pantalla.jTextFieldYDown(480, 580, 10, 5, txtPantallaSalidaNe);
        
        //---------------------------------------------------
        //eficiencia
        AnimationClass EFICIENCIA=new AnimationClass();
        EFICIENCIA.jLabelYDown(530, 580, 10, 5, E3);
        
        AnimationClass e3Pantalla=new AnimationClass();
        e3Pantalla.jTextFieldYDown(530, 580, 10, 5, eficiencia);
        txtPantallaIngresoCanal.setText("");
        txtPantallaIngresoCaudal.setText("");
        txtPantallaIngresoProfundidad.setText("");
        txtPantallaSalidaV1.setText("");
        txtPantallaSalidaFR1.setText("");
        txtPantallaSalidaY2.setText("");
        txtPantallaSalidaV2.setText("");
        txtPantallaSalidaE1.setText("");
        txtPantallaSalidaE2.setText("");
        txtPantallaSalidaNRH.setText("");
        txtPantallaSalidaNe.setText("");
        l1.setText("");
        L2.setText("");
        l3.setText("");
        eficiencia.setText("");
        tipo.setText("");
  
    }//GEN-LAST:event_BorrarTodoMouseClicked

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        
    }//GEN-LAST:event_tipoActionPerformed

    private void jButtonEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMouseEntered

    }//GEN-LAST:event_jButtonEnterMouseEntered

    private void jButtonEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMouseExited

    }//GEN-LAST:event_jButtonEnterMouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int dialog=JOptionPane.YES_NO_OPTION;
        int result=JOptionPane.showConfirmDialog(null, "Desea salir?","Exit",dialog);
        if (result==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setState(Interfaz.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * funcion principal
     * @param args 
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* vrea u muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    //atributos 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton BorrarTodo;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel L1;
    private javax.swing.JTextField L2;
    private javax.swing.JButton Punto;
    private javax.swing.JLabel V2;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel canalAncho;
    private javax.swing.JLabel caudal;
    private javax.swing.JPanel controles;
    private javax.swing.JPanel datosIngresar;
    private javax.swing.JTextField eficiencia;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fr1;
    private javax.swing.JLabel ingresarDatos;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField l1;
    private javax.swing.JTextField l3;
    private javax.swing.JLabel profundidad;
    private javax.swing.JLabel resalto;
    private javax.swing.JPanel resultado;
    private javax.swing.JLabel resultados;
    private javax.swing.JTextField tipo;
    private javax.swing.JLabel txtEficiencia;
    private javax.swing.JLabel txtL2;
    private javax.swing.JLabel txtL3;
    private javax.swing.JTextField txtPantallaIngresoCanal;
    private javax.swing.JTextField txtPantallaIngresoCaudal;
    private javax.swing.JTextField txtPantallaIngresoProfundidad;
    private javax.swing.JTextField txtPantallaSalidaE1;
    private javax.swing.JTextField txtPantallaSalidaE2;
    private javax.swing.JTextField txtPantallaSalidaFR1;
    private javax.swing.JTextField txtPantallaSalidaNRH;
    private javax.swing.JTextField txtPantallaSalidaNe;
    private javax.swing.JTextField txtPantallaSalidaV1;
    private javax.swing.JTextField txtPantallaSalidaV2;
    private javax.swing.JTextField txtPantallaSalidaY2;
    private javax.swing.JLabel v1;
    // End of variables declaration//GEN-END:variables
}