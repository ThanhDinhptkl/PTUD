/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlthoitrang;

/**
 *
 * @author Acer
 */
public class DatHang extends javax.swing.JFrame {

    /**
     * Creates new form DatHang
     */
    public DatHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        scr_DSPDH = new javax.swing.JScrollPane();
        tbl_danhSachHoaDon = new javax.swing.JTable();
        lbl_danhSachDH = new javax.swing.JLabel();
        scr_DSSP = new javax.swing.JScrollPane();
        tbl_danhSachSanPham = new javax.swing.JTable();
        scr_gioHang = new javax.swing.JScrollPane();
        tbl_gioHang = new javax.swing.JTable();
        lbl_gioHang = new javax.swing.JLabel();
        lbl_danhSachSanPham = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_maPD = new javax.swing.JTextField();
        txt_maKH = new javax.swing.JTextField();
        lbl_maPD = new javax.swing.JLabel();
        lbl_maKH = new javax.swing.JLabel();
        lbl_taoPhieuDH = new javax.swing.JLabel();
        btn_taoHD = new javax.swing.JButton();
        btn_xuatPhieuDat = new javax.swing.JButton();
        btn_taoPhieuDat = new javax.swing.JButton();
        btn_random = new javax.swing.JButton();
        lbl_maSP = new javax.swing.JLabel();
        txt_maSP = new javax.swing.JTextField();
        lbl_maNV = new javax.swing.JLabel();
        lbl_soLuong = new javax.swing.JLabel();
        lbl_ngayDat = new javax.swing.JLabel();
        txt_maNV = new javax.swing.JTextField();
        txt_soLuong = new javax.swing.JTextField();
        txt_ngayDat = new javax.swing.JTextField();
        btn_date = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_DatHang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_danhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu Đặt", "Mã Khách Hàng", "Mã Sản Phẩm", "Mã Nhân Viên", "Số Lượng", "Ngày Đặt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scr_DSPDH.setViewportView(tbl_danhSachHoaDon);

        lbl_danhSachDH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_danhSachDH.setForeground(new java.awt.Color(0, 102, 255));
        lbl_danhSachDH.setText("Danh Sách Phiếu Đặt Hàng");

        tbl_danhSachSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Màu Sắc", "Số Lượng", "Loại", "Thương HIệu", "Kích Thước", "Chất Liệu", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scr_DSSP.setViewportView(tbl_danhSachSanPham);

        tbl_gioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá ", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scr_gioHang.setViewportView(tbl_gioHang);

        lbl_gioHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_gioHang.setForeground(new java.awt.Color(0, 102, 255));
        lbl_gioHang.setText("Giỏ Hàng");

