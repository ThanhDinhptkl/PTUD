/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import form.Home;
import form.QuanLyKhachHang;
import form.QuanLyKhuyenMai;
import form.QuanLyNhaCungCap;
import form.QuanLyQuanAo;
import form.TimKiemKhachHang;
import form.TimKiemQuanAo;
import form.TimNhaCungCap;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import menu.MenuItem;

/**
 *
 * @author ThanhDinh
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        execute();
    }

    private void execute() {
        ImageIcon iconNhanVien = new ImageIcon(getClass().getResource("/icon/staff.png"));
        ImageIcon iconQuanAo = new ImageIcon(getClass().getResource("/icon/clothes.png"));
        ImageIcon iconManagement = new ImageIcon(getClass().getResource("/icon/management.png"));
        ImageIcon iconEmployee = new ImageIcon(getClass().getResource("/icon/employee.png"));
        ImageIcon iconSearch = new ImageIcon(getClass().getResource("/icon/search.png"));
        ImageIcon iconAvatar = new ImageIcon(getClass().getResource("/icon/avatar.png"));
        ImageIcon iconShirt = new ImageIcon(getClass().getResource("/icon/shirt.png"));
        ImageIcon iconKho = new ImageIcon(getClass().getResource("/icon/kho.png"));
        ImageIcon iconCargo = new ImageIcon(getClass().getResource("/icon/cargo.png"));
        ImageIcon iconDescription = new ImageIcon(getClass().getResource("/icon/description.png"));
        ImageIcon iconBill = new ImageIcon(getClass().getResource("/icon/bill.png"));
        ImageIcon iconPrinter = new ImageIcon(getClass().getResource("/icon/printer.png"));
        ImageIcon iconPromotion = new ImageIcon(getClass().getResource("/icon/promotion.png"));
        ImageIcon iconProfile = new ImageIcon(getClass().getResource("/icon/profile.png"));
        ImageIcon iconSee = new ImageIcon(getClass().getResource("/icon/see.png"));
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/icon/home.png"));

        // Create subMenu
        MenuItem mniQuanLyTaiKhoan = new MenuItem(iconManagement, "Quản Lý Tài Khoản", null);
        MenuItem mniQuanLyNhanVien = new MenuItem(iconEmployee, "Quản Lý Nhân Viên", null);
        MenuItem mniTimKiemNhanVien = new MenuItem(iconSee, "Tìm Kiếm Nhân Viên", null);
        MenuItem mniDatHang = new MenuItem(iconCargo, "Đặt Hàng", null);
        MenuItem mniThongke = new MenuItem(iconDescription, "Thống Kê", null);
        MenuItem mniLapHoaDon = new MenuItem(iconBill, "Lập Hóa Đơn", null);
        MenuItem mniXuatHoaDon = new MenuItem(iconPrinter, "Xuất Hóa Đơn", null);

        MenuItem mniQuanLyKhachHang = new MenuItem(iconEmployee, "Quản Lý Khách Hàng", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new QuanLyKhachHang());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem mniTimKiemKhachHang = new MenuItem(iconSearch, "Tìm Kiếm Khách Hàng", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new TimKiemKhachHang());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });

        MenuItem mniQuanLyQuanAo = new MenuItem(iconShirt, "Quản Lý Quần Áo", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new QuanLyQuanAo());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });

        MenuItem mniTimKiemQuanAo = new MenuItem(iconSee, "Tìm Kiếm Quần Áo", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new TimKiemQuanAo());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem mniQuanLyKho = new MenuItem(iconKho, "Quản Lý Kho", null);
        MenuItem mniQuanLyKhuyenMai = new MenuItem(iconPromotion, "Quản Lý Khuyến Mãi", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new QuanLyKhuyenMai());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });

        MenuItem mniQuanLyNhaCungCap = new MenuItem(iconEmployee, "Quản Lý Nhà Cung Cấp", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new QuanLyNhaCungCap());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem mniTimKiemNhaCungCap = new MenuItem(iconSearch, "Tìm Kiếm Nhà Cung Cấp", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new TimNhaCungCap());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem mniHome = new MenuItem(iconHome, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBody.removeAll();
                pnlBody.add(new Home());
                pnlBody.repaint();
                pnlBody.revalidate();
            }
        });
        MenuItem mniNhanVien = new MenuItem(iconNhanVien, "Nhân Viên", null, mniQuanLyTaiKhoan, mniQuanLyTaiKhoan, mniQuanLyNhanVien, mniTimKiemNhanVien, mniDatHang, mniThongke, mniLapHoaDon, mniXuatHoaDon);
        MenuItem mniKhachHang = new MenuItem(iconProfile, "Khách Hàng", null, mniQuanLyKhachHang, mniQuanLyKhachHang, mniTimKiemKhachHang);
        MenuItem mniQuanAo = new MenuItem(iconQuanAo, "Quần Áo", null, mniQuanLyQuanAo, mniQuanLyQuanAo, mniTimKiemQuanAo, mniQuanLyKho, mniQuanLyKhuyenMai);
        MenuItem mniNhaCungCap = new MenuItem(iconAvatar, "Nhà Cung Cấp", null, mniQuanLyNhaCungCap, mniQuanLyNhaCungCap, mniTimKiemNhaCungCap);
        addMenu(mniHome, mniNhanVien, mniKhachHang, mniQuanAo, mniNhaCungCap);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pnlMenus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pnlMenus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeadel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlMenus = new javax.swing.JPanel();
        pnlBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHeadel.setBackground(new java.awt.Color(20, 71, 38));
        pnlHeadel.setPreferredSize(new java.awt.Dimension(909, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("QUẢN LÝ BÁN HÀNG TẠI CỬA HÀNG QUẦN ÁO THỜI TRANG");

        javax.swing.GroupLayout pnlHeadelLayout = new javax.swing.GroupLayout(pnlHeadel);
        pnlHeadel.setLayout(pnlHeadelLayout);
        pnlHeadelLayout.setHorizontalGroup(
            pnlHeadelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadelLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        pnlHeadelLayout.setVerticalGroup(
            pnlHeadelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlHeadel, java.awt.BorderLayout.PAGE_START);

        pnlMenu.setBackground(new java.awt.Color(20, 71, 38));
        pnlMenu.setPreferredSize(new java.awt.Dimension(200, 400));

        jScrollPane1.setBorder(null);

        pnlMenus.setLayout(new javax.swing.BoxLayout(pnlMenus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnlMenus);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMenu, java.awt.BorderLayout.LINE_START);

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));
        pnlBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlBody, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 923, 623);
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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeadel;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenus;
    // End of variables declaration//GEN-END:variables
}
