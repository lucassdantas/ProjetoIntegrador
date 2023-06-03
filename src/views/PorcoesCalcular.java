/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.PortionCalcController;
import controllers.PortionResultController;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JFrame;

/**
 *
 * @author Work.Studies
 */
public class PorcoesCalcular extends javax.swing.JFrame {
private PortionResultController resultController = new PortionResultController();
    /**
     * Creates new form EstoqueEntrada
     */
    public PorcoesCalcular() {
        initComponents();
    }
    
    public PortionCalcController calcController;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        areaEntradas_entrada = new javax.swing.JInternalFrame();
        panelEntradas1 = new javax.swing.JPanel();
        resultSnackName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        colorBtn19 = new javax.swing.JPanel();
        mybtn5 = new views.styles.Mybtn();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        resultItemField01 = new javax.swing.JTextField();
        resultItemField02 = new javax.swing.JTextField();
        resultItemField03 = new javax.swing.JTextField();
        resultItemField04 = new javax.swing.JTextField();
        resultItemField05 = new javax.swing.JTextField();
        resultItemField06 = new javax.swing.JTextField();
        resultItemField07 = new javax.swing.JTextField();
        resultItemField08 = new javax.swing.JTextField();
        resultItemField09 = new javax.swing.JTextField();
        resultItemField10 = new javax.swing.JTextField();
        resultQntField10 = new javax.swing.JTextField();
        resultQntField09 = new javax.swing.JTextField();
        resultQntField08 = new javax.swing.JTextField();
        resultQntField07 = new javax.swing.JTextField();
        resultQntField06 = new javax.swing.JTextField();
        resultQntField05 = new javax.swing.JTextField();
        resultQntField04 = new javax.swing.JTextField();
        resultQntField03 = new javax.swing.JTextField();
        resultQntField02 = new javax.swing.JTextField();
        resultQntField01 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        resultUnField01 = new javax.swing.JTextField();
        resultUnField02 = new javax.swing.JTextField();
        resultUnField03 = new javax.swing.JTextField();
        resultUnField04 = new javax.swing.JTextField();
        resultUnField05 = new javax.swing.JTextField();
        resultUnField06 = new javax.swing.JTextField();
        resultUnField07 = new javax.swing.JTextField();
        resultUnField08 = new javax.swing.JTextField();
        resultUnField09 = new javax.swing.JTextField();
        resultUnField10 = new javax.swing.JTextField();
        resultCostField10 = new javax.swing.JTextField();
        resultCostField09 = new javax.swing.JTextField();
        resultCostField08 = new javax.swing.JTextField();
        resultCostField07 = new javax.swing.JTextField();
        resultCostField06 = new javax.swing.JTextField();
        resultCostField05 = new javax.swing.JTextField();
        resultCostField04 = new javax.swing.JTextField();
        resultCostField03 = new javax.swing.JTextField();
        resultCostField02 = new javax.swing.JTextField();
        resultCostField01 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        resultCostProductionField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        resultSellValueField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        resultTotalPortionField = new javax.swing.JTextField();
        resultGainField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        resultGainMarginField = new javax.swing.JTextField();
        resultPortionQuantity = new views.spinner.Spinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 910));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 910));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1040, 910));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaEntradas_entrada.setBackground(new java.awt.Color(255, 255, 255));
        areaEntradas_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaEntradas_entrada.setMaximumSize(new java.awt.Dimension(900, 1025));
        areaEntradas_entrada.setMinimumSize(new java.awt.Dimension(900, 1025));
        areaEntradas_entrada.setPreferredSize(new java.awt.Dimension(900, 910));
        areaEntradas_entrada.setVisible(true);
        areaEntradas_entrada.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEntradas1.setBackground(new java.awt.Color(255, 255, 255));
        panelEntradas1.setMaximumSize(new java.awt.Dimension(1040, 900));
        panelEntradas1.setMinimumSize(new java.awt.Dimension(1040, 900));
        panelEntradas1.setPreferredSize(new java.awt.Dimension(1040, 900));
        panelEntradas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultSnackName.setEditable(false);
        resultSnackName.setBackground(new java.awt.Color(243, 243, 243));
        resultSnackName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultSnackName.setName(""); // NOI18N
        panelEntradas1.add(resultSnackName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 240, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("Produto/Lanche");
        panelEntradas1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, 30));

        colorBtn19.setBackground(new java.awt.Color(192, 192, 192));

        javax.swing.GroupLayout colorBtn19Layout = new javax.swing.GroupLayout(colorBtn19);
        colorBtn19.setLayout(colorBtn19Layout);
        colorBtn19Layout.setHorizontalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorBtn19Layout.setVerticalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelEntradas1.add(colorBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 780, 10, 40));

        mybtn5.setText("CANCELAR");
        mybtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mybtn5ActionPerformed(evt);
            }
        });
        panelEntradas1.add(mybtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 780, 129, 40));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel35.setText("Qnt. de porções");
        panelEntradas1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 140, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel38.setText("Itens");
        panelEntradas1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, 30));

        resultItemField01.setEditable(false);
        resultItemField01.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField01.setName(""); // NOI18N
        resultItemField01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultItemField01ActionPerformed(evt);
            }
        });
        panelEntradas1.add(resultItemField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 320, 45));

        resultItemField02.setEditable(false);
        resultItemField02.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField02.setName(""); // NOI18N
        panelEntradas1.add(resultItemField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 205, 320, 45));

        resultItemField03.setEditable(false);
        resultItemField03.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField03.setName(""); // NOI18N
        panelEntradas1.add(resultItemField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 45));

        resultItemField04.setEditable(false);
        resultItemField04.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField04.setName(""); // NOI18N
        panelEntradas1.add(resultItemField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 315, 320, 45));

        resultItemField05.setEditable(false);
        resultItemField05.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField05.setName(""); // NOI18N
        panelEntradas1.add(resultItemField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, 45));

        resultItemField06.setEditable(false);
        resultItemField06.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField06.setName(""); // NOI18N
        panelEntradas1.add(resultItemField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 425, 320, 45));

        resultItemField07.setEditable(false);
        resultItemField07.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField07.setName(""); // NOI18N
        panelEntradas1.add(resultItemField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 320, 45));

        resultItemField08.setEditable(false);
        resultItemField08.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField08.setName(""); // NOI18N
        panelEntradas1.add(resultItemField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 535, 320, 45));

        resultItemField09.setEditable(false);
        resultItemField09.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField09.setName(""); // NOI18N
        panelEntradas1.add(resultItemField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 320, 45));

        resultItemField10.setEditable(false);
        resultItemField10.setBackground(new java.awt.Color(243, 243, 243));
        resultItemField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultItemField10.setName(""); // NOI18N
        panelEntradas1.add(resultItemField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 645, 320, 45));

        resultQntField10.setEditable(false);
        resultQntField10.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField10.setName(""); // NOI18N
        panelEntradas1.add(resultQntField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 645, 100, 45));

        resultQntField09.setEditable(false);
        resultQntField09.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField09.setName(""); // NOI18N
        panelEntradas1.add(resultQntField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 100, 45));

        resultQntField08.setEditable(false);
        resultQntField08.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField08.setName(""); // NOI18N
        panelEntradas1.add(resultQntField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 535, 100, 45));

        resultQntField07.setEditable(false);
        resultQntField07.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField07.setName(""); // NOI18N
        panelEntradas1.add(resultQntField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 100, 45));

        resultQntField06.setEditable(false);
        resultQntField06.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField06.setName(""); // NOI18N
        panelEntradas1.add(resultQntField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 425, 100, 45));

        resultQntField05.setEditable(false);
        resultQntField05.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField05.setName(""); // NOI18N
        panelEntradas1.add(resultQntField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 100, 45));

        resultQntField04.setEditable(false);
        resultQntField04.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField04.setName(""); // NOI18N
        panelEntradas1.add(resultQntField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 315, 100, 45));

        resultQntField03.setEditable(false);
        resultQntField03.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField03.setName(""); // NOI18N
        panelEntradas1.add(resultQntField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 100, 45));

        resultQntField02.setEditable(false);
        resultQntField02.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField02.setName(""); // NOI18N
        panelEntradas1.add(resultQntField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 205, 100, 45));

        resultQntField01.setEditable(false);
        resultQntField01.setBackground(new java.awt.Color(243, 243, 243));
        resultQntField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultQntField01.setName(""); // NOI18N
        resultQntField01.setOpaque(true);
        panelEntradas1.add(resultQntField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 100, 45));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel33.setText("Qnt.");
        panelEntradas1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel39.setText("Und. Medida");
        panelEntradas1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 100, 30));

        resultUnField01.setEditable(false);
        resultUnField01.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField01.setName(""); // NOI18N
        panelEntradas1.add(resultUnField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 100, 45));

        resultUnField02.setEditable(false);
        resultUnField02.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField02.setName(""); // NOI18N
        panelEntradas1.add(resultUnField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 205, 100, 45));

        resultUnField03.setEditable(false);
        resultUnField03.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField03.setName(""); // NOI18N
        panelEntradas1.add(resultUnField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 100, 45));

        resultUnField04.setEditable(false);
        resultUnField04.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField04.setName(""); // NOI18N
        panelEntradas1.add(resultUnField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 315, 100, 45));

        resultUnField05.setEditable(false);
        resultUnField05.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField05.setName(""); // NOI18N
        panelEntradas1.add(resultUnField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 100, 45));

        resultUnField06.setEditable(false);
        resultUnField06.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField06.setName(""); // NOI18N
        panelEntradas1.add(resultUnField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 425, 100, 45));

        resultUnField07.setEditable(false);
        resultUnField07.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField07.setName(""); // NOI18N
        panelEntradas1.add(resultUnField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 100, 45));

        resultUnField08.setEditable(false);
        resultUnField08.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField08.setName(""); // NOI18N
        panelEntradas1.add(resultUnField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 535, 100, 45));

        resultUnField09.setEditable(false);
        resultUnField09.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField09.setName(""); // NOI18N
        panelEntradas1.add(resultUnField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 100, 45));

        resultUnField10.setEditable(false);
        resultUnField10.setBackground(new java.awt.Color(243, 243, 243));
        resultUnField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultUnField10.setName(""); // NOI18N
        panelEntradas1.add(resultUnField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 645, 100, 45));

        resultCostField10.setEditable(false);
        resultCostField10.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField10.setName(""); // NOI18N
        panelEntradas1.add(resultCostField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 645, 100, 45));

        resultCostField09.setEditable(false);
        resultCostField09.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField09.setName(""); // NOI18N
        panelEntradas1.add(resultCostField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 100, 45));

        resultCostField08.setEditable(false);
        resultCostField08.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField08.setName(""); // NOI18N
        panelEntradas1.add(resultCostField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 535, 100, 45));

        resultCostField07.setEditable(false);
        resultCostField07.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField07.setName(""); // NOI18N
        panelEntradas1.add(resultCostField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 100, 45));

        resultCostField06.setEditable(false);
        resultCostField06.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField06.setName(""); // NOI18N
        panelEntradas1.add(resultCostField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 425, 100, 45));

        resultCostField05.setEditable(false);
        resultCostField05.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField05.setName(""); // NOI18N
        panelEntradas1.add(resultCostField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 100, 45));

        resultCostField04.setEditable(false);
        resultCostField04.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField04.setName(""); // NOI18N
        panelEntradas1.add(resultCostField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 315, 100, 45));

        resultCostField03.setEditable(false);
        resultCostField03.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField03.setName(""); // NOI18N
        panelEntradas1.add(resultCostField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 100, 45));

        resultCostField02.setEditable(false);
        resultCostField02.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField02.setName(""); // NOI18N
        panelEntradas1.add(resultCostField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 205, 100, 45));

        resultCostField01.setEditable(false);
        resultCostField01.setBackground(new java.awt.Color(243, 243, 243));
        resultCostField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostField01.setName(""); // NOI18N
        panelEntradas1.add(resultCostField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 100, 45));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel40.setText("Custo (R$)");
        panelEntradas1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 100, 30));

        resultCostProductionField.setEditable(false);
        resultCostProductionField.setBackground(new java.awt.Color(243, 243, 243));
        resultCostProductionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultCostProductionField.setName(""); // NOI18N
        resultCostProductionField.setOpaque(true);
        panelEntradas1.add(resultCostProductionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 210, 45));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Custo unt. produção (R$)");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelEntradas1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 210, 45));
        panelEntradas1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 960, 30));

        resultSellValueField.setEditable(false);
        resultSellValueField.setBackground(new java.awt.Color(243, 243, 243));
        resultSellValueField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultSellValueField.setName(""); // NOI18N
        resultSellValueField.setOpaque(true);
        panelEntradas1.add(resultSellValueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 210, 45));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Valor de venda (R$)");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelEntradas1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 210, 45));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Receita total \"x\" por porções (R$)");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelEntradas1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, 45));

        resultTotalPortionField.setEditable(false);
        resultTotalPortionField.setBackground(new java.awt.Color(243, 243, 243));
        resultTotalPortionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultTotalPortionField.setName(""); // NOI18N
        resultTotalPortionField.setOpaque(true);
        panelEntradas1.add(resultTotalPortionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 210, 45));

        resultGainField.setEditable(false);
        resultGainField.setBackground(new java.awt.Color(243, 243, 243));
        resultGainField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultGainField.setName(""); // NOI18N
        resultGainField.setOpaque(true);
        panelEntradas1.add(resultGainField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 210, 45));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Lucro (R$)");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelEntradas1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 210, 45));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Margem de Lucro (R$)");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        panelEntradas1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, 210, 45));

        resultGainMarginField.setEditable(false);
        resultGainMarginField.setBackground(new java.awt.Color(243, 243, 243));
        resultGainMarginField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultGainMarginField.setName(""); // NOI18N
        resultGainMarginField.setOpaque(true);
        panelEntradas1.add(resultGainMarginField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, 210, 45));

        resultPortionQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        resultPortionQuantity.setLabelText("");
        panelEntradas1.add(resultPortionQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 102, 45));

        areaEntradas_entrada.getContentPane().add(panelEntradas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1040, 900));

        jDesktopPane1.add(areaEntradas_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1060, 930));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mybtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mybtn5ActionPerformed
        dispose();
    }//GEN-LAST:event_mybtn5ActionPerformed

    private void resultItemField01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultItemField01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultItemField01ActionPerformed

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
            java.util.logging.Logger.getLogger(PorcoesCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PorcoesCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PorcoesCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PorcoesCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PorcoesCalcular().setVisible(true);
            }
        });
    }
    public void setItemField(List<String> itemField){
        for(int i = 0; i< itemField.size(); i++){
            resultController.setItemField(itemField.get(i))
        }
    }
    public void setUnField(List<String> qntField){
         for(int i = 0; i< qntField.size(); i++){
            
        }
    }
    public void setQntField(List<String> unityField){
        for(int i = 0; i< unityField.size(); i++){
            
        }
    }
    public void setCostField(List<String> costField){
        for(int i = 0; i< costField.size(); i++){
            
        }
    
    }
    void findItemFields() {
        resultController.addItemField(resultItemField01);
        resultController.addItemField(resultItemField02);
        resultController.addItemField(resultItemField03);
        resultController.addItemField(resultItemField04);
        resultController.addItemField(resultItemField05);
        resultController.addItemField(resultItemField06);
        resultController.addItemField(resultItemField07);
        resultController.addItemField(resultItemField08);
        resultController.addItemField(resultItemField09);
        resultController.addItemField(resultItemField10);
    }

    void findQntFields() {
        resultController.addQntField(resultQntField01);
        resultController.addQntField(resultQntField02);
        resultController.addQntField(resultQntField03);
        resultController.addQntField(resultQntField04);
        resultController.addQntField(resultQntField05);
        resultController.addQntField(resultQntField06);
        resultController.addQntField(resultQntField07);
        resultController.addQntField(resultQntField08);
        resultController.addQntField(resultQntField09);
        resultController.addQntField(resultQntField10);
    }

    void findUnityFields() {
        resultController.addUnityField(resultUnField01);
        resultController.addUnityField(resultUnField02);
        resultController.addUnityField(resultUnField03);
        resultController.addUnityField(resultUnField04);
        resultController.addUnityField(resultUnField05);
        resultController.addUnityField(resultUnField06);
        resultController.addUnityField(resultUnField07);
        resultController.addUnityField(resultUnField08);
        resultController.addUnityField(resultUnField09);
        resultController.addUnityField(resultUnField10);
    }

    void findCostFields() {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaEntradas_entrada;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator7;
    private views.styles.Mybtn mybtn5;
    private javax.swing.JPanel panelEntradas1;
    private javax.swing.JTextField resultCostField01;
    private javax.swing.JTextField resultCostField02;
    private javax.swing.JTextField resultCostField03;
    private javax.swing.JTextField resultCostField04;
    private javax.swing.JTextField resultCostField05;
    private javax.swing.JTextField resultCostField06;
    private javax.swing.JTextField resultCostField07;
    private javax.swing.JTextField resultCostField08;
    private javax.swing.JTextField resultCostField09;
    private javax.swing.JTextField resultCostField10;
    private javax.swing.JTextField resultCostProductionField;
    private javax.swing.JTextField resultGainField;
    private javax.swing.JTextField resultGainMarginField;
    private javax.swing.JTextField resultItemField01;
    private javax.swing.JTextField resultItemField02;
    private javax.swing.JTextField resultItemField03;
    private javax.swing.JTextField resultItemField04;
    private javax.swing.JTextField resultItemField05;
    private javax.swing.JTextField resultItemField06;
    private javax.swing.JTextField resultItemField07;
    private javax.swing.JTextField resultItemField08;
    private javax.swing.JTextField resultItemField09;
    private javax.swing.JTextField resultItemField10;
    private views.spinner.Spinner resultPortionQuantity;
    private javax.swing.JTextField resultQntField01;
    private javax.swing.JTextField resultQntField02;
    private javax.swing.JTextField resultQntField03;
    private javax.swing.JTextField resultQntField04;
    private javax.swing.JTextField resultQntField05;
    private javax.swing.JTextField resultQntField06;
    private javax.swing.JTextField resultQntField07;
    private javax.swing.JTextField resultQntField08;
    private javax.swing.JTextField resultQntField09;
    private javax.swing.JTextField resultQntField10;
    private javax.swing.JTextField resultSellValueField;
    private javax.swing.JTextField resultSnackName;
    private javax.swing.JTextField resultTotalPortionField;
    private javax.swing.JTextField resultUnField01;
    private javax.swing.JTextField resultUnField02;
    private javax.swing.JTextField resultUnField03;
    private javax.swing.JTextField resultUnField04;
    private javax.swing.JTextField resultUnField05;
    private javax.swing.JTextField resultUnField06;
    private javax.swing.JTextField resultUnField07;
    private javax.swing.JTextField resultUnField08;
    private javax.swing.JTextField resultUnField09;
    private javax.swing.JTextField resultUnField10;
    // End of variables declaration//GEN-END:variables

    
}
