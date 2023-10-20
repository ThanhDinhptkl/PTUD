package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bus.Bus_NhanVien;
import entity.NhanVien;

public class QuanLyNhanVien extends JFrame implements ActionListener {
	private JButton btn_date;
    private JButton btn_luu;
    private JButton btn_random;
    private JButton btn_sua;
    private JButton btn_them;
    private JButton btn_xoa;
    private JComboBox<String> cmb_gioiTinh;
    private JLabel lbl_QLNV;
    private JLabel lbl_danhSachNhanVien;
    private JLabel lbl_diaChi;
    private JLabel lbl_email;
    private JLabel lbl_gioiTinh;
    private JLabel lbl_maNV;
    private JLabel lbl_ngaySinh;
    private JLabel lbl_qLNV;
    private JLabel lbl_sDT;
    private JLabel lbl_tenNV;
    private JPanel pn_Left;
    private JPanel pn_Right;
    private JPanel pn_Top;
    private JScrollPane scr_DSNV;
    private JTable tbl_danhSachNV;
    private JTextField txt_diaChi;
    private JTextField txt_email;
    private JTextField txt_maNhanVien;
    private JTextField txt_ngaySinh;
    private JTextField txt_sDT;
    private JTextField txt_tenNhanVien;
    private DefaultTableModel model;
    
    private Bus_NhanVien nhanVien_bus = new Bus_NhanVien();
    public QuanLyNhanVien() {
        initComponents();
    }

