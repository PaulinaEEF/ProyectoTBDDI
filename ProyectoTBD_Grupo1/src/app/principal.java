package app;

import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;

/**
 *
 * @author Judá Aarón
 */
public class principal extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("TIENDA");
        this.setLocationRelativeTo(null);
        hilo = new Thread(this);
        hilo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_clientes = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        id_login_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password_login_cliente = new javax.swing.JPasswordField();
        btn_ingresarCliente = new javax.swing.JButton();
        btn_regresarCliente = new javax.swing.JButton();
        btn_crear_cliente = new javax.swing.JButton();
        fondo_loginCliente = new javax.swing.JLabel();
        login_empleados = new javax.swing.JDialog();
        btn_login_empleado = new javax.swing.JButton();
        user_empleado = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        password_empleado = new javax.swing.JPasswordField();
        btn_regresar_empleado = new javax.swing.JButton();
        fondo_login_empleados = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        boton_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hora_jbl = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        boton_cliente1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boton_empleado = new javax.swing.JButton();
        fondo_princiipal = new javax.swing.JLabel();
        fondo_principal2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        login_clientes.setUndecorated(true);
        login_clientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        login_clientes.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 380, 220));

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("¿Eres cliente nuevo?");
        login_clientes.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 36, 130, 30));

        id_login_cliente.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        id_login_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_clientes.getContentPane().add(id_login_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 180, 30));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLIENT LOGIN");
        login_clientes.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        password_login_cliente.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        password_login_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_clientes.getContentPane().add(password_login_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 180, 30));

        btn_ingresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login (1).png"))); // NOI18N
        btn_ingresarCliente.setContentAreaFilled(false);
        btn_ingresarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login_1.png"))); // NOI18N
        login_clientes.getContentPane().add(btn_ingresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 140, 60));

        btn_regresarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_regresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reply-message.png"))); // NOI18N
        btn_regresarCliente.setText("Regresar");
        btn_regresarCliente.setContentAreaFilled(false);
        btn_regresarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reply-message (1).png"))); // NOI18N
        btn_regresarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarClienteMouseClicked(evt);
            }
        });
        login_clientes.getContentPane().add(btn_regresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 180, 60));

        btn_crear_cliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_crear_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/follow.png"))); // NOI18N
        btn_crear_cliente.setText("Crea una cuenta");
        btn_crear_cliente.setContentAreaFilled(false);
        btn_crear_cliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/follow (1).png"))); // NOI18N
        login_clientes.getContentPane().add(btn_crear_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 200, 80));

        fondo_loginCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2021-03-18 at 21.35.49.jpeg"))); // NOI18N
        login_clientes.getContentPane().add(fondo_loginCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 630));

        login_empleados.setUndecorated(true);
        login_empleados.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login_empleado.setText("LOGIN");
        login_empleados.getContentPane().add(btn_login_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 100, 30));
        login_empleados.getContentPane().add(user_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 160, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("EMPLOYEE LOGIN");
        login_empleados.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 200, 30));
        login_empleados.getContentPane().add(password_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 160, 30));

        btn_regresar_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_regresar_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reply-message.png"))); // NOI18N
        btn_regresar_empleado.setText("Regresar");
        btn_regresar_empleado.setContentAreaFilled(false);
        btn_regresar_empleado.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_regresar_empleado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_regresar_empleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reply-message (1).png"))); // NOI18N
        btn_regresar_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresar_empleadoMouseClicked(evt);
            }
        });
        login_empleados.getContentPane().add(btn_regresar_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 170, 90));

        fondo_login_empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleadologin.jpg"))); // NOI18N
        login_empleados.getContentPane().add(fondo_login_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 530));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("¡Bienvenidos a tienda electronica!");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 550, 30));

        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit (2).png"))); // NOI18N
        boton_salir.setContentAreaFilled(false);
        boton_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit (3).png"))); // NOI18N
        boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_salirMouseClicked(evt);
            }
        });
        getContentPane().add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 680, 230, 140));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 90, 40));

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel7.setText("Hora actual");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 100, 30));

        hora_jbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        hora_jbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora_jbl.setText("00:00:00");
        getContentPane().add(hora_jbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 730, 110, 40));

        titulo2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("¿Qué eres?");
        getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 140, 40));

        boton_cliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/customer-review.png"))); // NOI18N
        boton_cliente1.setContentAreaFilled(false);
        boton_cliente1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/customer-review (1).png"))); // NOI18N
        boton_cliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_cliente1MouseClicked(evt);
            }
        });
        getContentPane().add(boton_cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 240, 120));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 80, 40));

        boton_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/employee (1).png"))); // NOI18N
        boton_empleado.setContentAreaFilled(false);
        boton_empleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/employee (2).png"))); // NOI18N
        boton_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_empleadoMouseClicked(evt);
            }
        });
        getContentPane().add(boton_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 180, 120));

        fondo_princiipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronicgadget2.gif"))); // NOI18N
        getContentPane().add(fondo_princiipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        fondo_principal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronicgadget2.gif"))); // NOI18N
        getContentPane().add(fondo_principal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 820, 590));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronicgadget2.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 800));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronicgadget2.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -90, 1030, 970));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronicgadget2.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 860, 940));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/electronicgadget2.gif"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_boton_salirMouseClicked

    private void boton_cliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_cliente1MouseClicked
        TextPrompt cc = new TextPrompt("ID Cliente", id_login_cliente);
        TextPrompt cc2 = new TextPrompt("Password", password_login_cliente);
        login_clientes.pack();
        login_clientes.setModal(true);
        login_clientes.setLocationRelativeTo(null);
        login_clientes.setVisible(true);
    }//GEN-LAST:event_boton_cliente1MouseClicked

    private void boton_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_empleadoMouseClicked
        TextPrompt e1 = new TextPrompt("Username", user_empleado);
        TextPrompt e2 = new TextPrompt("Password", password_empleado);
        login_empleados.pack();
        login_empleados.setModal(true);
        login_empleados.setLocationRelativeTo(null);
        login_empleados.setVisible(true);
    }//GEN-LAST:event_boton_empleadoMouseClicked

    private void btn_regresar_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresar_empleadoMouseClicked
       login_empleados.dispose();
    }//GEN-LAST:event_btn_regresar_empleadoMouseClicked

    private void btn_regresarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarClienteMouseClicked
        login_clientes.dispose();
    }//GEN-LAST:event_btn_regresarClienteMouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cliente1;
    private javax.swing.JButton boton_empleado;
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton btn_crear_cliente;
    private javax.swing.JButton btn_ingresarCliente;
    private javax.swing.JButton btn_login_empleado;
    private javax.swing.JButton btn_regresarCliente;
    private javax.swing.JButton btn_regresar_empleado;
    private javax.swing.JLabel fondo_loginCliente;
    private javax.swing.JLabel fondo_login_empleados;
    private javax.swing.JLabel fondo_princiipal;
    private javax.swing.JLabel fondo_principal2;
    private javax.swing.JLabel hora_jbl;
    private javax.swing.JTextField id_login_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog login_clientes;
    private javax.swing.JDialog login_empleados;
    private javax.swing.JPasswordField password_empleado;
    private javax.swing.JPasswordField password_login_cliente;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JTextField user_empleado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (current == hilo) {
            horaa();
            hora_jbl.setText(hora + ":" + minutos + ":" + segundos);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    public void horaa() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();

        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
}
