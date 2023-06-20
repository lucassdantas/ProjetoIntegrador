package views;
import AppPackage.AnimationClass;
import controllers.DataSheetController;

import controllers.IngredientController;
import controllers.InputController;
import controllers.OrdersController;
import controllers.PortionCalcController;
import controllers.SnackController;
import controllers.StockController;
import dao.IngredientDAO;
import dao.SnackDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import models.Ingredient;
import models.Snack;


public class StockViews extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();

    //portion calc contrller
    PortionCalcController calcController = new PortionCalcController();
    PortionCalcResult portionCalcResult = new PortionCalcResult();
    IngredientController ingredientController = new IngredientController();
    SnackController snackController = new SnackController();
    DataSheetController dataSheetController = new DataSheetController();
    InputController inputController = new InputController();
    StockController stockController = new StockController();
    OrdersController ordersController = new OrdersController();
   
    int oldValue = -2;

    public StockViews() throws SQLException {
        initComponents();
        setIcon();
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);
        
        //ingredientController
        ingredientController.setJTable(ingredientTable);
        ingredientController.readJTable();
        
        snackController.setJTable(snackTable);
        snackController.readJTable();
        
        dataSheetController.setJTable(dataSheetTable);
        dataSheetController.readJTable();
        
        inputController.setJTable(inputTable);
        inputController.readJTable();
        
        stockController.setJTable(stockTable);
        stockController.readJTable();
        
      
        
        
        ordersController.setItems(
            ordersDataSheetTable,
            orderTable,
            orderSnackComboBox,
            orderTotalValueField,
            orderQuantitySpinner
        );
        ordersController.main();
        
        calcController.setCalcItemField(calcItemField01);
        calcController.setCalcItemField(calcItemField02);
        calcController.setCalcItemField(calcItemField03);
        calcController.setCalcItemField(calcItemField04);
        calcController.setCalcItemField(calcItemField05);
        calcController.setCalcItemField(calcItemField06);
        calcController.setCalcItemField(calcItemField07);
        calcController.setCalcItemField(calcItemField08);
        calcController.setCalcItemField(calcItemField09);
        calcController.setCalcItemField(calcItemField10);

        calcController.setCalcQntField(calcQntField01);
        calcController.setCalcQntField(calcQntField02);
        calcController.setCalcQntField(calcQntField03);
        calcController.setCalcQntField(calcQntField04);
        calcController.setCalcQntField(calcQntField05);
        calcController.setCalcQntField(calcQntField06);
        calcController.setCalcQntField(calcQntField07);
        calcController.setCalcQntField(calcQntField08);
        calcController.setCalcQntField(calcQntField09);
        calcController.setCalcQntField(calcQntField10);

        calcController.setCalcUnityField(calcUnField01);
        calcController.setCalcUnityField(calcUnField02);
        calcController.setCalcUnityField(calcUnField03);
        calcController.setCalcUnityField(calcUnField04);
        calcController.setCalcUnityField(calcUnField05);
        calcController.setCalcUnityField(calcUnField06);
        calcController.setCalcUnityField(calcUnField07);
        calcController.setCalcUnityField(calcUnField08);
        calcController.setCalcUnityField(calcUnField09);
        calcController.setCalcUnityField(calcUnField10);

        calcController.setCalcCostField(calcCostField01);
        calcController.setCalcCostField(calcCostField02);
        calcController.setCalcCostField(calcCostField03);
        calcController.setCalcCostField(calcCostField04);
        calcController.setCalcCostField(calcCostField05);
        calcController.setCalcCostField(calcCostField06);
        calcController.setCalcCostField(calcCostField07);
        calcController.setCalcCostField(calcCostField08);
        calcController.setCalcCostField(calcCostField09);
        calcController.setCalcCostField(calcCostField10);

        calcController.setCalcPortionField(calcPortionField);
        calcController.setCalcQuantityFieldValue();
        
       
    }

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/logo icon program.png")));
    }
    