    private void initComponents() {

        pn_Top = new JPanel();
        lbl_QLNV = new JLabel();
        pn_Left = new JPanel();
        scr_DSNV = new JScrollPane();
        tbl_danhSachNV = new JTable();
        lbl_danhSachNhanVien = new JLabel();
        pn_Right = new JPanel();
        txt_maNhanVien = new JTextField();
        txt_tenNhanVien = new JTextField();
        txt_sDT = new JTextField();
        txt_diaChi = new JTextField();
        txt_email = new JTextField();
        txt_ngaySinh = new JTextField();
        lbl_ngaySinh = new JLabel();
        lbl_sDT = new JLabel();
        lbl_tenNV = new JLabel();
        lbl_diaChi = new JLabel();
        lbl_gioiTinh = new JLabel();
        lbl_maNV = new JLabel();
        lbl_qLNV = new JLabel();
        lbl_email = new JLabel();
        btn_random = new JButton();
        cmb_gioiTinh = new JComboBox<>();
        btn_date = new JButton();
        btn_them = new JButton();
        btn_sua = new JButton();
        btn_xoa = new JButton();
        btn_luu = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pn_Top.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_QLNV.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_QLNV.setText("QUẢN LÝ NHÂN VIÊN");

        GroupLayout pn_TopLayout = new GroupLayout(pn_Top);
        pn_Top.setLayout(pn_TopLayout);
        pn_TopLayout.setHorizontalGroup(
            pn_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pn_TopLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_QLNV, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
                .addGap(518, 518, 518))
        );
        pn_TopLayout.setVerticalGroup(
            pn_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn_TopLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_QLNV, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE)) 
        );

        pn_Left.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        model = new DefaultTableModel();
        tbl_danhSachNV = new JTable(model);
        tbl_danhSachNV.setRowHeight(25);     
    	model.addColumn("Mã Nhân Viên");
    	model.addColumn("Tên Nhân Viên");
    	model.addColumn("Số Điện Thoại");
    	model.addColumn("Địa Chỉ");
    	model.addColumn("Giới Tính");
    	model.addColumn("Email");
    	model.addColumn("Ngày Sinh");
    	JScrollPane sp = new JScrollPane(tbl_danhSachNV, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setPreferredSize(new Dimension(1000, 400));
		pn_Left.add(sp);
            
        scr_DSNV.setViewportView(tbl_danhSachNV);

        lbl_danhSachNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_danhSachNhanVien.setForeground(new java.awt.Color(0, 102, 255));
        lbl_danhSachNhanVien.setText("Danh Sách Nhân Viên");

        GroupLayout pn_LeftLayout = new GroupLayout(pn_Left);
        pn_Left.setLayout(pn_LeftLayout);
        pn_LeftLayout.setHorizontalGroup(
            pn_LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_danhSachNhanVien, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(711, Short.MAX_VALUE))
            .addGroup(pn_LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, pn_LeftLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scr_DSNV, GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)))
        );
        pn_LeftLayout.setVerticalGroup(
            pn_LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn_LeftLayout.createSequentialGroup()
                .addComponent(lbl_danhSachNhanVien, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, pn_LeftLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(scr_DSNV, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        pn_Right.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_maNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maNhanVienActionPerformed(evt);
            }
        });

        txt_tenNhanVien.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_tenNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenNhanVienActionPerformed(evt);
            }
        });

        txt_sDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sDTActionPerformed(evt);
            }
        });

        txt_diaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diaChiActionPerformed(evt);
            }
        });

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_ngaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ngaySinhActionPerformed(evt);
            }
        });

        lbl_ngaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ngaySinh.setText("Ngày Sinh:");

        lbl_sDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_sDT.setText("Số Điện Thoại:");

        lbl_tenNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_tenNV.setText("Tên Nhân Viên:");

        lbl_diaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_diaChi.setText("Địa Chỉ:");

        lbl_gioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_gioiTinh.setText("Giới Tính:");

        lbl_maNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_maNV.setText("Mã Nhân Viên:");

        lbl_qLNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_qLNV.setForeground(new java.awt.Color(255, 0, 51));
        lbl_qLNV.setText("Quản Lý Nhân Viên");

        lbl_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_email.setText("Email:");

        btn_random.setIcon(new ImageIcon(getClass().getResource("/icon/Random.png"))); // NOI18N
        btn_random.setText("Random");
        btn_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_randomActionPerformed(evt);
            }
        });

        cmb_gioiTinh.setModel(new DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        btn_date.setIcon(new ImageIcon(getClass().getResource("/icon/date.png"))); // NOI18N
        btn_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dateActionPerformed(evt);
            }
        });

        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_them.setIcon(new ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btn_them.setText("Thêm");

        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_sua.setIcon(new ImageIcon(getClass().getResource("/icon/fix.png"))); // NOI18N
        btn_sua.setText("Sửa");

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_xoa.setIcon(new ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_luu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_luu.setIcon(new ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btn_luu.setText("Lưu");

        GroupLayout pn_RightLayout = new GroupLayout(pn_Right);
        pn_Right.setLayout(pn_RightLayout);
        pn_RightLayout.setHorizontalGroup(
            pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn_RightLayout.createSequentialGroup()
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pn_RightLayout.createSequentialGroup()
                        .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_RightLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(GroupLayout.Alignment.TRAILING, pn_RightLayout.createSequentialGroup()
                                        .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(pn_RightLayout.createSequentialGroup()
                                                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_sDT, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_tenNV, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_maNV, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txt_maNhanVien)
                                                    .addComponent(txt_tenNhanVien, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txt_sDT, GroupLayout.Alignment.LEADING)))
                                            .addGroup(GroupLayout.Alignment.LEADING, pn_RightLayout.createSequentialGroup()
                                                .addComponent(lbl_diaChi, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_diaChi)
                                                    .addGroup(pn_RightLayout.createSequentialGroup()
                                                        .addComponent(cmb_gioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_random, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn_RightLayout.createSequentialGroup()
                                        .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_gioiTinh, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_qLNV, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pn_RightLayout.createSequentialGroup()
                                                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_email, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_ngaySinh, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                .addGap(46, 46, 46)
                                                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_email, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                    .addComponent(txt_ngaySinh))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_date)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(pn_RightLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_sua, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btn_xoa, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn_luu, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_them, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pn_RightLayout.setVerticalGroup(
            pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pn_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_qLNV, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maNV, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_random))
                .addGap(18, 18, 18)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tenNV, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sDT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_diaChi, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gioiTinh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_gioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btn_date, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ngaySinh, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_ngaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(btn_them, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(pn_RightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btn_luu, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pn_Top, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pn_Left, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_Right, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_Top, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pn_Left, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_Right, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        napDuLieuTuCSDL(nhanVien_bus.getAllNhanVien());
        
        btn_them.addActionListener(this);
		btn_xoa.addActionListener(this);
		btn_sua.addActionListener(this);
		btn_date.addActionListener(this);
		
    }
//    public void taoBang() {
//    	JPanel pnTable = new JPanel();
//    	DefaultTableModel model;
//    	JTable table;
//    	model = new DefaultTableModel();
//    	table = new JTable(model);
//    	table.setRowHeight(25);     
//    	model.addColumn("Mã Nhân Viên");
//    	model.addColumn("Tên Nhân Viên");
//    	model.addColumn("Số Điện Thoại");
//    	model.addColumn("Địa Chỉ");
//    	model.addColumn("Giới Tính");
//    	model.addColumn("Email");
//    	model.addColumn("Ngày Sinh");
//    	JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
//				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		sp.setPreferredSize(new Dimension(1000, 400));
//		pn_Left.add(sp);
//    	
//    }
    
    // </editor-fold>//GEN-END:initComponents

    private void txt_maNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maNhanVienActionPerformed

    private void txt_tenNhanVienActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txt_tenNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenNhanVienActionPerformed

    private void txt_sDTActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txt_sDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sDTActionPerformed

    private void txt_diaChiActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txt_diaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diaChiActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_ngaySinhActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txt_ngaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ngaySinhActionPerformed

    private void btn_randomActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn_randomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_randomActionPerformed


	private void btn_dateActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btn_dateActionPerformed
        // TODO add your handling code here:
    }
    //GEN-LAST:event_btn_dateActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xoaActionPerformed

   

    public static void main(String args[]) {
        try {
            for (
LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }
    public void napDuLieuTuCSDL(ArrayList<NhanVien> ds) {
		DefaultTableModel dm = (DefaultTableModel) tbl_danhSachNV.getModel();
		dm.getDataVector().removeAllElements();
		for (NhanVien nv : ds) {
			model.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.getsDT(),nv.getDiaChi(), nv.isGioiTinh() ? "Nam" : "Nữ",
					nv.getEmail(), nv.getNgaySinh() });
		}
	}
    public NhanVien revertNhanVienFromFields() {
    	String maNV = txt_maNhanVien.getText().trim();
        String tenNV = txt_tenNhanVien.getText().trim();
        String ngaySinhStr = txt_ngaySinh.getText().trim(); // Lấy ngày sinh dưới dạng chuỗi
        String sDT = txt_sDT.getText().trim();
        String diaChi = txt_diaChi.getText().trim();
        String email = txt_email.getText().trim();

        Date ngaySinh = null;

        // Chuyển đổi chuỗi ngày sinh thành kiểu java.util.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Định dạng của ngày tháng
        try {
            ngaySinh = dateFormat.parse(ngaySinhStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Lấy giới tính từ ComboBox
        String gioiTinhStr = cmb_gioiTinh.getSelectedItem().toString();
        boolean gioiTinh = gioiTinhStr.equals("Nam"); // Sử dụng giá trị chọn trong ComboBox

        NhanVien nv = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sDT, diaChi, email);
        return nv;
	}
    

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if (o.equals(btn_them)) {
			
				NhanVien nv = revertNhanVienFromFields();
				if (!nhanVien_bus.themNV(nv)) {
					JOptionPane.showMessageDialog(this, "Trùng mã");
				} else {
					napDuLieuTuCSDL(nhanVien_bus.getAllNhanVien());

					tbl_danhSachNV.clearSelection();

				
			}
	
		}
		}
}
