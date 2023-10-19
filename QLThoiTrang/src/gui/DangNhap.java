package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import bus.Bus_TaiKhoan;
import entity.TaiKhoan;

public class DangNhap extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private Bus_TaiKhoan bus_tk = new Bus_TaiKhoan();
    public DangNhap() {
    	setResizable(false);

        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_avata = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_dNHT = new javax.swing.JLabel();
        lb_taiKhoan = new javax.swing.JLabel();
        lb_matKhau = new javax.swing.JLabel();
        txt_taiKhoan = new javax.swing.JTextField();
        txt_matKhau = new JPasswordField();
        jButton1 = new javax.swing.JButton();
        btn_doiMatKhau = new javax.swing.JButton();
        btn_dangNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_avata.setBackground(new java.awt.Color(255, 255, 255));
        lb_avata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_avata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hinh.png"))); // NOI18N
        lb_avata.setMaximumSize(new java.awt.Dimension(736, 736));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_avata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_avata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(251, 249, 237));

        lb_dNHT.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lb_dNHT.setForeground(new java.awt.Color(255, 51, 51));
        lb_dNHT.setText("ĐĂNG NHẬP HỆ THỐNG");

        lb_taiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_taiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account.png"))); // NOI18N
        lb_taiKhoan.setText("Tài khoản:");

        lb_matKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_matKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        lb_matKhau.setText("Mật khẩu:");

        txt_taiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_taiKhoanActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye.png"))); // NOI18N
        jButton1.setBorder(null);

        btn_doiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btn_doiMatKhau.setForeground(new java.awt.Color(51, 102, 0));
        btn_doiMatKhau.setText("Đổi Mật Khẩu ?");
        btn_doiMatKhau.setBorderPainted(false);
        btn_doiMatKhau.setContentAreaFilled(false);
        btn_doiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doiMatKhauActionPerformed(evt);
            }
        });

        btn_dangNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_dangNhap.setForeground(new java.awt.Color(204, 51, 255));
        btn_dangNhap.setIcon(new javax.swing.ImageIcon("D:\\icon\\key.png")); // NOI18N
        btn_dangNhap.setText("Đăng Nhập");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_dangNhap)
                    .addComponent(btn_doiMatKhau)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_dNHT)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lb_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lb_matKhau)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_dNHT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_taiKhoan)
                    .addComponent(txt_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_matKhau)
                        .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btn_doiMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dangNhap)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_dangNhap.addActionListener(this);
		btn_doiMatKhau.addActionListener(this);
		txt_taiKhoan.setText("21026511");
		txt_matKhau.setText("01012003");

		pack();
		setVisible(true);
		
    }
    private boolean checkLogin() {
		ArrayList<TaiKhoan> dsTK = bus_tk.getAllTaiKhoan();
		String maDN = txt_taiKhoan.getText().trim();
		String matKhau = new String(txt_matKhau.getPassword());
		StringBuilder sb = new StringBuilder();

		if(maDN.equals("")) {
			sb.append("Tai Khoan Rong \n");
		}
		if(matKhau.equals("")) {
			sb.append("Mat Khau Rong \n");
		}
		if(sb.length()>0) {
			JOptionPane.showMessageDialog(this, sb.toString(), "Canh Bao", JOptionPane.ERROR_MESSAGE);
		}

		for(TaiKhoan tk :dsTK) {
			if(maDN.equals(tk.getMaDangNhap())) {
				if(matKhau.equals(tk.getMatKhau())) {
					setVisible(false);
					TrangChu trangChu = new TrangChu(tk);

					if(tk.getPhanQuyen().equalsIgnoreCase("NhanVienQuanLy")) {
						trangChu.setVisible(true);
						trangChu.menu_quanLyKhuyenMai.setVisible(false);
						
						return true;
					}else {
						trangChu.setVisible(true);
						return true;
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Nhập sai mật khẩu", "Nhập lại", JOptionPane.ERROR_MESSAGE);
					txt_matKhau.requestFocus();
					return false;
				}
			}
		}
		JOptionPane.showMessageDialog(this, "Nhập sai thông tin", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
		txt_taiKhoan.requestFocus();
		return false;
	}// </editor-fold>//GEN-END:initComponents

    private void txt_taiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_taiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_taiKhoanActionPerformed

    private void btn_doiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_doiMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dangNhap;
    private javax.swing.JButton btn_doiMatKhau;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_avata;
    private javax.swing.JLabel lb_dNHT;
    private javax.swing.JLabel lb_matKhau;
    private javax.swing.JLabel lb_taiKhoan;
    private JPasswordField txt_matKhau;
    private javax.swing.JTextField txt_taiKhoan;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btn_dangNhap)) {
			checkLogin();
		}
		//		if (o.equals(btnReset)) {
		//			txtUserName.setText("");
		//			txtPassword.setText("");
		//			txtUserName.requestFocus();
		//		}
		
	}
}
