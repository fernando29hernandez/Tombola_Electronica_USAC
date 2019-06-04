/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombola.electronica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Fernando
 */
public class Resultados extends javax.swing.JFrame {

    /**
     * Creates new form Resultados
     */
    int paso=0;
    LinkedList<BufferedImage>rutasordenas= new LinkedList();
    BufferedImage imageverde = null;
    BufferedImage imagerojo = null;
    BufferedImage imageamarillo = null;
    BufferedImage imageblanco = null;
    Image imgverde;
    Image imgamarillo;
    Image imgrojo;
    Image imgblanco;
    
    Rectangle verdepos;
    Rectangle rojopos;
    Rectangle amarillopos;
    
    public Resultados() {
        initComponents();
        setMinimumSize(this.getSize());
        setBounds(50,50,getSize().width,getSize().height);
        //setExtendedState(JFrame.MAXIMIZED_BOTH); 
        tiempo.addItem("1");
        tiempo.addItem("2");
        tiempo.addItem("3");
        tiempo.addItem("4");
        tiempo.addItem("5");
        tiempo.addItem("6");
        tiempo.addItem("10");
        tiempo.addItem("20");
        
       
        try {
            leerimg();
        } catch (IOException ex) {
            Logger.getLogger(Resultados.class.getName()).log(Level.SEVERE, null, ex);
        }
         t = new Timer(1000,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae) {
                lbltiempo.setText(timeTransfer());
                counter--;
                
                int porcentaje=counter*100/total;
                System.out.println(porcentaje);
                if(porcentaje>=40){
                    verde.setIcon(new ImageIcon(imgverde));
                    amarillo.setIcon(new ImageIcon(imgblanco));
                    rojo.setIcon(new ImageIcon(imgblanco));
                }else if(porcentaje<40&&porcentaje>=1){
                    verde.setIcon(new ImageIcon(imgblanco));
                    amarillo.setIcon(new ImageIcon(imgamarillo));
                    rojo.setIcon(new ImageIcon(imgblanco));
                }else if(porcentaje<1){
                     verde.setIcon(new ImageIcon(imgblanco));
                    amarillo.setIcon(new ImageIcon(imgblanco));
                    rojo.setIcon(new ImageIcon(imgrojo));
                }
                if(porcentaje<1){
                    
                    t.stop();
                    
                    start.setEnabled(true);
                    restart.setEnabled(false);
                    pause.setEnabled(false);
                    
                    System.out.println("estoy aqui");
                }    
           }
        });
         restart.setEnabled(false);
                    pause.setEnabled(false);
        setMinimumSize(this.getSize());
    }
    public void leerimg() throws IOException{
    imageverde = ImageIO.read(getClass().getResource("/images/verde.png"));
    imageamarillo  = ImageIO.read(getClass().getResource("/images/amarillo.png"));
    imagerojo = ImageIO.read(getClass().getResource("/images/rojo.png"));
    imageblanco = ImageIO.read(getClass().getResource("/images/blanco.png"));
    
    imgverde = imageverde.getScaledInstance(verde.getWidth(), verde.getHeight(),Image.SCALE_SMOOTH);
    imgamarillo = imageamarillo.getScaledInstance(amarillo.getWidth(), amarillo.getHeight(),Image.SCALE_SMOOTH);
    imgrojo = imagerojo.getScaledInstance(rojo.getWidth(), rojo.getHeight(),Image.SCALE_SMOOTH);
    imgblanco = imageblanco.getScaledInstance(verde.getWidth(), verde.getHeight(),Image.SCALE_SMOOTH);
            
        
            verde.setIcon(new ImageIcon(imgverde));
            amarillo.setIcon(new ImageIcon(imgamarillo));
            rojo.setIcon(new ImageIcon(imgrojo));
            verdepos = verde.getBounds();
            amarillopos = amarillo.getBounds();
            rojopos = rojo.getBounds();
            
    }
    public DefaultListModel temp = new DefaultListModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrdenPaso = new javax.swing.JList<>();
        tiempo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltiempo = new javax.swing.JLabel();
        pause = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        start = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpartido = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        fotogrande = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        amarillo = new javax.swing.JLabel();
        rojo = new javax.swing.JLabel();
        verde = new javax.swing.JLabel();
        panelpregunta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpregunta = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Orden de Paso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        OrdenPaso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OrdenPaso.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        OrdenPaso.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                OrdenPasoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(OrdenPaso);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Configurar Tiempo");

        jButton4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton4.setText("Regresar a Tombola");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Minutos");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Candidato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Turno Actual ");

        lblnombre.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Tiempo Restante");

        lbltiempo.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N

        pause.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        pause.setText("Pausa");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        restart.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        restart.setText("Reiniciar");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        start.setText("Iniciar");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton2.setText("Terminar Turno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtpartido.setFont(new java.awt.Font("Tahoma", 2, 22)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(start)
                        .addGap(18, 18, 18)
                        .addComponent(pause)
                        .addGap(18, 18, 18)
                        .addComponent(restart)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(418, 418, 418))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtpartido, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpartido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pause)
                    .addComponent(restart)
                    .addComponent(start)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        fotogrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotogrande.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fotograndePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotogrande, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "                         "));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        panelpregunta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Pregunta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N

        txtpregunta.setColumns(20);
        txtpregunta.setFont(new java.awt.Font("Monospaced", 2, 24)); // NOI18N
        txtpregunta.setRows(5);
        jScrollPane2.setViewportView(txtpregunta);

        javax.swing.GroupLayout panelpreguntaLayout = new javax.swing.GroupLayout(panelpregunta);
        panelpregunta.setLayout(panelpreguntaLayout);
        panelpreguntaLayout.setHorizontalGroup(
            panelpreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelpreguntaLayout.setVerticalGroup(
            panelpreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpreguntaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton1.setText("Asignar Turno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton3.setText("Regresar a  Turno Anterior");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton6.setText("Limpiar Pregunta");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(220, 220, 220))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelpregunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel5)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelpregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean bandera_primer_turno=true;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(bandera_primer_turno){
            paso=paso+0;
            bandera_primer_turno=false;
        }else{
                paso=paso+1; 
        }
        if(OrdenPaso.getModel().getSize()==paso){
            paso=OrdenPaso.getModel().getSize()-1;
        }
        String []datos = OrdenPaso.getModel().getElementAt(paso).split("-");
        lblnombre.setText("");
        lblnombre.setText(datos[0]);
        txtpartido.setText("");
        txtpartido.setText(datos[1]); 
        OrdenPaso.setSelectedIndex(paso);
        BufferedImage image = null;
        Image dimg=null;
        image = rutasordenas.get(paso);
        dimg = image.getScaledInstance(fotogrande.getWidth(), fotogrande.getHeight(),Image.SCALE_SMOOTH);
        fotogrande.setIcon(new ImageIcon(dimg));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       TombolaElectronica.v.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
public Timer t;
int total ;
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        int tiempomili =0;
        tiempomili = Integer.parseInt(tiempo.getSelectedItem().toString());
        counter=tiempomili*6000;
        total = counter;
       
        t.start();
        start.setEnabled(false);
        restart.setEnabled(true);
        pause.setEnabled(true);
        
    }//GEN-LAST:event_startActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        if (t.isRunning()) {
            t.stop();
            start.setEnabled(false);
            restart.setEnabled(true);
            pause.setEnabled(true);
             
        }else{
            t.start();
            start.setEnabled(false);
            restart.setEnabled(true);
            pause.setEnabled(true);
             
        }

    }//GEN-LAST:event_pauseActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        int tiempomili =0;
        tiempomili = Integer.parseInt(tiempo.getSelectedItem().toString());
        counter=tiempomili*6000;
        lbltiempo.setText(timeTransfer());
        t.restart();
        start.setEnabled(false);
        restart.setEnabled(true);
        pause.setEnabled(true);
         
    }//GEN-LAST:event_restartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.stop();
        int tiempomili =0;
        tiempomili = Integer.parseInt(tiempo.getSelectedItem().toString());
        counter=tiempomili*6000;
        lbltiempo.setText(timeTransfer());
        start.setEnabled(true);
        restart.setEnabled(false);
        pause.setEnabled(false);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        paso=paso-1;
        if(0>paso){
            paso=0;
        }
        String []datos = OrdenPaso.getModel().getElementAt(paso).split("-");
        lblnombre.setText("");
        lblnombre.setText(datos[0]);
        txtpartido.setText("");
        txtpartido.setText(datos[1]);
        OrdenPaso.setSelectedIndex(paso);
        BufferedImage image = null;
        Image dimg=null;
        image = rutasordenas.get(paso);
        dimg = image.getScaledInstance(fotogrande.getWidth(), fotogrande.getHeight(),Image.SCALE_SMOOTH);
        fotogrande.setIcon(new ImageIcon(dimg));
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txtpregunta.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void fotograndePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fotograndePropertyChange
       if(evt.getSource()!=null){
       fotogrande.setPreferredSize(new Dimension(296, 384));
        fotogrande.setMaximumSize(new Dimension(296,384) );
       }
       
    }//GEN-LAST:event_fotograndePropertyChange

    private void OrdenPasoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_OrdenPasoValueChanged
            int ancho=fotogrande.getWidth();
            int alto = fotogrande.getHeight();
            BufferedImage image = null;
            ImagePanel imagePanel = null;
            Image dimg=null;
            JList indices = (JList) evt.getSource();
            int indice []= indices.getSelectedIndices();
            if(indice.length==0){
            image = rutasordenas.get(0);
            paso=0;
            }else{
            image = rutasordenas.get(indice[0]);
            paso = indice[0];
            }
        String []datos = OrdenPaso.getModel().getElementAt(paso).split("-");
        lblnombre.setText("");
        lblnombre.setText(datos[0]);
        txtpartido.setText("");
        txtpartido.setText(datos[1]);
            
            dimg = image.getScaledInstance(ancho,alto,Image.SCALE_REPLICATE);
            fotogrande.setIcon(new ImageIcon(dimg));

    }//GEN-LAST:event_OrdenPasoValueChanged
int counter;
int minutes;
int seconds;
int milliseconds;
    private String timeTransfer(){
        minutes = counter/6000;
        seconds = (counter % 6000) /100 ;
        counter=counter-(milliseconds = counter % 100);
        return String.format("%02d:%02d", minutes, seconds);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList<String> OrdenPaso;
    public javax.swing.JLabel amarillo;
    public javax.swing.JLabel fotogrande;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblnombre;
    public javax.swing.JLabel lbltiempo;
    private javax.swing.JPanel panelpregunta;
    private javax.swing.JButton pause;
    private javax.swing.JButton restart;
    public javax.swing.JLabel rojo;
    private javax.swing.JButton start;
    private javax.swing.JComboBox<String> tiempo;
    public javax.swing.JLabel txtpartido;
    private javax.swing.JTextArea txtpregunta;
    public javax.swing.JLabel verde;
    // End of variables declaration//GEN-END:variables
}