public void limparCalculoPorcoes() {
    calcQntField01.setText("");
    calcItemField01.setText("");
    calcUnField01.setText("");
    calcCostField01.setText("");
    calcItemField02.setText("");
    calcQntField02.setText("");
    calcUnField02.setText("");
    calcCostField02.setText("");
    calcPortionField.setText("");
    calcLunchField.setText("");

    calcItemField03.setText("");
    calcQntField03.setText("");
    calcUnField03.setText("");
    calcCostField03.setText("");
    calcItemField04.setText("");
    calcQntField04.setText("");
    calcUnField04.setText("");
    calcCostField04.setText("");
    calcItemField05.setText("");
    calcQntField05.setText("");
    
    calcUnField05.setText("");
    calcItemField06.setText("");
    calcQntField06.setText("");
    calcUnField06.setText("");
    calcCostField06.setText("");
    calcCostField05.setText("");
    calcCostField07.setText("");
    calcUnField07.setText("");
    calcQntField07.setText("");
    calcItemField07.setText("");
    
    calcItemField08.setText("");
    calcQntField08.setText("");
    calcUnField08.setText("");
    calcCostField08.setText("");
    calcItemField09.setText("");
    calcQntField09.setText("");
    calcUnField09.setText("");
    calcCostField09.setText("");
    calcItemField10.setText("");
    calcQntField10.setText("");
    
    calcUnField10.setText("");
    calcCostField10.setText("");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelMenu1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        buttonPedidos = new views.styles.MybtnMenu();
        buttonNovoPedido = new views.styles.MybtnMenu2();
        buttonVisualizarPedidos = new views.styles.MybtnMenu2();
        buttonProdutos = new views.styles.MybtnMenu();
        buttonEstoque = new views.styles.MybtnMenu();
        btnNovoPedido = new javax.swing.JButton();
        btnVisualizarPedidos = new javax.swing.JButton();
        btnProdutos1 = new javax.swing.JButton();
        btnEstoque1 = new javax.swing.JButton();
        lblVersion = new javax.swing.JLabel();
        logoVersion = new javax.swing.JLabel();
        painelMenu2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        buttonPedidos1 = new views.styles.MybtnMenu();
        buttonProdutos1 = new views.styles.MybtnMenu();
        buttonEstoque1 = new views.styles.MybtnMenu();
        buttonLanches = new views.styles.MybtnMenu2();
        buttonIngredientes = new views.styles.MybtnMenu2();
        buttonFichaTecnica = new views.styles.MybtnMenu2();
        buttonCalculoPorcoes = new views.styles.MybtnMenu2();
        lblVersion1 = new javax.swing.JLabel();
        logoVersion1 = new javax.swing.JLabel();
        painelMenu3 = new javax.swing.JPanel();
        logo3 = new javax.swing.JLabel();
        buttonPedidos3 = new views.styles.MybtnMenu();
        buttonProdutos3 = new views.styles.MybtnMenu();
        buttonEstoque3 = new views.styles.MybtnMenu();
        buttonEntradas = new views.styles.MybtnMenu2();
        buttonProdutosEstoque = new views.styles.MybtnMenu2();
        lblVersion2 = new javax.swing.JLabel();
        logoVersion2 = new javax.swing.JLabel();
        areaPrincipal = new javax.swing.JDesktopPane();
        rodapePainel = new javax.swing.JPanel();
        lblCopyright = new javax.swing.JLabel();
        bordaPainel = new javax.swing.JPanel();
        btnSair = new javax.swing.JLabel();
        areaNovoPedido = new javax.swing.JInternalFrame();
        panelNP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        colorBtn1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        orderSnackComboBox = new views.combobox.Combobox();
        orderQuantitySpinner = new views.spinner.Spinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordersDataSheetTable = new views.tables.Table();
        fotoVP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        orderTotalValueField = new javax.swing.JTextField();
        orderAddButton = new views.styles.Mybtn();
        areaVisualizarPedidos = new javax.swing.JInternalFrame();
        panelVP = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTable = new views.tables.Table();
        mybtn21 = new views.styles.Mybtn2();
        areaLanche = new javax.swing.JInternalFrame();
        panelLanche = new javax.swing.JPanel();
        fotoVP1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        snackSearchButton = new views.styles.Mybtn2();
        snackSearchField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        snackTitleField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        snackPriceOfSellingField = new javax.swing.JTextField();
        colorBtn4 = new javax.swing.JPanel();
        colorBtn5 = new javax.swing.JPanel();
        colorBtn6 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        snackTable = new views.tables.Table();
        snackAddButton = new views.styles.Mybtn();
        snackEditButton = new views.styles.Mybtn();
        snackDeleteButton = new views.styles.Mybtn();
        areaIngredientes = new javax.swing.JInternalFrame();
        panelIngredientes = new javax.swing.JPanel();
        fotoVP2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ingredientSearchField = new javax.swing.JTextField();
        colorBtn7 = new javax.swing.JPanel();
        colorBtn8 = new javax.swing.JPanel();
        colorBtn9 = new javax.swing.JPanel();
        ingredientSearchButton = new views.styles.Mybtn2();
        ingredientAddButton = new views.styles.Mybtn();
        ingredientEditButton = new views.styles.Mybtn();
        ingredientDeleteButton = new views.styles.Mybtn();
        jLabel17 = new javax.swing.JLabel();
        ingredientNameField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        ingredientTable = new views.tables.Table();
        areaFichaTecnica = new javax.swing.JInternalFrame();
        panelIngredientes1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        dataSheetSearchField = new javax.swing.JTextField();
        colorBtn19 = new javax.swing.JPanel();
        colorBtn20 = new javax.swing.JPanel();
        colorBtn21 = new javax.swing.JPanel();
        dataSheetSearchButton = new views.styles.Mybtn2();
        dataSheetAddButton = new views.styles.Mybtn();
        dataSheetEditButton = new views.styles.Mybtn();
        dataSheetDeleteButton = new views.styles.Mybtn();
        jLabel36 = new javax.swing.JLabel();
        dataFieldSnackField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        dataSheetTable = new views.tables.Table();
        areaCalculoPorcoes = new javax.swing.JInternalFrame();
        panelPE1 = new javax.swing.JPanel();
        calcQntField01 = new javax.swing.JTextField();
        calcItemField01 = new javax.swing.JTextField();
        calcUnField01 = new javax.swing.JTextField();
        calcCostField01 = new javax.swing.JTextField();
        calcItemField02 = new javax.swing.JTextField();
        calcQntField02 = new javax.swing.JTextField();
        calcUnField02 = new javax.swing.JTextField();
        calcCostField02 = new javax.swing.JTextField();
        calcPortionField = new javax.swing.JTextField();
        calcLunchField = new javax.swing.JTextField();
        calcItemField03 = new javax.swing.JTextField();
        calcQntField03 = new javax.swing.JTextField();
        calcUnField03 = new javax.swing.JTextField();
        calcCostField03 = new javax.swing.JTextField();
        calcItemField04 = new javax.swing.JTextField();
        calcQntField04 = new javax.swing.JTextField();
        calcUnField04 = new javax.swing.JTextField();
        calcCostField04 = new javax.swing.JTextField();
        calcItemField05 = new javax.swing.JTextField();
        calcQntField05 = new javax.swing.JTextField();
        calcUnField05 = new javax.swing.JTextField();
        calcItemField06 = new javax.swing.JTextField();
        calcQntField06 = new javax.swing.JTextField();
        calcUnField06 = new javax.swing.JTextField();
        calcCostField06 = new javax.swing.JTextField();
        calcCostField05 = new javax.swing.JTextField();
        calcCostField07 = new javax.swing.JTextField();
        calcUnField07 = new javax.swing.JTextField();
        calcQntField07 = new javax.swing.JTextField();
        calcItemField07 = new javax.swing.JTextField();
        calcItemField08 = new javax.swing.JTextField();
        calcQntField08 = new javax.swing.JTextField();
        calcUnField08 = new javax.swing.JTextField();
        calcCostField08 = new javax.swing.JTextField();
        calcItemField09 = new javax.swing.JTextField();
        calcQntField09 = new javax.swing.JTextField();
        calcUnField09 = new javax.swing.JTextField();
        calcCostField09 = new javax.swing.JTextField();
        calcItemField10 = new javax.swing.JTextField();
        calcQntField10 = new javax.swing.JTextField();
        calcUnField10 = new javax.swing.JTextField();
        calcCostField10 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        colorBtn18 = new javax.swing.JPanel();
        colorBtn22 = new javax.swing.JPanel();
        portionCalcBtn = new views.styles.Mybtn();
        calcCleanBtn = new views.styles.Mybtn();
        jSeparator7 = new javax.swing.JSeparator();
        calcTotalField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        areaEntradas = new javax.swing.JInternalFrame();
        panelEntradas = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        inputSearchField = new javax.swing.JTextField();
        colorBtn15 = new javax.swing.JPanel();
        colorBtn16 = new javax.swing.JPanel();
        colorBtn17 = new javax.swing.JPanel();
        inputSearchButton = new views.styles.Mybtn2();
        inputAddButton = new views.styles.Mybtn();
        inputEditButton = new views.styles.Mybtn();
        inputDeleteButton = new views.styles.Mybtn();
        jLabel27 = new javax.swing.JLabel();
        inputIngredientNameField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        inputTable = new views.tables.Table();
        inputIngredientUnityOfMeasureField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        areaProdutoEstoque = new javax.swing.JInternalFrame();
        panelPE = new javax.swing.JPanel();
        fotoVP3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        stockSearchField = new javax.swing.JTextField();
        stockSearchButton = new views.styles.Mybtn2();
        jLabel21 = new javax.swing.JLabel();
        stockIngredientNameField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        stockMinQuantityFIeld = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        stockTable = new views.tables.Table();
        stockUnityOfMeasureField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1040));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMenu1.setBackground(new java.awt.Color(217, 217, 217));
        painelMenu1.setMaximumSize(new java.awt.Dimension(300, 900));
        painelMenu1.setMinimumSize(new java.awt.Dimension(300, 900));
        painelMenu1.setPreferredSize(new java.awt.Dimension(300, 900));
        painelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo full.png"))); // NOI18N
        painelMenu1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 120));

        buttonPedidos.setBackground(new java.awt.Color(192, 192, 192));
        buttonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra.png"))); // NOI18N
        buttonPedidos.setText(" Pedidos");
        buttonPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPedidos.setOpaque(true);
        painelMenu1.add(buttonPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 280, 70));

        buttonNovoPedido.setBackground(new java.awt.Color(192, 192, 192));
        buttonNovoPedido.setText("     Novo Pedido");
        buttonNovoPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonNovoPedido.setOpaque(true);
        buttonNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPedidoActionPerformed(evt);
            }
        });
        painelMenu1.add(buttonNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 250, 70));

        buttonVisualizarPedidos.setBackground(new java.awt.Color(211, 211, 211));
        buttonVisualizarPedidos.setText("     Visualizar Pedidos");
        buttonVisualizarPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonVisualizarPedidos.setOpaque(true);
        buttonVisualizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarPedidosActionPerformed(evt);
            }
        });
        painelMenu1.add(buttonVisualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 335, 250, 70));

        buttonProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        buttonProdutos.setText(" Produtos");
        buttonProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProdutosActionPerformed(evt);
            }
        });
        painelMenu1.add(buttonProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 280, 70));

        buttonEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        buttonEstoque.setText("Estoque");
        buttonEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstoqueActionPerformed(evt);
            }
        });
        painelMenu1.add(buttonEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 505, 280, 70));

        btnNovoPedido.setBackground(new java.awt.Color(192, 192, 192));
        btnNovoPedido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnNovoPedido.setForeground(new java.awt.Color(56, 56, 56));
        btnNovoPedido.setText("     Novo Pedido");
        btnNovoPedido.setActionCommand("   Novo Pedido");
        btnNovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnNovoPedido.setContentAreaFilled(false);
        btnNovoPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoPedido.setDefaultCapable(false);
        btnNovoPedido.setHideActionText(true);
        btnNovoPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNovoPedido.setOpaque(true);
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });
        painelMenu1.add(btnNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 250, 70));

        btnVisualizarPedidos.setBackground(new java.awt.Color(211, 211, 211));
        btnVisualizarPedidos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnVisualizarPedidos.setForeground(new java.awt.Color(56, 56, 56));
        btnVisualizarPedidos.setText("     Visualizar Pedidos");
        btnVisualizarPedidos.setActionCommand("   Visualizar Pedidos");
        btnVisualizarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnVisualizarPedidos.setContentAreaFilled(false);
        btnVisualizarPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarPedidos.setDefaultCapable(false);
        btnVisualizarPedidos.setHideActionText(true);
        btnVisualizarPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVisualizarPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnVisualizarPedidos.setOpaque(true);
        btnVisualizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarPedidosActionPerformed(evt);
            }
        });
        painelMenu1.add(btnVisualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 335, 250, 70));

        btnProdutos1.setBackground(new java.awt.Color(211, 211, 211));
        btnProdutos1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnProdutos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        btnProdutos1.setText(" Produtos");
        btnProdutos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnProdutos1.setContentAreaFilled(false);
        btnProdutos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos1.setDefaultCapable(false);
        btnProdutos1.setHideActionText(true);
        btnProdutos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProdutos1.setOpaque(true);
        btnProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutos1ActionPerformed(evt);
            }
        });
        painelMenu1.add(btnProdutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 280, 70));

        btnEstoque1.setBackground(new java.awt.Color(211, 211, 211));
        btnEstoque1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEstoque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        btnEstoque1.setText(" Estoque");
        btnEstoque1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnEstoque1.setContentAreaFilled(false);
        btnEstoque1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque1.setDefaultCapable(false);
        btnEstoque1.setHideActionText(true);
        btnEstoque1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstoque1.setOpaque(true);
        btnEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoque1ActionPerformed(evt);
            }
        });
        painelMenu1.add(btnEstoque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 505, 280, 70));

        lblVersion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVersion.setText("version 1.0");
        lblVersion.setToolTipText("");
        lblVersion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelMenu1.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 854, 240, 50));

        logoVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoVersion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo icon.png"))); // NOI18N
        painelMenu1.add(logoVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 860, 30, 40));

        jPanel1.add(painelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 900));

        painelMenu2.setBackground(new java.awt.Color(217, 217, 217));
        painelMenu2.setMaximumSize(new java.awt.Dimension(300, 900));
        painelMenu2.setMinimumSize(new java.awt.Dimension(300, 900));
        painelMenu2.setPreferredSize(new java.awt.Dimension(300, 900));
        painelMenu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo full.png"))); // NOI18N
        painelMenu2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 120));

        buttonPedidos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra.png"))); // NOI18N
        buttonPedidos1.setText(" Pedidos");
        buttonPedidos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPedidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPedidos1ActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonPedidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 280, 70));

        buttonProdutos1.setBackground(new java.awt.Color(192, 192, 192));
        buttonProdutos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        buttonProdutos1.setText(" Produtos");
        buttonProdutos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonProdutos1.setOpaque(true);
        buttonProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProdutos1ActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonProdutos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 70));

        buttonEstoque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        buttonEstoque1.setText(" Estoque");
        buttonEstoque1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstoque1ActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonEstoque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 280, 70));

        buttonLanches.setBackground(new java.awt.Color(192, 192, 192));
        buttonLanches.setText("     Lanches");
        buttonLanches.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonLanches.setOpaque(true);
        buttonLanches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLanchesActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonLanches, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 250, 70));

        buttonIngredientes.setBackground(new java.awt.Color(192, 192, 192));
        buttonIngredientes.setText("     Ingredientes");
        buttonIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonIngredientes.setOpaque(true);
        buttonIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIngredientesActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 250, 70));

        buttonFichaTecnica.setBackground(new java.awt.Color(192, 192, 192));
        buttonFichaTecnica.setText("     Ficha Técnica");
        buttonFichaTecnica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonFichaTecnica.setOpaque(true);
        buttonFichaTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFichaTecnicaActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonFichaTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 250, 70));

        buttonCalculoPorcoes.setBackground(new java.awt.Color(192, 192, 192));
        buttonCalculoPorcoes.setText("     Cálculo de Porções");
        buttonCalculoPorcoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonCalculoPorcoes.setOpaque(true);
        buttonCalculoPorcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculoPorcoesActionPerformed(evt);
            }
        });
        painelMenu2.add(buttonCalculoPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 250, 70));

        lblVersion1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblVersion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVersion1.setText("version 1.0");
        lblVersion1.setToolTipText("");
        lblVersion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelMenu2.add(lblVersion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 854, 240, 50));

        logoVersion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoVersion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo icon.png"))); // NOI18N
        painelMenu2.add(logoVersion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 860, 30, 40));

        jPanel1.add(painelMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 900));

        painelMenu3.setBackground(new java.awt.Color(217, 217, 217));
        painelMenu3.setMaximumSize(new java.awt.Dimension(300, 900));
        painelMenu3.setMinimumSize(new java.awt.Dimension(300, 900));
        painelMenu3.setPreferredSize(new java.awt.Dimension(300, 900));
        painelMenu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo full.png"))); // NOI18N
        painelMenu3.add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 120, 120));

        buttonPedidos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra.png"))); // NOI18N
        buttonPedidos3.setText(" Pedidos");
        buttonPedidos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPedidos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPedidos3ActionPerformed(evt);
            }
        });
        painelMenu3.add(buttonPedidos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 280, 70));

        buttonProdutos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        buttonProdutos3.setText(" Produtos");
        buttonProdutos3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonProdutos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProdutos3ActionPerformed(evt);
            }
        });
        painelMenu3.add(buttonProdutos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 70));

        buttonEstoque3.setBackground(new java.awt.Color(192, 192, 192));
        buttonEstoque3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.png"))); // NOI18N
        buttonEstoque3.setText(" Estoque");
        buttonEstoque3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstoque3.setOpaque(true);
        buttonEstoque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstoque3ActionPerformed(evt);
            }
        });
        painelMenu3.add(buttonEstoque3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 280, 70));

        buttonEntradas.setBackground(new java.awt.Color(192, 192, 192));
        buttonEntradas.setText("     Entradas");
        buttonEntradas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEntradas.setOpaque(true);
        buttonEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntradasActionPerformed(evt);
            }
        });
        painelMenu3.add(buttonEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 425, 250, 70));

        buttonProdutosEstoque.setBackground(new java.awt.Color(192, 192, 192));
        buttonProdutosEstoque.setText("     Produtos em estoque");
        buttonProdutosEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonProdutosEstoque.setOpaque(true);
        buttonProdutosEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProdutosEstoqueActionPerformed(evt);
            }
        });
        painelMenu3.add(buttonProdutosEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 505, 250, 70));

        lblVersion2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblVersion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVersion2.setText("version 1.0");
        lblVersion2.setToolTipText("");
        lblVersion2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelMenu3.add(lblVersion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 854, 240, 50));

        logoVersion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoVersion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo icon.png"))); // NOI18N
        painelMenu3.add(logoVersion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 860, 30, 40));

        jPanel1.add(painelMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 900));

        areaPrincipal.setPreferredSize(new java.awt.Dimension(1550, 910));
        areaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rodapePainel.setBackground(new java.awt.Color(255, 255, 255));

        lblCopyright.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Copyright © 2023. Todos os direitos reservados ·Privacy·Terms");
        lblCopyright.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout rodapePainelLayout = new javax.swing.GroupLayout(rodapePainel);
        rodapePainel.setLayout(rodapePainelLayout);
        rodapePainelLayout.setHorizontalGroup(
            rodapePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rodapePainelLayout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(lblCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        rodapePainelLayout.setVerticalGroup(
            rodapePainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rodapePainelLayout.createSequentialGroup()
                .addComponent(lblCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        areaPrincipal.add(rodapePainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 1160, 50));

        bordaPainel.setBackground(new java.awt.Color(255, 255, 255));

        btnSair.setForeground(new java.awt.Color(34, 34, 34));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair 1.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bordaPainelLayout = new javax.swing.GroupLayout(bordaPainel);
        bordaPainel.setLayout(bordaPainelLayout);
        bordaPainelLayout.setHorizontalGroup(
            bordaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bordaPainelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(20, 20, 20))
        );
        bordaPainelLayout.setVerticalGroup(
            bordaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordaPainelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnSair)
                .addContainerGap(1045, Short.MAX_VALUE))
        );

        areaPrincipal.add(bordaPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, -1));

        areaNovoPedido.setBackground(new java.awt.Color(255, 255, 255));
        areaNovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaNovoPedido.setMaximumSize(new java.awt.Dimension(1070, 900));
        areaNovoPedido.setMinimumSize(new java.awt.Dimension(1070, 900));
        areaNovoPedido.setPreferredSize(new java.awt.Dimension(1070, 900));
        areaNovoPedido.setVisible(true);
        areaNovoPedido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNP.setBackground(new java.awt.Color(255, 255, 255));
        panelNP.setMaximumSize(new java.awt.Dimension(1160, 1020));
        panelNP.setMinimumSize(new java.awt.Dimension(1160, 1020));
        panelNP.setPreferredSize(new java.awt.Dimension(1160, 1020));
        panelNP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel3.setText("Quantidade");
        panelNP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 30));

        colorBtn1.setBackground(new java.awt.Color(117, 166, 119));

        javax.swing.GroupLayout colorBtn1Layout = new javax.swing.GroupLayout(colorBtn1);
        colorBtn1.setLayout(colorBtn1Layout);
        colorBtn1Layout.setHorizontalGroup(
            colorBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn1Layout.setVerticalGroup(
            colorBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelNP.add(colorBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 50, 10, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel6.setText("Ficha Técnica");
        panelNP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel7.setText("Total (R$)");
        panelNP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));
        panelNP.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel8.setText("Lanche");
        panelNP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        orderSnackComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        orderSnackComboBox.setSelectedItem(null);
        orderSnackComboBox.setLabeText("");
        orderSnackComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                orderSnackComboBoxItemStateChanged(evt);
            }
        });
        orderSnackComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderSnackComboBoxMouseClicked(evt);
            }
        });
        orderSnackComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderSnackComboBoxActionPerformed(evt);
            }
        });
        orderSnackComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                orderSnackComboBoxPropertyChange(evt);
            }
        });
        panelNP.add(orderSnackComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, 40));

        orderQuantitySpinner.setBackground(new java.awt.Color(51, 51, 255));
        orderQuantitySpinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        orderQuantitySpinner.setLabelText("");
        orderQuantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                orderQuantitySpinnerStateChanged(evt);
            }
        });
        panelNP.add(orderQuantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 102, 45));

        ordersDataSheetTable.fixTable(jScrollPane2);
        ordersDataSheetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"pao de hamburguer", "1", "un"},
                {"hamburguer", "1", "un"},
                {"ovo", "1", "un"},
                {"queijo fatiado", "0,01", "kg"}
            },
            new String [] {
                "Ingrediente", "Qnt", "Und. Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ordersDataSheetTable.setShowGrid(true);
        jScrollPane2.setViewportView(ordersDataSheetTable);
        if (ordersDataSheetTable.getColumnModel().getColumnCount() > 0) {
            ordersDataSheetTable.getColumnModel().getColumn(1).setResizable(false);
            ordersDataSheetTable.getColumnModel().getColumn(2).setResizable(false);
        }

        panelNP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 610, 450));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FOTO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVPLayout = new javax.swing.GroupLayout(fotoVP);
        fotoVP.setLayout(fotoVPLayout);
        fotoVPLayout.setHorizontalGroup(
            fotoVPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVPLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        fotoVPLayout.setVerticalGroup(
            fotoVPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVPLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        panelNP.add(fotoVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 213, 213));

        orderTotalValueField.setBackground(new java.awt.Color(243, 243, 243));
        orderTotalValueField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        orderTotalValueField.setName(""); // NOI18N
        orderTotalValueField.setEditable(false);
        orderTotalValueField.setOpaque(true);
        orderTotalValueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTotalValueFieldActionPerformed(evt);
            }
        });
        panelNP.add(orderTotalValueField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 102, 45));

        orderAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        orderAddButton.setText("FINALIZAR");
        orderAddButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderAddButtonActionPerformed(evt);
            }
        });
        panelNP.add(orderAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 129, 40));

        areaNovoPedido.getContentPane().add(panelNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 900));

        areaPrincipal.add(areaNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaVisualizarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        areaVisualizarPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaVisualizarPedidos.setMaximumSize(new java.awt.Dimension(1070, 900));
        areaVisualizarPedidos.setMinimumSize(new java.awt.Dimension(1070, 900));
        areaVisualizarPedidos.setPreferredSize(new java.awt.Dimension(1070, 900));
        areaVisualizarPedidos.setVisible(true);
        areaVisualizarPedidos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVP.setBackground(new java.awt.Color(255, 255, 255));
        panelVP.setMaximumSize(new java.awt.Dimension(1160, 900));
        panelVP.setMinimumSize(new java.awt.Dimension(1160, 900));
        panelVP.setPreferredSize(new java.awt.Dimension(1690, 900));
        panelVP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel9.setText("Total Vendas (R$)");
        panelVP.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField2.setName(""); // NOI18N
        panelVP.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));
        panelVP.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel11.setText("Data");
        panelVP.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jLabel1.setBackground(new java.awt.Color(103, 103, 103));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel1.setOpaque(true);
        panelVP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(243, 243, 243));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jTextField3.setName(""); // NOI18N
        jTextField3.setOpaque(true);
        panelVP.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 188, 45));

        ordersDataSheetTable.fixTable(jScrollPane3);
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "hamburguer", "1", "5,60", "12,00", "12,00", "01/02/2023"},
                {"1", "hamburguer", "1", "5,60", "12,00", "12,00", "01/02/2023"},
                {"1", "hamburguer", "2", "5,60", "12,00", "24,00", "01/02/2023"},
                {"2", "x-buguer duplo", "1", "8,69", "16,00", "16,00", "01/02/2023"}
            },
            new String [] {
                "Id pedido", "Lanche", "Qnt", "Custo Unt.", "Valor Unt.", "Valor Total Venda", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.setShowGrid(true);
        jScrollPane3.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
            orderTable.getColumnModel().getColumn(3).setResizable(false);
            orderTable.getColumnModel().getColumn(4).setResizable(false);
            orderTable.getColumnModel().getColumn(5).setResizable(false);
            orderTable.getColumnModel().getColumn(6).setResizable(false);
        }

        panelVP.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1000, 450));

        mybtn21.setText("OK");
        panelVP.add(mybtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        areaVisualizarPedidos.getContentPane().add(panelVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 900));

        areaPrincipal.add(areaVisualizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaLanche.setBackground(new java.awt.Color(255, 255, 255));
        areaLanche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaLanche.setMaximumSize(new java.awt.Dimension(1460, 900));
        areaLanche.setMinimumSize(new java.awt.Dimension(1460, 900));
        areaLanche.setPreferredSize(new java.awt.Dimension(1460, 900));
        areaLanche.setVisible(true);
        areaLanche.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLanche.setBackground(new java.awt.Color(255, 255, 255));
        panelLanche.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelLanche.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelLanche.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelLanche.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FOTO");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVP1Layout = new javax.swing.GroupLayout(fotoVP1);
        fotoVP1.setLayout(fotoVP1Layout);
        fotoVP1Layout.setHorizontalGroup(
            fotoVP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVP1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        fotoVP1Layout.setVerticalGroup(
            fotoVP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVP1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        panelLanche.add(fotoVP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 240, 240));

        jLabel4.setBackground(new java.awt.Color(103, 103, 103));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel4.setOpaque(true);
        panelLanche.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        snackSearchButton.setText("OK");
        snackSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackSearchButtonActionPerformed(evt);
            }
        });
        panelLanche.add(snackSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        snackSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        snackSearchField.setName(""); // NOI18N
        panelLanche.add(snackSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel13.setText("id");
        panelLanche.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        snackTitleField.setEditable(false);
        snackTitleField.setBackground(new java.awt.Color(243, 243, 243));
        snackTitleField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        snackTitleField.setName(""); // NOI18N
        snackTitleField.setOpaque(true);
        panelLanche.add(snackTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 188, 45));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel14.setText("Produto/Lanche");
        panelLanche.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel15.setText("Preço de venda (R$)");
        panelLanche.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 30));

        snackPriceOfSellingField.setEditable(false);
        snackPriceOfSellingField.setBackground(new java.awt.Color(243, 243, 243));
        snackPriceOfSellingField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        snackPriceOfSellingField.setName(""); // NOI18N
        snackPriceOfSellingField.setOpaque(true);
        snackPriceOfSellingField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snackPriceOfSellingFieldKeyTyped(evt);
            }
        });
        panelLanche.add(snackPriceOfSellingField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 45));

        colorBtn4.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn4Layout = new javax.swing.GroupLayout(colorBtn4);
        colorBtn4.setLayout(colorBtn4Layout);
        colorBtn4Layout.setHorizontalGroup(
            colorBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn4Layout.setVerticalGroup(
            colorBtn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLanche.add(colorBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 50, 10, 40));

        colorBtn5.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn5Layout = new javax.swing.GroupLayout(colorBtn5);
        colorBtn5.setLayout(colorBtn5Layout);
        colorBtn5Layout.setHorizontalGroup(
            colorBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn5Layout.setVerticalGroup(
            colorBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLanche.add(colorBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 100, 10, 40));

        colorBtn6.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn6Layout = new javax.swing.GroupLayout(colorBtn6);
        colorBtn6.setLayout(colorBtn6Layout);
        colorBtn6Layout.setHorizontalGroup(
            colorBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn6Layout.setVerticalGroup(
            colorBtn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelLanche.add(colorBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 150, 10, 40));
        panelLanche.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        ordersDataSheetTable.fixTable(jScrollPane4);
        snackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "hamburguer", "11,00", "..."},
                {"2", "x-burguer duplo", "16,00", "..."}
            },
            new String [] {
                "Id", "Lanche", "Preço Venda", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        snackTable.setShowGrid(true);
        snackTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snackTableMouseClicked(evt);
            }
        });
        snackTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                snackTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snackTableKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(snackTable);
        if (snackTable.getColumnModel().getColumnCount() > 0) {
            snackTable.getColumnModel().getColumn(0).setResizable(false);
            snackTable.getColumnModel().getColumn(1).setResizable(false);
            snackTable.getColumnModel().getColumn(2).setResizable(false);
            snackTable.getColumnModel().getColumn(3).setResizable(false);
        }

        panelLanche.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1000, 450));

        snackAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        snackAddButton.setText("NOVO");
        snackAddButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        snackAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackAddButtonActionPerformed(evt);
            }
        });
        panelLanche.add(snackAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 129, 40));

        snackEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        snackEditButton.setText("EDITAR");
        snackEditButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        snackEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackEditButtonActionPerformed(evt);
            }
        });
        panelLanche.add(snackEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 129, 40));

        snackDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        snackDeleteButton.setText("EXCLUIR");
        snackDeleteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        snackDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackDeleteButtonActionPerformed(evt);
            }
        });
        panelLanche.add(snackDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 129, 40));

        areaLanche.getContentPane().add(panelLanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 900));

        areaPrincipal.add(areaLanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        areaIngredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaIngredientes.setMaximumSize(new java.awt.Dimension(1460, 900));
        areaIngredientes.setMinimumSize(new java.awt.Dimension(1460, 900));
        areaIngredientes.setPreferredSize(new java.awt.Dimension(1460, 900));
        areaIngredientes.setVisible(true);
        areaIngredientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngredientes.setBackground(new java.awt.Color(255, 255, 255));
        panelIngredientes.setMaximumSize(new java.awt.Dimension(1690, 900));
        panelIngredientes.setMinimumSize(new java.awt.Dimension(1690, 900));
        panelIngredientes.setPreferredSize(new java.awt.Dimension(1690, 900));
        panelIngredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("FOTO");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVP2Layout = new javax.swing.GroupLayout(fotoVP2);
        fotoVP2.setLayout(fotoVP2Layout);
        fotoVP2Layout.setHorizontalGroup(
            fotoVP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVP2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        fotoVP2Layout.setVerticalGroup(
            fotoVP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVP2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        panelIngredientes.add(fotoVP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 240, 240));

        jLabel10.setBackground(new java.awt.Color(103, 103, 103));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel10.setOpaque(true);
        panelIngredientes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        ingredientSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientSearchField.setName(""); // NOI18N
        panelIngredientes.add(ingredientSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        colorBtn7.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn7Layout = new javax.swing.GroupLayout(colorBtn7);
        colorBtn7.setLayout(colorBtn7Layout);
        colorBtn7Layout.setHorizontalGroup(
            colorBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn7Layout.setVerticalGroup(
            colorBtn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes.add(colorBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 50, 10, 40));

        colorBtn8.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn8Layout = new javax.swing.GroupLayout(colorBtn8);
        colorBtn8.setLayout(colorBtn8Layout);
        colorBtn8Layout.setHorizontalGroup(
            colorBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn8Layout.setVerticalGroup(
            colorBtn8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes.add(colorBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 100, 10, 40));

        colorBtn9.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn9Layout = new javax.swing.GroupLayout(colorBtn9);
        colorBtn9.setLayout(colorBtn9Layout);
        colorBtn9Layout.setHorizontalGroup(
            colorBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn9Layout.setVerticalGroup(
            colorBtn9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes.add(colorBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 150, 10, 40));

        ingredientSearchButton.setText("OK");
        ingredientSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientSearchButtonActionPerformed(evt);
            }
        });
        panelIngredientes.add(ingredientSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        ingredientAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        ingredientAddButton.setText("NOVO");
        ingredientAddButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ingredientAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientAddButtonActionPerformed(evt);
            }
        });
        panelIngredientes.add(ingredientAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 129, 40));

        ingredientEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        ingredientEditButton.setText("EDITAR");
        ingredientEditButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ingredientEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientEditButtonActionPerformed(evt);
            }
        });
        panelIngredientes.add(ingredientEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 129, 40));

        ingredientDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        ingredientDeleteButton.setText("EXCLUIR");
        ingredientDeleteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ingredientDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientDeleteButtonActionPerformed(evt);
            }
        });
        panelIngredientes.add(ingredientDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 129, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel17.setText("id");
        panelIngredientes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        ingredientNameField.setEditable(false);
        ingredientNameField.setBackground(new java.awt.Color(243, 243, 243));
        ingredientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientNameField.setName(""); // NOI18N
        ingredientNameField.setOpaque(true);
        panelIngredientes.add(ingredientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 188, 45));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel18.setText("Ingrediente");
        panelIngredientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));
        panelIngredientes.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        ordersDataSheetTable.fixTable(jScrollPane5);
        ingredientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "pao de hamburguer", "un", "1", "1,00", "20"},
                {"2", "hamburguer", "un", "1", "1,52", "20"},
                {"3", "ovo", "un", "1", "0,83", "20"},
                {"4", "queijo fatiado", "kg", "0,01", "0,38", "0,2"},
                {"5", "bacon fatiado", "kg", "0,01", "0,36", "0,2"},
                {"6", "alface", "pes", "0,03", "0,18", "0,6"},
                {"7", "batata palha", "kg", "0,01", "0,28", "0,2"},
                {"8", "embalagens p/ hamburguer", "un", "10", "1,05", "20"}
            },
            new String [] {
                "id ", "Ingrediente", "Custo Unt.", "Qnt. Unt", "Qnt. Minima", "Und. Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ingredientTable.setShowGrid(true);
        ingredientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingredientTableMouseClicked(evt);
            }
        });
        ingredientTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ingredientTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ingredientTableKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingredientTableKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(ingredientTable);
        if (ingredientTable.getColumnModel().getColumnCount() > 0) {
            ingredientTable.getColumnModel().getColumn(0).setResizable(false);
            ingredientTable.getColumnModel().getColumn(1).setResizable(false);
            ingredientTable.getColumnModel().getColumn(2).setResizable(false);
            ingredientTable.getColumnModel().getColumn(3).setResizable(false);
            ingredientTable.getColumnModel().getColumn(4).setResizable(false);
            ingredientTable.getColumnModel().getColumn(5).setResizable(false);
        }

        panelIngredientes.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1000, 450));

        areaIngredientes.getContentPane().add(panelIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 900));

        areaPrincipal.add(areaIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaFichaTecnica.setBackground(new java.awt.Color(255, 255, 255));
        areaFichaTecnica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaFichaTecnica.setMaximumSize(new java.awt.Dimension(1460, 900));
        areaFichaTecnica.setMinimumSize(new java.awt.Dimension(1460, 900));
        areaFichaTecnica.setPreferredSize(new java.awt.Dimension(1460, 900));
        areaFichaTecnica.setVisible(true);
        areaFichaTecnica.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngredientes1.setBackground(new java.awt.Color(255, 255, 255));
        panelIngredientes1.setMaximumSize(new java.awt.Dimension(1690, 900));
        panelIngredientes1.setMinimumSize(new java.awt.Dimension(1690, 900));
        panelIngredientes1.setPreferredSize(new java.awt.Dimension(1690, 900));
        panelIngredientes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(103, 103, 103));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel35.setOpaque(true);
        panelIngredientes1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        dataSheetSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dataSheetSearchField.setName(""); // NOI18N
        panelIngredientes1.add(dataSheetSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        colorBtn19.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn19Layout = new javax.swing.GroupLayout(colorBtn19);
        colorBtn19.setLayout(colorBtn19Layout);
        colorBtn19Layout.setHorizontalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn19Layout.setVerticalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes1.add(colorBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 50, 10, 40));

        colorBtn20.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn20Layout = new javax.swing.GroupLayout(colorBtn20);
        colorBtn20.setLayout(colorBtn20Layout);
        colorBtn20Layout.setHorizontalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn20Layout.setVerticalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes1.add(colorBtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 100, 10, 40));

        colorBtn21.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn21Layout = new javax.swing.GroupLayout(colorBtn21);
        colorBtn21.setLayout(colorBtn21Layout);
        colorBtn21Layout.setHorizontalGroup(
            colorBtn21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn21Layout.setVerticalGroup(
            colorBtn21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelIngredientes1.add(colorBtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 150, 10, 40));

        dataSheetSearchButton.setText("OK");
        dataSheetSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSheetSearchButtonActionPerformed(evt);
            }
        });
        panelIngredientes1.add(dataSheetSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        dataSheetAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        dataSheetAddButton.setText("NOVO");
        dataSheetAddButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataSheetAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSheetAddButtonActionPerformed(evt);
            }
        });
        panelIngredientes1.add(dataSheetAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 129, 40));

        dataSheetEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        dataSheetEditButton.setText("EDITAR");
        dataSheetEditButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataSheetEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSheetEditButtonActionPerformed(evt);
            }
        });
        panelIngredientes1.add(dataSheetEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 129, 40));

        dataSheetDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        dataSheetDeleteButton.setText("EXCLUIR");
        dataSheetDeleteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataSheetDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataSheetDeleteButtonActionPerformed(evt);
            }
        });
        panelIngredientes1.add(dataSheetDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 129, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setText("id");
        panelIngredientes1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        dataFieldSnackField.setEditable(false);
        dataFieldSnackField.setBackground(new java.awt.Color(243, 243, 243));
        dataFieldSnackField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dataFieldSnackField.setName(""); // NOI18N
        dataFieldSnackField.setOpaque(true);
        panelIngredientes1.add(dataFieldSnackField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 188, 45));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel37.setText("Lanche");
        panelIngredientes1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));
        panelIngredientes1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        ordersDataSheetTable.fixTable(jScrollPane9);
        dataSheetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"hamburguer", "pao de hamburguer", "1", "un", "1,00"},
                {"hamburguer", "hamburguer", "1", "un", "1,52"},
                {"hamburguer", "ovo", "1", "un", "0,83"},
                {"hamburguer", "queijo fatiado", "0,01", "kg", "0,38"},
                {"hamburguer", "bacon fatiado", "0,01", "kg", "0,36"},
                {"hamburguer", "alface", "0,03", "pes", "0,18"},
                {"hamburguer", "batata palha", "0,01", "kg", "0,28"},
                {"hamburguer", "embalagens p/ hamburguer", "1", "un", "1,05"},
                {"x-burguer duplo", "pao de hamburguer", "1", "un", "1,00"},
                {"x-burguer duplo", "hambuguer", "2", "un", "3,04"},
                {"x-burguer duplo", "ovo", "2", "un", "1,67"},
                {"x-burguer duplo", "queijo fatiado", "0,02", "kg", "0,77"},
                {"x-burguer duplo", "bacon fatiado", "0,02", "kg", "0,71"},
                {"x-burguer duplo", "alface", "0,03", "pes", "0,18"},
                {"x-burguer duplo", "batata palha", "0,01", "kg", "0,28"},
                {"x-burguer duplo", "embalagens p/ hamburguer", "1", "un", "1,05"}
            },
            new String [] {
                "Lanche", "Ingrediente", "Qnt.", "Und. medida", "Custo qnt."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataSheetTable.setShowGrid(true);
        dataSheetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataSheetTableMouseClicked(evt);
            }
        });
        dataSheetTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataSheetTableKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(dataSheetTable);
        if (dataSheetTable.getColumnModel().getColumnCount() > 0) {
            dataSheetTable.getColumnModel().getColumn(0).setResizable(false);
            dataSheetTable.getColumnModel().getColumn(1).setResizable(false);
            dataSheetTable.getColumnModel().getColumn(2).setResizable(false);
            dataSheetTable.getColumnModel().getColumn(3).setResizable(false);
            dataSheetTable.getColumnModel().getColumn(4).setResizable(false);
        }

        panelIngredientes1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1000, 450));

        areaFichaTecnica.getContentPane().add(panelIngredientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 900));

        areaPrincipal.add(areaFichaTecnica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaCalculoPorcoes.setBackground(new java.awt.Color(255, 255, 255));
        areaCalculoPorcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaCalculoPorcoes.setMaximumSize(new java.awt.Dimension(1460, 900));
        areaCalculoPorcoes.setMinimumSize(new java.awt.Dimension(1460, 900));
        areaCalculoPorcoes.setPreferredSize(new java.awt.Dimension(1460, 900));
        areaCalculoPorcoes.setVisible(true);
        areaCalculoPorcoes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPE1.setBackground(new java.awt.Color(255, 255, 255));
        panelPE1.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelPE1.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelPE1.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelPE1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcQntField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField01.setName(""); // NOI18N
        calcQntField01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcQntField01ActionPerformed(evt);
            }
        });
        calcQntField01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField01KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 100, 45));

        calcItemField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField01.setName(""); // NOI18N
        calcItemField01.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                calcItemField01CaretUpdate(evt);
            }
        });
        calcItemField01.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calcItemField01FocusLost(evt);
            }
        });
        calcItemField01.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                calcItemField01ComponentShown(evt);
            }
        });
        calcItemField01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcItemField01ActionPerformed(evt);
            }
        });
        panelPE1.add(calcItemField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, 45));

        calcUnField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField01.setName(""); // NOI18N
        panelPE1.add(calcUnField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 100, 45));

        calcCostField01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField01.setName(""); // NOI18N
        calcCostField01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField01ActionPerformed(evt);
            }
        });
        calcCostField01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField01KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField01KeyTyped(evt);
            }
        });
        panelPE1.add(calcCostField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 100, 45));

        calcItemField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField02.setName(""); // NOI18N
        panelPE1.add(calcItemField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 365, 320, 45));

        calcQntField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField02.setName(""); // NOI18N
        calcQntField02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField02KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 365, 100, 45));

        calcUnField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField02.setName(""); // NOI18N
        panelPE1.add(calcUnField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 365, 100, 45));

        calcCostField02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField02.setName(""); // NOI18N
        calcCostField02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField02KeyTyped(evt);
            }
        });
        calcCostField02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField02ActionPerformed(evt);
            }
        });
        calcCostField02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField02KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 365, 100, 45));

        calcPortionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcPortionField.setName(""); // NOI18N
        calcPortionField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                calcPortionFieldCaretUpdate(evt);
            }
        });
        calcPortionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcPortionFieldActionPerformed(evt);
            }
        });
        panelPE1.add(calcPortionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 45));
        calcPortionField.setText("1");

        calcLunchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcLunchField.setName(""); // NOI18N
        panelPE1.add(calcLunchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 240, 45));

        calcItemField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField03.setName(""); // NOI18N
        panelPE1.add(calcItemField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 320, 45));

        calcQntField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField03.setName(""); // NOI18N
        calcQntField03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField03KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 100, 45));

        calcUnField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField03.setName(""); // NOI18N
        panelPE1.add(calcUnField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 100, 45));

        calcCostField03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField03.setName(""); // NOI18N
        calcCostField03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField03KeyTyped(evt);
            }
        });
        calcCostField03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField03ActionPerformed(evt);
            }
        });
        calcCostField03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField03KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 100, 45));

        calcItemField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField04.setName(""); // NOI18N
        panelPE1.add(calcItemField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 475, 320, 45));

        calcQntField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField04.setName(""); // NOI18N
        calcQntField04.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField04KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 475, 100, 45));

        calcUnField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField04.setName(""); // NOI18N
        panelPE1.add(calcUnField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 475, 100, 45));

        calcCostField04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField04.setName(""); // NOI18N
        calcCostField04.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField04KeyTyped(evt);
            }
        });
        calcCostField04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField04ActionPerformed(evt);
            }
        });
        calcCostField04.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField04KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 475, 100, 45));

        calcItemField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField05.setName(""); // NOI18N
        panelPE1.add(calcItemField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 320, 45));

        calcQntField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField05.setName(""); // NOI18N
        calcQntField05.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField05KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 100, 45));

        calcUnField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField05.setName(""); // NOI18N
        panelPE1.add(calcUnField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 100, 45));

        calcItemField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField06.setName(""); // NOI18N
        panelPE1.add(calcItemField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 585, 320, 45));

        calcQntField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField06.setName(""); // NOI18N
        calcQntField06.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField06KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 585, 100, 45));

        calcUnField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField06.setName(""); // NOI18N
        panelPE1.add(calcUnField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 585, 100, 45));

        calcCostField06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField06.setName(""); // NOI18N
        calcCostField06.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField06KeyTyped(evt);
            }
        });
        calcCostField06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField06ActionPerformed(evt);
            }
        });
        calcCostField06.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField06KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField06, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 585, 100, 45));

        calcCostField05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField05.setName(""); // NOI18N
        calcCostField05.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField05KeyTyped(evt);
            }
        });
        calcCostField05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField05ActionPerformed(evt);
            }
        });
        calcCostField05.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField05KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 100, 45));

        calcCostField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField07.setName(""); // NOI18N
        calcCostField07.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField07KeyTyped(evt);
            }
        });
        calcCostField07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField07ActionPerformed(evt);
            }
        });
        calcCostField07.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField07KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 100, 45));

        calcUnField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField07.setName(""); // NOI18N
        panelPE1.add(calcUnField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 100, 45));

        calcQntField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField07.setName(""); // NOI18N
        calcQntField07.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField07KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 100, 45));

        calcItemField07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField07.setName(""); // NOI18N
        panelPE1.add(calcItemField07, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 320, 45));

        calcItemField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField08.setName(""); // NOI18N
        panelPE1.add(calcItemField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 695, 320, 45));

        calcQntField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField08.setName(""); // NOI18N
        calcQntField08.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField08KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 695, 100, 45));

        calcUnField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField08.setName(""); // NOI18N
        panelPE1.add(calcUnField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 695, 100, 45));

        calcCostField08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField08.setName(""); // NOI18N
        calcCostField08.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField08KeyTyped(evt);
            }
        });
        calcCostField08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField08ActionPerformed(evt);
            }
        });
        calcCostField08.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField08KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField08, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 695, 100, 45));

        calcItemField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField09.setName(""); // NOI18N
        panelPE1.add(calcItemField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 320, 45));

        calcQntField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField09.setName(""); // NOI18N
        calcQntField09.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField09KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 750, 100, 45));

        calcUnField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField09.setName(""); // NOI18N
        panelPE1.add(calcUnField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 750, 100, 45));

        calcCostField09.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField09.setName(""); // NOI18N
        calcCostField09.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField09KeyTyped(evt);
            }
        });
        calcCostField09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField09ActionPerformed(evt);
            }
        });
        calcCostField09.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField09KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField09, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 750, 100, 45));

        calcItemField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcItemField10.setName(""); // NOI18N
        panelPE1.add(calcItemField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 805, 320, 45));

        calcQntField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcQntField10.setName(""); // NOI18N
        calcQntField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcQntField10KeyTyped(evt);
            }
        });
        panelPE1.add(calcQntField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 805, 100, 45));

        calcUnField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcUnField10.setName(""); // NOI18N
        panelPE1.add(calcUnField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 805, 100, 45));

        calcCostField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcCostField10.setName(""); // NOI18N
        calcCostField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                calcCostField10KeyTyped(evt);
            }
        });
        calcCostField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCostField10ActionPerformed(evt);
            }
        });
        calcCostField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                calcCostField10KeyReleased(evt);
            }
        });
        panelPE1.add(calcCostField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 805, 100, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("Produto/lanche");
        panelPE1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel33.setText("Qnt.");
        panelPE1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 100, 30));

        colorBtn18.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout colorBtn18Layout = new javax.swing.GroupLayout(colorBtn18);
        colorBtn18.setLayout(colorBtn18Layout);
        colorBtn18Layout.setHorizontalGroup(
            colorBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn18Layout.setVerticalGroup(
            colorBtn18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPE1.add(colorBtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 100, 10, 40));

        colorBtn22.setBackground(new java.awt.Color(67, 0, 153));

        javax.swing.GroupLayout colorBtn22Layout = new javax.swing.GroupLayout(colorBtn22);
        colorBtn22.setLayout(colorBtn22Layout);
        colorBtn22Layout.setHorizontalGroup(
            colorBtn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn22Layout.setVerticalGroup(
            colorBtn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPE1.add(colorBtn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 50, 10, 40));

        portionCalcBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculadora.png"))); // NOI18N
        portionCalcBtn.setText("CALCULAR");
        portionCalcBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        portionCalcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portionCalcBtnActionPerformed(evt);
            }
        });
        panelPE1.add(portionCalcBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 129, 40));

        calcCleanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar.png"))); // NOI18N
        calcCleanBtn.setText("LIMPAR");
        calcCleanBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        calcCleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCleanBtnActionPerformed(evt);
            }
        });
        panelPE1.add(calcCleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 129, 40));
        panelPE1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1570, 30));

        calcTotalField.setEditable(false);
        calcTotalField.setBackground(new java.awt.Color(243, 243, 243));
        calcTotalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        calcTotalField.setName(""); // NOI18N
        calcTotalField.setOpaque(true);
        calcTotalField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                calcTotalFieldCaretUpdate(evt);
            }
        });
        calcTotalField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calcTotalFieldPropertyChange(evt);
            }
        });
        calcTotalField.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                calcTotalFieldVetoableChange(evt);
            }
        });
        panelPE1.add(calcTotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 210, 45));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Custo Total de Produção (R$):");
        panelPE1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 210, 45));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel38.setText("Itens");
        panelPE1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel39.setText("Und. Medida");
        panelPE1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 100, 30));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel40.setText("Custo (R$)");
        panelPE1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 100, 30));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel41.setText("Qnt. de porções");
        panelPE1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 30));

        areaCalculoPorcoes.getContentPane().add(panelPE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 1000));

        areaPrincipal.add(areaCalculoPorcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaEntradas.setBackground(new java.awt.Color(255, 255, 255));
        areaEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaEntradas.setMaximumSize(new java.awt.Dimension(1460, 900));
        areaEntradas.setMinimumSize(new java.awt.Dimension(1460, 900));
        areaEntradas.setPreferredSize(new java.awt.Dimension(1460, 900));
        areaEntradas.setVisible(true);
        areaEntradas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEntradas.setBackground(new java.awt.Color(255, 255, 255));
        panelEntradas.setMaximumSize(new java.awt.Dimension(1690, 900));
        panelEntradas.setMinimumSize(new java.awt.Dimension(1690, 900));
        panelEntradas.setPreferredSize(new java.awt.Dimension(1690, 900));
        panelEntradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(103, 103, 103));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel26.setOpaque(true);
        panelEntradas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        inputSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputSearchField.setName(""); // NOI18N
        panelEntradas.add(inputSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        colorBtn15.setBackground(new java.awt.Color(90, 90, 90));

        javax.swing.GroupLayout colorBtn15Layout = new javax.swing.GroupLayout(colorBtn15);
        colorBtn15.setLayout(colorBtn15Layout);
        colorBtn15Layout.setHorizontalGroup(
            colorBtn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn15Layout.setVerticalGroup(
            colorBtn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas.add(colorBtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 50, 10, 40));

        colorBtn16.setBackground(new java.awt.Color(218, 151, 21));

        javax.swing.GroupLayout colorBtn16Layout = new javax.swing.GroupLayout(colorBtn16);
        colorBtn16.setLayout(colorBtn16Layout);
        colorBtn16Layout.setHorizontalGroup(
            colorBtn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn16Layout.setVerticalGroup(
            colorBtn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas.add(colorBtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 100, 10, 40));

        colorBtn17.setBackground(new java.awt.Color(207, 131, 131));

        javax.swing.GroupLayout colorBtn17Layout = new javax.swing.GroupLayout(colorBtn17);
        colorBtn17.setLayout(colorBtn17Layout);
        colorBtn17Layout.setHorizontalGroup(
            colorBtn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn17Layout.setVerticalGroup(
            colorBtn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas.add(colorBtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 150, 10, 40));

        inputSearchButton.setText("OK");
        inputSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchButtonActionPerformed(evt);
            }
        });
        panelEntradas.add(inputSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 50, 47, 45));

        inputAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        inputAddButton.setText("NOVO");
        inputAddButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddButtonActionPerformed(evt);
            }
        });
        panelEntradas.add(inputAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 129, 40));

        inputEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        inputEditButton.setText("EDITAR");
        inputEditButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEditButtonActionPerformed(evt);
            }
        });
        panelEntradas.add(inputEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 129, 40));

        inputDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        inputDeleteButton.setText("EXCLUIR");
        inputDeleteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDeleteButtonActionPerformed(evt);
            }
        });
        panelEntradas.add(inputDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 129, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel27.setText("id");
        panelEntradas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        inputIngredientNameField.setEditable(false);
        inputIngredientNameField.setBackground(new java.awt.Color(243, 243, 243));
        inputIngredientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputIngredientNameField.setName(""); // NOI18N
        inputIngredientNameField.setOpaque(true);
        panelEntradas.add(inputIngredientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 350, 45));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel28.setText("Ingrediente");
        panelEntradas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));
        panelEntradas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        ordersDataSheetTable.fixTable(jScrollPane7);
        inputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "pao de hamburguer", "100", "un", "99,80", "01/05/2023"},
                {"2", "hamburguer", "100", "un", "152,00", "01/05/2023"},
                {"3", "ovo", "100", "un", "83,33", "01/05/2023"},
                {"4", "queijo fatiado", "1", "kg", "38,40", "01/05/2023"},
                {"5", "bacon fatiado", "1", "kg", "35,67", "01/05/2023"},
                {"6", "alface", "3", "pes", "17,97", "01/05/2023"},
                {"7", "batata palha", "1", "kg", "27,70", "01/05/2023"},
                {"8", "embalagens p/ hamburguer", "100", "un", "104,65", "01/05/2023"},
                {"1", "pao de hamburguer", "250", "un", "99,80", "01/05/2023"}
            },
            new String [] {
                "id_ingrediente", "Ingrediente", "Quantidade", "Und. medida", "Custo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inputTable.setShowGrid(true);
        inputTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(inputTable);
        if (inputTable.getColumnModel().getColumnCount() > 0) {
            inputTable.getColumnModel().getColumn(0).setResizable(false);
            inputTable.getColumnModel().getColumn(1).setResizable(false);
            inputTable.getColumnModel().getColumn(2).setResizable(false);
            inputTable.getColumnModel().getColumn(3).setResizable(false);
            inputTable.getColumnModel().getColumn(4).setResizable(false);
            inputTable.getColumnModel().getColumn(5).setResizable(false);
        }

        panelEntradas.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1000, 450));

        inputIngredientUnityOfMeasureField.setEditable(false);
        inputIngredientUnityOfMeasureField.setBackground(new java.awt.Color(243, 243, 243));
        inputIngredientUnityOfMeasureField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputIngredientUnityOfMeasureField.setName(""); // NOI18N
        inputIngredientUnityOfMeasureField.setOpaque(true);
        panelEntradas.add(inputIngredientUnityOfMeasureField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, 45));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel30.setText("Und. medida");
        panelEntradas.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, 30));

        areaEntradas.getContentPane().add(panelEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 900));

        areaPrincipal.add(areaEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        areaProdutoEstoque.setBackground(new java.awt.Color(255, 255, 255));
        areaProdutoEstoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaProdutoEstoque.setMaximumSize(new java.awt.Dimension(1460, 900));
        areaProdutoEstoque.setMinimumSize(new java.awt.Dimension(1460, 900));
        areaProdutoEstoque.setPreferredSize(new java.awt.Dimension(1460, 900));
        areaProdutoEstoque.setVisible(true);
        areaProdutoEstoque.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPE.setBackground(new java.awt.Color(255, 255, 255));
        panelPE.setMaximumSize(new java.awt.Dimension(1690, 900));
        panelPE.setMinimumSize(new java.awt.Dimension(1690, 900));
        panelPE.setPreferredSize(new java.awt.Dimension(1690, 900));
        panelPE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("FOTO");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout fotoVP3Layout = new javax.swing.GroupLayout(fotoVP3);
        fotoVP3.setLayout(fotoVP3Layout);
        fotoVP3Layout.setHorizontalGroup(
            fotoVP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoVP3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        fotoVP3Layout.setVerticalGroup(
            fotoVP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoVP3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        panelPE.add(fotoVP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 240, 240));

        jLabel20.setBackground(new java.awt.Color(103, 103, 103));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel20.setOpaque(true);
        panelPE.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        stockSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        stockSearchField.setName(""); // NOI18N
        panelPE.add(stockSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 260, 45));

        stockSearchButton.setText("OK");
        stockSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockSearchButtonActionPerformed(evt);
            }
        });
        panelPE.add(stockSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 50, 47, 45));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel21.setText("Pesquisar");
        panelPE.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        stockIngredientNameField.setEditable(false);
        stockIngredientNameField.setBackground(new java.awt.Color(243, 243, 243));
        stockIngredientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        stockIngredientNameField.setName(""); // NOI18N
        stockIngredientNameField.setOpaque(true);
        panelPE.add(stockIngredientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 350, 45));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel22.setText("Ingrediente");
        panelPE.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel23.setText("Estoque mínimo");
        panelPE.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 30));

        stockMinQuantityFIeld.setEditable(false);
        stockMinQuantityFIeld.setBackground(new java.awt.Color(243, 243, 243));
        stockMinQuantityFIeld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        stockMinQuantityFIeld.setName(""); // NOI18N
        stockMinQuantityFIeld.setOpaque(true);
        panelPE.add(stockMinQuantityFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 45));
        panelPE.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 1570, 30));

        ordersDataSheetTable.fixTable(jScrollPane6);
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "pao de hamburguer", "350", "20", "un", "Estoque estável"},
                {"2", "hamburguer", "100", "20", "un", "Estoque estável"},
                {"3", "ovo", "100", "20", "un", "Estoque estável"},
                {"4", "queijo fatiado", "1", "0,2", "kg", "Estoque estável"},
                {"5", "bacon fatiado", "1", "0,2", "kg", "Estoque estável"},
                {"6", "alface", "3", "0,6", "pes", "Estoque estável"},
                {"7", "batata palha", "1", "0,2", "kg", "Estoque estável"},
                {"8", "embalagens p/ hamburguer", "100", "20", "un", "Estoque estável"}
            },
            new String [] {
                "id_ingrediente", "Ingrediente", "Total estoque", "Estoque min.", "Und. medida", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.setColumnSelectionAllowed(true);
        stockTable.setShowGrid(true);
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(stockTable);
        if (stockTable.getColumnModel().getColumnCount() > 0) {
            stockTable.getColumnModel().getColumn(0).setResizable(false);
            stockTable.getColumnModel().getColumn(1).setResizable(false);
            stockTable.getColumnModel().getColumn(2).setResizable(false);
            stockTable.getColumnModel().getColumn(3).setResizable(false);
            stockTable.getColumnModel().getColumn(4).setResizable(false);
            stockTable.getColumnModel().getColumn(5).setResizable(false);
        }

        panelPE.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 930, 450));

        stockUnityOfMeasureField.setEditable(false);
        stockUnityOfMeasureField.setBackground(new java.awt.Color(243, 243, 243));
        stockUnityOfMeasureField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        stockUnityOfMeasureField.setName(""); // NOI18N
        stockUnityOfMeasureField.setOpaque(true);
        panelPE.add(stockUnityOfMeasureField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, 45));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel24.setText("Und. medida");
        panelPE.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 140, 30));

        areaProdutoEstoque.getContentPane().add(panelPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 900));

        areaPrincipal.add(areaProdutoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1070, 900));

        jPanel1.add(areaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        btnNovoPedido.setBackground(Color.decode("#C0C0C0"));
        btnVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));

        
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void btnVisualizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarPedidosActionPerformed
        btnVisualizarPedidos.setBackground(Color.decode("#C0C0C0"));
        btnNovoPedido.setBackground(Color.decode("#D3D3D3"));
        
        btnNovoPedido.setIcon(null);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(true);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnVisualizarPedidosActionPerformed

    private void btnProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutos1ActionPerformed
        buttonIngredientes.setBackground(Color.decode("#D3D3D3"));
        buttonFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        buttonCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        buttonLanches.setBackground(Color.decode("#C0C0C0"));
        
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
        

    }//GEN-LAST:event_btnProdutos1ActionPerformed

    private void btnEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoque1ActionPerformed
        buttonEntradas.setBackground(Color.decode("#C0C0C0"));
        buttonProdutosEstoque.setBackground(Color.decode("#D3D3D3"));

        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_btnEstoque1ActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void snackAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackAddButtonActionPerformed
        SnackAdd snackAdd = new SnackAdd();
        snackAdd.setJTable(snackTable);
        snackAdd.setOrdersController(ordersController);
        snackAdd.searchFields();
        snackAdd.setVisible(true);
    }//GEN-LAST:event_snackAddButtonActionPerformed

    private void snackEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackEditButtonActionPerformed
        SnackEdit snackEdit = new SnackEdit();
        snackEdit.setJTable(snackTable);
        if(snackTable.getSelectedRow() != -1){
            snackEdit.searchFields();
            snackEdit.setFieldsValue();
            snackEdit.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um item da tabela!");
        }
        
    }//GEN-LAST:event_snackEditButtonActionPerformed
    
    private void ingredientAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientAddButtonActionPerformed
       IngredientAdd ingredientAdd = new IngredientAdd();
       ingredientAdd.setJTable(ingredientTable);
       ingredientAdd.searchFields();
       ingredientAdd.setVisible(true);
    }//GEN-LAST:event_ingredientAddButtonActionPerformed

    private void ingredientEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientEditButtonActionPerformed

        IngredientEdit ingredientEdit = new IngredientEdit();
        ingredientEdit.setJTable(ingredientTable);
        if(ingredientTable.getSelectedRow() != -1){
            ingredientEdit.searchFields();
            ingredientEdit.setFieldsValue();
            ingredientEdit.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um item da tabela!");
        }
    }//GEN-LAST:event_ingredientEditButtonActionPerformed

    private void dataSheetAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSheetAddButtonActionPerformed
       DataSheetAdd dataSheetAdd = new DataSheetAdd();
       dataSheetAdd.setJTable(dataSheetTable);
       dataSheetAdd.setComboBox(orderSnackComboBox);
       dataSheetAdd.setOrderController(ordersController);
       dataSheetAdd.searchFields();
       dataSheetAdd.setVisible(true);
    }//GEN-LAST:event_dataSheetAddButtonActionPerformed

    private void dataSheetEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSheetEditButtonActionPerformed
        DataSheetEdit editDataSheet = new DataSheetEdit();
        if(dataSheetTable.getSelectedRow() != -1){
            editDataSheet.setJTable(dataSheetTable);
            editDataSheet.setSnackModel(dataSheetController.getSnacksList().get(dataSheetTable.getSelectedRow()));
            editDataSheet.setIngredientModel(dataSheetController.getIngredientsList().get(dataSheetTable.getSelectedRow()));
            
            editDataSheet.searchFields();
            editDataSheet.setFieldsValue();
            
            editDataSheet.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um item da tabela!");
        }
        
    }//GEN-LAST:event_dataSheetEditButtonActionPerformed

    private void portionCalcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portionCalcBtnActionPerformed
        portionCalcResult.setController(calcController);
        
        portionCalcResult.clearFields();
        portionCalcResult.findItemFields();
        portionCalcResult.findQntFields();
        portionCalcResult.findUnityFields();
        portionCalcResult.findCostFields();
        portionCalcResult.findInfoFields();
            
        portionCalcResult.setCurrentPortionQuantity();
        portionCalcResult.setFieldsValue();
        
        portionCalcResult.setSnackName(calcLunchField.getText());
        
        portionCalcResult.setVisible(true);
        
    }//GEN-LAST:event_portionCalcBtnActionPerformed

    private void calcCleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCleanBtnActionPerformed
        limparCalculoPorcoes();
    }//GEN-LAST:event_calcCleanBtnActionPerformed

    private void inputAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddButtonActionPerformed
       InputAdd inputAdd = new InputAdd();
       inputAdd.setController(inputController);
       inputAdd.setJTable(inputTable);
       inputAdd.setStockController(stockController);
       inputAdd.searchFields();
       inputAdd.setDateField();
       inputAdd.setVisible(true);
    }//GEN-LAST:event_inputAddButtonActionPerformed

    private void inputEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEditButtonActionPerformed
        if(inputTable.getSelectedRow() != -1){
            InputEdit inputEdit = new InputEdit();
            inputEdit.setController(inputController);
            inputEdit.setJTable(inputTable);
            inputEdit.searchFields();
            inputEdit.setFieldsValue();
            
            inputEdit.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um item da tabela!");
        }
    }//GEN-LAST:event_inputEditButtonActionPerformed

    private void buttonNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPedidoActionPerformed
        buttonNovoPedido.setBackground(Color.decode("#C0C0C0"));
        buttonVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));

        
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonNovoPedidoActionPerformed

    private void buttonVisualizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarPedidosActionPerformed
        buttonVisualizarPedidos.setBackground(Color.decode("#C0C0C0"));
        buttonNovoPedido.setBackground(Color.decode("#D3D3D3"));
        
        btnNovoPedido.setIcon(null);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(true);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonVisualizarPedidosActionPerformed

    private void buttonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProdutosActionPerformed
        buttonIngredientes.setBackground(Color.decode("#D3D3D3"));
        buttonFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        buttonCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        buttonLanches.setBackground(Color.decode("#C0C0C0"));
        
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonProdutosActionPerformed

    private void buttonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstoqueActionPerformed
        buttonEntradas.setBackground(Color.decode("#C0C0C0"));
        buttonProdutosEstoque.setBackground(Color.decode("#D3D3D3"));

        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonEstoqueActionPerformed

    private void buttonProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProdutos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonProdutos1ActionPerformed

    private void buttonEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstoque1ActionPerformed
        buttonEntradas.setBackground(Color.decode("#C0C0C0"));
        buttonProdutosEstoque.setBackground(Color.decode("#D3D3D3"));
        
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(true);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonEstoque1ActionPerformed

    private void buttonLanchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLanchesActionPerformed
        buttonIngredientes.setBackground(Color.decode("#D3D3D3"));
        buttonFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        buttonCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        buttonLanches.setBackground(Color.decode("#C0C0C0"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonLanchesActionPerformed

    private void buttonIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIngredientesActionPerformed
        buttonIngredientes.setBackground(Color.decode("#C0C0C0"));
        buttonFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        buttonCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        buttonLanches.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(true);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonIngredientesActionPerformed

    private void buttonFichaTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFichaTecnicaActionPerformed
        buttonIngredientes.setBackground(Color.decode("#D3D3D3"));
        buttonFichaTecnica.setBackground(Color.decode("#C0C0C0"));
        buttonCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        buttonLanches.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(true);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonFichaTecnicaActionPerformed

    private void buttonCalculoPorcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculoPorcoesActionPerformed
        buttonIngredientes.setBackground(Color.decode("#D3D3D3"));
        buttonFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        buttonCalculoPorcoes.setBackground(Color.decode("#C0C0C0"));
        buttonLanches.setBackground(Color.decode("#D3D3D3"));
        
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(true);
    }//GEN-LAST:event_buttonCalculoPorcoesActionPerformed

    private void buttonPedidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPedidos1ActionPerformed
        buttonNovoPedido.setBackground(Color.decode("#C0C0C0"));
        buttonVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));
        
        painelMenu1.setVisible(true);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);

        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonPedidos1ActionPerformed

    private void buttonPedidos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPedidos3ActionPerformed
        buttonNovoPedido.setBackground(Color.decode("#C0C0C0"));
        buttonVisualizarPedidos.setBackground(Color.decode("#D3D3D3"));
        
        painelMenu1.setVisible(true);
        painelMenu2.setVisible(false);
        painelMenu3.setVisible(false);
        
        areaNovoPedido.setVisible(true);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonPedidos3ActionPerformed

    private void buttonProdutos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProdutos3ActionPerformed
        buttonIngredientes.setBackground(Color.decode("#D3D3D3"));
        buttonFichaTecnica.setBackground(Color.decode("#D3D3D3"));
        buttonCalculoPorcoes.setBackground(Color.decode("#D3D3D3"));
        buttonLanches.setBackground(Color.decode("#C0C0C0"));
        
        painelMenu1.setVisible(false);
        painelMenu2.setVisible(true);
        painelMenu3.setVisible(false);
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(true);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonProdutos3ActionPerformed

    private void buttonEstoque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstoque3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEstoque3ActionPerformed

    private void buttonEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntradasActionPerformed
        buttonProdutosEstoque.setBackground(Color.decode("#D3D3D3"));
        buttonEntradas.setBackground(Color.decode("#C0C0C0"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(false);
        areaEntradas.setVisible(true);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonEntradasActionPerformed

    private void buttonProdutosEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProdutosEstoqueActionPerformed
        buttonProdutosEstoque.setBackground(Color.decode("#C0C0C0"));
        buttonEntradas.setBackground(Color.decode("#D3D3D3"));
        
        areaNovoPedido.setVisible(false);
        areaVisualizarPedidos.setVisible(false);
        areaLanche.setVisible(false);
        areaIngredientes.setVisible(false);
        areaProdutoEstoque.setVisible(true);
        areaEntradas.setVisible(false);
        areaFichaTecnica.setVisible(false);
        areaCalculoPorcoes.setVisible(false);
    }//GEN-LAST:event_buttonProdutosEstoqueActionPerformed

    private void calcItemField01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcItemField01ActionPerformed

    }//GEN-LAST:event_calcItemField01ActionPerformed

    private void calcQntField01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcQntField01ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_calcQntField01ActionPerformed

    private void calcItemField01ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_calcItemField01ComponentShown
       // TODO add your handling code here:
    }//GEN-LAST:event_calcItemField01ComponentShown

    private void calcItemField01CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_calcItemField01CaretUpdate
   // TODO add your handling code here:
    }//GEN-LAST:event_calcItemField01CaretUpdate

    private void calcItemField01FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calcItemField01FocusLost
    }//GEN-LAST:event_calcItemField01FocusLost

    private void calcPortionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcPortionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcPortionFieldActionPerformed

    private void ingredientSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientSearchButtonActionPerformed
        try {
            ingredientController.readJTableSearch(ingredientSearchField.getText());
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingredientSearchButtonActionPerformed

    private void ingredientDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientDeleteButtonActionPerformed
        ingredientController.setJTable(ingredientTable);
        try {   
            ingredientController.delete();
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingredientDeleteButtonActionPerformed

    private void ingredientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingredientTableMouseClicked
        ingredientNameField.setText(ingredientTable.getValueAt(ingredientTable.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_ingredientTableMouseClicked

    private void ingredientTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientTableKeyReleased
        ingredientNameField.setText(ingredientTable.getValueAt(ingredientTable.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_ingredientTableKeyReleased

    private void ingredientTableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientTableKeyTyped
  
    }//GEN-LAST:event_ingredientTableKeyTyped

    private void ingredientTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientTableKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            IngredientEdit ingredientEdit = new IngredientEdit();
            ingredientEdit.setJTable(ingredientTable);
            if(ingredientTable.getSelectedRow() != -1){
                ingredientEdit.searchFields();
                ingredientEdit.setFieldsValue();
                ingredientEdit.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um item da tabela!");
            }
        }
    }//GEN-LAST:event_ingredientTableKeyPressed

    private void snackDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackDeleteButtonActionPerformed
        snackController.setJTable(snackTable);
        try {   
            snackController.delete();
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_snackDeleteButtonActionPerformed

    private void snackTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snackTableKeyReleased
        snackTitleField.setText(snackTable.getValueAt(snackTable.getSelectedRow(), 1).toString());
        snackPriceOfSellingField.setText(snackTable.getValueAt(snackTable.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_snackTableKeyReleased

    private void snackTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snackTableKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SnackEdit snackEdit = new SnackEdit();
            snackEdit.setJTable(snackTable);
            if(snackTable.getSelectedRow() != -1){
                snackEdit.searchFields();
                snackEdit.setFieldsValue();
                snackEdit.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um item da tabela!");
            }
        }
    }//GEN-LAST:event_snackTableKeyPressed

    private void snackTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snackTableMouseClicked
        snackTitleField.setText(snackTable.getValueAt(snackTable.getSelectedRow(), 1).toString());
        snackPriceOfSellingField.setText(snackTable.getValueAt(snackTable.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_snackTableMouseClicked

    private void snackSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackSearchButtonActionPerformed
        try {
            snackController.readJTableSearch(snackSearchField.getText());
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_snackSearchButtonActionPerformed

    private void dataSheetSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSheetSearchButtonActionPerformed
        try {
            dataSheetController.readJTableSearch(dataSheetSearchField.getText());
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataSheetSearchButtonActionPerformed

    private void dataSheetDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataSheetDeleteButtonActionPerformed
        dataSheetController.setJTable(dataSheetTable);
        try {   
            dataSheetController.delete();
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataSheetDeleteButtonActionPerformed

    private void dataSheetTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataSheetTableKeyReleased
        dataFieldSnackField.setText(String.valueOf(dataSheetTable.getValueAt(dataSheetTable.getSelectedRow(), 0)));
    }//GEN-LAST:event_dataSheetTableKeyReleased

    private void dataSheetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataSheetTableMouseClicked
        dataFieldSnackField.setText(String.valueOf(dataSheetTable.getValueAt(dataSheetTable.getSelectedRow(), 0)));
    }//GEN-LAST:event_dataSheetTableMouseClicked

    private void inputDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDeleteButtonActionPerformed
        inputController.setJTable(inputTable);
        try {   
            inputController.delete();
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputDeleteButtonActionPerformed

    private void inputSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchButtonActionPerformed
        inputController.setJTable(inputTable);
        try {   
            inputController.readJTableSearch(inputSearchField.getText());
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputSearchButtonActionPerformed

    private void inputTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputTableMouseClicked
        InputEdit inputEdit = new InputEdit();
        inputEdit.setController(inputController);
        inputEdit.setJTable(inputTable);
        inputEdit.setIngredientModel();
        inputEdit.setInputModel();
        
    }//GEN-LAST:event_inputTableMouseClicked

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
        System.out.println(stockTable.getSelectedRow());
    }//GEN-LAST:event_stockTableMouseClicked

    private void stockSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockSearchButtonActionPerformed
        try {
            stockController.readJTableSearch(stockSearchField.getText());
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stockSearchButtonActionPerformed

    private void orderSnackComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderSnackComboBoxActionPerformed
        int currentValue = orderSnackComboBox.getSelectedIndex();
        if(currentValue != oldValue){
            try {
                oldValue = currentValue;

                ordersController.readDataSheetTable(orderSnackComboBox.getSelectedIndex());
                ordersController.calcTotalValue();
            } catch (SQLException ex) {
                Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_orderSnackComboBoxActionPerformed

    private void orderSnackComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_orderSnackComboBoxPropertyChange
    }//GEN-LAST:event_orderSnackComboBoxPropertyChange

    private void orderSnackComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_orderSnackComboBoxItemStateChanged
  /*      try {
            ordersController.readDataSheetTable(orderSnackComboBox.getSelectedIndex());
            ordersController.calcTotalValue();
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }//GEN-LAST:event_orderSnackComboBoxItemStateChanged

    private void orderQuantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_orderQuantitySpinnerStateChanged
        ordersController.calcTotalValue();
    }//GEN-LAST:event_orderQuantitySpinnerStateChanged

    private void orderAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderAddButtonActionPerformed
        try {
            ordersController.buildSnack();
            stockController.readJTable();
            ingredientController.readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderAddButtonActionPerformed

    private void orderSnackComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderSnackComboBoxMouseClicked
 
    }//GEN-LAST:event_orderSnackComboBoxMouseClicked

    private void orderTotalValueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderTotalValueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderTotalValueFieldActionPerformed

    private void calcQntField01KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField01KeyTyped
           String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField01KeyTyped

    private void calcCostField01KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField01KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField01KeyTyped

    private void calcQntField02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField02KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField02KeyTyped

    private void calcCostField02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField02KeyTyped
           String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField02KeyTyped

    private void calcQntField03KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField03KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField03KeyTyped

    private void calcCostField03KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField03KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField03KeyTyped

    private void calcQntField04KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField04KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField04KeyTyped

    private void calcCostField04KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField04KeyTyped
             String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField04KeyTyped

    private void calcQntField05KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField05KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField05KeyTyped

    private void calcCostField05KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField05KeyTyped
             String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField05KeyTyped

    private void calcQntField06KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField06KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField06KeyTyped

    private void calcCostField06KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField06KeyTyped
           String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField06KeyTyped

    private void calcQntField07KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField07KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField07KeyTyped

    private void calcCostField07KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField07KeyTyped
             String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField07KeyTyped

    private void calcQntField08KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField08KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField08KeyTyped

    private void calcCostField08KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField08KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField08KeyTyped

    private void calcQntField09KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField09KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField09KeyTyped

    private void calcCostField09KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField09KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField09KeyTyped

    private void calcQntField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcQntField10KeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcQntField10KeyTyped

    private void calcCostField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField10KeyTyped
       String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
         
    }//GEN-LAST:event_calcCostField10KeyTyped

    private void snackPriceOfSellingFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snackPriceOfSellingFieldKeyTyped
         String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
         }
    }//GEN-LAST:event_snackPriceOfSellingFieldKeyTyped
    private void calcCostField01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField01KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField01KeyReleased

    private void calcCostField01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcCostField01ActionPerformed

    private void calcCostField02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField02ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField02ActionPerformed

    private void calcCostField03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField03ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField03ActionPerformed

    private void calcCostField04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField04ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField04ActionPerformed

    private void calcCostField05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField05ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField05ActionPerformed

    private void calcCostField06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField06ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField06ActionPerformed

    private void calcCostField07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField07ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField07ActionPerformed

    private void calcCostField08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField08ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField08ActionPerformed

    private void calcCostField09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField09ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField09ActionPerformed

    private void calcCostField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCostField10ActionPerformed
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField10ActionPerformed

    private void calcCostField02KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField02KeyReleased
       calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField02KeyReleased

    private void calcCostField03KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField03KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField03KeyReleased

    private void calcCostField04KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField04KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField04KeyReleased

    private void calcCostField05KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField05KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField05KeyReleased

    private void calcCostField06KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField06KeyReleased
       calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField06KeyReleased

    private void calcCostField07KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField07KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField07KeyReleased

    private void calcCostField08KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField08KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField08KeyReleased

    private void calcCostField09KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField09KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField09KeyReleased

    private void calcCostField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcCostField10KeyReleased
        calcTotalField.setText(String.valueOf(calcController.sumAllCalcCost()));
    }//GEN-LAST:event_calcCostField10KeyReleased

    private void calcTotalFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calcTotalFieldPropertyChange
    }//GEN-LAST:event_calcTotalFieldPropertyChange

    private void calcTotalFieldVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_calcTotalFieldVetoableChange
        
    }//GEN-LAST:event_calcTotalFieldVetoableChange

    private void calcTotalFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_calcTotalFieldCaretUpdate
        calcController.setCalcTotalCostField(calcTotalField);
    }//GEN-LAST:event_calcTotalFieldCaretUpdate

    private void calcPortionFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_calcPortionFieldCaretUpdate
        calcController.setCalcPortionField(calcPortionField);
    }//GEN-LAST:event_calcPortionFieldCaretUpdate
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
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new StockViews().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StockViews.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaCalculoPorcoes;
    private javax.swing.JInternalFrame areaEntradas;
    private javax.swing.JInternalFrame areaFichaTecnica;
    private javax.swing.JInternalFrame areaIngredientes;
    private javax.swing.JInternalFrame areaLanche;
    private javax.swing.JInternalFrame areaNovoPedido;
    private javax.swing.JDesktopPane areaPrincipal;
    private javax.swing.JInternalFrame areaProdutoEstoque;
    private javax.swing.JInternalFrame areaVisualizarPedidos;
    private javax.swing.JPanel bordaPainel;
    private javax.swing.JButton btnEstoque1;
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JButton btnProdutos1;
    private javax.swing.JLabel btnSair;
    private javax.swing.JButton btnVisualizarPedidos;
    private views.styles.MybtnMenu2 buttonCalculoPorcoes;
    private views.styles.MybtnMenu2 buttonEntradas;
    private views.styles.MybtnMenu buttonEstoque;
    private views.styles.MybtnMenu buttonEstoque1;
    private views.styles.MybtnMenu buttonEstoque3;
    private views.styles.MybtnMenu2 buttonFichaTecnica;
    private views.styles.MybtnMenu2 buttonIngredientes;
    private views.styles.MybtnMenu2 buttonLanches;
    private views.styles.MybtnMenu2 buttonNovoPedido;
    private views.styles.MybtnMenu buttonPedidos;
    private views.styles.MybtnMenu buttonPedidos1;
    private views.styles.MybtnMenu buttonPedidos3;
    private views.styles.MybtnMenu buttonProdutos;
    private views.styles.MybtnMenu buttonProdutos1;
    private views.styles.MybtnMenu buttonProdutos3;
    private views.styles.MybtnMenu2 buttonProdutosEstoque;
    private views.styles.MybtnMenu2 buttonVisualizarPedidos;
    private views.styles.Mybtn calcCleanBtn;
    private javax.swing.JTextField calcCostField01;
    private javax.swing.JTextField calcCostField02;
    private javax.swing.JTextField calcCostField03;
    private javax.swing.JTextField calcCostField04;
    private javax.swing.JTextField calcCostField05;
    private javax.swing.JTextField calcCostField06;
    private javax.swing.JTextField calcCostField07;
    private javax.swing.JTextField calcCostField08;
    private javax.swing.JTextField calcCostField09;
    private javax.swing.JTextField calcCostField10;
    private javax.swing.JTextField calcItemField01;
    private javax.swing.JTextField calcItemField02;
    private javax.swing.JTextField calcItemField03;
    private javax.swing.JTextField calcItemField04;
    private javax.swing.JTextField calcItemField05;
    private javax.swing.JTextField calcItemField06;
    private javax.swing.JTextField calcItemField07;
    private javax.swing.JTextField calcItemField08;
    private javax.swing.JTextField calcItemField09;
    private javax.swing.JTextField calcItemField10;
    private javax.swing.JTextField calcLunchField;
    private javax.swing.JTextField calcPortionField;
    private javax.swing.JTextField calcQntField01;
    private javax.swing.JTextField calcQntField02;
    private javax.swing.JTextField calcQntField03;
    private javax.swing.JTextField calcQntField04;
    private javax.swing.JTextField calcQntField05;
    private javax.swing.JTextField calcQntField06;
    private javax.swing.JTextField calcQntField07;
    private javax.swing.JTextField calcQntField08;
    private javax.swing.JTextField calcQntField09;
    private javax.swing.JTextField calcQntField10;
    private javax.swing.JTextField calcTotalField;
    private javax.swing.JTextField calcUnField01;
    private javax.swing.JTextField calcUnField02;
    private javax.swing.JTextField calcUnField03;
    private javax.swing.JTextField calcUnField04;
    private javax.swing.JTextField calcUnField05;
    private javax.swing.JTextField calcUnField06;
    private javax.swing.JTextField calcUnField07;
    private javax.swing.JTextField calcUnField08;
    private javax.swing.JTextField calcUnField09;
    private javax.swing.JTextField calcUnField10;
    private javax.swing.JPanel colorBtn1;
    private javax.swing.JPanel colorBtn15;
    private javax.swing.JPanel colorBtn16;
    private javax.swing.JPanel colorBtn17;
    private javax.swing.JPanel colorBtn18;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private javax.swing.JPanel colorBtn21;
    private javax.swing.JPanel colorBtn22;
    private javax.swing.JPanel colorBtn4;
    private javax.swing.JPanel colorBtn5;
    private javax.swing.JPanel colorBtn6;
    private javax.swing.JPanel colorBtn7;
    private javax.swing.JPanel colorBtn8;
    private javax.swing.JPanel colorBtn9;
    private javax.swing.JTextField dataFieldSnackField;
    private views.styles.Mybtn dataSheetAddButton;
    private views.styles.Mybtn dataSheetDeleteButton;
    private views.styles.Mybtn dataSheetEditButton;
    private views.styles.Mybtn2 dataSheetSearchButton;
    private javax.swing.JTextField dataSheetSearchField;
    private views.tables.Table dataSheetTable;
    private javax.swing.JPanel fotoVP;
    private javax.swing.JPanel fotoVP1;
    private javax.swing.JPanel fotoVP2;
    private javax.swing.JPanel fotoVP3;
    private views.styles.Mybtn ingredientAddButton;
    private views.styles.Mybtn ingredientDeleteButton;
    private views.styles.Mybtn ingredientEditButton;
    private javax.swing.JTextField ingredientNameField;
    private views.styles.Mybtn2 ingredientSearchButton;
    private javax.swing.JTextField ingredientSearchField;
    private views.tables.Table ingredientTable;
    private views.styles.Mybtn inputAddButton;
    private views.styles.Mybtn inputDeleteButton;
    private views.styles.Mybtn inputEditButton;
    private javax.swing.JTextField inputIngredientNameField;
    private javax.swing.JTextField inputIngredientUnityOfMeasureField;
    private views.styles.Mybtn2 inputSearchButton;
    private javax.swing.JTextField inputSearchField;
    private views.tables.Table inputTable;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JLabel lblVersion1;
    private javax.swing.JLabel lblVersion2;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel logoVersion;
    private javax.swing.JLabel logoVersion1;
    private javax.swing.JLabel logoVersion2;
    private views.styles.Mybtn2 mybtn21;
    private views.styles.Mybtn orderAddButton;
    private views.spinner.Spinner orderQuantitySpinner;
    private views.combobox.Combobox orderSnackComboBox;
    private views.tables.Table orderTable;
    private javax.swing.JTextField orderTotalValueField;
    private views.tables.Table ordersDataSheetTable;
    private javax.swing.JPanel painelMenu1;
    private javax.swing.JPanel painelMenu2;
    private javax.swing.JPanel painelMenu3;
    private javax.swing.JPanel panelEntradas;
    private javax.swing.JPanel panelIngredientes;
    private javax.swing.JPanel panelIngredientes1;
    private javax.swing.JPanel panelLanche;
    private javax.swing.JPanel panelNP;
    private javax.swing.JPanel panelPE;
    private javax.swing.JPanel panelPE1;
    private javax.swing.JPanel panelVP;
    private views.styles.Mybtn portionCalcBtn;
    private javax.swing.JPanel rodapePainel;
    private views.styles.Mybtn snackAddButton;
    private views.styles.Mybtn snackDeleteButton;
    private views.styles.Mybtn snackEditButton;
    private javax.swing.JTextField snackPriceOfSellingField;
    private views.styles.Mybtn2 snackSearchButton;
    private javax.swing.JTextField snackSearchField;
    private views.tables.Table snackTable;
    private javax.swing.JTextField snackTitleField;
    private javax.swing.JTextField stockIngredientNameField;
    private javax.swing.JTextField stockMinQuantityFIeld;
    private views.styles.Mybtn2 stockSearchButton;
    private javax.swing.JTextField stockSearchField;
    private views.tables.Table stockTable;
    private javax.swing.JTextField stockUnityOfMeasureField;
    // End of variables declaration//GEN-END:variables
}
