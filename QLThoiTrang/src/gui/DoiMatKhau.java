/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author ThanhDinh
 */
public class DoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form DoiMatKhau
     */
    public DoiMatKhau() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_matKhauCu = new javax.swing.JLabel();
        lb_matKhauMoi = new javax.swing.JLabel();
        lb_xacNhanLaiMatKhau = new javax.swing.JLabel();
        txt_xacNhanLaiMatKhau = new javax.swing.JTextField();
        txt_matKhauCu = new javax.swing.JTextField();
        txt_matKhauMoi = new javax.swing.JTextField();
        btn_huyBo = new javax.swing.JButton();
        btn_dongY = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_doiMatKhau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi Mật Khẩu");
        setResizable(false);

        lb_matKhauCu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_matKhauCu.setIcon(new javax.swing.ImageIcon("D:\\Nhom18_PTUD_DoAn\\QLThoiTrang\\icon\\khoa.png")); // NOI18N
        lb_matKhauCu.setText("Mật Khẩu Cũ :");

        lb_matKhauMoi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_matKhauMoi.setIcon(new javax.swing.ImageIcon("D:\\Nhom18_PTUD_DoAn\\QLThoiTrang\\icon\\khoa1.png")); // NOI18N
        lb_matKhauMoi.setText("Mật Khẩu Mới :");

        lb_xacNhanLaiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_xacNhanLaiMatKhau.setIcon(new javax.swing.ImageIcon("D:\\Nhom18_PTUD_DoAn\\QLThoiTrang\\icon\\khoa1.png")); // NOI18N
        lb_xacNhanLaiMatKhau.setText("Xác Nhận Lại Mật Khẩu :");

        btn_huyBo.setBackground(new java.awt.Color(255, 204, 204));
        btn_huyBo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_huyBo.setForeground(new java.awt.Color(153, 0, 255));
        btn_huyBo.setIcon(new javax.swing.ImageIcon("D:\\Nhom18_PTUD_DoAn\\QLThoiTrang\\icon\\No.png" )); // NOI18N
        btn_huyBo.setText("Hủy Bỏ");

        btn_dongY.setBackground(new java.awt.Color(153, 255, 153));
        btn_dongY.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_dongY.setForeground(new java.awt.Color(102, 0, 102));
        btn_dongY.setIcon(new javax.swing.ImageIcon("D:\\Nhom18_PTUD_DoAn\\QLThoiTrang\\icon\\Yes.png")); // NOI18N
        btn_dongY.setText("Đồng Ý");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_doiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        lb_doiMatKhau.setForeground(new java.awt.Color(255, 51, 51));
        lb_doiMatKhau.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(lb_doiMatKhau)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_doiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_matKhauMoi)
                    .addComponent(txt_matKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_matKhauCu)
                    .addComponent(txt_matKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_xacNhanLaiMatKhau)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_dongY)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_huyBo))
                        .addComponent(txt_xacNhanLaiMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lb_matKhauCu)
                .addGap(2, 2, 2)
                .addComponent(txt_matKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_matKhauMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_matKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_xacNhanLaiMatKhau)
                .addGap(8, 8, 8)
                .addComponent(txt_xacNhanLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dongY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_huyBo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dongY;
    private javax.swing.JButton btn_huyBo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_doiMatKhau;
    private javax.swing.JLabel lb_matKhauCu;
    private javax.swing.JLabel lb_matKhauMoi;
    private javax.swing.JLabel lb_xacNhanLaiMatKhau;
    private javax.swing.JTextField txt_matKhauCu;
    private javax.swing.JTextField txt_matKhauMoi;
    private javax.swing.JTextField txt_xacNhanLaiMatKhau;
    // End of variables declaration//GEN-END:variables
}