        lbl_danhSachSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_danhSachSanPham.setForeground(new java.awt.Color(0, 102, 255));
        lbl_danhSachSanPham.setText("Danh Sách Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scr_DSSP))
                    .addComponent(scr_gioHang)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_gioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_danhSachSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_danhSachDH, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scr_DSPDH, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_danhSachDH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_DSPDH, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_gioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scr_gioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_danhSachSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scr_DSSP, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_maPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maPDActionPerformed(evt);
            }
        });

        txt_maKH.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_maKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maKHActionPerformed(evt);
            }
        });

        lbl_maPD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_maPD.setText("Mã Phiếu Đặt");

        lbl_maKH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_maKH.setText("Mã Khách Hàng:");

        lbl_taoPhieuDH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_taoPhieuDH.setForeground(new java.awt.Color(255, 0, 51));
        lbl_taoPhieuDH.setText("Tạo Phiếu Đặt Hàng");

        btn_taoHD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_taoHD.setIcon(new javax.swing.ImageIcon("D:\\DOANPTUD\\QLThoiTrang\\icon\\pay.png")); // NOI18N
        btn_taoHD.setText("Tạo Hóa Đơn");

        btn_xuatPhieuDat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_xuatPhieuDat.setIcon(new javax.swing.ImageIcon("D:\\DOANPTUD\\QLThoiTrang\\icon\\print.png")); // NOI18N
        btn_xuatPhieuDat.setText("Xuất Phiếu Đặt Hàng");

        btn_taoPhieuDat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_taoPhieuDat.setIcon(new javax.swing.ImageIcon("D:\\DOANPTUD\\QLThoiTrang\\icon\\add.png")); // NOI18N
        btn_taoPhieuDat.setText("Tạo Phiếu Đặt Hàng");
        btn_taoPhieuDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoPhieuDatActionPerformed(evt);
            }
        });

        btn_random.setIcon(new javax.swing.ImageIcon("D:\\DOANPTUD\\QLThoiTrang\\icon\\Random.png")); // NOI18N
        btn_random.setText("Random");
        btn_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_randomActionPerformed(evt);
            }
        });

        lbl_maSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_maSP.setText("Mã Sản Phẩm:");

        txt_maSP.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_maSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maSPActionPerformed(evt);
            }
        });

        lbl_maNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_maNV.setText("Mã Nhân Viên:");

        lbl_soLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_soLuong.setText("Số Lượng:");

        lbl_ngayDat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_ngayDat.setText("Ngày Đặt:");

        txt_maNV.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_maNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maNVActionPerformed(evt);
            }
        });

        txt_soLuong.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_soLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soLuongActionPerformed(evt);
            }
        });

        txt_ngayDat.setMinimumSize(new java.awt.Dimension(64, 25));
        txt_ngayDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ngayDatActionPerformed(evt);
            }
        });

        btn_date.setIcon(new javax.swing.ImageIcon("D:\\DOANPTUD\\QLThoiTrang\\icon\\date.png")); // NOI18N
        btn_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_maPD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_maPD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_taoPhieuDH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_random, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ngayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_ngayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_date))
                            .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_taoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xuatPhieuDat, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_taoPhieuDat, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_taoPhieuDH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_maPD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_random))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ngayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_ngayDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(btn_taoPhieuDat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_xuatPhieuDat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_taoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_DatHang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_DatHang.setText("ĐẶT HÀNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(582, 582, 582)
                .addComponent(lbl_DatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_DatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maPDActionPerformed

    private void txt_maKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maKHActionPerformed

    private void btn_taoPhieuDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoPhieuDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_taoPhieuDatActionPerformed

    private void btn_randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_randomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_randomActionPerformed

    private void txt_maSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maSPActionPerformed

    private void txt_maNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maNVActionPerformed

    private void txt_soLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_soLuongActionPerformed

    private void txt_ngayDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ngayDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ngayDatActionPerformed

    private void btn_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dateActionPerformed

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
            java.util.logging.Logger.getLogger(DatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_date;
    private javax.swing.JButton btn_random;
    private javax.swing.JButton btn_taoHD;
    private javax.swing.JButton btn_taoPhieuDat;
    private javax.swing.JButton btn_xuatPhieuDat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_DatHang;
    private javax.swing.JLabel lbl_danhSachDH;
    private javax.swing.JLabel lbl_danhSachSanPham;
    private javax.swing.JLabel lbl_gioHang;
    private javax.swing.JLabel lbl_maKH;
    private javax.swing.JLabel lbl_maNV;
    private javax.swing.JLabel lbl_maPD;
    private javax.swing.JLabel lbl_maSP;
    private javax.swing.JLabel lbl_ngayDat;
    private javax.swing.JLabel lbl_soLuong;
    private javax.swing.JLabel lbl_taoPhieuDH;
    private javax.swing.JScrollPane scr_DSPDH;
    private javax.swing.JScrollPane scr_DSSP;
    private javax.swing.JScrollPane scr_gioHang;
    private javax.swing.JTable tbl_danhSachHoaDon;
    private javax.swing.JTable tbl_danhSachSanPham;
    private javax.swing.JTable tbl_gioHang;
    private javax.swing.JTextField txt_maKH;
    private javax.swing.JTextField txt_maNV;
    private javax.swing.JTextField txt_maPD;
    private javax.swing.JTextField txt_maSP;
    private javax.swing.JTextField txt_ngayDat;
    private javax.swing.JTextField txt_soLuong;
    // End of variables declaration//GEN-END:variables
}
