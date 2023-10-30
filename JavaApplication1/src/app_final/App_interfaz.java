/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_final;

/**
 *
 * @author AP-SE105-01
 */
public class App_interfaz extends javax.swing.JFrame {

    /**
     * Creates new form App_interfaz
     */
    public App_interfaz() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        frm_workers = new javax.swing.JPanel();
        frm_head_worker = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_code = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        lbl_job = new javax.swing.JLabel();
        lbl_sex = new javax.swing.JLabel();
        lbl_contact = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        cbx_sex = new javax.swing.JComboBox<>();
        lbl_address = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        cbx_job = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_consult = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        frm_foot_worker = new javax.swing.JPanel();
        frm_plots = new javax.swing.JPanel();
        frm_head_plots = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_code_plots = new javax.swing.JLabel();
        txt_name_plots = new javax.swing.JTextField();
        txt_code_plots = new javax.swing.JTextField();
        lbl_area_plots = new javax.swing.JLabel();
        txt_area_plots = new javax.swing.JTextField();
        lbl_address_plots = new javax.swing.JLabel();
        txt_address_plots = new javax.swing.JTextField();
        txt_crops_plots = new javax.swing.JTextField();
        lbl_crops_plots = new javax.swing.JLabel();
        btn_save_plots = new javax.swing.JButton();
        btn_update_plots = new javax.swing.JButton();
        btn_consult_plots = new javax.swing.JButton();
        btn_cancel_plots = new javax.swing.JButton();
        txt_woker_code = new javax.swing.JTextField();
        lbl_worker_code_plots = new javax.swing.JLabel();
        lbl_name_plots = new javax.swing.JLabel();
        frm_foot_plots = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 600));

        frm_head_worker.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Workers");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/workers.png"))); // NOI18N

        javax.swing.GroupLayout frm_head_workerLayout = new javax.swing.GroupLayout(frm_head_worker);
        frm_head_worker.setLayout(frm_head_workerLayout);
        frm_head_workerLayout.setHorizontalGroup(
            frm_head_workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_head_workerLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frm_head_workerLayout.setVerticalGroup(
            frm_head_workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_head_workerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frm_head_workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frm_head_workerLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        lbl_code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_code.setText("Code:");

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        lbl_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_name.setText("Name:");

        txt_code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_job.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_job.setText("Job:");

        lbl_sex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_sex.setText("Sex:");

        lbl_contact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_contact.setText("Contact:");

        txt_contact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbx_sex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbx_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female ", "Other" }));

        lbl_address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_address.setText("Address: ");

        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_email.setText("Email:");

        cbx_job.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbx_job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Laborer", "Secretary" }));
        cbx_job.setToolTipText("");

        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/save.png"))); // NOI18N
        btn_save.setText("Save");

        btn_update.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/update.png"))); // NOI18N
        btn_update.setText("Update");

        btn_consult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_consult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/consult.png"))); // NOI18N
        btn_consult.setText("Consult");

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/cancel.png"))); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setToolTipText("");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_name)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(lbl_code)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_name)
                                            .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_job)
                                            .addComponent(lbl_sex))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbx_sex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbx_job, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(lbl_contact)
                                    .addGap(3, 3, 3)
                                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_email)
                                .addComponent(lbl_address))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_address)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addGap(15, 15, 15)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_consult)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancel)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_code))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_job))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sex)
                    .addComponent(cbx_sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contact)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_update)
                    .addComponent(btn_consult)
                    .addComponent(btn_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frm_foot_worker.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout frm_foot_workerLayout = new javax.swing.GroupLayout(frm_foot_worker);
        frm_foot_worker.setLayout(frm_foot_workerLayout);
        frm_foot_workerLayout.setHorizontalGroup(
            frm_foot_workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frm_foot_workerLayout.setVerticalGroup(
            frm_foot_workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frm_workersLayout = new javax.swing.GroupLayout(frm_workers);
        frm_workers.setLayout(frm_workersLayout);
        frm_workersLayout.setHorizontalGroup(
            frm_workersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frm_head_worker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(frm_foot_worker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frm_workersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        frm_workersLayout.setVerticalGroup(
            frm_workersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_workersLayout.createSequentialGroup()
                .addComponent(frm_head_worker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frm_foot_worker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Workers", frm_workers);

        frm_head_plots.setBackground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/plots.png"))); // NOI18N
        jLabel9.setText("Plots");

        javax.swing.GroupLayout frm_head_plotsLayout = new javax.swing.GroupLayout(frm_head_plots);
        frm_head_plots.setLayout(frm_head_plotsLayout);
        frm_head_plotsLayout.setHorizontalGroup(
            frm_head_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_head_plotsLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel9)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        frm_head_plotsLayout.setVerticalGroup(
            frm_head_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_head_plotsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        lbl_code_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_code_plots.setText("Code:");

        txt_name_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_name_plots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_plotsActionPerformed(evt);
            }
        });

        txt_code_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_area_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_area_plots.setText("Area:");

        txt_area_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_address_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_address_plots.setText("Address: ");

        txt_address_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_crops_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_crops_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_crops_plots.setText("Crops:");

        btn_save_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_save_plots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/save.png"))); // NOI18N
        btn_save_plots.setText("Save");

        btn_update_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_update_plots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/update.png"))); // NOI18N
        btn_update_plots.setText("Update");

        btn_consult_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_consult_plots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/consult.png"))); // NOI18N
        btn_consult_plots.setText("Consult");

        btn_cancel_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancel_plots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_final/img/cancel.png"))); // NOI18N
        btn_cancel_plots.setText("Cancel");
        btn_cancel_plots.setToolTipText("");
        btn_cancel_plots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_plotsActionPerformed(evt);
            }
        });

        txt_woker_code.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_worker_code_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_worker_code_plots.setText("Worker code: ");

        lbl_name_plots.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_name_plots.setText("Name:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lbl_address_plots, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_address_plots, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_area_plots)
                                    .addComponent(lbl_code_plots)
                                    .addComponent(lbl_name_plots))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_area_plots, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_name_plots)
                                        .addComponent(txt_code_plots, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(lbl_crops_plots)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_crops_plots, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_worker_code_plots, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_woker_code, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_save_plots)
                .addGap(15, 15, 15)
                .addComponent(btn_update_plots)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_consult_plots)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancel_plots)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_code_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_code_plots))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_name_plots))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_area_plots)
                    .addComponent(txt_area_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_address_plots))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_crops_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_crops_plots))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_worker_code_plots)
                    .addComponent(txt_woker_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save_plots)
                    .addComponent(btn_update_plots)
                    .addComponent(btn_consult_plots)
                    .addComponent(btn_cancel_plots))
                .addContainerGap())
        );

        frm_foot_plots.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout frm_foot_plotsLayout = new javax.swing.GroupLayout(frm_foot_plots);
        frm_foot_plots.setLayout(frm_foot_plotsLayout);
        frm_foot_plotsLayout.setHorizontalGroup(
            frm_foot_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frm_foot_plotsLayout.setVerticalGroup(
            frm_foot_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frm_plotsLayout = new javax.swing.GroupLayout(frm_plots);
        frm_plots.setLayout(frm_plotsLayout);
        frm_plotsLayout.setHorizontalGroup(
            frm_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_plotsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(frm_plotsLayout.createSequentialGroup()
                .addGroup(frm_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frm_head_plots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frm_foot_plots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frm_plotsLayout.setVerticalGroup(
            frm_plotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frm_plotsLayout.createSequentialGroup()
                .addComponent(frm_head_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frm_foot_plots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Plots", frm_plots);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Workers");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_name_plotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_plotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name_plotsActionPerformed

    private void btn_cancel_plotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_plotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancel_plotsActionPerformed

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
            java.util.logging.Logger.getLogger(App_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cancel_plots;
    private javax.swing.JButton btn_consult;
    private javax.swing.JButton btn_consult_plots;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save_plots;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update_plots;
    private javax.swing.JComboBox<String> cbx_job;
    private javax.swing.JComboBox<String> cbx_sex;
    private javax.swing.JPanel frm_foot_plots;
    private javax.swing.JPanel frm_foot_worker;
    private javax.swing.JPanel frm_head_plots;
    private javax.swing.JPanel frm_head_worker;
    private javax.swing.JPanel frm_plots;
    private javax.swing.JPanel frm_workers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_address_plots;
    private javax.swing.JLabel lbl_area_plots;
    private javax.swing.JLabel lbl_code;
    private javax.swing.JLabel lbl_code_plots;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_crops_plots;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_job;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name_plots;
    private javax.swing.JLabel lbl_sex;
    private javax.swing.JLabel lbl_worker_code_plots;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_address_plots;
    private javax.swing.JTextField txt_area_plots;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_code_plots;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_crops_plots;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_name_plots;
    private javax.swing.JTextField txt_woker_code;
    // End of variables declaration//GEN-END:variables
}
