/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.views;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import lk.ijse.pos.controller.CustomerFormController;
import lk.ijse.pos.controller.OrdersFormController;
import lk.ijse.pos.dto.CollectionDTO;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.OrderDetailDTO;
import lk.ijse.pos.dto.OrdersDTO;

/**
 *
 * @author Yashitha Nadiranga
 */
public class OrderForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form HomeForm
     */
    public OrderForm() {
        initComponents();
        setUI();
        loadcust();
        loadFoodNames();
        loadorderID();
        loadDate();

    }

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
        tblorders = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddCart = new keeptoo.KButton();
        btnplaceorder = new keeptoo.KButton();
        jLabel5 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblprice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbloid = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbtp = new javax.swing.JComboBox<>();
        cmbmethod = new javax.swing.JComboBox<>();
        cmbfoodname = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblItemTotal = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(990, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblorders.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblorders.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblorders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "QTY", "Unit Price", "Item Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorders.setSelectionBackground(new java.awt.Color(50, 51, 53));
        jScrollPane1.setViewportView(tblorders);
        if (tblorders.getColumnModel().getColumnCount() > 0) {
            tblorders.getColumnModel().getColumn(0).setResizable(false);
            tblorders.getColumnModel().getColumn(1).setResizable(false);
            tblorders.getColumnModel().getColumn(2).setResizable(false);
            tblorders.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 950, 210));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Cust_Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtcname.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtcname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(184, 14, 61)));
        jPanel1.add(txtcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 310, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel3.setText("Tele No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnAddCart.setText("Add Cart");
        btnAddCart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddCart.setkAllowGradient(false);
        btnAddCart.setkBackGroundColor(new java.awt.Color(33, 150, 83));
        btnAddCart.setkHoverColor(new java.awt.Color(38, 137, 66));
        btnAddCart.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnAddCart.setkHoverStartColor(new java.awt.Color(30, 133, 242));
        btnAddCart.setkPressedColor(new java.awt.Color(33, 150, 83));
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        btnplaceorder.setText("Place Order");
        btnplaceorder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnplaceorder.setkAllowGradient(false);
        btnplaceorder.setkBackGroundColor(new java.awt.Color(24, 133, 242));
        btnplaceorder.setkHoverColor(new java.awt.Color(0, 98, 204));
        btnplaceorder.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnplaceorder.setkHoverStartColor(new java.awt.Color(30, 133, 242));
        btnplaceorder.setkPressedColor(new java.awt.Color(24, 133, 242));
        btnplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplaceorderActionPerformed(evt);
            }
        });
        jPanel1.add(btnplaceorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel5.setText("QTY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        txtqty.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtqty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(184, 14, 61)));
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        txtqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtqtyKeyReleased(evt);
            }
        });
        jPanel1.add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 300, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel6.setText("Date Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        txttime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txttime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(184, 14, 61)));
        jPanel1.add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 80, -1));

        txtdate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        txtdate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(184, 14, 61)));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 150, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/pos/views/img/icons8_age_30px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, -1));

        lblprice.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblprice.setText("0");
        jPanel1.add(lblprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel9.setText("Total");

        lbltotal.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbltotal.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(lbltotal)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 230, 40));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel10.setText("Order ID");

        lbloid.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbloid.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lbloid, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbloid, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 200, -1));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel12.setText("Method");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        cmbtp.setEditable(true);
        cmbtp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbtp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbtpItemStateChanged(evt);
            }
        });
        cmbtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtpActionPerformed(evt);
            }
        });
        jPanel1.add(cmbtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 310, 30));

        cmbmethod.setEditable(true);
        cmbmethod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbmethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Call", "Walk in Coustomers" }));
        jPanel1.add(cmbmethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 300, 30));

        cmbfoodname.setEditable(true);
        cmbfoodname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbfoodname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfoodnameActionPerformed(evt);
            }
        });
        jPanel1.add(cmbfoodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 310, 30));

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel13.setText("Food Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel14.setText("Unit Price");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel15.setText("Item Total");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        lblItemTotal.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblItemTotal.setText("0");
        jPanel1.add(lblItemTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblorders.getModel();
        int rowIndex = isExsist(cmbfoodname.getSelectedItem().toString());
        System.out.println(rowIndex);
        double unitPrice = Double.valueOf(lblprice.getText());
        int qty = Integer.valueOf(txtqty.getText());
        double total = Double.valueOf(lblItemTotal.getText());

        if (rowIndex == -1) {
            model.addRow(new Object[]{
                cmbfoodname.getSelectedItem().toString(),
                txtqty.getText(),
                lblprice.getText(),
                total
            });
        } else {
            int m = Integer.valueOf(model.getValueAt(rowIndex, 1).toString());
            qty += m;
            total = qty * unitPrice;
            tblorders.setValueAt(qty, rowIndex, 1);
            tblorders.setValueAt(total, rowIndex, 3);
//               
        }
        calculateTotal();
        lblItemTotal.setText("0");
        txtqty.setText("");
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void cmbtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtpActionPerformed

    private void cmbfoodnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfoodnameActionPerformed
        String val = cmbfoodname.getSelectedItem().toString();
        getFoodprice(val);
    }//GEN-LAST:event_cmbfoodnameActionPerformed

    private void cmbtpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbtpItemStateChanged
        String val = cmbtp.getSelectedItem().toString();
        getcusName(val);
    }//GEN-LAST:event_cmbtpItemStateChanged

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void txtqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyReleased
        if (txtqty.getText().trim().length() > 0) {
            double price = Double.valueOf(lblprice.getText());
            int qty = Integer.valueOf(txtqty.getText());
            lblItemTotal.setText(String.valueOf(price * qty));
        }
    }//GEN-LAST:event_txtqtyKeyReleased

    private void btnplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplaceorderActionPerformed
        UploadData();
    }//GEN-LAST:event_btnplaceorderActionPerformed

    private void setUI() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        tblorders.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblorders.getTableHeader().setOpaque(false);
        tblorders.getTableHeader().setBackground(new Color(184, 14, 61));
        tblorders.getTableHeader().setForeground(new Color(255, 255, 255));
        tblorders.getTableHeader().setBorder(new LineBorder(Color.white));
        tblorders.setRowHeight(30);
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());

        Color ivory = new Color(255, 255, 255);
        tblorders.setOpaque(true);
        tblorders.setFillsViewportHeight(true);
        tblorders.setBackground(ivory);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAddCart;
    private keeptoo.KButton btnplaceorder;
    private javax.swing.JComboBox<String> cmbfoodname;
    private javax.swing.JComboBox<String> cmbmethod;
    private javax.swing.JComboBox<String> cmbtp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemTotal;
    private javax.swing.JLabel lbloid;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblorders;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables

    private void loadcust() {
        try {
            List<CustomerDTO> cust = new OrdersFormController().getAllCustomers();
            cmbtp.removeAllItems();
            for (CustomerDTO customerDTO : cust) {
                cmbtp.addItem(customerDTO.getTp());
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getcusName(String val) {
        try {
            List<CustomerDTO> cust = new OrdersFormController().getCustName(val);
            for (CustomerDTO customerDTO : cust) {
                txtcname.setText(customerDTO.getName());
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadFoodNames() {
        try {
            List<CollectionDTO> foods = new OrdersFormController().getFoodnames();
            cmbfoodname.removeAllItems();
            for (CollectionDTO collectionDTO : foods) {
                cmbfoodname.addItem(collectionDTO.getFname());
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int isExsist(String text) {
        DefaultTableModel model = (DefaultTableModel) tblorders.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String temp = model.getValueAt(i, 0).toString();
            if (temp.equalsIgnoreCase(text)) {
                return i;
            }
        }
        return -1;

    }

    private void getFoodprice(String val) {
        try {
            List<CollectionDTO> foods = new OrdersFormController().getFoodPrice(val);
            for (CollectionDTO collectionDTO : foods) {
                lblprice.setText(collectionDTO.getFprice());
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void calculateTotal() {
        DefaultTableModel model = (DefaultTableModel) tblorders.getModel();
        double temptotal = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            temptotal += (double) model.getValueAt(i, 3);
        }
        lbltotal.setText(temptotal + "");
    }

    private void loadorderID() {
        try {
            String oid = new OrdersFormController().getOrderID();
            int val = Integer.parseInt(oid);
            lbloid.setText(String.valueOf(++val));
        } catch (Exception ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getDateTime() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        String datetime = format1.format(D1);
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        datetime = datetime + " " + format2.format(D1);
        return datetime;
    }
    
    private String getDateTime2() {
        Date D1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        String datetime = format1.format(D1);
        return datetime;
    }

    private void UploadData() {

        try {
            OrdersDTO o1 = new OrdersDTO(
                    lbloid.getText(),
                    cmbtp.getSelectedItem().toString(),
                    cmbmethod.getSelectedItem().toString(),
                    getDateTime(),
                    txtdate.getText() + " " + txttime.getText(),
                    lbltotal.getText(),
                    "Processing"
            );

            DefaultTableModel model = (DefaultTableModel) tblorders.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                OrderDetailDTO detail = new OrderDetailDTO(
                        lbloid.getText(),
                        model.getValueAt(i, 0).toString(),
                        model.getValueAt(i, 2).toString(),
                        model.getValueAt(i, 1).toString(),
                        model.getValueAt(i, 3).toString()
                );

                o1.getOrderDetails().add(detail);

                if (new OrdersFormController().uploadData(o1)) {
                    JOptionPane.showMessageDialog(this, "Data Saved Successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Somthing went wrong!");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void loadDate() {
       txtdate.setText(getDateTime2());
    }

   
}