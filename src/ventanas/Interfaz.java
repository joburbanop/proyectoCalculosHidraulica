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
    
    //controla el envento calcular
    private static int eventoCalcular=0;
    
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

        canalAncho = new javax.swing.JLabel();
        caudal = new javax.swing.JLabel();
        profundidad = new javax.swing.JLabel();
        txtPantallaIngresoCanal = new javax.swing.JTextField();
        txtPantallaIngresoCaudal = new javax.swing.JTextField();
        txtPantallaIngresoProfundidad = new javax.swing.JTextField();
        txtPantallaSalidaV1 = new javax.swing.JTextField();
        txtPantallaSalidaFR1 = new javax.swing.JTextField();
        txtPantallaSalidaY2 = new javax.swing.JTextField();
        txtPantallaSalidaV2 = new javax.swing.JTextField();
        txtPantallaSalidaE1 = new javax.swing.JTextField();
        txtPantallaSalidaE2 = new javax.swing.JTextField();
        txtPantallaSalidaNRH = new javax.swing.JTextField();
        txtPantallaSalidaNe = new javax.swing.JTextField();
        eficiencia = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        l1 = new javax.swing.JTextField();
        L2 = new javax.swing.JTextField();
        l3 = new javax.swing.JTextField();
        ingresarDatos = new javax.swing.JLabel();
        resultados = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        fr1 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        V2 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        NRH = new javax.swing.JLabel();
        ne = new javax.swing.JLabel();
        txtL1 = new javax.swing.JLabel();
        txtL2 = new javax.swing.JLabel();
        txtL3 = new javax.swing.JLabel();
        txtEficiencia = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        canalAncho.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        canalAncho.setForeground(new java.awt.Color(255, 255, 255));
        canalAncho.setText("canal");
        getContentPane().add(canalAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        caudal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        caudal.setForeground(new java.awt.Color(255, 255, 255));
        caudal.setText("caudal");
        getContentPane().add(caudal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        profundidad.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        profundidad.setForeground(new java.awt.Color(255, 255, 255));
        profundidad.setText("profundidad");
        getContentPane().add(profundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtPantallaIngresoCanal.setEditable(false);
        txtPantallaIngresoCanal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtPantallaIngresoCanal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaIngresoCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaIngresoCanalActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaIngresoCanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, -1));

        txtPantallaIngresoCaudal.setEditable(false);
        txtPantallaIngresoCaudal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtPantallaIngresoCaudal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        getContentPane().add(txtPantallaIngresoCaudal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, -1));

        txtPantallaIngresoProfundidad.setEditable(false);
        txtPantallaIngresoProfundidad.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtPantallaIngresoProfundidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        getContentPane().add(txtPantallaIngresoProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 110, -1));

        txtPantallaSalidaV1.setEditable(false);
        txtPantallaSalidaV1.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        txtPantallaSalidaV1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaSalidaV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaV1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaSalidaV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, -1));

        txtPantallaSalidaFR1.setEditable(false);
        txtPantallaSalidaFR1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaSalidaFR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaFR1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaSalidaFR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 110, -1));

        txtPantallaSalidaY2.setEditable(false);
        txtPantallaSalidaY2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        getContentPane().add(txtPantallaSalidaY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, -1));

        txtPantallaSalidaV2.setEditable(false);
        txtPantallaSalidaV2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaSalidaV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaV2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaSalidaV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 110, -1));

        txtPantallaSalidaE1.setEditable(false);
        txtPantallaSalidaE1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaSalidaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaE1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaSalidaE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 110, -1));

        txtPantallaSalidaE2.setEditable(false);
        txtPantallaSalidaE2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        getContentPane().add(txtPantallaSalidaE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 110, -1));

        txtPantallaSalidaNRH.setEditable(false);
        txtPantallaSalidaNRH.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtPantallaSalidaNRH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaSalidaNRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaNRHActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaSalidaNRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 110, -1));

        txtPantallaSalidaNe.setEditable(false);
        txtPantallaSalidaNe.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtPantallaSalidaNe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        txtPantallaSalidaNe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaSalidaNeActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantallaSalidaNe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, -1));

        eficiencia.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        eficiencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        eficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eficienciaActionPerformed(evt);
            }
        });
        getContentPane().add(eficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 130, 20));

        enviar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        enviar.setText("Calcular");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 31));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 31));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 31));

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 31));

        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 31));

        jButton6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 31));

        jButton7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 31));

        jButton8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 31));

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 40, 30));

        jButton9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 31));

        jButtonEnter.setText("Enter");
        jButtonEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnterMouseClicked(evt);
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
        getContentPane().add(jButtonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 70, 30));

        Punto.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Punto.setText(".");
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });
        getContentPane().add(Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 50, 30));

        Borrar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 90, 30));

        l1.setEditable(false);
        l1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        l1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 130, 20));

        L2.setEditable(false);
        L2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        L2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 130, 20));

        l3.setEditable(false);
        l3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3ActionPerformed(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 130, 20));

        ingresarDatos.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        ingresarDatos.setForeground(new java.awt.Color(255, 255, 255));
        ingresarDatos.setText("Ingresar Datos");
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
        getContentPane().add(ingresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        resultados.setBackground(new java.awt.Color(255, 255, 255));
        resultados.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        resultados.setForeground(new java.awt.Color(255, 255, 255));
        resultados.setText("resultados");
        resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultadosMouseClicked(evt);
            }
        });
        getContentPane().add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        v1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 255, 255));
        v1.setText("v1");
        getContentPane().add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        fr1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        fr1.setForeground(new java.awt.Color(255, 255, 255));
        fr1.setText("FR1");
        getContentPane().add(fr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        Y2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Y2.setForeground(new java.awt.Color(255, 255, 255));
        Y2.setText("Y2");
        getContentPane().add(Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        V2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        V2.setForeground(new java.awt.Color(255, 255, 255));
        V2.setText("V2");
        getContentPane().add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        E1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E1.setForeground(new java.awt.Color(255, 255, 255));
        E1.setText("E1");
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        E2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 255, 255));
        E2.setText("E2");
        getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 364, -1, 10));

        NRH.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        NRH.setForeground(new java.awt.Color(255, 255, 255));
        NRH.setText("ηRH");
        getContentPane().add(NRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        ne.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ne.setForeground(new java.awt.Color(255, 255, 255));
        ne.setText("ηE");
        getContentPane().add(ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        txtL1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        txtL1.setForeground(new java.awt.Color(255, 255, 255));
        txtL1.setText("L1");
        getContentPane().add(txtL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        txtL2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtL2.setForeground(new java.awt.Color(255, 255, 255));
        txtL2.setText("L2");
        getContentPane().add(txtL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        txtL3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtL3.setForeground(new java.awt.Color(255, 255, 255));
        txtL3.setText("L3");
        getContentPane().add(txtL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, 10));

        txtEficiencia.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        txtEficiencia.setForeground(new java.awt.Color(255, 255, 255));
        txtEficiencia.setText("perdida de energia ");
        getContentPane().add(txtEficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 650, 430));

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
           
            txtPantallaSalidaV1.setText(String.valueOf(hidraulica1.calcularVelocidad()));
            txtPantallaSalidaFR1.setText(String.valueOf(hidraulica1.FR1()));
            txtPantallaSalidaY2.setText(String.valueOf(hidraulica1.Y2()));
            txtPantallaSalidaV2.setText(String.valueOf(hidraulica1.velocidad2()));
            txtPantallaSalidaE1.setText(String.valueOf(hidraulica1.E1()));
            txtPantallaSalidaE2.setText(String.valueOf(hidraulica1.E2()));
            txtPantallaSalidaNRH.setText(String.valueOf(hidraulica1.nRH()));
            txtPantallaSalidaNe.setText(String.valueOf(hidraulica1.nE()));
            l1.setText(String.valueOf(hidraulica1.l1()));
            L2.setText(String.valueOf(hidraulica1.l2()));
            l3.setText(String.valueOf(hidraulica1.l3()));
            eficiencia.setText(String.valueOf(hidraulica1.peridaEnergia()));
             
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
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaSalidaV2ActionPerformed

    private void ingresarDatosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ingresarDatosAncestorAdded
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaSalidaNRHActionPerformed

    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l3ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l1ActionPerformed

    private void txtPantallaIngresoCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaIngresoCanalActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_eficienciaActionPerformed

    private void txtPantallaSalidaV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaV1ActionPerformed
      
    }//GEN-LAST:event_txtPantallaSalidaV1ActionPerformed

    private void txtPantallaSalidaFR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaFR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaSalidaFR1ActionPerformed

    private void txtPantallaSalidaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaSalidaE1ActionPerformed

    private void txtPantallaSalidaNeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaSalidaNeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaSalidaNeActionPerformed

    private void resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosMouseClicked
       
    }//GEN-LAST:event_resultadosMouseClicked

    private void jButtonEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMouseClicked
      
    }//GEN-LAST:event_jButtonEnterMouseClicked

    private void jButtonEnterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMousePressed
     
    }//GEN-LAST:event_jButtonEnterMousePressed

    private void jButtonEnterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnterMouseReleased
      
    }//GEN-LAST:event_jButtonEnterMouseReleased

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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono;
    private javax.swing.JTextField L2;
    private javax.swing.JLabel NRH;
    private javax.swing.JButton Punto;
    private javax.swing.JLabel V2;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel canalAncho;
    private javax.swing.JLabel caudal;
    private javax.swing.JTextField eficiencia;
    private javax.swing.JButton enviar;
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
    private javax.swing.JTextField l1;
    private javax.swing.JTextField l3;
    private javax.swing.JLabel ne;
    private javax.swing.JLabel profundidad;
    private javax.swing.JLabel resultados;
    private javax.swing.JLabel txtEficiencia;
    private javax.swing.JLabel txtL1;
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